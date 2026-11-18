package com.huawei.hms.scankit.util;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;

/* JADX INFO: compiled from: ViewUtils.java */
/* JADX INFO: loaded from: classes11.dex */
public class c {
    public static Point a(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point;
    }

    public static int a(Context context, int r1) {
        return (int) ((r1 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
