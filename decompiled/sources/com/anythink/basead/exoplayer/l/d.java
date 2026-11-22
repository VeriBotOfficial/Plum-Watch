package com.anythink.basead.exoplayer.l;

import com.anythink.basead.exoplayer.k.p;
import com.anythink.basead.exoplayer.k.s;
import com.anythink.basead.exoplayer.t;
import java.util.Collections;
import java.util.List;

/* loaded from: classes11.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final List<byte[]> f2706a;
    public final int b;

    public static d a(s sVar) {
        try {
            sVar.d(21);
            int d = sVar.d() & 3;
            int d2 = sVar.d();
            int c = sVar.c();
            int i = 0;
            for (int i2 = 0; i2 < d2; i2++) {
                sVar.d(1);
                int e = sVar.e();
                for (int i3 = 0; i3 < e; i3++) {
                    int e2 = sVar.e();
                    i += e2 + 4;
                    sVar.d(e2);
                }
            }
            sVar.c(c);
            byte[] bArr = new byte[i];
            int i4 = 0;
            for (int i5 = 0; i5 < d2; i5++) {
                sVar.d(1);
                int e3 = sVar.e();
                for (int i6 = 0; i6 < e3; i6++) {
                    int e4 = sVar.e();
                    System.arraycopy(p.f2688a, 0, bArr, i4, p.f2688a.length);
                    int length = i4 + p.f2688a.length;
                    System.arraycopy(sVar.f2693a, sVar.c(), bArr, length, e4);
                    i4 = length + e4;
                    sVar.d(e4);
                }
            }
            return new d(i == 0 ? null : Collections.singletonList(bArr), d + 1);
        } catch (ArrayIndexOutOfBoundsException e5) {
            throw new t("Error parsing HEVC config", e5);
        }
    }

    private d(List<byte[]> list, int i) {
        this.f2706a = list;
        this.b = i;
    }
}
