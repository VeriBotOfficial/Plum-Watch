package com.baidu.platform.comapi.util;

import android.graphics.Color;

/* JADX INFO: compiled from: ColorsUtil.java */
/* JADX INFO: loaded from: classes15.dex */
public class d {
    public static int[] a(int[] r6) {
        if (r6 == null || r6.length <= 0) {
            return null;
        }
        int[] r0 = new int[r6.length];
        for (int r1 = 0; r1 < r6.length; r1++) {
            r0[r1] = Color.argb(Color.alpha(r6[r1]), Color.blue(r6[r1]), Color.green(r6[r1]), Color.red(r6[r1]));
        }
        return r0;
    }
}
