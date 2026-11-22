package com.xiaomi.push;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private static volatile int f14683a = 0;

    /* renamed from: a, reason: collision with other field name */
    private static Map<String, n> f924a = null;
    private static int b = -1;

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m12357a() {
        return a() == 1;
    }

    /* renamed from: b, reason: collision with other method in class */
    public static boolean m12362b() {
        return a() == 2;
    }

    public static int a() {
        int i;
        if (f14683a == 0) {
            try {
            } catch (Throwable th) {
                com.xiaomi.channel.commonutils.logger.b.a("get isMIUI failed", th);
                f14683a = 0;
            }
            if (TextUtils.isEmpty(m12355a("ro.miui.ui.version.code")) && TextUtils.isEmpty(m12355a("ro.miui.ui.version.name")) && TextUtils.isEmpty(m12355a("ro.mi.os.version.code")) && TextUtils.isEmpty(m12355a("ro.mi.os.version.name"))) {
                i = 2;
                f14683a = i;
                com.xiaomi.channel.commonutils.logger.b.b("isMIUI's value is: " + f14683a);
            }
            i = 1;
            f14683a = i;
            com.xiaomi.channel.commonutils.logger.b.b("isMIUI's value is: " + f14683a);
        }
        return f14683a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static String m12354a() {
        int a2 = s.a();
        if (!m12357a() || a2 <= 0) {
            return "";
        }
        if (a2 < 2) {
            return "alpha";
        }
        if (a2 < 3) {
            return "development";
        }
        return "stable";
    }

    /* renamed from: a, reason: collision with other method in class */
    public static String m12355a(String str) {
        try {
            try {
                return (String) ax.a("android.os.SystemProperties", "get", str, "");
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.b.d("fail to get property. " + e);
                return null;
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c, reason: collision with other method in class */
    public static boolean m12363c() {
        if (b < 0) {
            b = !m12366f() ? 1 : 0;
        }
        return b > 0;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m12358a(Context context) {
        return context != null && m12359a(context.getPackageName());
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m12359a(String str) {
        return "com.xiaomi.xmsf".equals(str);
    }

    /* renamed from: b, reason: collision with other method in class */
    public static String m12360b() {
        String a2 = q.a("ro.miui.region", "");
        if (TextUtils.isEmpty(a2)) {
            a2 = q.a("persist.sys.oppo.region", "");
        }
        if (TextUtils.isEmpty(a2)) {
            a2 = q.a("ro.oppo.regionmark", "");
        }
        if (TextUtils.isEmpty(a2)) {
            a2 = q.a("ro.vendor.oplus.regionmark", "");
        }
        if (TextUtils.isEmpty(a2)) {
            a2 = q.a("ro.hw.country", "");
        }
        if (TextUtils.isEmpty(a2)) {
            a2 = q.a("ro.csc.countryiso_code", "");
        }
        if (TextUtils.isEmpty(a2)) {
            a2 = m12361b(q.a("ro.product.country.region", ""));
        }
        if (TextUtils.isEmpty(a2)) {
            a2 = q.a("gsm.vivo.countrycode", "");
        }
        if (TextUtils.isEmpty(a2)) {
            a2 = q.a("persist.sys.oem.region", "");
        }
        if (TextUtils.isEmpty(a2)) {
            a2 = q.a("ro.product.locale.region", "");
        }
        if (TextUtils.isEmpty(a2)) {
            a2 = q.a("persist.sys.country", "");
        }
        if (!TextUtils.isEmpty(a2)) {
            com.xiaomi.channel.commonutils.logger.b.m11781a("get region from system, region = " + a2);
        }
        if (!TextUtils.isEmpty(a2)) {
            return a2;
        }
        String country = Locale.getDefault().getCountry();
        com.xiaomi.channel.commonutils.logger.b.m11781a("locale.default.country = " + country);
        return country;
    }

    public static n a(String str) {
        n b2 = b(str);
        return b2 == null ? n.Global : b2;
    }

    private static n b(String str) {
        m12356a();
        return f924a.get(str.toUpperCase());
    }

    /* renamed from: a, reason: collision with other method in class */
    private static void m12356a() {
        if (f924a != null) {
            return;
        }
        HashMap hashMap = new HashMap();
        f924a = hashMap;
        hashMap.put("CN", n.China);
        f924a.put("FI", n.Europe);
        f924a.put("SE", n.Europe);
        f924a.put("NO", n.Europe);
        f924a.put("FO", n.Europe);
        f924a.put("EE", n.Europe);
        f924a.put("LV", n.Europe);
        f924a.put("LT", n.Europe);
        f924a.put("BY", n.Europe);
        f924a.put("MD", n.Europe);
        f924a.put("UA", n.Europe);
        f924a.put("PL", n.Europe);
        f924a.put("CZ", n.Europe);
        f924a.put("SK", n.Europe);
        f924a.put("HU", n.Europe);
        f924a.put("DE", n.Europe);
        f924a.put("AT", n.Europe);
        f924a.put("CH", n.Europe);
        f924a.put("LI", n.Europe);
        f924a.put("GB", n.Europe);
        f924a.put("IE", n.Europe);
        f924a.put("NL", n.Europe);
        f924a.put("BE", n.Europe);
        f924a.put("LU", n.Europe);
        f924a.put("FR", n.Europe);
        f924a.put("RO", n.Europe);
        f924a.put("BG", n.Europe);
        f924a.put("RS", n.Europe);
        f924a.put("MK", n.Europe);
        f924a.put("AL", n.Europe);
        f924a.put("GR", n.Europe);
        f924a.put("SI", n.Europe);
        f924a.put("HR", n.Europe);
        f924a.put("IT", n.Europe);
        f924a.put("SM", n.Europe);
        f924a.put("MT", n.Europe);
        f924a.put("ES", n.Europe);
        f924a.put("PT", n.Europe);
        f924a.put("AD", n.Europe);
        f924a.put("CY", n.Europe);
        f924a.put("DK", n.Europe);
        f924a.put("IS", n.Europe);
        f924a.put("UK", n.Europe);
        f924a.put("EL", n.Europe);
        f924a.put("RU", n.Russia);
        f924a.put("IN", n.India);
    }

    /* renamed from: d, reason: collision with other method in class */
    public static boolean m12364d() {
        return !n.China.name().equalsIgnoreCase(a(m12360b()).name());
    }

    public static int a(Context context) {
        String m12355a = m12355a("ro.miui.ui.version.code");
        if (TextUtils.isEmpty(m12355a) || !TextUtils.isDigitsOnly(m12355a)) {
            return 0;
        }
        return Integer.parseInt(m12355a);
    }

    public static int b() {
        String m12355a = m12355a("ro.mi.os.version.code");
        if (TextUtils.isEmpty(m12355a) || !TextUtils.isDigitsOnly(m12355a)) {
            return 0;
        }
        return Integer.parseInt(m12355a);
    }

    public static String c() {
        return m12355a("ro.mi.os.version.name");
    }

    public static String d() {
        return m12355a("ro.mi.os.version.incremental");
    }

    public static boolean a(int i) {
        String m12355a = m12355a("ro.mi.os.version.code");
        return !TextUtils.isEmpty(m12355a) && TextUtils.isDigitsOnly(m12355a) && Integer.parseInt(m12355a) >= i;
    }

    /* renamed from: e, reason: collision with other method in class */
    public static boolean m12365e() {
        return a(1);
    }

    public static String e() {
        return m12365e() ? d() : Build.VERSION.INCREMENTAL;
    }

    public static String f() {
        return m12355a("ro.miui.ui.version.name");
    }

    public static int b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 0).versionCode;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: b, reason: collision with other method in class */
    private static String m12361b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String[] split = str.split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        return split.length > 0 ? split[0] : str;
    }

    public static String a(Intent intent) {
        if (intent == null) {
            return null;
        }
        return intent.toString() + " " + a(intent.getExtras());
    }

    public static String a(Bundle bundle) {
        StringBuilder sb = new StringBuilder("Bundle[");
        if (bundle == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            boolean z = true;
            for (String str : bundle.keySet()) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(str).append(com.alipay.sdk.m.p.a.h);
                Object obj = bundle.get(str);
                if (obj instanceof int[]) {
                    sb.append(Arrays.toString((int[]) obj));
                } else if (obj instanceof byte[]) {
                    sb.append(Arrays.toString((byte[]) obj));
                } else if (obj instanceof boolean[]) {
                    sb.append(Arrays.toString((boolean[]) obj));
                } else if (obj instanceof short[]) {
                    sb.append(Arrays.toString((short[]) obj));
                } else if (obj instanceof long[]) {
                    sb.append(Arrays.toString((long[]) obj));
                } else if (obj instanceof float[]) {
                    sb.append(Arrays.toString((float[]) obj));
                } else if (obj instanceof double[]) {
                    sb.append(Arrays.toString((double[]) obj));
                } else if (obj instanceof String[]) {
                    sb.append(Arrays.toString((String[]) obj));
                } else if (obj instanceof CharSequence[]) {
                    sb.append(Arrays.toString((CharSequence[]) obj));
                } else if (obj instanceof Parcelable[]) {
                    sb.append(Arrays.toString((Parcelable[]) obj));
                } else if (obj instanceof Bundle) {
                    sb.append(a((Bundle) obj));
                } else {
                    sb.append(obj);
                }
                z = false;
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: f, reason: collision with other method in class */
    public static boolean m12366f() {
        String str;
        String str2 = "";
        try {
            str = q.a("ro.miui.ui.version.code", "");
        } catch (Exception unused) {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            try {
                str2 = q.a("ro.mi.os.version.code", "");
            } catch (Exception unused2) {
            }
        } else {
            str2 = str;
        }
        return !TextUtils.isEmpty(str2);
    }

    public static String g() {
        return m12355a("ro.build.characteristics");
    }

    public static String h() {
        return m12355a("ro.product.manufacturer");
    }
}
