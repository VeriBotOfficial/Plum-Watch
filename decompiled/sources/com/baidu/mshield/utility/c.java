package com.baidu.mshield.utility;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

/* compiled from: DeviceId.java */
/* loaded from: classes13.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static String f8438a;

    public static String a(String str) {
        try {
            String str2 = new String(com.baidu.mshield.b.f.a.a(Base64.decode(str, 10), com.baidu.mshield.b.f.a.a(16)), "UTF-8");
            return !TextUtils.isEmpty(str2) ? str2 : "";
        } catch (Throwable th) {
            com.baidu.mshield.b.c.a.a(th);
            return "";
        }
    }

    public static synchronized String b(Context context) {
        synchronized (c.class) {
            try {
                if (!TextUtils.isEmpty(f8438a)) {
                    return f8438a;
                }
                String a2 = a(context, false);
                if (!TextUtils.isEmpty(a2)) {
                    f8438a = a2;
                    return a2;
                }
                com.baidu.mshield.sharedpreferences.a a3 = com.baidu.mshield.sharedpreferences.a.a(context);
                String q2 = a3.q();
                if (!TextUtils.isEmpty(q2)) {
                    try {
                        String a4 = a(q2);
                        if (!TextUtils.isEmpty(a4)) {
                            f8438a = a4;
                            return a4;
                        }
                    } catch (Throwable th) {
                        com.baidu.mshield.b.c.a.a(th);
                    }
                }
                String n = a3.n();
                if (!TextUtils.isEmpty(n)) {
                    a3.i(new String(Base64.encode(com.baidu.mshield.b.f.a.b(n.getBytes("UTF-8"), com.baidu.mshield.b.f.a.a(16)), 10), "UTF-8"));
                    f8438a = n;
                    return n;
                }
                String c = c(context);
                String e = e(context);
                if (TextUtils.isEmpty(e)) {
                    e = "0";
                }
                String str = c + "|" + new StringBuffer(e).reverse().toString();
                String str2 = new String(Base64.encode(com.baidu.mshield.b.f.a.b(str.getBytes("UTF-8"), com.baidu.mshield.b.f.a.a(16)), 10), "UTF-8");
                String n2 = a3.n();
                if (!TextUtils.isEmpty(n2)) {
                    f8438a = n2;
                    return n2;
                }
                a3.h(str);
                a3.i(str2);
                f8438a = str;
                return str;
            } catch (Throwable th2) {
                com.baidu.mshield.b.c.a.a(th2);
                return "";
            }
        }
    }

    public static String c(Context context) {
        String str;
        String str2 = "";
        try {
            str = e(context);
            try {
                str2 = a(context);
            } catch (Throwable th) {
                th = th;
                com.baidu.mshield.b.c.a.a(th);
                return a((str + str2 + UUID.randomUUID().toString()).getBytes(), true);
            }
        } catch (Throwable th2) {
            th = th2;
            str = "";
        }
        return a((str + str2 + UUID.randomUUID().toString()).getBytes(), true);
    }

    public static String d(Context context) {
        try {
            try {
                if (TextUtils.isEmpty(com.baidu.sec.privacy.e.a.a(context).c("bd_setting_i", true))) {
                    e(context);
                }
                TextUtils.isEmpty(e(context));
                return "";
            } catch (Exception unused) {
                return "";
            }
        } catch (Throwable th) {
            com.baidu.mshield.b.c.a.a(th);
            return "";
        }
    }

    public static String e(Context context) {
        return "";
    }

    public static String f(Context context) {
        return "";
    }

    public static String g(Context context) {
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            return displayMetrics.widthPixels < displayMetrics.heightPixels ? displayMetrics.widthPixels + "*" + displayMetrics.heightPixels : displayMetrics.heightPixels + "*" + displayMetrics.widthPixels;
        } catch (Throwable th) {
            com.baidu.mshield.b.c.a.a(th);
            return "";
        }
    }

    public static String h(Context context) {
        try {
            String f = com.baidu.mshield.sharedpreferences.a.a(context).f();
            return !TextUtils.isEmpty(f) ? f : "";
        } catch (Throwable th) {
            com.baidu.mshield.b.c.a.a(th);
            return "";
        }
    }

    public static String i(Context context) {
        try {
            if (TextUtils.isEmpty(com.baidu.mshield.b.e.a.d(context, "bd_setting_i"))) {
                e(context);
            }
            TextUtils.isEmpty(e(context));
        } catch (Throwable unused) {
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035 A[Catch: all -> 0x008a, TryCatch #1 {all -> 0x008a, blocks: (B:3:0x0004, B:13:0x0025, B:15:0x0035, B:19:0x0059, B:22:0x0065, B:26:0x0022), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059 A[Catch: all -> 0x008a, TRY_LEAVE, TryCatch #1 {all -> 0x008a, blocks: (B:3:0x0004, B:13:0x0025, B:15:0x0035, B:19:0x0059, B:22:0x0065, B:26:0x0022), top: B:2:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String j(android.content.Context r7) {
        /*
            java.lang.String r0 = "com.baidu"
            java.lang.String r1 = ""
            java.lang.String r2 = a(r7)     // Catch: java.lang.Throwable -> L8a
            r3 = 1
            com.baidu.sec.privacy.e.a r4 = com.baidu.sec.privacy.e.a.a(r7)     // Catch: java.lang.Throwable -> L20
            java.lang.String r5 = "bd_setting_i"
            java.lang.String r4 = r4.c(r5, r3)     // Catch: java.lang.Throwable -> L20
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L1e
            if (r5 == 0) goto L25
            java.lang.String r4 = e(r7)     // Catch: java.lang.Throwable -> L1e
            goto L25
        L1e:
            r5 = move-exception
            goto L22
        L20:
            r5 = move-exception
            r4 = r1
        L22:
            com.baidu.mshield.b.c.a.a(r5)     // Catch: java.lang.Throwable -> L8a
        L25:
            com.baidu.sec.privacy.e.a r5 = com.baidu.sec.privacy.e.a.a(r7)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r6 = "com.baidu.deviceid"
            java.lang.String r5 = r5.c(r6, r3)     // Catch: java.lang.Throwable -> L8a
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L8a
            if (r6 == 0) goto L56
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8a
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L8a
            java.lang.StringBuilder r0 = r5.append(r4)     // Catch: java.lang.Throwable -> L8a
            java.lang.StringBuilder r0 = r0.append(r2)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L8a
            byte[] r0 = r0.getBytes()     // Catch: java.lang.Throwable -> L8a
            java.lang.String r0 = a(r0, r3)     // Catch: java.lang.Throwable -> L8a
            com.baidu.sec.privacy.e.a r2 = com.baidu.sec.privacy.e.a.a(r7)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r5 = r2.c(r0, r3)     // Catch: java.lang.Throwable -> L8a
        L56:
            if (r5 != 0) goto L59
            return r1
        L59:
            java.lang.String r7 = e(r7)     // Catch: java.lang.Throwable -> L8a
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L8a
            if (r0 == 0) goto L65
            java.lang.String r7 = "0"
        L65:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L8a
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L8a
            java.lang.StringBuffer r7 = r0.reverse()     // Catch: java.lang.Throwable -> L8a
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L8a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8a
            r0.<init>()     // Catch: java.lang.Throwable -> L8a
            java.lang.StringBuilder r0 = r0.append(r5)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r2 = "|"
            java.lang.StringBuilder r0 = r0.append(r2)     // Catch: java.lang.Throwable -> L8a
            java.lang.StringBuilder r7 = r0.append(r7)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L8a
            return r7
        L8a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.mshield.utility.c.j(android.content.Context):java.lang.String");
    }

    public static String a(Context context) {
        return com.baidu.mshield.core.a.a("arid");
    }

    public static String a(byte[] bArr, boolean z) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(bArr);
            return a(messageDigest.digest(), "", z);
        } catch (NoSuchAlgorithmException e) {
            com.baidu.mshield.b.c.a.a(e);
            return null;
        }
    }

    public static String a(byte[] bArr, String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (z) {
                hexString = hexString.toUpperCase();
            }
            if (hexString.length() == 1) {
                sb.append("0");
            }
            sb.append(hexString).append(str);
        }
        return sb.toString();
    }

    public static String a() {
        return Build.DISPLAY;
    }

    public static String a(Context context, boolean z) {
        try {
            Bundle a2 = g.a(context, "getRemoteZid", null, z, null, false);
            if (a2 == null) {
                return "";
            }
            String string = a2.getString("_zid");
            return !TextUtils.isEmpty(string) ? string : "";
        } catch (Throwable th) {
            a.a(th);
            return "";
        }
    }
}
