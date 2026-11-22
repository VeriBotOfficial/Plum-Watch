package com.yandex.mobile.ads.impl;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l6 implements l20 {

    /* renamed from: a, reason: collision with root package name */
    private final kz1 f16079a;

    public l6(kz1 skipAdController) {
        Intrinsics.checkNotNullParameter(skipAdController, "skipAdController");
        this.f16079a = skipAdController;
    }

    @Override // com.yandex.mobile.ads.impl.l20
    public final boolean a(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (!Intrinsics.areEqual(uri.getHost(), "showNextAd")) {
            return false;
        }
        this.f16079a.a();
        return true;
    }
}
