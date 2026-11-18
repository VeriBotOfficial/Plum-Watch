package com.otaliastudios.cameraview.video.encoding;

/* JADX INFO: loaded from: classes2.dex */
class AudioTimestamp {
    private long mBaseTimeUs;
    private int mByteRate;
    private long mBytesSinceBaseTime;
    private long mGapUs;

    static long bytesToUs(long j, int r4) {
        return (j * 1000000) / ((long) r4);
    }

    static long bytesToMillis(long j, int r4) {
        return (j * 1000) / ((long) r4);
    }

    AudioTimestamp(int r1) {
        this.mByteRate = r1;
    }

    long increaseUs(int r15) {
        long j = r15;
        long jBytesToUs = bytesToUs(j, this.mByteRate);
        long jNanoTime = (System.nanoTime() / 1000) - jBytesToUs;
        long j2 = this.mBytesSinceBaseTime;
        if (j2 == 0) {
            this.mBaseTimeUs = jNanoTime;
        }
        long jBytesToUs2 = this.mBaseTimeUs + bytesToUs(j2, this.mByteRate);
        long j3 = jNanoTime - jBytesToUs2;
        if (j3 >= jBytesToUs * 2) {
            this.mBaseTimeUs = jNanoTime;
            this.mBytesSinceBaseTime = j;
            this.mGapUs = j3;
            return jNanoTime;
        }
        this.mGapUs = 0L;
        this.mBytesSinceBaseTime += j;
        return jBytesToUs2;
    }

    int getGapCount(int r5) {
        if (this.mGapUs == 0) {
            return 0;
        }
        return (int) (this.mGapUs / bytesToUs(r5, this.mByteRate));
    }

    long getGapStartUs(long j) {
        return j - this.mGapUs;
    }
}
