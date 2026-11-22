package com.yandex.mobile.ads.impl;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public interface d80 {
    static {
        new d80() { // from class: com.yandex.mobile.ads.impl.d80$$ExternalSyntheticLambda0
            @Override // com.yandex.mobile.ads.impl.d80
            public final z70[] a() {
                return d80.lambda$static$0();
            }
        };
    }

    z70[] a();

    static /* synthetic */ z70[] lambda$static$0() {
        return new z70[0];
    }

    default z70[] a(Uri uri, Map<String, List<String>> map) {
        return a();
    }
}
