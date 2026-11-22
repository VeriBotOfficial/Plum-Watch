package com.facebook.ads.redexgen.core;

import android.os.Parcel;

/* renamed from: com.facebook.ads.redexgen.X.Hy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1562Hy {
    public final int A00;
    public final long A01;

    public C1562Hy(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }

    public /* synthetic */ C1562Hy(int i, long j, C1561Hx c1561Hx) {
        this(i, j);
    }

    public static C1562Hy A00(Parcel parcel) {
        return new C1562Hy(parcel.readInt(), parcel.readLong());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02(Parcel parcel) {
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A01);
    }
}
