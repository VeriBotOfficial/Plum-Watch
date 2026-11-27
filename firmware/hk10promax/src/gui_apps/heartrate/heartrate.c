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
#if defined(BSP_USING_PC_SIMULATOR)
    /* The Windows simulator has no physical heart-rate sensor device. */
    return RT_NULL;
#else
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
#endif
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
#if defined(BSP_USING_PC_SIMULATOR)
    /* Keep the UI timer valid without compiling hardware-only sensor types. */
    if (measuring && status_label)
        lv_label_set_text(status_label, "Sensor unavailable in simulator");
#else
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
#endif
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
    hr_device=find_hr_device(); measuring=false; sample_count=0; bpm_total=0; bpm_min=999; bpm_max=0;
    lv_obj_t *root=lv_obj_create(parent);
    lv_obj_set_size(root,LV_HOR_RES_MAX,LV_VER_RES_MAX);
    lv_obj_set_style_bg_color(root,lv_color_black(),0);
    lv_obj_set_style_bg_opa(root,LV_OPA_COVER,0);
    lv_obj_set_style_border_width(root,0,0);
    lv_obj_set_style_pad_all(root,0,0);
    lv_obj_clear_flag(root,LV_OBJ_FLAG_SCROLLABLE);

    lv_obj_t *clock=lv_label_create(root);
    lv_label_set_text(clock,"10:09");
    lv_obj_set_style_text_color(clock,lv_color_white(),0);
    lv_obj_set_style_text_font(clock,&lv_font_montserrat_16,0);
    lv_obj_align(clock,LV_ALIGN_TOP_RIGHT,-22,20);

    lv_obj_t *glow1=lv_obj_create(root);
    lv_obj_set_size(glow1,190,190);
    lv_obj_set_style_radius(glow1,LV_RADIUS_CIRCLE,0);
    lv_obj_set_style_bg_color(glow1,lv_color_hex(0x8D0808),0);
    lv_obj_set_style_bg_opa(glow1,LV_OPA_20,0);
    lv_obj_set_style_border_width(glow1,0,0);
    lv_obj_align(glow1,LV_ALIGN_TOP_MID,0,36);
    lv_obj_clear_flag(glow1,LV_OBJ_FLAG_CLICKABLE|LV_OBJ_FLAG_SCROLLABLE);

    lv_obj_t *glow2=lv_obj_create(root);
    lv_obj_set_size(glow2,148,148);
    lv_obj_set_style_radius(glow2,LV_RADIUS_CIRCLE,0);
    lv_obj_set_style_bg_color(glow2,lv_color_hex(0xB30B0B),0);
    lv_obj_set_style_bg_opa(glow2,LV_OPA_30,0);
    lv_obj_set_style_border_width(glow2,0,0);
    lv_obj_align_to(glow2,glow1,LV_ALIGN_CENTER,0,0);
    lv_obj_clear_flag(glow2,LV_OBJ_FLAG_CLICKABLE|LV_OBJ_FLAG_SCROLLABLE);

    lv_obj_t *heart=lv_img_create(root);
    lv_img_set_src(heart,LV_EXT_IMG_GET(img_red_heart));
    lv_obj_set_size(heart,112,112);
    lv_obj_align_to(heart,glow1,LV_ALIGN_CENTER,0,0);

    lv_obj_t *current=lv_label_create(root);
    lv_label_set_text(current,"Current");
    lv_obj_set_style_text_color(current,lv_color_white(),0);
    lv_obj_set_style_text_font(current,&lv_font_montserrat_16,0);
    lv_obj_align(root,LV_ALIGN_TOP_LEFT,0,0);
    lv_obj_align(current,LV_ALIGN_BOTTOM_LEFT,22,-105);

    bpm_label=lv_label_create(root);
    lv_label_set_text(bpm_label,"--");
    lv_obj_set_style_text_color(bpm_label,lv_color_white(),0);
    lv_obj_set_style_text_font(bpm_label,&lv_font_montserrat_36,0);
    lv_obj_align(bpm_label,LV_ALIGN_BOTTOM_LEFT,22,-58);

    lv_obj_t *unit=lv_label_create(root);
    lv_label_set_text(unit,"BPM");
    lv_obj_set_style_text_color(unit,lv_color_hex(0xFF503D),0);
    lv_obj_set_style_text_font(unit,&lv_font_montserrat_16,0);
    lv_obj_align(unit,LV_ALIGN_BOTTOM_LEFT,90,-66);

    status_label=lv_label_create(root);
    lv_label_set_text(status_label,hr_device?"Ready":"Sensor unavailable");
    lv_obj_set_style_text_color(status_label,lv_color_hex(HR_MUTED),0);
    lv_obj_set_style_text_font(status_label,&lv_font_montserrat_14,0);
    lv_obj_align(status_label,LV_ALIGN_BOTTOM_LEFT,22,-32);

    average_label=lv_label_create(root);
    lv_label_set_text(average_label,"Average  --");
    lv_obj_set_style_text_color(average_label,lv_color_hex(HR_MUTED),0);
    lv_obj_set_style_text_font(average_label,&lv_font_montserrat_12,0);
    lv_obj_align(average_label,LV_ALIGN_BOTTOM_LEFT,22,-10);
    range_label=NULL;

    lv_obj_t *measure=lv_btn_create(root);
    lv_obj_set_size(measure,LV_HOR_RES_MAX-44,38);
    lv_obj_align(measure,LV_ALIGN_BOTTOM_MID,0,-2);
    lv_obj_set_style_bg_color(measure,lv_color_hex(0x292A2E),0);
    lv_obj_set_style_radius(measure,19,0);
    measure_button_label=lv_label_create(measure);
    lv_label_set_text(measure_button_label,hr_device?"Start measurement":"Unavailable");
    lv_obj_center(measure_button_label);
    lv_obj_add_event_cb(measure,measure_button_cb,LV_EVENT_CLICKED,NULL);
    if(!hr_device) lv_obj_add_state(measure,LV_STATE_DISABLED);

    if(!measure_timer) measure_timer=lv_timer_create(measure_timer_cb,1000,NULL);
}

static void on_start(void)
{
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
