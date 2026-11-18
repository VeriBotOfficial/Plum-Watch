package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.expressad.foundation.h.k;

/* JADX INFO: loaded from: classes15.dex */
public final class jz {
    private static boolean bh = false;
    private static Context fxn = null;
    private static Resources gff = null;
    private static String hm = null;
    private static String kg = null;
    private static boolean rb = false;

    public static void fxn(Context context) {
        fxn = context;
    }

    public static void fxn(String str) {
        hm = str;
    }

    private static String hm(Context context) {
        if (hm == null) {
            hm = context.getPackageName();
        }
        return hm;
    }

    private static int fxn(Context context, String str, String str2) {
        int identifier = kg(context).getIdentifier(str, str2, hm(context));
        if (identifier != 0) {
            return identifier;
        }
        if (!rb) {
            gff(context);
            return kg(context).getIdentifier(str, str2, hm(context));
        }
        return context.getResources().getIdentifier(str, str2, hm(context));
    }

    public static String fxn(Context context, String str) {
        return kg(context).getString(kg(context, str));
    }

    public static int kg(Context context, String str) {
        return fxn(context, str, "string");
    }

    public static Drawable gff(Context context, String str) {
        try {
            return kg(context).getDrawable(hm(context, str));
        } catch (Exception unused) {
            return null;
        }
    }

    public static int hm(Context context, String str) {
        try {
            return fxn(context, str, k.c);
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int rb(Context context, String str) {
        return fxn(context, str, "id");
    }

    public static int bh(Context context, String str) {
        return fxn(context, str, "style");
    }

    public static int sg(Context context, String str) {
        return kg(context).getColor(tw(context, str));
    }

    public static int tw(Context context, String str) {
        return fxn(context, str, "color");
    }

    public static int jq(Context context, String str) {
        return fxn(context, str, k.f);
    }

    public static Resources kg(Context context) {
        Resources resources = gff;
        if (resources == null) {
            resources = null;
        }
        Context context2 = fxn;
        if (context2 != null) {
            resources = context2.getResources();
        }
        return resources == null ? context.getResources() : resources;
    }

    public static synchronized void gff(Context context) {
        try {
            if (TextUtils.isEmpty(kg)) {
                return;
            }
            rb = true;
        } catch (Throwable th) {
            Log.e("ResourceHelp", "makePluginResources failed", th);
        }
    }
}
