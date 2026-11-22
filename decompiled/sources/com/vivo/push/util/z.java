package com.vivo.push.util;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: PushClientSdkAppSp.java */
/* loaded from: classes2.dex */
public final class z extends c {
    private Context b;

    public z(Context context) {
        if (context != null) {
            this.b = context;
            a(context);
        }
    }

    private synchronized void a(Context context) {
        a(context, "com.vivo.push_preferences.appconfig_v1");
    }

    public final String c() {
        String str;
        Context context = this.b;
        String packageName = context.getPackageName();
        Object a2 = ah.a(context, packageName, "com.vivo.push.app_id");
        if (a2 != null) {
            str = a2.toString();
        } else {
            Object a3 = ah.a(context, packageName, "app_id");
            if (a3 == null) {
                str = "";
            } else {
                str = a3.toString();
            }
        }
        return TextUtils.isEmpty(str) ? b("APP_APPID", "") : str;
    }

    public final String d() {
        String str;
        Context context = this.b;
        String packageName = context.getPackageName();
        Object a2 = ah.a(context, packageName, "com.vivo.push.api_key");
        if (a2 != null) {
            str = a2.toString();
        } else {
            Object a3 = ah.a(context, packageName, "api_key");
            if (a3 == null) {
                str = "";
            } else {
                str = a3.toString();
            }
        }
        return TextUtils.isEmpty(str) ? b("APP_APIKEY", "") : str;
    }
}
