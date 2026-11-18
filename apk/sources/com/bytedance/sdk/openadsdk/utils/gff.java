package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;

/* JADX INFO: loaded from: classes11.dex */
public class gff {
    public static int fxn = -1;

    public static int fxn(Context context, int r1, int r2) {
        int r3;
        int r0 = fxn(context, r2);
        if (r0 == -1) {
            return fxn;
        }
        int r4 = Math.min(90, Math.round(r0 * 0.15f));
        if (r1 > 655) {
            r3 = Math.round((r1 / 728.0f) * 90.0f);
        } else if (r1 > 632) {
            r3 = 81;
        } else if (r1 > 526) {
            r3 = Math.round((r1 / 468.0f) * 60.0f);
        } else {
            r3 = r1 > 432 ? 68 : Math.round((r1 / 320.0f) * 50.0f);
        }
        return Math.max(Math.min(r3, r4), 50);
    }

    public static int fxn(Context context, int r2) {
        DisplayMetrics displayMetrics;
        Configuration configuration;
        if (context != null) {
            try {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                Resources resources = context.getResources();
                if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null && (configuration = resources.getConfiguration()) != null) {
                    int r1 = configuration.orientation;
                    if (r2 == 0) {
                        r2 = r1;
                    }
                    if (r2 == r1) {
                        return Math.round(displayMetrics.heightPixels / displayMetrics.density);
                    }
                    return Math.round(displayMetrics.widthPixels / displayMetrics.density);
                }
            } catch (Throwable unused) {
                return fxn;
            }
        }
        return fxn;
    }
}
