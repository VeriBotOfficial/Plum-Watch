package com.bytedance.adsdk.ugeno.sg;

import android.content.Context;
import android.content.res.Resources;
import com.anythink.expressad.foundation.h.k;

/* loaded from: classes13.dex */
public final class hm {
    private static String fxn;
    private static Context gff;
    private static Resources kg;

    public static void fxn(String str) {
        fxn = str;
    }

    private static String fxn(Context context) {
        if (fxn == null) {
            fxn = context.getPackageName();
        }
        return fxn;
    }

    private static int fxn(Context context, String str, String str2) {
        if (kg == null) {
            kg = context.getResources();
        }
        return kg.getIdentifier(str, str2, fxn(context));
    }

    public static int fxn(Context context, String str) {
        return fxn(context, str, "raw");
    }

    public static int kg(Context context, String str) {
        return fxn(context, str, k.c);
    }
}
