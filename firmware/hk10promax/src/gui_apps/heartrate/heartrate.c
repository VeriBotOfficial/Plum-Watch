#include "rtconfig.h"
#include <stdio.h>
#include <string.h>
#include "lvsf.h"
#include <lv_ext_resource_manager.h>
#include <rtthread.h>
#include <rtdevice.h>
#include "gui_app_fwk.h"
#include "littlevgl2rtt.h"
#include "custom_trans_anim.h"

LV_IMG_DECLARE(img_red_heart);
#define APP_ID "HeartRate"
#define HR_BG 0x09090B
#define HR_CARD 0x1B1D22
#define HR_MUTED 0x92959D

static rt_device_t hr_device;
static lv_obj_t *bpm_label;
static lv_obj_t *status_label;
static lv_obj_t *average_label;
static lv_obj_t *range_label;
static lv_obj_t *measure_button_label;
static lv_timer_t *measure_timer;
static bool measuring;
static uint32_t sample_count;
static uint32_t bpm_total;
static uint16_t bpm_min;
static uint16_t bpm_max;

static rt_device_t find_hr_device(void)
{
    static const char *names[] = {
        "hr_hrs33", "hr_vc32", "hr_gh30", "hr_pah80",
        "hr_sc7r3", "hr_sensor"
    };
    for (size_t i = 0; i < sizeof(names) / sizeof(names[0]); ++i)
    {
        rt_device_t device = rt_device_find(names[i]);
        if (device) return device;
    }
    return RT_NULL;
}

static void update_measurement_labels(uint16_t bpm)
{
    char text[40];
    snprintf(text, sizeof(text), "%u", (unsigned int)bpm);
    if (bpm_label) lv_label_set_text(bpm_label, text);

    sample_count++;
    bpm_total += bpm;
    if (bpm < bpm_min) bpm_min = bpm;
    if (bpm > bpm_max) bpm_max = bpm;

    snprintf(text, sizeof(text), "Average  %u BPM", (unsigned int)(bpm_total / sample_count));
    if (average_label) lv_label_set_text(average_label, text);
    snprintf(text, sizeof(text), "Range  %u-%u BPM", (unsigned int)bpm_min, (unsigned int)bpm_max);
    if (range_label) lv_label_set_text(range_label, text);
    if (status_label) lv_label_set_text(status_label, "Live reading");
}

static void measure_timer_cb(lv_timer_t *timer)
{
    struct rt_sensor_data data;
    if (!measuring || !hr_device) return;
    memset(&data, 0, sizeof(data));
    if (rt_device_read(hr_device, 0, &data, 1) == 0)
    {
        if (status_label) lv_label_set_text(status_label, "Waiting for sensor data");
        return;
    }

    /* RT-Thread HR sensors report BPM directly, not raw PPG waveform samples. */
    uint16_t bpm = (uint16_t)data.data.hr;
    if (bpm < 30 || bpm > 240)
    {
        if (status_label) lv_label_set_text(status_label, "Waiting for a valid reading");
        return;
    }
    update_measurement_labels(bpm);
}

static void measure_button_cb(lv_event_t *e)
{
    if (!hr_device) return;
    measuring = !measuring;
    if (measure_button_label)
        lv_label_set_text(measure_button_label, measuring ? "Pause" : "Resume");
    if (status_label)
        lv_label_set_text(status_label, measuring ? "Starting measurement" : "Paused");
}

static void reset_button_cb(lv_event_t *e)
{
    sample_count = 0;
    bpm_total = 0;
    bpm_min = 999;
    bpm_max = 0;
    if (bpm_label) lv_label_set_text(bpm_label, "--");
    if (average_label) lv_label_set_text(average_label, "Average  --");
    if (range_label) lv_label_set_text(range_label, "Range  --");
    if (status_label)
        lv_label_set_text(status_label, hr_device ? "Ready" : "Sensor unavailable");
}

