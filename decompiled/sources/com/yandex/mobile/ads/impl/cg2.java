package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.facebook.imageutils.JfifUtil;
import com.yandex.mobile.ads.impl.km;

/* loaded from: classes5.dex */
public final class cg2 implements km {
    public static final /* synthetic */ int f = 0;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    static {
        new km.a() { // from class: com.yandex.mobile.ads.impl.cg2$$ExternalSyntheticLambda0
            @Override // com.yandex.mobile.ads.impl.km.a
            public final km fromBundle(Bundle bundle) {
                cg2 a2;
                a2 = cg2.a(bundle);
                return a2;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static cg2 a(Bundle bundle) {
        return new cg2(bundle.getInt(Integer.toString(0, 36), 0), bundle.getInt(Integer.toString(1, 36), 0), bundle.getInt(Integer.toString(2, 36), 0), bundle.getFloat(Integer.toString(3, 36), 1.0f));
    }

    public cg2(int i, int i2, int i3, float f2) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cg2) {
            cg2 cg2Var = (cg2) obj;
            if (this.b == cg2Var.b && this.c == cg2Var.c && this.d == cg2Var.d && this.e == cg2Var.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.e) + ((((((this.b + JfifUtil.MARKER_EOI) * 31) + this.c) * 31) + this.d) * 31);
    }
}
