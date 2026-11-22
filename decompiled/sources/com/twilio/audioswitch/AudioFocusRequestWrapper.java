package com.twilio.audioswitch;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AudioFocusRequestWrapper.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bH\u0007¨\u0006\u000b"}, d2 = {"Lcom/twilio/audioswitch/AudioFocusRequestWrapper;", "", "()V", "buildRequest", "Landroid/media/AudioFocusRequest;", "audioFocusChangeListener", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "focusMode", "", "audioAttributeUsageType", "audioAttributeContentType", "audioswitch_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class AudioFocusRequestWrapper {
    public static /* synthetic */ AudioFocusRequest buildRequest$default(AudioFocusRequestWrapper audioFocusRequestWrapper, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 2;
        }
        if ((i4 & 4) != 0) {
            i2 = 2;
        }
        if ((i4 & 8) != 0) {
            i3 = 1;
        }
        return audioFocusRequestWrapper.buildRequest(onAudioFocusChangeListener, i, i2, i3);
    }

    public final AudioFocusRequest buildRequest(AudioManager.OnAudioFocusChangeListener audioFocusChangeListener, int focusMode, int audioAttributeUsageType, int audioAttributeContentType) {
        Intrinsics.checkNotNullParameter(audioFocusChangeListener, "audioFocusChangeListener");
        AudioFocusRequest build = new AudioFocusRequest.Builder(focusMode).setAudioAttributes(new AudioAttributes.Builder().setUsage(audioAttributeUsageType).setContentType(audioAttributeContentType).build()).setAcceptsDelayedFocusGain(true).setOnAudioFocusChangeListener(audioFocusChangeListener).build();
        Intrinsics.checkNotNullExpressionValue(build, "AudioFocusRequest.Builde…ner)\n            .build()");
        return build;
    }
}
