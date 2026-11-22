package com.qumeng.overseas.advlib.__remote__.business.utils;

import android.app.Activity;
import android.os.SystemClock;
import android.text.TextUtils;
import com.qumeng.overseas.advlib.__remote__.core.ICliFactory;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.g;
import com.qumeng.overseas.advlib.__remote__.utils.j;
import com.qumeng.overseas.advlib.__remote__.utils.n;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes17.dex */
public class a {
    private static final String c = "AppLifeCycleReport";
    private static final String d = "report_app_use";
    private static final String e = "enterForeground";
    private static final String f = "exitForeground";
    private static final String g = "firstStart";
    public static volatile boolean h = false;
    private boolean b = false;

    /* renamed from: a, reason: collision with root package name */
    private long f12791a = SystemClock.elapsedRealtime();

    /* renamed from: com.qumeng.overseas.advlib.__remote__.business.utils.a$a, reason: collision with other inner class name */
    class RunnableC0780a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f12792a;
        final /* synthetic */ String b;
        final /* synthetic */ long c;

        RunnableC0780a(Activity activity, String str, long j) {
            this.f12792a = activity;
            this.b = str;
            this.c = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TextUtils.isEmpty(com.qumeng.overseas.advlib.__remote__.core.coreutils.a.O)) {
                g.a(this.f12792a, ICliFactory.mQmConfig);
                n.a(a.c, "get gaid -->> " + com.qumeng.overseas.advlib.__remote__.core.coreutils.a.O, new Object[0]);
            }
            a.this.a(this.b, this.c, this.f12792a);
        }
    }

    private void c(String str, long j, Activity activity) {
        j.b().postDelayed(new RunnableC0780a(activity, str, j), 500L);
    }

    public void b(Activity activity) {
        h = false;
        d(f, a(), activity);
    }

    public void d(Activity activity) {
        c(activity);
    }

    private void c(Activity activity) {
        d(g, 0L, activity);
        this.b = true;
    }

    private void d(String str, long j, Activity activity) {
        if (TextUtils.isEmpty(com.qumeng.overseas.advlib.__remote__.core.coreutils.a.O)) {
            c(str, j, activity);
        } else {
            a(str, j, activity);
        }
    }

    public void a(Activity activity) {
        h = true;
        if (this.b) {
            d(e, a(), activity);
        } else {
            c(activity);
        }
    }

    private Map<String, String> b(String str, long j, Activity activity) {
        HashMap hashMap = new HashMap();
        hashMap.put("op1", str);
        hashMap.put("opt_blockTime", String.valueOf(j));
        if (activity != null) {
            hashMap.put("opt_act_name", activity.getClass().getName());
        }
        return hashMap;
    }

    private long a() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.f12791a;
        this.f12791a = elapsedRealtime;
        return j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, long j, Activity activity) {
        com.qumeng.overseas.advlib.__remote__.utils.network.c.b(com.qumeng.overseas.advlib.__remote__.core.proto.utils.e.a(), new com.qumeng.overseas.advlib.__remote__.ui.incite.j("", 0), d, b(str, j, activity));
    }
}
