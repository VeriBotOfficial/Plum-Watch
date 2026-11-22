package com.wakeup.common.network.entity.healthGuidelines;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import com.alipay.sdk.m.c0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.xmind.core.internal.dom.DOMConstants;

/* compiled from: HeadLinesBean.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 W2\u00020\u0001:\u0001WB\u0093\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0003¢\u0006\u0004\b\u0014\u0010\u0015B\u0011\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0004\b\u0014\u0010\u0018J\u0018\u0010=\u001a\u00020>2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010?\u001a\u00020\u000eH\u0016J\b\u0010@\u001a\u00020\u000eH\u0016J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010J\u001a\u00020\u000eHÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010N\u001a\u00020\u000eHÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J³\u0001\u0010P\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u0003HÆ\u0001J\u0013\u0010Q\u001a\u00020R2\b\u0010S\u001a\u0004\u0018\u00010THÖ\u0003J\t\u0010U\u001a\u00020\u000eHÖ\u0001J\t\u0010V\u001a\u00020\u0006HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010 \"\u0004\b$\u0010\"R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010 \"\u0004\b&\u0010\"R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010 \"\u0004\b(\u0010\"R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010 \"\u0004\b*\u0010\"R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010 \"\u0004\b,\u0010\"R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010 \"\u0004\b.\u0010\"R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010 \"\u0004\b4\u0010\"R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010 \"\u0004\b6\u0010\"R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010 \"\u0004\b8\u0010\"R\u001a\u0010\u0012\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u00100\"\u0004\b:\u00102R\u001a\u0010\u0013\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u001a\"\u0004\b<\u0010\u001c¨\u0006X"}, d2 = {"Lcom/wakeup/common/network/entity/healthGuidelines/HeadLinesBean;", "Landroid/os/Parcelable;", "id", "", "topicId", "title", "", "subtitle", "content", "description", "icon", "backgroundImg", "audio", "audioTime", "", "homeTitle", "homeSubtitle", DOMConstants.ATTR_AUTHOR, "viewCount", "createTime", "<init>", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IJ)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getId", "()J", "setId", "(J)V", "getTopicId", "setTopicId", "getTitle", "()Ljava/lang/String;", d.p, "(Ljava/lang/String;)V", "getSubtitle", "setSubtitle", "getContent", "setContent", "getDescription", "setDescription", "getIcon", "setIcon", "getBackgroundImg", "setBackgroundImg", "getAudio", "setAudio", "getAudioTime", "()I", "setAudioTime", "(I)V", "getHomeTitle", "setHomeTitle", "getHomeSubtitle", "setHomeSubtitle", "getAuthor", "setAuthor", "getViewCount", "setViewCount", "getCreateTime", "setCreateTime", "writeToParcel", "", "flags", "describeContents", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "equals", "", "other", "", "hashCode", "toString", "CREATOR", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class HeadLinesBean implements Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private String audio;
    private int audioTime;
    private String author;
    private String backgroundImg;
    private String content;
    private long createTime;
    private String description;
    private String homeSubtitle;
    private String homeTitle;
    private String icon;
    private long id;
    private String subtitle;
    private String title;
    private long topicId;
    private int viewCount;

    public static /* synthetic */ HeadLinesBean copy$default(HeadLinesBean headLinesBean, long j, long j2, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, String str8, String str9, String str10, int i2, long j3, int i3, Object obj) {
        long j4;
        String str11;
        long j5 = (i3 & 1) != 0 ? headLinesBean.id : j;
        long j6 = (i3 & 2) != 0 ? headLinesBean.topicId : j2;
        String str12 = (i3 & 4) != 0 ? headLinesBean.title : str;
        String str13 = (i3 & 8) != 0 ? headLinesBean.subtitle : str2;
        String str14 = (i3 & 16) != 0 ? headLinesBean.content : str3;
        String str15 = (i3 & 32) != 0 ? headLinesBean.description : str4;
        String str16 = (i3 & 64) != 0 ? headLinesBean.icon : str5;
        String str17 = (i3 & 128) != 0 ? headLinesBean.backgroundImg : str6;
        String str18 = (i3 & 256) != 0 ? headLinesBean.audio : str7;
        int i4 = (i3 & 512) != 0 ? headLinesBean.audioTime : i;
        String str19 = (i3 & 1024) != 0 ? headLinesBean.homeTitle : str8;
        String str20 = (i3 & 2048) != 0 ? headLinesBean.homeSubtitle : str9;
        long j7 = j5;
        String str21 = (i3 & 4096) != 0 ? headLinesBean.author : str10;
        int i5 = (i3 & 8192) != 0 ? headLinesBean.viewCount : i2;
        if ((i3 & 16384) != 0) {
            str11 = str21;
            j4 = headLinesBean.createTime;
        } else {
            j4 = j3;
            str11 = str21;
        }
        return headLinesBean.copy(j7, j6, str12, str13, str14, str15, str16, str17, str18, i4, str19, str20, str11, i5, j4);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final int getAudioTime() {
        return this.audioTime;
    }

    /* renamed from: component11, reason: from getter */
    public final String getHomeTitle() {
        return this.homeTitle;
    }

    /* renamed from: component12, reason: from getter */
    public final String getHomeSubtitle() {
        return this.homeSubtitle;
    }

    /* renamed from: component13, reason: from getter */
    public final String getAuthor() {
        return this.author;
    }

    /* renamed from: component14, reason: from getter */
    public final int getViewCount() {
        return this.viewCount;
    }

    /* renamed from: component15, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* renamed from: component2, reason: from getter */
    public final long getTopicId() {
        return this.topicId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component5, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component7, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component8, reason: from getter */
    public final String getBackgroundImg() {
        return this.backgroundImg;
    }

    /* renamed from: component9, reason: from getter */
    public final String getAudio() {
        return this.audio;
    }

    public final HeadLinesBean copy(long id2, long topicId, String title, String subtitle, String content, String description, String icon, String backgroundImg, String audio, int audioTime, String homeTitle, String homeSubtitle, String author, int viewCount, long createTime) {
        return new HeadLinesBean(id2, topicId, title, subtitle, content, description, icon, backgroundImg, audio, audioTime, homeTitle, homeSubtitle, author, viewCount, createTime);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeadLinesBean)) {
            return false;
        }
        HeadLinesBean headLinesBean = (HeadLinesBean) other;
        return this.id == headLinesBean.id && this.topicId == headLinesBean.topicId && Intrinsics.areEqual(this.title, headLinesBean.title) && Intrinsics.areEqual(this.subtitle, headLinesBean.subtitle) && Intrinsics.areEqual(this.content, headLinesBean.content) && Intrinsics.areEqual(this.description, headLinesBean.description) && Intrinsics.areEqual(this.icon, headLinesBean.icon) && Intrinsics.areEqual(this.backgroundImg, headLinesBean.backgroundImg) && Intrinsics.areEqual(this.audio, headLinesBean.audio) && this.audioTime == headLinesBean.audioTime && Intrinsics.areEqual(this.homeTitle, headLinesBean.homeTitle) && Intrinsics.areEqual(this.homeSubtitle, headLinesBean.homeSubtitle) && Intrinsics.areEqual(this.author, headLinesBean.author) && this.viewCount == headLinesBean.viewCount && this.createTime == headLinesBean.createTime;
    }

    public int hashCode() {
        int hashCode = ((Long.hashCode(this.id) * 31) + Long.hashCode(this.topicId)) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.content;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.icon;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.backgroundImg;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.audio;
        int hashCode8 = (((hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31) + Integer.hashCode(this.audioTime)) * 31;
        String str8 = this.homeTitle;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.homeSubtitle;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.author;
        return ((((hashCode10 + (str10 != null ? str10.hashCode() : 0)) * 31) + Integer.hashCode(this.viewCount)) * 31) + Long.hashCode(this.createTime);
    }

    public String toString() {
        return "HeadLinesBean(id=" + this.id + ", topicId=" + this.topicId + ", title=" + this.title + ", subtitle=" + this.subtitle + ", content=" + this.content + ", description=" + this.description + ", icon=" + this.icon + ", backgroundImg=" + this.backgroundImg + ", audio=" + this.audio + ", audioTime=" + this.audioTime + ", homeTitle=" + this.homeTitle + ", homeSubtitle=" + this.homeSubtitle + ", author=" + this.author + ", viewCount=" + this.viewCount + ", createTime=" + this.createTime + Separators.RPAREN;
    }

    public HeadLinesBean(long j, long j2, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, String str8, String str9, String str10, int i2, long j3) {
        this.id = j;
        this.topicId = j2;
        this.title = str;
        this.subtitle = str2;
        this.content = str3;
        this.description = str4;
        this.icon = str5;
        this.backgroundImg = str6;
        this.audio = str7;
        this.audioTime = i;
        this.homeTitle = str8;
        this.homeSubtitle = str9;
        this.author = str10;
        this.viewCount = i2;
        this.createTime = j3;
    }

    public final long getId() {
        return this.id;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final long getTopicId() {
        return this.topicId;
    }

    public final void setTopicId(long j) {
        this.topicId = j;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final void setSubtitle(String str) {
        this.subtitle = str;
    }

    public final String getContent() {
        return this.content;
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public final String getDescription() {
        return this.description;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final void setIcon(String str) {
        this.icon = str;
    }

    public final String getBackgroundImg() {
        return this.backgroundImg;
    }

    public final void setBackgroundImg(String str) {
        this.backgroundImg = str;
    }

    public final String getAudio() {
        return this.audio;
    }

    public final void setAudio(String str) {
        this.audio = str;
    }

    public final int getAudioTime() {
        return this.audioTime;
    }

    public final void setAudioTime(int i) {
        this.audioTime = i;
    }

    public final String getHomeTitle() {
        return this.homeTitle;
    }

    public final void setHomeTitle(String str) {
        this.homeTitle = str;
    }

    public final String getHomeSubtitle() {
        return this.homeSubtitle;
    }

    public final void setHomeSubtitle(String str) {
        this.homeSubtitle = str;
    }

    public final String getAuthor() {
        return this.author;
    }

    public final void setAuthor(String str) {
        this.author = str;
    }

    public final int getViewCount() {
        return this.viewCount;
    }

    public final void setViewCount(int i) {
        this.viewCount = i;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final void setCreateTime(long j) {
        this.createTime = j;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HeadLinesBean(Parcel parcel) {
        this(parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readLong());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeLong(this.id);
        parcel.writeLong(this.topicId);
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.content);
        parcel.writeString(this.description);
        parcel.writeString(this.icon);
        parcel.writeString(this.backgroundImg);
        parcel.writeString(this.audio);
        parcel.writeInt(this.audioTime);
        parcel.writeString(this.homeTitle);
        parcel.writeString(this.homeSubtitle);
        parcel.writeString(this.author);
        parcel.writeInt(this.viewCount);
        parcel.writeLong(this.createTime);
    }

    /* compiled from: HeadLinesBean.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/wakeup/common/network/entity/healthGuidelines/HeadLinesBean$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/wakeup/common/network/entity/healthGuidelines/HeadLinesBean;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/wakeup/common/network/entity/healthGuidelines/HeadLinesBean;", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.wakeup.common.network.entity.healthGuidelines.HeadLinesBean$CREATOR, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<HeadLinesBean> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public HeadLinesBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HeadLinesBean(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public HeadLinesBean[] newArray(int size) {
            return new HeadLinesBean[size];
        }
    }
}
