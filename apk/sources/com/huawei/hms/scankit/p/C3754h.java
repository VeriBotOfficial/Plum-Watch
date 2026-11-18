package com.huawei.hms.scankit.p;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.Locale;

/* JADX INFO: renamed from: com.huawei.hms.scankit.p.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CountryCodeBean.java */
/* JADX INFO: loaded from: classes11.dex */
public class C3754h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f10645a = "h";
    private String b = "UNKNOWN";
    private String c;

    public C3754h(Context context, boolean z) {
        this.c = "UNKNOWN";
        b(context, z);
        this.c = this.c.toUpperCase(Locale.ENGLISH);
    }

    private void b(Context context, boolean z) {
        if (context == null) {
            throw new NullPointerException("context must be not null.Please provide app's Context");
        }
        try {
            d();
            if (e()) {
                Log.d(f10645a, "getCountryCode get country code from {%s}VENDOR_COUNTRY");
                return;
            }
            a(context, z);
            if (e()) {
                Log.d(f10645a, "getCountryCode get country code from {%s}SIM_COUNTRY");
                return;
            }
            c();
            if (e()) {
                Log.d(f10645a, "getCountryCode get country code from {%s}LOCALE_INFO");
            }
        } catch (Exception unused) {
            Log.w(f10645a, "get CountryCode error");
        }
    }

    private void c() {
        this.c = a("get", "ro.product.locale.region", "android.os.SystemProperties", "UNKNOWN");
        this.b = GrsBaseInfo.CountryCodeSource.LOCALE_INFO;
        String str = f10645a;
        Log.d(str, "getLocaleCountryCode=" + this.c);
        if ("cn".equalsIgnoreCase(this.c)) {
            return;
        }
        Log.e(str, "getLocaleCountryCode from system language is not reliable.");
        this.c = "UNKNOWN";
        this.b = "UNKNOWN";
    }

    private void d() {
        this.b = GrsBaseInfo.CountryCodeSource.VENDOR_COUNTRY;
        this.c = a("get", "ro.hw.country", "android.os.SystemProperties", "UNKNOWN");
        String str = f10645a;
        Log.e(str, "getVendorCountry=" + this.c);
        if (!"eu".equalsIgnoreCase(this.c) && !"la".equalsIgnoreCase(this.c)) {
            b();
            return;
        }
        Log.e(str, "getVendorCountry equals eu or la ,not reliable");
        this.c = "UNKNOWN";
        this.b = "UNKNOWN";
    }

    private boolean e() {
        return !"UNKNOWN".equals(this.c);
    }

    public String a() {
        return this.c;
    }

    private void a(Context context, boolean z) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getApplicationContext().getSystemService("phone");
        if (telephonyManager != null) {
            if (!z || telephonyManager.getPhoneType() == 2) {
                this.c = telephonyManager.getSimCountryIso();
                this.b = GrsBaseInfo.CountryCodeSource.SIM_COUNTRY;
                Log.e(f10645a, "getSimCountryCode by not enableNetwork, countryCode=" + this.c);
            } else {
                this.c = telephonyManager.getNetworkCountryIso();
                this.b = GrsBaseInfo.CountryCodeSource.NETWORK_COUNTRY;
                Log.e(f10645a, "getSimCountryCode by enableNetwork, countryCode=" + this.c);
            }
        }
        b();
    }

    private static String a(String str, String str2, String str3, String str4) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            try {
                Class<?> cls = Class.forName(str3);
                return (String) cls.getMethod(str, String.class, String.class).invoke(cls, str2, str4);
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
                Log.e(f10645a, "getProperty catch exception: ", e2);
                return str4;
            }
        }
        Log.w(f10645a, "reflect class for method has exception.");
        return str4;
    }

    private void b() {
        String str = this.c;
        if (str == null || str.length() != 2) {
            this.c = "UNKNOWN";
            this.b = "UNKNOWN";
        }
    }
}
