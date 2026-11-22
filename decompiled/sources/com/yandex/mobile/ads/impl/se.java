package com.yandex.mobile.ads.impl;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class se extends sy1 {
    @Override // com.yandex.mobile.ads.impl.sy1
    protected final k01 a(n01 n01Var, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            zf1 zf1Var = new zf1(byteBuffer.limit(), byteBuffer.array());
            zf1Var.d(12);
            int d = (zf1Var.d() + zf1Var.b(12)) - 4;
            zf1Var.d(44);
            zf1Var.e(zf1Var.b(12));
            zf1Var.d(16);
            ArrayList arrayList = new ArrayList();
            while (zf1Var.d() < d) {
                zf1Var.d(48);
                int b = zf1Var.b(8);
                zf1Var.d(4);
                int d2 = zf1Var.d() + zf1Var.b(12);
                String str = null;
                String str2 = null;
                while (zf1Var.d() < d2) {
                    int b2 = zf1Var.b(8);
                    int b3 = zf1Var.b(8);
                    int d3 = zf1Var.d() + b3;
                    if (b2 == 2) {
                        int b4 = zf1Var.b(16);
                        zf1Var.d(8);
                        if (b4 == 3) {
                            while (zf1Var.d() < d3) {
                                str = zf1Var.a(zf1Var.b(8), lo.f16153a);
                                int b5 = zf1Var.b(8);
                                for (int i = 0; i < b5; i++) {
                                    zf1Var.e(zf1Var.b(8));
                                }
                            }
                        }
                    } else if (b2 == 21) {
                        str2 = zf1Var.a(b3, lo.f16153a);
                    }
                    zf1Var.c(d3 * 8);
                }
                zf1Var.c(d2 * 8);
                if (str != null && str2 != null) {
                    arrayList.add(new re(b, str.concat(str2)));
                }
            }
            if (!arrayList.isEmpty()) {
                return new k01(arrayList);
            }
        }
        return null;
    }
}
