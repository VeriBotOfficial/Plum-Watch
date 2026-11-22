package io.agora.base.internal.video;

/* loaded from: classes6.dex */
public class FrameExtraInfo {
    public final long captureTimeNs;
    public final long captureTimeRtp;
    public final long ntpTimestamp;
    public final int qp;
    public final long rtpTimestampMs;

    public FrameExtraInfo() {
        this.captureTimeNs = 0L;
        this.captureTimeRtp = 0L;
        this.rtpTimestampMs = 0L;
        this.ntpTimestamp = 0L;
        this.qp = 0;
    }

    private FrameExtraInfo(long j, long j2, long j3, long j4, int i) {
        this.captureTimeNs = j;
        this.captureTimeRtp = j2;
        this.rtpTimestampMs = j3;
        this.ntpTimestamp = j4;
        this.qp = i;
    }

    public long getCaptureTimeNs() {
        return this.captureTimeNs;
    }

    public long getCaptureTimeRtp() {
        return this.captureTimeRtp;
    }

    public long getRtpTimestampMs() {
        return this.rtpTimestampMs;
    }

    public long getNtpTimestamp() {
        return this.ntpTimestamp;
    }

    public int getQp() {
        return this.qp;
    }
}
