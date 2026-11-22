package io.livekit.android.room.util;

import kotlin.Metadata;
import livekit.org.webrtc.PeerConnection;

/* compiled from: PeerConnectionStateObservable.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u00020\u00038gX§\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/livekit/android/room/util/PeerConnectionStateObservable;", "", "connectionState", "Llivekit/org/webrtc/PeerConnection$PeerConnectionState;", "getConnectionState$annotations", "()V", "getConnectionState", "()Llivekit/org/webrtc/PeerConnection$PeerConnectionState;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface PeerConnectionStateObservable {

    /* compiled from: PeerConnectionStateObservable.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void getConnectionState$annotations() {
        }
    }

    PeerConnection.PeerConnectionState getConnectionState();
}
