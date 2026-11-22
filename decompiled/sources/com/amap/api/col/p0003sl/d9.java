package com.amap.api.col.p0003sl;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.IBinder;
import android.os.Parcel;
import android.os.StatFs;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Xml;
import android.view.WindowManager;
import com.autonavi.aps.amapapi.config.Const;
import com.autonavi.aps.amapapi.storage.SdCardDbCreator;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: DeviceInfo.java */
/* loaded from: classes11.dex */
public class d9 {

    /* renamed from: a, reason: collision with root package name */
    static volatile String f1605a = "";
    static volatile String b = "";
    static volatile boolean c = true;
    private static String d = null;
    public static d e = null;
    private static volatile boolean f = false;
    private static String g = "";
    private static boolean h = false;
    private static boolean i = true;
    private static String j;
    private static IBinder k;
    private static long v;
    private static int w;
    private static String x;
    private static final AtomicBoolean l = new AtomicBoolean(false);
    private static boolean m = false;
    private static final AtomicBoolean n = new AtomicBoolean(false);
    private static String o = "";
    private static String p = "";

    /* renamed from: q, reason: collision with root package name */
    private static boolean f1606q = false;
    private static String r = "";
    private static String s = "";
    static String t = "";
    private static String u = "";
    private static String y = "";
    private static String z = "";
    private static boolean A = false;
    private static int B = -1;
    private static boolean C = false;
    private static int D = -1;
    private static boolean E = false;
    private static volatile e F = null;

    /* compiled from: DeviceInfo.java */
    static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f1607a;

        a(Context context) {
            this.f1607a = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                Map<String, String> b = d9.e.b();
                d dVar = d9.e;
                String t = d9.t(this.f1607a);
                d dVar2 = d9.e;
                String a2 = dVar.a(t, "", "", "");
                if (TextUtils.isEmpty(a2)) {
                    return;
                }
                String a3 = d9.e.a(this.f1607a, new String(hb.a().a(d9.e.a(a2.getBytes(), b)).f1837a));
                if (TextUtils.isEmpty(a3)) {
                    return;
                }
                d9.b = a3;
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: DeviceInfo.java */
    static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f1608a;

        b(Context context) {
            this.f1608a = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            d9.d(this.f1608a);
        }
    }

    /* compiled from: DeviceInfo.java */
    static class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f1609a;

