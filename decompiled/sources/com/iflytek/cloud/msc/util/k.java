package com.iflytek.cloud.msc.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Environment;
import com.iflytek.cloud.msc.util.log.DebugLog;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.MessageDigest;
import java.util.regex.Pattern;

/* loaded from: classes17.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f11191a = true;
    private static final Pattern b = Pattern.compile("[0-3][0-9a-f]{32}");
    private static String c = null;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f11192a;
        final /* synthetic */ String b;

        a(Context context, String str) {
            this.f11192a = context;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            k.b(this.f11192a, ".2F6E2C5B63F0F83B", this.b);
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f11193a;
        final /* synthetic */ String b;

        b(Context context, String str) {
            this.f11193a = context;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            k.b(this.f11193a, ".2F6E2C5B63F0F83B", this.b);
            k.c(this.f11193a, "com.iflytek.id", "pref.deviceid.key", this.b);
        }
    }

    private static String b(Context context, String str, String str2, String str3) {
        try {
            return context.getSharedPreferences(str, 0).getString(str2, str3);
        } catch (Throwable th) {
            DebugLog.LogS(th);
            return str3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, String str, String str2, String str3) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            if (sharedPreferences != null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putString(str2, str3);
                edit.commit();
            }
        } catch (Throwable th) {
            DebugLog.LogS(th);
        }
    }

    public static synchronized String d(Context context) {
        String str;
        synchronized (k.class) {
            if (c == null) {
                c = a(context);
            }
            str = c;
        }
        return str;
    }

    private static String a(Context context) {
        String a2 = a(context, ".2F6E2C5B63F0F83B");
        if (!b(a2)) {
            return a2;
        }
        String b2 = b(context, "com.iflytek.id", "pref.deviceid.key", null);
        if (!b(b2)) {
            new Thread(new a(context, b2)).start();
            return b2;
        }
        String c2 = c(context);
        new Thread(new b(context, c2)).start();
        return c2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, String str, String str2) {
        a(new File(Environment.getExternalStorageDirectory() + "/msc", str), str2);
    }

    private static String b(Context context) {
        com.iflytek.cloud.b.a b2 = com.iflytek.cloud.msc.util.a.b(context);
        String a2 = b2.a("os.imei");
        String a3 = b2.a("os.android_id");
        if (a2 == null && a3 == null) {
            return System.currentTimeMillis() + "";
        }
        StringBuilder append = new StringBuilder().append(a2).append('-').append(a3);
        if (f11191a) {
            append.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        }
        return append.toString();
    }

    private static String c(Context context) {
        return "2" + a(b(context));
    }

    private static final boolean b(String str) {
        return str == null || "".equals(str.trim()) || !b.matcher(str).matches();
    }

    private static String a(Context context, String str) {
        if (!Environment.getExternalStorageState().equals("mounted")) {
            return null;
        }
        try {
            DebugLog.LogD("create file:" + str);
            return a(new File(Environment.getExternalStorageDirectory() + "/msc", str));
        } catch (Throwable th) {
            DebugLog.LogS(th);
            return null;
        }
    }

    private static String a(File file) {
        try {
            if (!file.exists() || !file.canRead()) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[33];
            int read = fileInputStream.read(bArr);
            fileInputStream.close();
            return new String(bArr, 0, read);
        } catch (Throwable th) {
            DebugLog.LogS(th);
            return null;
        }
    }

    private static void a(File file, String str) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(str.getBytes());
            fileOutputStream.close();
            if (a(9)) {
                Class<?> cls = file.getClass();
                Class<?> cls2 = Boolean.TYPE;
                cls.getMethod("setReadable", cls2, cls2).invoke(file, Boolean.TRUE, Boolean.FALSE);
                return;
            }
            Runtime.getRuntime().exec("chmod 444 " + file.getAbsolutePath());
        } catch (Throwable th) {
            DebugLog.LogS(th);
        }
    }

    private static boolean a(int i) {
        return Build.VERSION.SDK_INT >= i;
    }

    private static String a(String str) {
        try {
            return a(MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8")));
        } catch (Exception unused) {
            return null;
        }
    }

    private static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            int i = b2 & 255;
            if (i < 16) {
                sb.append('0');
            }
            sb.append(Integer.toHexString(i));
        }
        return sb.toString();
    }
}
