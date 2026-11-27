#include "rtconfig.h"
#include <stdio.h>
#include <time.h>
#include "lvsf.h"
#include <lv_ext_resource_manager.h>
#include <rtthread.h>
#include "gui_app_fwk.h"
#include "littlevgl2rtt.h"
#include "custom_trans_anim.h"

LV_IMG_DECLARE(img_stopwatch);

#define APP_ID "Stopwatch"

#define MAX_LAPS 5

static lv_obj_t *time_label;
static lv_obj_t *btn_start_pause;
static lv_obj_t *btn_start_pause_label;
static lv_obj_t *lap_list;
static lv_timer_t *timer = NULL;

static uint32_t total_ms = 0;
static rt_tick_t last_tick = 0;
static bool is_running = false;
static uint32_t laps[MAX_LAPS];
static uint8_t lap_count = 0;
static uint32_t last_lap_ms = 0;
static lv_timer_t *clock_timer = NULL;

static void stopwatch_clock_cb(lv_timer_t *timer)
{
    if (!timer || !timer->user_data) return;
    time_t now = time(RT_NULL);
    struct tm *local = localtime(&now);
    if (!local) return;
    char text[8];
    snprintf(text, sizeof(text), "%02d:%02d", local->tm_hour, local->tm_min);
    lv_label_set_text((lv_obj_t *)timer->user_data, text);
}

static void update_time_display(void)
{
    uint32_t hundredths = (total_ms % 1000) / 10;
    uint32_t seconds = (total_ms / 1000) % 60;
    uint32_t minutes = (total_ms / 60000) % 60;

    char buf[16];
    snprintf(buf, sizeof(buf), "%02lu:%02lu.%02lu", (unsigned long)minutes, (unsigned long)seconds, (unsigned long)hundredths);
    if (time_label)
    {
        lv_label_set_text(time_label, buf);
    }
}

static void timer_cb(lv_timer_t *t)
{
    if (is_running)
    {
        rt_tick_t now = rt_tick_get();
        rt_tick_t elapsed_ticks = now - last_tick;
        last_tick = now;
        total_ms += (uint32_t)(((uint64_t)elapsed_ticks * 1000ULL) / RT_TICK_PER_SECOND);
        update_time_display();
    }
}

static void update_lap_list_ui(void)
{
    if (!lap_list) return;

    lv_obj_clean(lap_list);
    for (int i = lap_count - 1; i >= 0; i--)
    {
        uint32_t ms = laps[i];
        uint32_t hundredths = (ms % 1000) / 10;
        uint32_t seconds = (ms / 1000) % 60;
        uint32_t minutes = (ms / 60000) % 60;

        char buf[32];
        snprintf(buf, sizeof(buf), "Lap %d    %02lu:%02lu.%02lu", i + 1, (unsigned long)minutes, (unsigned long)seconds, (unsigned long)hundredths);

        lv_obj_t *item = lv_list_add_btn(lap_list, NULL, buf);
        lv_obj_set_style_bg_color(item, lv_color_hex(0x1B1D22), 0);
        lv_obj_set_style_text_color(item, lv_color_white(), 0);
    }
}

static void btn_start_pause_cb(lv_event_t *e)
{
    is_running = !is_running;
    if (is_running)
        last_tick = rt_tick_get();
    if (is_running)
    {
        lv_label_set_text(btn_start_pause_label, "Pause");
        lv_obj_set_style_bg_color(btn_start_pause, lv_color_hex(is_running ? 0xD94A45 : 0x239B62), 0);
    }
    else
    {
        lv_label_set_text(btn_start_pause_label, "Start");
        lv_obj_set_style_bg_color(btn_start_pause, lv_color_hex(0xA45BE0), 0);
    }
}

static void btn_lap_reset_cb(lv_event_t *e)
{
    if (is_running)
    {
        /* Record Lap */
        if (lap_count < MAX_LAPS)
        {
            laps[lap_count++] = total_ms - last_lap_ms;
            last_lap_ms = total_ms;
            update_lap_list_ui();
        }
    }
    else
    {
        /* Reset Timer & Laps */
        total_ms = 0;
        last_lap_ms = 0;
        last_tick = rt_tick_get();
        lap_count = 0;
        update_time_display();
        if (lap_list) lv_obj_clean(lap_list);
        if (btn_start_pause_label)
        {
            lv_label_set_text(btn_start_pause_label, "Start");
            lv_obj_set_style_bg_color(btn_start_pause, lv_color_hex(0xA45BE0), 0);
        }
    }
}

