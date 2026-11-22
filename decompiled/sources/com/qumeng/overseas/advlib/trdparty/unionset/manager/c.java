package com.qumeng.overseas.advlib.trdparty.unionset.manager;

import android.os.SystemClock;
import android.text.TextUtils;
import com.qumeng.overseas.advlib.__remote__.ui.incite.j;
import com.qumeng.overseas.advlib.__remote__.utils.n;
import com.qumeng.overseas.advlib.__remote__.utils.s;
import com.qumeng.overseas.advlib.core.AdRequestParam;
import com.qumeng.overseas.advlib.core.QMConfig;
import com.qumeng.overseas.advlib.trdparty.unionset.common.f;
import com.qumeng.overseas.advlib.trdparty.unionset.manager.f;
import com.qumeng.overseas.advlib.trdparty.unionset.network.ScanAdBlockerDetection;
import com.qumeng.overseas.advlib.trdparty.unionset.network.SdkDelayConfigEntity;
import com.qumeng.overseas.advlib.trdparty.unionset.network.l;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes17.dex */
public class c {
    private static final String l = "AdPlatformManager";

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, com.qumeng.overseas.advlib.trdparty.unionset.common.f> f13389a;
    private int b;
    private Map<String, Integer> c;
    private Map<String, Integer> d;
    private final Map<String, Boolean> e;
    private final Map<String, com.qumeng.overseas.advlib.trdparty.unionset.common.f> f;
    private final Map<String, com.qumeng.overseas.advlib.trdparty.unionset.common.f> g;
    private int h;
    private long i;
    private final AtomicBoolean j;
    private final AtomicBoolean k;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.qumeng.overseas.advlib.trdparty.unionset.common.f f13390a;
        final /* synthetic */ QMConfig b;
        final /* synthetic */ f.a c;

