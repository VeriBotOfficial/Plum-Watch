package com.anythink.core.common.j;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;

/* loaded from: classes12.dex */
public final class b {
    private static volatile b f;

    /* renamed from: a, reason: collision with root package name */
    SharedPreferences f3951a;
    final String b = "IABTCF_PurposeConsents";
    final String c = AndroidTcfDataSource.TCF_TCSTRING_KEY;
    final String d = "IABTCF_AddtlConsent";
    final String e = "IABTCF_VendorConsents";

    public static b a(Context context) {
        if (f == null) {
            synchronized (a.class) {
                if (f == null) {
                    f = new b(context);
                }
            }
        }
        return f;
    }

    private b(Context context) {
        this.f3951a = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public final String a() {
        SharedPreferences sharedPreferences = this.f3951a;
        return sharedPreferences != null ? sharedPreferences.getString("IABTCF_PurposeConsents", "") : "";
    }

    public final String b() {
        SharedPreferences sharedPreferences = this.f3951a;
        return sharedPreferences != null ? sharedPreferences.getString(AndroidTcfDataSource.TCF_TCSTRING_KEY, "") : "";
    }

    public final String c() {
        SharedPreferences sharedPreferences = this.f3951a;
        return sharedPreferences != null ? sharedPreferences.getString("IABTCF_AddtlConsent", "") : "";
    }

    public final String d() {
        SharedPreferences sharedPreferences = this.f3951a;
        return sharedPreferences != null ? sharedPreferences.getString("IABTCF_VendorConsents", "") : "";
    }
}
