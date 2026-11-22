package com.xmly.businesssdk.player.entity;

import com.xmly.businesssdk.utils.ClassUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public interface PlaylistLoader {

    public static class Factory {
        private static final PlaylistLoader DEFAULT_PAGE_LOADER = new PlaylistLoader() { // from class: com.xmly.businesssdk.player.entity.PlaylistLoader.Factory.1
            @Override // com.xmly.businesssdk.player.entity.PlaylistLoader
            public int getTotalCount() {
                return 0;
            }

            @Override // com.xmly.businesssdk.player.entity.PlaylistLoader
            public boolean hasNextPage() {
                return false;
            }

            @Override // com.xmly.businesssdk.player.entity.PlaylistLoader
            public boolean hasPreviousPage() {
                return false;
            }

            @Override // com.xmly.businesssdk.player.entity.PlaylistLoader
            public void init(PlaylistPage playlistPage) {
            }

            @Override // com.xmly.businesssdk.player.entity.PlaylistLoader
            public void loadNextPage() {
            }

            @Override // com.xmly.businesssdk.player.entity.PlaylistLoader
            public void loadPreviousPage() {
            }

            @Override // com.xmly.businesssdk.player.entity.PlaylistLoader
            public void setCallback(PageCallback pageCallback) {
            }
        };
        private static final Map<Integer, Class<? extends PlaylistLoader>> pageLoaderMap = new HashMap();

        public static PlaylistLoader getPageLoader(PlaylistPage playlistPage) {
            Class<? extends PlaylistLoader> cls = pageLoaderMap.get(Integer.valueOf(playlistPage.getPlaylistType()));
            if (cls == null) {
                return DEFAULT_PAGE_LOADER;
            }
            PlaylistLoader playlistLoader = (PlaylistLoader) ClassUtil.createFromClass(cls);
            if (playlistLoader == null) {
                return DEFAULT_PAGE_LOADER;
            }
            playlistLoader.init(playlistPage);
            return playlistLoader;
        }

        public static void registerLoader(int i, Class<? extends PlaylistLoader> cls) {
            pageLoaderMap.put(Integer.valueOf(i), cls);
        }
    }

    public interface PageCallback {
        void onLoadFailure(Throwable th);

        void onLoadSuccess(int i, List<Playable> list);
    }

    int getTotalCount();

    boolean hasNextPage();

    boolean hasPreviousPage();

    void init(PlaylistPage playlistPage);

    void loadNextPage();

    void loadPreviousPage();

    void setCallback(PageCallback pageCallback);
}
