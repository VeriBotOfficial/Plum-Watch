package com.qumeng.overseas.advlib.__remote__.core.proto.utils;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;

/* loaded from: classes17.dex */
public class s {
    public static int a(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int b(Context context, float f) {
        return (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int c(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return context.getResources().getDisplayMetrics().widthPixels;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static int d(Context context) {
        Resources resources = context.getResources();
        return resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", "android"));
    }

    public static boolean e(Context context) {
        if (context != null) {
            try {
                return context.getResources().getConfiguration().orientation == 2;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public static int a(float f) {
        return (int) ((f * e.a().getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int b(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return context.getResources().getDisplayMetrics().heightPixels;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static int a() {
        try {
            Context a2 = e.a();
            if (a2 != null) {
                return a2.getResources().getDisplayMetrics().densityDpi;
            }
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static int a(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return context.getResources().getDisplayMetrics().densityDpi;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static boolean a(Activity activity) {
        int systemUiVisibility;
        try {
            systemUiVisibility = activity.getWindow().getDecorView().getSystemUiVisibility();
        } catch (Throwable unused) {
        }
        return (systemUiVisibility | 4102) == systemUiVisibility;
    }
}
