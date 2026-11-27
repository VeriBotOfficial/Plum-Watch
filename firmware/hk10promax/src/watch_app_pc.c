#include <rtthread.h>
#include "gui_app_fwk.h"
#include "littlevgl2rtt.h"
#include "lv_ex_data.h"
#include "lv_ext_resource_manager.h"
#include "lv_freetype.h"
#include "utils/gl_styles.h"

#define APP_WATCH_GUI_TASK_STACK_SIZE (16 * 1024)
#define LCD_DEVICE_NAME "lcd"
#define WATCHFACE_APP_NAME "Watchface"

static struct rt_thread watch_thread;
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
    lvsf_gesture_init(lv_layer_top());

    while (1)
    {
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

INIT_APP_EXPORT(app_watch_init);