static void heartrate_ui_init(lv_obj_t *parent)
{
    hr_device = find_hr_device();
    measuring = false;
    sample_count = 0;
    bpm_total = 0;
    bpm_min = 999;
    bpm_max = 0;

    lv_obj_t *root = lv_obj_create(parent);
    lv_obj_set_size(root, LV_HOR_RES_MAX, LV_VER_RES_MAX);
    lv_obj_set_style_bg_color(root, lv_color_hex(HR_BG), 0);
    lv_obj_set_style_bg_opa(root, LV_OPA_COVER, 0);
    lv_obj_set_style_border_width(root, 0, 0);
    lv_obj_set_style_pad_all(root, 18, 0);
    lv_obj_set_style_pad_row(root, 12, 0);
    lv_obj_set_flex_flow(root, LV_FLEX_FLOW_COLUMN);
    lv_obj_set_flex_align(root, LV_FLEX_ALIGN_START, LV_FLEX_ALIGN_CENTER, LV_FLEX_ALIGN_CENTER);
    lv_obj_set_scrollbar_mode(root, LV_SCROLLBAR_MODE_OFF);

    lv_obj_t *title = lv_label_create(root);
    lv_label_set_text(title, "Heart Rate");
    lv_obj_set_style_text_color(title, lv_color_white(), 0);
    lv_obj_set_style_text_font(title, &lv_font_montserrat_24, 0);

    lv_obj_t *reading = lv_obj_create(root);
    lv_obj_set_size(reading, LV_HOR_RES_MAX - 40, 190);
    lv_obj_set_style_bg_color(reading, lv_color_hex(HR_CARD), 0);
    lv_obj_set_style_bg_opa(reading, LV_OPA_COVER, 0);
    lv_obj_set_style_border_width(reading, 0, 0);
    lv_obj_set_style_radius(reading, 22, 0);
    lv_obj_clear_flag(reading, LV_OBJ_FLAG_SCROLLABLE);

    bpm_label = lv_label_create(reading);
    lv_label_set_text(bpm_label, "--");
    lv_obj_set_style_text_color(bpm_label, lv_color_white(), 0);
    lv_obj_set_style_text_font(bpm_label, &lv_font_montserrat_48, 0);
    lv_obj_align(bpm_label, LV_ALIGN_CENTER, 0, -18);

    lv_obj_t *unit = lv_label_create(reading);
    lv_label_set_text(unit, "BPM");
    lv_obj_set_style_text_color(unit, lv_color_hex(HR_MUTED), 0);
    lv_obj_set_style_text_font(unit, &lv_font_montserrat_14, 0);
    lv_obj_align(unit, LV_ALIGN_CENTER, 0, 34);

    status_label = lv_label_create(root);
    lv_label_set_text(status_label, hr_device ? "Ready" : "Sensor unavailable");
    lv_obj_set_style_text_color(status_label, lv_color_hex(hr_device ? 0xB978E8 : 0xD69A54), 0);
    lv_obj_set_style_text_font(status_label, &lv_font_montserrat_14, 0);

    average_label = lv_label_create(root);
    lv_label_set_text(average_label, "Average  --");
    lv_obj_set_style_text_color(average_label, lv_color_white(), 0);
    lv_obj_set_style_text_font(average_label, &lv_font_montserrat_14, 0);

    range_label = lv_label_create(root);
    lv_label_set_text(range_label, "Range  --");
    lv_obj_set_style_text_color(range_label, lv_color_hex(HR_MUTED), 0);
    lv_obj_set_style_text_font(range_label, &lv_font_montserrat_14, 0);

    lv_obj_t *measure_button = lv_btn_create(root);
    lv_obj_set_size(measure_button, LV_HOR_RES_MAX - 64, 48);
    lv_obj_set_style_bg_color(measure_button, lv_color_hex(0x8B4CC2), 0);
    lv_obj_set_style_radius(measure_button, 24, 0);
    measure_button_label = lv_label_create(measure_button);
    lv_label_set_text(measure_button_label, hr_device ? "Start" : "Unavailable");
    lv_obj_center(measure_button_label);
    lv_obj_add_event_cb(measure_button, measure_button_cb, LV_EVENT_CLICKED, NULL);
    if (!hr_device)
    {
        lv_obj_add_state(measure_button, LV_STATE_DISABLED);
        lv_obj_set_style_bg_color(measure_button, lv_color_hex(0x45434A), LV_PART_MAIN);
    }

    lv_obj_t *reset = lv_btn_create(root);
    lv_obj_set_size(reset, LV_HOR_RES_MAX - 64, 42);
    lv_obj_set_style_bg_color(reset, lv_color_hex(HR_CARD), 0);
    lv_obj_set_style_radius(reset, 21, 0);
    lv_obj_t *reset_label = lv_label_create(reset);
    lv_label_set_text(reset_label, "Reset session");
    lv_obj_set_style_text_color(reset_label, lv_color_white(), 0);
    lv_obj_center(reset_label);
    lv_obj_add_event_cb(reset, reset_button_cb, LV_EVENT_CLICKED, NULL);

    if (!measure_timer)
        measure_timer = lv_timer_create(measure_timer_cb, 1000, NULL);
}

static void on_start(void)
{
    cust_trans_anim_config(CUST_ANIM_TYPE_3, NULL);
    heartrate_ui_init(lv_scr_act());
}

static void on_stop(void)
{
    if (measure_timer)
    {
        lv_timer_del(measure_timer);
        measure_timer = NULL;
    }
    measuring = false;
    hr_device = RT_NULL;
    bpm_label = NULL;
    status_label = NULL;
    average_label = NULL;
    range_label = NULL;
    measure_button_label = NULL;
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

BUILTIN_APP_EXPORT(LV_EXT_STR_ID(HeartRate),
                   LV_EXT_IMG_GET(img_red_heart), APP_ID, app_main);
