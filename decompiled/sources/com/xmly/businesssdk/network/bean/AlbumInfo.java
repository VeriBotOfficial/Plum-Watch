package com.xmly.businesssdk.network.bean;

import com.google.gson.annotations.SerializedName;
import com.tencent.open.SocialConstants;
import com.xmly.businesssdk.config.b;
import com.xmly.businesssdk.db.entity.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AlbumInfo.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b/\b\u0086\b\u0018\u00002\u00020\u0001B¯\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0002\u0010\u0017J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\bHÆ\u0003J\t\u0010/\u001a\u00020\u0013HÆ\u0003J\t\u00100\u001a\u00020\u0013HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u00104\u001a\u00020\bHÆ\u0003J\t\u00105\u001a\u00020\bHÆ\u0003J\t\u00106\u001a\u00020\bHÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0006HÆ\u0003J³\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÆ\u0001J\u0013\u0010;\u001a\u00020\u00132\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020\bHÖ\u0001J\u0006\u0010>\u001a\u00020\u0013J\u0006\u0010?\u001a\u00020\u0013J\u0006\u0010@\u001a\u00020\u0013J\u0006\u0010A\u001a\u00020\u0013J\u0006\u0010B\u001a\u00020\u0013J\u0006\u0010C\u001a\u00020\u0013J\t\u0010D\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0016\u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010!R\u0016\u0010\u0011\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u001dR\u0016\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010!R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0019R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001fR\u0016\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001d¨\u0006E"}, d2 = {"Lcom/xmly/businesssdk/network/bean/AlbumInfo;", "", "albumId", "", "mainAlbumId", "title", "", "payType", "", "composedPriceType", "trackCount", "playCount", "subscribeCount", "qualityScore", SocialConstants.PARAM_IMG_URL, "intro", "newTrackId", "isFinished", "isSubscribe", "", "isAuthorized", "announcer", "Lcom/xmly/businesssdk/network/bean/AnnouncerInfo;", "(JJLjava/lang/String;IIIJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JIZZLcom/xmly/businesssdk/network/bean/AnnouncerInfo;)V", "getAlbumId", "()J", "getAnnouncer", "()Lcom/xmly/businesssdk/network/bean/AnnouncerInfo;", "getComposedPriceType", "()I", "getImg", "()Ljava/lang/String;", "getIntro", "()Z", "getMainAlbumId", "getNewTrackId", "getPayType", "getPlayCount", "getQualityScore", "getSubscribeCount", "getTitle", "getTrackCount", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "isCompleted", "isFree", "isLimitFree", "isSerializing", "isSingle", "isVip", "toString", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AlbumInfo {

    @SerializedName("album_id")
    private final long albumId;

    @SerializedName("announcer")
    private final AnnouncerInfo announcer;

    @SerializedName("composed_price_type")
    private final int composedPriceType;

    @SerializedName(SocialConstants.PARAM_IMG_URL)
    private final String img;

    @SerializedName("intro")
    private final String intro;

    @SerializedName("is_authorized")
    private final boolean isAuthorized;

    @SerializedName("is_finished")
    private final int isFinished;

    @SerializedName("is_subscribe")
    private final boolean isSubscribe;

    @SerializedName("main_album_id")
    private final long mainAlbumId;

    @SerializedName("new_track_id")
    private final long newTrackId;

    @SerializedName("pay_type")
    private final int payType;

    @SerializedName("play_count")
    private final long playCount;

    @SerializedName("quality_score")
    private final String qualityScore;

    @SerializedName("subscribe_count")
    private final long subscribeCount;

    @SerializedName("title")
    private final String title;

    @SerializedName("track_count")
    private final int trackCount;

    public AlbumInfo() {
        this(0L, 0L, null, 0, 0, 0, 0L, 0L, null, null, null, 0L, 0, false, false, null, 65535, null);
    }

    public AlbumInfo(long j, long j2, String str, int i, int i2, int i3, long j3, long j4, String str2, String str3, String str4, long j5, int i4, boolean z, boolean z2, AnnouncerInfo announcerInfo) {
        this.albumId = j;
        this.mainAlbumId = j2;
        this.title = str;
        this.payType = i;
        this.composedPriceType = i2;
        this.trackCount = i3;
        this.playCount = j3;
        this.subscribeCount = j4;
        this.qualityScore = str2;
        this.img = str3;
        this.intro = str4;
        this.newTrackId = j5;
        this.isFinished = i4;
        this.isSubscribe = z;
        this.isAuthorized = z2;
        this.announcer = announcerInfo;
    }

    public static /* synthetic */ AlbumInfo copy$default(AlbumInfo albumInfo, long j, long j2, String str, int i, int i2, int i3, long j3, long j4, String str2, String str3, String str4, long j5, int i4, boolean z, boolean z2, AnnouncerInfo announcerInfo, int i5, Object obj) {
        long j6 = (i5 & 1) != 0 ? albumInfo.albumId : j;
        long j7 = (i5 & 2) != 0 ? albumInfo.mainAlbumId : j2;
        String str5 = (i5 & 4) != 0 ? albumInfo.title : str;
        int i6 = (i5 & 8) != 0 ? albumInfo.payType : i;
        int i7 = (i5 & 16) != 0 ? albumInfo.composedPriceType : i2;
        int i8 = (i5 & 32) != 0 ? albumInfo.trackCount : i3;
        long j8 = (i5 & 64) != 0 ? albumInfo.playCount : j3;
        long j9 = (i5 & 128) != 0 ? albumInfo.subscribeCount : j4;
        String str6 = (i5 & 256) != 0 ? albumInfo.qualityScore : str2;
        String str7 = (i5 & 512) != 0 ? albumInfo.img : str3;
        long j10 = j6;
        String str8 = (i5 & 1024) != 0 ? albumInfo.intro : str4;
        long j11 = (i5 & 2048) != 0 ? albumInfo.newTrackId : j5;
        int i9 = (i5 & 4096) != 0 ? albumInfo.isFinished : i4;
        return albumInfo.copy(j10, j7, str5, i6, i7, i8, j8, j9, str6, str7, str8, j11, i9, (i5 & 8192) != 0 ? albumInfo.isSubscribe : z, (i5 & 16384) != 0 ? albumInfo.isAuthorized : z2, (i5 & 32768) != 0 ? albumInfo.announcer : announcerInfo);
    }

    /* renamed from: component1, reason: from getter */
    public final long getAlbumId() {
        return this.albumId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getImg() {
        return this.img;
    }

    /* renamed from: component11, reason: from getter */
    public final String getIntro() {
        return this.intro;
    }

    /* renamed from: component12, reason: from getter */
    public final long getNewTrackId() {
        return this.newTrackId;
    }

    /* renamed from: component13, reason: from getter */
    public final int getIsFinished() {
        return this.isFinished;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getIsSubscribe() {
        return this.isSubscribe;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getIsAuthorized() {
        return this.isAuthorized;
    }

    /* renamed from: component16, reason: from getter */
    public final AnnouncerInfo getAnnouncer() {
        return this.announcer;
    }

    /* renamed from: component2, reason: from getter */
    public final long getMainAlbumId() {
        return this.mainAlbumId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final int getPayType() {
        return this.payType;
    }

    /* renamed from: component5, reason: from getter */
    public final int getComposedPriceType() {
        return this.composedPriceType;
    }

    /* renamed from: component6, reason: from getter */
    public final int getTrackCount() {
        return this.trackCount;
    }

    /* renamed from: component7, reason: from getter */
    public final long getPlayCount() {
        return this.playCount;
    }

    /* renamed from: component8, reason: from getter */
    public final long getSubscribeCount() {
        return this.subscribeCount;
    }

    /* renamed from: component9, reason: from getter */
    public final String getQualityScore() {
        return this.qualityScore;
    }

    public final AlbumInfo copy(long albumId, long mainAlbumId, String title, int payType, int composedPriceType, int trackCount, long playCount, long subscribeCount, String qualityScore, String img, String intro, long newTrackId, int isFinished, boolean isSubscribe, boolean isAuthorized, AnnouncerInfo announcer) {
        return new AlbumInfo(albumId, mainAlbumId, title, payType, composedPriceType, trackCount, playCount, subscribeCount, qualityScore, img, intro, newTrackId, isFinished, isSubscribe, isAuthorized, announcer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlbumInfo)) {
            return false;
        }
        AlbumInfo albumInfo = (AlbumInfo) other;
        return this.albumId == albumInfo.albumId && this.mainAlbumId == albumInfo.mainAlbumId && Intrinsics.areEqual(this.title, albumInfo.title) && this.payType == albumInfo.payType && this.composedPriceType == albumInfo.composedPriceType && this.trackCount == albumInfo.trackCount && this.playCount == albumInfo.playCount && this.subscribeCount == albumInfo.subscribeCount && Intrinsics.areEqual(this.qualityScore, albumInfo.qualityScore) && Intrinsics.areEqual(this.img, albumInfo.img) && Intrinsics.areEqual(this.intro, albumInfo.intro) && this.newTrackId == albumInfo.newTrackId && this.isFinished == albumInfo.isFinished && this.isSubscribe == albumInfo.isSubscribe && this.isAuthorized == albumInfo.isAuthorized && Intrinsics.areEqual(this.announcer, albumInfo.announcer);
    }

    public final long getAlbumId() {
        return this.albumId;
    }

    public final AnnouncerInfo getAnnouncer() {
        return this.announcer;
    }

    public final int getComposedPriceType() {
        return this.composedPriceType;
    }

    public final String getImg() {
        return this.img;
    }

    public final String getIntro() {
        return this.intro;
    }

    public final long getMainAlbumId() {
        return this.mainAlbumId;
    }

    public final long getNewTrackId() {
        return this.newTrackId;
    }

    public final int getPayType() {
        return this.payType;
    }

    public final long getPlayCount() {
        return this.playCount;
    }

    public final String getQualityScore() {
        return this.qualityScore;
    }

    public final long getSubscribeCount() {
        return this.subscribeCount;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getTrackCount() {
        return this.trackCount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int a2 = a.a(this.mainAlbumId, Long.hashCode(this.albumId) * 31, 31);
        String str = this.title;
        int a3 = a.a(this.subscribeCount, a.a(this.playCount, b.a(this.trackCount, b.a(this.composedPriceType, b.a(this.payType, (a2 + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31), 31), 31);
        String str2 = this.qualityScore;
        int hashCode = (a3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.img;
        int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.intro;
        int a4 = b.a(this.isFinished, a.a(this.newTrackId, (hashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31), 31);
        boolean z = this.isSubscribe;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (a4 + i) * 31;
        boolean z2 = this.isAuthorized;
        int i3 = (i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31;
        AnnouncerInfo announcerInfo = this.announcer;
        return i3 + (announcerInfo != null ? announcerInfo.hashCode() : 0);
    }

    public final boolean isAuthorized() {
        return this.isAuthorized;
    }

    public final boolean isCompleted() {
        return this.isFinished == 2;
    }

    public final int isFinished() {
        return this.isFinished;
    }

    public final boolean isFree() {
        return this.payType == 0;
    }

    public final boolean isLimitFree() {
        return this.payType == 3;
    }

    public final boolean isSerializing() {
        return this.isFinished == 1;
    }

    public final boolean isSingle() {
        int i = this.payType;
        return i == 2 || i == 4;
    }

    public final boolean isSubscribe() {
        return this.isSubscribe;
    }

    public final boolean isVip() {
        int i = this.payType;
        return i == 1 || i == 4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AlbumInfo(albumId=");
        sb.append(this.albumId).append(", mainAlbumId=").append(this.mainAlbumId).append(", title=").append(this.title).append(", payType=").append(this.payType).append(", composedPriceType=").append(this.composedPriceType).append(", trackCount=").append(this.trackCount).append(", playCount=").append(this.playCount).append(", subscribeCount=").append(this.subscribeCount).append(", qualityScore=").append(this.qualityScore).append(", img=").append(this.img).append(", intro=").append(this.intro).append(", newTrackId=");
        sb.append(this.newTrackId).append(", isFinished=").append(this.isFinished).append(", isSubscribe=").append(this.isSubscribe).append(", isAuthorized=").append(this.isAuthorized).append(", announcer=").append(this.announcer).append(')');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ AlbumInfo(long r21, long r23, java.lang.String r25, int r26, int r27, int r28, long r29, long r31, java.lang.String r33, java.lang.String r34, java.lang.String r35, long r36, int r38, boolean r39, boolean r40, com.xmly.businesssdk.network.bean.AnnouncerInfo r41, int r42, kotlin.jvm.internal.DefaultConstructorMarker r43) {
        /*
            Method dump skipped, instructions count: 179
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xmly.businesssdk.network.bean.AlbumInfo.<init>(long, long, java.lang.String, int, int, int, long, long, java.lang.String, java.lang.String, java.lang.String, long, int, boolean, boolean, com.xmly.businesssdk.network.bean.AnnouncerInfo, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
