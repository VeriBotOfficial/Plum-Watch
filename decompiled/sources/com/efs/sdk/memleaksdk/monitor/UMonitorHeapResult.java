package com.efs.sdk.memleaksdk.monitor;

import android.os.Bundle;
import android.os.ResultReceiver;
import com.efs.sdk.memleaksdk.monitor.shark.g;

/* loaded from: classes14.dex */
public class UMonitorHeapResult extends ResultReceiver {

    /* renamed from: a, reason: collision with root package name */
    private a f9665a;

    public interface a {
        void a();

        void b();
    }

    public UMonitorHeapResult() {
        super(null);
    }

    public void a(a aVar) {
        this.f9665a = aVar;
    }

    @Override // android.os.ResultReceiver
    protected void onReceiveResult(int i, Bundle bundle) {
        super.onReceiveResult(i, bundle);
        try {
            a aVar = this.f9665a;
            if (aVar != null) {
                if (i == 1001) {
                    aVar.a();
                } else {
                    aVar.b();
                }
            }
        } catch (Throwable th) {
            g.b("UMonitorHeapResult", "onReceiveResult", th);
        }
    }
}
