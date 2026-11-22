package com.xmly.businesssdk.player.core;

import com.xmly.businesssdk.player.entity.Playable;
import com.xmly.businesssdk.player.entity.PlaybackMode;
import com.xmly.businesssdk.player.entity.PlayerExtra;
import com.xmly.businesssdk.player.entity.PlaylistLoader;
import com.xmly.businesssdk.player.entity.PlaylistPage;
import com.xmly.businesssdk.player.entity.SleepPlayInfo;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes3.dex */
public interface IAudioPlayManager {
    void addListener(PlayerListener playerListener);

    void addMediaSource(SleepPlayInfo sleepPlayInfo);

    void addPlaylist(boolean z, List<Playable> list);

    int getAudioSessionId();

    String getCurrentAlbumTag();

    Serializable getCurrentData();

    PlaylistLoader getCurrentPageLoader();

    int getCurrentPlayDuration();

    int getCurrentPlayProgress();

    Playable getCurrentPlayable();

    void getCurrentPlayable(PlayableCallback playableCallback);

    PlaylistPage getCurrentPlaylistPage();

    int getCurrentPosition();

    byte getCurrentType();

    Playable getNextPlayable();

    PlaybackMode getPlaybackMode();

    List<Playable> getPlaylist();

    int getPlaylistSize();

    Playable getPrePlayable();

    String getScene();

    float getSpeed();

    float getVolume();

    float getVolumeWithIndex(int i);

    boolean isDeviceMuted();

    boolean isPlayDuration();

    boolean isPlaying();

    void next();

    void pause();

    void play();

    void play(String str);

    void prev();

    void releaseAll();

    void removeAllMediaSource();

    void removeListener(PlayerListener playerListener);

    void removeMediaSource(int i);

    void seekTo(int i);

    void setDeviceMuted(boolean z);

    void setPlaybackMode(PlaybackMode playbackMode);

    void setPlaylist(List<Playable> list, PlayerExtra playerExtra);

    void setPlaylistOnly(List<Playable> list);

    void setScene(String str);

    void setSpeed(float f);

    void setVolume(float f, float f2);

    void setVolumeWithIndex(int i, float f, float f2);

    void skipTo(int i, boolean z);

    void stop();

    boolean toggle();
}
