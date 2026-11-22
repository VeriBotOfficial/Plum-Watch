package io.agora.mediaplayer;

/* loaded from: classes6.dex */
public interface IMediaPlayerCacheManager {
    int enableAutoRemoveCache(boolean enable);

    String getCacheDir();

    int getCacheFileCount();

    int getMaxCacheFileCount();

    long getMaxCacheFileSize();

    int removeAllCaches();

    int removeCacheByUri(String uri);

    int removeOldCache();

    int setCacheDir(String path);

    int setMaxCacheFileCount(int count);

    int setMaxCacheFileSize(long cacheSize);
}
