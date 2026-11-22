package com.yandex.mobile.ads.impl;

/* loaded from: classes5.dex */
public interface h70 extends c62 {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final y52 f15664a;
        public final int[] b;
        public final int c;

        public a(int i, y52 y52Var, int[] iArr) {
            if (iArr.length == 0) {
                et0.a("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f15664a = y52Var;
            this.b = iArr;
            this.c = i;
        }
    }

    public interface b {
    }

    void a(float f);

    default void a(boolean z) {
    }

    void c();

    void d();

    jc0 e();

    default void f() {
    }

    default void g() {
    }
}
