package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import android.os.Bundle;
import com.yandex.mobile.ads.impl.km;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class rq implements km {
    public static final km.a<rq> g = new km.a() { // from class: com.yandex.mobile.ads.impl.rq$$ExternalSyntheticLambda0
        @Override // com.yandex.mobile.ads.impl.km.a
        public final km fromBundle(Bundle bundle) {
            rq a2;
            a2 = rq.a(bundle);
            return a2;
        }
    };
    public final int b;
    public final int c;
    public final int d;
    public final byte[] e;
    private int f;

    /* JADX INFO: Access modifiers changed from: private */
    public static rq a(Bundle bundle) {
        return new rq(bundle.getInt(Integer.toString(0, 36), -1), bundle.getInt(Integer.toString(1, 36), -1), bundle.getInt(Integer.toString(2, 36), -1), bundle.getByteArray(Integer.toString(3, 36)));
    }

    public rq(int i, int i2, int i3, byte[] bArr) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && rq.class == obj.getClass()) {
            rq rqVar = (rq) obj;
            if (this.b == rqVar.b && this.c == rqVar.c && this.d == rqVar.d && Arrays.equals(this.e, rqVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "ColorInfo(" + this.b + ", " + this.c + ", " + this.d + ", " + (this.e != null) + Separators.RPAREN;
    }

    public final int hashCode() {
        if (this.f == 0) {
            this.f = Arrays.hashCode(this.e) + ((((((this.b + 527) * 31) + this.c) * 31) + this.d) * 31);
        }
        return this.f;
    }
}
