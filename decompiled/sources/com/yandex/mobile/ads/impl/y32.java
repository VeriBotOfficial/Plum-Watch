package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* loaded from: classes5.dex */
public final class y32 implements jp {
    @Override // com.yandex.mobile.ads.impl.jp
    public final long a() {
        return SystemClock.uptimeMillis();
    }

    @Override // com.yandex.mobile.ads.impl.jp
    public final long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.yandex.mobile.ads.impl.jp
    public final hf0 a(Looper looper, Handler.Callback callback) {
        return new a42(new Handler(looper, callback));
    }

    protected y32() {
    }
}
