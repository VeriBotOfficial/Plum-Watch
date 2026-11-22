package com.hihonor.push.sdk;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes11.dex */
public class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f10130a;

    public b1(Context context, String str) {
        if (context == null) {
            throw new NullPointerException("context is null!");
        }
        Context createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
        SharedPreferences sharedPreferences = createDeviceProtectedStorageContext.getSharedPreferences("move_to_de_records", 0);
        if (!sharedPreferences.getBoolean(str, false) && createDeviceProtectedStorageContext.moveSharedPreferencesFrom(context, str)) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean(str, true);
            edit.apply();
        }
        this.f10130a = createDeviceProtectedStorageContext.getSharedPreferences(str, 0);
    }

    public boolean a(String str) {
        SharedPreferences.Editor edit;
        SharedPreferences sharedPreferences = this.f10130a;
        if (sharedPreferences == null || (edit = sharedPreferences.edit()) == null) {
            return false;
        }
        return edit.remove(str).commit();
    }

    public boolean a(String str, String str2) {
        SharedPreferences.Editor edit;
        SharedPreferences sharedPreferences = this.f10130a;
        if (sharedPreferences == null || (edit = sharedPreferences.edit()) == null) {
            return false;
        }
        return edit.putString(str, str2).commit();
    }
}
