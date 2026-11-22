package com.alipay.sdk.m.y;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.alipay.sdk.app.EnvUtils;

/* loaded from: classes11.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1497a = "content://com.alipay.android.app.settings.data.ServerProvider/current_server";

    public static String a() {
        return com.alipay.sdk.m.n.a.b;
    }

    public static String b(Context context) {
        if (EnvUtils.isPreSandBox()) {
            return com.alipay.sdk.m.n.a.c;
        }
        if (EnvUtils.isNewSanBox()) {
            return com.alipay.sdk.m.n.a.d;
        }
        if (context == null) {
            return com.alipay.sdk.m.n.a.f1414a;
        }
        String str = com.alipay.sdk.m.n.a.f1414a;
        return TextUtils.isEmpty(str) ? com.alipay.sdk.m.n.a.f1414a : str;
    }

    public static String a(Context context) {
        Cursor query = context.getContentResolver().query(Uri.parse(f1497a), null, null, null, null);
        if (query != null && query.getCount() > 0) {
            r0 = query.moveToFirst() ? query.getString(query.getColumnIndex("url")) : null;
            query.close();
        }
        return r0;
    }
}
