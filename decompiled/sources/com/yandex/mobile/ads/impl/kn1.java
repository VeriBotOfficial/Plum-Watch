package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.yandex.mobile.ads.impl.km;

/* loaded from: classes5.dex */
public abstract class kn1 implements km {
    public static final km.a<kn1> b = new km.a() { // from class: com.yandex.mobile.ads.impl.kn1$$ExternalSyntheticLambda0
        @Override // com.yandex.mobile.ads.impl.km.a
        public final km fromBundle(Bundle bundle) {
            kn1 a2;
            a2 = kn1.a(bundle);
            return a2;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static kn1 a(Bundle bundle) {
        int i = bundle.getInt(Integer.toString(0, 36), -1);
        if (i == 0) {
            return sf0.e.fromBundle(bundle);
        }
        if (i == 1) {
            return sg1.d.fromBundle(bundle);
        }
        if (i == 2) {
            return n22.e.fromBundle(bundle);
        }
        if (i == 3) {
            return z42.e.fromBundle(bundle);
        }
        throw new IllegalArgumentException(oe.a("Unknown RatingType: ", i));
    }

    kn1() {
    }
}
