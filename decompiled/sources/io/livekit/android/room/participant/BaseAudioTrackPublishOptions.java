package io.livekit.android.room.participant;

import kotlin.Metadata;

/* compiled from: LocalParticipant.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0012\u0010\r\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\n¨\u0006\u000f"}, d2 = {"Lio/livekit/android/room/participant/BaseAudioTrackPublishOptions;", "", "()V", "audioBitrate", "", "getAudioBitrate", "()Ljava/lang/Integer;", "dtx", "", "getDtx", "()Z", "preconnect", "getPreconnect", "red", "getRed", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class BaseAudioTrackPublishOptions {
    public abstract Integer getAudioBitrate();

    public abstract boolean getDtx();

    public abstract boolean getPreconnect();

    public abstract boolean getRed();
}
