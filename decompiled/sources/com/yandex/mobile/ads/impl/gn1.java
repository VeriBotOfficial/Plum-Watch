package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.mg2;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class gn1 implements cd2 {

    /* renamed from: a, reason: collision with root package name */
    private final mg2 f15613a;
    private final List<a> b;

    public gn1(ng2 videoTracker) {
        Intrinsics.checkNotNullParameter(videoTracker, "videoTracker");
        this.f15613a = videoTracker;
        this.b = CollectionsKt.mutableListOf(new a(mg2.a.b, 0.25f), new a(mg2.a.c, 0.5f), new a(mg2.a.d, 0.75f));
    }

    @Override // com.yandex.mobile.ads.impl.cd2
    public final void a(long j, long j2) {
        if (j != 0) {
            Iterator<a> it = this.b.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.a() * j <= j2) {
                    this.f15613a.a(next.b());
                    it.remove();
                }
            }
        }
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final mg2.a f15614a;
        private final float b;

        public a(mg2.a trackerQuartile, float f) {
            Intrinsics.checkNotNullParameter(trackerQuartile, "trackerQuartile");
            this.f15614a = trackerQuartile;
            this.b = f;
        }

        public final mg2.a b() {
            return this.f15614a;
        }

        public final float a() {
            return this.b;
        }
    }
}
