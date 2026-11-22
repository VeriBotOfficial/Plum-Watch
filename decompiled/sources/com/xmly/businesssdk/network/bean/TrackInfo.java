package com.xmly.businesssdk.network.bean;

import com.google.gson.annotations.SerializedName;
import com.tencent.open.SocialConstants;
import com.xmly.businesssdk.config.b;
import com.xmly.businesssdk.db.entity.a;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* compiled from: TrackInfo.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b-\b\u0086\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0013J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\tHÆ\u0003J\t\u0010-\u001a\u00020\tHÆ\u0003J\t\u0010.\u001a\u00020\tHÆ\u0003J\t\u0010/\u001a\u00020\rHÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u0091\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u00102\u001a\u00020\r2\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u00104\u001a\u00020\u0006J\t\u00105\u001a\u00020\tHÖ\u0001J\u0006\u00106\u001a\u00020\rJ\u0006\u00107\u001a\u00020\rJ\u0006\u00108\u001a\u00020\rJ\t\u00109\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0016\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0015¨\u0006:"}, d2 = {"Lcom/xmly/businesssdk/network/bean/TrackInfo;", "", "trackId", "", "mainTrackId", "title", "", "albumId", "payType", "", "duration", "sampleDuration", "isAuthorized", "", "playCount", "playSize32", "playSize64", SocialConstants.PARAM_IMG_URL, "intro", "(JJLjava/lang/String;JIIIZJJJLjava/lang/String;Ljava/lang/String;)V", "getAlbumId", "()J", "getDuration", "()I", "getImg", "()Ljava/lang/String;", "getIntro", "()Z", "getMainTrackId", "getPayType", "getPlayCount", "getPlaySize32", "getPlaySize64", "getSampleDuration", "getTitle", "getTrackId", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "getFormattedDuration", "hashCode", "isFree", "isPaid", "isSample", "toString", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TrackInfo {

    @SerializedName("album_id")
    private final long albumId;

    @SerializedName("duration")
    private final int duration;

    @SerializedName(SocialConstants.PARAM_IMG_URL)
    private final String img;

    @SerializedName("intro")
    private final String intro;

    @SerializedName("is_authorized")
    private final boolean isAuthorized;

    @SerializedName("main_track_id")
    private final long mainTrackId;

    @SerializedName("pay_type")
    private final int payType;

    @SerializedName("play_count")
    private final long playCount;

    @SerializedName("play_size32")
    private final long playSize32;

    @SerializedName("play_size64")
    private final long playSize64;

    @SerializedName("sample_duration")
    private final int sampleDuration;

    @SerializedName("title")
    private final String title;

    @SerializedName("track_id")
    private final long trackId;

    public TrackInfo() {
        this(0L, 0L, null, 0L, 0, 0, 0, false, 0L, 0L, 0L, null, null, 8191, null);
    }

    public TrackInfo(long j, long j2, String str, long j3, int i, int i2, int i3, boolean z, long j4, long j5, long j6, String str2, String str3) {
        this.trackId = j;
        this.mainTrackId = j2;
        this.title = str;
        this.albumId = j3;
        this.payType = i;
        this.duration = i2;
        this.sampleDuration = i3;
        this.isAuthorized = z;
        this.playCount = j4;
        this.playSize32 = j5;
        this.playSize64 = j6;
        this.img = str2;
        this.intro = str3;
    }

    public static /* synthetic */ TrackInfo copy$default(TrackInfo trackInfo, long j, long j2, String str, long j3, int i, int i2, int i3, boolean z, long j4, long j5, long j6, String str2, String str3, int i4, Object obj) {
        long j7;
        long j8;
        long j9 = (i4 & 1) != 0 ? trackInfo.trackId : j;
        long j10 = (i4 & 2) != 0 ? trackInfo.mainTrackId : j2;
        String str4 = (i4 & 4) != 0 ? trackInfo.title : str;
        long j11 = (i4 & 8) != 0 ? trackInfo.albumId : j3;
        int i5 = (i4 & 16) != 0 ? trackInfo.payType : i;
        int i6 = (i4 & 32) != 0 ? trackInfo.duration : i2;
        int i7 = (i4 & 64) != 0 ? trackInfo.sampleDuration : i3;
        boolean z2 = (i4 & 128) != 0 ? trackInfo.isAuthorized : z;
        long j12 = (i4 & 256) != 0 ? trackInfo.playCount : j4;
        if ((i4 & 512) != 0) {
            j7 = j9;
            j8 = trackInfo.playSize32;
        } else {
            j7 = j9;
            j8 = j5;
        }
        return trackInfo.copy(j7, j10, str4, j11, i5, i6, i7, z2, j12, j8, (i4 & 1024) != 0 ? trackInfo.playSize64 : j6, (i4 & 2048) != 0 ? trackInfo.img : str2, (i4 & 4096) != 0 ? trackInfo.intro : str3);
    }

    /* renamed from: component1, reason: from getter */
    public final long getTrackId() {
        return this.trackId;
    }

    /* renamed from: component10, reason: from getter */
    public final long getPlaySize32() {
        return this.playSize32;
    }

    /* renamed from: component11, reason: from getter */
    public final long getPlaySize64() {
        return this.playSize64;
    }

    /* renamed from: component12, reason: from getter */
    public final String getImg() {
        return this.img;
    }

    /* renamed from: component13, reason: from getter */
    public final String getIntro() {
        return this.intro;
    }

    /* renamed from: component2, reason: from getter */
    public final long getMainTrackId() {
        return this.mainTrackId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final long getAlbumId() {
        return this.albumId;
    }

    /* renamed from: component5, reason: from getter */
    public final int getPayType() {
        return this.payType;
    }

    /* renamed from: component6, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    /* renamed from: component7, reason: from getter */
    public final int getSampleDuration() {
        return this.sampleDuration;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsAuthorized() {
        return this.isAuthorized;
    }

    /* renamed from: component9, reason: from getter */
    public final long getPlayCount() {
        return this.playCount;
    }

    public final TrackInfo copy(long trackId, long mainTrackId, String title, long albumId, int payType, int duration, int sampleDuration, boolean isAuthorized, long playCount, long playSize32, long playSize64, String img, String intro) {
        return new TrackInfo(trackId, mainTrackId, title, albumId, payType, duration, sampleDuration, isAuthorized, playCount, playSize32, playSize64, img, intro);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrackInfo)) {
            return false;
        }
        TrackInfo trackInfo = (TrackInfo) other;
        return this.trackId == trackInfo.trackId && this.mainTrackId == trackInfo.mainTrackId && Intrinsics.areEqual(this.title, trackInfo.title) && this.albumId == trackInfo.albumId && this.payType == trackInfo.payType && this.duration == trackInfo.duration && this.sampleDuration == trackInfo.sampleDuration && this.isAuthorized == trackInfo.isAuthorized && this.playCount == trackInfo.playCount && this.playSize32 == trackInfo.playSize32 && this.playSize64 == trackInfo.playSize64 && Intrinsics.areEqual(this.img, trackInfo.img) && Intrinsics.areEqual(this.intro, trackInfo.intro);
    }

    public final long getAlbumId() {
        return this.albumId;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final String getFormattedDuration() {
        int i = this.duration;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i / 60), Integer.valueOf(i % 60)}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        return format;
    }

    public final String getImg() {
        return this.img;
    }

    public final String getIntro() {
        return this.intro;
    }

    public final long getMainTrackId() {
        return this.mainTrackId;
    }

    public final int getPayType() {
        return this.payType;
    }

    public final long getPlayCount() {
        return this.playCount;
    }

    public final long getPlaySize32() {
        return this.playSize32;
    }

    public final long getPlaySize64() {
        return this.playSize64;
    }

    public final int getSampleDuration() {
        return this.sampleDuration;
    }

    public final String getTitle() {
        return this.title;
    }

    public final long getTrackId() {
        return this.trackId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int a2 = a.a(this.mainTrackId, Long.hashCode(this.trackId) * 31, 31);
        String str = this.title;
        int a3 = b.a(this.sampleDuration, b.a(this.duration, b.a(this.payType, a.a(this.albumId, (a2 + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31), 31);
        boolean z = this.isAuthorized;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int a4 = a.a(this.playSize64, a.a(this.playSize32, a.a(this.playCount, (a3 + i) * 31, 31), 31), 31);
        String str2 = this.img;
        int hashCode = (a4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.intro;
        return hashCode + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean isAuthorized() {
        return this.isAuthorized;
    }

    public final boolean isFree() {
        return this.payType == 0;
    }

    public final boolean isPaid() {
        return this.payType == 1;
    }

    public final boolean isSample() {
        return this.payType == 2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TrackInfo(trackId=");
        sb.append(this.trackId).append(", mainTrackId=").append(this.mainTrackId).append(", title=").append(this.title).append(", albumId=").append(this.albumId).append(", payType=").append(this.payType).append(", duration=").append(this.duration).append(", sampleDuration=").append(this.sampleDuration).append(", isAuthorized=").append(this.isAuthorized).append(", playCount=").append(this.playCount).append(", playSize32=").append(this.playSize32).append(", playSize64=").append(this.playSize64).append(", img=");
        sb.append(this.img).append(", intro=").append(this.intro).append(')');
        return sb.toString();
    }

    public /* synthetic */ TrackInfo(long j, long j2, String str, long j3, int i, int i2, int i3, boolean z, long j4, long j5, long j6, String str2, String str3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0L : j, (i4 & 2) != 0 ? 0L : j2, (i4 & 4) != 0 ? null : str, (i4 & 8) != 0 ? 0L : j3, (i4 & 16) != 0 ? 0 : i, (i4 & 32) != 0 ? 0 : i2, (i4 & 64) != 0 ? 0 : i3, (i4 & 128) == 0 ? z : false, (i4 & 256) != 0 ? 0L : j4, (i4 & 512) != 0 ? 0L : j5, (i4 & 1024) != 0 ? 0L : j6, (i4 & 2048) != 0 ? null : str2, (i4 & 4096) != 0 ? null : str3);
    }
}
