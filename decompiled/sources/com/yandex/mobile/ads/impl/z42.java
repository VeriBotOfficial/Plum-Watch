package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.yandex.mobile.ads.impl.km;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class z42 extends kn1 {
    public static final km.a<z42> e = new km.a() { // from class: com.yandex.mobile.ads.impl.z42$$ExternalSyntheticLambda0
        @Override // com.yandex.mobile.ads.impl.km.a
        public final km fromBundle(Bundle bundle) {
            z42 b;
            b = z42.b(bundle);
            return b;
        }
    };
    private final boolean c;
    private final boolean d;

    /* JADX INFO: Access modifiers changed from: private */
    public static z42 b(Bundle bundle) {
        if (bundle.getInt(Integer.toString(0, 36), -1) == 3) {
            return bundle.getBoolean(Integer.toString(1, 36), false) ? new z42(bundle.getBoolean(Integer.toString(2, 36), false)) : new z42();
        }
        throw new IllegalArgumentException();
    }

    public z42() {
        this.c = false;
        this.d = false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.c), Boolean.valueOf(this.d)});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z42)) {
            return false;
        }
        z42 z42Var = (z42) obj;
        return this.d == z42Var.d && this.c == z42Var.c;
    }

    public z42(boolean z) {
        this.c = true;
        this.d = z;
    }
}
