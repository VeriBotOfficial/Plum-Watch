package com.bytedance.sdk.component.adexpress.hm;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.anythink.expressad.f.a.b;
import com.anythink.expressad.video.dynview.a.a;
import com.bytedance.sdk.component.utils.jz;
import java.util.Locale;

/* loaded from: classes13.dex */
public class sg {
    public static int fxn(float f, float f2, float f3, float f4) {
        return (((int) ((f * 255.0f) + 0.5f)) << 24) | (((int) ((f2 * 255.0f) + 0.5f)) << 16) | (((int) ((f3 * 255.0f) + 0.5f)) << 8) | ((int) ((f4 * 255.0f) + 0.5f));
    }

    public static float fxn(Context context, float f) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.fxn.fxn.fxn.fxn().gff().kg();
        }
        return (f * hm(context)) + 0.5f;
    }

    public static int kg(Context context, float f) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.fxn.fxn.fxn.fxn().gff().kg();
        }
        float hm = hm(context);
        if (hm <= 0.0f) {
            hm = 1.0f;
        }
        return (int) ((f / hm) + 0.5f);
    }

    public static float gff(Context context, float f) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.fxn.fxn.fxn.fxn().gff().kg();
        }
        return f * hm(context);
    }

    private static float hm(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public static int fxn(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.fxn.fxn.fxn.fxn().gff().kg();
        }
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int kg(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.fxn.fxn.fxn.fxn().gff().kg();
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static String gff(Context context) {
        String str;
        try {
            Locale locale = jz.kg(context).getConfiguration().getLocales().get(0);
            str = locale.getLanguage();
            try {
                if (locale.getCountry().equals(a.aa)) {
                    str = "zhHant";
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            str = "";
        }
        return fxn(str);
    }

    private static String fxn(String str) {
        str.hashCode();
        switch (str) {
            case "ar":
                return b.w;
            case "ja":
                return "japan";
            case "ko":
                return "korea";
            case "ms":
                return "my";
            case "zh":
                return "cn";
            default:
                return str;
        }
    }
}
