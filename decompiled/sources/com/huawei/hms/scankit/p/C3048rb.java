package com.huawei.hms.scankit.p;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.camera.core.RetryPolicy;
import com.huawei.hms.feature.DynamicModuleInitializer;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.GrsClient;
import com.huawei.hms.hatool.HmsHiAnalyticsUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: HiAnalyticsLogExecutor.java */
/* renamed from: com.huawei.hms.scankit.p.rb, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C3048rb {

    /* renamed from: a, reason: collision with root package name */
    private static volatile C3048rb f10682a = new C3048rb();
    private volatile boolean d;
    private volatile long e;
    private Timer b = new Timer();
    private volatile boolean c = true;
    private final Lock f = new ReentrantLock();
    private List<a> g = new ArrayList(5);

    /* compiled from: HiAnalyticsLogExecutor.java */
    /* renamed from: com.huawei.hms.scankit.p.rb$a */
    private class a {

        /* renamed from: a, reason: collision with root package name */
        private String f10683a;
        private LinkedHashMap<String, String> b;

        /* synthetic */ a(C3048rb c3048rb, String str, LinkedHashMap linkedHashMap, C3045qb c3045qb) {
            this(str, linkedHashMap);
        }

        private a(String str, LinkedHashMap<String, String> linkedHashMap) {
            this.f10683a = str;
            this.b = linkedHashMap;
        }
    }

    /* compiled from: HiAnalyticsLogExecutor.java */
    /* renamed from: com.huawei.hms.scankit.p.rb$b */
    private class b extends TimerTask {
        private b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                C3048rb.this.c = true;
                HmsHiAnalyticsUtils.onReport();
            } catch (Exception e) {
                com.huawei.hms.scankit.util.a.b("ScanHiAnalytics", e.getMessage());
            }
        }

        /* synthetic */ b(C3048rb c3048rb, C3045qb c3045qb) {
            this();
        }
    }

    private C3048rb() {
    }

    private synchronized void b(String str, LinkedHashMap<String, String> linkedHashMap) {
        if (this.d) {
            c(str, linkedHashMap);
        } else {
            if (this.g.size() >= 100) {
                return;
            }
            this.g.add(new a(this, str, linkedHashMap, null));
        }
    }

    private void c(String str, LinkedHashMap<String, String> linkedHashMap) {
        HmsHiAnalyticsUtils.onEvent(0, str, linkedHashMap);
        HmsHiAnalyticsUtils.onEvent(1, str, linkedHashMap);
        if (this.c) {
            this.c = false;
            this.b.schedule(new b(this, null), 3000L);
        }
        com.huawei.hms.scankit.util.a.a("ScanHiAnalytics", linkedHashMap.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (!this.f.tryLock() || this.d) {
            return;
        }
        try {
            Context context = DynamicModuleInitializer.getContext();
            if (context == null) {
                return;
            }
            String a2 = a(context);
            if (a2 != null && !a2.isEmpty()) {
                HmsHiAnalyticsUtils.init(context, false, false, false, a2, context.getPackageName());
                HmsHiAnalyticsUtils.enableLog();
                b();
            }
        } finally {
            this.f.unlock();
        }
    }

    public static C3048rb a() {
        return f10682a;
    }

    public void a(String str, LinkedHashMap<String, String> linkedHashMap) {
        if (this.d) {
            c(str, linkedHashMap);
        } else {
            b(str, linkedHashMap);
            c();
        }
    }

    private synchronized void b() {
        this.d = true;
        for (a aVar : this.g) {
            c(aVar.f10683a, aVar.b);
        }
        this.g = null;
    }

    private void c() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.e > RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS) {
            this.e = currentTimeMillis;
            new C3045qb(this, "ScanHiAnalytics").start();
        }
    }

    private String a(Context context) {
        try {
            GrsBaseInfo grsBaseInfo = new GrsBaseInfo();
            String a2 = new C2981ab(context, false).a();
            Log.i("ScanHiAnalytics", "getCollectURL:localCountryCode " + a2);
            if (a2 != null && !a2.isEmpty() && !"UNKNOWN".equals(a2)) {
                grsBaseInfo.setSerCountry(a2.toUpperCase(Locale.ENGLISH));
            }
            GrsClient grsClient = new GrsClient(context, grsBaseInfo);
            String synGetGrsUrl = grsClient.synGetGrsUrl("com.huawei.cloud.mlkithianalytics", "ROOTNEW");
            if (TextUtils.isEmpty(synGetGrsUrl)) {
                synGetGrsUrl = grsClient.synGetGrsUrl("com.huawei.cloud.mlkithianalytics", "ROOT");
            }
            Log.i("ScanHiAnalytics", "grs get url success: " + synGetGrsUrl + "  countryCode = " + grsBaseInfo.getSerCountry());
            return synGetGrsUrl;
        } catch (RuntimeException | Exception unused) {
            return null;
        }
    }
}
