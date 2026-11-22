package com.baidu.xclient.gdid.j;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes13.dex */
public class a {
    public static String a(Context context) {
        try {
            String c = com.baidu.mshield.b.b.a.c(context);
            return TextUtils.isEmpty(c) ? com.baidu.mshield.b.b.a.b(context) : c;
        } catch (Throwable th) {
            d.a(th);
            return "";
        }
    }
}
