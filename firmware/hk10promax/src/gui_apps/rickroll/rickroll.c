#include "rtconfig.h"
#include <time.h>
#include "lvsf.h"
#include <lv_ext_resource_manager.h>
#include <rtthread.h>
#include "gui_app_fwk.h"
#include "littlevgl2rtt.h"
#include "custom_trans_anim.h"
#include "agif.h"

#ifndef BSP_USING_PC_SIMULATOR
LV_IMG_DECLARE(Rickroll_gif);
#endif
LV_IMG_DECLARE(Rickroll_icon);

#define APP_ID "Rickroll"

static lv_obj_t *gif;

static void gif_loop_end_func(void)
{
}

#ifndef BSP_USING_PC_SIMULATOR
static void gif_resume(void)
{
    if (gif)
        lv_gif_dec_task_resume(gif);
}

static void gif_pause(void)
{
    if (gif)
        lv_gif_dec_task_pause(gif, 0);
}
#endif

static void gif_init(lv_obj_t *parent)
{
#ifdef BSP_USING_PC_SIMULATOR
    /* The SDK simulator image builder accepts PNG, not the watch GIF resource. */
    gif = lv_img_create(parent);
    lv_img_set_src(gif, LV_EXT_IMG_GET(Rickroll_icon));
    lv_obj_center(gif);
#else
    lv_color_t bg_color;
    gif = lv_gif_dec_create(parent, LV_EXT_IMG_GET(Rickroll_gif),
                            &bg_color, LV_COLOR_DEPTH);
    RT_ASSERT(gif);

    lv_obj_align(gif, LV_ALIGN_CENTER, 0, 0);
    lv_gif_dec_loop(gif, 1, 33);
    lv_gif_dec_end_cb_register(gif, gif_loop_end_func);
#endif
}

static void gif_deinit(void)
{
    if (gif)
    {
#ifdef BSP_USING_PC_SIMULATOR
        lv_obj_del(gif);
#else
        lv_gif_dec_destroy(gif);
#endif
        gif = NULL;
    }
}

static void on_start(void)
{
    cust_trans_anim_config(CUST_ANIM_TYPE_3, NULL);

    lv_obj_t *scr = lv_scr_act();
    gif_init(scr);
}

static void on_resume(void)
{
}

static void on_pause(void)
{
    gif_deinit();
}

static void on_stop(void)
{
    gif_deinit();
}

static void msg_handler(gui_app_msg_type_t msg, void *param)
{
    rt_thread_t self = rt_thread_self();
    rt_kprintf("--------------------------------------[MSG] %d on thread: %s\n", msg, self ? self->name : "NULL");

    switch (msg)
    {
    case GUI_APP_MSG_ONSTART:
        on_start();
        break;

    case GUI_APP_MSG_ONRESUME:
        on_resume();
        break;

    case GUI_APP_MSG_ONPAUSE:
        on_pause();
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

BUILTIN_APP_EXPORT(LV_EXT_STR_ID(WatchfaceString),
                   LV_EXT_IMG_GET(Rickroll_icon), APP_ID, app_main);