package com.facebook.ads.redexgen.core;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.da, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2243da extends ContentObserver {
    public final C1437Dc A00;

    public C2243da(Handler handler, C1437Dc c1437Dc) {
        super(handler);
        this.A00 = c1437Dc;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return false;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.A00.A0f();
    }
}
