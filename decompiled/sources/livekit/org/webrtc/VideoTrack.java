package livekit.org.webrtc;

import java.util.IdentityHashMap;
import java.util.Iterator;

/* loaded from: classes8.dex */
public class VideoTrack extends MediaStreamTrack {
    private final IdentityHashMap<VideoSink, Long> sinks;

    private static native void nativeAddSink(long track, long nativeSink);

    private static native void nativeFreeSink(long sink);

    private static native boolean nativeGetShouldReceive(long track);

    private static native void nativeRemoveSink(long track, long nativeSink);

    private static native void nativeSetShouldReceive(long track, boolean shouldReceive);

    private static native long nativeWrapSink(VideoSink sink);

    public VideoTrack(long nativeTrack) {
        super(nativeTrack);
        this.sinks = new IdentityHashMap<>();
    }

    public void addSink(VideoSink sink) {
        if (sink == null) {
            throw new IllegalArgumentException("The VideoSink is not allowed to be null");
        }
        if (this.sinks.containsKey(sink)) {
            return;
        }
        long nativeWrapSink = nativeWrapSink(sink);
        this.sinks.put(sink, Long.valueOf(nativeWrapSink));
        nativeAddSink(getNativeMediaStreamTrack(), nativeWrapSink);
    }

    public void removeSink(VideoSink sink) {
        Long remove = this.sinks.remove(sink);
        if (remove != null) {
            nativeRemoveSink(getNativeMediaStreamTrack(), remove.longValue());
            nativeFreeSink(remove.longValue());
        }
    }

    public void setShouldReceive(boolean shouldReceive) {
        nativeSetShouldReceive(getNativeMediaStreamTrack(), shouldReceive);
    }

    public boolean shouldReceive() {
        return nativeGetShouldReceive(getNativeMediaStreamTrack());
    }

    @Override // livekit.org.webrtc.MediaStreamTrack
    public void dispose() {
        Iterator<Long> it = this.sinks.values().iterator();
        while (it.hasNext()) {
            long longValue = it.next().longValue();
            nativeRemoveSink(getNativeMediaStreamTrack(), longValue);
            nativeFreeSink(longValue);
        }
        this.sinks.clear();
        super.dispose();
    }

    public long getNativeVideoTrack() {
        return getNativeMediaStreamTrack();
    }
}
