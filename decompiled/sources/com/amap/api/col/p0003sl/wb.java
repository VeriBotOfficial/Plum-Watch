package com.amap.api.col.p0003sl;

import android.content.Context;

/* compiled from: OfflineLocEntity.java */
/* loaded from: classes11.dex */
public class wb {

    /* renamed from: a, reason: collision with root package name */
    private Context f1956a;
    private l9 b;
    private String c;

    public wb(Context context, l9 l9Var, String str) {
        this.f1956a = context.getApplicationContext();
        this.b = l9Var;
        this.c = str;
    }

    final byte[] a() {
        Context context = this.f1956a;
        l9 l9Var = this.b;
        String str = this.c;
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("\"sdkversion\":\"").append(l9Var.b()).append("\",\"product\":\"").append(l9Var.d()).append("\",\"nt\":\"").append(d9.j(context)).append("\",\"details\":").append(str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return m9.e(sb.toString());
    }
}
