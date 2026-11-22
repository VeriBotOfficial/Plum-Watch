package com.wakeup.common.network.entity.user;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MedalItemModel.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b,\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\t\u0010+\u001a\u00020\tHÆ\u0003J\t\u0010,\u001a\u00020\tHÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\tHÆ\u0003J\t\u00100\u001a\u00020\tHÆ\u0003J\t\u00101\u001a\u00020\tHÆ\u0003J\t\u00102\u001a\u00020\tHÆ\u0003J\t\u00103\u001a\u00020\tHÆ\u0003J\u008b\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\tHÆ\u0001J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u000108HÖ\u0003J\t\u00109\u001a\u00020\u0003HÖ\u0001J\t\u0010:\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\r\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0011\u0010\u0010\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0011\u0010\u0011\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u001a\u0010#\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001a\"\u0004\b%\u0010&¨\u0006;"}, d2 = {"Lcom/wakeup/common/network/entity/user/MedalItemModel;", "Ljava/io/Serializable;", "id", "", "isObtain", "medalTypeId", "getTime", "", "medalName", "", "descInfo", "realNum", "virtualNum", "colourBigImg", "img3dAndroid", "colourlessBigImg", "gainContent", "lessGainContent", "<init>", "(IIIJLjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getMedalTypeId", "getGetTime", "()J", "getMedalName", "()Ljava/lang/String;", "getDescInfo", "getRealNum", "getVirtualNum", "getColourBigImg", "getImg3dAndroid", "getColourlessBigImg", "getGainContent", "getLessGainContent", "filePath", "getFilePath", "setFilePath", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "", "other", "", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class MedalItemModel implements Serializable {
    private final String colourBigImg;
    private final String colourlessBigImg;
    private final String descInfo;
    private String filePath;
    private final String gainContent;
    private final long getTime;
    private final int id;
    private final String img3dAndroid;
    private final int isObtain;
    private final String lessGainContent;
    private final String medalName;
    private final int medalTypeId;
    private final int realNum;
    private final int virtualNum;

    public MedalItemModel() {
        this(0, 0, 0, 0L, null, null, 0, 0, null, null, null, null, null, 8191, null);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getImg3dAndroid() {
        return this.img3dAndroid;
    }

    /* renamed from: component11, reason: from getter */
    public final String getColourlessBigImg() {
        return this.colourlessBigImg;
    }

    /* renamed from: component12, reason: from getter */
    public final String getGainContent() {
        return this.gainContent;
    }

    /* renamed from: component13, reason: from getter */
    public final String getLessGainContent() {
        return this.lessGainContent;
    }

    /* renamed from: component2, reason: from getter */
    public final int getIsObtain() {
        return this.isObtain;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMedalTypeId() {
        return this.medalTypeId;
    }

    /* renamed from: component4, reason: from getter */
    public final long getGetTime() {
        return this.getTime;
    }

    /* renamed from: component5, reason: from getter */
    public final String getMedalName() {
        return this.medalName;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDescInfo() {
        return this.descInfo;
    }

    /* renamed from: component7, reason: from getter */
    public final int getRealNum() {
        return this.realNum;
    }

    /* renamed from: component8, reason: from getter */
    public final int getVirtualNum() {
        return this.virtualNum;
    }

    /* renamed from: component9, reason: from getter */
    public final String getColourBigImg() {
        return this.colourBigImg;
    }

    public final MedalItemModel copy(int id2, int isObtain, int medalTypeId, long getTime, String medalName, String descInfo, int realNum, int virtualNum, String colourBigImg, String img3dAndroid, String colourlessBigImg, String gainContent, String lessGainContent) {
        Intrinsics.checkNotNullParameter(medalName, "medalName");
        Intrinsics.checkNotNullParameter(descInfo, "descInfo");
        Intrinsics.checkNotNullParameter(colourBigImg, "colourBigImg");
        Intrinsics.checkNotNullParameter(img3dAndroid, "img3dAndroid");
        Intrinsics.checkNotNullParameter(colourlessBigImg, "colourlessBigImg");
        Intrinsics.checkNotNullParameter(gainContent, "gainContent");
        Intrinsics.checkNotNullParameter(lessGainContent, "lessGainContent");
        return new MedalItemModel(id2, isObtain, medalTypeId, getTime, medalName, descInfo, realNum, virtualNum, colourBigImg, img3dAndroid, colourlessBigImg, gainContent, lessGainContent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MedalItemModel)) {
            return false;
        }
        MedalItemModel medalItemModel = (MedalItemModel) other;
        return this.id == medalItemModel.id && this.isObtain == medalItemModel.isObtain && this.medalTypeId == medalItemModel.medalTypeId && this.getTime == medalItemModel.getTime && Intrinsics.areEqual(this.medalName, medalItemModel.medalName) && Intrinsics.areEqual(this.descInfo, medalItemModel.descInfo) && this.realNum == medalItemModel.realNum && this.virtualNum == medalItemModel.virtualNum && Intrinsics.areEqual(this.colourBigImg, medalItemModel.colourBigImg) && Intrinsics.areEqual(this.img3dAndroid, medalItemModel.img3dAndroid) && Intrinsics.areEqual(this.colourlessBigImg, medalItemModel.colourlessBigImg) && Intrinsics.areEqual(this.gainContent, medalItemModel.gainContent) && Intrinsics.areEqual(this.lessGainContent, medalItemModel.lessGainContent);
    }

    public int hashCode() {
        return (((((((((((((((((((((((Integer.hashCode(this.id) * 31) + Integer.hashCode(this.isObtain)) * 31) + Integer.hashCode(this.medalTypeId)) * 31) + Long.hashCode(this.getTime)) * 31) + this.medalName.hashCode()) * 31) + this.descInfo.hashCode()) * 31) + Integer.hashCode(this.realNum)) * 31) + Integer.hashCode(this.virtualNum)) * 31) + this.colourBigImg.hashCode()) * 31) + this.img3dAndroid.hashCode()) * 31) + this.colourlessBigImg.hashCode()) * 31) + this.gainContent.hashCode()) * 31) + this.lessGainContent.hashCode();
    }

    public String toString() {
        return "MedalItemModel(id=" + this.id + ", isObtain=" + this.isObtain + ", medalTypeId=" + this.medalTypeId + ", getTime=" + this.getTime + ", medalName=" + this.medalName + ", descInfo=" + this.descInfo + ", realNum=" + this.realNum + ", virtualNum=" + this.virtualNum + ", colourBigImg=" + this.colourBigImg + ", img3dAndroid=" + this.img3dAndroid + ", colourlessBigImg=" + this.colourlessBigImg + ", gainContent=" + this.gainContent + ", lessGainContent=" + this.lessGainContent + Separators.RPAREN;
    }

    public MedalItemModel(int i, int i2, int i3, long j, String medalName, String descInfo, int i4, int i5, String colourBigImg, String img3dAndroid, String colourlessBigImg, String gainContent, String lessGainContent) {
        Intrinsics.checkNotNullParameter(medalName, "medalName");
        Intrinsics.checkNotNullParameter(descInfo, "descInfo");
        Intrinsics.checkNotNullParameter(colourBigImg, "colourBigImg");
        Intrinsics.checkNotNullParameter(img3dAndroid, "img3dAndroid");
        Intrinsics.checkNotNullParameter(colourlessBigImg, "colourlessBigImg");
        Intrinsics.checkNotNullParameter(gainContent, "gainContent");
        Intrinsics.checkNotNullParameter(lessGainContent, "lessGainContent");
        this.id = i;
        this.isObtain = i2;
        this.medalTypeId = i3;
        this.getTime = j;
        this.medalName = medalName;
        this.descInfo = descInfo;
        this.realNum = i4;
        this.virtualNum = i5;
        this.colourBigImg = colourBigImg;
        this.img3dAndroid = img3dAndroid;
        this.colourlessBigImg = colourlessBigImg;
        this.gainContent = gainContent;
        this.lessGainContent = lessGainContent;
        this.filePath = "";
    }

    public /* synthetic */ MedalItemModel(int i, int i2, int i3, long j, String str, String str2, int i4, int i5, String str3, String str4, String str5, String str6, String str7, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0 : i2, (i6 & 4) != 0 ? 0 : i3, (i6 & 8) != 0 ? 0L : j, (i6 & 16) != 0 ? "" : str, (i6 & 32) != 0 ? "" : str2, (i6 & 64) != 0 ? 0 : i4, (i6 & 128) == 0 ? i5 : 0, (i6 & 256) != 0 ? "" : str3, (i6 & 512) != 0 ? "" : str4, (i6 & 1024) != 0 ? "" : str5, (i6 & 2048) != 0 ? "" : str6, (i6 & 4096) != 0 ? "" : str7);
    }

    public final int getId() {
        return this.id;
    }

    public final int isObtain() {
        return this.isObtain;
    }

    public final int getMedalTypeId() {
        return this.medalTypeId;
    }

    public final long getGetTime() {
        return this.getTime;
    }

    public final String getMedalName() {
        return this.medalName;
    }

    public final String getDescInfo() {
        return this.descInfo;
    }

    public final int getRealNum() {
        return this.realNum;
    }

    public final int getVirtualNum() {
        return this.virtualNum;
    }

    public final String getColourBigImg() {
        return this.colourBigImg;
    }

    public final String getImg3dAndroid() {
        return this.img3dAndroid;
    }

    public final String getColourlessBigImg() {
        return this.colourlessBigImg;
    }

    public final String getGainContent() {
        return this.gainContent;
    }

    public final String getLessGainContent() {
        return this.lessGainContent;
    }

    public final String getFilePath() {
        return this.filePath;
    }

    public final void setFilePath(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.filePath = str;
    }
}
