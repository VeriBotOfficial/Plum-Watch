package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class xl {

    /* renamed from: a, reason: collision with root package name */
    private final fw0 f17345a;

    public xl(fw0 referenceMediaFileInfo) {
        Intrinsics.checkNotNullParameter(referenceMediaFileInfo, "referenceMediaFileInfo");
        this.f17345a = referenceMediaFileInfo;
    }

    public final int a(ew0 mediaFile) {
        Intrinsics.checkNotNullParameter(mediaFile, "mediaFile");
        int b = mediaFile.b();
        if (b != 0) {
            return b;
        }
        return (int) (((mediaFile.d() * mediaFile.h()) / (this.f17345a.b() * this.f17345a.c())) * this.f17345a.a());
    }
}
