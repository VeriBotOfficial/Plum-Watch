package com.xiaomi.push;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.xiaomi.push.ag;
import io.nats.client.support.ApiConstants;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public class ga {

    /* renamed from: a, reason: collision with other field name */
    private static ag f562a = new ag(true);

    /* renamed from: a, reason: collision with root package name */
    private static volatile int f14611a = -1;

    /* renamed from: a, reason: collision with other field name */
    private static long f561a = System.currentTimeMillis();

    /* renamed from: a, reason: collision with other field name */
    private static final Object f564a = new Object();

    /* renamed from: a, reason: collision with other field name */
    private static List<a> f566a = Collections.synchronizedList(new ArrayList());

    /* renamed from: a, reason: collision with other field name */
    private static String f565a = "";

    /* renamed from: a, reason: collision with other field name */
    private static com.xiaomi.push.providers.a f563a = null;

    /* renamed from: a, reason: collision with other method in class */
    public static void m12188a(Context context) {
        f14611a = b(context);
    }

    public static int a(Context context) {
        if (f14611a == -1) {
            f14611a = b(context);
        }
        return f14611a;
    }

    private static int b(Context context) {
        aw m11877a = av.m11877a();
        if (m11877a == null) {
            return -1;
        }
        return m11877a.a();
    }

    /* renamed from: a, reason: collision with other method in class */
    private static synchronized String m12186a(Context context) {
        synchronized (ga.class) {
            if (!TextUtils.isEmpty(f565a)) {
                return f565a;
            }
            return "";
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static synchronized void m12189a(String str) {
        synchronized (ga.class) {
            if (!j.m12364d() && !TextUtils.isEmpty(str)) {
                f565a = str;
            }
        }
    }

    public static void a(Context context, String str, long j, boolean z, boolean z2, long j2) {
        a(context, str, a(a(context), j, z, j2, z2), z, j2);
    }

    private static void a(final Context context, String str, long j, boolean z, long j2) {
        int a2;
        boolean isEmpty;
        if (context == null || TextUtils.isEmpty(str) || !"com.xiaomi.xmsf".equals(context.getPackageName()) || "com.xiaomi.xmsf".equals(str) || -1 == (a2 = a(context))) {
            return;
        }
        synchronized (f564a) {
            isEmpty = f566a.isEmpty();
            a(new a(str, j2, a2, z ? 1 : 0, a2 == 0 ? m12186a(context) : "", j));
        }
        if (isEmpty) {
            f562a.a(new ag.b() { // from class: com.xiaomi.push.ga.1
                @Override // com.xiaomi.push.ag.b
                public void b() {
                    ArrayList arrayList;
                    synchronized (ga.f564a) {
                        arrayList = new ArrayList(ga.f566a);
                        ga.f566a.clear();
                    }
                    ga.b(context, arrayList);
                }
            }, 5000L);
        }
    }

    private static long a(int i, long j, boolean z, long j2, boolean z2) {
        if (z && z2) {
            long j3 = f561a;
            f561a = j2;
            if (j2 - j3 > 30000 && j > 1024) {
                return j * 2;
            }
        }
        return (j * (i == 0 ? 13 : 11)) / 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, List<a> list) {
        try {
            synchronized (com.xiaomi.push.providers.a.f934a) {
                SQLiteDatabase writableDatabase = m12185a(context).getWritableDatabase();
                writableDatabase.beginTransaction();
                try {
                    for (a aVar : list) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("package_name", aVar.f568a);
                        contentValues.put("message_ts", Long.valueOf(aVar.f567a));
                        contentValues.put("network_type", Integer.valueOf(aVar.f14613a));
                        contentValues.put(ApiConstants.BYTES, Long.valueOf(aVar.f569b));
                        contentValues.put("rcv", Integer.valueOf(aVar.b));
                        contentValues.put("imsi", aVar.f570b);
                        writableDatabase.insert(com.umeng.analytics.pro.d.F, null, contentValues);
                    }
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.b.a(th);
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    private static com.xiaomi.push.providers.a m12185a(Context context) {
        com.xiaomi.push.providers.a aVar = f563a;
        if (aVar != null) {
            return aVar;
        }
        com.xiaomi.push.providers.a aVar2 = new com.xiaomi.push.providers.a(context);
        f563a = aVar2;
        return aVar2;
    }

    public static int a(String str) {
        try {
            return str.getBytes("UTF-8").length;
        } catch (UnsupportedEncodingException unused) {
            return str.getBytes().length;
        }
    }

    private static void a(a aVar) {
        for (a aVar2 : f566a) {
            if (aVar2.a(aVar)) {
                aVar2.f569b += aVar.f569b;
                return;
            }
        }
        f566a.add(aVar);
    }

    static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f14613a;

        /* renamed from: a, reason: collision with other field name */
        public long f567a;

        /* renamed from: a, reason: collision with other field name */
        public String f568a;
        public int b;

        /* renamed from: b, reason: collision with other field name */
        public long f569b;

        /* renamed from: b, reason: collision with other field name */
        public String f570b;

        public a(String str, long j, int i, int i2, String str2, long j2) {
            this.f568a = str;
            this.f567a = j;
            this.f14613a = i;
            this.b = i2;
            this.f570b = str2;
            this.f569b = j2;
        }

        public boolean a(a aVar) {
            return TextUtils.equals(aVar.f568a, this.f568a) && TextUtils.equals(aVar.f570b, this.f570b) && aVar.f14613a == this.f14613a && aVar.b == this.b && Math.abs(aVar.f567a - this.f567a) <= 5000;
        }
    }
}
