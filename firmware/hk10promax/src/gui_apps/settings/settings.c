#include "rtconfig.h"
#include <stdio.h>
#include <time.h>
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

static rt_device_t settings_lcd;
static lv_timer_t *settings_clock_timer;

static void settings_apply_brightness(int value, bool persist)
{
    if (value < 10) value = 10;
    if (value > 100) value = 100;
    if (settings_lcd)
        rt_device_control(settings_lcd, RTGRAPHIC_CTRL_SET_BRIGHTNESS, &value);
    if (persist)
        kv_set_int("lcd_brightness", value);
}

static void brightness_event_cb(lv_event_t *e)
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

static void settings_clock_update(lv_timer_t *timer)
{
    if (!timer || !timer->user_data) return;
    time_t now = time(RT_NULL);
    struct tm *local = localtime(&now);
    if (!local) return;
    char text[8];
    snprintf(text, sizeof(text), "%02d:%02d", local->tm_hour, local->tm_min);
    lv_label_set_text((lv_obj_t *)timer->user_data, text);
}

static void settings_section(lv_obj_t *parent, const char *name)
{
    lv_obj_t *label = lv_label_create(parent);
    lv_label_set_text(label, name);
    lv_obj_set_style_text_color(label, lv_color_hex(SETTINGS_MUTED), 0);
    lv_obj_set_style_text_font(label, &lv_font_montserrat_14, 0);
    lv_obj_set_width(label, LV_HOR_RES_MAX - 40);
}

static lv_obj_t *settings_card(lv_obj_t *parent, lv_coord_t height)
{
    lv_obj_t *card = lv_obj_create(parent);
    lv_obj_set_width(card, LV_HOR_RES_MAX - 36);
    lv_obj_set_height(card, height);
    lv_obj_set_style_bg_color(card, lv_color_hex(SETTINGS_CARD), 0);
    lv_obj_set_style_bg_opa(card, LV_OPA_COVER, 0);
    lv_obj_set_style_border_width(card, 0, 0);
    lv_obj_set_style_radius(card, 22, 0);
    lv_obj_set_style_pad_all(card, 14, 0);
    lv_obj_clear_flag(card, LV_OBJ_FLAG_SCROLLABLE);
    return card;
}

