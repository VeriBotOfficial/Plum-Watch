package com.yandex.mobile.ads.impl;

import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes5.dex */
public abstract class uk implements h70 {

    /* renamed from: a, reason: collision with root package name */
    protected final y52 f17061a;
    protected final int b;
    protected final int[] c;
    private final jc0[] d;
    private int e;

    @Override // com.yandex.mobile.ads.impl.h70
    public void a(float f) {
    }

    @Override // com.yandex.mobile.ads.impl.h70
    public void c() {
    }

    @Override // com.yandex.mobile.ads.impl.h70
    public void d() {
    }

    public uk(y52 y52Var, int[] iArr) {
        int i = 0;
        hg.b(iArr.length > 0);
        this.f17061a = (y52) hg.a(y52Var);
        int length = iArr.length;
        this.b = length;
        this.d = new jc0[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.d[i2] = y52Var.a(iArr[i2]);
        }
        Arrays.sort(this.d, new Comparator() { // from class: com.yandex.mobile.ads.impl.uk$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int a2;
                a2 = uk.a((jc0) obj, (jc0) obj2);
                return a2;
            }
        });
        this.c = new int[this.b];
        while (true) {
            int i3 = this.b;
            if (i >= i3) {
                long[] jArr = new long[i3];
                return;
            } else {
                this.c[i] = y52Var.a(this.d[i]);
                i++;
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.c62
    public final jc0 a(int i) {
        return this.d[i];
    }

    @Override // com.yandex.mobile.ads.impl.c62
    public final int b(int i) {
        return this.c[i];
    }

    @Override // com.yandex.mobile.ads.impl.c62
    public final int c(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.yandex.mobile.ads.impl.h70
    public final jc0 e() {
        return this.d[0];
    }

    public final int hashCode() {
        if (this.e == 0) {
            this.e = Arrays.hashCode(this.c) + (System.identityHashCode(this.f17061a) * 31);
        }
        return this.e;
    }

    @Override // com.yandex.mobile.ads.impl.c62
    public final y52 a() {
        return this.f17061a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            uk ukVar = (uk) obj;
            if (this.f17061a == ukVar.f17061a && Arrays.equals(this.c, ukVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.c62
    public final int b() {
        return this.c.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(jc0 jc0Var, jc0 jc0Var2) {
        return jc0Var2.i - jc0Var.i;
    }
}
