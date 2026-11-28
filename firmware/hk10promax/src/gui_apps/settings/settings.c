#include "rtconfig.h"
#include <stdio.h>
#if defined(BSP_USING_PC_SIMULATOR)
#include <windows.h>
#else
#include <time.h>
#endif
#include "lvsf.h"
#include <lv_ext_resource_manager.h>
#include <rtthread.h>
#include <rtdevice.h>
#include "gui_app_fwk.h"
#include "littlevgl2rtt.h"
#include "custom_trans_anim.h"
#include "flashdb/fdb.h"

LV_IMG_DECLARE(img_settings);
#define APP_ID "Settings"
#define SETTINGS_BG 0x000000
#define SETTINGS_CARD 0x222326
#define SETTINGS_TEXT 0xF3F3F5
#define SETTINGS_MUTED 0x9A9BA0
#define SETTINGS_ACCENT 0x1688F8

enum
{
    SETTINGS_PAGE_HOME = 0,
    SETTINGS_PAGE_GENERAL,
    SETTINGS_PAGE_DISPLAY,
    SETTINGS_PAGE_TIME,
    SETTINGS_PAGE_STORAGE,
    SETTINGS_PAGE_ABOUT
};

static rt_device_t settings_lcd;
static lv_timer_t *settings_clock_timer;
static lv_obj_t *settings_content;
static lv_obj_t *settings_header_title;
static lv_obj_t *settings_back_button;
static int settings_current_page;
static int settings_24_hour = 1;

static void settings_show_page(int page);

static void settings_opa_anim(void *var, int32_t value)
{
    lv_obj_set_style_opa((lv_obj_t *)var, (lv_opa_t)value, 0);
}

static void settings_apply_brightness(int value, bool persist)
{
    if (value < 10) value = 10;
    if (value > 100) value = 100;
    if (settings_lcd)
        rt_device_control(settings_lcd, RTGRAPHIC_CTRL_SET_BRIGHTNESS, &value);
    if (persist)
        kv_set_int("lcd_brightness", value);
}

static void settings_clock_update(lv_timer_t *timer)
{
    if (!timer || !timer->user_data) return;
    char text[8];
    int hour = 0, minute = 0;
#if defined(BSP_USING_PC_SIMULATOR)
    SYSTEMTIME local;
    GetLocalTime(&local);
    hour = (int)local.wHour;
    minute = (int)local.wMinute;
#else
    time_t now = time(RT_NULL);
    struct tm *local = localtime(&now);
    if (!local) return;
    hour = local->tm_hour;
    minute = local->tm_min;
#endif
    if (!settings_24_hour)
    {
        hour %= 12;
        if (hour == 0) hour = 12;
    }
    snprintf(text, sizeof(text), "%02d:%02d", hour, minute);
    lv_label_set_text((lv_obj_t *)timer->user_data, text);
}

static void settings_animate_in(lv_obj_t *obj)
{
    lv_anim_t anim;
    lv_obj_set_style_opa(obj, LV_OPA_TRANSP, 0);
    lv_anim_init(&anim);
    lv_anim_set_var(&anim, obj);
    lv_anim_set_values(&anim, LV_OPA_TRANSP, LV_OPA_COVER);
    lv_anim_set_time(&anim, 150);
    lv_anim_set_path_cb(&anim, lv_anim_path_ease_out);
    lv_anim_set_exec_cb(&anim, settings_opa_anim);
    lv_anim_set_delay(&anim, 8);
    lv_anim_start(&anim);
}

static lv_obj_t *settings_card(lv_obj_t *parent, lv_coord_t height)
{
    lv_obj_t *card = lv_obj_create(parent);
    lv_obj_set_width(card, LV_PCT(100));
    lv_obj_set_height(card, height);
    lv_obj_set_style_bg_color(card, lv_color_hex(SETTINGS_CARD), 0);
    lv_obj_set_style_bg_opa(card, LV_OPA_COVER, 0);
    lv_obj_set_style_border_width(card, 0, 0);
    lv_obj_set_style_radius(card, 18, 0);
    lv_obj_set_style_pad_all(card, 12, 0);
    lv_obj_clear_flag(card, LV_OBJ_FLAG_SCROLLABLE);
    return card;
}

static void settings_label(lv_obj_t *parent, const char *text, lv_coord_t x, lv_coord_t y,
                           const lv_font_t *font, uint32_t color)
{
    lv_obj_t *label = lv_label_create(parent);
    lv_label_set_text(label, text);
    lv_obj_set_style_text_color(label, lv_color_hex(color), 0);
    lv_obj_set_style_text_font(label, font, 0);
    lv_obj_set_pos(label, x, y);
}

