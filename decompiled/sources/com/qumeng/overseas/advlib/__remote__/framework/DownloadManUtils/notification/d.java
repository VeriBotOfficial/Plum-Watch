package com.qumeng.overseas.advlib.__remote__.framework.DownloadManUtils.notification;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes17.dex */
public class d {
    private static boolean a() {
        return true;
    }

    public static c a(Context context, String str, String str2, String str3) {
        c cVar;
        c cVar2 = null;
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !a()) {
            return null;
        }
        try {
            cVar2 = b.a(str2);
        } catch (Throwable unused) {
            cVar = cVar2;
        }
        if (cVar2 != null) {
            return cVar2;
        }
        cVar = new a(context, b.a(), str2, str3);
        e.b(context);
        return cVar;
    }
}
