package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ln0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class zz {

    /* renamed from: a, reason: collision with root package name */
    private final ln0 f17571a;

    public zz(aj1 playerVolumeProvider) {
        Intrinsics.checkNotNullParameter(playerVolumeProvider, "playerVolumeProvider");
        ln0.a aVar = new ln0.a();
        float volume = playerVolumeProvider.getVolume();
        if (volume == 0.0f) {
            aVar.a(1.0f);
            aVar.b(true);
        } else {
            aVar.a(volume);
            aVar.b(false);
        }
        this.f17571a = aVar.a();
    }

    public final ln0 a() {
        return this.f17571a;
    }
}