static void settings_switch_event(lv_event_t *e)
{
    lv_obj_t *sw = lv_event_get_target(e);
    settings_24_hour = lv_obj_has_state(sw, LV_STATE_CHECKED) ? 1 : 0;
    kv_set_int("time_format_24h", settings_24_hour);
    settings_clock_update(settings_clock_timer);
}

static void settings_brightness_event(lv_event_t *e)
{
    lv_obj_t *slider = lv_event_get_target(e);
    int value = lv_slider_get_value(slider);
    lv_obj_t *value_label = (lv_obj_t *)lv_event_get_user_data(e);
    char text[8];
    settings_apply_brightness(value, lv_event_get_code(e) == LV_EVENT_RELEASED);
    if (value_label)
    {
        snprintf(text, sizeof(text), "%d%%", value);
        lv_label_set_text(value_label, text);
    }
}

static void settings_open_page(lv_event_t *e)
{
    int page = (int)(rt_ubase_t)lv_event_get_user_data(e);
    settings_show_page(page);
}

static void settings_back_event(lv_event_t *e)
{
    (void)e;
    settings_show_page(SETTINGS_PAGE_HOME);
}

static void settings_add_menu_row(const char *title, const char *subtitle, int page, uint32_t accent)
{
    (void)subtitle;
    lv_obj_t *row = lv_btn_create(settings_content);
    lv_obj_set_width(row, LV_PCT(100));
    lv_obj_set_height(row, 64);
    lv_obj_set_style_bg_color(row, lv_color_hex(SETTINGS_CARD), LV_PART_MAIN);
    lv_obj_set_style_bg_opa(row, LV_OPA_COVER, LV_PART_MAIN);
    lv_obj_set_style_bg_color(row, lv_color_hex(0x303238), LV_PART_MAIN | LV_STATE_PRESSED);
    lv_obj_set_style_radius(row, 18, LV_PART_MAIN);
    lv_obj_set_style_border_width(row, 0, LV_PART_MAIN);
    lv_obj_set_style_shadow_width(row, 0, LV_PART_MAIN);
    lv_obj_set_style_pad_all(row, 0, LV_PART_MAIN);
    lv_obj_add_event_cb(row, settings_open_page, LV_EVENT_CLICKED, (void *)(rt_ubase_t)page);

    lv_obj_t *icon = lv_obj_create(row);
    lv_obj_set_size(icon, 34, 34);
    lv_obj_set_style_radius(icon, LV_RADIUS_CIRCLE, 0);
    lv_obj_set_style_bg_color(icon, lv_color_hex(accent), 0);
    lv_obj_set_style_bg_opa(icon, LV_OPA_COVER, 0);
    lv_obj_set_style_border_width(icon, 0, 0);
    lv_obj_align(icon, LV_ALIGN_LEFT_MID, 12, 0);
    lv_obj_clear_flag(icon, LV_OBJ_FLAG_SCROLLABLE);

    const char *symbol = "•";
    switch (page)
    {
    case SETTINGS_PAGE_GENERAL: symbol = "G"; break;
    case SETTINGS_PAGE_DISPLAY: symbol = "D"; break;
    case SETTINGS_PAGE_TIME: symbol = "T"; break;
    case SETTINGS_PAGE_STORAGE: symbol = "S"; break;
    case SETTINGS_PAGE_ABOUT: symbol = "i"; break;
    default: break;
    }
    lv_obj_t *glyph = lv_label_create(icon);
    lv_label_set_text(glyph, symbol);
    lv_obj_set_style_text_color(glyph, lv_color_hex(0xFFFFFF), 0);
    lv_obj_set_style_text_font(glyph, &lv_font_montserrat_16, 0);
    lv_obj_center(glyph);

    lv_obj_t *name = lv_label_create(row);
    lv_label_set_text(name, title);
    lv_obj_set_style_text_color(name, lv_color_hex(SETTINGS_TEXT), 0);
    lv_obj_set_style_text_font(name, &lv_font_montserrat_16, 0);
    lv_obj_align(name, LV_ALIGN_LEFT_MID, 58, 0);

    lv_obj_t *chevron = lv_label_create(row);
    lv_label_set_text(chevron, LV_SYMBOL_RIGHT);
    lv_obj_set_style_text_color(chevron, lv_color_hex(0x77787D), 0);
    lv_obj_set_style_text_font(chevron, &lv_font_montserrat_14, 0);
    lv_obj_align(chevron, LV_ALIGN_RIGHT_MID, -14, 0);

    settings_animate_in(row);
}

