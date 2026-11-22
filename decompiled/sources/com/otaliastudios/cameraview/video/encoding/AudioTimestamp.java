package com.otaliastudios.cameraview.video.encoding;

/* loaded from: classes17.dex */
class AudioTimestamp {
    private long mBaseTimeUs;
    private int mByteRate;
    private long mBytesSinceBaseTime;
    private long mGapUs;

    static long bytesToUs(long j, int i) {
        return (j * 1000000) / i;
    }

    static long bytesToMillis(long j, int i) {
        return (j * 1000) / i;
    }

    AudioTimestamp(int i) {
        this.mByteRate = i;
    }

    long increaseUs(int i) {
        long j = i;
        long bytesToUs = bytesToUs(j, this.mByteRate);
        long nanoTime = (System.nanoTime() / 1000) - bytesToUs;
        long j2 = this.mBytesSinceBaseTime;
        if (j2 == 0) {
            this.mBaseTimeUs = nanoTime;
        }
        long bytesToUs2 = this.mBaseTimeUs + bytesToUs(j2, this.mByteRate);
        long j3 = nanoTime - bytesToUs2;
        if (j3 >= bytesToUs * 2) {
            this.mBaseTimeUs = nanoTime;
            this.mBytesSinceBaseTime = j;
            this.mGapUs = j3;
            return nanoTime;
        }
        this.mGapUs = 0L;
        this.mBytesSinceBaseTime += j;
        return bytesToUs2;
    }

    int getGapCount(int i) {
        if (this.mGapUs == 0) {
            return 0;
        }
        return (int) (this.mGapUs / bytesToUs(i, this.mByteRate));
    }

    long getGapStartUs(long j) {
        return j - this.mGapUs;
    }
}
