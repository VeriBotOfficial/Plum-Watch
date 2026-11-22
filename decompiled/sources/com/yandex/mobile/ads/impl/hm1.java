package com.yandex.mobile.ads.impl;

/* loaded from: classes5.dex */
final class hm1 {

    /* renamed from: a, reason: collision with root package name */
    public final a f15706a;
    public final a b;
    public final int c;
    public final boolean d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final b[] f15707a;

        public final b a() {
            return this.f15707a[0];
        }

        public a(b... bVarArr) {
            this.f15707a = bVarArr;
        }

        public final int b() {
            return this.f15707a.length;
        }
    }

    public hm1(a aVar, a aVar2, int i) {
        this.f15706a = aVar;
        this.b = aVar2;
        this.c = i;
        this.d = aVar == aVar2;
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f15708a;
        public final int b;
        public final float[] c;
        public final float[] d;

        public b(int i, float[] fArr, float[] fArr2, int i2) {
            this.f15708a = i;
            hg.a(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.c = fArr;
            this.d = fArr2;
            this.b = i2;
        }

        public final int a() {
            return this.c.length / 3;
        }
    }
}
