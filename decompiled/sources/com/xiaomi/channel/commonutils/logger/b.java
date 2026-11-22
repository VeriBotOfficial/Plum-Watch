package com.xiaomi.channel.commonutils.logger;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import com.xiaomi.push.j;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static int f14348a = 2;

    /* renamed from: a, reason: collision with other field name */
    private static Context f76a = null;

    /* renamed from: a, reason: collision with other field name */
    private static boolean f82a = false;

    /* renamed from: b, reason: collision with other field name */
    private static boolean f83b = false;

    /* renamed from: a, reason: collision with other field name */
    private static String f79a = "XMPush-" + Process.myPid();

    /* renamed from: a, reason: collision with other field name */
    private static LoggerInterface f77a = new a();

    /* renamed from: a, reason: collision with other field name */
    private static final HashMap<Integer, Long> f80a = new HashMap<>();
    private static final HashMap<Integer, String> b = new HashMap<>();

    /* renamed from: a, reason: collision with other field name */
    private static final Integer f78a = -1;

    /* renamed from: a, reason: collision with other field name */
    private static AtomicInteger f81a = new AtomicInteger(1);

    /* renamed from: a, reason: collision with other method in class */
    private static boolean m11784a() {
        return false;
    }

    static class a implements LoggerInterface {

        /* renamed from: a, reason: collision with root package name */
        private String f14349a = b.f79a;

        a() {
        }

        @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
        public void setTag(String str) {
            this.f14349a = str;
        }

        @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
        public void log(String str) {
            Log.v(this.f14349a, str);
        }

        @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
        public void log(String str, Throwable th) {
            Log.v(this.f14349a, str, th);
        }
    }

    public static void a(LoggerInterface loggerInterface) {
        f77a = loggerInterface;
    }

    /* renamed from: a, reason: collision with other method in class */
    private static boolean m11785a(int i) {
        return i >= f14348a || m11784a();
    }

    /* renamed from: a, reason: collision with other method in class */
    public static void m11781a(String str) {
        if (m11785a(2)) {
            a(2, m11780a(str));
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static void m11782a(String str, String str2) {
        if (m11785a(2)) {
            a(2, b(str, str2));
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static void m11783a(String str, Object... objArr) {
        if (m11785a(2)) {
            a(2, a(str, objArr));
        }
    }

    public static void b(String str) {
        if (m11785a(0)) {
            a(0, m11780a(str));
        }
    }

    public static void c(String str) {
        if (m11785a(0)) {
            a(1, m11780a(str));
        }
    }

    /* renamed from: b, reason: collision with other method in class */
    public static void m11786b(String str, String str2) {
        if (m11785a(1)) {
            a(1, b(str, str2));
        }
    }

    public static void b(String str, Object... objArr) {
        if (m11785a(1)) {
            a(1, a(str, objArr));
        }
    }

    public static void a(String str, Throwable th) {
        if (m11785a(4)) {
            a(4, m11780a(str), th);
        }
    }

    public static void a(Throwable th) {
        if (m11785a(4)) {
            a(4, th);
        }
    }

    public static void d(String str) {
        if (m11785a(4)) {
            a(4, m11780a(str));
        }
    }

    public static void c(String str, String str2) {
        if (m11785a(4)) {
            a(4, b(str, str2));
        }
    }

    public static Integer a(String str) {
        if (f14348a <= 1) {
            Integer valueOf = Integer.valueOf(f81a.incrementAndGet());
            f80a.put(valueOf, Long.valueOf(System.currentTimeMillis()));
            b.put(valueOf, str);
            f77a.log(str + " starts");
            return valueOf;
        }
        return f78a;
    }

    public static void a(Integer num) {
        if (f14348a <= 1) {
            HashMap<Integer, Long> hashMap = f80a;
            if (hashMap.containsKey(num)) {
                long longValue = hashMap.remove(num).longValue();
                f77a.log(b.remove(num) + " ends in " + (System.currentTimeMillis() - longValue) + " ms");
            }
        }
    }

    public static void a(int i, String str) {
        if (i >= f14348a) {
            f77a.log(str);
        } else if (m11784a()) {
            Log.d("MyLog", "-->log(" + i + "): " + str);
        }
    }

    public static void a(int i, Throwable th) {
        if (i >= f14348a) {
            f77a.log("", th);
        } else if (m11784a()) {
            Log.w("MyLog", "-->log(" + i + "): ", th);
        }
    }

    public static void a(int i, String str, Throwable th) {
        if (i >= f14348a) {
            f77a.log(str, th);
        } else if (m11784a()) {
            Log.w("MyLog", "-->log(" + i + "): " + str, th);
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    private static String m11780a(String str) {
        return b() + str;
    }

    private static String b(String str, String str2) {
        return b() + a(str, str2);
    }

    private static String a(String str, Object... objArr) {
        StringBuilder sb = new StringBuilder("[Tid:");
        sb.append(Thread.currentThread().getId()).append("] [");
        sb.append(str).append("] ");
        if (objArr != null && objArr.length > 0) {
            for (Object obj : objArr) {
                sb.append(obj);
            }
        }
        return sb.toString();
    }

    public static String a(String str, String str2) {
        return "[" + str + "] " + str2;
    }

    private static String b() {
        return "[Tid:" + Thread.currentThread().getId() + "] ";
    }

    public static void a(int i) {
        if (i < 0 || i > 5) {
            a(2, "set log level as " + i);
        }
        f14348a = i;
    }

    public static int a() {
        return f14348a;
    }

    public static void a(Context context) {
        f76a = context;
        if (j.m12358a(context)) {
            f82a = true;
        }
        if (j.m12357a()) {
            f83b = true;
        }
    }

    public static void e(String str) {
        if (f82a) {
            m11781a(str);
            return;
        }
        Log.w(f79a, m11780a(str));
        if (f83b) {
            return;
        }
        m11781a(str);
    }

    public static void d(String str, String str2) {
        if (f82a) {
            m11782a(str, str2);
            return;
        }
        Log.w(f79a, b(str, str2));
        if (f83b) {
            return;
        }
        m11782a(str, str2);
    }
}
