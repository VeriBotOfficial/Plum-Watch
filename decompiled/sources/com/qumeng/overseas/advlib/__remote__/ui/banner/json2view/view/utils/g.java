package com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils;

import android.content.Context;
import android.text.TextUtils;
import com.qumeng.overseas.advlib.__remote__.utils.n;

/* loaded from: classes17.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public static int f13063a;

    public static float a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return 0.0f;
        }
        if (str.endsWith("px")) {
            return Float.parseFloat(str.replace("px", ""));
        }
        if (str.endsWith("f")) {
            return Float.parseFloat(str.replace("f", ""));
        }
        float c = c(str);
        return str.endsWith("dip") ? b(context, c) : a(context, c);
    }

    public static float b(Context context, float f) {
        if (f != 0.0f && f != -1.0f && f != -2.0f) {
            f = (f * context.getResources().getDisplayMetrics().density) + 0.5f;
        }
        return (int) f;
    }

    public static float c(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0.0f;
        }
        if (str.endsWith("dip")) {
            return Float.parseFloat(str.replace("dip", ""));
        }
        if (str.endsWith("dp")) {
            return Float.parseFloat(str.replace("dp", ""));
        }
        if (str.endsWith("sp")) {
            return Float.parseFloat(str.replace("sp", ""));
        }
        if (str.equals("wrap_content")) {
            return -2.0f;
        }
        if (str.equals("match_parent")) {
            return -1.0f;
        }
        if (str.endsWith("f")) {
            return Float.parseFloat(str.replace("f", ""));
        }
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e) {
            com.qumeng.overseas.advlib.__remote__.utils.bugman.a.a(g.class, "NumberFormatException_ValueUtils_str2dp2", (Throwable) e);
            return 0.0f;
        }
    }

    public static boolean b(String str) {
        return (TextUtils.isEmpty(str) || str.equals("false")) ? false : true;
    }

    public static float a(Context context, float f) {
        if (f == 0.0f || f == -1.0f || f == -2.0f) {
            return (int) f;
        }
        float f2 = context.getResources().getDisplayMetrics().density;
        int i = (int) ((f * f2) + 0.5f);
        n.a("ValueUtils", "dp2px : dp = " + f + " ; pxNum = " + i + " ; scale = " + f2, new Object[0]);
        return i;
    }

    public static int a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        return e.b().a(str);
    }

    public static int a(int i, int i2) {
        return (int) ((Math.random() * (i - i2)) + i2);
    }
}
