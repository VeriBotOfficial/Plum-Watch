package com.xmly.businesssdk.player.playlistloader;

import com.xmly.businesssdk.player.entity.PlaybackMode;
import com.xmly.businesssdk.player.entity.PlaylistPage;

/* loaded from: classes3.dex */
public class PlaybackModePlaylistLoaderFactory {
    public static PlaybackModePlaylistLoaderProxy create(PlaybackMode playbackMode, PlaylistPage playlistPage, BasePlaylistLoader basePlaylistLoader) {
        return playbackMode == PlaybackMode.NORMAL ? new NormalPlaybackModePlaylistLoaderProxy(playlistPage, basePlaylistLoader) : new ReversePlaybackModePlaylistLoaderProxy(playlistPage, basePlaylistLoader);
    }
}
