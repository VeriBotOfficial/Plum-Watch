package io.agora.mediaplayer;

import android.net.Uri;
import android.view.View;
import io.agora.mediaplayer.Constants;
import io.agora.mediaplayer.data.MediaPlayerSource;
import io.agora.mediaplayer.data.MediaStreamInfo;
import io.agora.rtc2.SpatialAudioParams;
import io.agora.rtc2.audio.IAudioSpectrumObserver;

/* loaded from: classes6.dex */
public interface IMediaPlayer {
    int adjustPlayoutVolume(int volume);

    int adjustPublishSignalVolume(int volume);

    int destroy();

    int enableAutoSwitchAgoraCDN(boolean enable);

    int getAgoraCDNLineCount();

    int getCurrentAgoraCDNIndex();

    long getDuration();

    int getMediaPlayerId();

    boolean getMute();

    long getPlayPosition();

    String getPlaySrc();

    int getPlayoutVolume();

    int getPublishSignalVolume();

    Constants.MediaPlayerState getState();

    int getStreamCount();

    MediaStreamInfo getStreamInfo(int index);

    int mute(boolean muted);

    int open(Uri uri, long startPos);

    int open(String url, long startPos);

    int openWithAgoraCDNSrc(String src, long startPos);

    int openWithMediaSource(MediaPlayerSource source);

    int pause();

    int play();

    int playPreloadedSrc(String src);

    int preloadSrc(String src, long startPos);

    int registerAudioFrameObserver(IMediaPlayerAudioFrameObserver audioFrameObserver, int mode);

    int registerMediaPlayerAudioSpectrumObserver(IAudioSpectrumObserver observer, int intervalInMS);

    int registerPlayerObserver(IMediaPlayerObserver playerObserver);

    int registerVideoFrameObserver(IMediaPlayerVideoFrameObserver videoFrameObserver);

    int renewAgoraCDNSrcToken(String token, long ts);

    int resume();

    int seek(long newPos);

    int selectAudioTrack(int index);

    int selectInternalSubtitle(int index);

    int selectMultiAudioTrack(int playoutTrackIndex, int publishTrackIndex);

    int setAudioDualMonoMode(int mode);

    int setAudioPitch(int pitch);

    int setExternalSubtitle(String url);

    int setLoopCount(int loopCount);

    int setPlaybackSpeed(int speed);

    int setPlayerOption(String key, int value);

    int setPlayerOptionString(String key, String value);

    int setRenderMode(int mode);

    int setSpatialAudioParams(SpatialAudioParams params);

    int setView(View videoView);

    int stop();

    int switchAgoraCDNLineByIndex(int index);

    int switchAgoraCDNSrc(String src, boolean syncPts);

    int switchSrc(String src, boolean syncPts);

    int takeScreenshot(String filename);

    int unRegisterPlayerObserver(IMediaPlayerObserver playerObserver);

    int unloadSrc(String src);

    int unregisterMediaPlayerAudioSpectrumObserver(IAudioSpectrumObserver observer);
}
