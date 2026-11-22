package com.heytap.mcssdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.heytap.mcssdk.PushService;

/* loaded from: classes11.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10109a = "shared_msg_sdk";
    private static final String b = "hasDefaultChannelCreated";
    private static final String c = "decryptTag";
    private Context d;
    private SharedPreferences e;
    private Object f;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        static e f10110a = new e();

        private a() {
        }
    }

    private e() {
        this.f = new Object();
        Context context = PushService.getInstance().getContext();
        if (context != null) {
            this.d = a(context);
        }
        Context context2 = this.d;
        if (context2 != null) {
            this.e = context2.getSharedPreferences(f10109a, 0);
        }
    }

    private Context a(Context context) {
        boolean a2 = com.heytap.mcssdk.utils.a.a();
        d.b("fbeVersion is " + a2);
        return a2 ? context.createDeviceProtectedStorageContext() : context.getApplicationContext();
    }

    public static e c() {
        return a.f10110a;
    }

    private SharedPreferences d() {
        SharedPreferences sharedPreferences;
        Context context;
        SharedPreferences sharedPreferences2 = this.e;
        if (sharedPreferences2 != null) {
            return sharedPreferences2;
        }
        synchronized (this.f) {
            sharedPreferences = this.e;
            if (sharedPreferences == null && (context = this.d) != null) {
                sharedPreferences = context.getSharedPreferences(f10109a, 0);
                this.e = sharedPreferences;
            }
        }
        return sharedPreferences;
    }

    public void a(String str) {
        SharedPreferences d = d();
        if (d != null) {
            d.edit().putString(c, str).commit();
        }
    }

    public void a(boolean z) {
        SharedPreferences d = d();
        if (d != null) {
            d.edit().putBoolean(b, z).commit();
        }
    }

    public boolean a() {
        SharedPreferences d = d();
        if (d != null) {
            return d.getBoolean(b, false);
        }
        return false;
    }

    public String b() {
        SharedPreferences d = d();
        return d != null ? d.getString(c, "DES") : "DES";
    }
}
