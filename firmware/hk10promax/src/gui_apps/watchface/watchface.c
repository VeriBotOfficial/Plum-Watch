#include <stdio.h>
#include <time.h>
#include <string.h>
#include <stdint.h>
#include "rtconfig.h"
#include "lvsf.h"
#include <lv_ext_resource_manager.h>
#include <rtthread.h>
#include "gui_app_fwk.h"
#include "littlevgl2rtt.h"
#include "custom_trans_anim.h"

LV_IMG_DECLARE(img_clock);
#define APP_ID "Watchface"
#define WF_BG 0x090A0D
#define WF_PANEL 0x17191F
#define WF_MUTED 0x858A96
#define WF_TEXT 0xF4F5F7
#define WF_ACCENT 0xB78AFF
#define WF_MAX_BG_FRAMES 16

typedef enum
{
    WF_PACKAGE_ANALOG,
    WF_PACKAGE_SPLIT_DIGITAL,
    WF_PACKAGE_BACKGROUND
} watchface_package_type_t;

typedef struct
{
    const char *id;
    const char *name;
    const char *module;
    watchface_package_type_t type;
} watchface_package_t;

/* IDs and module IDs are taken from store/index.json. Layout selection is
 * keyed by the internal module ID, never by the user-facing ZIP filename. */
static const watchface_package_t packages[] = {
    {"21540_4_dial", "21540 Classic", "wf_clock932", WF_PACKAGE_ANALOG},
    {"21541_4_dial", "21541 Classic", "wf_clock933", WF_PACKAGE_ANALOG},
    {"21543_4_dial", "21543 Digital", "wf_clock935", WF_PACKAGE_BACKGROUND},
    {"21553_4_dial", "Blue Liquid", "wf_clock1000", WF_PACKAGE_SPLIT_DIGITAL},
    {"21563_4_dial", "21563 Analog", "wf_clock1004", WF_PACKAGE_ANALOG},
    {"blue-liquid", "Black Liquid", "wf_clock1003", WF_PACKAGE_SPLIT_DIGITAL}
};
#define PACKAGE_COUNT (sizeof(packages) / sizeof(packages[0]))

static lv_obj_t *root;
static lv_obj_t *selector;
static lv_obj_t *background_image;
static lv_obj_t *time_digits[4];
static lv_obj_t *analog_hands[3];
static lv_obj_t *weekday_label;
static lv_obj_t *date_label;
static lv_obj_t *footer_label;
static lv_timer_t *clock_timer;
static lv_timer_t *background_timer;
static uint8_t active_package = 3;
static uint8_t background_frame;
static uint8_t background_frame_count;
static bool selector_open;
static char background_path[160];
static int8_t last_digits[4] = {-1, -1, -1, -1};

static const char *weekdays[] = {
    "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY",
    "THURSDAY", "FRIDAY", "SATURDAY"
};
static const char *months[] = {
    "JAN", "FEB", "MAR", "APR", "MAY", "JUN",
    "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"
};

static bool path_exists(const char *path)
{
    FILE *file = fopen(path, "rb");
    if (!file) return false;
    fclose(file);
    return true;
}

static uint16_t resource_zoom(void)
{
    uint32_t zoom = ((uint32_t)LV_MIN(LV_HOR_RES_MAX, LV_VER_RES_MAX) * 256U) / 494U;
    if (zoom > 256U) zoom = 256U;
    if (zoom < 96U) zoom = 96U;
    return (uint16_t)zoom;
}

static void make_resource_path(char *out, size_t capacity, const char *suffix)
{
    const watchface_package_t *package = &packages[active_package];
    snprintf(out, capacity, "/watchfaces/%s/%s_res_%s",
             package->id, package->module, suffix);
}

