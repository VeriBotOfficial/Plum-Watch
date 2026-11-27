#include <rtthread.h>
#include <dfs_fs.h>
#include <windows.h>
#include "gui_app_fwk.h"
#include "littlevgl2rtt.h"
#include "lv_ex_data.h"
#include "lv_ext_resource_manager.h"

LV_IMG_DECLARE(plum_logo_white);
#include "lv_freetype.h"
#include "utils/gl_styles.h"

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
    lv_img_set_src(logo, LV_EXT_IMG_GET(plum_logo_white));
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

#define APP_WATCH_GUI_TASK_STACK_SIZE (16 * 1024)
#define LCD_DEVICE_NAME "lcd"
#define WATCHFACE_APP_NAME "Watchface"

/* The PC simulator has no physical flash filesystem mount table. */
const struct dfs_mount_tbl mount_table[] = {{ RT_NULL, RT_NULL, RT_NULL, 0, RT_NULL }};

/* The simulator has no physical watchdog peripheral. */
int rt_wdt_init(void)
{
    return RT_EOK;
}

static struct rt_thread watch_thread;
static volatile int pc_escape_requested;

static void pc_poll_escape_key(void)
{
    static int was_down;
    HWND foreground = GetForegroundWindow();
    DWORD foreground_process = 0;

    if (foreground)
        GetWindowThreadProcessId(foreground, &foreground_process);

    /* Ignore key presses when another application owns the foreground. */
    int is_down = foreground_process == GetCurrentProcessId() &&
                  (GetAsyncKeyState(VK_ESCAPE) & 0x8000) != 0;

    if (is_down && !was_down)
        pc_escape_requested = 1;

    was_down = is_down;
}

static void pc_handle_escape(void)
{
    if (gui_app_is_actived("Watchface"))
        return;

    if (gui_app_is_actived("MainMenu"))
        gui_app_run("Watchface");
    else
        gui_app_goback();
}
ALIGN(RT_ALIGN_SIZE)
static uint8_t watch_thread_stack[APP_WATCH_GUI_TASK_STACK_SIZE];

static void app_watch_entry(void *parameter)
{
    rt_err_t result = littlevgl2rtt_init(LCD_DEVICE_NAME);
    if (result != RT_EOK)
    {
        rt_kprintf("[PlumWatch] PC display initialization failed: %d\n", result);
        return;
    }

    lv_ex_data_pool_init();
    resource_init();
    lv_freetype_open_font(true);
    gs_init();

    gui_app_init();
    gui_app_run(WATCHFACE_APP_NAME);

    lv_disp_trig_activity(NULL);
    boot_splash_show();
    lvsf_gesture_init(lv_layer_top());

    while (1)
    {
        pc_poll_escape_key();

        if (pc_escape_requested)
        {
            pc_escape_requested = 0;
            pc_handle_escape();
        }

        int delay = lv_timer_handler();
        if (delay > 0)
            rt_thread_mdelay(delay);
    }
}

int app_watch_init(void)
{
    rt_err_t result = rt_thread_init(
        &watch_thread,
        "app_watch",
        app_watch_entry,
        RT_NULL,
        watch_thread_stack,
        sizeof(watch_thread_stack),
        RT_THREAD_PRIORITY_MIDDLE,
        RT_THREAD_TICK_DEFAULT
    );

    if (result != RT_EOK)
        return result;

    return rt_thread_startup(&watch_thread);
}

int app_main(void)
{
    return app_watch_init();
}
