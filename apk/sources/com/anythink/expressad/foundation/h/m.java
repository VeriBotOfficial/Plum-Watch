package com.anythink.expressad.foundation.h;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes16.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f4927a = 10;

    private m() {
    }

    public static final long a() {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
            if (jCurrentTimeMillis > 0) {
                return (jCurrentTimeMillis / 10) * 10;
            }
        } catch (Exception unused) {
        }
        return 0L;
    }
}
