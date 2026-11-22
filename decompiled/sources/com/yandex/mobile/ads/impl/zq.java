package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class zq<T extends View> implements zd<T> {

    /* renamed from: a, reason: collision with root package name */
    private final List<zd<T>> f17551a;

    /* JADX WARN: Multi-variable type inference failed */
    public zq(List<? extends zd<T>> animators) {
        Intrinsics.checkNotNullParameter(animators, "animators");
        this.f17551a = animators;
    }

    @Override // com.yandex.mobile.ads.impl.zd
    public final void a(T view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Iterator<zd<T>> it = this.f17551a.iterator();
        while (it.hasNext()) {
            it.next().a(view);
        }
    }

    @Override // com.yandex.mobile.ads.impl.zd
    public final void cancel() {
        Iterator<zd<T>> it = this.f17551a.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }
}
