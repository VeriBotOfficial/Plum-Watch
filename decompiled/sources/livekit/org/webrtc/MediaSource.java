package livekit.org.webrtc;

/* loaded from: classes8.dex */
public class MediaSource {
    private long nativeSource;
    private final RefCountDelegate refCountDelegate;

    private static native State nativeGetState(long pointer);

    public enum State {
        INITIALIZING,
        LIVE,
        ENDED,
        MUTED;

        static State fromNativeIndex(int nativeIndex) {
            return values()[nativeIndex];
        }
    }

    public MediaSource(final long nativeSource) {
        this.refCountDelegate = new RefCountDelegate(new Runnable() { // from class: livekit.org.webrtc.MediaSource$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                JniCommon.nativeReleaseRef(nativeSource);
            }
        });
        this.nativeSource = nativeSource;
    }

    public State state() {
        checkMediaSourceExists();
        return nativeGetState(this.nativeSource);
    }

    public void dispose() {
        checkMediaSourceExists();
        this.refCountDelegate.release();
        this.nativeSource = 0L;
    }

    protected long getNativeMediaSource() {
        checkMediaSourceExists();
        return this.nativeSource;
    }

    void runWithReference(Runnable runnable) {
        if (this.refCountDelegate.safeRetain()) {
            try {
                runnable.run();
            } finally {
                this.refCountDelegate.release();
            }
        }
    }

    private void checkMediaSourceExists() {
        if (this.nativeSource == 0) {
            throw new IllegalStateException("MediaSource has been disposed.");
        }
    }
}
