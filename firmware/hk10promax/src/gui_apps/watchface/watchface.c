#include <stdio.h>
#include <time.h>
#include <string.h>
#include "rtconfig.h"
#include "lvsf.h"
#include <lv_ext_resource_manager.h>
#include <rtthread.h>
#include "gui_app_fwk.h"
#include "littlevgl2rtt.h"
#include "custom_trans_anim.h"

LV_IMG_DECLARE(img_clock);
#define APP_ID "Watchface"

#define WF_BG 0x090A0D
#define WF_PANEL 0x17191F
#define WF_MUTED 0x858A96
#define WF_TEXT 0xF4F5F7
#define WF_ACCENT 0xB78AFF
#define WF_STYLE_COUNT 3

typedef enum
{
    WF_STYLE_EDITORIAL = 0,
    WF_STYLE_MINIMAL,
    WF_STYLE_ANALOG
} watchface_style_t;

static lv_obj_t *root;
static lv_obj_t *time_label;
static lv_obj_t *date_label;
static lv_obj_t *weekday_label;
static lv_obj_t *seconds_label;
static lv_obj_t *analog_hour;
static lv_obj_t *analog_minute;
static lv_obj_t *analog_second;
static lv_obj_t *selector;
static lv_timer_t *clock_timer;
static watchface_style_t active_style = WF_STYLE_EDITORIAL;
static bool selector_open;

static const char *weekdays[] = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
static const char *months[] = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};

static void set_line(lv_obj_t *line, lv_point_t *points, lv_coord_t x1, lv_coord_t y1,
                     lv_coord_t x2, lv_coord_t y2)
{
    if (!line) return;
    points[0].x = x1;
    points[0].y = y1;
    points[1].x = x2;
    points[1].y = y2;
    lv_line_set_points(line, points, 2);
}

static lv_point_t hour_points[2];
static lv_point_t minute_points[2];
static lv_point_t second_points[2];

static void update_analog(const struct tm *now)
{
    if (!analog_hour || !analog_minute || !analog_second) return;

    const float pi = 3.14159265358979323846f;
    const lv_coord_t cx = LV_HOR_RES_MAX / 2;
    const lv_coord_t cy = LV_VER_RES_MAX / 2 + 4;
    float seconds = (float)now->tm_sec;
    float minutes = (float)now->tm_min + seconds / 60.0f;
    float hours = (float)(now->tm_hour % 12) + minutes / 60.0f;
    float angles[3] = {
        hours * 30.0f - 90.0f,
        minutes * 6.0f - 90.0f,
        seconds * 6.0f - 90.0f
    };
    lv_coord_t lengths[3] = {LV_MIN(LV_HOR_RES_MAX, LV_VER_RES_MAX) / 6,
                             LV_MIN(LV_HOR_RES_MAX, LV_VER_RES_MAX) / 4,
                             LV_MIN(LV_HOR_RES_MAX, LV_VER_RES_MAX) / 3};
    lv_obj_t *lines[3] = {analog_hour, analog_minute, analog_second};
    lv_point_t *points[3] = {hour_points, minute_points, second_points};

    for (int i = 0; i < 3; ++i)
    {
        float radians = angles[i] * pi / 180.0f;
        lv_coord_t x = cx + (lv_coord_t)(cosf(radians) * lengths[i]);
        lv_coord_t y = cy + (lv_coord_t)(sinf(radians) * lengths[i]);
        set_line(lines[i], points[i], cx, cy, x, y);
    }
}

static void update_time_cb(lv_timer_t *timer)
{
    time_t timestamp = time(NULL);
    struct tm *local = localtime(&timestamp);
    if (!local) return;

    char time_text[8];
    char date_text[20];
    char seconds_text[4];

    snprintf(time_text, sizeof(time_text), "%02d:%02d", local->tm_hour, local->tm_min);
    snprintf(date_text, sizeof(date_text), "%s %d %s",
             months[local->tm_mon % 12], local->tm_mday, " ");
    snprintf(seconds_text, sizeof(seconds_text), "%02d", local->tm_sec);

    if (time_label) lv_label_set_text(time_label, time_text);
    if (date_label) lv_label_set_text(date_label, date_text);
    if (weekday_label) lv_label_set_text(weekday_label, weekdays[local->tm_wday % 7]);
    if (seconds_label) lv_label_set_text(seconds_label, seconds_text);
    update_analog(local);
}

static void open_menu_cb(lv_event_t *e)
{
    lv_point_t center = {LV_HOR_RES_MAX / 2, LV_VER_RES_MAX / 2};
    cust_trans_anim_config(CUST_ANIM_TYPE_3, &center);
    gui_app_run("MainMenu");
}

