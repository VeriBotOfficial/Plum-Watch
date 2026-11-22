package io.livekit.android.webrtc.peerconnection;

import io.livekit.android.webrtc.PeerConnectionFactoryManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RTCThreadUtils.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lio/livekit/android/webrtc/peerconnection/RTCThreadTokenImpl;", "Lio/livekit/android/webrtc/peerconnection/RTCThreadToken;", "peerConnectionFactoryManager", "Lio/livekit/android/webrtc/PeerConnectionFactoryManager;", "(Lio/livekit/android/webrtc/PeerConnectionFactoryManager;)V", "isDisposed", "", "()Z", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RTCThreadTokenImpl implements RTCThreadToken {
    private final PeerConnectionFactoryManager peerConnectionFactoryManager;

    public RTCThreadTokenImpl(PeerConnectionFactoryManager peerConnectionFactoryManager) {
        Intrinsics.checkNotNullParameter(peerConnectionFactoryManager, "peerConnectionFactoryManager");
        this.peerConnectionFactoryManager = peerConnectionFactoryManager;
    }

    @Override // io.livekit.android.webrtc.peerconnection.RTCThreadToken
    public boolean isDisposed() {
        return this.peerConnectionFactoryManager.getIsDisposed();
    }
}
