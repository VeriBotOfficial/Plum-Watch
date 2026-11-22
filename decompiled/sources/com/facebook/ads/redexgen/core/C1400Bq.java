package com.facebook.ads.redexgen.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.facebook.ads.redexgen.X.Bq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1400Bq extends BroadcastReceiver {
    public final /* synthetic */ C1405Bv A00;

    public C1400Bq(C1405Bv c1405Bv) {
        this.A00 = c1405Bv;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (isInitialStickyBroadcast()) {
            return;
        }
        this.A00.A03();
    }
}
