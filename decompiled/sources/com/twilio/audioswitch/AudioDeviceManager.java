package com.twilio.audioswitch;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import com.twilio.audioswitch.android.BuildWrapper;
import com.twilio.audioswitch.android.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AudioDeviceManager.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0006\u0010'\u001a\u00020(J\u000e\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020%J\u000e\u0010+\u001a\u00020(2\u0006\u0010*\u001a\u00020%J\u0006\u0010,\u001a\u00020%J\b\u0010-\u001a\u00020%H\u0007J\u000e\u0010.\u001a\u00020(2\u0006\u0010.\u001a\u00020%J\b\u0010/\u001a\u00020(H\u0007J\b\u00100\u001a\u00020(H\u0007R\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0012\"\u0004\b\u001f\u0010\u0014R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0012\"\u0004\b\"\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/twilio/audioswitch/AudioDeviceManager;", "", "context", "Landroid/content/Context;", "logger", "Lcom/twilio/audioswitch/android/Logger;", "audioManager", "Landroid/media/AudioManager;", "build", "Lcom/twilio/audioswitch/android/BuildWrapper;", "audioFocusRequest", "Lcom/twilio/audioswitch/AudioFocusRequestWrapper;", "audioFocusChangeListener", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "(Landroid/content/Context;Lcom/twilio/audioswitch/android/Logger;Landroid/media/AudioManager;Lcom/twilio/audioswitch/android/BuildWrapper;Lcom/twilio/audioswitch/AudioFocusRequestWrapper;Landroid/media/AudioManager$OnAudioFocusChangeListener;)V", "audioAttributeContentType", "", "getAudioAttributeContentType", "()I", "setAudioAttributeContentType", "(I)V", "audioAttributeUsageType", "getAudioAttributeUsageType", "setAudioAttributeUsageType", "audioMode", "getAudioMode", "setAudioMode", "audioRequest", "Landroid/media/AudioFocusRequest;", "audioStreamType", "getAudioStreamType", "setAudioStreamType", "focusMode", "getFocusMode", "setFocusMode", "savedAudioMode", "savedIsMicrophoneMuted", "", "savedSpeakerphoneEnabled", "cacheAudioState", "", "enableBluetoothSco", "enable", "enableSpeakerphone", "hasEarpiece", "hasSpeakerphone", "mute", "restoreAudioState", "setAudioFocus", "audioswitch_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class AudioDeviceManager {
    private int audioAttributeContentType;
    private int audioAttributeUsageType;
    private final AudioManager.OnAudioFocusChangeListener audioFocusChangeListener;
    private final AudioFocusRequestWrapper audioFocusRequest;
    private final AudioManager audioManager;
    private int audioMode;
    private AudioFocusRequest audioRequest;
    private int audioStreamType;
    private final BuildWrapper build;
    private final Context context;
    private int focusMode;
    private final Logger logger;
    private int savedAudioMode;
    private boolean savedIsMicrophoneMuted;
    private boolean savedSpeakerphoneEnabled;

    public AudioDeviceManager(Context context, Logger logger, AudioManager audioManager, BuildWrapper build, AudioFocusRequestWrapper audioFocusRequest, AudioManager.OnAudioFocusChangeListener audioFocusChangeListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(audioManager, "audioManager");
        Intrinsics.checkNotNullParameter(build, "build");
        Intrinsics.checkNotNullParameter(audioFocusRequest, "audioFocusRequest");
        Intrinsics.checkNotNullParameter(audioFocusChangeListener, "audioFocusChangeListener");
        this.context = context;
        this.logger = logger;
        this.audioManager = audioManager;
        this.build = build;
        this.audioFocusRequest = audioFocusRequest;
        this.audioFocusChangeListener = audioFocusChangeListener;
        this.audioMode = 3;
        this.focusMode = 2;
        this.audioAttributeUsageType = 2;
        this.audioAttributeContentType = 1;
    }

    public /* synthetic */ AudioDeviceManager(Context context, Logger logger, AudioManager audioManager, BuildWrapper buildWrapper, AudioFocusRequestWrapper audioFocusRequestWrapper, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, logger, audioManager, (i & 8) != 0 ? new BuildWrapper() : buildWrapper, (i & 16) != 0 ? new AudioFocusRequestWrapper() : audioFocusRequestWrapper, onAudioFocusChangeListener);
    }

    public final int getAudioMode() {
        return this.audioMode;
    }

    public final void setAudioMode(int i) {
        this.audioMode = i;
    }

    public final int getFocusMode() {
        return this.focusMode;
    }

    public final void setFocusMode(int i) {
        this.focusMode = i;
    }

    public final int getAudioStreamType() {
        return this.audioStreamType;
    }

    public final void setAudioStreamType(int i) {
        this.audioStreamType = i;
    }

    public final int getAudioAttributeUsageType() {
        return this.audioAttributeUsageType;
    }

    public final void setAudioAttributeUsageType(int i) {
        this.audioAttributeUsageType = i;
    }

    public final int getAudioAttributeContentType() {
        return this.audioAttributeContentType;
    }

    public final void setAudioAttributeContentType(int i) {
        this.audioAttributeContentType = i;
    }

    public final boolean hasEarpiece() {
        boolean hasSystemFeature = this.context.getPackageManager().hasSystemFeature("android.hardware.telephony");
        if (hasSystemFeature) {
            this.logger.d("AudioDeviceManager", "Earpiece available");
        }
        return hasSystemFeature;
    }

    public final boolean hasSpeakerphone() {
        if (this.build.getVersion() >= 23 && this.context.getPackageManager().hasSystemFeature("android.hardware.audio.output")) {
            for (AudioDeviceInfo device : this.audioManager.getDevices(2)) {
                Intrinsics.checkNotNullExpressionValue(device, "device");
                if (device.getType() == 2) {
                    this.logger.d("AudioDeviceManager", "Speakerphone available");
                    return true;
                }
            }
            return false;
        }
        this.logger.d("AudioDeviceManager", "Speakerphone available");
        return true;
    }

    public final void setAudioFocus() {
        if (this.build.getVersion() >= 26) {
            AudioFocusRequest buildRequest = this.audioFocusRequest.buildRequest(this.audioFocusChangeListener, this.focusMode, this.audioAttributeUsageType, this.audioAttributeContentType);
            this.audioRequest = buildRequest;
            if (buildRequest != null) {
                this.audioManager.requestAudioFocus(buildRequest);
            }
        } else {
            this.audioManager.requestAudioFocus(this.audioFocusChangeListener, this.audioStreamType, this.focusMode);
        }
        this.audioManager.setMode(this.audioMode);
    }

    public final void enableBluetoothSco(boolean enable) {
        AudioManager audioManager = this.audioManager;
        if (enable) {
            audioManager.startBluetoothSco();
        } else {
            audioManager.stopBluetoothSco();
        }
    }

    public final void enableSpeakerphone(boolean enable) {
        this.audioManager.setSpeakerphoneOn(enable);
    }

    public final void mute(boolean mute) {
        this.audioManager.setMicrophoneMute(mute);
    }

    public final void cacheAudioState() {
        this.savedAudioMode = this.audioManager.getMode();
        this.savedIsMicrophoneMuted = this.audioManager.isMicrophoneMute();
        this.savedSpeakerphoneEnabled = this.audioManager.isSpeakerphoneOn();
    }

    public final void restoreAudioState() {
        this.audioManager.setMode(this.savedAudioMode);
        mute(this.savedIsMicrophoneMuted);
        enableSpeakerphone(this.savedSpeakerphoneEnabled);
        if (this.build.getVersion() >= 26) {
            AudioFocusRequest audioFocusRequest = this.audioRequest;
            if (audioFocusRequest != null) {
                this.audioManager.abandonAudioFocusRequest(audioFocusRequest);
            }
            this.audioRequest = null;
            return;
        }
        this.audioManager.abandonAudioFocus(this.audioFocusChangeListener);
    }
}