static bool set_background_frame(uint8_t frame)
{
    char suffix[32];
    char path[160];

    snprintf(suffix, sizeof(suffix), "bg%u.bin", frame);
    make_resource_path(path, sizeof(path), suffix);
    if (!path_exists(path))
    {
        if (frame != 0) return false;
        make_resource_path(path, sizeof(path), "bg.bin");
        if (!path_exists(path))
        {
            make_resource_path(path, sizeof(path), "bg1.bin");
            if (!path_exists(path)) return false;
        }
    }

    if (background_image)
    {
        lv_img_set_src(background_image, path);
        lv_img_set_zoom(background_image, resource_zoom());
        lv_obj_center(background_image);
        strncpy(background_path, path, sizeof(background_path) - 1);
        background_path[sizeof(background_path) - 1] = '\0';
    }
    return true;
}

static void background_frame_cb(lv_timer_t *timer)
{
    if (!background_image || background_frame_count < 2) return;
    uint8_t next = (uint8_t)((background_frame + 1) % background_frame_count);
    if (set_background_frame(next))
        background_frame = next;
    else
        background_frame_count = (uint8_t)(background_frame + 1);
}

static void update_split_digits(const struct tm *now)
{
    if (!time_digits[0]) return;

    int values[4] = {
        now->tm_hour / 10,
        now->tm_hour % 10,
        now->tm_min / 10,
        now->tm_min % 10
    };
    char path[160];
    uint16_t zoom = resource_zoom();
    lv_coord_t scale_x = (lv_coord_t)((168U * zoom) / 256U);
    lv_coord_t x_offsets[4] = {
        (lv_coord_t)((38U * zoom) / 256U),
        (lv_coord_t)((38U * zoom) / 256U) + scale_x,
        (lv_coord_t)((32U * zoom) / 256U),
        (lv_coord_t)((32U * zoom) / 256U) + scale_x
    };
    lv_coord_t y_offsets[4] = {
        (lv_coord_t)((42U * zoom) / 256U),
        (lv_coord_t)((42U * zoom) / 256U),
        (lv_coord_t)((258U * zoom) / 256U),
        (lv_coord_t)((258U * zoom) / 256U)
    };

    for (int i = 0; i < 4; ++i)
    {
        /* SiFli time_num resources are one-based: 01 is digit zero. */
        snprintf(path, sizeof(path), "/watchfaces/%s/%s_res_time_num_%02d.bin",
                 packages[active_package].id,
                 packages[active_package].module, values[i] + 1);
        if (last_digits[i] != values[i])
        {
            lv_img_set_src(time_digits[i], path);
            last_digits[i] = (int8_t)values[i];
        }
        lv_img_set_zoom(time_digits[i], zoom);
        lv_img_set_pivot(time_digits[i], 0, 0);
        lv_obj_set_pos(time_digits[i], x_offsets[i], y_offsets[i]);
    }
}

static void update_analog_hands(const struct tm *now)
{
    if (!analog_hands[0]) return;

    int16_t angles[3] = {
        (int16_t)(((now->tm_hour % 12) * 300) + (now->tm_min * 5)),
        (int16_t)(now->tm_min * 60 + now->tm_sec),
        (int16_t)(now->tm_sec * 60)
    };
    const char *suffixes[3] = {"h.bin", "m.bin", "s.bin"};
    const uint16_t zoom = resource_zoom();
    const lv_coord_t center_x = LV_HOR_RES_MAX / 2;
    const lv_coord_t center_y = LV_VER_RES_MAX / 2;
    const lv_coord_t pivot_x = (lv_coord_t)((205U * zoom) / 256U);
    const lv_coord_t pivot_y = (lv_coord_t)((435U * zoom) / 256U);

    for (int i = 0; i < 3; ++i)
    {
        lv_img_set_zoom(analog_hands[i], zoom);
        lv_img_set_pivot(analog_hands[i], 205, 435);
        lv_img_set_angle(analog_hands[i], angles[i]);
        lv_obj_set_pos(analog_hands[i], center_x - pivot_x, center_y - pivot_y);
    }
}

static void update_clock_cb(lv_timer_t *timer)
{
    time_t timestamp = time(NULL);
    struct tm *now = localtime(&timestamp);
    if (!now) return;

    if (weekday_label)
        lv_label_set_text(weekday_label, weekdays[now->tm_wday % 7]);
    if (date_label)
    {
        char date[20];
        snprintf(date, sizeof(date), "%s %d", months[now->tm_mon % 12], now->tm_mday);
        lv_label_set_text(date_label, date);
    }

    if (packages[active_package].type == WF_PACKAGE_ANALOG)
        update_analog_hands(now);
    else if (packages[active_package].type == WF_PACKAGE_SPLIT_DIGITAL)
        update_split_digits(now);
}

