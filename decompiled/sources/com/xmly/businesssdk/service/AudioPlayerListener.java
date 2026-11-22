package com.xmly.businesssdk.service;

import com.baidu.ar.arplay.core.engine.ARPScriptEnvironment;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.iflytek.cloud.SpeechConstant;
import com.xmly.businesssdk.player.entity.Playable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xmind.core.internal.dom.DOMConstants;

/* compiled from: AudioPlayerListener.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016J\u001a\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016J$\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\fH\u0016J\u0012\u0010\u0016\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J \u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0012\u0010\u001f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u0010 \u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010!\u001a\u00020\u0004H\u0016J\b\u0010\"\u001a\u00020\u0004H\u0016J\u0010\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\fH\u0016J\u0010\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u001eH\u0016¨\u0006'"}, d2 = {"Lcom/xmly/businesssdk/service/AudioPlayerListener;", "", "()V", "onBufferingUpdate", "", "percent", "", "onFloatingPlayerStateChanged", "visible", "", "onPlaybackChanged", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "", "playable", "Lcom/xmly/businesssdk/player/entity/Playable;", "onPlaybackCompleted", "onPlaybackError", "errorMessage", "errorCode", ARPScriptEnvironment.KEY_DATA_PIP_TRACK, "onPlaybackModeChanged", DOMConstants.ATTR_MODE, "onPlaybackPaused", "onPlaybackProgressUpdate", "position", "", "duration", "", "onPlaybackSpeedChanged", "speed", "", "onPlaybackStarted", "onPlaybackStateUpdated", "onPlaybackStopped", "onPlaylistCompleted", "onPlaylistSet", "playlistId", "onVolumeChanged", SpeechConstant.VOLUME, "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public abstract class AudioPlayerListener {
    public static /* synthetic */ void onPlaybackError$default(AudioPlayerListener audioPlayerListener, String str, int i, Playable playable, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onPlaybackError");
        }
        if ((i2 & 4) != 0) {
            playable = null;
        }
        audioPlayerListener.onPlaybackError(str, i, playable);
    }

    public void onBufferingUpdate(int percent) {
    }

    public void onFloatingPlayerStateChanged(boolean visible) {
    }

    public void onPlaybackChanged(String direction, Playable playable) {
        Intrinsics.checkNotNullParameter(direction, "direction");
    }

    public void onPlaybackCompleted() {
    }

    public void onPlaybackError(String errorMessage, int errorCode, Playable track) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
    }

    public void onPlaybackModeChanged(String mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
    }

    public void onPlaybackPaused(Playable playable) {
    }

    public void onPlaybackProgressUpdate(long position, long duration, double percent) {
    }

    public void onPlaybackSpeedChanged(float speed) {
    }

    public void onPlaybackStarted(Playable playable) {
    }

    public void onPlaybackStateUpdated(Playable playable) {
    }

    public void onPlaybackStopped() {
    }

    public void onPlaylistCompleted() {
    }

    public void onPlaylistSet(String playlistId) {
        Intrinsics.checkNotNullParameter(playlistId, "playlistId");
    }

    public void onVolumeChanged(float volume) {
    }
}
