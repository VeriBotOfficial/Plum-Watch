package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import java.text.SimpleDateFormat;

/* loaded from: classes4.dex */
public class ca {

    /* renamed from: a, reason: collision with root package name */
    private static String f14481a;

    /* renamed from: a, reason: collision with other field name */
    private static SimpleDateFormat f262a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        f262a = simpleDateFormat;
        f14481a = simpleDateFormat.format(Long.valueOf(System.currentTimeMillis()));
    }

    public static gk a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        gk gkVar = new gk();
        gkVar.d("category_push_stat");
        gkVar.a("push_sdk_stat_channel");
        gkVar.a(1L);
        gkVar.b(str);
        gkVar.a(true);
        gkVar.b(System.currentTimeMillis());
        gkVar.g(bo.a(context).m11924a());
        gkVar.e("com.xiaomi.xmsf");
        gkVar.f("");
        gkVar.c("push_stat");
        return gkVar;
    }
}
