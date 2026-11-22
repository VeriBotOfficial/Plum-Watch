package com.facebook.ads.redexgen.core;

import android.media.AudioAttributes;

/* renamed from: com.facebook.ads.redexgen.X.1N, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C1N {
    public final AudioAttributes A00;

    public C1N(C2911oy c2911oy) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(c2911oy.A02).setFlags(c2911oy.A03).setUsage(c2911oy.A05);
        if (AbstractC12174a.A02 >= 29) {
            C1L.A00(usage, c2911oy.A01);
        }
        if (AbstractC12174a.A02 >= 32) {
            C1M.A00(usage, c2911oy.A04);
        }
        this.A00 = usage.build();
    }
}