static void settings_add_section(const char *text)
{
    lv_obj_t *label = lv_label_create(settings_content);
    lv_label_set_text(label, text);
    lv_obj_set_style_text_color(label, lv_color_hex(SETTINGS_MUTED), 0);
    lv_obj_set_style_text_font(label, &lv_font_montserrat_12, 0);
    lv_obj_set_style_text_letter_space(label, 1, 0);
    lv_obj_set_width(label, LV_PCT(100));
}

static void settings_add_info(const char *title, const char *value, lv_coord_t height)
{
    (void)height;
    lv_obj_t *row = settings_card(settings_content, 58);
    settings_label(row, title, 0, 0, &lv_font_montserrat_14, SETTINGS_TEXT);

    lv_obj_t *detail = lv_label_create(row);
    lv_label_set_text(detail, value);
    lv_obj_set_style_text_color(detail, lv_color_hex(SETTINGS_MUTED), 0);
    lv_obj_set_style_text_font(detail, &lv_font_montserrat_14, 0);
    lv_obj_align(detail, LV_ALIGN_RIGHT_MID, 0, 0);
    settings_animate_in(row);
}

static void settings_show_page(int page)
{
    if (!settings_content) return;
    settings_current_page = page;
    lv_obj_clean(settings_content);

    if (settings_back_button)
    {
        if (page == SETTINGS_PAGE_HOME)
            lv_obj_add_flag(settings_back_button, LV_OBJ_FLAG_HIDDEN);
        else
            lv_obj_clear_flag(settings_back_button, LV_OBJ_FLAG_HIDDEN);
    }

    const char *title = "Settings";
    switch (page)
    {
    case SETTINGS_PAGE_GENERAL: title = "General"; break;
    case SETTINGS_PAGE_DISPLAY: title = "Display"; break;
    case SETTINGS_PAGE_TIME: title = "Time Format"; break;
    case SETTINGS_PAGE_STORAGE: title = "Storage"; break;
    case SETTINGS_PAGE_ABOUT: title = "About"; break;
    default: break;
    }
    lv_label_set_text(settings_header_title, title);
    lv_obj_align(settings_header_title, LV_ALIGN_LEFT_MID,
                  page == SETTINGS_PAGE_HOME ? 0 : 40, 0);

    if (page == SETTINGS_PAGE_HOME)
    {
        settings_add_menu_row("General", RT_NULL, SETTINGS_PAGE_GENERAL, 0x8E8E93);
        settings_add_menu_row("Display", RT_NULL, SETTINGS_PAGE_DISPLAY, 0xA45BE0);
        settings_add_menu_row("Time Format", RT_NULL, SETTINGS_PAGE_TIME, 0x1688F8);
        settings_add_menu_row("Storage", RT_NULL, SETTINGS_PAGE_STORAGE, 0x30C78A);
        settings_add_menu_row("About", RT_NULL, SETTINGS_PAGE_ABOUT, 0xF0A33A);
    }
    else if (page == SETTINGS_PAGE_GENERAL)
    {
        settings_add_info("Model", "HK 10 Pro Max+", 58);
        settings_add_info("Platform", "SiFli SF32LB525", 58);
        settings_add_menu_row("Time Format", RT_NULL, SETTINGS_PAGE_TIME, 0x1688F8);
    }
    else if (page == SETTINGS_PAGE_DISPLAY)
    {
        int brightness = kv_get_int("lcd_brightness", 100);
        if (brightness < 10 || brightness > 100) brightness = 100;
        lv_obj_t *card = settings_card(settings_content, 112);
        lv_obj_t *name = lv_label_create(card);
        lv_label_set_text(name, "Brightness");
        lv_obj_set_style_text_color(name, lv_color_hex(SETTINGS_TEXT), 0);
        lv_obj_set_style_text_font(name, &lv_font_montserrat_16, 0);
        lv_obj_align(name, LV_ALIGN_TOP_LEFT, 0, 0);

        lv_obj_t *value = lv_label_create(card);
        char text[8];
        snprintf(text, sizeof(text), "%d%%", brightness);
        lv_label_set_text(value, text);
        lv_obj_set_style_text_color(value, lv_color_hex(SETTINGS_MUTED), 0);
        lv_obj_set_style_text_font(value, &lv_font_montserrat_14, 0);
        lv_obj_align(value, LV_ALIGN_TOP_RIGHT, 0, 0);

        lv_obj_t *slider = lv_slider_create(card);
        lv_obj_set_width(slider, LV_PCT(100));
        lv_obj_align(slider, LV_ALIGN_BOTTOM_MID, 0, -3);
        lv_slider_set_range(slider, 10, 100);
        lv_slider_set_value(slider, brightness, LV_ANIM_OFF);
        lv_obj_set_style_bg_color(slider, lv_color_hex(0x353840), LV_PART_MAIN);
        lv_obj_set_style_bg_opa(slider, LV_OPA_COVER, LV_PART_MAIN);
        lv_obj_set_style_radius(slider, LV_RADIUS_CIRCLE, LV_PART_MAIN);
        lv_obj_set_style_bg_color(slider, lv_color_hex(SETTINGS_ACCENT), LV_PART_INDICATOR);
        lv_obj_set_style_radius(slider, LV_RADIUS_CIRCLE, LV_PART_INDICATOR);
        lv_obj_set_style_bg_color(slider, lv_color_hex(SETTINGS_TEXT), LV_PART_KNOB);
        lv_obj_set_style_pad_all(slider, 3, LV_PART_KNOB);
        lv_obj_add_event_cb(slider, settings_brightness_event, LV_EVENT_VALUE_CHANGED, value);
        lv_obj_add_event_cb(slider, settings_brightness_event, LV_EVENT_RELEASED, value);
        settings_animate_in(card);
    }
    else if (page == SETTINGS_PAGE_TIME)
    {
        lv_obj_t *card = settings_card(settings_content, 78);
        lv_obj_t *name = lv_label_create(card);
        lv_label_set_text(name, "24-hour clock");
        lv_obj_set_style_text_color(name, lv_color_hex(SETTINGS_TEXT), 0);
        lv_obj_set_style_text_font(name, &lv_font_montserrat_16, 0);
        lv_obj_align(name, LV_ALIGN_LEFT_MID, 0, 0);

        lv_obj_t *sw = lv_switch_create(card);
        lv_obj_align(sw, LV_ALIGN_RIGHT_MID, 0, 0);
        if (settings_24_hour) lv_obj_add_state(sw, LV_STATE_CHECKED);
        lv_obj_add_event_cb(sw, settings_switch_event, LV_EVENT_VALUE_CHANGED, NULL);
        settings_animate_in(card);
    }
    else if (page == SETTINGS_PAGE_STORAGE)
    {
        rt_uint32_t total = 0, used = 0, max_used = 0;
        char info[64];
        rt_memory_info(&total, &used, &max_used);
        snprintf(info, sizeof(info), "%lu KB used", (unsigned long)(used / 1024));
        settings_add_info("Memory in use", info, 72);
        snprintf(info, sizeof(info), "%lu KB total", (unsigned long)(total / 1024));
        settings_add_info("Available memory", info, 72);
        snprintf(info, sizeof(info), "%lu KB peak", (unsigned long)(max_used / 1024));
        settings_add_info("Peak usage", info, 72);
    }
    else if (page == SETTINGS_PAGE_ABOUT)
    {
        settings_add_info("Plum Watch", "Custom watch firmware", 72);
        settings_add_info("Device", "HK 10 Pro Max+", 72);
        settings_add_info("Chipset", "SiFli SF32LB525 family", 72);
    }

    lv_obj_scroll_to_y(settings_content, 0, LV_ANIM_OFF);
}

