package com.baidu.platform.comapi.wnplatform.p;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;

/* JADX INFO: compiled from: ScreenUtils.java */
/* JADX INFO: loaded from: classes15.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static float f8948a = 0.0f;
    private static int b = 0;
    public static int c = 124;
    public static int d = 133;

    public static float a(Context context) {
        if (f8948a == 0.0f) {
            f8948a = context.getResources().getDisplayMetrics().density;
        }
        return f8948a;
    }

    public static int b(Context context) {
        if (context != null) {
            return context.getResources().getDisplayMetrics().heightPixels;
        }
        return 0;
    }

    public static int c(Context context) {
        if (context != null) {
            return context.getResources().getDisplayMetrics().widthPixels;
        }
        return 0;
    }

    public static int d(Context context) {
        Rect rect = new Rect();
        ((Activity) context).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect.top;
    }

    public static int e(Context context) {
        View viewFindViewById;
        if (context == null) {
            return 0;
        }
        int r0 = b;
        if (r0 > 0) {
            return r0;
        }
        if ((context instanceof Activity) && (viewFindViewById = ((Activity) context).getWindow().getDecorView().findViewById(R.id.content)) != null && viewFindViewById.getHeight() > 0) {
            return viewFindViewById.getHeight();
        }
        int r1 = b(context);
        int r2 = d(context);
        return r1 - r2;
    }

    public static int a(Context context, int r1) {
        return (int) ((a(context) * r1) + 0.5f);
    }
}
