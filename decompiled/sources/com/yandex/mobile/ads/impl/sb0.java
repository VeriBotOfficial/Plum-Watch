package com.yandex.mobile.ads.impl;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class sb0 implements LifecycleOwner {

    /* renamed from: a, reason: collision with root package name */
    private final a f16847a = new a();

    public static final class a extends Lifecycle {

        /* renamed from: a, reason: collision with root package name */
        private final Lifecycle.State f16848a = Lifecycle.State.STARTED;

        @Override // androidx.lifecycle.Lifecycle
        public final void addObserver(LifecycleObserver observer) {
            Intrinsics.checkNotNullParameter(observer, "observer");
        }

        @Override // androidx.lifecycle.Lifecycle
        public final void removeObserver(LifecycleObserver observer) {
            Intrinsics.checkNotNullParameter(observer, "observer");
        }

        a() {
        }

        @Override // androidx.lifecycle.Lifecycle
        /* renamed from: getCurrentState */
        public final Lifecycle.State getState() {
            return this.f16848a;
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.f16847a;
    }
}
