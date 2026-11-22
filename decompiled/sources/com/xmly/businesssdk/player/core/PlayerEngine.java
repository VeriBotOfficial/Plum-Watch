package com.xmly.businesssdk.player.core;

import android.support.v4.media.session.MediaSessionCompat;
import com.xmly.businesssdk.player.IAIDLInterceptor;
import com.xmly.businesssdk.player.entity.Playable;
import com.xmly.businesssdk.player.entity.PlaybackMode;
import com.xmly.businesssdk.player.entity.SleepPlayInfo;
import java.util.List;

/* loaded from: classes3.dex */
public interface PlayerEngine {
    List<SleepPlayInfo> addMediaSource(SleepPlayInfo sleepPlayInfo);

    void addPlaylist(boolean z, List<Playable> list);

    int getAudioSessionId();

    int getCurrentPlayDuration();

    int getCurrentPlayProgress();

    Playable getCurrentPlayable();

    int getCurrentPosition();

    Playable getNextPlayable();

    PlaybackMode getPlaybackMode();

    List<Playable> getPlaylist();

    int getPlaylistSize();

    Playable getPrePlayable();

    List<SleepPlayInfo> getSleepPlayInfo();

    float getSpeed();

    float getVolume();

    float getVolumeWithIndex(int i);

    boolean isDeviceMuted();

    boolean isFadeVolumeWhenStartOrPause();

    boolean isPlayDuration();

    boolean isPlaying();

    void next();

    void pause();

    void play();

    void prev();

    void removeAllMediaSource();

    List<SleepPlayInfo> removeMediaSource(int i);

    void seekTo(int i);

    void seekToId(String str);

    void setDeviceMuted(boolean z);

    void setFadeVolumeWhenStartOrPause(boolean z);

    void setIInterceptor(IAIDLInterceptor iAIDLInterceptor);

    void setListener(PlayerListener playerListener);

    void setMediaSession(MediaSessionCompat mediaSessionCompat);

    void setPlayNextWhenError(boolean z);

    void setPlaybackMode(PlaybackMode playbackMode);

    void setPlaylist(List<Playable> list);

    void setSpeed(float f);

    void setVolume(float f, float f2);

    void setVolumeWithIndex(int i, float f, float f2);

    void skipTo(int i, boolean z);

    void stop();

    boolean toggle();
}
