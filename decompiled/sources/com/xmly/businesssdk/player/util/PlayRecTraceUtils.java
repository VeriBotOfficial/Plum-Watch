package com.xmly.businesssdk.player.util;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlayRecTraceUtils.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010$\u001a\u00020%R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\b¨\u0006&"}, d2 = {"Lcom/xmly/businesssdk/player/util/PlayRecTraceUtils;", "", "()V", "albumId", "", "getAlbumId", "()Ljava/lang/String;", "setAlbumId", "(Ljava/lang/String;)V", "lastAlbumId", "getLastAlbumId", "setLastAlbumId", "lastModuleName", "getLastModuleName", "setLastModuleName", "lastRecSrc", "getLastRecSrc", "setLastRecSrc", "lastRecTrack", "getLastRecTrack", "setLastRecTrack", "lastUbtTraceId", "getLastUbtTraceId", "setLastUbtTraceId", "moduleName", "getModuleName", "setModuleName", "recSrc", "getRecSrc", "setRecSrc", "recTrack", "getRecTrack", "setRecTrack", "ubtTraceId", "getUbtTraceId", "setUbtTraceId", "clearAndSetLastValue", "", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class PlayRecTraceUtils {
    public static final PlayRecTraceUtils INSTANCE = new PlayRecTraceUtils();
    private static String recSrc = "";
    private static String recTrack = "";
    private static String ubtTraceId = "";
    private static String moduleName = "";
    private static String albumId = "";
    private static String lastRecSrc = "";
    private static String lastRecTrack = "";
    private static String lastUbtTraceId = "";
    private static String lastModuleName = "";
    private static String lastAlbumId = "";

    private PlayRecTraceUtils() {
    }

    public final void clearAndSetLastValue() {
        lastRecSrc = recSrc;
        lastRecTrack = recTrack;
        lastUbtTraceId = ubtTraceId;
        lastModuleName = moduleName;
        lastAlbumId = albumId;
        recSrc = "";
        recTrack = "";
        ubtTraceId = "";
        moduleName = "";
        albumId = "";
    }

    public final String getAlbumId() {
        return albumId;
    }

    public final String getLastAlbumId() {
        return lastAlbumId;
    }

    public final String getLastModuleName() {
        return lastModuleName;
    }

    public final String getLastRecSrc() {
        return lastRecSrc;
    }

    public final String getLastRecTrack() {
        return lastRecTrack;
    }

    public final String getLastUbtTraceId() {
        return lastUbtTraceId;
    }

    public final String getModuleName() {
        return moduleName;
    }

    public final String getRecSrc() {
        return recSrc;
    }

    public final String getRecTrack() {
        return recTrack;
    }

    public final String getUbtTraceId() {
        return ubtTraceId;
    }

    public final void setAlbumId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        albumId = str;
    }

    public final void setLastAlbumId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        lastAlbumId = str;
    }

    public final void setLastModuleName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        lastModuleName = str;
    }

    public final void setLastRecSrc(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        lastRecSrc = str;
    }

    public final void setLastRecTrack(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        lastRecTrack = str;
    }

    public final void setLastUbtTraceId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        lastUbtTraceId = str;
    }

    public final void setModuleName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        moduleName = str;
    }

    public final void setRecSrc(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        recSrc = str;
    }

    public final void setRecTrack(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        recTrack = str;
    }

    public final void setUbtTraceId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        ubtTraceId = str;
    }
}
