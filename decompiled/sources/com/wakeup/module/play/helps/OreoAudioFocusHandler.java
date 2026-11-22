package com.wakeup.module.play.helps;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OreoAudioFocusHandler.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/wakeup/module/play/helps/OreoAudioFocusHandler;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "audioFocusRequest", "Landroid/media/AudioFocusRequest;", "audioManager", "Landroid/media/AudioManager;", "abandonAudioFocus", "", "requestAudioFocus", "audioFocusChangeListener", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "module-play_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OreoAudioFocusHandler {
    private AudioFocusRequest audioFocusRequest;
    private AudioManager audioManager;
    private final Context context;

    public OreoAudioFocusHandler(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        Object systemService = context.getSystemService("audio");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        this.audioManager = (AudioManager) systemService;
    }

    public final Context getContext() {
        return this.context;
    }

    public final void abandonAudioFocus() {
        AudioManager audioManager;
        AudioFocusRequest audioFocusRequest = this.audioFocusRequest;
        if (audioFocusRequest == null || (audioManager = this.audioManager) == null) {
            return;
        }
        Intrinsics.checkNotNull(audioFocusRequest);
        audioManager.abandonAudioFocusRequest(audioFocusRequest);
    }

    public final void requestAudioFocus(AudioManager.OnAudioFocusChangeListener audioFocusChangeListener) {
        Intrinsics.checkNotNullParameter(audioFocusChangeListener, "audioFocusChangeListener");
        AudioFocusRequest build = new AudioFocusRequest.Builder(1).setOnAudioFocusChangeListener(audioFocusChangeListener).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build()).build();
        this.audioFocusRequest = build;
        AudioManager audioManager = this.audioManager;
        if (audioManager != null) {
            Intrinsics.checkNotNull(build);
            audioManager.requestAudioFocus(build);
        }
    }
}
