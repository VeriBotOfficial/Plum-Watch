package com.xmly.businesssdk.network.bean.search;

import com.google.gson.annotations.SerializedName;
import com.xmly.businesssdk.c;
import com.xmly.businesssdk.config.b;
import com.xmly.businesssdk.db.entity.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextSearchAlbumInfo.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bu\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0002\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\tHÆ\u0003J\t\u0010)\u001a\u00020\tHÆ\u0003Jy\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\tHÖ\u0001J\t\u0010/\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0016\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0016\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00060"}, d2 = {"Lcom/xmly/businesssdk/network/bean/search/TextSearchAlbumInfo;", "", "albumId", "", "albumTitle", "", "albumImg", "playCount", "trackCount", "", "albumPayType", "trackId", "currPage", "totalCount", "tracks", "", "Lcom/xmly/businesssdk/network/bean/search/TextSearchTrack;", "(JLjava/lang/String;Ljava/lang/String;JIIJIILjava/util/List;)V", "getAlbumId", "()J", "getAlbumImg", "()Ljava/lang/String;", "getAlbumPayType", "()I", "getAlbumTitle", "getCurrPage", "getPlayCount", "getTotalCount", "getTrackCount", "getTrackId", "getTracks", "()Ljava/util/List;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TextSearchAlbumInfo {

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
    private final List<TextSearchTrack> tracks;

    public TextSearchAlbumInfo() {
        this(0L, null, null, 0L, 0, 0, 0L, 0, 0, null, 1023, null);
    }

    public TextSearchAlbumInfo(long j, String str, String str2, long j2, int i, int i2, long j3, int i3, int i4, List<TextSearchTrack> list) {
        this.albumId = j;
        this.albumTitle = str;
        this.albumImg = str2;
        this.playCount = j2;
        this.trackCount = i;
        this.albumPayType = i2;
        this.trackId = j3;
        this.currPage = i3;
        this.totalCount = i4;
        this.tracks = list;
    }

    /* renamed from: component1, reason: from getter */
    public final long getAlbumId() {
        return this.albumId;
    }

    public final List<TextSearchTrack> component10() {
        return this.tracks;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAlbumTitle() {
        return this.albumTitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAlbumImg() {
        return this.albumImg;
    }

    /* renamed from: component4, reason: from getter */
    public final long getPlayCount() {
        return this.playCount;
    }

    /* renamed from: component5, reason: from getter */
    public final int getTrackCount() {
        return this.trackCount;
    }

    /* renamed from: component6, reason: from getter */
    public final int getAlbumPayType() {
        return this.albumPayType;
    }

    /* renamed from: component7, reason: from getter */
    public final long getTrackId() {
        return this.trackId;
    }

    /* renamed from: component8, reason: from getter */
    public final int getCurrPage() {
        return this.currPage;
    }

    /* renamed from: component9, reason: from getter */
    public final int getTotalCount() {
        return this.totalCount;
    }

    public final TextSearchAlbumInfo copy(long albumId, String albumTitle, String albumImg, long playCount, int trackCount, int albumPayType, long trackId, int currPage, int totalCount, List<TextSearchTrack> tracks) {
        return new TextSearchAlbumInfo(albumId, albumTitle, albumImg, playCount, trackCount, albumPayType, trackId, currPage, totalCount, tracks);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextSearchAlbumInfo)) {
            return false;
        }
        TextSearchAlbumInfo textSearchAlbumInfo = (TextSearchAlbumInfo) other;
        return this.albumId == textSearchAlbumInfo.albumId && Intrinsics.areEqual(this.albumTitle, textSearchAlbumInfo.albumTitle) && Intrinsics.areEqual(this.albumImg, textSearchAlbumInfo.albumImg) && this.playCount == textSearchAlbumInfo.playCount && this.trackCount == textSearchAlbumInfo.trackCount && this.albumPayType == textSearchAlbumInfo.albumPayType && this.trackId == textSearchAlbumInfo.trackId && this.currPage == textSearchAlbumInfo.currPage && this.totalCount == textSearchAlbumInfo.totalCount && Intrinsics.areEqual(this.tracks, textSearchAlbumInfo.tracks);
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

    public final List<TextSearchTrack> getTracks() {
        return this.tracks;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.albumId) * 31;
        String str = this.albumTitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.albumImg;
        int a2 = b.a(this.totalCount, b.a(this.currPage, a.a(this.trackId, b.a(this.albumPayType, b.a(this.trackCount, a.a(this.playCount, (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31), 31), 31), 31), 31);
        List<TextSearchTrack> list = this.tracks;
        return a2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return c.a("TextSearchAlbumInfo(albumId=").append(this.albumId).append(", albumTitle=").append(this.albumTitle).append(", albumImg=").append(this.albumImg).append(", playCount=").append(this.playCount).append(", trackCount=").append(this.trackCount).append(", albumPayType=").append(this.albumPayType).append(", trackId=").append(this.trackId).append(", currPage=").append(this.currPage).append(", totalCount=").append(this.totalCount).append(", tracks=").append(this.tracks).append(')').toString();
    }

    public /* synthetic */ TextSearchAlbumInfo(long j, String str, String str2, long j2, int i, int i2, long j3, int i3, int i4, List list, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0L : j, (i5 & 2) != 0 ? null : str, (i5 & 4) != 0 ? null : str2, (i5 & 8) != 0 ? 0L : j2, (i5 & 16) != 0 ? 0 : i, (i5 & 32) != 0 ? 0 : i2, (i5 & 64) == 0 ? j3 : 0L, (i5 & 128) != 0 ? 0 : i3, (i5 & 256) == 0 ? i4 : 0, (i5 & 512) != 0 ? null : list);
    }
}