static void open_menu_cb(lv_event_t *event)
{
    lv_point_t center = {LV_HOR_RES_MAX / 2, LV_VER_RES_MAX / 2};
    cust_trans_anim_config(CUST_ANIM_TYPE_3, &center);
    gui_app_run("MainMenu");
}

static void clear_face_objects(void)
{
    background_image = NULL;
    weekday_label = NULL;
    date_label = NULL;
    footer_label = NULL;
    for (int i = 0; i < 4; ++i) { time_digits[i] = NULL; last_digits[i] = -1; }
    for (int i = 0; i < 3; ++i) analog_hands[i] = NULL;
}

static void build_package_face(void)
{
    const watchface_package_t *package = &packages[active_package];
    char path[160];
    uint16_t zoom = resource_zoom();

    background_image = lv_img_create(root);
    if (!set_background_frame(0))
    {
        lv_obj_del(background_image);
        background_image = NULL;
        return;
    }

    /* The module's resource table uses 410x494 logical coordinates. */
    if (package->type == WF_PACKAGE_SPLIT_DIGITAL)
    {
        for (int i = 0; i < 4; ++i)
        {
            time_digits[i] = lv_img_create(root);
            lv_obj_clear_flag(time_digits[i], LV_OBJ_FLAG_CLICKABLE);
            last_digits[i] = -1;
        }
    }
    else if (package->type == WF_PACKAGE_ANALOG)
    {
        for (int i = 0; i < 3; ++i)
        {
            analog_hands[i] = lv_img_create(root);
            lv_obj_clear_flag(analog_hands[i], LV_OBJ_FLAG_CLICKABLE);
            make_resource_path(path, sizeof(path), i == 0 ? "h.bin" : (i == 1 ? "m.bin" : "s.bin"));
            lv_img_set_src(analog_hands[i], path);
        }
    }

    weekday_label = lv_label_create(root);
    lv_label_set_text(weekday_label, "MONDAY");
    lv_obj_set_style_text_color(weekday_label, lv_color_hex(WF_TEXT), 0);
    lv_obj_set_style_text_font(weekday_label, &lv_font_montserrat_12, 0);
    lv_obj_align(weekday_label, LV_ALIGN_TOP_MID, 0, 12);

    date_label = lv_label_create(root);
    lv_label_set_text(date_label, "JAN 01");
    lv_obj_set_style_text_color(date_label, lv_color_hex(WF_TEXT), 0);
    lv_obj_set_style_text_font(date_label, &lv_font_montserrat_16, 0);
    lv_obj_align(date_label, LV_ALIGN_BOTTOM_MID, 0, -18);

    footer_label = lv_label_create(root);
    lv_label_set_text(footer_label, package->name);
    lv_obj_set_style_text_color(footer_label, lv_color_hex(WF_MUTED), 0);
    lv_obj_set_style_text_font(footer_label, &lv_font_montserrat_12, 0);
    lv_obj_align(footer_label, LV_ALIGN_BOTTOM_MID, 0, -40);

    if (package->type == WF_PACKAGE_SPLIT_DIGITAL)
    {
        /* Clock glyph placement recovered from wf_clock1000 and wf_clock1003. */
        update_clock_cb(NULL);
    }
    else if (package->type == WF_PACKAGE_ANALOG)
    {
        /* Native hand sprites share the verified 410x494 dial pivot. */
        update_clock_cb(NULL);
    }

    /* Animated EZIP backgrounds are advanced at a restrained frame rate.
     * Stop at the first missing frame instead of probing arbitrary resources. */
    background_frame = 0;
    background_frame_count = 1;
    for (uint8_t frame = 1; frame < WF_MAX_BG_FRAMES; ++frame)
    {
        char suffix[32];
        snprintf(suffix, sizeof(suffix), "bg%u.bin", frame);
        make_resource_path(path, sizeof(path), suffix);
        if (!path_exists(path)) break;
        background_frame_count++;
    }
    if (background_frame_count > 1)
    {
        if (background_timer) lv_timer_del(background_timer);
        background_timer = lv_timer_create(background_frame_cb, 180, NULL);
    }
    (void)zoom;
}

