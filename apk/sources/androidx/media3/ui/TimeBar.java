package androidx.media3.ui;

/* JADX INFO: loaded from: classes7.dex */
public interface TimeBar {

    public interface OnScrubListener {
        void onScrubMove(TimeBar timeBar, long j);

        void onScrubStart(TimeBar timeBar, long j);

        void onScrubStop(TimeBar timeBar, long j, boolean z);
    }

    void addListener(OnScrubListener onScrubListener);

    long getPreferredUpdateDelay();

    void removeListener(OnScrubListener onScrubListener);

    void setAdGroupTimesMs(long[] jArr, boolean[] zArr, int r3);

    void setBufferedPosition(long j);

    void setDuration(long j);

    void setEnabled(boolean z);

    void setKeyCountIncrement(int r1);

    void setKeyTimeIncrement(long j);

    void setPosition(long j);
}
