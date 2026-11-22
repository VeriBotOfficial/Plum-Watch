package com.wakeup.common.network.entity.device;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserTicketEntity.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003Jc\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\tHÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006)"}, d2 = {"Lcom/wakeup/common/network/entity/device/UserTicketEntity;", "", "userId", "", "deviceId", "ticket", "mobile", "bindDeviceSn", "wearfitVip", "", "appVersion", "sourceChannel", "sourceResourcesId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)V", "getUserId", "()Ljava/lang/String;", "getDeviceId", "getTicket", "getMobile", "getBindDeviceSn", "getWearfitVip", "()I", "getAppVersion", "getSourceChannel", "getSourceResourcesId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UserTicketEntity {
    private final String appVersion;
    private final String bindDeviceSn;
    private final String deviceId;
    private final String mobile;
    private final int sourceChannel;
    private final String sourceResourcesId;
    private final String ticket;
    private final String userId;
    private final int wearfitVip;

    public static /* synthetic */ UserTicketEntity copy$default(UserTicketEntity userTicketEntity, String str, String str2, String str3, String str4, String str5, int i, String str6, int i2, String str7, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = userTicketEntity.userId;
        }
        if ((i3 & 2) != 0) {
            str2 = userTicketEntity.deviceId;
        }
        if ((i3 & 4) != 0) {
            str3 = userTicketEntity.ticket;
        }
        if ((i3 & 8) != 0) {
            str4 = userTicketEntity.mobile;
        }
        if ((i3 & 16) != 0) {
            str5 = userTicketEntity.bindDeviceSn;
        }
        if ((i3 & 32) != 0) {
            i = userTicketEntity.wearfitVip;
        }
        if ((i3 & 64) != 0) {
            str6 = userTicketEntity.appVersion;
        }
        if ((i3 & 128) != 0) {
            i2 = userTicketEntity.sourceChannel;
        }
        if ((i3 & 256) != 0) {
            str7 = userTicketEntity.sourceResourcesId;
        }
        int i4 = i2;
        String str8 = str7;
        int i5 = i;
        String str9 = str6;
        String str10 = str5;
        String str11 = str3;
        return userTicketEntity.copy(str, str2, str11, str4, str10, i5, str9, i4, str8);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTicket() {
        return this.ticket;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMobile() {
        return this.mobile;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBindDeviceSn() {
        return this.bindDeviceSn;
    }

    /* renamed from: component6, reason: from getter */
    public final int getWearfitVip() {
        return this.wearfitVip;
    }

    /* renamed from: component7, reason: from getter */
    public final String getAppVersion() {
        return this.appVersion;
    }

    /* renamed from: component8, reason: from getter */
    public final int getSourceChannel() {
        return this.sourceChannel;
    }

    /* renamed from: component9, reason: from getter */
    public final String getSourceResourcesId() {
        return this.sourceResourcesId;
    }

    public final UserTicketEntity copy(String userId, String deviceId, String ticket, String mobile, String bindDeviceSn, int wearfitVip, String appVersion, int sourceChannel, String sourceResourcesId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(ticket, "ticket");
        Intrinsics.checkNotNullParameter(mobile, "mobile");
        Intrinsics.checkNotNullParameter(bindDeviceSn, "bindDeviceSn");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(sourceResourcesId, "sourceResourcesId");
        return new UserTicketEntity(userId, deviceId, ticket, mobile, bindDeviceSn, wearfitVip, appVersion, sourceChannel, sourceResourcesId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserTicketEntity)) {
            return false;
        }
        UserTicketEntity userTicketEntity = (UserTicketEntity) other;
        return Intrinsics.areEqual(this.userId, userTicketEntity.userId) && Intrinsics.areEqual(this.deviceId, userTicketEntity.deviceId) && Intrinsics.areEqual(this.ticket, userTicketEntity.ticket) && Intrinsics.areEqual(this.mobile, userTicketEntity.mobile) && Intrinsics.areEqual(this.bindDeviceSn, userTicketEntity.bindDeviceSn) && this.wearfitVip == userTicketEntity.wearfitVip && Intrinsics.areEqual(this.appVersion, userTicketEntity.appVersion) && this.sourceChannel == userTicketEntity.sourceChannel && Intrinsics.areEqual(this.sourceResourcesId, userTicketEntity.sourceResourcesId);
    }

    public int hashCode() {
        return (((((((((((((((this.userId.hashCode() * 31) + this.deviceId.hashCode()) * 31) + this.ticket.hashCode()) * 31) + this.mobile.hashCode()) * 31) + this.bindDeviceSn.hashCode()) * 31) + Integer.hashCode(this.wearfitVip)) * 31) + this.appVersion.hashCode()) * 31) + Integer.hashCode(this.sourceChannel)) * 31) + this.sourceResourcesId.hashCode();
    }

    public String toString() {
        return "UserTicketEntity(userId=" + this.userId + ", deviceId=" + this.deviceId + ", ticket=" + this.ticket + ", mobile=" + this.mobile + ", bindDeviceSn=" + this.bindDeviceSn + ", wearfitVip=" + this.wearfitVip + ", appVersion=" + this.appVersion + ", sourceChannel=" + this.sourceChannel + ", sourceResourcesId=" + this.sourceResourcesId + Separators.RPAREN;
    }

    public UserTicketEntity(String userId, String deviceId, String ticket, String mobile, String bindDeviceSn, int i, String appVersion, int i2, String sourceResourcesId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(ticket, "ticket");
        Intrinsics.checkNotNullParameter(mobile, "mobile");
        Intrinsics.checkNotNullParameter(bindDeviceSn, "bindDeviceSn");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(sourceResourcesId, "sourceResourcesId");
        this.userId = userId;
        this.deviceId = deviceId;
        this.ticket = ticket;
        this.mobile = mobile;
        this.bindDeviceSn = bindDeviceSn;
        this.wearfitVip = i;
        this.appVersion = appVersion;
        this.sourceChannel = i2;
        this.sourceResourcesId = sourceResourcesId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getTicket() {
        return this.ticket;
    }

    public final String getMobile() {
        return this.mobile;
    }

    public final String getBindDeviceSn() {
        return this.bindDeviceSn;
    }

    public final int getWearfitVip() {
        return this.wearfitVip;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final int getSourceChannel() {
        return this.sourceChannel;
    }

    public final String getSourceResourcesId() {
        return this.sourceResourcesId;
    }
}
