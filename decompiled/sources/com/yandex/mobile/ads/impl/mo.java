package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import com.yandex.mobile.ads.impl.ex1;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class mo implements ex1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f16266a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    private final long f;

    @Override // com.yandex.mobile.ads.impl.ex1
    public final boolean b() {
        return true;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f16266a + ", sizes=" + Arrays.toString(this.b) + ", offsets=" + Arrays.toString(this.c) + ", timeUs=" + Arrays.toString(this.e) + ", durationsUs=" + Arrays.toString(this.d) + Separators.RPAREN;
    }

    @Override // com.yandex.mobile.ads.impl.ex1
    public final ex1.a b(long j) {
        int b = f92.b(this.e, j, true);
        long[] jArr = this.e;
        long j2 = jArr[b];
        long[] jArr2 = this.c;
        gx1 gx1Var = new gx1(j2, jArr2[b]);
        if (j2 >= j || b == this.f16266a - 1) {
            return new ex1.a(gx1Var, gx1Var);
        }
        int i = b + 1;
        return new ex1.a(gx1Var, new gx1(jArr[i], jArr2[i]));
    }

    public mo(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.f16266a = length;
        if (length > 0) {
            int i = length - 1;
            this.f = jArr2[i] + jArr3[i];
        } else {
            this.f = 0L;
        }
    }

    @Override // com.yandex.mobile.ads.impl.ex1
    public final long c() {
        return this.f;
    }
}
