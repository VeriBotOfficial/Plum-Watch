package io.livekit.android.dagger;

import dagger.Module;
import dagger.Provides;
import io.livekit.android.AudioOptions;
import io.livekit.android.AudioType;
import io.livekit.android.LiveKitOverrides;
import io.livekit.android.audio.AudioHandler;
import io.livekit.android.audio.AudioProcessorOptions;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import livekit.org.webrtc.EglBase;
import livekit.org.webrtc.PeerConnectionFactory;
import livekit.org.webrtc.VideoDecoderFactory;
import livekit.org.webrtc.VideoEncoderFactory;
import livekit.org.webrtc.audio.AudioDeviceModule;
import livekit.org.webrtc.audio.JavaAudioDeviceModule;
import okhttp3.OkHttpClient;

/* compiled from: OverridesModule.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007J\b\u0010\r\u001a\u00020\u000eH\u0007J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007J%\u0010\u0011\u001a\u001f\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0012H\u0007J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007J\n\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0007J\n\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0007J\n\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lio/livekit/android/dagger/OverridesModule;", "", "overrides", "Lio/livekit/android/LiveKitOverrides;", "(Lio/livekit/android/LiveKitOverrides;)V", "audioDeviceModule", "Llivekit/org/webrtc/audio/AudioDeviceModule;", "audioHandler", "Lio/livekit/android/audio/AudioHandler;", "audioOutputType", "Lio/livekit/android/AudioType;", "audioProcessorOptions", "Lio/livekit/android/audio/AudioProcessorOptions;", "disableCommunicationWorkAround", "", "eglBase", "Llivekit/org/webrtc/EglBase;", "javaAudioDeviceModuleCustomizer", "Lkotlin/Function1;", "Llivekit/org/webrtc/audio/JavaAudioDeviceModule$Builder;", "Lkotlin/ParameterName;", "name", "builder", "", "okHttpClient", "Lokhttp3/OkHttpClient;", "peerConnectionFactoryOptions", "Llivekit/org/webrtc/PeerConnectionFactory$Options;", "videoDecoderFactory", "Llivekit/org/webrtc/VideoDecoderFactory;", "videoEncoderFactory", "Llivekit/org/webrtc/VideoEncoderFactory;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public final class OverridesModule {
    private final LiveKitOverrides overrides;

    public OverridesModule(LiveKitOverrides overrides) {
        Intrinsics.checkNotNullParameter(overrides, "overrides");
        this.overrides = overrides;
    }

    @Provides
    @Named(InjectionNames.OVERRIDE_OKHTTP)
    public final OkHttpClient okHttpClient() {
        return this.overrides.getOkHttpClient();
    }

    @Provides
    @Named(InjectionNames.OVERRIDE_AUDIO_DEVICE_MODULE)
    public final AudioDeviceModule audioDeviceModule() {
        AudioOptions audioOptions = this.overrides.getAudioOptions();
        if (audioOptions != null) {
            return audioOptions.getAudioDeviceModule();
        }
        return null;
    }

    @Provides
    @Named(InjectionNames.OVERRIDE_AUDIO_PROCESSOR_OPTIONS)
    public final AudioProcessorOptions audioProcessorOptions() {
        AudioOptions audioOptions = this.overrides.getAudioOptions();
        if (audioOptions != null) {
            return audioOptions.getAudioProcessorOptions();
        }
        return null;
    }

    @Provides
    @Named(InjectionNames.OVERRIDE_JAVA_AUDIO_DEVICE_MODULE_CUSTOMIZER)
    public final Function1<JavaAudioDeviceModule.Builder, Unit> javaAudioDeviceModuleCustomizer() {
        AudioOptions audioOptions = this.overrides.getAudioOptions();
        if (audioOptions != null) {
            return audioOptions.getJavaAudioDeviceModuleCustomizer();
        }
        return null;
    }

    @Provides
    @Named(InjectionNames.OVERRIDE_VIDEO_ENCODER_FACTORY)
    public final VideoEncoderFactory videoEncoderFactory() {
        return this.overrides.getVideoEncoderFactory();
    }

    @Provides
    @Named(InjectionNames.OVERRIDE_VIDEO_DECODER_FACTORY)
    public final VideoDecoderFactory videoDecoderFactory() {
        return this.overrides.getVideoDecoderFactory();
    }

    @Provides
    @Named(InjectionNames.OVERRIDE_AUDIO_HANDLER)
    public final AudioHandler audioHandler() {
        AudioOptions audioOptions = this.overrides.getAudioOptions();
        if (audioOptions != null) {
            return audioOptions.getAudioHandler();
        }
        return null;
    }

    @Provides
    @Named(InjectionNames.OVERRIDE_AUDIO_OUTPUT_TYPE)
    public final AudioType audioOutputType() {
        AudioOptions audioOptions = this.overrides.getAudioOptions();
        if (audioOptions != null) {
            return audioOptions.getAudioOutputType();
        }
        return null;
    }

    @Provides
    @Named(InjectionNames.OVERRIDE_PEER_CONNECTION_FACTORY_OPTIONS)
    public final PeerConnectionFactory.Options peerConnectionFactoryOptions() {
        return this.overrides.getPeerConnectionFactoryOptions();
    }

    @Provides
    @Named(InjectionNames.OVERRIDE_DISABLE_COMMUNICATION_WORKAROUND)
    public final boolean disableCommunicationWorkAround() {
        AudioOptions audioOptions = this.overrides.getAudioOptions();
        if (audioOptions != null) {
            return audioOptions.getDisableCommunicationModeWorkaround();
        }
        return false;
    }

    @Provides
    @Named(InjectionNames.OVERRIDE_EGL_BASE)
    public final EglBase eglBase() {
        return this.overrides.getEglBase();
    }
}