static void selector_close(void)
{
    if (selector)
    {
        lv_obj_del(selector);
        selector = NULL;
    }
    selector_open = false;
}

static void style_button_cb(lv_event_t *e)
{
    watchface_style_t style = (watchface_style_t)(uintptr_t)lv_event_get_user_data(e);
    active_style = style;
    selector_close();
    if (root) lv_obj_clean(root);
    time_label = NULL;
    date_label = NULL;
    weekday_label = NULL;
    seconds_label = NULL;
    analog_hour = NULL;
    analog_minute = NULL;
    analog_second = NULL;
    /* Rebuild the selected face without restarting the app or its clock timer. */
    extern void watchface_build_ui(void);
    watchface_build_ui();
    update_time_cb(NULL);
}

static void add_style_button(lv_obj_t *parent, const char *name, const char *description,
                             watchface_style_t style, lv_coord_t y)
{
    lv_obj_t *button = lv_btn_create(parent);
    lv_obj_set_size(button, LV_HOR_RES_MAX - 54, 48);
    lv_obj_align(button, LV_ALIGN_TOP_MID, 0, y);
    lv_obj_set_style_bg_color(button, lv_color_hex(WF_PANEL), 0);
    lv_obj_set_style_bg_opa(button, LV_OPA_COVER, 0);
    lv_obj_set_style_border_width(button, style == active_style ? 1 : 0, 0);
    lv_obj_set_style_border_color(button, lv_color_hex(WF_ACCENT), 0);
    lv_obj_set_style_radius(button, 14, 0);
    lv_obj_set_style_shadow_width(button, 0, 0);

    lv_obj_t *title = lv_label_create(button);
    lv_label_set_text(title, name);
    lv_obj_set_style_text_color(title, lv_color_hex(WF_TEXT), 0);
    lv_obj_set_style_text_font(title, &lv_font_montserrat_14, 0);
    lv_obj_align(title, LV_ALIGN_LEFT_MID, 12, -7);

    lv_obj_t *detail = lv_label_create(button);
    lv_label_set_text(detail, description);
    lv_obj_set_style_text_color(detail, lv_color_hex(WF_MUTED), 0);
    lv_obj_set_style_text_font(detail, &lv_font_montserrat_10, 0);
    lv_obj_align(detail, LV_ALIGN_LEFT_MID, 12, 11);

    lv_obj_add_event_cb(button, style_button_cb, LV_EVENT_CLICKED, (void *)(uintptr_t)style);
}

static void show_selector(void)
{
    if (selector_open || !root) return;
    selector_open = true;

    selector = lv_obj_create(root);
    lv_obj_set_size(selector, LV_HOR_RES_MAX, LV_VER_RES_MAX);
    lv_obj_set_pos(selector, 0, 0);
    lv_obj_set_style_bg_color(selector, lv_color_hex(WF_BG), 0);
    lv_obj_set_style_bg_opa(selector, LV_OPA_COVER, 0);
    lv_obj_set_style_border_width(selector, 0, 0);
    lv_obj_set_style_radius(selector, 0, 0);
    lv_obj_set_style_pad_all(selector, 0, 0);
    lv_obj_clear_flag(selector, LV_OBJ_FLAG_SCROLLABLE);

    lv_obj_t *eyebrow = lv_label_create(selector);
    lv_label_set_text(eyebrow, "APPEARANCE");
    lv_obj_set_style_text_color(eyebrow, lv_color_hex(WF_ACCENT), 0);
    lv_obj_set_style_text_font(eyebrow, &lv_font_montserrat_12, 0);
    lv_obj_align(eyebrow, LV_ALIGN_TOP_MID, 0, 34);

    lv_obj_t *heading = lv_label_create(selector);
    lv_label_set_text(heading, "Watch face");
    lv_obj_set_style_text_color(heading, lv_color_hex(WF_TEXT), 0);
    lv_obj_set_style_text_font(heading, &lv_font_montserrat_22, 0);
    lv_obj_align(heading, LV_ALIGN_TOP_MID, 0, 58);

    add_style_button(selector, "Editorial", "Large time, date and clean spacing", WF_STYLE_EDITORIAL, 112);
    add_style_button(selector, "Minimal", "Compact time with a quiet layout", WF_STYLE_MINIMAL, 170);
    add_style_button(selector, "Analog", "Live hour, minute and second hands", WF_STYLE_ANALOG, 228);

    lv_obj_t *hint = lv_label_create(selector);
    lv_label_set_text(hint, "Tap a style to apply");
    lv_obj_set_style_text_color(hint, lv_color_hex(WF_MUTED), 0);
    lv_obj_set_style_text_font(hint, &lv_font_montserrat_10, 0);
    lv_obj_align(hint, LV_ALIGN_BOTTOM_MID, 0, -28);

    lv_anim_t anim;
    lv_anim_init(&anim);
    lv_anim_set_var(&anim, selector);
    lv_anim_set_exec_cb(&anim, (lv_anim_exec_xcb_t)lv_obj_set_style_opa);
    lv_anim_set_values(&anim, LV_OPA_TRANSP, LV_OPA_COVER);
    lv_anim_set_time(&anim, 220);
    lv_anim_set_path_cb(&anim, lv_anim_path_ease_out);
    lv_anim_start(&anim);
}

