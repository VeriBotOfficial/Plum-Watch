package com.wakeup.common.network.entity.device.dial;

import android.gov.nist.core.Separators;
import com.wakeup.feature.user.constant.UserConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DialPromotionBannerModel.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b6\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0086\b\u0018\u0000 c2\u00020\u0001:\u0001cBÑ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0017\u0010\u0018J\u0006\u0010H\u001a\u00020IJ\u0006\u0010J\u001a\u00020IJ\u0006\u0010K\u001a\u00020IJ\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0005HÆ\u0003J\u0010\u0010N\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\"J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010R\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u0010S\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u0010T\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u0010U\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u00103J\u0010\u0010V\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\"J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010X\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010<J\u0010\u0010Y\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010<J\u0010\u0010Z\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010<J\u0010\u0010[\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u00103J\u0010\u0010\\\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u00103JØ\u0001\u0010]\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010^J\u0013\u0010_\u001a\u00020I2\b\u0010`\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010a\u001a\u00020\u0005HÖ\u0001J\t\u0010b\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001a\"\u0004\b'\u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001a\"\u0004\b)\u0010\u001cR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001a\"\u0004\b+\u0010\u001cR\u001e\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b,\u0010\"\"\u0004\b-\u0010$R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b.\u0010\"\"\u0004\b/\u0010$R\u001e\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b0\u0010\"\"\u0004\b1\u0010$R\u001e\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u00106\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b7\u0010\"\"\u0004\b8\u0010$R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u001a\"\u0004\b:\u0010\u001cR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0010\n\u0002\u0010?\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0010\n\u0002\u0010?\u001a\u0004\b@\u0010<\"\u0004\bA\u0010>R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0010\n\u0002\u0010?\u001a\u0004\bB\u0010<\"\u0004\bC\u0010>R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u00106\u001a\u0004\bD\u00103\"\u0004\bE\u00105R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u00106\u001a\u0004\bF\u00103\"\u0004\bG\u00105¨\u0006d"}, d2 = {"Lcom/wakeup/common/network/entity/device/dial/DialPromotionBannerModel;", "", "activityCode", "", "triggerType", "", UserConstants.DIAL_ID, "dialName", "imgUrl", "sourceOrderNo", "viewCount", "requiredViews", "remainingViews", "benefitId", "", "benefitStatus", "lockedOrderNo", "discountAmount", "", "originalPrice", "promotionPrice", "validFrom", "expiresAt", "<init>", "(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Long;)V", "getActivityCode", "()Ljava/lang/String;", "setActivityCode", "(Ljava/lang/String;)V", "getTriggerType", "()I", "setTriggerType", "(I)V", "getDialId", "()Ljava/lang/Integer;", "setDialId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getDialName", "setDialName", "getImgUrl", "setImgUrl", "getSourceOrderNo", "setSourceOrderNo", "getViewCount", "setViewCount", "getRequiredViews", "setRequiredViews", "getRemainingViews", "setRemainingViews", "getBenefitId", "()Ljava/lang/Long;", "setBenefitId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getBenefitStatus", "setBenefitStatus", "getLockedOrderNo", "setLockedOrderNo", "getDiscountAmount", "()Ljava/lang/Double;", "setDiscountAmount", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getOriginalPrice", "setOriginalPrice", "getPromotionPrice", "setPromotionPrice", "getValidFrom", "setValidFrom", "getExpiresAt", "setExpiresAt", "isBrowseProgressOnly", "", "isBenefitAvailable", "isBenefitOrderCreated", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Long;)Lcom/wakeup/common/network/entity/device/dial/DialPromotionBannerModel;", "equals", "other", "hashCode", "toString", "Companion", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DialPromotionBannerModel {
    public static final int BENEFIT_AVAILABLE = 0;
    public static final int BENEFIT_ORDER_CREATED = 1;
    public static final int TRIGGER_BROWSE = 1;
    public static final int TRIGGER_UNPAID = 2;
    private String activityCode;
    private Long benefitId;
    private Integer benefitStatus;
    private Integer dialId;
    private String dialName;
    private Double discountAmount;
    private Long expiresAt;
    private String imgUrl;
    private String lockedOrderNo;
    private Double originalPrice;
    private Double promotionPrice;
    private Integer remainingViews;
    private Integer requiredViews;
    private String sourceOrderNo;
    private int triggerType;
    private Long validFrom;
    private Integer viewCount;

    public DialPromotionBannerModel() {
        this(null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }

    public static /* synthetic */ DialPromotionBannerModel copy$default(DialPromotionBannerModel dialPromotionBannerModel, String str, int i, Integer num, String str2, String str3, String str4, Integer num2, Integer num3, Integer num4, Long l, Integer num5, String str5, Double d, Double d2, Double d3, Long l2, Long l3, int i2, Object obj) {
        Long l4;
        Long l5;
        String str6;
        DialPromotionBannerModel dialPromotionBannerModel2;
        Double d4;
        int i3;
        Integer num6;
        String str7;
        String str8;
        String str9;
        Integer num7;
        Integer num8;
        Integer num9;
        Long l6;
        Integer num10;
        String str10;
        Double d5;
        Double d6;
        String str11 = (i2 & 1) != 0 ? dialPromotionBannerModel.activityCode : str;
        int i4 = (i2 & 2) != 0 ? dialPromotionBannerModel.triggerType : i;
        Integer num11 = (i2 & 4) != 0 ? dialPromotionBannerModel.dialId : num;
        String str12 = (i2 & 8) != 0 ? dialPromotionBannerModel.dialName : str2;
        String str13 = (i2 & 16) != 0 ? dialPromotionBannerModel.imgUrl : str3;
        String str14 = (i2 & 32) != 0 ? dialPromotionBannerModel.sourceOrderNo : str4;
        Integer num12 = (i2 & 64) != 0 ? dialPromotionBannerModel.viewCount : num2;
        Integer num13 = (i2 & 128) != 0 ? dialPromotionBannerModel.requiredViews : num3;
        Integer num14 = (i2 & 256) != 0 ? dialPromotionBannerModel.remainingViews : num4;
        Long l7 = (i2 & 512) != 0 ? dialPromotionBannerModel.benefitId : l;
        Integer num15 = (i2 & 1024) != 0 ? dialPromotionBannerModel.benefitStatus : num5;
        String str15 = (i2 & 2048) != 0 ? dialPromotionBannerModel.lockedOrderNo : str5;
        Double d7 = (i2 & 4096) != 0 ? dialPromotionBannerModel.discountAmount : d;
        Double d8 = (i2 & 8192) != 0 ? dialPromotionBannerModel.originalPrice : d2;
        String str16 = str11;
        Double d9 = (i2 & 16384) != 0 ? dialPromotionBannerModel.promotionPrice : d3;
        Long l8 = (i2 & 32768) != 0 ? dialPromotionBannerModel.validFrom : l2;
        if ((i2 & 65536) != 0) {
            l5 = l8;
            l4 = dialPromotionBannerModel.expiresAt;
            d4 = d9;
            i3 = i4;
            num6 = num11;
            str7 = str12;
            str8 = str13;
            str9 = str14;
            num7 = num12;
            num8 = num13;
            num9 = num14;
            l6 = l7;
            num10 = num15;
            str10 = str15;
            d5 = d7;
            d6 = d8;
            str6 = str16;
            dialPromotionBannerModel2 = dialPromotionBannerModel;
        } else {
            l4 = l3;
            l5 = l8;
            str6 = str16;
            dialPromotionBannerModel2 = dialPromotionBannerModel;
            d4 = d9;
            i3 = i4;
            num6 = num11;
            str7 = str12;
            str8 = str13;
            str9 = str14;
            num7 = num12;
            num8 = num13;
            num9 = num14;
            l6 = l7;
            num10 = num15;
            str10 = str15;
            d5 = d7;
            d6 = d8;
        }
        return dialPromotionBannerModel2.copy(str6, i3, num6, str7, str8, str9, num7, num8, num9, l6, num10, str10, d5, d6, d4, l5, l4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getActivityCode() {
        return this.activityCode;
    }

    /* renamed from: component10, reason: from getter */
    public final Long getBenefitId() {
        return this.benefitId;
    }

    /* renamed from: component11, reason: from getter */
    public final Integer getBenefitStatus() {
        return this.benefitStatus;
    }

    /* renamed from: component12, reason: from getter */
    public final String getLockedOrderNo() {
        return this.lockedOrderNo;
    }

    /* renamed from: component13, reason: from getter */
    public final Double getDiscountAmount() {
        return this.discountAmount;
    }

    /* renamed from: component14, reason: from getter */
    public final Double getOriginalPrice() {
        return this.originalPrice;
    }

    /* renamed from: component15, reason: from getter */
    public final Double getPromotionPrice() {
        return this.promotionPrice;
    }

    /* renamed from: component16, reason: from getter */
    public final Long getValidFrom() {
        return this.validFrom;
    }

    /* renamed from: component17, reason: from getter */
    public final Long getExpiresAt() {
        return this.expiresAt;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTriggerType() {
        return this.triggerType;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getDialId() {
        return this.dialId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDialName() {
        return this.dialName;
    }

    /* renamed from: component5, reason: from getter */
    public final String getImgUrl() {
        return this.imgUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSourceOrderNo() {
        return this.sourceOrderNo;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getViewCount() {
        return this.viewCount;
    }

    /* renamed from: component8, reason: from getter */
    public final Integer getRequiredViews() {
        return this.requiredViews;
    }

    /* renamed from: component9, reason: from getter */
    public final Integer getRemainingViews() {
        return this.remainingViews;
    }

    public final DialPromotionBannerModel copy(String activityCode, int triggerType, Integer dialId, String dialName, String imgUrl, String sourceOrderNo, Integer viewCount, Integer requiredViews, Integer remainingViews, Long benefitId, Integer benefitStatus, String lockedOrderNo, Double discountAmount, Double originalPrice, Double promotionPrice, Long validFrom, Long expiresAt) {
        return new DialPromotionBannerModel(activityCode, triggerType, dialId, dialName, imgUrl, sourceOrderNo, viewCount, requiredViews, remainingViews, benefitId, benefitStatus, lockedOrderNo, discountAmount, originalPrice, promotionPrice, validFrom, expiresAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DialPromotionBannerModel)) {
            return false;
        }
        DialPromotionBannerModel dialPromotionBannerModel = (DialPromotionBannerModel) other;
        return Intrinsics.areEqual(this.activityCode, dialPromotionBannerModel.activityCode) && this.triggerType == dialPromotionBannerModel.triggerType && Intrinsics.areEqual(this.dialId, dialPromotionBannerModel.dialId) && Intrinsics.areEqual(this.dialName, dialPromotionBannerModel.dialName) && Intrinsics.areEqual(this.imgUrl, dialPromotionBannerModel.imgUrl) && Intrinsics.areEqual(this.sourceOrderNo, dialPromotionBannerModel.sourceOrderNo) && Intrinsics.areEqual(this.viewCount, dialPromotionBannerModel.viewCount) && Intrinsics.areEqual(this.requiredViews, dialPromotionBannerModel.requiredViews) && Intrinsics.areEqual(this.remainingViews, dialPromotionBannerModel.remainingViews) && Intrinsics.areEqual(this.benefitId, dialPromotionBannerModel.benefitId) && Intrinsics.areEqual(this.benefitStatus, dialPromotionBannerModel.benefitStatus) && Intrinsics.areEqual(this.lockedOrderNo, dialPromotionBannerModel.lockedOrderNo) && Intrinsics.areEqual((Object) this.discountAmount, (Object) dialPromotionBannerModel.discountAmount) && Intrinsics.areEqual((Object) this.originalPrice, (Object) dialPromotionBannerModel.originalPrice) && Intrinsics.areEqual((Object) this.promotionPrice, (Object) dialPromotionBannerModel.promotionPrice) && Intrinsics.areEqual(this.validFrom, dialPromotionBannerModel.validFrom) && Intrinsics.areEqual(this.expiresAt, dialPromotionBannerModel.expiresAt);
    }

    public int hashCode() {
        String str = this.activityCode;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.triggerType)) * 31;
        Integer num = this.dialId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.dialName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.imgUrl;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.sourceOrderNo;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.viewCount;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.requiredViews;
        int hashCode7 = (hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.remainingViews;
        int hashCode8 = (hashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Long l = this.benefitId;
        int hashCode9 = (hashCode8 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num5 = this.benefitStatus;
        int hashCode10 = (hashCode9 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str5 = this.lockedOrderNo;
        int hashCode11 = (hashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Double d = this.discountAmount;
        int hashCode12 = (hashCode11 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.originalPrice;
        int hashCode13 = (hashCode12 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.promotionPrice;
        int hashCode14 = (hashCode13 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Long l2 = this.validFrom;
        int hashCode15 = (hashCode14 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.expiresAt;
        return hashCode15 + (l3 != null ? l3.hashCode() : 0);
    }

    public String toString() {
        return "DialPromotionBannerModel(activityCode=" + this.activityCode + ", triggerType=" + this.triggerType + ", dialId=" + this.dialId + ", dialName=" + this.dialName + ", imgUrl=" + this.imgUrl + ", sourceOrderNo=" + this.sourceOrderNo + ", viewCount=" + this.viewCount + ", requiredViews=" + this.requiredViews + ", remainingViews=" + this.remainingViews + ", benefitId=" + this.benefitId + ", benefitStatus=" + this.benefitStatus + ", lockedOrderNo=" + this.lockedOrderNo + ", discountAmount=" + this.discountAmount + ", originalPrice=" + this.originalPrice + ", promotionPrice=" + this.promotionPrice + ", validFrom=" + this.validFrom + ", expiresAt=" + this.expiresAt + Separators.RPAREN;
    }

    public DialPromotionBannerModel(String str, int i, Integer num, String str2, String str3, String str4, Integer num2, Integer num3, Integer num4, Long l, Integer num5, String str5, Double d, Double d2, Double d3, Long l2, Long l3) {
        this.activityCode = str;
        this.triggerType = i;
        this.dialId = num;
        this.dialName = str2;
        this.imgUrl = str3;
        this.sourceOrderNo = str4;
        this.viewCount = num2;
        this.requiredViews = num3;
        this.remainingViews = num4;
        this.benefitId = l;
        this.benefitStatus = num5;
        this.lockedOrderNo = str5;
        this.discountAmount = d;
        this.originalPrice = d2;
        this.promotionPrice = d3;
        this.validFrom = l2;
        this.expiresAt = l3;
    }

    public /* synthetic */ DialPromotionBannerModel(String str, int i, Integer num, String str2, String str3, String str4, Integer num2, Integer num3, Integer num4, Long l, Integer num5, String str5, Double d, Double d2, Double d3, Long l2, Long l3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? null : num2, (i2 & 128) != 0 ? null : num3, (i2 & 256) != 0 ? null : num4, (i2 & 512) != 0 ? null : l, (i2 & 1024) != 0 ? null : num5, (i2 & 2048) != 0 ? null : str5, (i2 & 4096) != 0 ? null : d, (i2 & 8192) != 0 ? null : d2, (i2 & 16384) != 0 ? null : d3, (i2 & 32768) != 0 ? null : l2, (i2 & 65536) != 0 ? null : l3);
    }

    public final String getActivityCode() {
        return this.activityCode;
    }

    public final void setActivityCode(String str) {
        this.activityCode = str;
    }

    public final int getTriggerType() {
        return this.triggerType;
    }

    public final void setTriggerType(int i) {
        this.triggerType = i;
    }

    public final Integer getDialId() {
        return this.dialId;
    }

    public final void setDialId(Integer num) {
        this.dialId = num;
    }

    public final String getDialName() {
        return this.dialName;
    }

    public final void setDialName(String str) {
        this.dialName = str;
    }

    public final String getImgUrl() {
        return this.imgUrl;
    }

    public final void setImgUrl(String str) {
        this.imgUrl = str;
    }

    public final String getSourceOrderNo() {
        return this.sourceOrderNo;
    }

    public final void setSourceOrderNo(String str) {
        this.sourceOrderNo = str;
    }

    public final Integer getViewCount() {
        return this.viewCount;
    }

    public final void setViewCount(Integer num) {
        this.viewCount = num;
    }

    public final Integer getRequiredViews() {
        return this.requiredViews;
    }

    public final void setRequiredViews(Integer num) {
        this.requiredViews = num;
    }

    public final Integer getRemainingViews() {
        return this.remainingViews;
    }

    public final void setRemainingViews(Integer num) {
        this.remainingViews = num;
    }

    public final Long getBenefitId() {
        return this.benefitId;
    }

    public final void setBenefitId(Long l) {
        this.benefitId = l;
    }

    public final Integer getBenefitStatus() {
        return this.benefitStatus;
    }

    public final void setBenefitStatus(Integer num) {
        this.benefitStatus = num;
    }

    public final String getLockedOrderNo() {
        return this.lockedOrderNo;
    }

    public final void setLockedOrderNo(String str) {
        this.lockedOrderNo = str;
    }

    public final Double getDiscountAmount() {
        return this.discountAmount;
    }

    public final void setDiscountAmount(Double d) {
        this.discountAmount = d;
    }

    public final Double getOriginalPrice() {
        return this.originalPrice;
    }

    public final void setOriginalPrice(Double d) {
        this.originalPrice = d;
    }

    public final Double getPromotionPrice() {
        return this.promotionPrice;
    }

    public final void setPromotionPrice(Double d) {
        this.promotionPrice = d;
    }

    public final Long getValidFrom() {
        return this.validFrom;
    }

    public final void setValidFrom(Long l) {
        this.validFrom = l;
    }

    public final Long getExpiresAt() {
        return this.expiresAt;
    }

    public final void setExpiresAt(Long l) {
        this.expiresAt = l;
    }

    public final boolean isBrowseProgressOnly() {
        return this.benefitId == null;
    }

    public final boolean isBenefitAvailable() {
        Integer num = this.benefitStatus;
        return (num == null || num.intValue() != 0 || this.benefitId == null) ? false : true;
    }

    public final boolean isBenefitOrderCreated() {
        Integer num = this.benefitStatus;
        return num != null && num.intValue() == 1;
    }
}
