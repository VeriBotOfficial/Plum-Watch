package com.xmly.businesssdk.player.util;

import kotlin.Metadata;

/* compiled from: AlbumPlayerCallback.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&J,\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH&¨\u0006\f"}, d2 = {"Lcom/xmly/businesssdk/player/util/AlbumPlayerErrorCallback;", "", "onPlaylistEmpty", "", "albumId", "", "message", "errorCode", "", "onPlaylistError", "throwable", "", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public interface AlbumPlayerErrorCallback {

    /* compiled from: AlbumPlayerCallback.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void onPlaylistError$default(AlbumPlayerErrorCallback albumPlayerErrorCallback, String str, String str2, int i, Throwable th, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onPlaylistError");
            }
            if ((i2 & 8) != 0) {
                th = null;
            }
            albumPlayerErrorCallback.onPlaylistError(str, str2, i, th);
        }
    }

    void onPlaylistEmpty(String albumId, String message, int errorCode);

    void onPlaylistError(String albumId, String message, int errorCode, Throwable throwable);
}
