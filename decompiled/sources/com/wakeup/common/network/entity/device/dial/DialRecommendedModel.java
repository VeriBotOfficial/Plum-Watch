package com.wakeup.common.network.entity.device.dial;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DialRecommendedModel.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\bL\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BÁ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u0006\u0012\u0006\u0010\u0017\u001a\u00020\u0006\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0006HÆ\u0003J\t\u0010R\u001a\u00020\u0006HÆ\u0003J\t\u0010S\u001a\u00020\u0006HÆ\u0003J\t\u0010T\u001a\u00020\u0006HÆ\u0003J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\t\u0010V\u001a\u00020\u0006HÆ\u0003J\t\u0010W\u001a\u00020\u0003HÆ\u0003J\t\u0010X\u001a\u00020\u0006HÆ\u0003J\t\u0010Y\u001a\u00020\u0006HÆ\u0003J\t\u0010Z\u001a\u00020\u0006HÆ\u0003J\t\u0010[\u001a\u00020\u0006HÆ\u0003J\t\u0010\\\u001a\u00020\u0003HÆ\u0003J\t\u0010]\u001a\u00020\u0003HÆ\u0003J\t\u0010^\u001a\u00020\u0003HÆ\u0003J\t\u0010_\u001a\u00020\u0006HÆ\u0003J\t\u0010`\u001a\u00020\u0006HÆ\u0003J\t\u0010a\u001a\u00020\u0006HÆ\u0003J\t\u0010b\u001a\u00020\u0006HÆ\u0003J\t\u0010c\u001a\u00020\u0006HÆ\u0003J\t\u0010d\u001a\u00020\u0006HÆ\u0003J\t\u0010e\u001a\u00020\u001bHÆ\u0003Jï\u0001\u0010f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u001bHÆ\u0001J\u0013\u0010g\u001a\u00020h2\b\u0010i\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010j\u001a\u00020\u001bHÖ\u0001J\t\u0010k\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010!R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010%\"\u0004\b)\u0010'R\u001a\u0010\b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010%\"\u0004\b+\u0010'R\u001a\u0010\t\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010%\"\u0004\b-\u0010'R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001f\"\u0004\b/\u0010!R\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010%\"\u0004\b1\u0010'R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001f\"\u0004\b3\u0010!R\u001a\u0010\r\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010%\"\u0004\b5\u0010'R\u001a\u0010\u000e\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010%\"\u0004\b6\u0010'R\u001a\u0010\u000f\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010%\"\u0004\b7\u0010'R\u001a\u0010\u0010\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010%\"\u0004\b8\u0010'R\u001a\u0010\u0011\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u001f\"\u0004\b:\u0010!R\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u001f\"\u0004\b<\u0010!R\u001a\u0010\u0013\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u001f\"\u0004\b>\u0010!R\u001a\u0010\u0014\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010%\"\u0004\b@\u0010'R\u001a\u0010\u0015\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010%\"\u0004\bB\u0010'R\u001a\u0010\u0016\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010%\"\u0004\bD\u0010'R\u001a\u0010\u0017\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010%\"\u0004\bF\u0010'R\u001a\u0010\u0018\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010%\"\u0004\bH\u0010'R\u001a\u0010\u0019\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010%\"\u0004\bJ\u0010'R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010N¨\u0006l"}, d2 = {"Lcom/wakeup/common/network/entity/device/dial/DialRecommendedModel;", "", "described", "", "dialType", "dollar", "", "downNum", "equipmentId", "fileSize", "fileUrl", "id", "imgUrl", "iosPrice", "isDownload", "isHot", "isStep", "majorVersion", "md5Result", "name", "packageType", "payPlatform", "payResult", "price", "sourceType", "type", "bonusPrice", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJJJLjava/lang/String;JLjava/lang/String;JJJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJJJJI)V", "getDescribed", "()Ljava/lang/String;", "setDescribed", "(Ljava/lang/String;)V", "getDialType", "setDialType", "getDollar", "()J", "setDollar", "(J)V", "getDownNum", "setDownNum", "getEquipmentId", "setEquipmentId", "getFileSize", "setFileSize", "getFileUrl", "setFileUrl", "getId", "setId", "getImgUrl", "setImgUrl", "getIosPrice", "setIosPrice", "setDownload", "setHot", "setStep", "getMajorVersion", "setMajorVersion", "getMd5Result", "setMd5Result", "getName", "setName", "getPackageType", "setPackageType", "getPayPlatform", "setPayPlatform", "getPayResult", "setPayResult", "getPrice", "setPrice", "getSourceType", "setSourceType", "getType", "setType", "getBonusPrice", "()I", "setBonusPrice", "(I)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DialRecommendedModel {
    private int bonusPrice;
    private String described;
    private String dialType;
    private long dollar;
    private long downNum;
    private long equipmentId;
    private long fileSize;
    private String fileUrl;
    private long id;
    private String imgUrl;
    private long iosPrice;
    private long isDownload;
    private long isHot;
    private long isStep;
    private String majorVersion;
    private String md5Result;
    private String name;
    private long packageType;
    private long payPlatform;
    private long payResult;
    private long price;
    private long sourceType;
    private long type;

    public static /* synthetic */ DialRecommendedModel copy$default(DialRecommendedModel dialRecommendedModel, String str, String str2, long j, long j2, long j3, long j4, String str3, long j5, String str4, long j6, long j7, long j8, long j9, String str5, String str6, String str7, long j10, long j11, long j12, long j13, long j14, long j15, int i, int i2, Object obj) {
        int i3;
        long j16;
        String str8;
        String str9;
        long j17;
        long j18;
        long j19;
        long j20;
        long j21;
        String str10;
        String str11;
        long j22;
        String str12;
        long j23;
        long j24;
        long j25;
        long j26;
        String str13 = (i2 & 1) != 0 ? dialRecommendedModel.described : str;
        String str14 = (i2 & 2) != 0 ? dialRecommendedModel.dialType : str2;
        long j27 = (i2 & 4) != 0 ? dialRecommendedModel.dollar : j;
        long j28 = (i2 & 8) != 0 ? dialRecommendedModel.downNum : j2;
        long j29 = (i2 & 16) != 0 ? dialRecommendedModel.equipmentId : j3;
        long j30 = (i2 & 32) != 0 ? dialRecommendedModel.fileSize : j4;
        String str15 = (i2 & 64) != 0 ? dialRecommendedModel.fileUrl : str3;
        long j31 = (i2 & 128) != 0 ? dialRecommendedModel.id : j5;
        String str16 = (i2 & 256) != 0 ? dialRecommendedModel.imgUrl : str4;
        String str17 = str13;
        String str18 = str14;
        long j32 = (i2 & 512) != 0 ? dialRecommendedModel.iosPrice : j6;
        long j33 = (i2 & 1024) != 0 ? dialRecommendedModel.isDownload : j7;
        long j34 = (i2 & 2048) != 0 ? dialRecommendedModel.isHot : j8;
        long j35 = (i2 & 4096) != 0 ? dialRecommendedModel.isStep : j9;
        String str19 = (i2 & 8192) != 0 ? dialRecommendedModel.majorVersion : str5;
        String str20 = (i2 & 16384) != 0 ? dialRecommendedModel.md5Result : str6;
        String str21 = (i2 & 32768) != 0 ? dialRecommendedModel.name : str7;
        String str22 = str19;
        long j36 = (i2 & 65536) != 0 ? dialRecommendedModel.packageType : j10;
        long j37 = (i2 & 131072) != 0 ? dialRecommendedModel.payPlatform : j11;
        long j38 = (i2 & 262144) != 0 ? dialRecommendedModel.payResult : j12;
        long j39 = (i2 & 524288) != 0 ? dialRecommendedModel.price : j13;
        long j40 = (i2 & 1048576) != 0 ? dialRecommendedModel.sourceType : j14;
        long j41 = (i2 & 2097152) != 0 ? dialRecommendedModel.type : j15;
        if ((i2 & 4194304) != 0) {
            j16 = j41;
            i3 = dialRecommendedModel.bonusPrice;
            str9 = str21;
            j17 = j36;
            j18 = j37;
            j19 = j38;
            j20 = j39;
            j21 = j40;
            str10 = str20;
            str11 = str15;
            j22 = j31;
            str12 = str16;
            j23 = j32;
            j24 = j33;
            j25 = j34;
            j26 = j35;
            str8 = str22;
        } else {
            i3 = i;
            j16 = j41;
            str8 = str22;
            str9 = str21;
            j17 = j36;
            j18 = j37;
            j19 = j38;
            j20 = j39;
            j21 = j40;
            str10 = str20;
            str11 = str15;
            j22 = j31;
            str12 = str16;
            j23 = j32;
            j24 = j33;
            j25 = j34;
            j26 = j35;
        }
        return dialRecommendedModel.copy(str17, str18, j27, j28, j29, j30, str11, j22, str12, j23, j24, j25, j26, str8, str10, str9, j17, j18, j19, j20, j21, j16, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDescribed() {
        return this.described;
    }

    /* renamed from: component10, reason: from getter */
    public final long getIosPrice() {
        return this.iosPrice;
    }

    /* renamed from: component11, reason: from getter */
    public final long getIsDownload() {
        return this.isDownload;
    }

    /* renamed from: component12, reason: from getter */
    public final long getIsHot() {
        return this.isHot;
    }

    /* renamed from: component13, reason: from getter */
    public final long getIsStep() {
        return this.isStep;
    }

    /* renamed from: component14, reason: from getter */
    public final String getMajorVersion() {
        return this.majorVersion;
    }

    /* renamed from: component15, reason: from getter */
    public final String getMd5Result() {
        return this.md5Result;
    }

    /* renamed from: component16, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component17, reason: from getter */
    public final long getPackageType() {
        return this.packageType;
    }

    /* renamed from: component18, reason: from getter */
    public final long getPayPlatform() {
        return this.payPlatform;
    }

    /* renamed from: component19, reason: from getter */
    public final long getPayResult() {
        return this.payResult;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDialType() {
        return this.dialType;
    }

    /* renamed from: component20, reason: from getter */
    public final long getPrice() {
        return this.price;
    }

    /* renamed from: component21, reason: from getter */
    public final long getSourceType() {
        return this.sourceType;
    }

    /* renamed from: component22, reason: from getter */
    public final long getType() {
        return this.type;
    }

    /* renamed from: component23, reason: from getter */
    public final int getBonusPrice() {
        return this.bonusPrice;
    }

    /* renamed from: component3, reason: from getter */
    public final long getDollar() {
        return this.dollar;
    }

    /* renamed from: component4, reason: from getter */
    public final long getDownNum() {
        return this.downNum;
    }

    /* renamed from: component5, reason: from getter */
    public final long getEquipmentId() {
        return this.equipmentId;
    }

    /* renamed from: component6, reason: from getter */
    public final long getFileSize() {
        return this.fileSize;
    }

    /* renamed from: component7, reason: from getter */
    public final String getFileUrl() {
        return this.fileUrl;
    }

    /* renamed from: component8, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component9, reason: from getter */
    public final String getImgUrl() {
        return this.imgUrl;
    }

    public final DialRecommendedModel copy(String described, String dialType, long dollar, long downNum, long equipmentId, long fileSize, String fileUrl, long id2, String imgUrl, long iosPrice, long isDownload, long isHot, long isStep, String majorVersion, String md5Result, String name, long packageType, long payPlatform, long payResult, long price, long sourceType, long type, int bonusPrice) {
        Intrinsics.checkNotNullParameter(described, "described");
        Intrinsics.checkNotNullParameter(dialType, "dialType");
        Intrinsics.checkNotNullParameter(fileUrl, "fileUrl");
        Intrinsics.checkNotNullParameter(imgUrl, "imgUrl");
        Intrinsics.checkNotNullParameter(majorVersion, "majorVersion");
        Intrinsics.checkNotNullParameter(md5Result, "md5Result");
        Intrinsics.checkNotNullParameter(name, "name");
        return new DialRecommendedModel(described, dialType, dollar, downNum, equipmentId, fileSize, fileUrl, id2, imgUrl, iosPrice, isDownload, isHot, isStep, majorVersion, md5Result, name, packageType, payPlatform, payResult, price, sourceType, type, bonusPrice);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DialRecommendedModel)) {
            return false;
        }
        DialRecommendedModel dialRecommendedModel = (DialRecommendedModel) other;
        return Intrinsics.areEqual(this.described, dialRecommendedModel.described) && Intrinsics.areEqual(this.dialType, dialRecommendedModel.dialType) && this.dollar == dialRecommendedModel.dollar && this.downNum == dialRecommendedModel.downNum && this.equipmentId == dialRecommendedModel.equipmentId && this.fileSize == dialRecommendedModel.fileSize && Intrinsics.areEqual(this.fileUrl, dialRecommendedModel.fileUrl) && this.id == dialRecommendedModel.id && Intrinsics.areEqual(this.imgUrl, dialRecommendedModel.imgUrl) && this.iosPrice == dialRecommendedModel.iosPrice && this.isDownload == dialRecommendedModel.isDownload && this.isHot == dialRecommendedModel.isHot && this.isStep == dialRecommendedModel.isStep && Intrinsics.areEqual(this.majorVersion, dialRecommendedModel.majorVersion) && Intrinsics.areEqual(this.md5Result, dialRecommendedModel.md5Result) && Intrinsics.areEqual(this.name, dialRecommendedModel.name) && this.packageType == dialRecommendedModel.packageType && this.payPlatform == dialRecommendedModel.payPlatform && this.payResult == dialRecommendedModel.payResult && this.price == dialRecommendedModel.price && this.sourceType == dialRecommendedModel.sourceType && this.type == dialRecommendedModel.type && this.bonusPrice == dialRecommendedModel.bonusPrice;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((this.described.hashCode() * 31) + this.dialType.hashCode()) * 31) + Long.hashCode(this.dollar)) * 31) + Long.hashCode(this.downNum)) * 31) + Long.hashCode(this.equipmentId)) * 31) + Long.hashCode(this.fileSize)) * 31) + this.fileUrl.hashCode()) * 31) + Long.hashCode(this.id)) * 31) + this.imgUrl.hashCode()) * 31) + Long.hashCode(this.iosPrice)) * 31) + Long.hashCode(this.isDownload)) * 31) + Long.hashCode(this.isHot)) * 31) + Long.hashCode(this.isStep)) * 31) + this.majorVersion.hashCode()) * 31) + this.md5Result.hashCode()) * 31) + this.name.hashCode()) * 31) + Long.hashCode(this.packageType)) * 31) + Long.hashCode(this.payPlatform)) * 31) + Long.hashCode(this.payResult)) * 31) + Long.hashCode(this.price)) * 31) + Long.hashCode(this.sourceType)) * 31) + Long.hashCode(this.type)) * 31) + Integer.hashCode(this.bonusPrice);
    }

    public String toString() {
        return "DialRecommendedModel(described=" + this.described + ", dialType=" + this.dialType + ", dollar=" + this.dollar + ", downNum=" + this.downNum + ", equipmentId=" + this.equipmentId + ", fileSize=" + this.fileSize + ", fileUrl=" + this.fileUrl + ", id=" + this.id + ", imgUrl=" + this.imgUrl + ", iosPrice=" + this.iosPrice + ", isDownload=" + this.isDownload + ", isHot=" + this.isHot + ", isStep=" + this.isStep + ", majorVersion=" + this.majorVersion + ", md5Result=" + this.md5Result + ", name=" + this.name + ", packageType=" + this.packageType + ", payPlatform=" + this.payPlatform + ", payResult=" + this.payResult + ", price=" + this.price + ", sourceType=" + this.sourceType + ", type=" + this.type + ", bonusPrice=" + this.bonusPrice + Separators.RPAREN;
    }

    public DialRecommendedModel(String described, String dialType, long j, long j2, long j3, long j4, String fileUrl, long j5, String imgUrl, long j6, long j7, long j8, long j9, String majorVersion, String md5Result, String name, long j10, long j11, long j12, long j13, long j14, long j15, int i) {
        Intrinsics.checkNotNullParameter(described, "described");
        Intrinsics.checkNotNullParameter(dialType, "dialType");
        Intrinsics.checkNotNullParameter(fileUrl, "fileUrl");
        Intrinsics.checkNotNullParameter(imgUrl, "imgUrl");
        Intrinsics.checkNotNullParameter(majorVersion, "majorVersion");
        Intrinsics.checkNotNullParameter(md5Result, "md5Result");
        Intrinsics.checkNotNullParameter(name, "name");
        this.described = described;
        this.dialType = dialType;
        this.dollar = j;
        this.downNum = j2;
        this.equipmentId = j3;
        this.fileSize = j4;
        this.fileUrl = fileUrl;
        this.id = j5;
        this.imgUrl = imgUrl;
        this.iosPrice = j6;
        this.isDownload = j7;
        this.isHot = j8;
        this.isStep = j9;
        this.majorVersion = majorVersion;
        this.md5Result = md5Result;
        this.name = name;
        this.packageType = j10;
        this.payPlatform = j11;
        this.payResult = j12;
        this.price = j13;
        this.sourceType = j14;
        this.type = j15;
        this.bonusPrice = i;
    }

    public /* synthetic */ DialRecommendedModel(String str, String str2, long j, long j2, long j3, long j4, String str3, long j5, String str4, long j6, long j7, long j8, long j9, String str5, String str6, String str7, long j10, long j11, long j12, long j13, long j14, long j15, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, j2, j3, j4, str3, j5, str4, j6, j7, j8, j9, str5, str6, str7, j10, j11, j12, j13, j14, j15, (i2 & 4194304) != 0 ? 0 : i);
    }

    public final String getDescribed() {
        return this.described;
    }

    public final void setDescribed(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.described = str;
    }

    public final String getDialType() {
        return this.dialType;
    }

    public final void setDialType(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dialType = str;
    }

    public final long getDollar() {
        return this.dollar;
    }

    public final void setDollar(long j) {
        this.dollar = j;
    }

    public final long getDownNum() {
        return this.downNum;
    }

    public final void setDownNum(long j) {
        this.downNum = j;
    }

    public final long getEquipmentId() {
        return this.equipmentId;
    }

    public final void setEquipmentId(long j) {
        this.equipmentId = j;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    public final void setFileSize(long j) {
        this.fileSize = j;
    }

    public final String getFileUrl() {
        return this.fileUrl;
    }

    public final void setFileUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fileUrl = str;
    }

    public final long getId() {
        return this.id;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final String getImgUrl() {
        return this.imgUrl;
    }

    public final void setImgUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.imgUrl = str;
    }

    public final long getIosPrice() {
        return this.iosPrice;
    }

    public final void setIosPrice(long j) {
        this.iosPrice = j;
    }

    public final long isDownload() {
        return this.isDownload;
    }

    public final void setDownload(long j) {
        this.isDownload = j;
    }

    public final long isHot() {
        return this.isHot;
    }

    public final void setHot(long j) {
        this.isHot = j;
    }

    public final long isStep() {
        return this.isStep;
    }

    public final void setStep(long j) {
        this.isStep = j;
    }

    public final String getMajorVersion() {
        return this.majorVersion;
    }

    public final void setMajorVersion(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.majorVersion = str;
    }

    public final String getMd5Result() {
        return this.md5Result;
    }

    public final void setMd5Result(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.md5Result = str;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final long getPackageType() {
        return this.packageType;
    }

    public final void setPackageType(long j) {
        this.packageType = j;
    }

    public final long getPayPlatform() {
        return this.payPlatform;
    }

    public final void setPayPlatform(long j) {
        this.payPlatform = j;
    }

    public final long getPayResult() {
        return this.payResult;
    }

    public final void setPayResult(long j) {
        this.payResult = j;
    }

    public final long getPrice() {
        return this.price;
    }

    public final void setPrice(long j) {
        this.price = j;
    }

    public final long getSourceType() {
        return this.sourceType;
    }

    public final void setSourceType(long j) {
        this.sourceType = j;
    }

    public final long getType() {
        return this.type;
    }

    public final void setType(long j) {
        this.type = j;
    }

    public final int getBonusPrice() {
        return this.bonusPrice;
    }

    public final void setBonusPrice(int i) {
        this.bonusPrice = i;
    }
}
