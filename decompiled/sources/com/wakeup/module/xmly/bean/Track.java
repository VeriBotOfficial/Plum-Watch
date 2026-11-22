package com.wakeup.module.xmly.bean;

import android.gov.nist.core.Separators;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: XimalayaResponse.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003JY\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\tHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0005HÖ\u0001J\t\u0010'\u001a\u00020\tHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0016\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016¨\u0006("}, d2 = {"Lcom/wakeup/module/xmly/bean/Track;", "", "albumId", "", "duration", "", "orderNum", "trackId", "trackImg", "", "trackPayType", "trackPlayCount", "trackTitle", "<init>", "(JIIJLjava/lang/String;IJLjava/lang/String;)V", "getAlbumId", "()J", "getDuration", "()I", "getOrderNum", "getTrackId", "getTrackImg", "()Ljava/lang/String;", "getTrackPayType", "getTrackPlayCount", "getTrackTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "module-xmly_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Track {

    @SerializedName("album_id")
    private final long albumId;

    @SerializedName("duration")
    private final int duration;

    @SerializedName("order_num")
    private final int orderNum;

    @SerializedName("track_id")
    private final long trackId;

    @SerializedName("track_img")
    private final String trackImg;

    @SerializedName("track_pay_type")
    private final int trackPayType;

    @SerializedName("track_play_count")
    private final long trackPlayCount;

    @SerializedName("track_title")
    private final String trackTitle;

    public static /* synthetic */ Track copy$default(Track track, long j, int i, int i2, long j2, String str, int i3, long j3, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j = track.albumId;
        }
        long j4 = j;
        if ((i4 & 2) != 0) {
            i = track.duration;
        }
        return track.copy(j4, i, (i4 & 4) != 0 ? track.orderNum : i2, (i4 & 8) != 0 ? track.trackId : j2, (i4 & 16) != 0 ? track.trackImg : str, (i4 & 32) != 0 ? track.trackPayType : i3, (i4 & 64) != 0 ? track.trackPlayCount : j3, (i4 & 128) != 0 ? track.trackTitle : str2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getAlbumId() {
        return this.albumId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    /* renamed from: component3, reason: from getter */
    public final int getOrderNum() {
        return this.orderNum;
    }

    /* renamed from: component4, reason: from getter */
    public final long getTrackId() {
        return this.trackId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getTrackImg() {
        return this.trackImg;
    }

    /* renamed from: component6, reason: from getter */
    public final int getTrackPayType() {
        return this.trackPayType;
    }

    /* renamed from: component7, reason: from getter */
    public final long getTrackPlayCount() {
        return this.trackPlayCount;
    }

    /* renamed from: component8, reason: from getter */
    public final String getTrackTitle() {
        return this.trackTitle;
    }

    public final Track copy(long albumId, int duration, int orderNum, long trackId, String trackImg, int trackPayType, long trackPlayCount, String trackTitle) {
        Intrinsics.checkNotNullParameter(trackImg, "trackImg");
        Intrinsics.checkNotNullParameter(trackTitle, "trackTitle");
        return new Track(albumId, duration, orderNum, trackId, trackImg, trackPayType, trackPlayCount, trackTitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Track)) {
            return false;
        }
        Track track = (Track) other;
        return this.albumId == track.albumId && this.duration == track.duration && this.orderNum == track.orderNum && this.trackId == track.trackId && Intrinsics.areEqual(this.trackImg, track.trackImg) && this.trackPayType == track.trackPayType && this.trackPlayCount == track.trackPlayCount && Intrinsics.areEqual(this.trackTitle, track.trackTitle);
    }

    public int hashCode() {
        return (((((((((((((Long.hashCode(this.albumId) * 31) + Integer.hashCode(this.duration)) * 31) + Integer.hashCode(this.orderNum)) * 31) + Long.hashCode(this.trackId)) * 31) + this.trackImg.hashCode()) * 31) + Integer.hashCode(this.trackPayType)) * 31) + Long.hashCode(this.trackPlayCount)) * 31) + this.trackTitle.hashCode();
    }

    public String toString() {
        return "Track(albumId=" + this.albumId + ", duration=" + this.duration + ", orderNum=" + this.orderNum + ", trackId=" + this.trackId + ", trackImg=" + this.trackImg + ", trackPayType=" + this.trackPayType + ", trackPlayCount=" + this.trackPlayCount + ", trackTitle=" + this.trackTitle + Separators.RPAREN;
    }

    public Track(long j, int i, int i2, long j2, String trackImg, int i3, long j3, String trackTitle) {
        Intrinsics.checkNotNullParameter(trackImg, "trackImg");
        Intrinsics.checkNotNullParameter(trackTitle, "trackTitle");
        this.albumId = j;
        this.duration = i;
        this.orderNum = i2;
        this.trackId = j2;
        this.trackImg = trackImg;
        this.trackPayType = i3;
        this.trackPlayCount = j3;
        this.trackTitle = trackTitle;
    }

    public final long getAlbumId() {
        return this.albumId;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final int getOrderNum() {
        return this.orderNum;
    }

    public final long getTrackId() {
        return this.trackId;
    }

    public final String getTrackImg() {
        return this.trackImg;
    }

    public final int getTrackPayType() {
        return this.trackPayType;
    }

    public final long getTrackPlayCount() {
        return this.trackPlayCount;
    }

    public final String getTrackTitle() {
        return this.trackTitle;
    }
}
