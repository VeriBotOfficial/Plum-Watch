package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class qr0 {

    /* renamed from: a, reason: collision with root package name */
    private final List<ig<?>> f16693a;

    private qr0(List list) {
        this.f16693a = list;
    }

    public /* synthetic */ qr0(List list, int i) {
        this(list);
    }

    public final List<ig<?>> a() {
        return this.f16693a;
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private List<? extends ig<?>> f16694a = CollectionsKt.emptyList();

        public final void a(List<? extends ig<?>> assets) {
            Intrinsics.checkNotNullParameter(assets, "assets");
            this.f16694a = assets;
        }

        public final void a(vr0 link) {
            Intrinsics.checkNotNullParameter(link, "link");
        }

        public final qr0 a() {
            return new qr0(this.f16694a, 0);
        }
    }
}