static void root_event_cb(lv_event_t *e)
{
    lv_event_code_t code = lv_event_get_code(e);
    if (code == LV_EVENT_LONG_PRESSED)
        show_selector();
    else if (code == LV_EVENT_CLICKED && !selector_open)
        open_menu_cb(e);
}

void watchface_build_ui(void)
{
    root = lv_obj_create(lv_scr_act());
    lv_obj_set_size(root, LV_HOR_RES_MAX, LV_VER_RES_MAX);
    lv_obj_set_pos(root, 0, 0);
    lv_obj_set_style_bg_color(root, lv_color_hex(WF_BG), 0);
    lv_obj_set_style_bg_opa(root, LV_OPA_COVER, 0);
    lv_obj_set_style_border_width(root, 0, 0);
    lv_obj_set_style_radius(root, 0, 0);
    lv_obj_set_style_pad_all(root, 0, 0);
    lv_obj_clear_flag(root, LV_OBJ_FLAG_SCROLLABLE);
    lv_obj_add_flag(root, LV_OBJ_FLAG_CLICKABLE);
    lv_obj_add_event_cb(root, root_event_cb, LV_EVENT_ALL, NULL);

    if (active_style == WF_STYLE_ANALOG)
    {
        lv_obj_t *dial = lv_obj_create(root);
        lv_coord_t diameter = LV_MIN(LV_HOR_RES_MAX, LV_VER_RES_MAX) - 62;
        lv_obj_set_size(dial, diameter, diameter);
        lv_obj_align(dial, LV_ALIGN_CENTER, 0, 2);
        lv_obj_set_style_radius(dial, LV_RADIUS_CIRCLE, 0);
        lv_obj_set_style_bg_opa(dial, LV_OPA_TRANSP, 0);
        lv_obj_set_style_border_width(dial, 1, 0);
        lv_obj_set_style_border_color(dial, lv_color_hex(0x34313D), 0);
        lv_obj_clear_flag(dial, LV_OBJ_FLAG_CLICKABLE);

        analog_hour = lv_line_create(root);
        analog_minute = lv_line_create(root);
        analog_second = lv_line_create(root);
        lv_obj_set_style_line_width(analog_hour, 4, 0);
        lv_obj_set_style_line_width(analog_minute, 2, 0);
        lv_obj_set_style_line_width(analog_second, 1, 0);
        lv_obj_set_style_line_color(analog_hour, lv_color_hex(WF_TEXT), 0);
        lv_obj_set_style_line_color(analog_minute, lv_color_hex(WF_ACCENT), 0);
        lv_obj_set_style_line_color(analog_second, lv_color_hex(0xE58B91), 0);
        lv_obj_set_style_line_rounded(analog_hour, true, 0);
        lv_obj_set_style_line_rounded(analog_minute, true, 0);
        lv_obj_set_style_line_rounded(analog_second, true, 0);

        lv_obj_t *center = lv_obj_create(root);
        lv_obj_set_size(center, 8, 8);
        lv_obj_set_style_radius(center, LV_RADIUS_CIRCLE, 0);
        lv_obj_set_style_bg_color(center, lv_color_hex(WF_ACCENT), 0);
        lv_obj_set_style_border_width(center, 0, 0);
        lv_obj_align(center, LV_ALIGN_CENTER, 0, 6);
        lv_obj_clear_flag(center, LV_OBJ_FLAG_CLICKABLE);

        weekday_label = lv_label_create(root);
        lv_label_set_text(weekday_label, "MONDAY");
        lv_obj_set_style_text_color(weekday_label, lv_color_hex(WF_MUTED), 0);
        lv_obj_set_style_text_font(weekday_label, &lv_font_montserrat_12, 0);
        lv_obj_align(weekday_label, LV_ALIGN_TOP_MID, 0, 30);

        date_label = lv_label_create(root);
        lv_label_set_text(date_label, "JAN 01");
        lv_obj_set_style_text_color(date_label, lv_color_hex(WF_TEXT), 0);
        lv_obj_set_style_text_font(date_label, &lv_font_montserrat_14, 0);
        lv_obj_align(date_label, LV_ALIGN_BOTTOM_MID, 0, -36);
    }
    else
    {
        weekday_label = lv_label_create(root);
        lv_label_set_text(weekday_label, "MONDAY");
        lv_obj_set_style_text_color(weekday_label, lv_color_hex(WF_ACCENT), 0);
        lv_obj_set_style_text_font(weekday_label, &lv_font_montserrat_12, 0);
        lv_obj_align(weekday_label, LV_ALIGN_TOP_MID, 0, active_style == WF_STYLE_MINIMAL ? 58 : 72);

        date_label = lv_label_create(root);
        lv_label_set_text(date_label, "JAN 01");
        lv_obj_set_style_text_color(date_label, lv_color_hex(WF_MUTED), 0);
        lv_obj_set_style_text_font(date_label, &lv_font_montserrat_14, 0);
        lv_obj_align(date_label, LV_ALIGN_CENTER, 0, active_style == WF_STYLE_MINIMAL ? -48 : -58);

        time_label = lv_label_create(root);
        lv_label_set_text(time_label, "09:41");
        lv_obj_set_style_text_color(time_label, lv_color_hex(WF_TEXT), 0);
        lv_obj_set_style_text_font(time_label, active_style == WF_STYLE_MINIMAL ? &lv_font_montserrat_36 : &lv_font_montserrat_48, 0);
        lv_obj_align(time_label, LV_ALIGN_CENTER, 0, active_style == WF_STYLE_MINIMAL ? -4 : 0);

        seconds_label = lv_label_create(root);
        lv_label_set_text(seconds_label, "00");
        lv_obj_set_style_text_color(seconds_label, lv_color_hex(WF_MUTED), 0);
        lv_obj_set_style_text_font(seconds_label, &lv_font_montserrat_14, 0);
        lv_obj_align(seconds_label, LV_ALIGN_CENTER, 0, active_style == WF_STYLE_MINIMAL ? 34 : 42);

        lv_obj_t *rule = lv_obj_create(root);
        lv_obj_set_size(rule, LV_HOR_RES_MAX / 3, 1);
        lv_obj_align(rule, LV_ALIGN_BOTTOM_MID, 0, -66);
        lv_obj_set_style_bg_color(rule, lv_color_hex(0x34313D), 0);
        lv_obj_set_style_bg_opa(rule, LV_OPA_COVER, 0);
        lv_obj_set_style_border_width(rule, 0, 0);
        lv_obj_clear_flag(rule, LV_OBJ_FLAG_CLICKABLE);

        lv_obj_t *footer = lv_label_create(root);
        lv_label_set_text(footer, "PLUM");
        lv_obj_set_style_text_color(footer, lv_color_hex(0x777B86), 0);
        lv_obj_set_style_text_font(footer, &lv_font_montserrat_10, 0);
        lv_obj_align(footer, LV_ALIGN_BOTTOM_MID, 0, -42);
    }

    lv_obj_t *hint = lv_label_create(root);
    lv_label_set_text(hint, "HOLD TO CHANGE");
    lv_obj_set_style_text_color(hint, lv_color_hex(0x555963), 0);
    lv_obj_set_style_text_font(hint, &lv_font_montserrat_10, 0);
    lv_obj_align(hint, LV_ALIGN_BOTTOM_MID, 0, -14);
    lv_obj_clear_flag(hint, LV_OBJ_FLAG_CLICKABLE);
}

static void on_start(void)
{
    selector_open = false;
    selector = NULL;
    watchface_build_ui();
    update_time_cb(NULL);
    if (clock_timer) lv_timer_del(clock_timer);
    clock_timer = lv_timer_create(update_time_cb, 1000, NULL);
}

static void on_stop(void)
{
    if (clock_timer)
    {
        lv_timer_del(clock_timer);
        clock_timer = NULL;
    }
    root = NULL;
    selector = NULL;
    selector_open = false;
    time_label = NULL;
    date_label = NULL;
    weekday_label = NULL;
    seconds_label = NULL;
    analog_hour = NULL;
    analog_minute = NULL;
    analog_second = NULL;
}

static void msg_handler(gui_app_msg_type_t msg, void *param)
{
    switch (msg)
    {
    case GUI_APP_MSG_ONSTART:
        on_start();
        break;
    case GUI_APP_MSG_ONSTOP:
        on_stop();
        break;
    default:
        break;
    }
}

static int app_main(intent_t i)
{
    gui_app_regist_msg_handler(APP_ID, msg_handler);
    return 0;
}

BUILTIN_APP_EXPORT(LV_EXT_STR_ID(WatchfaceString), LV_EXT_IMG_GET(img_clock), APP_ID, app_main);
