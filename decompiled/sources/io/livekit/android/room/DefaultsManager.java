package io.livekit.android.room;

import io.livekit.android.room.participant.AudioTrackPublishDefaults;
import io.livekit.android.room.participant.VideoTrackPublishDefaults;
import io.livekit.android.room.track.LocalAudioTrackOptions;
import io.livekit.android.room.track.LocalVideoTrackOptions;
import io.livekit.android.room.track.ScreenSharePresets;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DefaultsManager.kt */
@Singleton
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u0019R\u001a\u0010#\u001a\u00020\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001f¨\u0006&"}, d2 = {"Lio/livekit/android/room/DefaultsManager;", "", "()V", "audioTrackCaptureDefaults", "Lio/livekit/android/room/track/LocalAudioTrackOptions;", "getAudioTrackCaptureDefaults", "()Lio/livekit/android/room/track/LocalAudioTrackOptions;", "setAudioTrackCaptureDefaults", "(Lio/livekit/android/room/track/LocalAudioTrackOptions;)V", "audioTrackPublishDefaults", "Lio/livekit/android/room/participant/AudioTrackPublishDefaults;", "getAudioTrackPublishDefaults", "()Lio/livekit/android/room/participant/AudioTrackPublishDefaults;", "setAudioTrackPublishDefaults", "(Lio/livekit/android/room/participant/AudioTrackPublishDefaults;)V", "isPrerecording", "", "()Z", "setPrerecording", "(Z)V", "screenShareTrackCaptureDefaults", "Lio/livekit/android/room/track/LocalVideoTrackOptions;", "getScreenShareTrackCaptureDefaults", "()Lio/livekit/android/room/track/LocalVideoTrackOptions;", "setScreenShareTrackCaptureDefaults", "(Lio/livekit/android/room/track/LocalVideoTrackOptions;)V", "screenShareTrackPublishDefaults", "Lio/livekit/android/room/participant/VideoTrackPublishDefaults;", "getScreenShareTrackPublishDefaults", "()Lio/livekit/android/room/participant/VideoTrackPublishDefaults;", "setScreenShareTrackPublishDefaults", "(Lio/livekit/android/room/participant/VideoTrackPublishDefaults;)V", "videoTrackCaptureDefaults", "getVideoTrackCaptureDefaults", "setVideoTrackCaptureDefaults", "videoTrackPublishDefaults", "getVideoTrackPublishDefaults", "setVideoTrackPublishDefaults", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultsManager {
    private boolean isPrerecording;
    private VideoTrackPublishDefaults screenShareTrackPublishDefaults;
    private VideoTrackPublishDefaults videoTrackPublishDefaults;
    private LocalAudioTrackOptions audioTrackCaptureDefaults = new LocalAudioTrackOptions(false, false, false, false, false, 31, null);
    private AudioTrackPublishDefaults audioTrackPublishDefaults = new AudioTrackPublishDefaults(null, false, false, false, 15, null);
    private LocalVideoTrackOptions videoTrackCaptureDefaults = new LocalVideoTrackOptions(false, null, null, null, 15, null);
    private LocalVideoTrackOptions screenShareTrackCaptureDefaults = new LocalVideoTrackOptions(true, null, null, ScreenSharePresets.ORIGINAL.getCapture(), 6, null);

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public DefaultsManager() {
        boolean z = false;
        this.videoTrackPublishDefaults = new VideoTrackPublishDefaults(null, z, null, null, null, null, null, 127, null);
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        this.screenShareTrackPublishDefaults = new VideoTrackPublishDefaults(ScreenSharePresets.ORIGINAL.getEncoding(), false, null, null, objArr2, null, objArr, 126, null);
    }

    public final LocalAudioTrackOptions getAudioTrackCaptureDefaults() {
        return this.audioTrackCaptureDefaults;
    }

    public final void setAudioTrackCaptureDefaults(LocalAudioTrackOptions localAudioTrackOptions) {
        Intrinsics.checkNotNullParameter(localAudioTrackOptions, "<set-?>");
        this.audioTrackCaptureDefaults = localAudioTrackOptions;
    }

    public final AudioTrackPublishDefaults getAudioTrackPublishDefaults() {
        return this.audioTrackPublishDefaults;
    }

    public final void setAudioTrackPublishDefaults(AudioTrackPublishDefaults audioTrackPublishDefaults) {
        Intrinsics.checkNotNullParameter(audioTrackPublishDefaults, "<set-?>");
        this.audioTrackPublishDefaults = audioTrackPublishDefaults;
    }

    public final LocalVideoTrackOptions getVideoTrackCaptureDefaults() {
        return this.videoTrackCaptureDefaults;
    }

    public final void setVideoTrackCaptureDefaults(LocalVideoTrackOptions localVideoTrackOptions) {
        Intrinsics.checkNotNullParameter(localVideoTrackOptions, "<set-?>");
        this.videoTrackCaptureDefaults = localVideoTrackOptions;
    }

    public final VideoTrackPublishDefaults getVideoTrackPublishDefaults() {
        return this.videoTrackPublishDefaults;
    }

    public final void setVideoTrackPublishDefaults(VideoTrackPublishDefaults videoTrackPublishDefaults) {
        Intrinsics.checkNotNullParameter(videoTrackPublishDefaults, "<set-?>");
        this.videoTrackPublishDefaults = videoTrackPublishDefaults;
    }

    public final LocalVideoTrackOptions getScreenShareTrackCaptureDefaults() {
        return this.screenShareTrackCaptureDefaults;
    }

    public final void setScreenShareTrackCaptureDefaults(LocalVideoTrackOptions localVideoTrackOptions) {
        Intrinsics.checkNotNullParameter(localVideoTrackOptions, "<set-?>");
        this.screenShareTrackCaptureDefaults = localVideoTrackOptions;
    }

    public final VideoTrackPublishDefaults getScreenShareTrackPublishDefaults() {
        return this.screenShareTrackPublishDefaults;
    }

    public final void setScreenShareTrackPublishDefaults(VideoTrackPublishDefaults videoTrackPublishDefaults) {
        Intrinsics.checkNotNullParameter(videoTrackPublishDefaults, "<set-?>");
        this.screenShareTrackPublishDefaults = videoTrackPublishDefaults;
    }

    /* renamed from: isPrerecording, reason: from getter */
    public final boolean getIsPrerecording() {
        return this.isPrerecording;
    }

    public final void setPrerecording(boolean z) {
        this.isPrerecording = z;
    }
}
