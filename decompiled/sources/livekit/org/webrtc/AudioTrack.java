package livekit.org.webrtc;

import java.util.IdentityHashMap;
import java.util.Iterator;

/* loaded from: classes8.dex */
public class AudioTrack extends MediaStreamTrack {
    private final IdentityHashMap<AudioTrackSink, Long> sinks;

    private static native void nativeAddSink(long track, long nativeSink);

    private static native void nativeFreeSink(long sink);

    private static native void nativeRemoveSink(long track, long nativeSink);

    private static native void nativeSetVolume(long track, double volume);

    private static native long nativeWrapSink(AudioTrackSink sink);

    public AudioTrack(long nativeTrack) {
        super(nativeTrack);
        this.sinks = new IdentityHashMap<>();
    }

    public void setVolume(double volume) {
        nativeSetVolume(getNativeAudioTrack(), volume);
    }

    public void addSink(AudioTrackSink sink) {
        if (sink == null) {
            throw new IllegalArgumentException("The AudioTrackSink is not allowed to be null");
        }
        if (this.sinks.containsKey(sink)) {
            return;
        }
        long nativeWrapSink = nativeWrapSink(sink);
        this.sinks.put(sink, Long.valueOf(nativeWrapSink));
        nativeAddSink(getNativeMediaStreamTrack(), nativeWrapSink);
    }

    public void removeSink(AudioTrackSink sink) {
        Long remove = this.sinks.remove(sink);
        if (remove != null) {
            nativeRemoveSink(getNativeMediaStreamTrack(), remove.longValue());
            nativeFreeSink(remove.longValue());
        }
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

    long getNativeAudioTrack() {
        return getNativeMediaStreamTrack();
    }
}