static void face_transition(void)
{
    if (!root) return;
    if (background_timer)
    {
        lv_timer_del(background_timer);
        background_timer = NULL;
    }
    lv_obj_clean(root);
    clear_face_objects();
    build_package_face();
    update_clock_cb(NULL);
}

static void package_button_cb(lv_event_t *event)
{
    uint8_t selected = (uint8_t)(uintptr_t)lv_event_get_user_data(event);
    if (selected >= PACKAGE_COUNT) return;
    active_package = selected;

    if (selector)
    {
        lv_obj_del(selector);
        selector = NULL;
    }
    selector_open = false;
    face_transition();
}

static void add_package_button(lv_obj_t *parent, uint8_t index, lv_coord_t y)
{
    lv_obj_t *button = lv_btn_create(parent);
    lv_obj_set_size(button, LV_HOR_RES_MAX - 52, 48);
    lv_obj_set_pos(button, 0, y);
    lv_obj_set_style_bg_color(button, lv_color_hex(WF_PANEL), 0);
    lv_obj_set_style_bg_opa(button, LV_OPA_COVER, 0);
    lv_obj_set_style_border_width(button, index == active_package ? 1 : 0, 0);
    lv_obj_set_style_border_color(button, lv_color_hex(WF_ACCENT), 0);
    lv_obj_set_style_radius(button, 14, 0);
    lv_obj_set_style_shadow_width(button, 0, 0);

    lv_obj_t *name = lv_label_create(button);
    lv_label_set_text(name, packages[index].name);
    lv_obj_set_style_text_color(name, lv_color_hex(WF_TEXT), 0);
    lv_obj_set_style_text_font(name, &lv_font_montserrat_16, 0);
    lv_obj_align(name, LV_ALIGN_LEFT_MID, 12, 0);

    lv_obj_add_event_cb(button, package_button_cb, LV_EVENT_CLICKED,
                        (void *)(uintptr_t)index);
}

static void selector_opa_exec(void *object, int32_t opa)
{
    lv_obj_set_style_opa((lv_obj_t *)object, (lv_opa_t)opa, 0);
}

static void show_selector(void)
{
    if (selector_open || !root) return;
    selector_open = true;

    selector = lv_obj_create(root);
    lv_obj_set_size(selector, LV_HOR_RES_MAX, LV_VER_RES_MAX);
    lv_obj_set_pos(selector, 0, 0);
    lv_obj_set_style_bg_color(selector, lv_color_hex(WF_BG), 0);
    lv_obj_set_style_bg_opa(selector, LV_OPA_COVER, 0);
    lv_obj_set_style_border_width(selector, 0, 0);
    lv_obj_set_style_radius(selector, 0, 0);
    lv_obj_set_style_pad_all(selector, 0, 0);
    lv_obj_set_style_pad_row(selector, 8, 0);
    lv_obj_set_scroll_dir(selector, LV_DIR_VER);
    lv_obj_set_scrollbar_mode(selector, LV_SCROLLBAR_MODE_AUTO);

    lv_obj_t *eyebrow = lv_label_create(selector);
    lv_label_set_text(eyebrow, "YOUR LIBRARY");
    lv_obj_set_style_text_color(eyebrow, lv_color_hex(WF_ACCENT), 0);
    lv_obj_set_style_text_font(eyebrow, &lv_font_montserrat_12, 0);
    lv_obj_align(eyebrow, LV_ALIGN_TOP_MID, 0, 26);

    lv_obj_t *heading = lv_label_create(selector);
    lv_label_set_text(heading, "Watch faces");
    lv_obj_set_style_text_color(heading, lv_color_hex(WF_TEXT), 0);
    lv_obj_set_style_text_font(heading, &lv_font_montserrat_20, 0);
    lv_obj_align(heading, LV_ALIGN_TOP_MID, 0, 48);

    lv_obj_t *list = lv_obj_create(selector);
    lv_obj_set_size(list, LV_HOR_RES_MAX - 32, LV_VER_RES_MAX - 116);
    lv_obj_align(list, LV_ALIGN_TOP_MID, 0, 88);
    lv_obj_set_style_bg_opa(list, LV_OPA_TRANSP, 0);
    lv_obj_set_style_border_width(list, 0, 0);
    lv_obj_set_style_pad_all(list, 0, 0);
    lv_obj_set_style_pad_row(list, 8, 0);
    lv_obj_set_flex_flow(list, LV_FLEX_FLOW_COLUMN);
    lv_obj_set_scroll_dir(list, LV_DIR_VER);
    lv_obj_set_scrollbar_mode(list, LV_SCROLLBAR_MODE_AUTO);

    for (uint8_t i = 0; i < PACKAGE_COUNT; ++i)
        add_package_button(list, i, 0);

    lv_anim_t anim;
    lv_anim_init(&anim);
    lv_anim_set_var(&anim, selector);
    lv_anim_set_exec_cb(&anim, selector_opa_exec);
    lv_anim_set_values(&anim, LV_OPA_TRANSP, LV_OPA_COVER);
    lv_anim_set_time(&anim, 240);
    lv_anim_set_path_cb(&anim, lv_anim_path_ease_out);
    lv_anim_start(&anim);
}

