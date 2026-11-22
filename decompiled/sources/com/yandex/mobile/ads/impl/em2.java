package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBreakQueue;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class em2<T> implements InstreamAdBreakQueue<T> {

    /* renamed from: a, reason: collision with root package name */
    private final ut0<T> f15401a;

    public em2(ut0<T> manualAdBreakQueue) {
        Intrinsics.checkNotNullParameter(manualAdBreakQueue, "manualAdBreakQueue");
        this.f15401a = manualAdBreakQueue;
    }

    @Override // com.yandex.mobile.ads.instream.InstreamAdBreakQueue
    public final int getCount() {
        return this.f15401a.a();
    }

    @Override // com.yandex.mobile.ads.instream.InstreamAdBreakQueue
    public final T poll() {
        return this.f15401a.b();
    }
}
