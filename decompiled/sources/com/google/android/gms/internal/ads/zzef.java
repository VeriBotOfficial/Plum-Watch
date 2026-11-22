package com.google.android.gms.internal.ads;

import androidx.media3.common.util.TimestampAdjuster;
import com.wakeup.common.dfx.FeedbackLogReporter;
import java.math.RoundingMode;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes15.dex */
public final class zzef {
    private long zza;
    private long zzb;
    private long zzc;
    private final ThreadLocal zzd = new ThreadLocal();

    public zzef(long j) {
        zzi(0L);
    }

    public static long zzg(long j) {
        return zzei.zzu(j, 1000000L, FeedbackLogReporter.DEFAULT_UPLOAD_TIMEOUT_MS, RoundingMode.DOWN);
    }

    public static long zzh(long j) {
        return zzei.zzu(j, FeedbackLogReporter.DEFAULT_UPLOAD_TIMEOUT_MS, 1000000L, RoundingMode.DOWN);
    }

    public final synchronized long zza(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (!zzj()) {
            long j2 = this.zza;
            if (j2 == TimestampAdjuster.MODE_SHARED) {
                Long l = (Long) this.zzd.get();
                if (l == null) {
                    throw null;
                }
                Long l2 = l;
                j2 = l.longValue();
            }
            this.zzb = j2 - j;
            notifyAll();
        }
        this.zzc = j;
        return j + this.zzb;
    }

    public final synchronized long zzb(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.zzc;
        if (j2 != -9223372036854775807L) {
            long zzh = zzh(j2);
            long j3 = (IjkMediaMeta.AV_CH_WIDE_RIGHT + zzh) / IjkMediaMeta.AV_CH_SURROUND_DIRECT_LEFT;
            long j4 = (((-1) + j3) * IjkMediaMeta.AV_CH_SURROUND_DIRECT_LEFT) + j;
            j += j3 * IjkMediaMeta.AV_CH_SURROUND_DIRECT_LEFT;
            if (Math.abs(j4 - zzh) < Math.abs(j - zzh)) {
                j = j4;
            }
        }
        return zza(zzg(j));
    }

    public final synchronized long zzc(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.zzc;
        if (j2 != -9223372036854775807L) {
            long zzh = zzh(j2);
            long j3 = zzh / IjkMediaMeta.AV_CH_SURROUND_DIRECT_LEFT;
            long j4 = (j3 * IjkMediaMeta.AV_CH_SURROUND_DIRECT_LEFT) + j;
            j += (j3 + 1) * IjkMediaMeta.AV_CH_SURROUND_DIRECT_LEFT;
            if (j4 >= zzh) {
                j = j4;
            }
        }
        return zza(zzg(j));
    }

    public final synchronized long zzd() {
        long j = this.zza;
        if (j == Long.MAX_VALUE || j == TimestampAdjuster.MODE_SHARED) {
            return -9223372036854775807L;
        }
        return j;
    }

    public final synchronized long zze() {
        long j;
        j = this.zzc;
        return j != -9223372036854775807L ? j + this.zzb : zzd();
    }

    public final synchronized long zzf() {
        return this.zzb;
    }

    public final synchronized void zzi(long j) {
        this.zza = j;
        this.zzb = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.zzc = -9223372036854775807L;
    }

    public final synchronized boolean zzj() {
        return this.zzb != -9223372036854775807L;
    }
}
