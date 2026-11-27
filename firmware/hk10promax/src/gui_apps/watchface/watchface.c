#include <stdio.h>
#include <time.h>
#include "rtconfig.h"
#include "lvsf.h"
#include <lv_ext_resource_manager.h>
#include <rtthread.h>
#include "gui_app_fwk.h"
#include "littlevgl2rtt.h"
#include "custom_trans_anim.h"

LV_IMG_DECLARE(img_clock);
#define APP_ID "Watchface"

static lv_obj_t *time_label;
static lv_obj_t *date_label;
static lv_timer_t *clock_timer;

static void update_time_cb(lv_timer_t *timer)
{
    time_t now = time(NULL);
    struct tm *tm_now = localtime(&now);
    if (!tm_now) return;

    char time_text[8];
    char date_text[24];
    static const char *days[] = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
    static const char *months[] = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN",
                                   "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};

    snprintf(time_text, sizeof(time_text), "%02d:%02d", tm_now->tm_hour, tm_now->tm_min);
    snprintf(date_text, sizeof(date_text), "%s, %s %d",
             days[tm_now->tm_wday % 7], months[tm_now->tm_mon % 12], tm_now->tm_mday);
    if (time_label) lv_label_set_text(time_label, time_text);
    if (date_label) lv_label_set_text(date_label, date_text);
}

static void open_menu_cb(lv_event_t *e)
{
    lv_point_t center = {LV_HOR_RES_MAX / 2, LV_VER_RES_MAX / 2};
    cust_trans_anim_config(CUST_ANIM_TYPE_3, &center);
    gui_app_run("MainMenu");
}

static void watchface_ui_init(lv_obj_t *parent)
{
    lv_obj_t *root = lv_obj_create(parent);
    lv_obj_set_size(root, LV_HOR_RES_MAX, LV_VER_RES_MAX);
    lv_obj_set_style_bg_color(root, lv_color_black(), 0);
    lv_obj_set_style_bg_opa(root, LV_OPA_COVER, 0);
    lv_obj_set_style_border_width(root, 0, 0);
    lv_obj_set_style_pad_all(root, 0, 0);

    lv_obj_t *brand = lv_label_create(root);
    lv_label_set_text(brand, "PLUM");
    lv_obj_set_style_text_color(brand, lv_color_hex(0xE5E5E7), 0);
    lv_obj_set_style_text_font(brand, &lv_font_montserrat_16, 0);
    lv_obj_align(brand, LV_ALIGN_TOP_MID, 0, 54);

    date_label = lv_label_create(root);
    lv_obj_set_style_text_color(date_label, lv_color_hex(0xA1A1AA), 0);
    lv_obj_set_style_text_font(date_label, &lv_font_montserrat_16, 0);
    lv_obj_align(date_label, LV_ALIGN_CENTER, 0, -58);

    time_label = lv_label_create(root);
    lv_obj_set_style_text_color(time_label, lv_color_hex(0xF4F4F5), 0);
    lv_obj_set_style_text_font(time_label, &lv_font_montserrat_36, 0);
    lv_obj_align(time_label, LV_ALIGN_CENTER, 0, -4);

    lv_obj_t *hint = lv_label_create(root);
    lv_label_set_text(hint, "Tap to open apps");
    lv_obj_set_style_text_color(hint, lv_color_hex(0x777780), 0);
    lv_obj_set_style_text_font(hint, &lv_font_montserrat_12, 0);
    lv_obj_align(hint, LV_ALIGN_BOTTOM_MID, 0, -54);

    lv_obj_add_flag(root, LV_OBJ_FLAG_CLICKABLE);
    lv_obj_add_event_cb(root, open_menu_cb, LV_EVENT_CLICKED, NULL);
    update_time_cb(NULL);
    if (!clock_timer)
        clock_timer = lv_timer_create(update_time_cb, 1000, NULL);
}

static void on_start(void)
{
    watchface_ui_init(lv_scr_act());
}

static void on_stop(void)
{
    if (clock_timer)
    {
        lv_timer_del(clock_timer);
        clock_timer = NULL;
    }
    time_label = NULL;
    date_label = NULL;
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
