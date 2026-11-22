package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h91 implements gk0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ sj0 f15669a;

    h91(sj0 sj0Var) {
        this.f15669a = sj0Var;
    }

    @Override // com.yandex.mobile.ads.impl.gk0
    public final void a(String url, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f15669a.a(url, bitmap);
    }

    @Override // com.yandex.mobile.ads.impl.gk0
    public final void a(Map<String, Bitmap> images) {
        Intrinsics.checkNotNullParameter(images, "images");
    }
}
