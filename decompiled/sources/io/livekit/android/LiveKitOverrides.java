package io.livekit.android;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import livekit.org.webrtc.EglBase;
import livekit.org.webrtc.PeerConnectionFactory;
import livekit.org.webrtc.VideoDecoderFactory;
import livekit.org.webrtc.VideoEncoderFactory;
import okhttp3.OkHttpClient;

/* compiled from: LiveKitOverrides.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\rHÆ\u0003JQ\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006)"}, d2 = {"Lio/livekit/android/LiveKitOverrides;", "", "okHttpClient", "Lokhttp3/OkHttpClient;", "videoEncoderFactory", "Llivekit/org/webrtc/VideoEncoderFactory;", "videoDecoderFactory", "Llivekit/org/webrtc/VideoDecoderFactory;", "audioOptions", "Lio/livekit/android/AudioOptions;", "eglBase", "Llivekit/org/webrtc/EglBase;", "peerConnectionFactoryOptions", "Llivekit/org/webrtc/PeerConnectionFactory$Options;", "(Lokhttp3/OkHttpClient;Llivekit/org/webrtc/VideoEncoderFactory;Llivekit/org/webrtc/VideoDecoderFactory;Lio/livekit/android/AudioOptions;Llivekit/org/webrtc/EglBase;Llivekit/org/webrtc/PeerConnectionFactory$Options;)V", "getAudioOptions", "()Lio/livekit/android/AudioOptions;", "getEglBase", "()Llivekit/org/webrtc/EglBase;", "getOkHttpClient", "()Lokhttp3/OkHttpClient;", "getPeerConnectionFactoryOptions", "()Llivekit/org/webrtc/PeerConnectionFactory$Options;", "getVideoDecoderFactory", "()Llivekit/org/webrtc/VideoDecoderFactory;", "getVideoEncoderFactory", "()Llivekit/org/webrtc/VideoEncoderFactory;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class LiveKitOverrides {
    private final AudioOptions audioOptions;
    private final EglBase eglBase;
    private final OkHttpClient okHttpClient;
    private final PeerConnectionFactory.Options peerConnectionFactoryOptions;
    private final VideoDecoderFactory videoDecoderFactory;
    private final VideoEncoderFactory videoEncoderFactory;

    public LiveKitOverrides() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ LiveKitOverrides copy$default(LiveKitOverrides liveKitOverrides, OkHttpClient okHttpClient, VideoEncoderFactory videoEncoderFactory, VideoDecoderFactory videoDecoderFactory, AudioOptions audioOptions, EglBase eglBase, PeerConnectionFactory.Options options, int i, Object obj) {
        if ((i & 1) != 0) {
            okHttpClient = liveKitOverrides.okHttpClient;
        }
        if ((i & 2) != 0) {
            videoEncoderFactory = liveKitOverrides.videoEncoderFactory;
        }
        if ((i & 4) != 0) {
            videoDecoderFactory = liveKitOverrides.videoDecoderFactory;
        }
        if ((i & 8) != 0) {
            audioOptions = liveKitOverrides.audioOptions;
        }
        if ((i & 16) != 0) {
            eglBase = liveKitOverrides.eglBase;
        }
        if ((i & 32) != 0) {
            options = liveKitOverrides.peerConnectionFactoryOptions;
        }
        EglBase eglBase2 = eglBase;
        PeerConnectionFactory.Options options2 = options;
        return liveKitOverrides.copy(okHttpClient, videoEncoderFactory, videoDecoderFactory, audioOptions, eglBase2, options2);
    }

    /* renamed from: component1, reason: from getter */
    public final OkHttpClient getOkHttpClient() {
        return this.okHttpClient;
    }

    /* renamed from: component2, reason: from getter */
    public final VideoEncoderFactory getVideoEncoderFactory() {
        return this.videoEncoderFactory;
    }

    /* renamed from: component3, reason: from getter */
    public final VideoDecoderFactory getVideoDecoderFactory() {
        return this.videoDecoderFactory;
    }

    /* renamed from: component4, reason: from getter */
    public final AudioOptions getAudioOptions() {
        return this.audioOptions;
    }

    /* renamed from: component5, reason: from getter */
    public final EglBase getEglBase() {
        return this.eglBase;
    }

    /* renamed from: component6, reason: from getter */
    public final PeerConnectionFactory.Options getPeerConnectionFactoryOptions() {
        return this.peerConnectionFactoryOptions;
    }

    public final LiveKitOverrides copy(OkHttpClient okHttpClient, VideoEncoderFactory videoEncoderFactory, VideoDecoderFactory videoDecoderFactory, AudioOptions audioOptions, EglBase eglBase, PeerConnectionFactory.Options peerConnectionFactoryOptions) {
        return new LiveKitOverrides(okHttpClient, videoEncoderFactory, videoDecoderFactory, audioOptions, eglBase, peerConnectionFactoryOptions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveKitOverrides)) {
            return false;
        }
        LiveKitOverrides liveKitOverrides = (LiveKitOverrides) other;
        return Intrinsics.areEqual(this.okHttpClient, liveKitOverrides.okHttpClient) && Intrinsics.areEqual(this.videoEncoderFactory, liveKitOverrides.videoEncoderFactory) && Intrinsics.areEqual(this.videoDecoderFactory, liveKitOverrides.videoDecoderFactory) && Intrinsics.areEqual(this.audioOptions, liveKitOverrides.audioOptions) && Intrinsics.areEqual(this.eglBase, liveKitOverrides.eglBase) && Intrinsics.areEqual(this.peerConnectionFactoryOptions, liveKitOverrides.peerConnectionFactoryOptions);
    }

    public int hashCode() {
        OkHttpClient okHttpClient = this.okHttpClient;
        int hashCode = (okHttpClient == null ? 0 : okHttpClient.hashCode()) * 31;
        VideoEncoderFactory videoEncoderFactory = this.videoEncoderFactory;
        int hashCode2 = (hashCode + (videoEncoderFactory == null ? 0 : videoEncoderFactory.hashCode())) * 31;
        VideoDecoderFactory videoDecoderFactory = this.videoDecoderFactory;
        int hashCode3 = (hashCode2 + (videoDecoderFactory == null ? 0 : videoDecoderFactory.hashCode())) * 31;
        AudioOptions audioOptions = this.audioOptions;
        int hashCode4 = (hashCode3 + (audioOptions == null ? 0 : audioOptions.hashCode())) * 31;
        EglBase eglBase = this.eglBase;
        int hashCode5 = (hashCode4 + (eglBase == null ? 0 : eglBase.hashCode())) * 31;
        PeerConnectionFactory.Options options = this.peerConnectionFactoryOptions;
        return hashCode5 + (options != null ? options.hashCode() : 0);
    }

    public String toString() {
        return "LiveKitOverrides(okHttpClient=" + this.okHttpClient + ", videoEncoderFactory=" + this.videoEncoderFactory + ", videoDecoderFactory=" + this.videoDecoderFactory + ", audioOptions=" + this.audioOptions + ", eglBase=" + this.eglBase + ", peerConnectionFactoryOptions=" + this.peerConnectionFactoryOptions + ')';
    }

    public LiveKitOverrides(OkHttpClient okHttpClient, VideoEncoderFactory videoEncoderFactory, VideoDecoderFactory videoDecoderFactory, AudioOptions audioOptions, EglBase eglBase, PeerConnectionFactory.Options options) {
        this.okHttpClient = okHttpClient;
        this.videoEncoderFactory = videoEncoderFactory;
        this.videoDecoderFactory = videoDecoderFactory;
        this.audioOptions = audioOptions;
        this.eglBase = eglBase;
        this.peerConnectionFactoryOptions = options;
    }

    public /* synthetic */ LiveKitOverrides(OkHttpClient okHttpClient, VideoEncoderFactory videoEncoderFactory, VideoDecoderFactory videoDecoderFactory, AudioOptions audioOptions, EglBase eglBase, PeerConnectionFactory.Options options, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : okHttpClient, (i & 2) != 0 ? null : videoEncoderFactory, (i & 4) != 0 ? null : videoDecoderFactory, (i & 8) != 0 ? null : audioOptions, (i & 16) != 0 ? null : eglBase, (i & 32) != 0 ? null : options);
    }

    public final OkHttpClient getOkHttpClient() {
        return this.okHttpClient;
    }

    public final VideoEncoderFactory getVideoEncoderFactory() {
        return this.videoEncoderFactory;
    }

    public final VideoDecoderFactory getVideoDecoderFactory() {
        return this.videoDecoderFactory;
    }

    public final AudioOptions getAudioOptions() {
        return this.audioOptions;
    }

    public final EglBase getEglBase() {
        return this.eglBase;
    }

    public final PeerConnectionFactory.Options getPeerConnectionFactoryOptions() {
        return this.peerConnectionFactoryOptions;
    }
}
