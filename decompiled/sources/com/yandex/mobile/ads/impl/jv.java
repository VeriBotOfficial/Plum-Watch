package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.yandex.mobile.ads.impl.km;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public final class jv implements km {
    public static final /* synthetic */ int b = 0;

    static {
        new jv(kk0.h());
        new km.a() { // from class: com.yandex.mobile.ads.impl.jv$$ExternalSyntheticLambda0
            @Override // com.yandex.mobile.ads.impl.km.a
            public final km fromBundle(Bundle bundle) {
                jv a2;
                a2 = jv.a(bundle);
                return a2;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jv a(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(0, 36));
        return new jv(parcelableArrayList == null ? kk0.h() : lm.a(hv.t, parcelableArrayList));
    }

    public jv(List<hv> list) {
        kk0.a((Collection) list);
    }
}
