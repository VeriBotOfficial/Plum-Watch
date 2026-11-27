#include <rtdevice.h>
#include "app_mem.h"
#include "drv_lcd.h"
#include "gui_app_fwk.h"
#include "littlevgl2rtt.h"
#include "log.h"
#include "lv_ex_data.h"
#include "lv_ext_resource_manager.h"
#include "lv_freetype.h"
#include "perf/btn_perf.h"
#include "flashdb/fdb.h"
#include "utils/datetime_utils.h"
#include "utils/config_utils.h"
#include "utils/custom_trans_anim.h"
#include "perf/vibrator_perf.h"
#include "perf/crown_pref.h"
#include "utils/gl_styles.h"

#define APP_WATCH_GUI_TASK_STACK_SIZE 16 * 1024
#define LCD_DEVICE_NAME "lcd"

static struct rt_thread watch_thread;
static rt_device_t lcd_device;

ALIGN(RT_ALIGN_SIZE)
static uint8_t watch_thread_stack[APP_WATCH_GUI_TASK_STACK_SIZE];

#define WATCHFACE_APP_NAME "Watchface"
#define MENU_APP_NAME "MainMenu"

static void boot_splash_set_opa(void *obj, int32_t opa)
{
    lv_obj_t *splash = (lv_obj_t *)obj;
    lv_obj_set_style_bg_opa(splash, (lv_opa_t)opa, 0);
    /* LVGL object opacity is not inherited by ordinary child objects. */
    for (uint32_t i = 0; i < 3; ++i)
    {
        lv_obj_t *part = lv_obj_get_child(splash, (int32_t)i);
        if (part)
            lv_obj_set_style_bg_opa(part, (lv_opa_t)opa, 0);
    }
}

static void boot_splash_delete(lv_anim_t *anim)
{
    lv_obj_t *splash = (lv_obj_t *)anim->var;
    if (splash)
        lv_obj_del(splash);
}

static void boot_splash_show(void)
{
    lv_obj_t *splash = lv_obj_create(lv_layer_top());
    lv_obj_set_size(splash, LV_HOR_RES_MAX, LV_VER_RES_MAX);
    lv_obj_set_pos(splash, 0, 0);
    lv_obj_set_style_bg_color(splash, lv_color_black(), 0);
    lv_obj_set_style_bg_opa(splash, LV_OPA_COVER, 0);
    lv_obj_set_style_border_width(splash, 0, 0);
    lv_obj_set_style_radius(splash, 0, 0);
    lv_obj_clear_flag(splash, LV_OBJ_FLAG_SCROLLABLE | LV_OBJ_FLAG_CLICKABLE);

    /* Small vector plum mark: no bitmap or intermediate framebuffer required. */
    lv_obj_t *berry_left = lv_obj_create(splash);
    lv_obj_set_size(berry_left, 34, 38);
    lv_obj_set_pos(berry_left, (LV_HOR_RES_MAX / 2) - 30, (LV_VER_RES_MAX / 2) - 15);
    lv_obj_set_style_bg_color(berry_left, lv_color_hex(0x873DB5), 0);
    lv_obj_set_style_bg_opa(berry_left, LV_OPA_COVER, 0);
    lv_obj_set_style_border_width(berry_left, 0, 0);
    lv_obj_set_style_radius(berry_left, LV_RADIUS_CIRCLE, 0);

    lv_obj_t *berry_right = lv_obj_create(splash);
    lv_obj_set_size(berry_right, 34, 38);
    lv_obj_set_pos(berry_right, (LV_HOR_RES_MAX / 2) - 4, (LV_VER_RES_MAX / 2) - 15);
    lv_obj_set_style_bg_color(berry_right, lv_color_hex(0xA95BD4), 0);
    lv_obj_set_style_bg_opa(berry_right, LV_OPA_COVER, 0);
    lv_obj_set_style_border_width(berry_right, 0, 0);
    lv_obj_set_style_radius(berry_right, LV_RADIUS_CIRCLE, 0);

    lv_obj_t *leaf = lv_obj_create(splash);
    lv_obj_set_size(leaf, 23, 10);
    lv_obj_set_pos(leaf, (LV_HOR_RES_MAX / 2) + 1, (LV_VER_RES_MAX / 2) - 29);
    lv_obj_set_style_bg_color(leaf, lv_color_hex(0x75B85B), 0);
    lv_obj_set_style_bg_opa(leaf, LV_OPA_COVER, 0);
    lv_obj_set_style_border_width(leaf, 0, 0);
    lv_obj_set_style_radius(leaf, LV_RADIUS_CIRCLE, 0);

    uint32_t duration = 5000U + (rt_tick_get() % 3001U);
    lv_anim_t fade;
    lv_anim_init(&fade);
    lv_anim_set_var(&fade, splash);
    lv_anim_set_exec_cb(&fade, boot_splash_set_opa);
    lv_anim_set_values(&fade, LV_OPA_COVER, LV_OPA_TRANSP);
    lv_anim_set_delay(&fade, duration - 450U);
    lv_anim_set_time(&fade, 450U);
    lv_anim_set_ready_cb(&fade, boot_splash_delete);
    lv_anim_start(&fade);
}

