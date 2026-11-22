package com.wakeup.common.network.entity.ring;

import com.wakeup.common.network.entity.other.MyOrderModel;
import kotlin.Metadata;

/* compiled from: RingOrderModel.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0006\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000bR\u0014\u0010\u0016\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0007R\u0014\u0010\u0018\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000bR\u0014\u0010\u001a\u001a\u00020\u001bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u000bR\u0014\u0010 \u001a\u00020\rX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u000fR\u0014\u0010\"\u001a\u00020\rX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u000f¨\u0006$"}, d2 = {"Lcom/wakeup/common/network/entity/ring/RingOrderModel;", "Lcom/wakeup/common/network/entity/other/MyOrderModel;", "<init>", "()V", "id", "", "getId", "()J", "musicId", "", "getMusicId", "()I", "musicName", "", "getMusicName", "()Ljava/lang/String;", "userId", "getUserId", "equipmentId", "getEquipmentId", "payType", "getPayType", "payTime", "getPayTime", "payPlatform", "getPayPlatform", "payPrice", "", "getPayPrice", "()D", "payResult", "getPayResult", "paySign", "getPaySign", "remark", "getRemark", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RingOrderModel extends MyOrderModel {
    private final int equipmentId;
    private final long id;
    private final int musicId;
    private final int payPlatform;
    private final double payPrice;
    private final int payResult;
    private final long payTime;
    private final int payType;
    private final int userId;
    private final String musicName = "";
    private final String paySign = "";
    private final String remark = "";

    public final long getId() {
        return this.id;
    }

    public final int getMusicId() {
        return this.musicId;
    }

    public final String getMusicName() {
        return this.musicName;
    }

    public final int getUserId() {
        return this.userId;
    }

    public final int getEquipmentId() {
        return this.equipmentId;
    }

    public final int getPayType() {
        return this.payType;
    }

    public final long getPayTime() {
        return this.payTime;
    }

    public final int getPayPlatform() {
        return this.payPlatform;
    }

    public final double getPayPrice() {
        return this.payPrice;
    }

    public final int getPayResult() {
        return this.payResult;
    }

    public final String getPaySign() {
        return this.paySign;
    }

    public final String getRemark() {
        return this.remark;
    }
}
