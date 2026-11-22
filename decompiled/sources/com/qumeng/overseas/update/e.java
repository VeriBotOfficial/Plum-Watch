package com.qumeng.overseas.update;

import android.content.Context;
import android.util.Log;
import com.qumeng.overseas.advlib.core.QMConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes17.dex */
public class e {
    private static b b;
    private static Context c;
    private static String e;
    private static volatile boolean g;

    /* renamed from: a, reason: collision with root package name */
    private static AtomicInteger f13458a = new AtomicInteger(0);
    private static long d = 0;
    private static volatile ClassLoader f = null;

    public static boolean a(QMConfig qMConfig, b bVar) {
        e = qMConfig.getVersionName();
        b = bVar;
        if (f13458a.getAndIncrement() > 0) {
            Log.e("_bootstrap", "Already loaded, give up ...");
            return false;
        }
        Context context = qMConfig.getContext();
        c = context;
        com.qumeng.overseas.advlib.common.c.a(context);
        d = System.currentTimeMillis();
        a();
        return false;
    }

    private static void a() {
        f = null;
        f = b.class.getClassLoader();
        try {
            for (Map.Entry<Class, String> entry : b.getClassMapping().entrySet()) {
                com.qumeng.overseas.advlib.common.a.c().a(entry.getKey(), f.loadClass(entry.getValue()));
            }
            g = true;
        } catch (Exception e2) {
            e2.printStackTrace();
            g = false;
        }
        a(false, false);
        d.a().a(c);
    }

    private static void a(boolean z, boolean z2) {
        HashMap hashMap = new HashMap();
        hashMap.put("opt_local_version", "1.049");
        hashMap.put("opt_new_inside_version", com.qumeng.overseas.advlib.__bootstrap__.a.f12775a);
        hashMap.put("opt_load_version", "1.049");
        hashMap.put("opt_is_update", "0");
        hashMap.put("opt_channel", "qumeng");
        hashMap.put("opt_is_androidx", String.valueOf(com.qumeng.overseas.advlib.common.e.a()));
        hashMap.put("opt_time", System.currentTimeMillis() + "");
        if (g) {
            com.qumeng.overseas.advlib.common.c.a(c, false, z, z2, d, 0L, (Map) hashMap);
        } else {
            com.qumeng.overseas.advlib.common.c.a(c, false, z, z2, "unknow", 0L, (Map) hashMap);
            f13458a.decrementAndGet();
        }
    }
}
