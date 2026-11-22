package com.yandex.mobile.ads.impl;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    private final o8<?> f15149a;
    private final o3 b;
    private final gv1 c;
    private final q61 d;
    private final int e;
    private final t8 f;
    private final Intent g;

    public c1(a builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f15149a = builder.c();
        this.b = builder.b();
        this.c = builder.g();
        this.d = builder.e();
        this.e = builder.f();
        this.f = builder.d();
        this.g = builder.a();
    }

    public final o8<?> c() {
        return this.f15149a;
    }

    public final o3 b() {
        return this.b;
    }

    public final gv1 g() {
        return this.c;
    }

    public final q61 e() {
        return this.d;
    }

    public final int f() {
        return this.e;
    }

    public final t8 d() {
        return this.f;
    }

    public final Intent a() {
        return this.g;
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final o8<?> f15150a;
        private final o3 b;
        private final t8 c;
        private gv1 d;
        private q61 e;
        private int f;
        private Intent g;

        public a(o8<?> adResponse, o3 adConfiguration, t8 adResultReceiver) {
            Intrinsics.checkNotNullParameter(adResponse, "adResponse");
            Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
            Intrinsics.checkNotNullParameter(adResultReceiver, "adResultReceiver");
            this.f15150a = adResponse;
            this.b = adConfiguration;
            this.c = adResultReceiver;
        }

        public final o8<?> c() {
            return this.f15150a;
        }

        public final o3 b() {
            return this.b;
        }

        public final t8 d() {
            return this.c;
        }

        public final gv1 g() {
            return this.d;
        }

        public final q61 e() {
            return this.e;
        }

        public final int f() {
            return this.f;
        }

        public final Intent a() {
            return this.g;
        }

        public final a a(Intent activityResultIntent) {
            Intrinsics.checkNotNullParameter(activityResultIntent, "activityResultIntent");
            this.g = activityResultIntent;
            return this;
        }

        public final a a(q61 nativeAd) {
            Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
            this.e = nativeAd;
            return this;
        }

        public final a a(int i) {
            this.f = i;
            return this;
        }

        public final a a(gv1 contentController) {
            Intrinsics.checkNotNullParameter(contentController, "contentController");
            this.d = contentController;
            return this;
        }
    }
}