        c(Context context) {
            this.f1609a = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            d9.e(this.f1609a.getApplicationContext());
        }
    }

    /* compiled from: DeviceInfo.java */
    public interface d {
        ob a(byte[] bArr, Map<String, String> map);

        String a();

        String a(Context context, String str);

        String a(String str, String str2, String str3, String str4);

        Map<String, String> b();
    }

    /* compiled from: DeviceInfo.java */
    static class f implements ServiceConnection {
        f() {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IBinder unused = d9.k = iBinder;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String A(android.content.Context r9) {
        /*
            java.lang.String r0 = "SIw"
            java.lang.String r1 = "LYW1hcF9kZXZpY2VfYWRpdQ"
            java.lang.String r1 = com.amap.api.col.p0003sl.m9.b(r1)
            java.lang.String r1 = com.amap.api.col.p0003sl.i9.c(r1)
            r2 = 0
            java.io.File r3 = r9.getExternalCacheDir()     // Catch: java.lang.Exception -> L1e
            if (r3 != 0) goto L17
            java.io.File r3 = r9.getCacheDir()     // Catch: java.lang.Exception -> L1e
        L17:
            if (r3 == 0) goto L1e
            java.lang.String r9 = r3.getAbsolutePath()     // Catch: java.lang.Exception -> L1e
            goto L1f
        L1e:
            r9 = r2
        L1f:
            boolean r3 = android.text.TextUtils.isEmpty(r9)
            java.lang.String r4 = ""
            if (r3 == 0) goto L28
            return r4
        L28:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r9 = r3.append(r9)
            java.lang.String r3 = java.io.File.separator
            java.lang.StringBuilder r9 = r9.append(r3)
            java.lang.String r3 = "KYmFja3Vwcw"
            java.lang.String r3 = com.amap.api.col.p0003sl.m9.b(r3)
            java.lang.StringBuilder r9 = r9.append(r3)
            java.lang.String r9 = r9.toString()
            java.io.File r3 = new java.io.File
            java.lang.String r5 = "MLmFkaXU"
            java.lang.String r5 = com.amap.api.col.p0003sl.m9.b(r5)
            r3.<init>(r9, r5)
            boolean r9 = r3.exists()
            if (r9 == 0) goto Lcd
            boolean r9 = r3.canRead()
            if (r9 != 0) goto L5e
            goto Lcd
        L5e:
            long r5 = r3.length()
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L6c
            r3.delete()
            return r4
        L6c:
            java.io.RandomAccessFile r9 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r5 = "r"
            r9.<init>(r3, r5)     // Catch: java.lang.Throwable -> Lc6
            r3 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> Lc3
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> Lc3
            r5.<init>()     // Catch: java.lang.Throwable -> Lc3
        L7c:
            int r2 = r9.read(r3)     // Catch: java.lang.Throwable -> Lc4
            r6 = -1
            r7 = 0
            if (r2 == r6) goto L88
            r5.write(r3, r7, r2)     // Catch: java.lang.Throwable -> Lc4
            goto L7c
        L88:
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> Lc4
            byte[] r3 = r5.toByteArray()     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r6 = "UTF-8"
            r2.<init>(r3, r6)     // Catch: java.lang.Throwable -> Lc4
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> Lc4
            if (r3 != 0) goto Lc4
            java.lang.String r3 = com.amap.api.col.p0003sl.m9.b(r0)     // Catch: java.lang.Throwable -> Lc4
            boolean r3 = r2.contains(r3)     // Catch: java.lang.Throwable -> Lc4
            if (r3 == 0) goto Lc4
            java.lang.String r0 = com.amap.api.col.p0003sl.m9.b(r0)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String[] r0 = r2.split(r0)     // Catch: java.lang.Throwable -> Lc4
            if (r0 == 0) goto Lc4
            int r2 = r0.length     // Catch: java.lang.Throwable -> Lc4
            r3 = 2
            if (r2 != r3) goto Lc4
            r2 = r0[r7]     // Catch: java.lang.Throwable -> Lc4
            boolean r1 = android.text.TextUtils.equals(r1, r2)     // Catch: java.lang.Throwable -> Lc4
            if (r1 == 0) goto Lc4
            r1 = 1
            r0 = r0[r1]     // Catch: java.lang.Throwable -> Lc4
            a(r5)
            a(r9)
            return r0
        Lc3:
            r5 = r2
        Lc4:
            r2 = r9
            goto Lc7
        Lc6:
            r5 = r2
        Lc7:
            a(r5)
            a(r2)
        Lcd:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.col.p0003sl.d9.A(android.content.Context):java.lang.String");
    }

    private static synchronized e B(Context context) {
        synchronized (d9.class) {
            if (F == null) {
                if (context == null) {
                    return null;
                }
                e eVar = new e();
                F = eVar;
                eVar.a(context.getApplicationContext());
            }
            return F;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(Context context, String str) {
        return context != null && context.checkCallingOrSelfPermission(str) == 0;
    }

    public static String c() {
        return o;
    }

    public static long d() {
        long j2 = v;
        if (j2 != 0) {
            return j2;
        }
        try {
            StatFs statFs = new StatFs(Environment.getRootDirectory().getAbsolutePath());
            StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
            v = ((statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 1048576) + ((statFs2.getBlockCountLong() * statFs2.getBlockSizeLong()) / 1048576);
        } catch (Throwable unused) {
        }
        return v;
    }

    public static String e() {
        return d;
    }

    public static String f(Context context) {
        if (!TextUtils.isEmpty(b)) {
            return b;
        }
        if (context == null) {
            return "";
        }
        String z2 = z(context);
        b = z2;
        if (!TextUtils.isEmpty(z2)) {
            return b;
        }
        if (e == null || f) {
            return "";
        }
        f = true;
        new Thread(new a(context), "ADIUFetchingThread").start();
        return "";
    }

    public static int g(Context context) {
        try {
            return x(context);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static String h(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        try {
            return (!b(context, m9.b("AYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19ORVRXT1JLX1NUQVRF")) || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) ? "" : activeNetworkInfo.getTypeName();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static int i(Context context) {
        try {
            return x(context);
        } catch (Throwable th) {
            th.printStackTrace();
            return -1;
        }
    }

    public static int j(Context context) {
        try {
            return y(context);
        } catch (Throwable th) {
            th.printStackTrace();
            return -1;
        }
    }

    public static String k(Context context) {
        try {
            return w(context);
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    public static String l(Context context) {
        return s + "#" + f(context) + "#" + p(context);
    }

    public static String m(Context context) {
        try {
            if (!b(context, m9.b("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU="))) {
                return y;
            }
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            return telephonyManager == null ? "" : telephonyManager.getNetworkOperatorName();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static NetworkInfo n(Context context) {
        ConnectivityManager connectivityManager;
        if (b(context, m9.b("AYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19ORVRXT1JLX1NUQVRF")) && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null) {
            return connectivityManager.getActiveNetworkInfo();
        }
        return null;
    }

    public static int o(Context context) {
        try {
            return y(context);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static String p(Context context) {
        String str;
        str = "";
        try {
            String str2 = s;
            try {
                if (TextUtils.isEmpty(str2)) {
                    str2 = f(context);
                }
                if (TextUtils.isEmpty(str2)) {
                    str2 = t(context);
                }
                if (TextUtils.isEmpty(str2)) {
                    str2 = q(context);
                }
                str = TextUtils.isEmpty(str2) ? "" : str2;
                return TextUtils.isEmpty(str) ? u(context) : str;
            } catch (Throwable unused) {
                return str2;
            }
        } catch (Throwable unused2) {
            return str;
        }
    }

    public static String q(Context context) {
        if (!i || h) {
            return "";
        }
        if (!TextUtils.isEmpty(g)) {
            return g;
        }
        if (l.compareAndSet(false, true)) {
            new Thread(new b(context), "OD-Thread").start();
        }
        return g;
    }

    public static int r(Context context) {
        int i2 = w;
        if (i2 != 0) {
            return i2;
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService(Const.STR_PROCESS_TAG);
        if (activityManager == null) {
            return 0;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        int i3 = ((int) (memoryInfo.totalMem / 1024)) / 1024;
        w = i3;
        return i3;
    }

    public static String s(Context context) {
        try {
            if (!TextUtils.isEmpty(j)) {
                return j;
            }
            byte[] digest = MessageDigest.getInstance(m9.b("IU0hBMQ")).digest(context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures[0].toByteArray());
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b2 : digest) {
                stringBuffer.append(Integer.toHexString((b2 & 255) | 256).substring(1, 3));
            }
            String stringBuffer2 = stringBuffer.toString();
            if (!TextUtils.isEmpty(stringBuffer2)) {
                j = stringBuffer2;
            }
            return stringBuffer2;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String t(Context context) {
        if (m) {
            return f1605a == null ? "" : f1605a;
        }
        if (f1605a != null && !"".equals(f1605a)) {
            return f1605a;
        }
        if (n.compareAndSet(false, true)) {
            new Thread(new c(context), "UD-Thread").start();
        }
        return f1605a == null ? "" : f1605a;
    }

    public static String u(Context context) {
        if (!TextUtils.isEmpty(u)) {
            return u;
        }
        try {
            String b2 = wa.b(context, "open_common", SdCardDbCreator.FIELD_LASTLOC_ID, "");
            if (TextUtils.isEmpty(b2)) {
                u = Const.STR_PUBLIC_TAG + UUID.randomUUID().toString().replace("_", "").toLowerCase();
                SharedPreferences.Editor a2 = wa.a(context, "open_common");
                wa.a(a2, SdCardDbCreator.FIELD_LASTLOC_ID, m9.f(u));
                wa.a(a2);
            } else {
                u = m9.b(b2);
            }
            return u;
        } catch (Throwable unused) {
            return u;
        }
    }

    private static String w(Context context) {
        if (A) {
            return z;
        }
        B(context);
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            return z;
        }
        String simOperatorName = telephonyManager.getSimOperatorName();
        z = simOperatorName;
        if (TextUtils.isEmpty(simOperatorName)) {
            z = telephonyManager.getNetworkOperatorName();
        }
        A = true;
        return z;
    }

    private static int x(Context context) {
        if (C) {
            return B;
        }
        B(context);
        if (context == null || !b(context, m9.b("AYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19ORVRXT1JLX1NUQVRF"))) {
            return B;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return B;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            C = true;
            return B;
        }
        int type = activeNetworkInfo.getType();
        B = type;
        C = true;
        return type;
    }

    private static int y(Context context) {
        if (E) {
            return D;
        }
        B(context);
        if (!b(context, m9.b("AYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19ORVRXT1JLX1NUQVRF"))) {
            return D;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return D;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
            D = activeNetworkInfo.getSubtype();
            E = true;
        }
        return D;
    }

    private static String z(Context context) {
        String str;
        if (!c) {
            return "";
        }
        try {
            str = A(context);
        } catch (Throwable unused) {
            str = "";
        }
        try {
            if (TextUtils.isEmpty(str)) {
                str = context.getSharedPreferences(m9.b("SU2hhcmVkUHJlZmVyZW5jZUFkaXU"), 0).getString(i9.c(m9.b("RYW1hcF9kZXZpY2VfYWRpdQ")), "");
            }
        } catch (Throwable unused2) {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            c = false;
            return "";
        }
        try {
            byte[] bytes = m9.b("MAAAAAAAAAAAAAAAAAAAAAA").getBytes("UTF-8");
            return new String(f9.b(m9.b("HYW1hcGFkaXVhbWFwYWRpdWFtYXBhZGl1YW1hcGFkaXU").getBytes("UTF-8"), f9.a(str), bytes), "UTF-8");
        } catch (Throwable unused3) {
            c = false;
            return "";
        }
    }

    static String b(Context context) {
        String str;
        try {
            str = r;
        } catch (Throwable unused) {
        }
        if (str != null && !"".equals(str)) {
            return r;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            return "";
        }
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        int i2 = displayMetrics.widthPixels;
        int i3 = displayMetrics.heightPixels;
        r = (i3 > i2 ? new StringBuilder().append(i2).append("*").append(i3) : new StringBuilder().append(i3).append("*").append(i2)).toString();
        return r;
    }

    static String c(Context context) {
        try {
            return w(context);
        } catch (Throwable unused) {
            return "";
        }
    }

    static void e(Context context) {
        String str = "";
        try {
            if (b(context, m9.b("WYW5kcm9pZC5wZXJtaXNzaW9uLldSSVRFX1NFVFRJTkdT"))) {
                f1605a = Settings.System.getString(context.getContentResolver(), "mqBRboGZkQPcAkyk");
            }
            if (!TextUtils.isEmpty(f1605a)) {
                m = true;
                return;
            }
        } catch (Throwable unused) {
        }
        try {
            String b2 = wa.b(context, "Alvin2", "UTDID2", "");
            str = TextUtils.isEmpty(b2) ? wa.b(context, "Alvin2", "UTDID", "") : b2;
        } catch (Throwable unused2) {
        }
        try {
            f1605a = str;
            if (!TextUtils.isEmpty(str)) {
                m = true;
                return;
            }
        } catch (Throwable unused3) {
        }
        try {
            f1605a = v(context);
            m = true;
        } catch (Throwable unused4) {
        }
    }

    private static String v(Context context) {
        FileInputStream fileInputStream;
        XmlPullParser newPullParser;
        int eventType;
        try {
            File file = new File(context.getExternalCacheDir().getAbsolutePath() + "/.UTSystemConfig/Global/Alvin2.xml");
            newPullParser = Xml.newPullParser();
            fileInputStream = new FileInputStream(file);
        } catch (Throwable unused) {
            fileInputStream = null;
        }
        try {
            newPullParser.setInput(fileInputStream, "utf-8");
            boolean z2 = false;
            for (eventType = newPullParser.getEventType(); 1 != eventType; eventType = newPullParser.next()) {
                if (eventType != 2) {
                    if (eventType == 3) {
                        z2 = false;
                    } else if (eventType == 4 && z2) {
                        String text = newPullParser.getText();
                        try {
                            fileInputStream.close();
                        } catch (Throwable unused2) {
                        }
                        return text;
                    }
                } else if (newPullParser.getAttributeCount() > 0) {
                    int attributeCount = newPullParser.getAttributeCount();
                    for (int i2 = 0; i2 < attributeCount; i2++) {
                        String attributeValue = newPullParser.getAttributeValue(i2);
                        if ("UTDID2".equals(attributeValue) || "UTDID".equals(attributeValue)) {
                            z2 = true;
                        }
                    }
                }
            }
        } catch (Throwable unused3) {
            if (fileInputStream == null) {
                return "";
            }
            fileInputStream.close();
            return "";
        }
        try {
            fileInputStream.close();
            return "";
        } catch (Throwable unused4) {
            return "";
        }
    }

    public static void a(String str) {
        d = str;
    }

    private static String a(Context context, int i2) {
        try {
            Intent intent = new Intent();
            if (i2 == 2) {
                intent.setAction(m9.b("WY29tLnVvZGlzLm9wZW5kZXZpY2UuT1BFTklEU19TRVJWSUNF"));
                intent.setPackage(m9.b("UY29tLmh1YXdlaS5od2lk"));
            } else if (i2 == 4) {
                intent.setClassName(m9.b("WY29tLnNhbXN1bmcuYW5kcm9pZC5kZXZpY2VpZHNlcnZpY2U"), m9.b("QY29tLnNhbXN1bmcuYW5kcm9pZC5kZXZpY2VpZHNlcnZpY2UuRGV2aWNlSWRTZXJ2aWNl"));
            } else {
                if (i2 != 5) {
                    h = true;
                    return g;
                }
                intent.setClassName(m9.b("YY29tLmhleXRhcC5vcGVuaWQ"), m9.b("SY29tLmhleXRhcC5vcGVuaWQuSWRlbnRpZnlTZXJ2aWNl"));
                intent.setAction(m9.b("EYWN0aW9uLmNvbS5oZXl0YXAub3BlbmlkLk9QRU5fSURfU0VSVklDRQ"));
            }
            f fVar = new f();
            if (context.bindService(intent, fVar, 1)) {
                int i3 = 0;
                while (i3 < 100 && TextUtils.isEmpty(g)) {
                    i3++;
                    if (k != null) {
                        Parcel obtain = Parcel.obtain();
                        Parcel obtain2 = Parcel.obtain();
                        if (i2 == 2) {
                            obtain.writeInterfaceToken(m9.b("UY29tLnVvZGlzLm9wZW5kZXZpY2UuYWlkbC5PcGVuRGV2aWNlSWRlbnRpZmllclNlcnZpY2U"));
                        } else if (i2 == 4) {
                            obtain.writeInterfaceToken(m9.b("UY29tLnNhbXN1bmcuYW5kcm9pZC5kZXZpY2VpZHNlcnZpY2UuSURldmljZUlkU2VydmljZQ"));
                        } else {
                            if (i2 == 5) {
                                try {
                                    obtain.writeInterfaceToken(m9.b("KY29tLmhleXRhcC5vcGVuaWQuSU9wZW5JRA"));
                                    obtain.writeString(context.getPackageName());
                                    obtain.writeString(s(context));
                                    obtain.writeString(m9.b("IT1VJRA"));
                                } finally {
                                    try {
                                        obtain.recycle();
                                        Thread.sleep(15L);
                                    } catch (Throwable th) {
                                    }
                                }
                            }
                            obtain2.recycle();
                            obtain.recycle();
                        }
                        k.transact(1, obtain, obtain2, 0);
                        obtain2.readException();
                        g = obtain2.readString();
                        obtain2.recycle();
                        obtain.recycle();
                    }
                    Thread.sleep(15L);
                }
                context.unbindService(fVar);
                k = null;
            }
            return g;
        } catch (Throwable th2) {
            fa.a(th2, "oa", String.valueOf(i2));
            h = true;
            return g;
        }
    }

    /* compiled from: DeviceInfo.java */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        private static BroadcastReceiver f1610a;
        private static ConnectivityManager b;
        private static NetworkRequest c;
        private static ConnectivityManager.NetworkCallback d;

        /* compiled from: DeviceInfo.java */
        final class a extends BroadcastReceiver {
            a(e eVar) {
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                if (m9.b("WYW5kcm9pZC5uZXQuY29ubi5DT05ORUNUSVZJVFlfQ0hBTkdF").equals(intent.getAction())) {
                    d9.f();
                }
            }
        }

        /* compiled from: DeviceInfo.java */
        final class b extends ConnectivityManager.NetworkCallback {
            b(e eVar) {
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onAvailable(Network network) {
                super.onAvailable(network);
                d9.f();
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onLost(Network network) {
                super.onLost(network);
                d9.f();
            }
        }

        public final void a(Context context) {
            if (d9.b(context, m9.b("AYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19ORVRXT1JLX1NUQVRF")) && context != null && b == null) {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                b = connectivityManager;
                if (connectivityManager != null) {
                    c = new NetworkRequest.Builder().addCapability(12).addTransportType(1).addTransportType(0).build();
                    b bVar = new b(this);
                    d = bVar;
                    b.registerNetworkCallback(c, bVar);
                }
            }
        }
    }

    public static String b() {
        return s;
    }

    static String d(Context context) {
        String b2 = m9.b("IeGlhb21p");
        String str = Build.MANUFACTURER;
        if (!b2.equalsIgnoreCase(str)) {
            String b3 = m9.b("IeGlhb21p");
            String str2 = Build.BRAND;
            if (!b3.equalsIgnoreCase(str2) && !m9.b("IUkVETUk=").equalsIgnoreCase(str) && !m9.b("IUkVETUk=").equalsIgnoreCase(str2)) {
                if (!m9.b("Idml2bw").equalsIgnoreCase(str) && !m9.b("Idml2bw").equalsIgnoreCase(str2)) {
                    if (!m9.b("IaHVhd2Vp").equalsIgnoreCase(str) && !m9.b("IaHVhd2Vp").equalsIgnoreCase(str2) && !m9.b("ISE9OT1I=").equalsIgnoreCase(str)) {
                        if (!m9.b("Mc2Ftc3VuZw").equalsIgnoreCase(str) && !m9.b("Mc2Ftc3VuZw").equalsIgnoreCase(str2)) {
                            if (!m9.b("IT1BQTw").equalsIgnoreCase(str) && !m9.b("IT1BQTw").equalsIgnoreCase(str2) && !m9.b("MT25lUGx1cw").equalsIgnoreCase(str) && !m9.b("MT25lUGx1cw").equalsIgnoreCase(str2) && !m9.b("IUkVBTE1F").equalsIgnoreCase(str2)) {
                                h = true;
                                return g;
                            }
                            return a(context, 5);
                        }
                        return a(context, 4);
                    }
                    return a(context, 2);
                }
                try {
                    Cursor query = context.getContentResolver().query(Uri.parse(m9.b("QY29udGVudDovL2NvbS52aXZvLnZtcy5JZFByb3ZpZGVyL0lkZW50aWZpZXJJZC9PQUlE")), null, null, null, null);
                    if (query != null) {
                        while (query.moveToNext()) {
                            int columnCount = query.getColumnCount();
                            int i2 = 0;
                            while (true) {
                                if (i2 >= columnCount) {
                                    break;
                                }
                                if (m9.b("IdmFsdWU").equals(query.getColumnName(i2))) {
                                    g = query.getString(i2);
                                    break;
                                }
                                i2++;
                            }
                        }
                        query.close();
                    }
                } catch (Throwable th) {
                    h = true;
                    fa.a(th, "oa", "vivo");
                }
                return g;
            }
        }
        try {
            Class<?> cls = Class.forName(m9.b("WY29tLmFuZHJvaWQuaWQuaW1wbC5JZFByb3ZpZGVySW1wbA"));
            Object invoke = cls.getMethod(m9.b("MZ2V0T0FJRA"), Context.class).invoke(cls.newInstance(), context);
            if (invoke != null) {
                String str3 = (String) invoke;
                g = str3;
                return str3;
            }
        } catch (Throwable th2) {
            fa.a(th2, "oa", "xm");
            h = true;
        }
        return g;
    }

    public static void f() {
        B = -1;
        C = false;
        D = -1;
        E = false;
        z = "";
        A = false;
        p = "";
        f1606q = false;
    }

    public static void a(boolean z2) {
        i = z2;
    }

    static String a(Context context) {
        TelephonyManager telephonyManager;
        if (f1606q) {
            return p;
        }
        try {
            B(context);
            telephonyManager = (TelephonyManager) context.getSystemService("phone");
        } catch (Throwable unused) {
        }
        if (telephonyManager == null) {
            return p;
        }
        String networkOperator = telephonyManager.getNetworkOperator();
        if (!TextUtils.isEmpty(networkOperator) && networkOperator.length() >= 3) {
            p = networkOperator.substring(3);
            f1606q = true;
            return p;
        }
        f1606q = true;
        return p;
    }

    public static String a() {
        if (!TextUtils.isEmpty(x)) {
            return x;
        }
        String property = System.getProperty("os.arch");
        x = property;
        return property;
    }

    private static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }
}