static void settings_ui_init(lv_obj_t *parent)
{
    settings_lcd = rt_device_find("lcd");
    settings_24_hour = kv_get_int("time_format_24h", 1) ? 1 : 0;

    lv_obj_t *root = lv_obj_create(parent);
    lv_obj_set_size(root, LV_HOR_RES_MAX, LV_VER_RES_MAX);
    lv_obj_set_style_bg_color(root, lv_color_hex(SETTINGS_BG), 0);
    lv_obj_set_style_bg_opa(root, LV_OPA_COVER, 0);
    lv_obj_set_style_border_width(root, 0, 0);
    lv_obj_set_style_pad_all(root, 16, 0);
    lv_obj_set_style_pad_row(root, 10, 0);
    lv_obj_clear_flag(root, LV_OBJ_FLAG_SCROLLABLE);

    lv_obj_t *header = lv_obj_create(root);
    lv_obj_set_size(header, LV_PCT(100), 38);
    lv_obj_set_style_bg_opa(header, LV_OPA_TRANSP, 0);
    lv_obj_set_style_border_width(header, 0, 0);
    lv_obj_set_style_pad_all(header, 0, 0);
    lv_obj_clear_flag(header, LV_OBJ_FLAG_SCROLLABLE);
    lv_obj_align(header, LV_ALIGN_TOP_MID, 0, 0);

    settings_back_button = lv_btn_create(header);
    lv_obj_set_size(settings_back_button, 32, 32);
    lv_obj_set_style_bg_color(settings_back_button, lv_color_hex(SETTINGS_CARD), LV_PART_MAIN);
    lv_obj_set_style_bg_opa(settings_back_button, LV_OPA_COVER, LV_PART_MAIN);
    lv_obj_set_style_radius(settings_back_button, LV_RADIUS_CIRCLE, LV_PART_MAIN);
    lv_obj_set_style_bg_color(settings_back_button, lv_color_hex(0x303238), LV_PART_MAIN | LV_STATE_PRESSED);
    lv_obj_set_style_shadow_width(settings_back_button, 0, LV_PART_MAIN);
    lv_obj_set_style_border_width(settings_back_button, 0, LV_PART_MAIN);
    lv_obj_set_style_pad_all(settings_back_button, 0, LV_PART_MAIN);
    lv_obj_add_event_cb(settings_back_button, settings_back_event, LV_EVENT_CLICKED, NULL);
    lv_obj_t *back = lv_label_create(settings_back_button);
    lv_label_set_text(back, LV_SYMBOL_LEFT);
    lv_obj_set_style_text_color(back, lv_color_hex(SETTINGS_ACCENT), 0);
    lv_obj_center(back);
    lv_obj_add_flag(settings_back_button, LV_OBJ_FLAG_HIDDEN);

    settings_header_title = lv_label_create(header);
    lv_label_set_text(settings_header_title, "Settings");
    lv_obj_set_style_text_color(settings_header_title, lv_color_hex(SETTINGS_ACCENT), 0);
    lv_obj_set_style_text_font(settings_header_title, &lv_font_montserrat_20, 0);
    lv_obj_align(settings_header_title, LV_ALIGN_LEFT_MID, 0, 0);

    lv_obj_t *clock = lv_label_create(header);
    lv_obj_set_style_text_color(clock, lv_color_hex(SETTINGS_TEXT), 0);
    lv_obj_set_style_text_font(clock, &lv_font_montserrat_14, 0);
    lv_obj_align(clock, LV_ALIGN_RIGHT_MID, 0, 0);
    if (settings_clock_timer) lv_timer_del(settings_clock_timer);
    settings_clock_timer = lv_timer_create(settings_clock_update, 60000, clock);
    settings_clock_update(settings_clock_timer);

    settings_content = lv_obj_create(root);
    lv_obj_set_size(settings_content, LV_PCT(100), LV_VER_RES_MAX - 76);
    lv_obj_set_style_bg_opa(settings_content, LV_OPA_TRANSP, 0);
    lv_obj_set_style_border_width(settings_content, 0, 0);
    lv_obj_set_style_pad_all(settings_content, 0, 0);
    lv_obj_set_style_pad_row(settings_content, 9, 0);
    lv_obj_set_flex_flow(settings_content, LV_FLEX_FLOW_COLUMN);
    lv_obj_set_flex_align(settings_content, LV_FLEX_ALIGN_START, LV_FLEX_ALIGN_CENTER, LV_FLEX_ALIGN_START);
    lv_obj_set_scrollbar_mode(settings_content, LV_SCROLLBAR_MODE_OFF);
    lv_obj_add_flag(settings_content, LV_OBJ_FLAG_SCROLLABLE | LV_OBJ_FLAG_SCROLL_MOMENTUM);
    lv_obj_set_scroll_dir(settings_content, LV_DIR_VER);
    lv_obj_align(settings_content, LV_ALIGN_BOTTOM_MID, 0, 0);

    settings_show_page(SETTINGS_PAGE_HOME);
    settings_apply_brightness(kv_get_int("lcd_brightness", 100), false);
}

static void on_start(void)
{
    settings_content = RT_NULL;
    settings_back_button = RT_NULL;
    settings_header_title = RT_NULL;
    settings_ui_init(lv_scr_act());
}

static void msg_handler(gui_app_msg_type_t msg, void *param)
{
    (void)param;
    if (msg == GUI_APP_MSG_ONSTART)
        on_start();
    else if (msg == GUI_APP_MSG_ONSTOP)
    {
        if (settings_clock_timer)
        {
            lv_timer_del(settings_clock_timer);
            settings_clock_timer = NULL;
        }
        settings_lcd = RT_NULL;
        settings_content = RT_NULL;
        settings_back_button = RT_NULL;
        settings_header_title = RT_NULL;
    }
}

static int app_main(intent_t i)
{
    (void)i;
    gui_app_regist_msg_handler(APP_ID, msg_handler);
    return 0;
}

BUILTIN_APP_EXPORT(LV_EXT_STR_ID(Settings),
                   LV_EXT_IMG_GET(img_settings), APP_ID, app_main);
