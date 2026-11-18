package com.bykv.vk.openvk.fxn.fxn.kg.hm;

import android.os.Build;
import android.view.View;
import com.yandex.div2.PhoneMasks;

/* JADX INFO: loaded from: classes15.dex */
public class fxn {
    private static final int fxn = Build.VERSION.SDK_INT;

    public static int fxn(long j, long j2) {
        return Math.min(Math.max(0, j2 > 0 ? (int) (((j * 1.0d) / j2) * 100.0d) : 0), 100);
    }

    public static String fxn(long j) {
        StringBuilder sb = new StringBuilder();
        long j2 = j / 60000;
        long j3 = ((j % 3600000) % 60000) / 1000;
        if (j2 >= 10) {
            sb.append(j2);
        } else if (j2 > 0) {
            sb.append(0);
            sb.append(j2);
        } else {
            sb.append(PhoneMasks.EXTRA_NUMBERS);
        }
        sb.append(":");
        if (j3 >= 10) {
            sb.append(j3);
        } else if (j3 > 0) {
            sb.append(0);
            sb.append(j3);
        } else {
            sb.append(PhoneMasks.EXTRA_NUMBERS);
        }
        return sb.toString();
    }

    public static void fxn(View view, boolean z) {
        if (view == null) {
            return;
        }
        if (z) {
            view.setSystemUiVisibility(0);
            return;
        }
        int r2 = fxn;
        if (r2 >= 19) {
            view.setSystemUiVisibility(3846);
        } else if (r2 >= 16) {
            view.setSystemUiVisibility(5);
        } else {
            view.setSystemUiVisibility(1);
        }
    }
}
