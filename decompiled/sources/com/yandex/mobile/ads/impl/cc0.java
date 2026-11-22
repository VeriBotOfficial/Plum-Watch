package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.uh;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
final class cc0 extends ik {
    private static final int i = Float.floatToIntBits(Float.NaN);

    cc0() {
    }

    @Override // com.yandex.mobile.ads.impl.ik
    public final uh.a b(uh.a aVar) throws uh.b {
        int i2 = aVar.c;
        if (i2 != 536870912 && i2 != 805306368 && i2 != 4) {
            throw new uh.b(aVar);
        }
        if (i2 != 4) {
            return new uh.a(aVar.f17052a, aVar.b, 4);
        }
        return uh.a.e;
    }

    @Override // com.yandex.mobile.ads.impl.uh
    public final void a(ByteBuffer byteBuffer) {
        ByteBuffer a2;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int i3 = this.b.c;
        if (i3 == 536870912) {
            a2 = a((i2 / 3) * 4);
            while (position < limit) {
                int floatToIntBits = Float.floatToIntBits((float) ((((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24)) * 4.656612875245797E-10d));
                if (floatToIntBits == i) {
                    floatToIntBits = Float.floatToIntBits(0.0f);
                }
                a2.putInt(floatToIntBits);
                position += 3;
            }
        } else if (i3 == 805306368) {
            a2 = a(i2);
            while (position < limit) {
                int floatToIntBits2 = Float.floatToIntBits((float) (((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24)) * 4.656612875245797E-10d));
                if (floatToIntBits2 == i) {
                    floatToIntBits2 = Float.floatToIntBits(0.0f);
                }
                a2.putInt(floatToIntBits2);
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        a2.flip();
    }
}
