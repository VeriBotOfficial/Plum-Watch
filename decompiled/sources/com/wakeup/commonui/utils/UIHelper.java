package com.wakeup.commonui.utils;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.wakeup.common.base.BaseApplication;

/* loaded from: classes2.dex */
public class UIHelper {
    private UIHelper() {
    }

    public static void setMarginTop(View view, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.topMargin = i;
        view.setLayoutParams(marginLayoutParams);
    }

    public static void setMarginEnd(View view, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.setMarginEnd(i);
        view.setLayoutParams(marginLayoutParams);
    }

    public static void setMarginStart(View view, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.setMarginStart(i);
        view.setLayoutParams(marginLayoutParams);
    }

    public static void setMarginBottom(View view, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.bottomMargin = i;
        view.setLayoutParams(marginLayoutParams);
    }

    public static void setViewSize(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (i != -1) {
            layoutParams.width = i;
        }
        if (i2 != -1) {
            layoutParams.height = i2;
        }
        view.setLayoutParams(layoutParams);
    }

    public static int getStatusBarHeight() {
        Resources resources = BaseApplication.getContext().getResources();
        return resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", "android"));
    }

    public static int getWindowWidth(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int getWindowHeight(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static int px2dp(float f) {
        return (int) ((f / BaseApplication.getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int dp2px(float f) {
        return (int) ((f * BaseApplication.getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static void hideBottomUIMenu(Activity activity) {
        activity.getWindow().getDecorView().setSystemUiVisibility(2822);
        activity.getWindow().addFlags(134217728);
    }
}
