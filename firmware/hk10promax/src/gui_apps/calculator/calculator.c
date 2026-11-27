#include "rtconfig.h"
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "lvsf.h"
#include <lv_ext_resource_manager.h>
#include <rtthread.h>
#include "gui_app_fwk.h"
#include "littlevgl2rtt.h"
#include "custom_trans_anim.h"

LV_IMG_DECLARE(img_passbook);

#define APP_ID "Calculator"

static lv_obj_t *disp_label;
static char expr_buf[32] = "0";
static double num1 = 0;
static double num2 = 0;
static char op = 0;
static bool new_num = true;

static void update_display(const char *txt)
{
    if (disp_label)
    {
        lv_label_set_text(disp_label, txt);
    }
}

static void btn_click_cb(lv_event_t *e)
{
    lv_obj_t *btn = lv_event_get_target(e);
    lv_obj_t *label = lv_obj_get_child(btn, 0);
    if (!label) return;
    const char *txt = lv_label_get_text(label);

    if ((strcmp(txt, "AC") == 0 || strcmp(txt, "C") == 0))
    {
        expr_buf[0] = '0';
        expr_buf[1] = '\0';
        num1 = 0;
        num2 = 0;
        op = 0;
        new_num = true;
    }
    else if ((strcmp(txt, "DEL") == 0 || strcmp(txt, "⌫") == 0))
    {
        size_t len = strlen(expr_buf);
        if (strcmp(expr_buf, "Error") == 0 || len <= 1 ||
            (len == 2 && expr_buf[0] == '-'))
        {
            strcpy(expr_buf, "0");
            new_num = true;
        }
        else
        {
            expr_buf[len - 1] = '\0';
        }
    }
    else if (strcmp(txt, "+/-") == 0)
    {
        if (strcmp(expr_buf, "Error") == 0)
            strcpy(expr_buf, "0");
        if (expr_buf[0] == '-')
            memmove(expr_buf, expr_buf + 1, strlen(expr_buf));
        else if (strcmp(expr_buf, "0") != 0 && strlen(expr_buf) < sizeof(expr_buf) - 1)
        {
            memmove(expr_buf + 1, expr_buf, strlen(expr_buf) + 1);
            expr_buf[0] = '-';
        }
        new_num = false;
    }
    else if ((strcmp(txt, "%") == 0 || strcmp(txt, "TIP") == 0) && strcmp(expr_buf, "Error") != 0)
    {
        double value = atof(expr_buf) / 100.0;
        snprintf(expr_buf, sizeof(expr_buf), "%.6g", value);
        new_num = false;
    }
    else if (strcmp(txt, ".") == 0)
    {
        if (new_num)
        {
            snprintf(expr_buf, sizeof(expr_buf), "0.");
            new_num = false;
        }
        else if (strchr(expr_buf, '.') == NULL && strlen(expr_buf) < 10)
        {
            strcat(expr_buf, ".");
        }
    }
    else if (txt[0] >= '0' && txt[0] <= '9')
    {
        if (new_num || strcmp(expr_buf, "0") == 0)
        {
            expr_buf[0] = txt[0];
            expr_buf[1] = '\0';
            new_num = false;
        }
        else if (strlen(expr_buf) < 10)
        {
            strcat(expr_buf, txt);
        }
    }
    else if (strcmp(txt, "+") == 0 || strcmp(txt, "-") == 0 ||
             strcmp(txt, "*") == 0 || strcmp(txt, "×") == 0 || strcmp(txt, "/") == 0 || strcmp(txt, "÷") == 0)
    {
        if (op != 0 && !new_num)
        {
            num2 = atof(expr_buf);
            if (op == '+') num1 += num2;
            else if (op == '-') num1 -= num2;
            else if (op == '*') num1 *= num2;
            else if (op == '/')
            {
                if (num2 == 0)
                {
                    strcpy(expr_buf, "Error");
                    op = 0;
                    new_num = true;
                    update_display(expr_buf);
                    return;
                }
                num1 /= num2;
            }
            if (num1 > -999999999.0 && num1 < 999999999.0)
                snprintf(expr_buf, sizeof(expr_buf), "%.8g", num1);
            else
                strcpy(expr_buf, "Error");
        }
        else if (op == 0)
        {
            num1 = atof(expr_buf);
        }
        op = (strcmp(txt, "×") == 0) ? '*' : ((strcmp(txt, "÷") == 0) ? '/' : txt[0]);
        new_num = true;
    }
    else if (strcmp(txt, "=") == 0)
    {
        if (op != 0 && !new_num)
        {
            num2 = atof(expr_buf);
            double res = num1;
            bool err = false;
            if (op == '+') res += num2;
            else if (op == '-') res -= num2;
            else if (op == '*') res *= num2;
            else if (op == '/')
            {
                if (num2 != 0) res /= num2;
                else err = true;
            }

            if (err || res != res || res > 999999999.0 || res < -999999999.0)
                snprintf(expr_buf, sizeof(expr_buf), "Error");
            else if (res == (long)res)
                snprintf(expr_buf, sizeof(expr_buf), "%ld", (long)res);
            else
                snprintf(expr_buf, sizeof(expr_buf), "%.6g", res);

            op = 0;
            new_num = true;
        }
    }
    update_display(expr_buf);
}

