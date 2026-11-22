package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ds0;
import com.yandex.mobile.ads.impl.hs0;
import java.io.FileNotFoundException;

/* loaded from: classes5.dex */
public final class d00 implements ds0 {
    @Override // com.yandex.mobile.ads.impl.ds0
    public final int a(int i) {
        return i == 7 ? 6 : 3;
    }

    public d00() {
        this(0);
    }

    public d00(int i) {
    }

    @Override // com.yandex.mobile.ads.impl.ds0
    public final long a(ds0.a aVar) {
        Throwable th = aVar.f15306a;
        if ((th instanceof eg1) || (th instanceof FileNotFoundException) || (th instanceof qh0) || (th instanceof hs0.g)) {
            return -9223372036854775807L;
        }
        int i = uv.c;
        while (th != null) {
            if ((th instanceof uv) && ((uv) th).b == 2008) {
                return -9223372036854775807L;
            }
            th = th.getCause();
        }
        return Math.min((aVar.b - 1) * 1000, 5000);
    }
}
