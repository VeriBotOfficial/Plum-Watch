package com.anythink.expressad.foundation.h;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static String f4919a = null;
    private static String b = "";
    private static String c = "";
    private static boolean d = false;
    private static boolean e = false;
    private static boolean f = false;

    private static void b() {
    }

    public static void a(Context context) {
        if (context == null) {
            return;
        }
        try {
            Class<?> cls = Class.forName("com.anythink.expressad.atsignalcommon.webEnvCheck.WebEnvCheckEntry");
            cls.getMethod("check", Context.class).invoke(cls.newInstance(), context);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static String c() {
        if (d) {
            return b;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            int i = com.anythink.core.common.v.m.p() == 2 ? 0 : 1;
            String o = com.anythink.core.common.v.m.o();
            jSONObject.put("status", i);
            jSONObject.put("amazonId", o);
            String jSONObject2 = jSONObject.toString();
            if (!TextUtils.isEmpty(jSONObject2)) {
                c = jSONObject2;
                b = com.anythink.core.express.a.a.a(jSONObject2);
            }
        } catch (Throwable unused) {
        }
        d = true;
        return b;
    }

    public static String a() {
        if (TextUtils.isEmpty(c) && !d) {
            c();
        }
        return c;
    }

    public static boolean b(Context context) {
        try {
        } catch (Exception unused) {
            e = false;
        }
        if (f) {
            return e;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            e = context.getPackageManager().checkPermission(com.anythink.core.express.a.a.b("DkP3hrKuHoPMH+zwL+fALkK/WQc5x5zH+TcincKNNVfWNVJcVM=="), context.getPackageName()) == 0;
        } else {
            e = true;
        }
        f = true;
        return e;
    }
}
