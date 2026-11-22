package com.wakeup.common.network.entity.ai;

import android.gov.nist.core.Separators;
import com.anythink.core.d.l;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AIMusicBean.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0087\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010F\u001a\u00020\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010[\u001a\u00020\u0019HÆ\u0003J\u008d\u0002\u0010\\\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u0019HÆ\u0001J\u0013\u0010]\u001a\u00020>2\b\u0010^\u001a\u0004\u0018\u00010_HÖ\u0003J\t\u0010`\u001a\u00020\u0019HÖ\u0001J\t\u0010a\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\u001fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001d\"\u0004\b'\u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001d\"\u0004\b)\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001dR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001dR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001d\"\u0004\b-\u0010\u001fR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001d\"\u0004\b/\u0010\u001fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001dR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001dR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001dR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001dR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001dR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u001dR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u001dR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u001dR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\u001dR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\u001dR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\u001dR\u0014\u0010\u0018\u001a\u00020\u0019X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u001a\u0010=\u001a\u00020>X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001a\u0010C\u001a\u00020>X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010@\"\u0004\bE\u0010B¨\u0006b"}, d2 = {"Lcom/wakeup/common/network/entity/ai/AIMusicBean;", "Lcom/chad/library/adapter/base/entity/MultiItemEntity;", "id", "", "status", "audioTitle", "audioUser", "audioContent", "audioLyric", "audioSort", "audioFormat", "audioUrl", "imageUrl", "imageLargeUrl", "avatarImageUrl", "makeInstrumental", "remark", "createTime", "createBy", l.a.ac, "updateBy", "businessId", "resultId", "videoUrl", "itemType", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getStatus", "setStatus", "getAudioTitle", "setAudioTitle", "getAudioUser", "setAudioUser", "getAudioContent", "setAudioContent", "getAudioLyric", "setAudioLyric", "getAudioSort", "getAudioFormat", "getAudioUrl", "setAudioUrl", "getImageUrl", "setImageUrl", "getImageLargeUrl", "getAvatarImageUrl", "getMakeInstrumental", "getRemark", "getCreateTime", "getCreateBy", "getUpdateTime", "getUpdateBy", "getBusinessId", "getResultId", "getVideoUrl", "getItemType", "()I", "playState", "", "getPlayState", "()Z", "setPlayState", "(Z)V", "type", "getType", "setType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "equals", "other", "", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AIMusicBean implements MultiItemEntity {
    private String audioContent;
    private final String audioFormat;
    private String audioLyric;
    private final String audioSort;
    private String audioTitle;
    private String audioUrl;
    private String audioUser;
    private final String avatarImageUrl;
    private final String businessId;
    private final String createBy;
    private final String createTime;
    private String id;
    private final String imageLargeUrl;
    private String imageUrl;
    private final int itemType;
    private final String makeInstrumental;
    private boolean playState;
    private final String remark;
    private final String resultId;
    private String status;
    private boolean type;
    private final String updateBy;
    private final String updateTime;
    private final String videoUrl;

    public static /* synthetic */ AIMusicBean copy$default(AIMusicBean aIMusicBean, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, int i, int i2, Object obj) {
        int i3;
        String str22;
        String str23 = (i2 & 1) != 0 ? aIMusicBean.id : str;
        String str24 = (i2 & 2) != 0 ? aIMusicBean.status : str2;
        String str25 = (i2 & 4) != 0 ? aIMusicBean.audioTitle : str3;
        String str26 = (i2 & 8) != 0 ? aIMusicBean.audioUser : str4;
        String str27 = (i2 & 16) != 0 ? aIMusicBean.audioContent : str5;
        String str28 = (i2 & 32) != 0 ? aIMusicBean.audioLyric : str6;
        String str29 = (i2 & 64) != 0 ? aIMusicBean.audioSort : str7;
        String str30 = (i2 & 128) != 0 ? aIMusicBean.audioFormat : str8;
        String str31 = (i2 & 256) != 0 ? aIMusicBean.audioUrl : str9;
        String str32 = (i2 & 512) != 0 ? aIMusicBean.imageUrl : str10;
        String str33 = (i2 & 1024) != 0 ? aIMusicBean.imageLargeUrl : str11;
        String str34 = (i2 & 2048) != 0 ? aIMusicBean.avatarImageUrl : str12;
        String str35 = (i2 & 4096) != 0 ? aIMusicBean.makeInstrumental : str13;
        String str36 = (i2 & 8192) != 0 ? aIMusicBean.remark : str14;
        String str37 = str23;
        String str38 = (i2 & 16384) != 0 ? aIMusicBean.createTime : str15;
        String str39 = (i2 & 32768) != 0 ? aIMusicBean.createBy : str16;
        String str40 = (i2 & 65536) != 0 ? aIMusicBean.updateTime : str17;
        String str41 = (i2 & 131072) != 0 ? aIMusicBean.updateBy : str18;
        String str42 = (i2 & 262144) != 0 ? aIMusicBean.businessId : str19;
        String str43 = (i2 & 524288) != 0 ? aIMusicBean.resultId : str20;
        String str44 = (i2 & 1048576) != 0 ? aIMusicBean.videoUrl : str21;
        if ((i2 & 2097152) != 0) {
            str22 = str44;
            i3 = aIMusicBean.itemType;
        } else {
            i3 = i;
            str22 = str44;
        }
        return aIMusicBean.copy(str37, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str38, str39, str40, str41, str42, str43, str22, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component11, reason: from getter */
    public final String getImageLargeUrl() {
        return this.imageLargeUrl;
    }

    /* renamed from: component12, reason: from getter */
    public final String getAvatarImageUrl() {
        return this.avatarImageUrl;
    }

    /* renamed from: component13, reason: from getter */
    public final String getMakeInstrumental() {
        return this.makeInstrumental;
    }

    /* renamed from: component14, reason: from getter */
    public final String getRemark() {
        return this.remark;
    }

    /* renamed from: component15, reason: from getter */
    public final String getCreateTime() {
        return this.createTime;
    }

    /* renamed from: component16, reason: from getter */
    public final String getCreateBy() {
        return this.createBy;
    }

    /* renamed from: component17, reason: from getter */
    public final String getUpdateTime() {
        return this.updateTime;
    }

    /* renamed from: component18, reason: from getter */
    public final String getUpdateBy() {
        return this.updateBy;
    }

    /* renamed from: component19, reason: from getter */
    public final String getBusinessId() {
        return this.businessId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* renamed from: component20, reason: from getter */
    public final String getResultId() {
        return this.resultId;
    }

    /* renamed from: component21, reason: from getter */
    public final String getVideoUrl() {
        return this.videoUrl;
    }

    /* renamed from: component22, reason: from getter */
    public final int getItemType() {
        return this.itemType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAudioTitle() {
        return this.audioTitle;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAudioUser() {
        return this.audioUser;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAudioContent() {
        return this.audioContent;
    }

    /* renamed from: component6, reason: from getter */
    public final String getAudioLyric() {
        return this.audioLyric;
    }

    /* renamed from: component7, reason: from getter */
    public final String getAudioSort() {
        return this.audioSort;
    }

    /* renamed from: component8, reason: from getter */
    public final String getAudioFormat() {
        return this.audioFormat;
    }

    /* renamed from: component9, reason: from getter */
    public final String getAudioUrl() {
        return this.audioUrl;
    }

    public final AIMusicBean copy(String id2, String status, String audioTitle, String audioUser, String audioContent, String audioLyric, String audioSort, String audioFormat, String audioUrl, String imageUrl, String imageLargeUrl, String avatarImageUrl, String makeInstrumental, String remark, String createTime, String createBy, String updateTime, String updateBy, String businessId, String resultId, String videoUrl, int itemType) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return new AIMusicBean(id2, status, audioTitle, audioUser, audioContent, audioLyric, audioSort, audioFormat, audioUrl, imageUrl, imageLargeUrl, avatarImageUrl, makeInstrumental, remark, createTime, createBy, updateTime, updateBy, businessId, resultId, videoUrl, itemType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AIMusicBean)) {
            return false;
        }
        AIMusicBean aIMusicBean = (AIMusicBean) other;
        return Intrinsics.areEqual(this.id, aIMusicBean.id) && Intrinsics.areEqual(this.status, aIMusicBean.status) && Intrinsics.areEqual(this.audioTitle, aIMusicBean.audioTitle) && Intrinsics.areEqual(this.audioUser, aIMusicBean.audioUser) && Intrinsics.areEqual(this.audioContent, aIMusicBean.audioContent) && Intrinsics.areEqual(this.audioLyric, aIMusicBean.audioLyric) && Intrinsics.areEqual(this.audioSort, aIMusicBean.audioSort) && Intrinsics.areEqual(this.audioFormat, aIMusicBean.audioFormat) && Intrinsics.areEqual(this.audioUrl, aIMusicBean.audioUrl) && Intrinsics.areEqual(this.imageUrl, aIMusicBean.imageUrl) && Intrinsics.areEqual(this.imageLargeUrl, aIMusicBean.imageLargeUrl) && Intrinsics.areEqual(this.avatarImageUrl, aIMusicBean.avatarImageUrl) && Intrinsics.areEqual(this.makeInstrumental, aIMusicBean.makeInstrumental) && Intrinsics.areEqual(this.remark, aIMusicBean.remark) && Intrinsics.areEqual(this.createTime, aIMusicBean.createTime) && Intrinsics.areEqual(this.createBy, aIMusicBean.createBy) && Intrinsics.areEqual(this.updateTime, aIMusicBean.updateTime) && Intrinsics.areEqual(this.updateBy, aIMusicBean.updateBy) && Intrinsics.areEqual(this.businessId, aIMusicBean.businessId) && Intrinsics.areEqual(this.resultId, aIMusicBean.resultId) && Intrinsics.areEqual(this.videoUrl, aIMusicBean.videoUrl) && this.itemType == aIMusicBean.itemType;
    }

    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        String str = this.status;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.audioTitle;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.audioUser;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.audioContent;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.audioLyric;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.audioSort;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.audioFormat;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.audioUrl;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.imageUrl;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.imageLargeUrl;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.avatarImageUrl;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.makeInstrumental;
        int hashCode13 = (hashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.remark;
        int hashCode14 = (hashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.createTime;
        int hashCode15 = (hashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.createBy;
        int hashCode16 = (hashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.updateTime;
        int hashCode17 = (hashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.updateBy;
        int hashCode18 = (hashCode17 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.businessId;
        int hashCode19 = (hashCode18 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.resultId;
        int hashCode20 = (hashCode19 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.videoUrl;
        return ((hashCode20 + (str20 != null ? str20.hashCode() : 0)) * 31) + Integer.hashCode(this.itemType);
    }

    public String toString() {
        return "AIMusicBean(id=" + this.id + ", status=" + this.status + ", audioTitle=" + this.audioTitle + ", audioUser=" + this.audioUser + ", audioContent=" + this.audioContent + ", audioLyric=" + this.audioLyric + ", audioSort=" + this.audioSort + ", audioFormat=" + this.audioFormat + ", audioUrl=" + this.audioUrl + ", imageUrl=" + this.imageUrl + ", imageLargeUrl=" + this.imageLargeUrl + ", avatarImageUrl=" + this.avatarImageUrl + ", makeInstrumental=" + this.makeInstrumental + ", remark=" + this.remark + ", createTime=" + this.createTime + ", createBy=" + this.createBy + ", updateTime=" + this.updateTime + ", updateBy=" + this.updateBy + ", businessId=" + this.businessId + ", resultId=" + this.resultId + ", videoUrl=" + this.videoUrl + ", itemType=" + this.itemType + Separators.RPAREN;
    }

    public AIMusicBean(String id2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, int i) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.id = id2;
        this.status = str;
        this.audioTitle = str2;
        this.audioUser = str3;
        this.audioContent = str4;
        this.audioLyric = str5;
        this.audioSort = str6;
        this.audioFormat = str7;
        this.audioUrl = str8;
        this.imageUrl = str9;
        this.imageLargeUrl = str10;
        this.avatarImageUrl = str11;
        this.makeInstrumental = str12;
        this.remark = str13;
        this.createTime = str14;
        this.createBy = str15;
        this.updateTime = str16;
        this.updateBy = str17;
        this.businessId = str18;
        this.resultId = str19;
        this.videoUrl = str20;
        this.itemType = i;
    }

    public /* synthetic */ AIMusicBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? null : str5, (i2 & 32) != 0 ? null : str6, (i2 & 64) != 0 ? null : str7, (i2 & 128) != 0 ? null : str8, (i2 & 256) != 0 ? null : str9, (i2 & 512) != 0 ? null : str10, (i2 & 1024) != 0 ? null : str11, (i2 & 2048) != 0 ? null : str12, (i2 & 4096) != 0 ? null : str13, (i2 & 8192) != 0 ? null : str14, (i2 & 16384) != 0 ? null : str15, (32768 & i2) != 0 ? null : str16, (65536 & i2) != 0 ? null : str17, (131072 & i2) != 0 ? null : str18, (262144 & i2) != 0 ? null : str19, (524288 & i2) != 0 ? null : str20, (i2 & 1048576) != 0 ? null : str21, i);
    }

    public final String getId() {
        return this.id;
    }

    public final void setId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.id = str;
    }

    public final String getStatus() {
        return this.status;
    }

    public final void setStatus(String str) {
        this.status = str;
    }

    public final String getAudioTitle() {
        return this.audioTitle;
    }

    public final void setAudioTitle(String str) {
        this.audioTitle = str;
    }

    public final String getAudioUser() {
        return this.audioUser;
    }

    public final void setAudioUser(String str) {
        this.audioUser = str;
    }

    public final String getAudioContent() {
        return this.audioContent;
    }

    public final void setAudioContent(String str) {
        this.audioContent = str;
    }

    public final String getAudioLyric() {
        return this.audioLyric;
    }

    public final void setAudioLyric(String str) {
        this.audioLyric = str;
    }

    public final String getAudioSort() {
        return this.audioSort;
    }

    public final String getAudioFormat() {
        return this.audioFormat;
    }

    public final String getAudioUrl() {
        return this.audioUrl;
    }

    public final void setAudioUrl(String str) {
        this.audioUrl = str;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public final String getImageLargeUrl() {
        return this.imageLargeUrl;
    }

    public final String getAvatarImageUrl() {
        return this.avatarImageUrl;
    }

    public final String getMakeInstrumental() {
        return this.makeInstrumental;
    }

    public final String getRemark() {
        return this.remark;
    }

    public final String getCreateTime() {
        return this.createTime;
    }

    public final String getCreateBy() {
        return this.createBy;
    }

    public final String getUpdateTime() {
        return this.updateTime;
    }

    public final String getUpdateBy() {
        return this.updateBy;
    }

    public final String getBusinessId() {
        return this.businessId;
    }

    public final String getResultId() {
        return this.resultId;
    }

    public final String getVideoUrl() {
        return this.videoUrl;
    }

    @Override // com.chad.library.adapter.base.entity.MultiItemEntity
    public int getItemType() {
        return this.itemType;
    }

    public final boolean getPlayState() {
        return this.playState;
    }

    public final void setPlayState(boolean z) {
        this.playState = z;
    }

    public final boolean getType() {
        return this.type;
    }

    public final void setType(boolean z) {
        this.type = z;
    }
}
