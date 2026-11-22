package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.yandex.mobile.ads.impl.km;

/* loaded from: classes5.dex */
public final class i10 implements km {
    public final int b;
    public final int c;
    public final int d;

    static {
        new km.a() { // from class: com.yandex.mobile.ads.impl.i10$$ExternalSyntheticLambda0
            @Override // com.yandex.mobile.ads.impl.km.a
            public final km fromBundle(Bundle bundle) {
                i10 a2;
                a2 = i10.a(bundle);
                return a2;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static i10 a(Bundle bundle) {
        return new i10(bundle.getInt(Integer.toString(0, 36), 0), bundle.getInt(Integer.toString(1, 36), 0), bundle.getInt(Integer.toString(2, 36), 0));
    }

    public i10(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i10)) {
            return false;
        }
        i10 i10Var = (i10) obj;
        return this.b == i10Var.b && this.c == i10Var.c && this.d == i10Var.d;
    }

    public final int hashCode() {
        return ((((this.b + 527) * 31) + this.c) * 31) + this.d;
    }
}
