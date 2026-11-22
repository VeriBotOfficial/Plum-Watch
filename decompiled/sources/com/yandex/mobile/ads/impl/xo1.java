package com.yandex.mobile.ads.impl;

import android.os.SystemClock;

/* loaded from: classes5.dex */
public final class xo1 implements wo1 {

    /* renamed from: a, reason: collision with root package name */
    private Long f17356a;

    @Override // com.yandex.mobile.ads.impl.wo1
    public final void a() {
        this.f17356a = Long.valueOf(SystemClock.elapsedRealtime());
    }

    @Override // com.yandex.mobile.ads.impl.wo1
    public final long b() {
        Long l = this.f17356a;
        if (l == null) {
            return 0L;
        }
        return SystemClock.elapsedRealtime() - l.longValue();
    }
}
