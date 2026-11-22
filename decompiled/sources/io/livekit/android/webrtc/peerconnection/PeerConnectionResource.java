package io.livekit.android.webrtc.peerconnection;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import livekit.org.webrtc.PeerConnection;

/* compiled from: PeerConnectionResource.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lio/livekit/android/webrtc/peerconnection/PeerConnectionResource;", "T", "", "parentPeerConnection", "Llivekit/org/webrtc/PeerConnection;", "(Llivekit/org/webrtc/PeerConnection;)V", "getParentPeerConnection", "()Llivekit/org/webrtc/PeerConnection;", "get", "()Ljava/lang/Object;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class PeerConnectionResource<T> {
    private final PeerConnection parentPeerConnection;

    public abstract T get();

    public PeerConnectionResource(PeerConnection parentPeerConnection) {
        Intrinsics.checkNotNullParameter(parentPeerConnection, "parentPeerConnection");
        this.parentPeerConnection = parentPeerConnection;
    }

    public final PeerConnection getParentPeerConnection() {
        return this.parentPeerConnection;
    }
}
