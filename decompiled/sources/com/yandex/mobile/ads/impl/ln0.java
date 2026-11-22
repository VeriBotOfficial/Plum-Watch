package com.yandex.mobile.ads.impl;

/* loaded from: classes5.dex */
public final class ln0 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f16150a;
    private final float b;
    private final boolean c;
    private final float d;

    /* synthetic */ ln0(a aVar) {
        this(aVar.e(), aVar.b(), aVar.d(), aVar.c());
    }

    public final boolean d() {
        return this.f16150a;
    }

    public final float a() {
        return this.b;
    }

    private ln0(boolean z, float f, boolean z2, float f2) {
        this.f16150a = z;
        this.b = f;
        this.c = z2;
        this.d = f2;
    }

    public final boolean c() {
        return this.c;
    }

    public final float b() {
        return this.d;
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f16151a;
        private float b;
        private boolean c;
        private float d;

        public final boolean e() {
            return this.f16151a;
        }

        public final float b() {
            return this.b;
        }

        public final void b(float f) {
            this.d = f;
        }

        public final boolean d() {
            return this.c;
        }

        public final float c() {
            return this.d;
        }

        public final a a(float f) {
            this.b = f;
            return this;
        }

        public final void a(boolean z) {
            this.c = z;
        }

        public final ln0 a() {
            return new ln0(this);
        }

        public final a b(boolean z) {
            this.f16151a = z;
            return this;
        }
    }
}
