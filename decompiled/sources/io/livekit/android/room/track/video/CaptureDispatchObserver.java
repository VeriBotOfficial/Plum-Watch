package io.livekit.android.room.track.video;

import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import livekit.org.webrtc.CapturerObserver;
import livekit.org.webrtc.VideoFrame;
import livekit.org.webrtc.VideoSink;

/* compiled from: CaptureDispatchObserver.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u000e\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0001J\u000e\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0007J\u000e\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0001J\u000e\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0007R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0004j\b\u0012\u0004\u0012\u00020\u0001`\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0004j\b\u0012\u0004\u0012\u00020\u0007`\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lio/livekit/android/room/track/video/CaptureDispatchObserver;", "Llivekit/org/webrtc/CapturerObserver;", "()V", "observers", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "sinks", "Llivekit/org/webrtc/VideoSink;", "onCapturerStarted", "", "success", "", "onCapturerStopped", "onFrameCaptured", "frame", "Llivekit/org/webrtc/VideoFrame;", "registerObserver", "observer", "registerSink", "sink", "unregisterObserver", "unregisterSink", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CaptureDispatchObserver implements CapturerObserver {
    private final LinkedHashSet<CapturerObserver> observers = new LinkedHashSet<>();
    private final LinkedHashSet<VideoSink> sinks = new LinkedHashSet<>();

    public final synchronized void registerObserver(CapturerObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.observers.add(observer);
    }

    public final synchronized void unregisterObserver(CapturerObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.observers.remove(observer);
    }

    public final synchronized void registerSink(VideoSink sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.sinks.add(sink);
    }

    public final synchronized void unregisterSink(VideoSink sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.sinks.remove(sink);
    }

    @Override // livekit.org.webrtc.CapturerObserver
    public synchronized void onCapturerStarted(boolean success) {
        Iterator<CapturerObserver> it = this.observers.iterator();
        while (it.hasNext()) {
            it.next().onCapturerStarted(success);
        }
    }

    @Override // livekit.org.webrtc.CapturerObserver
    public synchronized void onCapturerStopped() {
        Iterator<CapturerObserver> it = this.observers.iterator();
        while (it.hasNext()) {
            it.next().onCapturerStopped();
        }
    }

    @Override // livekit.org.webrtc.CapturerObserver
    public synchronized void onFrameCaptured(VideoFrame frame) {
        Intrinsics.checkNotNullParameter(frame, "frame");
        Iterator<CapturerObserver> it = this.observers.iterator();
        while (it.hasNext()) {
            it.next().onFrameCaptured(frame);
        }
        Iterator<VideoSink> it2 = this.sinks.iterator();
        while (it2.hasNext()) {
            it2.next().onFrame(frame);
        }
    }
}
