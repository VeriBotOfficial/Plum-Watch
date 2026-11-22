package com.xmly.businesssdk.network.bean.search;

import com.google.gson.annotations.SerializedName;
import com.xmly.businesssdk.c;
import com.xmly.businesssdk.config.b;
import com.xmly.businesssdk.db.entity.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextSearchTrack.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003J\t\u0010\"\u001a\u00020\u000bHÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003Ji\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000bHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u000bHÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012¨\u0006*"}, d2 = {"Lcom/xmly/businesssdk/network/bean/search/TextSearchTrack;", "", "albumId", "", "albumTitle", "", "trackId", "trackTitle", "trackImg", "trackPlayCount", "trackPayType", "", "duration", "orderNum", "(JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;JIII)V", "getAlbumId", "()J", "getAlbumTitle", "()Ljava/lang/String;", "getDuration", "()I", "getOrderNum", "getTrackId", "getTrackImg", "getTrackPayType", "getTrackPlayCount", "getTrackTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TextSearchTrack {

    @SerializedName("album_id")
    private final long albumId;

    @SerializedName("album_title")
    private final String albumTitle;

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

    public TextSearchTrack() {
        this(0L, null, 0L, null, null, 0L, 0, 0, 0, 511, null);
    }

    public TextSearchTrack(long j, String str, long j2, String str2, String str3, long j3, int i, int i2, int i3) {
        this.albumId = j;
        this.albumTitle = str;
        this.trackId = j2;
        this.trackTitle = str2;
        this.trackImg = str3;
        this.trackPlayCount = j3;
        this.trackPayType = i;
        this.duration = i2;
        this.orderNum = i3;
    }

    public static /* synthetic */ TextSearchTrack copy$default(TextSearchTrack textSearchTrack, long j, String str, long j2, String str2, String str3, long j3, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j = textSearchTrack.albumId;
        }
        return textSearchTrack.copy(j, (i4 & 2) != 0 ? textSearchTrack.albumTitle : str, (i4 & 4) != 0 ? textSearchTrack.trackId : j2, (i4 & 8) != 0 ? textSearchTrack.trackTitle : str2, (i4 & 16) != 0 ? textSearchTrack.trackImg : str3, (i4 & 32) != 0 ? textSearchTrack.trackPlayCount : j3, (i4 & 64) != 0 ? textSearchTrack.trackPayType : i, (i4 & 128) != 0 ? textSearchTrack.duration : i2, (i4 & 256) != 0 ? textSearchTrack.orderNum : i3);
    }

    /* renamed from: component1, reason: from getter */
    public final long getAlbumId() {
        return this.albumId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAlbumTitle() {
        return this.albumTitle;
    }

    /* renamed from: component3, reason: from getter */
    public final long getTrackId() {
        return this.trackId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTrackTitle() {
        return this.trackTitle;
    }

    /* renamed from: component5, reason: from getter */
    public final String getTrackImg() {
        return this.trackImg;
    }

    /* renamed from: component6, reason: from getter */
    public final long getTrackPlayCount() {
        return this.trackPlayCount;
    }

    /* renamed from: component7, reason: from getter */
    public final int getTrackPayType() {
        return this.trackPayType;
    }

    /* renamed from: component8, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    /* renamed from: component9, reason: from getter */
    public final int getOrderNum() {
        return this.orderNum;
    }

    public final TextSearchTrack copy(long albumId, String albumTitle, long trackId, String trackTitle, String trackImg, long trackPlayCount, int trackPayType, int duration, int orderNum) {
        return new TextSearchTrack(albumId, albumTitle, trackId, trackTitle, trackImg, trackPlayCount, trackPayType, duration, orderNum);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextSearchTrack)) {
            return false;
        }
        TextSearchTrack textSearchTrack = (TextSearchTrack) other;
        return this.albumId == textSearchTrack.albumId && Intrinsics.areEqual(this.albumTitle, textSearchTrack.albumTitle) && this.trackId == textSearchTrack.trackId && Intrinsics.areEqual(this.trackTitle, textSearchTrack.trackTitle) && Intrinsics.areEqual(this.trackImg, textSearchTrack.trackImg) && this.trackPlayCount == textSearchTrack.trackPlayCount && this.trackPayType == textSearchTrack.trackPayType && this.duration == textSearchTrack.duration && this.orderNum == textSearchTrack.orderNum;
    }

    public final long getAlbumId() {
        return this.albumId;
    }

    public final String getAlbumTitle() {
        return this.albumTitle;
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

    public int hashCode() {
        int hashCode = Long.hashCode(this.albumId) * 31;
        String str = this.albumTitle;
        int a2 = a.a(this.trackId, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.trackTitle;
        int hashCode2 = (a2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.trackImg;
        return Integer.hashCode(this.orderNum) + b.a(this.duration, b.a(this.trackPayType, a.a(this.trackPlayCount, (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31), 31), 31);
    }

    public String toString() {
        return c.a("TextSearchTrack(albumId=").append(this.albumId).append(", albumTitle=").append(this.albumTitle).append(", trackId=").append(this.trackId).append(", trackTitle=").append(this.trackTitle).append(", trackImg=").append(this.trackImg).append(", trackPlayCount=").append(this.trackPlayCount).append(", trackPayType=").append(this.trackPayType).append(", duration=").append(this.duration).append(", orderNum=").append(this.orderNum).append(')').toString();
    }

    public /* synthetic */ TextSearchTrack(long j, String str, long j2, String str2, String str3, long j3, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0L : j, (i4 & 2) != 0 ? null : str, (i4 & 4) != 0 ? 0L : j2, (i4 & 8) != 0 ? null : str2, (i4 & 16) == 0 ? str3 : null, (i4 & 32) == 0 ? j3 : 0L, (i4 & 64) != 0 ? 0 : i, (i4 & 128) != 0 ? 0 : i2, (i4 & 256) != 0 ? 0 : i3);
    }
}
