package com.yandex.mobile.ads.impl;

import androidx.media3.common.util.TimestampAdjuster;
import com.wakeup.common.dfx.FeedbackLogReporter;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* loaded from: classes5.dex */
public final class p52 {

    /* renamed from: a, reason: collision with root package name */
    private long f16524a;
    private long b;
    private long c;
    private final ThreadLocal<Long> d = new ThreadLocal<>();

    public final synchronized long a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.b == -9223372036854775807L) {
            long j2 = this.f16524a;
            if (j2 == TimestampAdjuster.MODE_SHARED) {
                Long l = this.d.get();
                l.getClass();
                j2 = l.longValue();
            }
            this.b = j2 - j;
            notifyAll();
        }
        this.c = j;
        return j + this.b;
    }

    public final synchronized long b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.c;
        if (j2 != -9223372036854775807L) {
            long j3 = (j2 * FeedbackLogReporter.DEFAULT_UPLOAD_TIMEOUT_MS) / 1000000;
            long j4 = (IjkMediaMeta.AV_CH_WIDE_RIGHT + j3) / IjkMediaMeta.AV_CH_SURROUND_DIRECT_LEFT;
            long j5 = ((j4 - 1) * IjkMediaMeta.AV_CH_SURROUND_DIRECT_LEFT) + j;
            j += j4 * IjkMediaMeta.AV_CH_SURROUND_DIRECT_LEFT;
            if (Math.abs(j5 - j3) < Math.abs(j - j3)) {
                j = j5;
            }
        }
        return a((j * 1000000) / FeedbackLogReporter.DEFAULT_UPLOAD_TIMEOUT_MS);
    }

    public p52(long j) {
        c(j);
    }

    public final synchronized long c() {
        return this.b;
    }

    public final synchronized void c(long j) {
        this.f16524a = j;
        this.b = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.c = -9223372036854775807L;
    }

    public final synchronized long b() {
        long a2;
        long j = this.c;
        if (j != -9223372036854775807L) {
            a2 = j + this.b;
        } else {
            a2 = a();
        }
        return a2;
    }

    public final synchronized long a() {
        long j;
        j = this.f16524a;
        if (j == Long.MAX_VALUE || j == TimestampAdjuster.MODE_SHARED) {
            j = -9223372036854775807L;
        }
        return j;
    }
}