static void stopwatch_ui_init(lv_obj_t *parent)
{
    lv_obj_t *cont=lv_obj_create(parent);
    lv_obj_set_size(cont,LV_HOR_RES_MAX,LV_VER_RES_MAX);
    lv_obj_set_style_bg_color(cont,lv_color_black(),0);
    lv_obj_set_style_bg_opa(cont,LV_OPA_COVER,0);
    lv_obj_set_style_border_width(cont,0,0);
    lv_obj_set_style_pad_all(cont,0,0);
    lv_obj_clear_flag(cont,LV_OBJ_FLAG_SCROLLABLE);

    lv_obj_t *clock=lv_label_create(cont);
    lv_obj_set_style_text_color(clock,lv_color_white(),0);
    lv_obj_set_style_text_font(clock,&lv_font_montserrat_14,0);
    lv_obj_align(clock,LV_ALIGN_TOP_RIGHT,-20,18);
    if (clock_timer) lv_timer_del(clock_timer);
    clock_timer = lv_timer_create(stopwatch_clock_cb, 60000, clock);
    stopwatch_clock_cb(clock_timer);

    lv_obj_t *title=lv_label_create(cont);
    lv_label_set_text(title,"Stopwatch");
    lv_obj_set_style_text_color(title,lv_color_white(),0);
    lv_obj_set_style_text_font(title,&lv_font_montserrat_20,0);
    lv_obj_align(title,LV_ALIGN_TOP_MID,0,38);

    time_label=lv_label_create(cont);
    lv_obj_set_width(time_label,LV_HOR_RES_MAX-28);
    lv_label_set_long_mode(time_label,LV_LABEL_LONG_CLIP);
    lv_obj_set_style_text_align(time_label,LV_TEXT_ALIGN_CENTER,0);
    lv_obj_align(time_label,LV_ALIGN_TOP_MID,0,92);
    lv_obj_set_style_text_color(time_label,lv_color_white(),0);
    lv_obj_set_style_text_font(time_label,&lv_font_montserrat_36,0);
    lv_label_set_text(time_label,"00:00.00");

    lap_list=lv_list_create(cont);
    lv_obj_set_size(lap_list,LV_HOR_RES_MAX-42,126);
    lv_obj_align(lap_list,LV_ALIGN_TOP_MID,0,165);
    lv_obj_set_style_bg_color(lap_list,lv_color_hex(0x202124),0);
    lv_obj_set_style_border_width(lap_list,0,0);
    lv_obj_set_style_radius(lap_list,22,0);
    lv_obj_set_style_pad_all(lap_list,8,0);
    lv_obj_set_scrollbar_mode(lap_list,LV_SCROLLBAR_MODE_OFF);

    btn_start_pause=lv_btn_create(cont);
    lv_obj_set_size(btn_start_pause,LV_HOR_RES_MAX/2-28,48);
    lv_obj_align(btn_start_pause,LV_ALIGN_BOTTOM_LEFT,18,-20);
    lv_obj_set_style_bg_color(btn_start_pause,lv_color_hex(0x239B62),0);
    lv_obj_set_style_bg_color(btn_start_pause,lv_color_hex(0x2DAD70),LV_PART_MAIN | LV_STATE_PRESSED);
    lv_obj_set_style_transition_time(btn_start_pause,100,LV_PART_MAIN);
    lv_obj_set_style_radius(btn_start_pause,24,0);
    lv_obj_set_style_shadow_width(btn_start_pause,0,0);
    lv_obj_add_event_cb(btn_start_pause,btn_start_pause_cb,LV_EVENT_CLICKED,NULL);
    btn_start_pause_label=lv_label_create(btn_start_pause);
    lv_label_set_text(btn_start_pause_label,"Start");
    lv_obj_center(btn_start_pause_label);

    lv_obj_t *lap=lv_btn_create(cont);
    lv_obj_set_size(lap,LV_HOR_RES_MAX/2-28,48);
    lv_obj_align(lap,LV_ALIGN_BOTTOM_RIGHT,-18,-20);
    lv_obj_set_style_bg_color(lap,lv_color_hex(0x303136),0);
    lv_obj_set_style_bg_color(lap,lv_color_hex(0x414249),LV_PART_MAIN | LV_STATE_PRESSED);
    lv_obj_set_style_transition_time(lap,100,LV_PART_MAIN);
    lv_obj_set_style_radius(lap,24,0);
    lv_obj_set_style_shadow_width(lap,0,0);
    lv_obj_add_event_cb(lap,btn_lap_reset_cb,LV_EVENT_CLICKED,NULL);
    lv_obj_t *lap_label=lv_label_create(lap);
    lv_label_set_text(lap_label,"Lap / Reset");
    lv_obj_set_style_text_font(lap_label,&lv_font_montserrat_14,0);
    lv_obj_center(lap_label);

    if(!timer) timer=lv_timer_create(timer_cb,50,NULL);
}

static void on_start(void)
{
    total_ms = 0;
    is_running = false;
    lap_count = 0;
    last_lap_ms = 0;
    last_tick = rt_tick_get();
    stopwatch_ui_init(lv_scr_act());
}

static void on_stop(void)
{
    if (timer)
    {
        lv_timer_del(timer);
        timer = NULL;
    }
    if (clock_timer)
    {
        lv_timer_del(clock_timer);
        clock_timer = NULL;
    }
    time_label = NULL;
    lap_list = NULL;
    btn_start_pause = NULL;
    btn_start_pause_label = NULL;
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

BUILTIN_APP_EXPORT(LV_EXT_STR_ID(Stopwatch),
                   LV_EXT_IMG_GET(img_stopwatch), APP_ID, app_main);
