#include <rtthread.h>
#include <dfs_fs.h>
#include <windows.h>
#include "gui_app_fwk.h"
#include "littlevgl2rtt.h"
#include "lv_ex_data.h"
#include "lv_ext_resource_manager.h"
#include "lv_freetype.h"
#include "utils/gl_styles.h"

static void boot_splash_set_opa(void *obj, int32_t opa)
{
    lv_obj_t *splash = (lv_obj_t *)obj;
    lv_obj_set_style_bg_opa(splash, (lv_opa_t)opa, 0);
    /* LVGL does not inherit opacity to normal children. */
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

    /* Lightweight vector plum mark; no extra image asset or framebuffer. */
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

    lv_anim_t fade;
    lv_anim_init(&fade);
    lv_anim_set_var(&fade, splash);
    lv_anim_set_exec_cb(&fade, boot_splash_set_opa);
    lv_anim_set_values(&fade, LV_OPA_COVER, LV_OPA_TRANSP);
    lv_anim_set_delay(&fade, 900);
    lv_anim_set_time(&fade, 420);
    lv_anim_set_path_cb(&fade, lv_anim_path_ease_out);
    lv_anim_set_ready_cb(&fade, boot_splash_delete);
    lv_anim_start(&fade);
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
