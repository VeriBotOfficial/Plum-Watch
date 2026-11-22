package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.xa2;
import java.net.MalformedURLException;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class xe1 {
    public static eb2 a(wa2 verification) throws xa2, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(verification, "verification");
        oq0 b = verification.b();
        if (b == null || !Intrinsics.areEqual(b.c(), "omid")) {
            throw new xa2(verification, xa2.a.c);
        }
        try {
            URL url = new URL(b.d());
            String d = verification.d();
            String c = verification.c();
            if (c == null || c.length() == 0) {
                eb2 a2 = eb2.a(url);
                Intrinsics.checkNotNull(a2);
                return a2;
            }
            eb2 a3 = eb2.a(d, url, c);
            Intrinsics.checkNotNull(a3);
            return a3;
        } catch (MalformedURLException unused) {
            throw new xa2(verification, xa2.a.d);
        }
    }
}
