package com.xmly.businesssdk.db.entity;

import com.alipay.sdk.m.c0.d;
import kotlin.Metadata;

/* compiled from: PlayRecordInfo.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0015\b\u0007\u0018\u0000 92\u00020\u0001:\u00019B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR \u0010\u0012\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR \u0010\u0015\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001e\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001e\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001e\u0010\u001e\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001e\u0010!\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001e\u0010$\u001a\u00020%8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001e\u0010*\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR \u0010-\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\f\"\u0004\b/\u0010\u000eR \u00100\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\f\"\u0004\b2\u0010\u000eR \u00103\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\f\"\u0004\b5\u0010\u000eR\u001e\u00106\u001a\u00020%8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010'\"\u0004\b8\u0010)¨\u0006:"}, d2 = {"Lcom/xmly/businesssdk/db/entity/PlayRecordInfo;", "", "()V", "_id", "", "get_id", "()J", "set_id", "(J)V", "albumId", "", "getAlbumId", "()Ljava/lang/String;", "setAlbumId", "(Ljava/lang/String;)V", "albumTitle", "getAlbumTitle", "setAlbumTitle", "artist", "getArtist", "setArtist", "coverUrl", "getCoverUrl", "setCoverUrl", "duration", "getDuration", "setDuration", "fileSize", "getFileSize", "setFileSize", "playSeconds", "getPlaySeconds", "setPlaySeconds", "playTimeTotal", "getPlayTimeTotal", "setPlayTimeTotal", "playType", "", "getPlayType", "()I", "setPlayType", "(I)V", "startAt", "getStartAt", "setStartAt", "title", "getTitle", d.p, "trackId", "getTrackId", "setTrackId", "trackUrl", "getTrackUrl", "setTrackUrl", "uploadState", "getUploadState", "setUploadState", "Companion", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class PlayRecordInfo {
    public static final int PLAY_TYPE_OFFLINE = 1;
    public static final int PLAY_TYPE_ONLINE = 0;
    public static final int UPLOAD_STATE_FALSE = 0;
    private long _id;
    private String albumId;
    private String albumTitle;
    private String artist;
    private String coverUrl;
    private long duration;
    private long fileSize;
    private long playSeconds;
    private long playTimeTotal;
    private int playType;
    private long startAt;
    private String title;
    private String trackId;
    private String trackUrl;
    private int uploadState;

    public final String getAlbumId() {
        return this.albumId;
    }

    public final String getAlbumTitle() {
        return this.albumTitle;
    }

    public final String getArtist() {
        return this.artist;
    }

    public final String getCoverUrl() {
        return this.coverUrl;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    public final long getPlaySeconds() {
        return this.playSeconds;
    }

    public final long getPlayTimeTotal() {
        return this.playTimeTotal;
    }

    public final int getPlayType() {
        return this.playType;
    }

    public final long getStartAt() {
        return this.startAt;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTrackId() {
        return this.trackId;
    }

    public final String getTrackUrl() {
        return this.trackUrl;
    }

    public final int getUploadState() {
        return this.uploadState;
    }

    public final long get_id() {
        return this._id;
    }

    public final void setAlbumId(String str) {
        this.albumId = str;
    }

    public final void setAlbumTitle(String str) {
        this.albumTitle = str;
    }

    public final void setArtist(String str) {
        this.artist = str;
    }

    public final void setCoverUrl(String str) {
        this.coverUrl = str;
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void setFileSize(long j) {
        this.fileSize = j;
    }

    public final void setPlaySeconds(long j) {
        this.playSeconds = j;
    }

    public final void setPlayTimeTotal(long j) {
        this.playTimeTotal = j;
    }

    public final void setPlayType(int i) {
        this.playType = i;
    }

    public final void setStartAt(long j) {
        this.startAt = j;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setTrackId(String str) {
        this.trackId = str;
    }

    public final void setTrackUrl(String str) {
        this.trackUrl = str;
    }

    public final void setUploadState(int i) {
        this.uploadState = i;
    }

    public final void set_id(long j) {
        this._id = j;
    }
}
