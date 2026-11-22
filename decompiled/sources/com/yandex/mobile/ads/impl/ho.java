package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.uh;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
final class ho extends ik {
    private int[] i;
    private int[] j;

    ho() {
    }

    @Override // com.yandex.mobile.ads.impl.ik
    public final uh.a b(uh.a aVar) throws uh.b {
        int[] iArr = this.i;
        if (iArr == null) {
            return uh.a.e;
        }
        if (aVar.c == 2) {
            boolean z = aVar.b != iArr.length;
            int i = 0;
            while (i < iArr.length) {
                int i2 = iArr[i];
                if (i2 >= aVar.b) {
                    throw new uh.b(aVar);
                }
                z |= i2 != i;
                i++;
            }
            if (z) {
                return new uh.a(aVar.f17052a, iArr.length, 2);
            }
            return uh.a.e;
        }
        throw new uh.b(aVar);
    }

    @Override // com.yandex.mobile.ads.impl.uh
    public final void a(ByteBuffer byteBuffer) {
        int[] iArr = this.j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer a2 = a(((limit - position) / this.b.d) * this.c.d);
        while (position < limit) {
            for (int i : iArr) {
                a2.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.b.d;
        }
        byteBuffer.position(limit);
        a2.flip();
    }

    @Override // com.yandex.mobile.ads.impl.ik
    protected final void f() {
        this.j = this.i;
    }

    @Override // com.yandex.mobile.ads.impl.ik
    protected final void h() {
        this.j = null;
        this.i = null;
    }

    public final void a(int[] iArr) {
        this.i = iArr;
    }
}
