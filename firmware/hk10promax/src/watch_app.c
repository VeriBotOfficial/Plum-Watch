#include <rtdevice.h>
#include "app_mem.h"
#include "drv_lcd.h"
#include "gui_app_fwk.h"
#include "littlevgl2rtt.h"
#include "log.h"
#include "lv_ex_data.h"
#include "lv_ext_resource_manager.h"

LV_IMG_DECLARE(img_plum_logo_white);
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
    lv_obj_t *logo = lv_obj_get_child(splash, 0);
    if (logo)
        lv_obj_set_style_img_opa(logo, (lv_opa_t)opa, LV_PART_MAIN);
}

static void boot_splash_set_zoom(void *obj, int32_t zoom)
{
    lv_img_set_zoom((lv_obj_t *)obj, (uint16_t)zoom);
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
    lv_obj_set_style_pad_all(splash, 0, 0);
    lv_obj_clear_flag(splash, LV_OBJ_FLAG_SCROLLABLE | LV_OBJ_FLAG_CLICKABLE);

    /* The white Plum mark is compiled with the normal LVGL image resources. */
    lv_obj_t *logo = lv_img_create(splash);
    lv_img_set_src(logo, LV_EXT_IMG_GET(img_plum_logo_white));
    lv_img_set_pivot(logo, 64, 64);
    lv_img_set_zoom(logo, 192);
    lv_obj_align(logo, LV_ALIGN_CENTER, 0, 0);
    lv_obj_set_style_img_opa(logo, LV_OPA_TRANSP, LV_PART_MAIN);

    /* A restrained scale-up and fade-in, followed by a short hold and fade. */
    lv_anim_t zoom;
    lv_anim_init(&zoom);
    lv_anim_set_var(&zoom, logo);
    lv_anim_set_exec_cb(&zoom, boot_splash_set_zoom);
    lv_anim_set_values(&zoom, 192, LV_IMG_ZOOM_NONE);
    lv_anim_set_time(&zoom, 700);
    lv_anim_set_path_cb(&zoom, lv_anim_path_ease_out);
    lv_anim_start(&zoom);

    lv_anim_t fade_in;
    lv_anim_init(&fade_in);
    lv_anim_set_var(&fade_in, splash);
    lv_anim_set_exec_cb(&fade_in, boot_splash_set_opa);
    lv_anim_set_values(&fade_in, LV_OPA_TRANSP, LV_OPA_COVER);
    lv_anim_set_delay(&fade_in, 100);
    lv_anim_set_time(&fade_in, 450);
    lv_anim_set_path_cb(&fade_in, lv_anim_path_ease_out);
    lv_anim_start(&fade_in);

    lv_anim_t fade_out;
    lv_anim_init(&fade_out);
    lv_anim_set_var(&fade_out, splash);
    lv_anim_set_exec_cb(&fade_out, boot_splash_set_opa);
    lv_anim_set_values(&fade_out, LV_OPA_COVER, LV_OPA_TRANSP);
    lv_anim_set_delay(&fade_out, 1700);
    lv_anim_set_time(&fade_out, 450);
    lv_anim_set_path_cb(&fade_out, lv_anim_path_ease_in);
    lv_anim_set_ready_cb(&fade_out, boot_splash_delete);
    lv_anim_start(&fade_out);
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