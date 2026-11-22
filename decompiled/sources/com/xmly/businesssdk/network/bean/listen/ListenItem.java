package com.xmly.businesssdk.network.bean.listen;

import com.anythink.core.common.e.a;
import com.google.gson.annotations.SerializedName;
import com.tencent.open.SocialConstants;
import com.wakeup.common.Constants;
import com.xmly.businesssdk.config.b;
import com.xmly.businesssdk.network.bean.Announcer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ListenData.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0006HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0006HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u00103\u001a\u00020\u0006HÆ\u0003J\t\u00104\u001a\u00020\u0006HÆ\u0003J\u009d\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020\u0006HÖ\u0001J\t\u0010:\u001a\u00020\u000bHÖ\u0001R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0016\u0010\f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001eR\u0016\u0010\r\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001b¨\u0006;"}, d2 = {"Lcom/xmly/businesssdk/network/bean/listen/ListenItem;", "", "id", "", "bizId", "sourceType", "", Constants.SHARE_URL_PARAMS_JUMP_SOURCE_ID, "albumId", "duration", "title", "", "payType", "trackCount", "playCount", "mainSourceId", SocialConstants.PARAM_IMG_URL, "shortIntro", "announcer", "Lcom/xmly/businesssdk/network/bean/Announcer;", "(JJIJJILjava/lang/String;IIJJLjava/lang/String;Ljava/lang/String;Lcom/xmly/businesssdk/network/bean/Announcer;)V", "getAlbumId", "()J", "getAnnouncer", "()Lcom/xmly/businesssdk/network/bean/Announcer;", "getBizId", "getDuration", "()I", "getId", "getImg", "()Ljava/lang/String;", "getMainSourceId", "getPayType", "getPlayCount", "getShortIntro", "getSourceId", "getSourceType", "getTitle", "getTrackCount", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ListenItem {

    @SerializedName("album_id")
    private final long albumId;

    @SerializedName("announcer")
    private final Announcer announcer;

    @SerializedName("biz_id")
    private final long bizId;

    @SerializedName("duration")
    private final int duration;

    @SerializedName("id")
    private final long id;

    @SerializedName(SocialConstants.PARAM_IMG_URL)
    private final String img;

    @SerializedName("main_source_id")
    private final long mainSourceId;

    @SerializedName("pay_type")
    private final int payType;

    @SerializedName("play_count")
    private final long playCount;

    @SerializedName("short_intro")
    private final String shortIntro;

    @SerializedName(a.C0193a.h)
    private final long sourceId;

    @SerializedName("source_type")
    private final int sourceType;

    @SerializedName("title")
    private final String title;

    @SerializedName("track_count")
    private final int trackCount;

    public ListenItem() {
        this(0L, 0L, 0, 0L, 0L, 0, null, 0, 0, 0L, 0L, null, null, null, 16383, null);
    }

    public ListenItem(long j, long j2, int i, long j3, long j4, int i2, String str, int i3, int i4, long j5, long j6, String str2, String str3, Announcer announcer) {
        this.id = j;
        this.bizId = j2;
        this.sourceType = i;
        this.sourceId = j3;
        this.albumId = j4;
        this.duration = i2;
        this.title = str;
        this.payType = i3;
        this.trackCount = i4;
        this.playCount = j5;
        this.mainSourceId = j6;
        this.img = str2;
        this.shortIntro = str3;
        this.announcer = announcer;
    }

    public static /* synthetic */ ListenItem copy$default(ListenItem listenItem, long j, long j2, int i, long j3, long j4, int i2, String str, int i3, int i4, long j5, long j6, String str2, String str3, Announcer announcer, int i5, Object obj) {
        long j7;
        long j8;
        long j9 = (i5 & 1) != 0 ? listenItem.id : j;
        long j10 = (i5 & 2) != 0 ? listenItem.bizId : j2;
        int i6 = (i5 & 4) != 0 ? listenItem.sourceType : i;
        long j11 = (i5 & 8) != 0 ? listenItem.sourceId : j3;
        long j12 = (i5 & 16) != 0 ? listenItem.albumId : j4;
        int i7 = (i5 & 32) != 0 ? listenItem.duration : i2;
        String str4 = (i5 & 64) != 0 ? listenItem.title : str;
        int i8 = (i5 & 128) != 0 ? listenItem.payType : i3;
        int i9 = (i5 & 256) != 0 ? listenItem.trackCount : i4;
        if ((i5 & 512) != 0) {
            j7 = j9;
            j8 = listenItem.playCount;
        } else {
            j7 = j9;
            j8 = j5;
        }
        return listenItem.copy(j7, j10, i6, j11, j12, i7, str4, i8, i9, j8, (i5 & 1024) != 0 ? listenItem.mainSourceId : j6, (i5 & 2048) != 0 ? listenItem.img : str2, (i5 & 4096) != 0 ? listenItem.shortIntro : str3, (i5 & 8192) != 0 ? listenItem.announcer : announcer);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final long getPlayCount() {
        return this.playCount;
    }

    /* renamed from: component11, reason: from getter */
    public final long getMainSourceId() {
        return this.mainSourceId;
    }

    /* renamed from: component12, reason: from getter */
    public final String getImg() {
        return this.img;
    }

    /* renamed from: component13, reason: from getter */
    public final String getShortIntro() {
        return this.shortIntro;
    }

    /* renamed from: component14, reason: from getter */
    public final Announcer getAnnouncer() {
        return this.announcer;
    }

    /* renamed from: component2, reason: from getter */
    public final long getBizId() {
        return this.bizId;
    }

    /* renamed from: component3, reason: from getter */
    public final int getSourceType() {
        return this.sourceType;
    }

    /* renamed from: component4, reason: from getter */
    public final long getSourceId() {
        return this.sourceId;
    }

    /* renamed from: component5, reason: from getter */
    public final long getAlbumId() {
        return this.albumId;
    }

    /* renamed from: component6, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    /* renamed from: component7, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component8, reason: from getter */
    public final int getPayType() {
        return this.payType;
    }

    /* renamed from: component9, reason: from getter */
    public final int getTrackCount() {
        return this.trackCount;
    }

    public final ListenItem copy(long id2, long bizId, int sourceType, long sourceId, long albumId, int duration, String title, int payType, int trackCount, long playCount, long mainSourceId, String img, String shortIntro, Announcer announcer) {
        return new ListenItem(id2, bizId, sourceType, sourceId, albumId, duration, title, payType, trackCount, playCount, mainSourceId, img, shortIntro, announcer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ListenItem)) {
            return false;
        }
        ListenItem listenItem = (ListenItem) other;
        return this.id == listenItem.id && this.bizId == listenItem.bizId && this.sourceType == listenItem.sourceType && this.sourceId == listenItem.sourceId && this.albumId == listenItem.albumId && this.duration == listenItem.duration && Intrinsics.areEqual(this.title, listenItem.title) && this.payType == listenItem.payType && this.trackCount == listenItem.trackCount && this.playCount == listenItem.playCount && this.mainSourceId == listenItem.mainSourceId && Intrinsics.areEqual(this.img, listenItem.img) && Intrinsics.areEqual(this.shortIntro, listenItem.shortIntro) && Intrinsics.areEqual(this.announcer, listenItem.announcer);
    }

    public final long getAlbumId() {
        return this.albumId;
    }

    public final Announcer getAnnouncer() {
        return this.announcer;
    }

    public final long getBizId() {
        return this.bizId;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final long getId() {
        return this.id;
    }

    public final String getImg() {
        return this.img;
    }

    public final long getMainSourceId() {
        return this.mainSourceId;
    }

    public final int getPayType() {
        return this.payType;
    }

    public final long getPlayCount() {
        return this.playCount;
    }

    public final String getShortIntro() {
        return this.shortIntro;
    }

    public final long getSourceId() {
        return this.sourceId;
    }

    public final int getSourceType() {
        return this.sourceType;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getTrackCount() {
        return this.trackCount;
    }

    public int hashCode() {
        int a2 = b.a(this.duration, com.xmly.businesssdk.db.entity.a.a(this.albumId, com.xmly.businesssdk.db.entity.a.a(this.sourceId, b.a(this.sourceType, com.xmly.businesssdk.db.entity.a.a(this.bizId, Long.hashCode(this.id) * 31, 31), 31), 31), 31), 31);
        String str = this.title;
        int a3 = com.xmly.businesssdk.db.entity.a.a(this.mainSourceId, com.xmly.businesssdk.db.entity.a.a(this.playCount, b.a(this.trackCount, b.a(this.payType, (a2 + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31), 31);
        String str2 = this.img;
        int hashCode = (a3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.shortIntro;
        int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        Announcer announcer = this.announcer;
        return hashCode2 + (announcer != null ? announcer.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ListenItem(id=");
        sb.append(this.id).append(", bizId=").append(this.bizId).append(", sourceType=").append(this.sourceType).append(", sourceId=").append(this.sourceId).append(", albumId=").append(this.albumId).append(", duration=").append(this.duration).append(", title=").append(this.title).append(", payType=").append(this.payType).append(", trackCount=").append(this.trackCount).append(", playCount=").append(this.playCount).append(", mainSourceId=").append(this.mainSourceId).append(", img=");
        sb.append(this.img).append(", shortIntro=").append(this.shortIntro).append(", announcer=").append(this.announcer).append(')');
        return sb.toString();
    }

    public /* synthetic */ ListenItem(long j, long j2, int i, long j3, long j4, int i2, String str, int i3, int i4, long j5, long j6, String str2, String str3, Announcer announcer, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0L : j, (i5 & 2) != 0 ? 0L : j2, (i5 & 4) != 0 ? 0 : i, (i5 & 8) != 0 ? 0L : j3, (i5 & 16) != 0 ? 0L : j4, (i5 & 32) != 0 ? 0 : i2, (i5 & 64) != 0 ? null : str, (i5 & 128) != 0 ? 0 : i3, (i5 & 256) == 0 ? i4 : 0, (i5 & 512) != 0 ? 0L : j5, (i5 & 1024) != 0 ? 0L : j6, (i5 & 2048) != 0 ? null : str2, (i5 & 4096) != 0 ? null : str3, (i5 & 8192) != 0 ? null : announcer);
    }
}
