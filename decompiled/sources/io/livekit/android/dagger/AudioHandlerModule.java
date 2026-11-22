package io.livekit.android.dagger;

import android.media.AudioAttributes;
import android.os.Build;
import dagger.Module;
import dagger.Provides;
import io.livekit.android.AudioType;
import io.livekit.android.audio.AudioHandler;
import io.livekit.android.audio.AudioSwitchHandler;
import io.livekit.android.audio.CommunicationWorkaround;
import io.livekit.android.audio.CommunicationWorkaroundImpl;
import io.livekit.android.audio.NoopCommunicationWorkaround;
import io.livekit.android.memory.CloseableManager;
import java.io.Closeable;
import javax.inject.Named;
import javax.inject.Provider;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AudioHandlerModule.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0007J\u0014\u0010\t\u001a\u00020\n2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\nH\u0007J0\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0006H\u0007¨\u0006\u0017"}, d2 = {"Lio/livekit/android/dagger/AudioHandlerModule;", "", "()V", "audioHandler", "Lio/livekit/android/audio/AudioHandler;", "audioSwitchHandler", "Ljavax/inject/Provider;", "Lio/livekit/android/audio/AudioSwitchHandler;", "audioHandlerOverride", "audioOutputType", "Lio/livekit/android/AudioType;", "audioOutputAttributes", "Landroid/media/AudioAttributes;", "audioType", "audioOutputOverride", "communicationWorkaround", "Lio/livekit/android/audio/CommunicationWorkaround;", "disableCommunicationWorkaround", "", "closeableManager", "Lio/livekit/android/memory/CloseableManager;", "commWorkaroundImplProvider", "Lio/livekit/android/audio/CommunicationWorkaroundImpl;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public final class AudioHandlerModule {
    public static final AudioHandlerModule INSTANCE = new AudioHandlerModule();

    private AudioHandlerModule() {
    }

    @Provides
    public final AudioType audioOutputType(@Named("override_audio_output_type") AudioType audioOutputOverride) {
        return audioOutputOverride == null ? new AudioType.CallAudioType() : audioOutputOverride;
    }

    @Provides
    public final AudioAttributes audioOutputAttributes(AudioType audioType) {
        Intrinsics.checkNotNullParameter(audioType, "audioType");
        return audioType.getAudioAttributes();
    }

    @Provides
    @Singleton
    public final AudioHandler audioHandler(Provider<AudioSwitchHandler> audioSwitchHandler, @Named("override_audio_handler") AudioHandler audioHandlerOverride, AudioType audioOutputType) {
        Intrinsics.checkNotNullParameter(audioSwitchHandler, "audioSwitchHandler");
        Intrinsics.checkNotNullParameter(audioOutputType, "audioOutputType");
        if (audioHandlerOverride != null) {
            return audioHandlerOverride;
        }
        AudioSwitchHandler audioSwitchHandler2 = audioSwitchHandler.get();
        AudioSwitchHandler audioSwitchHandler3 = audioSwitchHandler2;
        audioSwitchHandler3.setAudioMode(audioOutputType.getAudioMode());
        audioSwitchHandler3.setAudioAttributeContentType(audioOutputType.getAudioAttributes().getContentType());
        audioSwitchHandler3.setAudioAttributeUsageType(audioOutputType.getAudioAttributes().getUsage());
        audioSwitchHandler3.setAudioStreamType(audioOutputType.getAudioStreamType());
        Intrinsics.checkNotNullExpressionValue(audioSwitchHandler2, "apply(...)");
        return audioSwitchHandler2;
    }

    @Provides
    @Singleton
    public final CommunicationWorkaround communicationWorkaround(@Named("override_disable_communication_workaround") boolean disableCommunicationWorkaround, AudioType audioType, CloseableManager closeableManager, Provider<CommunicationWorkaroundImpl> commWorkaroundImplProvider) {
        Intrinsics.checkNotNullParameter(audioType, "audioType");
        Intrinsics.checkNotNullParameter(closeableManager, "closeableManager");
        Intrinsics.checkNotNullParameter(commWorkaroundImplProvider, "commWorkaroundImplProvider");
        if (!disableCommunicationWorkaround && Build.VERSION.SDK_INT >= 30 && audioType.getAudioMode() == 3) {
            CommunicationWorkaroundImpl communicationWorkaroundImpl = commWorkaroundImplProvider.get();
            final CommunicationWorkaroundImpl communicationWorkaroundImpl2 = communicationWorkaroundImpl;
            closeableManager.registerClosable(new Closeable() { // from class: io.livekit.android.dagger.AudioHandlerModule$$ExternalSyntheticLambda0
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    CommunicationWorkaroundImpl.this.dispose();
                }
            });
            Intrinsics.checkNotNull(communicationWorkaroundImpl);
            return communicationWorkaroundImpl;
        }
        return new NoopCommunicationWorkaround();
    }
}
