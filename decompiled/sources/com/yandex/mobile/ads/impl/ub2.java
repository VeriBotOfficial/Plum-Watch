package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ub2 {

    /* renamed from: a, reason: collision with root package name */
    private final List<u70> f17039a;
    private final List<l62> b;

    private ub2(List<u70> list, List<l62> list2) {
        this.f17039a = list;
        this.b = list2;
    }

    public final List<u70> a() {
        return this.f17039a;
    }

    public final List<l62> b() {
        return this.b;
    }

    public /* synthetic */ ub2(List list, List list2, int i) {
        this(list, list2);
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private List<u70> f17040a = CollectionsKt.emptyList();
        private List<l62> b = CollectionsKt.emptyList();

        public final a a(List<u70> extensions) {
            Intrinsics.checkNotNullParameter(extensions, "extensions");
            this.f17040a = extensions;
            return this;
        }

        public final a b(List<l62> trackingEvents) {
            Intrinsics.checkNotNullParameter(trackingEvents, "trackingEvents");
            this.b = trackingEvents;
            return this;
        }

        public final ub2 a() {
            return new ub2(this.f17040a, this.b, 0);
        }
    }
}
