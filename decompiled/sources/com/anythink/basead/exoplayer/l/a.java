package com.anythink.basead.exoplayer.l;

import com.anythink.basead.exoplayer.k.p;
import com.anythink.basead.exoplayer.k.s;
import com.anythink.basead.exoplayer.t;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final List<byte[]> f2702a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public static a a(s sVar) {
        float f;
        int i;
        int i2;
        try {
            sVar.d(4);
            int d = (sVar.d() & 3) + 1;
            if (d == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int d2 = sVar.d() & 31;
            for (int i3 = 0; i3 < d2; i3++) {
                arrayList.add(b(sVar));
            }
            int d3 = sVar.d();
            for (int i4 = 0; i4 < d3; i4++) {
                arrayList.add(b(sVar));
            }
            if (d2 > 0) {
                p.b a2 = p.a((byte[]) arrayList.get(0), d, ((byte[]) arrayList.get(0)).length);
                int i5 = a2.b;
                int i6 = a2.c;
                f = a2.d;
                i = i5;
                i2 = i6;
            } else {
                f = 1.0f;
                i = -1;
                i2 = -1;
            }
            return new a(arrayList, d, i, i2, f);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new t("Error parsing AVC config", e);
        }
    }

    private a(List<byte[]> list, int i, int i2, int i3, float f) {
        this.f2702a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = f;
    }

    private static byte[] b(s sVar) {
        int e = sVar.e();
        int c = sVar.c();
        sVar.d(e);
        return com.anythink.basead.exoplayer.k.d.a(sVar.f2693a, c, e);
    }
}