static void settings_ui_init(lv_obj_t *parent)
{
    char info[96];
    rt_uint32_t total = 0, used = 0, max_used = 0;
    int brightness = kv_get_int("lcd_brightness", 100);
    settings_lcd = rt_device_find("lcd");

    lv_obj_t *root = lv_obj_create(parent);
    lv_obj_set_size(root, LV_HOR_RES_MAX, LV_VER_RES_MAX);
    lv_obj_set_style_bg_color(root, lv_color_hex(SETTINGS_BG), 0);
    lv_obj_set_style_bg_opa(root, LV_OPA_COVER, 0);
    lv_obj_set_style_border_width(root, 0, 0);
    lv_obj_set_style_pad_all(root, 18, 0);
    lv_obj_set_style_pad_row(root, 13, 0);
    lv_obj_set_flex_flow(root, LV_FLEX_FLOW_COLUMN);
    lv_obj_set_flex_align(root, LV_FLEX_ALIGN_START, LV_FLEX_ALIGN_CENTER, LV_FLEX_ALIGN_START);
    lv_obj_set_scrollbar_mode(root, LV_SCROLLBAR_MODE_OFF);

    lv_obj_t *header = lv_obj_create(root);
    lv_obj_set_size(header, LV_HOR_RES_MAX - 36, 38);
    lv_obj_set_style_bg_opa(header, LV_OPA_TRANSP, 0);
    lv_obj_set_style_border_width(header, 0, 0);
    lv_obj_set_style_pad_all(header, 0, 0);
    lv_obj_clear_flag(header, LV_OBJ_FLAG_SCROLLABLE);

    lv_obj_t *title = lv_label_create(header);
    lv_label_set_text(title, "Settings");
    lv_obj_set_style_text_color(title, lv_color_hex(SETTINGS_TEXT), 0);
    lv_obj_set_style_text_font(title, &lv_font_montserrat_24, 0);
    lv_obj_align(title, LV_ALIGN_LEFT_MID, 0, 0);

    lv_obj_t *clock = lv_label_create(header);
    lv_obj_set_style_text_color(clock, lv_color_hex(SETTINGS_TEXT), 0);
    lv_obj_set_style_text_font(clock, &lv_font_montserrat_14, 0);
    lv_obj_align(clock, LV_ALIGN_RIGHT_MID, 0, 0);
    if (settings_clock_timer) lv_timer_del(settings_clock_timer);
    settings_clock_timer = lv_timer_create(settings_clock_update, 60000, clock);
    settings_clock_update(settings_clock_timer);

    settings_section(root, "DISPLAY");
    lv_obj_t *display_card = settings_card(root, 112);
    lv_obj_t *brightness_title = lv_label_create(display_card);
    lv_label_set_text(brightness_title, "Brightness");
    lv_obj_set_style_text_color(brightness_title, lv_color_hex(SETTINGS_TEXT), 0);
    lv_obj_set_style_text_font(brightness_title, &lv_font_montserrat_16, 0);
    lv_obj_align(brightness_title, LV_ALIGN_TOP_LEFT, 0, 0);

    lv_obj_t *brightness_value = lv_label_create(display_card);
    char brightness_text[8];
    snprintf(brightness_text, sizeof(brightness_text), "%d%%", brightness);
    lv_label_set_text(brightness_value, brightness_text);
    lv_obj_set_style_text_color(brightness_value, lv_color_hex(SETTINGS_MUTED), 0);
    lv_obj_set_style_text_font(brightness_value, &lv_font_montserrat_14, 0);
    lv_obj_align(brightness_value, LV_ALIGN_TOP_RIGHT, 0, 0);

    lv_obj_t *slider = lv_slider_create(display_card);
    lv_obj_set_width(slider, LV_HOR_RES_MAX - 92);
    lv_obj_align(slider, LV_ALIGN_BOTTOM_MID, 0, -2);
    lv_slider_set_range(slider, 10, 100);
    lv_slider_set_value(slider, brightness, LV_ANIM_OFF);
    lv_obj_set_style_bg_color(slider, lv_color_hex(0x353840), LV_PART_MAIN);
    lv_obj_set_style_bg_color(slider, lv_color_hex(0xA45BE0), LV_PART_INDICATOR);
    lv_obj_set_style_bg_color(slider, lv_color_hex(0xF3F3F5), LV_PART_KNOB);
    lv_obj_add_event_cb(slider, brightness_event_cb, LV_EVENT_VALUE_CHANGED, brightness_value);
    lv_obj_add_event_cb(slider, brightness_event_cb, LV_EVENT_RELEASED, brightness_value);

    settings_section(root, "ABOUT");
    lv_obj_t *about_card = settings_card(root, 126);
    lv_obj_t *model = lv_label_create(about_card);
    lv_label_set_text(model, "HK 10 Pro Max+");
    lv_obj_set_style_text_color(model, lv_color_hex(SETTINGS_TEXT), 0);
    lv_obj_set_style_text_font(model, &lv_font_montserrat_16, 0);
    lv_obj_align(model, LV_ALIGN_TOP_LEFT, 0, 0);

    lv_obj_t *target = lv_label_create(about_card);
    lv_label_set_text(target, "SiFli SF32LB525 family");
    lv_obj_set_style_text_color(target, lv_color_hex(SETTINGS_MUTED), 0);
    lv_obj_set_style_text_font(target, &lv_font_montserrat_14, 0);
    lv_obj_align(target, LV_ALIGN_TOP_LEFT, 0, 28);

    rt_memory_info(&total, &used, &max_used);
    snprintf(info, sizeof(info), "RAM in use  %lu / %lu KB",
             (unsigned long)(used / 1024), (unsigned long)(total / 1024));
    lv_obj_t *memory = lv_label_create(about_card);
    lv_label_set_text(memory, info);
    lv_obj_set_style_text_color(memory, lv_color_hex(SETTINGS_MUTED), 0);
    lv_obj_set_style_text_font(memory, &lv_font_montserrat_12, 0);
    lv_obj_align(memory, LV_ALIGN_BOTTOM_LEFT, 0, 0);

    settings_apply_brightness(brightness, false);
}

static void on_start(void)
{
    settings_ui_init(lv_scr_act());
}

static void msg_handler(gui_app_msg_type_t msg, void *param)
{
    if (msg == GUI_APP_MSG_ONSTART)
        on_start();
    else if (msg == GUI_APP_MSG_ONSTOP && settings_clock_timer)
    {
        lv_timer_del(settings_clock_timer);
        settings_clock_timer = NULL;
        settings_lcd = RT_NULL;
    }
}

static int app_main(intent_t i)
{
    gui_app_regist_msg_handler(APP_ID, msg_handler);
    return 0;
}

BUILTIN_APP_EXPORT(LV_EXT_STR_ID(Settings),
                   LV_EXT_IMG_GET(img_settings), APP_ID, app_main);
