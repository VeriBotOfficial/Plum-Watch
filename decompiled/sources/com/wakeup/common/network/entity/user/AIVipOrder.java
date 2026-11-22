package com.wakeup.common.network.entity.user;

import android.gov.nist.core.Separators;
import com.anythink.core.d.l;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AIVipOrder.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\bO\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bç\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0005\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u0005\u0012\u0006\u0010\u001f\u001a\u00020\u0005\u0012\u0006\u0010 \u001a\u00020\u0003¢\u0006\u0004\b!\u0010\"J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0005HÆ\u0003J\t\u0010D\u001a\u00020\u0005HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0005HÆ\u0003J\t\u0010H\u001a\u00020\u0005HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0005HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0010HÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\t\u0010O\u001a\u00020\u0010HÆ\u0003J\t\u0010P\u001a\u00020\u0005HÆ\u0003J\t\u0010Q\u001a\u00020\u0005HÆ\u0003J\t\u0010R\u001a\u00020\u0003HÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0005HÆ\u0003J\t\u0010U\u001a\u00020\u0005HÆ\u0003J\t\u0010V\u001a\u00020\u0003HÆ\u0003J\t\u0010W\u001a\u00020\u0003HÆ\u0003J\t\u0010X\u001a\u00020\u0005HÆ\u0003J\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\t\u0010Z\u001a\u00020\u0003HÆ\u0003J\t\u0010[\u001a\u00020\u0005HÆ\u0003J\t\u0010\\\u001a\u00020\u0005HÆ\u0003J\t\u0010]\u001a\u00020\u0003HÆ\u0003J¡\u0002\u0010^\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u00052\b\b\u0002\u0010 \u001a\u00020\u0003HÆ\u0001J\u0013\u0010_\u001a\u00020`2\b\u0010a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010b\u001a\u00020\u0003HÖ\u0001J\t\u0010c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010$R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010$R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010&R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010&R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010$R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010&R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010$R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010$R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010$R\u0011\u0010\u0012\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b3\u00101R\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b4\u0010&R\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b5\u0010&R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010$R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010$R\u0011\u0010\u0017\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b8\u0010&R\u0011\u0010\u0018\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b9\u0010&R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010$R\u0011\u0010\u001a\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010$R\u0011\u0010\u001b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b<\u0010&R\u0011\u0010\u001c\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u0010$R\u0011\u0010\u001d\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u0010$R\u0011\u0010\u001e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b?\u0010&R\u0011\u0010\u001f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b@\u0010&R\u0011\u0010 \u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bA\u0010$¨\u0006d"}, d2 = {"Lcom/wakeup/common/network/entity/user/AIVipOrder;", "", "id", "", "agreeNo", "", "tradeNo", "userId", "orderStatus", "orderNo", "orderName", "orderType", "aiMemberType", "orderFrom", "orderSource", "orderPrice", "", "orderCurrency", "orderDiscount", "orderTime", "orderOffTime", "orderClientType", "payType", "payTime", "expireTime", RemoteMessageConst.Notification.CHANNEL_ID, "productId", "remark", "createBy", "updateBy", "createTime", l.a.ac, "delStatus", "<init>", "(ILjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;ILjava/lang/String;IIDIDLjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;IILjava/lang/String;IILjava/lang/String;Ljava/lang/String;I)V", "getId", "()I", "getAgreeNo", "()Ljava/lang/String;", "getTradeNo", "getUserId", "getOrderStatus", "getOrderNo", "getOrderName", "getOrderType", "getAiMemberType", "getOrderFrom", "getOrderSource", "getOrderPrice", "()D", "getOrderCurrency", "getOrderDiscount", "getOrderTime", "getOrderOffTime", "getOrderClientType", "getPayType", "getPayTime", "getExpireTime", "getChannelId", "getProductId", "getRemark", "getCreateBy", "getUpdateBy", "getCreateTime", "getUpdateTime", "getDelStatus", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AIVipOrder {
    private final String agreeNo;
    private final String aiMemberType;
    private final int channelId;
    private final int createBy;
    private final String createTime;
    private final int delStatus;
    private final String expireTime;
    private final int id;
    private final int orderClientType;
    private final int orderCurrency;
    private final double orderDiscount;
    private final int orderFrom;
    private final String orderName;
    private final String orderNo;
    private final String orderOffTime;
    private final double orderPrice;
    private final int orderSource;
    private final int orderStatus;
    private final String orderTime;
    private final int orderType;
    private final String payTime;
    private final int payType;
    private final int productId;
    private final String remark;
    private final String tradeNo;
    private final int updateBy;
    private final String updateTime;
    private final int userId;

    public static /* synthetic */ AIVipOrder copy$default(AIVipOrder aIVipOrder, int i, String str, String str2, int i2, int i3, String str3, String str4, int i4, String str5, int i5, int i6, double d, int i7, double d2, String str6, String str7, int i8, int i9, String str8, String str9, int i10, int i11, String str10, int i12, int i13, String str11, String str12, int i14, int i15, Object obj) {
        int i16;
        String str13;
        int i17 = (i15 & 1) != 0 ? aIVipOrder.id : i;
        String str14 = (i15 & 2) != 0 ? aIVipOrder.agreeNo : str;
        String str15 = (i15 & 4) != 0 ? aIVipOrder.tradeNo : str2;
        int i18 = (i15 & 8) != 0 ? aIVipOrder.userId : i2;
        int i19 = (i15 & 16) != 0 ? aIVipOrder.orderStatus : i3;
        String str16 = (i15 & 32) != 0 ? aIVipOrder.orderNo : str3;
        String str17 = (i15 & 64) != 0 ? aIVipOrder.orderName : str4;
        int i20 = (i15 & 128) != 0 ? aIVipOrder.orderType : i4;
        String str18 = (i15 & 256) != 0 ? aIVipOrder.aiMemberType : str5;
        int i21 = (i15 & 512) != 0 ? aIVipOrder.orderFrom : i5;
        int i22 = (i15 & 1024) != 0 ? aIVipOrder.orderSource : i6;
        double d3 = (i15 & 2048) != 0 ? aIVipOrder.orderPrice : d;
        int i23 = (i15 & 4096) != 0 ? aIVipOrder.orderCurrency : i7;
        int i24 = i17;
        String str19 = str14;
        double d4 = (i15 & 8192) != 0 ? aIVipOrder.orderDiscount : d2;
        String str20 = (i15 & 16384) != 0 ? aIVipOrder.orderTime : str6;
        String str21 = (32768 & i15) != 0 ? aIVipOrder.orderOffTime : str7;
        int i25 = (i15 & 65536) != 0 ? aIVipOrder.orderClientType : i8;
        int i26 = (i15 & 131072) != 0 ? aIVipOrder.payType : i9;
        String str22 = (i15 & 262144) != 0 ? aIVipOrder.payTime : str8;
        String str23 = (i15 & 524288) != 0 ? aIVipOrder.expireTime : str9;
        int i27 = (i15 & 1048576) != 0 ? aIVipOrder.channelId : i10;
        int i28 = (i15 & 2097152) != 0 ? aIVipOrder.productId : i11;
        String str24 = (i15 & 4194304) != 0 ? aIVipOrder.remark : str10;
        int i29 = (i15 & 8388608) != 0 ? aIVipOrder.createBy : i12;
        int i30 = (i15 & 16777216) != 0 ? aIVipOrder.updateBy : i13;
        String str25 = (i15 & 33554432) != 0 ? aIVipOrder.createTime : str11;
        String str26 = (i15 & 67108864) != 0 ? aIVipOrder.updateTime : str12;
        if ((i15 & 134217728) != 0) {
            str13 = str26;
            i16 = aIVipOrder.delStatus;
        } else {
            i16 = i14;
            str13 = str26;
        }
        return aIVipOrder.copy(i24, str19, str15, i18, i19, str16, str17, i20, str18, i21, i22, d3, i23, d4, str20, str21, i25, i26, str22, str23, i27, i28, str24, i29, i30, str25, str13, i16);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final int getOrderFrom() {
        return this.orderFrom;
    }

    /* renamed from: component11, reason: from getter */
    public final int getOrderSource() {
        return this.orderSource;
    }

    /* renamed from: component12, reason: from getter */
    public final double getOrderPrice() {
        return this.orderPrice;
    }

    /* renamed from: component13, reason: from getter */
    public final int getOrderCurrency() {
        return this.orderCurrency;
    }

    /* renamed from: component14, reason: from getter */
    public final double getOrderDiscount() {
        return this.orderDiscount;
    }

    /* renamed from: component15, reason: from getter */
    public final String getOrderTime() {
        return this.orderTime;
    }

    /* renamed from: component16, reason: from getter */
    public final String getOrderOffTime() {
        return this.orderOffTime;
    }

    /* renamed from: component17, reason: from getter */
    public final int getOrderClientType() {
        return this.orderClientType;
    }

    /* renamed from: component18, reason: from getter */
    public final int getPayType() {
        return this.payType;
    }

    /* renamed from: component19, reason: from getter */
    public final String getPayTime() {
        return this.payTime;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAgreeNo() {
        return this.agreeNo;
    }

    /* renamed from: component20, reason: from getter */
    public final String getExpireTime() {
        return this.expireTime;
    }

    /* renamed from: component21, reason: from getter */
    public final int getChannelId() {
        return this.channelId;
    }

    /* renamed from: component22, reason: from getter */
    public final int getProductId() {
        return this.productId;
    }

    /* renamed from: component23, reason: from getter */
    public final String getRemark() {
        return this.remark;
    }

    /* renamed from: component24, reason: from getter */
    public final int getCreateBy() {
        return this.createBy;
    }

    /* renamed from: component25, reason: from getter */
    public final int getUpdateBy() {
        return this.updateBy;
    }

    /* renamed from: component26, reason: from getter */
    public final String getCreateTime() {
        return this.createTime;
    }

    /* renamed from: component27, reason: from getter */
    public final String getUpdateTime() {
        return this.updateTime;
    }

    /* renamed from: component28, reason: from getter */
    public final int getDelStatus() {
        return this.delStatus;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTradeNo() {
        return this.tradeNo;
    }

    /* renamed from: component4, reason: from getter */
    public final int getUserId() {
        return this.userId;
    }

    /* renamed from: component5, reason: from getter */
    public final int getOrderStatus() {
        return this.orderStatus;
    }

    /* renamed from: component6, reason: from getter */
    public final String getOrderNo() {
        return this.orderNo;
    }

    /* renamed from: component7, reason: from getter */
    public final String getOrderName() {
        return this.orderName;
    }

    /* renamed from: component8, reason: from getter */
    public final int getOrderType() {
        return this.orderType;
    }

    /* renamed from: component9, reason: from getter */
    public final String getAiMemberType() {
        return this.aiMemberType;
    }

    public final AIVipOrder copy(int id2, String agreeNo, String tradeNo, int userId, int orderStatus, String orderNo, String orderName, int orderType, String aiMemberType, int orderFrom, int orderSource, double orderPrice, int orderCurrency, double orderDiscount, String orderTime, String orderOffTime, int orderClientType, int payType, String payTime, String expireTime, int channelId, int productId, String remark, int createBy, int updateBy, String createTime, String updateTime, int delStatus) {
        Intrinsics.checkNotNullParameter(agreeNo, "agreeNo");
        Intrinsics.checkNotNullParameter(tradeNo, "tradeNo");
        Intrinsics.checkNotNullParameter(orderNo, "orderNo");
        Intrinsics.checkNotNullParameter(orderName, "orderName");
        Intrinsics.checkNotNullParameter(aiMemberType, "aiMemberType");
        Intrinsics.checkNotNullParameter(orderTime, "orderTime");
        Intrinsics.checkNotNullParameter(orderOffTime, "orderOffTime");
        Intrinsics.checkNotNullParameter(payTime, "payTime");
        Intrinsics.checkNotNullParameter(expireTime, "expireTime");
        Intrinsics.checkNotNullParameter(remark, "remark");
        Intrinsics.checkNotNullParameter(createTime, "createTime");
        Intrinsics.checkNotNullParameter(updateTime, "updateTime");
        return new AIVipOrder(id2, agreeNo, tradeNo, userId, orderStatus, orderNo, orderName, orderType, aiMemberType, orderFrom, orderSource, orderPrice, orderCurrency, orderDiscount, orderTime, orderOffTime, orderClientType, payType, payTime, expireTime, channelId, productId, remark, createBy, updateBy, createTime, updateTime, delStatus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AIVipOrder)) {
            return false;
        }
        AIVipOrder aIVipOrder = (AIVipOrder) other;
        return this.id == aIVipOrder.id && Intrinsics.areEqual(this.agreeNo, aIVipOrder.agreeNo) && Intrinsics.areEqual(this.tradeNo, aIVipOrder.tradeNo) && this.userId == aIVipOrder.userId && this.orderStatus == aIVipOrder.orderStatus && Intrinsics.areEqual(this.orderNo, aIVipOrder.orderNo) && Intrinsics.areEqual(this.orderName, aIVipOrder.orderName) && this.orderType == aIVipOrder.orderType && Intrinsics.areEqual(this.aiMemberType, aIVipOrder.aiMemberType) && this.orderFrom == aIVipOrder.orderFrom && this.orderSource == aIVipOrder.orderSource && Double.compare(this.orderPrice, aIVipOrder.orderPrice) == 0 && this.orderCurrency == aIVipOrder.orderCurrency && Double.compare(this.orderDiscount, aIVipOrder.orderDiscount) == 0 && Intrinsics.areEqual(this.orderTime, aIVipOrder.orderTime) && Intrinsics.areEqual(this.orderOffTime, aIVipOrder.orderOffTime) && this.orderClientType == aIVipOrder.orderClientType && this.payType == aIVipOrder.payType && Intrinsics.areEqual(this.payTime, aIVipOrder.payTime) && Intrinsics.areEqual(this.expireTime, aIVipOrder.expireTime) && this.channelId == aIVipOrder.channelId && this.productId == aIVipOrder.productId && Intrinsics.areEqual(this.remark, aIVipOrder.remark) && this.createBy == aIVipOrder.createBy && this.updateBy == aIVipOrder.updateBy && Intrinsics.areEqual(this.createTime, aIVipOrder.createTime) && Intrinsics.areEqual(this.updateTime, aIVipOrder.updateTime) && this.delStatus == aIVipOrder.delStatus;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((Integer.hashCode(this.id) * 31) + this.agreeNo.hashCode()) * 31) + this.tradeNo.hashCode()) * 31) + Integer.hashCode(this.userId)) * 31) + Integer.hashCode(this.orderStatus)) * 31) + this.orderNo.hashCode()) * 31) + this.orderName.hashCode()) * 31) + Integer.hashCode(this.orderType)) * 31) + this.aiMemberType.hashCode()) * 31) + Integer.hashCode(this.orderFrom)) * 31) + Integer.hashCode(this.orderSource)) * 31) + Double.hashCode(this.orderPrice)) * 31) + Integer.hashCode(this.orderCurrency)) * 31) + Double.hashCode(this.orderDiscount)) * 31) + this.orderTime.hashCode()) * 31) + this.orderOffTime.hashCode()) * 31) + Integer.hashCode(this.orderClientType)) * 31) + Integer.hashCode(this.payType)) * 31) + this.payTime.hashCode()) * 31) + this.expireTime.hashCode()) * 31) + Integer.hashCode(this.channelId)) * 31) + Integer.hashCode(this.productId)) * 31) + this.remark.hashCode()) * 31) + Integer.hashCode(this.createBy)) * 31) + Integer.hashCode(this.updateBy)) * 31) + this.createTime.hashCode()) * 31) + this.updateTime.hashCode()) * 31) + Integer.hashCode(this.delStatus);
    }

    public String toString() {
        return "AIVipOrder(id=" + this.id + ", agreeNo=" + this.agreeNo + ", tradeNo=" + this.tradeNo + ", userId=" + this.userId + ", orderStatus=" + this.orderStatus + ", orderNo=" + this.orderNo + ", orderName=" + this.orderName + ", orderType=" + this.orderType + ", aiMemberType=" + this.aiMemberType + ", orderFrom=" + this.orderFrom + ", orderSource=" + this.orderSource + ", orderPrice=" + this.orderPrice + ", orderCurrency=" + this.orderCurrency + ", orderDiscount=" + this.orderDiscount + ", orderTime=" + this.orderTime + ", orderOffTime=" + this.orderOffTime + ", orderClientType=" + this.orderClientType + ", payType=" + this.payType + ", payTime=" + this.payTime + ", expireTime=" + this.expireTime + ", channelId=" + this.channelId + ", productId=" + this.productId + ", remark=" + this.remark + ", createBy=" + this.createBy + ", updateBy=" + this.updateBy + ", createTime=" + this.createTime + ", updateTime=" + this.updateTime + ", delStatus=" + this.delStatus + Separators.RPAREN;
    }

    public AIVipOrder(int i, String agreeNo, String tradeNo, int i2, int i3, String orderNo, String orderName, int i4, String aiMemberType, int i5, int i6, double d, int i7, double d2, String orderTime, String orderOffTime, int i8, int i9, String payTime, String expireTime, int i10, int i11, String remark, int i12, int i13, String createTime, String updateTime, int i14) {
        Intrinsics.checkNotNullParameter(agreeNo, "agreeNo");
        Intrinsics.checkNotNullParameter(tradeNo, "tradeNo");
        Intrinsics.checkNotNullParameter(orderNo, "orderNo");
        Intrinsics.checkNotNullParameter(orderName, "orderName");
        Intrinsics.checkNotNullParameter(aiMemberType, "aiMemberType");
        Intrinsics.checkNotNullParameter(orderTime, "orderTime");
        Intrinsics.checkNotNullParameter(orderOffTime, "orderOffTime");
        Intrinsics.checkNotNullParameter(payTime, "payTime");
        Intrinsics.checkNotNullParameter(expireTime, "expireTime");
        Intrinsics.checkNotNullParameter(remark, "remark");
        Intrinsics.checkNotNullParameter(createTime, "createTime");
        Intrinsics.checkNotNullParameter(updateTime, "updateTime");
        this.id = i;
        this.agreeNo = agreeNo;
        this.tradeNo = tradeNo;
        this.userId = i2;
        this.orderStatus = i3;
        this.orderNo = orderNo;
        this.orderName = orderName;
        this.orderType = i4;
        this.aiMemberType = aiMemberType;
        this.orderFrom = i5;
        this.orderSource = i6;
        this.orderPrice = d;
        this.orderCurrency = i7;
        this.orderDiscount = d2;
        this.orderTime = orderTime;
        this.orderOffTime = orderOffTime;
        this.orderClientType = i8;
        this.payType = i9;
        this.payTime = payTime;
        this.expireTime = expireTime;
        this.channelId = i10;
        this.productId = i11;
        this.remark = remark;
        this.createBy = i12;
        this.updateBy = i13;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.delStatus = i14;
    }

    public final int getId() {
        return this.id;
    }

    public final String getAgreeNo() {
        return this.agreeNo;
    }

    public final String getTradeNo() {
        return this.tradeNo;
    }

    public final int getUserId() {
        return this.userId;
    }

    public final int getOrderStatus() {
        return this.orderStatus;
    }

    public final String getOrderNo() {
        return this.orderNo;
    }

    public final String getOrderName() {
        return this.orderName;
    }

    public final int getOrderType() {
        return this.orderType;
    }

    public final String getAiMemberType() {
        return this.aiMemberType;
    }

    public final int getOrderFrom() {
        return this.orderFrom;
    }

    public final int getOrderSource() {
        return this.orderSource;
    }

    public final double getOrderPrice() {
        return this.orderPrice;
    }

    public final int getOrderCurrency() {
        return this.orderCurrency;
    }

    public final double getOrderDiscount() {
        return this.orderDiscount;
    }

    public final String getOrderTime() {
        return this.orderTime;
    }

    public final String getOrderOffTime() {
        return this.orderOffTime;
    }

    public final int getOrderClientType() {
        return this.orderClientType;
    }

    public final int getPayType() {
        return this.payType;
    }

    public final String getPayTime() {
        return this.payTime;
    }

    public final String getExpireTime() {
        return this.expireTime;
    }

    public final int getChannelId() {
        return this.channelId;
    }

    public final int getProductId() {
        return this.productId;
    }

    public final String getRemark() {
        return this.remark;
    }

    public final int getCreateBy() {
        return this.createBy;
    }

    public final int getUpdateBy() {
        return this.updateBy;
    }

    public final String getCreateTime() {
        return this.createTime;
    }

    public final String getUpdateTime() {
        return this.updateTime;
    }

    public final int getDelStatus() {
        return this.delStatus;
    }
}
