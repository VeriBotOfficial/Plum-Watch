package com.xmly.businesssdk.player.playlistloader;

import android.content.Context;
import com.xmly.businesssdk.BusinessSDK;
import com.xmly.businesssdk.player.core.local.FxPlayerManager;
import com.xmly.businesssdk.player.core.local.PlayerService;
import com.xmly.businesssdk.player.entity.Playable;
import com.xmly.businesssdk.player.entity.PlaylistLoader;
import com.xmly.businesssdk.player.entity.PlaylistPage;
import com.xmly.businesssdk.utils.Logger;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class BasePlaylistLoader implements PlaylistLoader {
    public PlaylistLoader.PageCallback pageCallback;
    public PlaybackModePlaylistLoaderProxy playlistLoaderProxy;
    public PlaylistPage playlistPage;

    public void callLoadFailure(Throwable th) {
        this.playlistLoaderProxy.callLoadFailure();
        PlaylistLoader.PageCallback pageCallback = this.pageCallback;
        if (pageCallback != null) {
            pageCallback.onLoadFailure(th);
        }
    }

    public void callLoadSuccess(List<Playable> list, int i, boolean z) {
        Context context;
        this.playlistLoaderProxy.callLoadSuccess(list, i, z);
        try {
            context = PlayerService.getService();
            if (context == null) {
                try {
                    context = BusinessSDK.getContext();
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
            context = null;
        }
        if (context != null) {
            FxPlayerManager.getInstance(context).addPlaylist(z, list);
        }
        PlaylistLoader.PageCallback pageCallback = this.pageCallback;
        if (pageCallback != null) {
            pageCallback.onLoadSuccess(i, list);
        }
    }

    @Override // com.xmly.businesssdk.player.entity.PlaylistLoader
    public int getTotalCount() {
        return this.playlistPage.getTotalCount();
    }

    @Override // com.xmly.businesssdk.player.entity.PlaylistLoader
    public boolean hasNextPage() {
        return this.playlistLoaderProxy.hasNextPage();
    }

    @Override // com.xmly.businesssdk.player.entity.PlaylistLoader
    public boolean hasPreviousPage() {
        return this.playlistLoaderProxy.hasPreviousPage();
    }

    @Override // com.xmly.businesssdk.player.entity.PlaylistLoader
    public void init(PlaylistPage playlistPage) {
        Context context;
        this.playlistPage = playlistPage;
        try {
            context = PlayerService.getService();
            if (context == null) {
                try {
                    context = BusinessSDK.getContext();
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
            context = null;
        }
        if (context == null) {
            Logger.e("BasePlaylistLoader", "init failed: No valid context found");
        } else {
            this.playlistLoaderProxy = PlaybackModePlaylistLoaderFactory.create(FxPlayerManager.getInstance(context).getPlaybackMode(), playlistPage, this);
        }
    }

    public boolean isLoadMore() {
        return this.playlistLoaderProxy.isLoadMore();
    }

    public boolean isLoadMoreInsertListToHead() {
        return this.playlistLoaderProxy.isLoadMoreInsertListToHead();
    }

    public boolean isLoadPrevious() {
        return this.playlistLoaderProxy.isLoadPrevious();
    }

    public boolean isLoadPreviousInsertListToHead() {
        return this.playlistLoaderProxy.isLoadPreviousInsertListToHead();
    }

    public abstract void loadData(int i, boolean z);

    @Override // com.xmly.businesssdk.player.entity.PlaylistLoader
    public void loadNextPage() {
        this.playlistLoaderProxy.loadNextPage();
    }

    @Override // com.xmly.businesssdk.player.entity.PlaylistLoader
    public void loadPreviousPage() {
        this.playlistLoaderProxy.loadPreviousPage();
    }

    @Override // com.xmly.businesssdk.player.entity.PlaylistLoader
    public void setCallback(PlaylistLoader.PageCallback pageCallback) {
        this.pageCallback = pageCallback;
    }
}
