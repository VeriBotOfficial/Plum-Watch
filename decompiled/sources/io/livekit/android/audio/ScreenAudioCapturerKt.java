package io.livekit.android.audio;

import android.media.AudioPlaybackCaptureConfiguration;
import android.os.Build;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScreenAudioCapturer.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u001e\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000*\"\u0010\n\"\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¨\u0006\u000b"}, d2 = {"BUFFER_SIZE_FACTOR", "", "DEFAULT_CONFIGURATOR", "Lkotlin/Function1;", "Landroid/media/AudioPlaybackCaptureConfiguration$Builder;", "", "Lio/livekit/android/audio/AudioPlaybackCaptureConfigurator;", "DEFAULT_GAIN", "", "MIN_GAIN_CHANGE", "AudioPlaybackCaptureConfigurator", "livekit-android-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScreenAudioCapturerKt {
    private static final int BUFFER_SIZE_FACTOR = 2;
    private static final Function1<AudioPlaybackCaptureConfiguration.Builder, Unit> DEFAULT_CONFIGURATOR = new Function1<AudioPlaybackCaptureConfiguration.Builder, Unit>() { // from class: io.livekit.android.audio.ScreenAudioCapturerKt$DEFAULT_CONFIGURATOR$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AudioPlaybackCaptureConfiguration.Builder builder) {
            invoke2(builder);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AudioPlaybackCaptureConfiguration.Builder builder) {
            Intrinsics.checkNotNullParameter(builder, "builder");
            if (Build.VERSION.SDK_INT >= 29) {
                builder.addMatchingUsage(0);
                builder.addMatchingUsage(1);
                builder.addMatchingUsage(14);
            }
        }
    };
    private static final float DEFAULT_GAIN = 1.0f;
    private static final float MIN_GAIN_CHANGE = 0.01f;
}
