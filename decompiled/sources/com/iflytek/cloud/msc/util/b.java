package com.iflytek.cloud.msc.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.iflytek.cloud.msc.util.log.DebugLog;

/* loaded from: classes17.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static b f11185a;
    private SharedPreferences b;
    private Context c;

    private b(Context context) {
        this.b = null;
        this.c = context;
        this.b = context.getSharedPreferences("com.iflytek.msc", 0);
    }

    public static b a(Context context) {
        if (f11185a == null && context != null) {
            b(context);
        }
        return f11185a;
    }

    private static synchronized b b(Context context) {
        b bVar;
        synchronized (b.class) {
            if (f11185a == null) {
                f11185a = new b(context);
            }
            FileUtil.getUserPath(context);
            a.b(context);
            bVar = f11185a;
        }
        return bVar;
    }

    public void a(String str) {
        try {
            this.b.edit().remove(str).commit();
        } catch (Exception e) {
            DebugLog.LogE("remove data from preference has exception:" + e.getMessage());
        }
    }

    public long a(String str, long j) {
        return this.b.getLong(str, j);
    }

    public void b(String str, long j) {
        SharedPreferences.Editor edit = this.b.edit();
        edit.putLong(str, j);
        edit.commit();
    }

    public String a(String str, String str2) {
        return this.b.getString(str, str2);
    }

    public int a(String str, int i) {
        return this.b.getInt(str, i);
    }

    public void b(String str, String str2) {
        SharedPreferences.Editor edit = this.b.edit();
        edit.putString(str, str2);
        edit.commit();
    }

    public void b(String str, int i) {
        SharedPreferences.Editor edit = this.b.edit();
        edit.putInt(str, i);
        edit.commit();
    }
}
