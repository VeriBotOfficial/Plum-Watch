package com.anythink.expressad.foundation.h;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;

/* loaded from: classes12.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4925a = "layout";
    public static final String b = "id";
    public static final String c = "drawable";
    public static final String d = "color";
    public static final String e = "style";
    public static final String f = "anim";
    public static final String g = "string";
    public static final int h = -1;
    private static final String i = "ResourceUtil";

    public static Resources a(Context context) {
        if (context != null) {
            try {
                return context.getResources();
            } catch (Exception e2) {
                e2.getMessage();
            }
        }
        return null;
    }

    public static int a(Context context, String str, String str2) {
        if (context == null) {
            return -1;
        }
        try {
            String a2 = com.anythink.expressad.foundation.b.a.c().a();
            int identifier = !TextUtils.isEmpty(a2) ? context.getResources().getIdentifier(str, str2, a2) : -1;
            if (identifier > 0) {
                return identifier;
            }
            String str3 = "";
            try {
                str3 = com.anythink.expressad.foundation.b.a.c().b();
            } catch (Exception unused) {
            }
            if (y.a(str3)) {
                str3 = context.getPackageName();
            }
            if (y.a(str3)) {
                return -1;
            }
            return context.getResources().getIdentifier(str, str2, str3);
        } catch (Exception unused2) {
            return -1;
        }
    }
}
