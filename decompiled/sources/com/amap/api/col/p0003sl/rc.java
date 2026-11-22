package com.amap.api.col.p0003sl;

import android.gov.nist.core.Separators;
import com.amap.api.col.p0003sl.qc;
import com.autonavi.aps.amapapi.config.Const;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: BasePool.java */
/* loaded from: classes11.dex */
public abstract class rc {

    /* renamed from: a, reason: collision with root package name */
    protected ThreadPoolExecutor f1861a;
    protected String b = "";
    private ConcurrentHashMap<qc, Future<?>> c = new ConcurrentHashMap<>();
    protected qc.a d = new a();

    /* compiled from: BasePool.java */
    final class a implements qc.a {
        a() {
        }

        public final void a(qc qcVar) {
            if (!(qcVar instanceof b)) {
                x.a("AMapThreadPool", "[" + rc.this.b + "] Task started executing | task=" + qcVar.getClass().getSimpleName(), false);
                return;
            }
            b bVar = (b) qcVar;
            bVar.b();
            x.a("AMapThreadPool", "[" + rc.this.b + "] Task started executing | task=" + bVar.f(), false);
        }

        public final void b(qc qcVar) {
            String simpleName;
            if (qcVar instanceof b) {
                b bVar = (b) qcVar;
                long c = bVar.c();
                simpleName = bVar.f();
                x.a("AMapThreadPool", "[" + rc.this.b + "] Task finished | task=" + simpleName + " | waitTime=" + (bVar.e() - bVar.d()) + "ms | executeTime=" + c + Const.SP_KEY_GSM_UPLOAD_MXSIZE, false);
            } else {
                simpleName = qcVar.getClass().getSimpleName();
                x.a("AMapThreadPool", "[" + rc.this.b + "] Task finished | task=" + simpleName, false);
            }
            rc.this.a(qcVar, false);
            rc.this.a("Task completed (" + simpleName + Separators.RPAREN);
        }

        public final void c(qc qcVar) {
            String f = qcVar instanceof b ? ((b) qcVar).f() : qcVar.getClass().getSimpleName();
            x.a("AMapThreadPool", "[" + rc.this.b + "] Task cancelled | task=" + f, false);
            rc.this.a(qcVar, true);
            rc.this.a("Task cancelled (" + f + Separators.RPAREN);
        }
    }

    /* compiled from: BasePool.java */
    private static class b extends qc {

        /* renamed from: a, reason: collision with root package name */
        private final qc f1863a;
        private long b;
        private long c;
        private long d;

        public b(qc qcVar) {
            this.f1863a = qcVar;
        }

        public final void a() {
            this.b = System.currentTimeMillis();
        }

        public final void b() {
            this.c = System.currentTimeMillis();
        }

        public final long c() {
            long currentTimeMillis = System.currentTimeMillis();
            this.d = currentTimeMillis;
            return currentTimeMillis - this.c;
        }

        public final long d() {
            return this.b;
        }

        public final long e() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            return obj instanceof b ? this.f1863a.equals(((b) obj).f1863a) : this.f1863a.equals(obj);
        }

        public final String f() {
            return this.f1863a.getClass().getSimpleName();
        }

        public final int hashCode() {
            return this.f1863a.hashCode();
        }

        @Override // com.amap.api.col.p0003sl.qc
        public final void runTask() {
            this.f1863a.runTask();
        }

        public final String toString() {
            return this.f1863a.toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(com.amap.api.col.p0003sl.qc r7) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.col.p0003sl.rc.b(com.amap.api.col.3sl.qc):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (this.f1861a != null) {
            x.a("AMapThreadPool", "[" + this.b + "] " + str + " | pool=" + this.f1861a.getPoolSize() + "/" + this.f1861a.getCorePoolSize() + "/" + this.f1861a.getMaximumPoolSize() + " | active=" + this.f1861a.getActiveCount() + " | queue=" + this.f1861a.getQueue().size() + " | pending=" + this.c.size() + " | completed=" + this.f1861a.getCompletedTaskCount(), false);
        }
    }

    protected final synchronized boolean a(qc qcVar) {
        boolean z;
        try {
            z = this.c.containsKey(qcVar);
        } catch (Throwable th) {
            ja.a(th, "TPool", "contain");
            th.printStackTrace();
            z = false;
        }
        return z;
    }

    protected final synchronized void a(qc qcVar, boolean z) {
        try {
            Future<?> remove = this.c.remove(qcVar);
            if (z && remove != null) {
                remove.cancel(true);
            }
        } catch (Throwable th) {
            ja.a(th, "TPool", "removeQueue");
            th.printStackTrace();
        }
    }

    public void a(long j, TimeUnit timeUnit) {
        try {
            ThreadPoolExecutor threadPoolExecutor = this.f1861a;
            if (threadPoolExecutor != null) {
                threadPoolExecutor.awaitTermination(j, timeUnit);
            }
        } catch (InterruptedException unused) {
        }
    }

    public void a() {
        try {
            Iterator<Map.Entry<qc, Future<?>>> it = this.c.entrySet().iterator();
            while (it.hasNext()) {
                Future<?> future = this.c.get(it.next().getKey());
                if (future != null) {
                    try {
                        future.cancel(true);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            this.c.clear();
        } catch (Throwable th) {
            ja.a(th, "TPool", "destroy");
            th.printStackTrace();
        }
        ThreadPoolExecutor threadPoolExecutor = this.f1861a;
        if (threadPoolExecutor != null) {
            threadPoolExecutor.shutdown();
        }
        a("Pool destroyed");
    }

    public Executor b() {
        return this.f1861a;
    }
}
