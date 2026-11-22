package com.qumeng.overseas.advlib.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import kotlin.text.Typography;

/* loaded from: classes17.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f13262a = true;
    private static String b;
    private static int c;

    public static String a(InputStream inputStream, int i, int i2) {
        if (inputStream == null) {
            Log.e("byteMD5", "byteMD5 cannot proceed null!");
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bArr = new byte[1024];
            try {
                if (i2 == -1) {
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read <= -1) {
                            break;
                        }
                        messageDigest.update(bArr, 0, read);
                    }
                } else {
                    while (i2 > 0) {
                        int read2 = i2 < 1024 ? inputStream.read(bArr, 0, i2) : inputStream.read(bArr);
                        messageDigest.update(bArr, 0, read2);
                        i2 -= read2;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b2 : digest) {
                sb.append(Integer.toHexString((b2 & 255) | 256).substring(1, 3));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static long b(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        long j = 0;
        int i = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j;
            }
            while (i < 512) {
                bArr[i] = (byte) (bArr[i] - 1);
                i++;
            }
            outputStream.write(bArr, 0, read);
            j += read;
        }
    }

    public static String c(Context context) {
        try {
            return (String) b.g("android.app.ActivityThread").b("currentProcessName").c();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String d(Context context) {
        try {
            return Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String b(Context context) {
        if (!TextUtils.isEmpty(b)) {
            return b;
        }
        if (context != null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                PackageInfo packageInfo = packageManager == null ? null : packageManager.getPackageInfo(context.getPackageName(), 0);
                if (packageInfo != null) {
                    String str = packageInfo.versionName;
                    if (str == null) {
                        str = "";
                    }
                    b = str;
                    return str;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0086 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.lang.String r4, java.lang.String r5) throws java.io.IOException {
        /*
            java.lang.String r0 = "Unexpected response code: "
            r1 = 0
            java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> L81
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L81
            java.net.URLConnection r4 = r2.openConnection()     // Catch: java.lang.Throwable -> L81
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch: java.lang.Throwable -> L81
            if (r5 == 0) goto L2f
            r2 = 1
            r4.setDoOutput(r2)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r2 = "POST"
            r4.setRequestMethod(r2)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r2 = "Content-Type"
            java.lang.String r3 = "application/json"
            r4.setRequestProperty(r2, r3)     // Catch: java.lang.Throwable -> L7f
            java.io.OutputStream r2 = r4.getOutputStream()     // Catch: java.lang.Throwable -> L7f
            byte[] r5 = r5.getBytes()     // Catch: java.lang.Throwable -> L7f
            r2.write(r5)     // Catch: java.lang.Throwable -> L7f
            r2.close()     // Catch: java.lang.Throwable -> L7f
            goto L34
        L2f:
            java.lang.String r5 = "GET"
            r4.setRequestMethod(r5)     // Catch: java.lang.Throwable -> L7f
        L34:
            int r5 = r4.getResponseCode()     // Catch: java.lang.Throwable -> L7f
            r2 = 200(0xc8, float:2.8E-43)
            if (r5 != r2) goto L6c
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L7f
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L7f
            java.io.InputStream r2 = r4.getInputStream()     // Catch: java.lang.Throwable -> L7f
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L7f
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L7f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69
            r0.<init>()     // Catch: java.lang.Throwable -> L69
        L4f:
            java.lang.String r1 = r5.readLine()     // Catch: java.lang.Throwable -> L69
            if (r1 == 0) goto L59
            r0.append(r1)     // Catch: java.lang.Throwable -> L69
            goto L4f
        L59:
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L69
            r5.close()     // Catch: java.io.IOException -> L61
            goto L65
        L61:
            r5 = move-exception
            r5.printStackTrace()
        L65:
            r4.disconnect()
            return r0
        L69:
            r0 = move-exception
            r1 = r5
            goto L84
        L6c:
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L7f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7f
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L7f
            java.lang.StringBuilder r5 = r3.append(r5)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L7f
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L7f
            throw r2     // Catch: java.lang.Throwable -> L7f
        L7f:
            r5 = move-exception
            goto L83
        L81:
            r5 = move-exception
            r4 = r1
        L83:
            r0 = r5
        L84:
            if (r1 == 0) goto L8e
            r1.close()     // Catch: java.io.IOException -> L8a
            goto L8e
        L8a:
            r5 = move-exception
            r5.printStackTrace()
        L8e:
            if (r4 == 0) goto L93
            r4.disconnect()
        L93:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qumeng.overseas.advlib.common.e.a(java.lang.String, java.lang.String):java.lang.String");
    }

    public static long a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += read;
        }
    }

    public static String a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (!z) {
                sb.append('?');
                z = true;
            } else if (z) {
                sb.append(Typography.amp);
            }
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null && value != null) {
                sb.append(key);
                sb.append(com.alipay.sdk.m.p.a.h);
                try {
                    sb.append(URLEncoder.encode(value, "UTF-8"));
                } catch (UnsupportedEncodingException e) {
                    sb.append("none");
                    e.printStackTrace();
                }
            }
        }
        return sb.toString();
    }

    public static int a(Context context) {
        int i = c;
        if (i > 0) {
            return i;
        }
        if (context != null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                PackageInfo packageInfo = packageManager == null ? null : packageManager.getPackageInfo(context.getPackageName(), 0);
                if (packageInfo != null) {
                    int i2 = packageInfo.versionCode;
                    c = i2;
                    return i2;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return 0;
    }

    public static boolean a() {
        try {
            Class.forName("androidx.appcompat.app.AppCompatActivity");
            return f13262a;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void a(boolean z) {
        f13262a = z;
    }
}
