package com.flyco.tablayout.utils;

import android.util.DisplayMetrics;
import android.widget.RelativeLayout;
import com.flyco.tablayout.widget.MsgView;

/* loaded from: classes14.dex */
public class UnreadMsgUtils {
    public static void show(MsgView msgView, int num) {
        if (msgView == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) msgView.getLayoutParams();
        DisplayMetrics displayMetrics = msgView.getResources().getDisplayMetrics();
        msgView.setVisibility(0);
        if (num <= 0) {
            msgView.setStrokeWidth(0);
            msgView.setText("");
            layoutParams.width = (int) (displayMetrics.density * 5.0f);
            layoutParams.height = (int) (displayMetrics.density * 5.0f);
            msgView.setLayoutParams(layoutParams);
            return;
        }
        layoutParams.height = (int) (displayMetrics.density * 18.0f);
        if (num > 0 && num < 10) {
            layoutParams.width = (int) (displayMetrics.density * 18.0f);
            msgView.setText(num + "");
        } else if (num > 9 && num < 100) {
            layoutParams.width = -2;
            msgView.setPadding((int) (displayMetrics.density * 6.0f), 0, (int) (displayMetrics.density * 6.0f), 0);
            msgView.setText(num + "");
        } else {
            layoutParams.width = -2;
            msgView.setPadding((int) (displayMetrics.density * 6.0f), 0, (int) (displayMetrics.density * 6.0f), 0);
            msgView.setText("99+");
        }
        msgView.setLayoutParams(layoutParams);
    }

    public static void setSize(MsgView rtv, int size) {
        if (rtv == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) rtv.getLayoutParams();
        layoutParams.width = size;
        layoutParams.height = size;
        rtv.setLayoutParams(layoutParams);
    }
}
