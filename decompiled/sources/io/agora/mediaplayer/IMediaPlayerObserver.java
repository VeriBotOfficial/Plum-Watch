package io.agora.mediaplayer;

import io.agora.mediaplayer.Constants;
import io.agora.mediaplayer.data.CacheStatistics;
import io.agora.mediaplayer.data.PlayerPlaybackStats;
import io.agora.mediaplayer.data.PlayerUpdatedInfo;
import io.agora.mediaplayer.data.SrcInfo;

/* loaded from: classes6.dex */
public interface IMediaPlayerObserver {
    void onAgoraCDNTokenWillExpire();

    void onAudioVolumeIndication(int volume);

    void onMetaData(Constants.MediaPlayerMetadataType type, byte[] data);

    void onPlayBufferUpdated(long playCachedBuffer);

    void onPlayerCacheStats(CacheStatistics stats);

    void onPlayerEvent(Constants.MediaPlayerEvent eventCode, long elapsedTime, String message);

    void onPlayerInfoUpdated(PlayerUpdatedInfo info);

    void onPlayerPlaybackStats(PlayerPlaybackStats stats);

    void onPlayerSrcInfoChanged(SrcInfo from, SrcInfo to);

    void onPlayerStateChanged(Constants.MediaPlayerState state, Constants.MediaPlayerReason reason);

    void onPositionChanged(long positionMs, long timestampMs);

    void onPreloadEvent(String src, Constants.MediaPlayerPreloadEvent event);
}
