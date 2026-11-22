package com.anythink.basead.exoplayer.e;

import android.gov.nist.core.Separators;
import com.anythink.basead.exoplayer.e.k;
import com.anythink.basead.exoplayer.k.af;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class a implements k {

    /* renamed from: a, reason: collision with root package name */
    public final int f2442a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    private final long f;

    @Override // com.anythink.basead.exoplayer.e.k
    public final boolean a() {
        return true;
    }

    public a(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.f2442a = length;
        if (length > 0) {
            this.f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f = 0L;
        }
    }

    private int b(long j) {
        return af.a(this.e, j, true);
    }

    @Override // com.anythink.basead.exoplayer.e.k
    public final long b() {
        return this.f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f2442a + ", sizes=" + Arrays.toString(this.b) + ", offsets=" + Arrays.toString(this.c) + ", timeUs=" + Arrays.toString(this.e) + ", durationsUs=" + Arrays.toString(this.d) + Separators.RPAREN;
    }

    @Override // com.anythink.basead.exoplayer.e.k
    public final k.a a(long j) {
        int a2 = af.a(this.e, j, true);
        l lVar = new l(this.e[a2], this.c[a2]);
        if (lVar.b >= j || a2 == this.f2442a - 1) {
            return new k.a(lVar);
        }
        int i = a2 + 1;
        return new k.a(lVar, new l(this.e[i], this.c[i]));
    }
}
