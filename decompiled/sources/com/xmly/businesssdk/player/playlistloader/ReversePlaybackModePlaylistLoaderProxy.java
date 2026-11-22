package com.xmly.businesssdk.player.playlistloader;

import com.xmly.businesssdk.player.entity.Playable;
import com.xmly.businesssdk.player.entity.PlaylistPage;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public class ReversePlaybackModePlaylistLoaderProxy extends PlaybackModePlaylistLoaderProxy {
    public ReversePlaybackModePlaylistLoaderProxy(PlaylistPage playlistPage, BasePlaylistLoader basePlaylistLoader) {
        super(playlistPage, basePlaylistLoader);
    }

    @Override // com.xmly.businesssdk.player.playlistloader.PlaybackModePlaylistLoaderProxy
    public void callLoadSuccess(List<Playable> list, int i, boolean z) {
        if (z) {
            this.playlistPage.setEndPageIndex(i);
        } else {
            this.playlistPage.setStartPageIndex(i);
        }
    }

    @Override // com.xmly.businesssdk.player.playlistloader.PlaybackModePlaylistLoaderProxy
    public void convert(List<Playable> list) {
        Collections.reverse(list);
    }

    @Override // com.xmly.businesssdk.player.playlistloader.PlaybackModePlaylistLoaderProxy
    public boolean hasNextPage() {
        return this.playlistPage.getStartPageIndex() > 1;
    }

    @Override // com.xmly.businesssdk.player.playlistloader.PlaybackModePlaylistLoaderProxy
    public boolean hasPreviousPage() {
        return this.playlistPage.getEndPageIndex() < this.playlistPage.getTotalPage();
    }

    @Override // com.xmly.businesssdk.player.playlistloader.PlaybackModePlaylistLoaderProxy
    public boolean isLoadMoreInsertListToHead() {
        return true;
    }

    @Override // com.xmly.businesssdk.player.playlistloader.PlaybackModePlaylistLoaderProxy
    public boolean isLoadPreviousInsertListToHead() {
        return false;
    }

    @Override // com.xmly.businesssdk.player.playlistloader.PlaybackModePlaylistLoaderProxy
    public void loadNextPage() {
        if (this.playlistPage.getStartPageIndex() <= 1) {
            return;
        }
        this.loadMode = 2;
        this.playlistLoader.loadData(this.playlistPage.getStartPageIndex() - 1, false);
    }

    @Override // com.xmly.businesssdk.player.playlistloader.PlaybackModePlaylistLoaderProxy
    public void loadPreviousPage() {
        if (this.playlistPage.getEndPageIndex() >= this.playlistPage.getTotalPage()) {
            return;
        }
        this.loadMode = 1;
        this.playlistLoader.loadData(this.playlistPage.getEndPageIndex() + 1, true);
    }
}
