package com.amap.api.col.p0003sl;

import android.content.Context;
import com.xiaomi.mipush.sdk.Constants;
import java.util.UUID;

/* JADX INFO: compiled from: TYLogManager.java */
/* JADX INFO: loaded from: classes7.dex */
public class t9 {
    private static t9 b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f1892a;

    private t9(Context context) {
        context.getApplicationContext();
        try {
            this.f1892a = UUID.randomUUID().toString().replaceAll(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "");
        } catch (Throwable unused) {
        }
    }

    public static t9 a(Context context) {
        if (context == null) {
            return null;
        }
        if (b == null) {
            synchronized (t9.class) {
                if (b == null) {
                    b = new t9(context);
                }
            }
        }
        return b;
    }

    public String a() {
        return this.f1892a;
    }
}
