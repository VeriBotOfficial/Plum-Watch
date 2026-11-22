package com.huawei.secure.android.common.ssl.util;

import android.content.Context;

/* loaded from: classes17.dex */
public class ContextUtil {

    /* renamed from: a, reason: collision with root package name */
    private static Context f10824a;

    public static Context getInstance() {
        return f10824a;
    }

    public static void setContext(Context context) {
        if (context == null || f10824a != null) {
            return;
        }
        f10824a = context.getApplicationContext();
    }
}