        a(com.qumeng.overseas.advlib.trdparty.unionset.common.f fVar, QMConfig qMConfig, f.a aVar) {
            this.f13390a = fVar;
            this.b = qMConfig;
            this.c = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.qumeng.overseas.advlib.trdparty.unionset.common.f fVar = this.f13390a;
            if (fVar != null) {
                fVar.b(this.b, this.c);
            }
        }
    }

    class b implements f.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.qumeng.overseas.advlib.trdparty.unionset.common.f f13391a;
        final /* synthetic */ QMConfig b;

        b(com.qumeng.overseas.advlib.trdparty.unionset.common.f fVar, QMConfig qMConfig) {
            this.f13391a = fVar;
            this.b = qMConfig;
        }

        @Override // com.qumeng.overseas.advlib.trdparty.unionset.common.f.a
        public void onSdkInitCompleted() {
            try {
                c.this.e(this.f13391a);
                c.this.d(this.b, this.f13391a);
                com.qumeng.overseas.advlib.__remote__.core.e.a(this.f13391a, "SUCCESS");
                n.a(c.l, "onSdkInitCompleted ---->>> " + this.f13391a.b(), new Object[0]);
            } catch (Throwable unused) {
                c.this.d(this.b, this.f13391a);
                com.qumeng.overseas.advlib.__remote__.core.e.a(this.f13391a, "Throwable");
                n.b(c.l, "onSdkInitThrowable ---->>> " + this.f13391a.b(), new Object[0]);
            }
        }

        @Override // com.qumeng.overseas.advlib.trdparty.unionset.common.f.a
        public void onSdkInitFailed() {
            c.this.d(this.b, this.f13391a);
            com.qumeng.overseas.advlib.__remote__.core.e.a(this.f13391a, "FAILED");
            n.b(c.l, "onSdkInitFailed ---->>> " + this.f13391a.b(), new Object[0]);
        }
    }

    /* renamed from: com.qumeng.overseas.advlib.trdparty.unionset.manager.c$c, reason: collision with other inner class name */
    private static final class C0874c {

        /* renamed from: a, reason: collision with root package name */
        private static final c f13392a = new c(null);

        private C0874c() {
        }
    }

    /* synthetic */ c(a aVar) {
        this();
    }

    private void b(QMConfig qMConfig) {
        if (this.f13389a.isEmpty() || qMConfig == null) {
            return;
        }
        SdkDelayConfigEntity p = com.qumeng.overseas.advlib.__remote__.framework.config.a.k().p();
        if (p != null) {
            this.b = p.defaultTime;
            this.c = p.sdkDelaySwitch;
            this.d = p.sdkDelayTime;
        } else {
            this.c = new HashMap();
            this.d = new HashMap();
            for (f.b bVar : f.f13396a) {
                if (bVar != null && !TextUtils.isEmpty(bVar.f13397a) && bVar.b > 0) {
                    this.c.put(bVar.f13397a, 1);
                    this.d.put(bVar.f13397a, Integer.valueOf(bVar.b));
                }
            }
        }
        for (String str : this.f13389a.keySet()) {
            try {
                com.qumeng.overseas.advlib.trdparty.unionset.common.f fVar = this.f13389a.get(str);
                if (fVar != null) {
                    if (a(fVar) != 0 && !com.qumeng.overseas.advlib.trdparty.unionset.network.c.o.equals(fVar.b())) {
                        this.g.put(fVar.b(), fVar);
                    }
                    this.f.put(fVar.b(), fVar);
                }
            } catch (Throwable th) {
                n.b(l, "Error categorizing platform: " + str, th);
            }
        }
        if (this.f.isEmpty()) {
            n.a(l, "No platforms for immediate initialization, triggering onSdkInitCompleted directly.", new Object[0]);
            if (qMConfig.getListener() != null) {
                qMConfig.getListener().onPreSdkInitCompleted();
            }
        } else {
            for (com.qumeng.overseas.advlib.trdparty.unionset.common.f fVar2 : this.f.values()) {
                try {
                    n.a(l, "Initializing (Immediate) ---->>> " + fVar2.b(), new Object[0]);
                    fVar2.b(qMConfig, c(qMConfig, fVar2));
                } catch (Throwable th2) {
                    this.f.remove(fVar2.b());
                    n.b(l, "Error initializing platform: " + fVar2.b(), th2);
                }
            }
        }
        if (this.g.isEmpty()) {
            if (!this.f.isEmpty() || this.k.get()) {
                return;
            }
            this.k.set(true);
            if (qMConfig.getListener() != null) {
                qMConfig.getListener().onSdkInitCompleted();
                return;
            }
            return;
        }
        for (com.qumeng.overseas.advlib.trdparty.unionset.common.f fVar3 : this.g.values()) {
            try {
                int b2 = b(fVar3);
                n.a(l, "Scheduling (Delayed) ---->>> " + fVar3.b() + " with delay: " + b2, new Object[0]);
                a(fVar3, qMConfig, b2, c(qMConfig, fVar3));
            } catch (Throwable th3) {
                this.g.remove(fVar3.b());
                n.b(l, "Error scheduling delayed platform: " + fVar3.b(), th3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("opt_is_adblock", TextUtils.isEmpty(str) ? "0" : "1");
        hashMap.put("opt_adblock_list", TextUtils.isEmpty(str) ? "" : str);
        com.qumeng.overseas.advlib.__remote__.utils.network.c.b(null, new j(), "ad_blocker_detection", hashMap);
        n.c("detector_utils", "detectedPackages: " + str, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(com.qumeng.overseas.advlib.trdparty.unionset.common.f fVar) {
        if (fVar != null) {
            n.a(l, "setSdkInitCompleted true---->>> " + fVar.b(), new Object[0]);
            this.e.put(fVar.b(), Boolean.TRUE);
        }
    }

    public void c(com.qumeng.overseas.advlib.trdparty.unionset.common.f fVar) {
        if (fVar == null || !fVar.f() || TextUtils.isEmpty(fVar.b())) {
            return;
        }
        n.a(l, "registerAdPlatform ---->>> " + fVar.b(), new Object[0]);
        this.f13389a.put(fVar.b(), fVar);
    }

    private c() {
        this.f13389a = new ConcurrentHashMap();
        this.b = 3000;
        this.e = new ConcurrentHashMap();
        this.f = new ConcurrentHashMap();
        this.g = new ConcurrentHashMap();
        this.h = 0;
        this.i = 0L;
        this.j = new AtomicBoolean(false);
        this.k = new AtomicBoolean(false);
    }

    public static c a() {
        return C0874c.f13392a;
    }

    public void a(QMConfig qMConfig) {
        this.i = SystemClock.elapsedRealtime();
        c(new com.qumeng.overseas.advlib.trdparty.unionset.adapter.adx.factory.a().a());
        b(qMConfig);
    }

    private f.a c(QMConfig qMConfig, com.qumeng.overseas.advlib.trdparty.unionset.common.f fVar) {
        return new b(fVar, qMConfig);
    }

    private void a(com.qumeng.overseas.advlib.trdparty.unionset.common.f fVar, QMConfig qMConfig, int i, f.a aVar) {
        com.qumeng.overseas.advlib.__remote__.utils.j.a(new a(fVar, qMConfig, aVar), i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(QMConfig qMConfig, com.qumeng.overseas.advlib.trdparty.unionset.common.f fVar) {
        d(fVar);
        a(qMConfig, fVar);
    }

    public boolean c(String str) {
        n.a(l, "isSdkInitCompleted---->>> " + this.e, new Object[0]);
        int r = com.qumeng.overseas.advlib.__remote__.framework.config.a.k().r();
        if (this.e.isEmpty() || r != 1) {
            return true;
        }
        return this.e.containsKey(str) && Boolean.TRUE.equals(this.e.get(str));
    }

    private int a(com.qumeng.overseas.advlib.trdparty.unionset.common.f fVar) {
        Integer num;
        if (fVar == null || TextUtils.isEmpty(fVar.b()) || com.qumeng.overseas.advlib.trdparty.unionset.utils.b.a((Map<?, ?>) this.c) || (num = this.c.get(fVar.b())) == null) {
            return 0;
        }
        return num.intValue();
    }

    private void d(com.qumeng.overseas.advlib.trdparty.unionset.common.f fVar) {
        if (this.f.containsKey(fVar.b())) {
            this.f.remove(fVar.b());
        } else if (this.g.containsKey(fVar.b())) {
            this.g.remove(fVar.b());
        }
    }

    private void a(QMConfig qMConfig, com.qumeng.overseas.advlib.trdparty.unionset.common.f fVar) {
        b(qMConfig, fVar);
        if (!this.k.get() && this.f.isEmpty() && this.g.isEmpty()) {
            this.k.set(true);
            com.qumeng.overseas.advlib.__remote__.core.e.a(this.i, "all_success");
            try {
                ScanAdBlockerDetection o = com.qumeng.overseas.advlib.__remote__.framework.config.a.k().o();
                if (o != null) {
                    this.h = o.isEnableScanning;
                }
                if (this.h == 1) {
                    n.c("detector_utils", "start Scanning", new Object[0]);
                    s.a(qMConfig.getContext(), new s.a() { // from class: com.qumeng.overseas.advlib.trdparty.unionset.manager.c$$ExternalSyntheticLambda0
                        @Override // com.qumeng.overseas.advlib.__remote__.utils.s.a
                        public final void onDetected(String str) {
                            c.d(str);
                        }
                    });
                }
                n.c("detector_utils", "isEnableScanning: " + this.h, new Object[0]);
            } catch (Throwable th) {
                n.b("detector_utils", th.getMessage() != null ? th.getMessage() : "unknown ad plat", new Object[0]);
            }
            if (qMConfig == null || qMConfig.getListener() == null) {
                return;
            }
            n.a(l, "checkInitCompleted onAllSdkInitCompleted", new Object[0]);
            qMConfig.getListener().onSdkInitCompleted();
        }
    }

    public com.qumeng.overseas.advlib.trdparty.unionset.common.c a(com.qumeng.overseas.advlib.trdparty.unionset.network.a aVar, AdRequestParam adRequestParam, Map<String, com.qumeng.overseas.advlib.core.b> map) {
        if (aVar == null) {
            return null;
        }
        Iterator<String> it = this.f13389a.keySet().iterator();
        while (it.hasNext()) {
            com.qumeng.overseas.advlib.trdparty.unionset.common.f fVar = this.f13389a.get(it.next());
            if (fVar != null) {
                com.qumeng.overseas.advlib.trdparty.unionset.common.c a2 = fVar.a(aVar, adRequestParam);
                if (com.qumeng.overseas.advlib.trdparty.unionset.utils.b.a(a2)) {
                    if (com.qumeng.overseas.advlib.trdparty.unionset.utils.b.b((Map<?, ?>) map)) {
                        a2.a(map);
                    }
                    return a2;
                }
            }
        }
        return null;
    }

    public com.qumeng.overseas.advlib.trdparty.unionset.common.d a(String str, l lVar, long j) {
        com.qumeng.overseas.advlib.trdparty.unionset.common.f fVar = this.f13389a.get(str);
        if (fVar != null) {
            return fVar.a(lVar, j);
        }
        return null;
    }

    public void a(int i) {
        if (this.f13389a.isEmpty()) {
            return;
        }
        Iterator<String> it = this.f13389a.keySet().iterator();
        while (it.hasNext()) {
            this.f13389a.get(it.next()).b(i);
        }
    }

    public String a(String str) {
        com.qumeng.overseas.advlib.trdparty.unionset.common.f fVar;
        return (this.f13389a.isEmpty() || TextUtils.isEmpty(str) || (fVar = this.f13389a.get(str)) == null) ? "" : fVar.a();
    }

    private int b(com.qumeng.overseas.advlib.trdparty.unionset.common.f fVar) {
        if (fVar != null && !TextUtils.isEmpty(fVar.b()) && !com.qumeng.overseas.advlib.trdparty.unionset.utils.b.a((Map<?, ?>) this.d)) {
            Integer num = this.d.get(fVar.b());
            return num != null ? num.intValue() : this.b;
        }
        return this.b;
    }

    private void b(QMConfig qMConfig, com.qumeng.overseas.advlib.trdparty.unionset.common.f fVar) {
        if (fVar == null || qMConfig == null || this.j.get() || !this.f.isEmpty()) {
            return;
        }
        this.j.set(true);
        n.a(l, "checkInitPreCompleted onPreSdkInitCompleted", new Object[0]);
        if (qMConfig.getListener() != null) {
            qMConfig.getListener().onPreSdkInitCompleted();
        }
        com.qumeng.overseas.advlib.__remote__.core.e.a(this.i, "pre_success");
    }

    public boolean b(String str) {
        com.qumeng.overseas.advlib.trdparty.unionset.common.f fVar;
        if (this.f13389a.isEmpty() || TextUtils.isEmpty(str) || (fVar = this.f13389a.get(str)) == null) {
            return false;
        }
        return fVar.f();
    }
}
