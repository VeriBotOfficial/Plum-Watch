package com.facebook.ads.redexgen.core;

import com.facebook.ads.redexgen.core.E5;

/* loaded from: assets/audience_network.dex */
public abstract class E5<T extends E5<T>> {
    public final int A00;
    public final int A01;
    public final C2905or A02;
    public final C2871oH A03;

    public abstract int A08();

    public abstract boolean A09(T t);

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.E5 != com.facebook.ads.androidx.media3.exoplayer.trackselection.DefaultTrackSelector$TrackInfo<T extends com.facebook.ads.redexgen.X.E5<T>> */
    public E5(int i, C2871oH c2871oH, int i2) {
        this.A00 = i;
        this.A03 = c2871oH;
        this.A01 = i2;
        this.A02 = c2871oH.A08(i2);
    }
}
