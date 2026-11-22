package com.facebook.ads.redexgen.core;

import android.os.ConditionVariable;

/* loaded from: assets/audience_network.dex */
public class MD extends Thread {
    public final /* synthetic */ ConditionVariable A00;
    public final /* synthetic */ C2552ir A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MD(C2552ir c2552ir, String str, ConditionVariable conditionVariable) {
        super(str);
        this.A01 = c2552ir;
        this.A00 = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (AbstractC1907Vl.A02(this)) {
            return;
        }
        try {
            synchronized (this.A01) {
                try {
                    this.A00.open();
                    this.A01.A05();
                } finally {
                    th = th;
                    while (true) {
                        try {
                        } catch (Throwable th) {
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            AbstractC1907Vl.A00(th2, this);
        }
    }
}
