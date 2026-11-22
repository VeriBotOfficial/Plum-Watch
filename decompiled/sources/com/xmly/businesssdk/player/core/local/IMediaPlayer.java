package com.xmly.businesssdk.player.core.local;

import android.media.MediaPlayer;
import com.google.android.exoplayer2.Player;
import com.xmly.businesssdk.player.IAIDLInterceptor;
import com.xmly.businesssdk.player.entity.Playable;

/* loaded from: classes3.dex */
public interface IMediaPlayer {
    public static final int CUSTOM_ERROR_GET_URL_FAILURE = 1193046;

    int getAudioSessionId();

    int getBufferingPercent();

    /* renamed from: getCurrentPlayer */
    Player mo12512getCurrentPlayer();

    int getCurrentPosition();

    int getDuration();

    Playable getPlayable();

    float getSpeed();

    boolean isDeviceMuted();

    boolean isLocalCachePlay();

    boolean isPlayAfterPrepare();

    boolean isPlayInterrupt();

    boolean isPlaying();

    boolean isPreparing();

    void pause();

    void prepareAsync();

    void release();

    void seekTo(int i);

    void setBufferingPercent(int i);

    void setDeviceMuted(boolean z);

    void setIInterceptor(IAIDLInterceptor iAIDLInterceptor);

    void setLocalCachePlay(boolean z);

    void setOnBufferingUpdateListener(MediaPlayer.OnBufferingUpdateListener onBufferingUpdateListener);

    void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener);

    void setOnErrorListener(MediaPlayer.OnErrorListener onErrorListener);

    void setOnInfoListener(MediaPlayer.OnInfoListener onInfoListener);

    void setOnPreparedListener(MediaPlayer.OnPreparedListener onPreparedListener);

    void setPlayAfterPrepare(boolean z);

    void setPlayable(Playable playable);

    void setPreparing(boolean z);

    void setSpeed(float f);

    void setSpeed(float f, boolean z);

    void setVolume(float f, float f2);

    void start();

    void stop();
}