#ifdef BSP_KEY1_ACTIVE_HIGH
    #define DOWN_BUTTON_ACTIVE_POL 1
#else
    #define DOWN_BUTTON_ACTIVE_POL 0
#endif

#ifdef BSP_KEY2_ACTIVE_HIGH
    #define CROWN_BUTTON_ACTIVE_POL 1
#else
    #define CROWN_BUTTON_ACTIVE_POL 0
#endif

#define BSP_KEY3_PIN 25
#define LEFT_BUTTON_ACTIVE_POL 1

static void on_down_btn_callback(button_action_t event)
{
    if (event == BUTTON_PRESSED)
    {
        if (gui_app_is_actived(WATCHFACE_APP_NAME))
        {
            gui_app_run(MENU_APP_NAME);
        }
        else if (gui_app_is_actived(MENU_APP_NAME))
        {
            gui_app_run(WATCHFACE_APP_NAME);
        }
        else
        {
            gui_app_goback();
        }
    }
}

static void on_left_btn_callback(button_action_t event)
{
    if (event == BUTTON_PRESSED)
    {
        rt_kprintf("Button Left pressed");
    }
}

static void on_crown_btn_callback(button_action_t event)
{
    if (event == BUTTON_PRESSED)
    {
        rt_kprintf("Crown Button Pressed");
    }
}

static void app_watch_entry()
{
    lcd_device = rt_device_find(LCD_DEVICE_NAME);
    rt_err_t r = littlevgl2rtt_init(LCD_DEVICE_NAME);
    RT_ASSERT(RT_EOK == r);

    vibrator_buzz(200);

    lv_ex_data_pool_init();
    resource_init();
    lv_freetype_open_font(true);

    int down_btn_id = perf_button_register(BSP_KEY1_PIN, DOWN_BUTTON_ACTIVE_POL);
    perf_button_add_trigger(down_btn_id, on_down_btn_callback);

    int crown_btn_id = perf_button_register(BSP_KEY2_PIN, CROWN_BUTTON_ACTIVE_POL);
    perf_button_add_trigger(crown_btn_id, on_crown_btn_callback);

    int left_btn_id = perf_button_register(BSP_KEY3_PIN, LEFT_BUTTON_ACTIVE_POL);
    perf_button_add_trigger(left_btn_id, on_left_btn_callback);

    crown_init();
    gs_init();
    load_configurations(lcd_device);

    gui_app_init();
    gui_app_run(WATCHFACE_APP_NAME);

    lv_disp_trig_activity(NULL);
    boot_splash_show();
    lvsf_gesture_init(lv_layer_top());

    int ms_delay = 0;

    while (1)
    {
        ms_delay = lv_timer_handler();

        if (ms_delay > 0)
            rt_thread_mdelay(ms_delay);
    }
}

int app_watch_init(void)
{
    rt_err_t ret = RT_EOK;
    rt_thread_t thread = RT_NULL;

    ret = rt_thread_init(&watch_thread, "app_watch", app_watch_entry, RT_NULL,
                         watch_thread_stack, APP_WATCH_GUI_TASK_STACK_SIZE,
                         RT_THREAD_PRIORITY_MIDDLE, RT_THREAD_TICK_DEFAULT);
    if (RT_EOK != ret)
        return RT_ERROR;

    rt_thread_startup(&watch_thread);

    return RT_EOK;
}

INIT_APP_EXPORT(app_watch_init);