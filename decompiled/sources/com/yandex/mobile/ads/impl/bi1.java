package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.yandex.mobile.ads.impl.km;
import java.util.Locale;

/* loaded from: classes5.dex */
public final class bi1 implements km {
    public static final bi1 e = new bi1(1.0f, 1.0f);
    public final float b;
    public final float c;
    private final int d;

    static {
        new km.a() { // from class: com.yandex.mobile.ads.impl.bi1$$ExternalSyntheticLambda0
            @Override // com.yandex.mobile.ads.impl.km.a
            public final km fromBundle(Bundle bundle) {
                bi1 a2;
                a2 = bi1.a(bundle);
                return a2;
            }
        };
    }

    public bi1(float f, float f2) {
        hg.a(f > 0.0f);
        hg.a(f2 > 0.0f);
        this.b = f;
        this.c = f2;
        this.d = Math.round(f * 1000.0f);
    }

    public final long a(long j) {
        return j * this.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static bi1 a(Bundle bundle) {
        return new bi1(bundle.getFloat(Integer.toString(0, 36), 1.0f), bundle.getFloat(Integer.toString(1, 36), 1.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bi1.class == obj.getClass()) {
            bi1 bi1Var = (bi1) obj;
            if (this.b == bi1Var.b && this.c == bi1Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.c) + ((Float.floatToRawIntBits(this.b) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.b), Float.valueOf(this.c)};
        int i = f92.f15466a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
