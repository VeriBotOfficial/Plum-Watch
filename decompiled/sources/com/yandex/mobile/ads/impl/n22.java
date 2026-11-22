package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.yandex.mobile.ads.impl.km;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class n22 extends kn1 {
    public static final km.a<n22> e = new km.a() { // from class: com.yandex.mobile.ads.impl.n22$$ExternalSyntheticLambda0
        @Override // com.yandex.mobile.ads.impl.km.a
        public final km fromBundle(Bundle bundle) {
            n22 b;
            b = n22.b(bundle);
            return b;
        }
    };
    private final int c;
    private final float d;

    /* JADX INFO: Access modifiers changed from: private */
    public static n22 b(Bundle bundle) {
        if (bundle.getInt(Integer.toString(0, 36), -1) != 2) {
            throw new IllegalArgumentException();
        }
        int i = bundle.getInt(Integer.toString(1, 36), 5);
        float f = bundle.getFloat(Integer.toString(2, 36), -1.0f);
        return f == -1.0f ? new n22(i) : new n22(i, f);
    }

    public n22(int i) {
        hg.a("maxStars must be a positive integer", i > 0);
        this.c = i;
        this.d = -1.0f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), Float.valueOf(this.d)});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n22)) {
            return false;
        }
        n22 n22Var = (n22) obj;
        return this.c == n22Var.c && this.d == n22Var.d;
    }

    public n22(int i, float f) {
        hg.a("maxStars must be a positive integer", i > 0);
        hg.a("starRating is out of range [0, maxStars]", f >= 0.0f && f <= ((float) i));
        this.c = i;
        this.d = f;
    }
}
