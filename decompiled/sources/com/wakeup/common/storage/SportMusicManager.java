package com.wakeup.common.storage;

/* loaded from: classes2.dex */
public class SportMusicManager {
    private static final String KEY_ALBUM_COVER = "key_sport_album_cover";
    private static final String KEY_ALBUM_ID = "key_sport_album_id";

    public static void saveAlbumId(long albumId) {
        CacheManager.INSTANCE.saveLong(KEY_ALBUM_ID, albumId);
    }

    public static long getAlbumId() {
        return CacheManager.INSTANCE.getLong(KEY_ALBUM_ID);
    }

    public static void saveAlbumCover(String coverPath) {
        CacheManager.INSTANCE.saveString(KEY_ALBUM_COVER, coverPath);
    }

    public static String getAlbumCover() {
        return CacheManager.INSTANCE.getString(KEY_ALBUM_COVER);
    }
}