static void root_event_cb(lv_event_t *event)
{
    lv_event_code_t code = lv_event_get_code(event);
    if (code == LV_EVENT_LONG_PRESSED)
        show_selector();
    else if (code == LV_EVENT_CLICKED && !selector_open)
        open_menu_cb(event);
}

static void watchface_ui_init(lv_obj_t *parent)
{
    root = lv_obj_create(parent);
    lv_obj_set_size(root, LV_HOR_RES_MAX, LV_VER_RES_MAX);
    lv_obj_set_pos(root, 0, 0);
    lv_obj_set_style_bg_color(root, lv_color_hex(WF_BG), 0);
    lv_obj_set_style_bg_opa(root, LV_OPA_COVER, 0);
    lv_obj_set_style_border_width(root, 0, 0);
    lv_obj_set_style_radius(root, 0, 0);
    lv_obj_set_style_pad_all(root, 0, 0);
    lv_obj_clear_flag(root, LV_OBJ_FLAG_SCROLLABLE);
    lv_obj_add_flag(root, LV_OBJ_FLAG_CLICKABLE);
    lv_obj_add_event_cb(root, root_event_cb, LV_EVENT_ALL, NULL);

    build_package_face();
    if (!background_image)
    {
        lv_obj_t *fallback = lv_label_create(root);
        lv_label_set_text(fallback, "Watchface resources unavailable");
        lv_obj_set_style_text_color(fallback, lv_color_hex(WF_TEXT), 0);
        lv_obj_set_style_text_font(fallback, &lv_font_montserrat_16, 0);
        lv_obj_center(fallback);
    }
}

static void on_start(void)
{
    selector_open = false;
    selector = NULL;
    root = NULL;
    clear_face_objects();
    watchface_ui_init(lv_scr_act());
    if (clock_timer) lv_timer_del(clock_timer);
    clock_timer = lv_timer_create(update_clock_cb, 1000, NULL);
}

static void on_stop(void)
{
    if (clock_timer)
    {
        lv_timer_del(clock_timer);
        clock_timer = NULL;
    }
    if (background_timer)
    {
        lv_timer_del(background_timer);
        background_timer = NULL;
    }
    root = NULL;
    selector = NULL;
    selector_open = false;
    clear_face_objects();
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

static int app_main(intent_t intent)
{
    (void)intent;
    gui_app_regist_msg_handler(APP_ID, msg_handler);
    return 0;
}

BUILTIN_APP_EXPORT(LV_EXT_STR_ID(WatchfaceString), LV_EXT_IMG_GET(img_clock), APP_ID, app_main);
