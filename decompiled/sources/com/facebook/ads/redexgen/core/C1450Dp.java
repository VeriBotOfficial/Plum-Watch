package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import javax.annotation.Nullable;

@MetaExoPlayerCustomization(type = {"NEW_CLASS"}, value = "Encapsulate error info from subtitle decoder")
/* renamed from: com.facebook.ads.redexgen.X.Dp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1450Dp {

    @Nullable
    public final C2905or A00;
    public final Throwable A01;

    public C1450Dp(@Nullable C2905or c2905or, Throwable th) {
        this.A00 = c2905or;
        this.A01 = th;
    }
}
