package io.livekit.android.audio;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import com.yandex.div.core.timer.TimerController;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AudioFocusHandler.kt */
@Singleton
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u001f\u001a\u00020\u0013H\u0017J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020!H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR\u001a\u0010\u0017\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\nR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Lio/livekit/android/audio/AudioFocusHandler;", "Lio/livekit/android/audio/AudioHandler;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "audioAttributeContentType", "", "getAudioAttributeContentType", "()I", "setAudioAttributeContentType", "(I)V", "audioAttributeUsageType", "getAudioAttributeUsageType", "setAudioAttributeUsageType", "audioFocusListener", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "audioManager", "Landroid/media/AudioManager;", "audioRequest", "Landroid/media/AudioFocusRequest;", "audioStreamType", "getAudioStreamType", "setAudioStreamType", "focusMode", "getFocusMode", "setFocusMode", "onAudioFocusChangeListener", "getOnAudioFocusChangeListener", "()Landroid/media/AudioManager$OnAudioFocusChangeListener;", "setOnAudioFocusChangeListener", "(Landroid/media/AudioManager$OnAudioFocusChangeListener;)V", "createAudioRequest", "start", "", TimerController.STOP_COMMAND, "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public class AudioFocusHandler implements AudioHandler {
    private int audioAttributeContentType;
    private int audioAttributeUsageType;
    private AudioManager.OnAudioFocusChangeListener audioFocusListener;
    private final AudioManager audioManager;
    private AudioFocusRequest audioRequest;
    private int audioStreamType;
    private int focusMode;
    private AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener;

    @Inject
    public AudioFocusHandler(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.focusMode = 1;
        this.audioStreamType = 3;
        this.audioAttributeUsageType = 1;
        this.audioAttributeContentType = 1;
        Object systemService = context.getSystemService("audio");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        this.audioManager = (AudioManager) systemService;
        this.audioFocusListener = new AudioManager.OnAudioFocusChangeListener() { // from class: io.livekit.android.audio.AudioFocusHandler$$ExternalSyntheticLambda0
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i) {
                AudioFocusHandler.audioFocusListener$lambda$0(AudioFocusHandler.this, i);
            }
        };
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void audioFocusListener$lambda$0(AudioFocusHandler this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this$0.onAudioFocusChangeListener;
        if (onAudioFocusChangeListener != null) {
            onAudioFocusChangeListener.onAudioFocusChange(i);
        }
    }

    public final AudioManager.OnAudioFocusChangeListener getOnAudioFocusChangeListener() {
        return this.onAudioFocusChangeListener;
    }

    public final void setOnAudioFocusChangeListener(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        this.onAudioFocusChangeListener = onAudioFocusChangeListener;
    }

    @Override // io.livekit.android.audio.AudioHandler
    public void start() {
        AudioFocusRequest createAudioRequest = createAudioRequest();
        this.audioRequest = createAudioRequest;
        if (createAudioRequest != null) {
            this.audioManager.requestAudioFocus(createAudioRequest);
        }
    }

    @Override // io.livekit.android.audio.AudioHandler
    public void stop() {
        AudioFocusRequest audioFocusRequest = this.audioRequest;
        if (audioFocusRequest != null) {
            this.audioManager.abandonAudioFocusRequest(audioFocusRequest);
        }
        this.audioRequest = null;
    }

    public AudioFocusRequest createAudioRequest() {
        AudioFocusRequest build = new AudioFocusRequest.Builder(this.focusMode).setOnAudioFocusChangeListener(this.audioFocusListener).setAudioAttributes(new AudioAttributes.Builder().setUsage(this.audioAttributeUsageType).setContentType(this.audioAttributeContentType).build()).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }
}
