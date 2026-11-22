package io.livekit.android.dagger;

import io.livekit.android.webrtc.peerconnection.RTCThreadToken;
import kotlin.Metadata;

/* compiled from: RTCModule.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/livekit/android/dagger/LibWebrtcInitializationThreadToken;", "Lio/livekit/android/webrtc/peerconnection/RTCThreadToken;", "()V", "isDisposed", "", "()Z", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class LibWebrtcInitializationThreadToken implements RTCThreadToken {
    public static final LibWebrtcInitializationThreadToken INSTANCE = new LibWebrtcInitializationThreadToken();

    @Override // io.livekit.android.webrtc.peerconnection.RTCThreadToken
    public boolean isDisposed() {
        return false;
    }

    private LibWebrtcInitializationThreadToken() {
    }
}
