package com.amap.api.col.p0003sl;

import android.os.SystemClock;
import com.amap.api.col.p0003sl.rc;
import com.autonavi.aps.amapapi.config.Const;

/* compiled from: ThreadTask.java */
/* loaded from: classes11.dex */
public abstract class qc implements Runnable {
    a g;

    /* compiled from: ThreadTask.java */
    interface a {
    }

    public final void cancelTask() {
        try {
            a aVar = this.g;
            if (aVar != null) {
                ((rc.a) aVar).c(this);
            }
        } catch (Throwable th) {
            ja.a(th, "ThreadTask", "cancelTask");
            th.printStackTrace();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            a aVar = this.g;
            if (aVar != null) {
                ((rc.a) aVar).a(this);
            }
            if (Thread.interrupted()) {
                x.a("AMapThreadPool", "Task interrupted | task=" + getClass().getSimpleName(), false);
                return;
            }
            runTask();
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            if (Thread.interrupted()) {
                x.a("AMapThreadPool", "Task interrupted after run | task=" + getClass().getSimpleName() + " | elapsed=" + elapsedRealtime2 + Const.SP_KEY_GSM_UPLOAD_MXSIZE, false);
                return;
            }
            x.a("AMapThreadPool", "Task finished | task=" + getClass().getSimpleName() + " | elapsed=" + elapsedRealtime2 + Const.SP_KEY_GSM_UPLOAD_MXSIZE, false);
            a aVar2 = this.g;
            if (aVar2 != null) {
                ((rc.a) aVar2).b(this);
            }
        } catch (Throwable th) {
            ja.a(th, "ThreadTask", "run");
            th.printStackTrace();
        }
    }

    public abstract void runTask();
}
