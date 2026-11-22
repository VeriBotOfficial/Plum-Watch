package androidx.media3.common.util;

import com.wakeup.common.dfx.FeedbackLogReporter;
import java.util.concurrent.TimeoutException;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* loaded from: classes10.dex */
public final class TimestampAdjuster {
    private static final long MAX_PTS_PLUS_ONE = 8589934592L;
    public static final long MODE_NO_OFFSET = Long.MAX_VALUE;
    public static final long MODE_SHARED = 9223372036854775806L;
    private long firstSampleTimestampUs;
    private long lastUnadjustedTimestampUs;
    private final ThreadLocal<Long> nextSampleTimestampUs = new ThreadLocal<>();
    private long timestampOffsetUs;

    public TimestampAdjuster(long j) {
        reset(j);
    }

    public synchronized void sharedInitializeOrWait(boolean z, long j, long j2) throws InterruptedException, TimeoutException {
        Assertions.checkState(this.firstSampleTimestampUs == MODE_SHARED);
        if (isInitialized()) {
            return;
        }
        if (z) {
            this.nextSampleTimestampUs.set(Long.valueOf(j));
        } else {
            long j3 = 0;
            long j4 = j2;
            while (!isInitialized()) {
                if (j2 == 0) {
                    wait();
                } else {
                    Assertions.checkState(j4 > 0);
                    long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                    wait(j4);
                    j3 += android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
                    if (j3 >= j2 && !isInitialized()) {
                        throw new TimeoutException("TimestampAdjuster failed to initialize in " + j2 + " milliseconds");
                    }
                    j4 = j2 - j3;
                }
            }
        }
    }

    public synchronized long getFirstSampleTimestampUs() {
        long j;
        j = this.firstSampleTimestampUs;
        if (j == Long.MAX_VALUE || j == MODE_SHARED) {
            j = -9223372036854775807L;
        }
        return j;
    }

    public synchronized long getLastAdjustedTimestampUs() {
        long firstSampleTimestampUs;
        long j = this.lastUnadjustedTimestampUs;
        if (j != -9223372036854775807L) {
            firstSampleTimestampUs = j + this.timestampOffsetUs;
        } else {
            firstSampleTimestampUs = getFirstSampleTimestampUs();
        }
        return firstSampleTimestampUs;
    }

    public synchronized long getTimestampOffsetUs() {
        return this.timestampOffsetUs;
    }

    public synchronized void reset(long j) {
        this.firstSampleTimestampUs = j;
        this.timestampOffsetUs = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.lastUnadjustedTimestampUs = -9223372036854775807L;
    }

    public synchronized long adjustTsTimestamp(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.lastUnadjustedTimestampUs;
        if (j2 != -9223372036854775807L) {
            long usToNonWrappedPts = usToNonWrappedPts(j2);
            long j3 = (IjkMediaMeta.AV_CH_WIDE_RIGHT + usToNonWrappedPts) / 8589934592L;
            long j4 = ((j3 - 1) * 8589934592L) + j;
            j += j3 * 8589934592L;
            if (Math.abs(j4 - usToNonWrappedPts) < Math.abs(j - usToNonWrappedPts)) {
                j = j4;
            }
        }
        return adjustSampleTimestamp(ptsToUs(j));
    }

    public synchronized long adjustTsTimestampGreaterThanPreviousTimestamp(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.lastUnadjustedTimestampUs;
        if (j2 != -9223372036854775807L) {
            long usToNonWrappedPts = usToNonWrappedPts(j2);
            long j3 = usToNonWrappedPts / 8589934592L;
            long j4 = (j3 * 8589934592L) + j;
            j += (j3 + 1) * 8589934592L;
            if (j4 >= usToNonWrappedPts) {
                j = j4;
            }
        }
        return adjustSampleTimestamp(ptsToUs(j));
    }

    public synchronized long adjustSampleTimestamp(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (!isInitialized()) {
            long j2 = this.firstSampleTimestampUs;
            if (j2 == MODE_SHARED) {
                j2 = ((Long) Assertions.checkNotNull(this.nextSampleTimestampUs.get())).longValue();
            }
            this.timestampOffsetUs = j2 - j;
            notifyAll();
        }
        this.lastUnadjustedTimestampUs = j;
        return j + this.timestampOffsetUs;
    }

    public synchronized boolean isInitialized() {
        return this.timestampOffsetUs != -9223372036854775807L;
    }

    public static long ptsToUs(long j) {
        return Util.scaleLargeTimestamp(j, 1000000L, FeedbackLogReporter.DEFAULT_UPLOAD_TIMEOUT_MS);
    }

    public static long usToWrappedPts(long j) {
        return usToNonWrappedPts(j) % 8589934592L;
    }

    public static long usToNonWrappedPts(long j) {
        return Util.scaleLargeTimestamp(j, FeedbackLogReporter.DEFAULT_UPLOAD_TIMEOUT_MS, 1000000L);
    }
}
