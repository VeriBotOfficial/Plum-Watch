package com.xmly.businesssdk.player.playlistloader;

import com.xmly.businesssdk.player.entity.Playable;
import com.xmly.businesssdk.player.entity.PlaylistPage;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class PlaybackModePlaylistLoaderProxy {
    public static final int LOAD_MODE_MORE = 1;
    public static final int LOAD_MODE_NONE = 3;
    public static final int LOAD_MODE_PREVIOUS = 2;
    public int loadMode;
    public BasePlaylistLoader playlistLoader;
    public PlaylistPage playlistPage;

    public PlaybackModePlaylistLoaderProxy(PlaylistPage playlistPage, BasePlaylistLoader basePlaylistLoader) {
        this.playlistPage = playlistPage;
        this.playlistLoader = basePlaylistLoader;
    }

    public void callLoadFailure() {
        this.loadMode = 3;
    }

    public abstract void callLoadSuccess(List<Playable> list, int i, boolean z);

    public abstract void convert(List<Playable> list);

    public abstract boolean hasNextPage();

    public abstract boolean hasPreviousPage();

    public boolean isLoadMore() {
        return this.loadMode == 1;
    }

    public abstract boolean isLoadMoreInsertListToHead();

    public boolean isLoadPrevious() {
        return this.loadMode == 2;
    }

    public abstract boolean isLoadPreviousInsertListToHead();

    public abstract void loadNextPage();

    public abstract void loadPreviousPage();
}
