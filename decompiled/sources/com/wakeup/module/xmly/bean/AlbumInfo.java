package com.wakeup.module.xmly.bean;

import android.gov.nist.core.Separators;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: XimalayaResponse.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003Js\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00032\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0007HÖ\u0001J\t\u00100\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0016\u0010\u000b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0016\u0010\f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00061"}, d2 = {"Lcom/wakeup/module/xmly/bean/AlbumInfo;", "", "albumId", "", "albumImg", "", "albumPayType", "", "albumTitle", "currPage", "playCount", "totalCount", "trackCount", "trackId", "tracks", "", "Lcom/wakeup/module/xmly/bean/Track;", "<init>", "(JLjava/lang/String;ILjava/lang/String;IJIIJLjava/util/List;)V", "getAlbumId", "()J", "getAlbumImg", "()Ljava/lang/String;", "getAlbumPayType", "()I", "getAlbumTitle", "getCurrPage", "getPlayCount", "getTotalCount", "getTrackCount", "getTrackId", "getTracks", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "toString", "module-xmly_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AlbumInfo {

    @SerializedName("album_id")
    private final long albumId;

    @SerializedName("album_img")
    private final String albumImg;

    @SerializedName("album_pay_type")
    private final int albumPayType;

    @SerializedName("album_title")
    private final String albumTitle;

    @SerializedName("curr_page")
    private final int currPage;

    @SerializedName("play_count")
    private final long playCount;

    @SerializedName("total_count")
    private final int totalCount;

    @SerializedName("track_count")
    private final int trackCount;

    @SerializedName("track_id")
    private final long trackId;

    @SerializedName("tracks")
    private final List<Track> tracks;

    /* renamed from: component1, reason: from getter */
    public final long getAlbumId() {
        return this.albumId;
    }

    public final List<Track> component10() {
        return this.tracks;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAlbumImg() {
        return this.albumImg;
    }

    /* renamed from: component3, reason: from getter */
    public final int getAlbumPayType() {
        return this.albumPayType;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAlbumTitle() {
        return this.albumTitle;
    }

    /* renamed from: component5, reason: from getter */
    public final int getCurrPage() {
        return this.currPage;
    }

    /* renamed from: component6, reason: from getter */
    public final long getPlayCount() {
        return this.playCount;
    }

    /* renamed from: component7, reason: from getter */
    public final int getTotalCount() {
        return this.totalCount;
    }

    /* renamed from: component8, reason: from getter */
    public final int getTrackCount() {
        return this.trackCount;
    }

    /* renamed from: component9, reason: from getter */
    public final long getTrackId() {
        return this.trackId;
    }

    public final AlbumInfo copy(long albumId, String albumImg, int albumPayType, String albumTitle, int currPage, long playCount, int totalCount, int trackCount, long trackId, List<Track> tracks) {
        Intrinsics.checkNotNullParameter(albumImg, "albumImg");
        Intrinsics.checkNotNullParameter(albumTitle, "albumTitle");
        Intrinsics.checkNotNullParameter(tracks, "tracks");
        return new AlbumInfo(albumId, albumImg, albumPayType, albumTitle, currPage, playCount, totalCount, trackCount, trackId, tracks);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlbumInfo)) {
            return false;
        }
        AlbumInfo albumInfo = (AlbumInfo) other;
        return this.albumId == albumInfo.albumId && Intrinsics.areEqual(this.albumImg, albumInfo.albumImg) && this.albumPayType == albumInfo.albumPayType && Intrinsics.areEqual(this.albumTitle, albumInfo.albumTitle) && this.currPage == albumInfo.currPage && this.playCount == albumInfo.playCount && this.totalCount == albumInfo.totalCount && this.trackCount == albumInfo.trackCount && this.trackId == albumInfo.trackId && Intrinsics.areEqual(this.tracks, albumInfo.tracks);
    }

    public int hashCode() {
        return (((((((((((((((((Long.hashCode(this.albumId) * 31) + this.albumImg.hashCode()) * 31) + Integer.hashCode(this.albumPayType)) * 31) + this.albumTitle.hashCode()) * 31) + Integer.hashCode(this.currPage)) * 31) + Long.hashCode(this.playCount)) * 31) + Integer.hashCode(this.totalCount)) * 31) + Integer.hashCode(this.trackCount)) * 31) + Long.hashCode(this.trackId)) * 31) + this.tracks.hashCode();
    }

    public String toString() {
        return "AlbumInfo(albumId=" + this.albumId + ", albumImg=" + this.albumImg + ", albumPayType=" + this.albumPayType + ", albumTitle=" + this.albumTitle + ", currPage=" + this.currPage + ", playCount=" + this.playCount + ", totalCount=" + this.totalCount + ", trackCount=" + this.trackCount + ", trackId=" + this.trackId + ", tracks=" + this.tracks + Separators.RPAREN;
    }

    public AlbumInfo(long j, String albumImg, int i, String albumTitle, int i2, long j2, int i3, int i4, long j3, List<Track> tracks) {
        Intrinsics.checkNotNullParameter(albumImg, "albumImg");
        Intrinsics.checkNotNullParameter(albumTitle, "albumTitle");
        Intrinsics.checkNotNullParameter(tracks, "tracks");
        this.albumId = j;
        this.albumImg = albumImg;
        this.albumPayType = i;
        this.albumTitle = albumTitle;
        this.currPage = i2;
        this.playCount = j2;
        this.totalCount = i3;
        this.trackCount = i4;
        this.trackId = j3;
        this.tracks = tracks;
    }

    public final long getAlbumId() {
        return this.albumId;
    }

    public final String getAlbumImg() {
        return this.albumImg;
    }

    public final int getAlbumPayType() {
        return this.albumPayType;
    }

    public final String getAlbumTitle() {
        return this.albumTitle;
    }

    public final int getCurrPage() {
        return this.currPage;
    }

    public final long getPlayCount() {
        return this.playCount;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public final int getTrackCount() {
        return this.trackCount;
    }

    public final long getTrackId() {
        return this.trackId;
    }

    public final List<Track> getTracks() {
        return this.tracks;
    }
}
