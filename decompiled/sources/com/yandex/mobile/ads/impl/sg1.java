package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.yandex.mobile.ads.impl.km;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class sg1 extends kn1 {
    public static final km.a<sg1> d = new km.a() { // from class: com.yandex.mobile.ads.impl.sg1$$ExternalSyntheticLambda0
        @Override // com.yandex.mobile.ads.impl.km.a
        public final km fromBundle(Bundle bundle) {
            sg1 b;
            b = sg1.b(bundle);
            return b;
        }
    };
    private final float c;

    /* JADX INFO: Access modifiers changed from: private */
    public static sg1 b(Bundle bundle) {
        if (bundle.getInt(Integer.toString(0, 36), -1) != 1) {
            throw new IllegalArgumentException();
        }
        float f = bundle.getFloat(Integer.toString(1, 36), -1.0f);
        return f == -1.0f ? new sg1() : new sg1(f);
    }

    public sg1() {
        this.c = -1.0f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.c)});
    }

    public final boolean equals(Object obj) {
        return (obj instanceof sg1) && this.c == ((sg1) obj).c;
    }

    public sg1(float f) {
        hg.a("percent must be in the range of [0, 100]", f >= 0.0f && f <= 100.0f);
        this.c = f;
    }
}
