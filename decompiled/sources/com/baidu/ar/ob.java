package com.baidu.ar;

import android.content.Context;

/* loaded from: classes12.dex */
public class ob {

    /* renamed from: a, reason: collision with root package name */
    public static int f7108a = 1280;
    public static int b = 720;

    public static float a(Context context) {
        if (context != null) {
            return context.getResources().getDisplayMetrics().density;
        }
        return 0.0f;
    }

    public static float a(Context context, float f) {
        return (a(context) * f) + 0.5f;
    }

    public static boolean b(Context context) {
        return context != null && context.getResources().getConfiguration().orientation == 2;
    }
}