static void calc_ui_init(lv_obj_t *parent)
{
    lv_obj_t *cont = lv_obj_create(parent);
    lv_obj_set_size(cont, LV_HOR_RES_MAX, LV_VER_RES_MAX);
    lv_obj_set_style_bg_color(cont, lv_color_black(), 0);
    lv_obj_set_style_bg_opa(cont, LV_OPA_COVER, 0);
    lv_obj_set_style_border_width(cont, 0, 0);
    lv_obj_set_style_pad_all(cont, 0, 0);
    lv_obj_clear_flag(cont, LV_OBJ_FLAG_SCROLLABLE);

    disp_label = lv_label_create(cont);
    lv_obj_set_size(disp_label, LV_HOR_RES_MAX - 34, 58);
    lv_obj_align(disp_label, LV_ALIGN_TOP_MID, 0, 26);
    lv_obj_set_style_text_color(disp_label, lv_color_white(), 0);
    lv_obj_set_style_text_font(disp_label, &lv_font_montserrat_36, 0);
    lv_obj_set_style_text_align(disp_label, LV_TEXT_ALIGN_RIGHT, 0);
    lv_label_set_long_mode(disp_label, LV_LABEL_LONG_DOT);
    lv_label_set_text(disp_label, "0");

    const char *keys[19] = {"C","+/-","TIP","÷","7","8","9","×","4","5","6","-","1","2","3","+","0",".","="};
    const int gap=5, top=96, bottom=12, rows=5;
    const int kw=(LV_HOR_RES_MAX-32-3*gap)/4;
    const int kh=(LV_VER_RES_MAX-top-bottom-(rows-1)*gap)/rows;
    const int left=(LV_HOR_RES_MAX-(4*kw+3*gap))/2;
    for(int i=0;i<19;i++) {
        int row=i/4, col=i%4, width=kw;
        if(i==16) width=kw*2+gap;
        if(i==17) col=2;
        if(i==18) col=3;
        lv_obj_t *btn=lv_btn_create(cont);
        lv_obj_set_size(btn,width,kh);
        lv_obj_set_pos(btn,left+col*(kw+gap),top+row*(kh+gap));
        lv_obj_set_style_radius(btn,LV_RADIUS_CIRCLE,0);
        lv_obj_set_style_border_width(btn,0,0);
        lv_obj_set_style_shadow_width(btn,0,0);
        const char *key=keys[i];
        bool opkey=(!strcmp(key,"÷")||!strcmp(key,"×")||!strcmp(key,"-")||!strcmp(key,"+")||!strcmp(key,"="));
        bool utility=(!strcmp(key,"C")||!strcmp(key,"+/-")||!strcmp(key,"TIP"));
        lv_color_t bg=opkey?lv_color_hex(0xFF922B):(utility?lv_color_hex(0xAEB0B5):lv_color_hex(0x343538));
        lv_obj_set_style_bg_color(btn,bg,LV_PART_MAIN);
        lv_obj_set_style_bg_color(btn,bg,LV_PART_MAIN|LV_STATE_PRESSED);
        lv_obj_add_event_cb(btn,btn_click_cb,LV_EVENT_CLICKED,NULL);
        lv_obj_t *lbl=lv_label_create(btn);
        lv_label_set_text(lbl,key);
        lv_obj_set_style_text_font(lbl,&lv_font_montserrat_20,0);
        lv_obj_set_style_text_color(lbl,utility?lv_color_black():lv_color_white(),0);
        lv_obj_center(lbl);
    }
}

static void on_start(void)
{
    expr_buf[0] = '0';
    expr_buf[1] = '\0';
    num1 = 0;
    num2 = 0;
    op = 0;
    new_num = true;

    calc_ui_init(lv_scr_act());
}

static void msg_handler(gui_app_msg_type_t msg, void *param)
{
    switch (msg)
    {
    case GUI_APP_MSG_ONSTART:
        on_start();
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

BUILTIN_APP_EXPORT(LV_EXT_STR_ID(Calculator),
                   LV_EXT_IMG_GET(img_passbook), APP_ID, app_main);
