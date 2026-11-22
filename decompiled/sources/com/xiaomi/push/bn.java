package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes4.dex */
public class bn {

    /* renamed from: a, reason: collision with root package name */
    private static volatile bn f14462a;

    /* renamed from: a, reason: collision with other field name */
    private Context f233a;

    private bn(Context context) {
        this.f233a = context;
    }

    public static bn a(Context context) {
        if (f14462a == null) {
            synchronized (bn.class) {
                if (f14462a == null) {
                    f14462a = new bn(context);
                }
            }
        }
        return f14462a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public synchronized void m11921a(String str, String str2, String str3) {
        SharedPreferences.Editor edit = this.f233a.getSharedPreferences(str, 4).edit();
        edit.putString(str2, str3);
        edit.commit();
    }

    /* renamed from: a, reason: collision with other method in class */
    public synchronized void m11920a(String str, String str2, long j) {
        SharedPreferences.Editor edit = this.f233a.getSharedPreferences(str, 4).edit();
        edit.putLong(str2, j);
        edit.commit();
    }

    public synchronized String a(String str, String str2, String str3) {
        try {
        } catch (Throwable unused) {
            return str3;
        }
        return this.f233a.getSharedPreferences(str, 4).getString(str2, str3);
    }

    public synchronized long a(String str, String str2, long j) {
        try {
        } catch (Throwable unused) {
            return j;
        }
        return this.f233a.getSharedPreferences(str, 4).getLong(str2, j);
    }
}
