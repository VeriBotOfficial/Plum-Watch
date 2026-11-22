package com.wakeup.common.network.entity.device;

import android.gov.nist.core.Separators;
import com.wakeup.feature.user.constant.UserConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstallDial.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\t\u0010)\u001a\u00020\nHÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003JO\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u0005HÆ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\u0005HÖ\u0001J\t\u00101\u001a\u00020\bHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u000b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R\u001a\u0010\f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0014\"\u0004\b$\u0010\u0016¨\u00062"}, d2 = {"Lcom/wakeup/common/network/entity/device/InstallDial;", "", "appTime", "", UserConstants.DIAL_ID, "", "equipmentId", "mac", "", "price", "", "sourceType", "type", "<init>", "(JIILjava/lang/String;FII)V", "getAppTime", "()J", "setAppTime", "(J)V", "getDialId", "()I", "setDialId", "(I)V", "getEquipmentId", "setEquipmentId", "getMac", "()Ljava/lang/String;", "setMac", "(Ljava/lang/String;)V", "getPrice", "()F", "setPrice", "(F)V", "getSourceType", "setSourceType", "getType", "setType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class InstallDial {
    private long appTime;
    private int dialId;
    private int equipmentId;
    private String mac;
    private float price;
    private int sourceType;
    private int type;

    public static /* synthetic */ InstallDial copy$default(InstallDial installDial, long j, int i, int i2, String str, float f, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            j = installDial.appTime;
        }
        long j2 = j;
        if ((i5 & 2) != 0) {
            i = installDial.dialId;
        }
        int i6 = i;
        if ((i5 & 4) != 0) {
            i2 = installDial.equipmentId;
        }
        int i7 = i2;
        if ((i5 & 8) != 0) {
            str = installDial.mac;
        }
        String str2 = str;
        if ((i5 & 16) != 0) {
            f = installDial.price;
        }
        return installDial.copy(j2, i6, i7, str2, f, (i5 & 32) != 0 ? installDial.sourceType : i3, (i5 & 64) != 0 ? installDial.type : i4);
    }

    /* renamed from: component1, reason: from getter */
    public final long getAppTime() {
        return this.appTime;
    }

    /* renamed from: component2, reason: from getter */
    public final int getDialId() {
        return this.dialId;
    }

    /* renamed from: component3, reason: from getter */
    public final int getEquipmentId() {
        return this.equipmentId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMac() {
        return this.mac;
    }

    /* renamed from: component5, reason: from getter */
    public final float getPrice() {
        return this.price;
    }

    /* renamed from: component6, reason: from getter */
    public final int getSourceType() {
        return this.sourceType;
    }

    /* renamed from: component7, reason: from getter */
    public final int getType() {
        return this.type;
    }

    public final InstallDial copy(long appTime, int dialId, int equipmentId, String mac, float price, int sourceType, int type) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        return new InstallDial(appTime, dialId, equipmentId, mac, price, sourceType, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstallDial)) {
            return false;
        }
        InstallDial installDial = (InstallDial) other;
        return this.appTime == installDial.appTime && this.dialId == installDial.dialId && this.equipmentId == installDial.equipmentId && Intrinsics.areEqual(this.mac, installDial.mac) && Float.compare(this.price, installDial.price) == 0 && this.sourceType == installDial.sourceType && this.type == installDial.type;
    }

    public int hashCode() {
        return (((((((((((Long.hashCode(this.appTime) * 31) + Integer.hashCode(this.dialId)) * 31) + Integer.hashCode(this.equipmentId)) * 31) + this.mac.hashCode()) * 31) + Float.hashCode(this.price)) * 31) + Integer.hashCode(this.sourceType)) * 31) + Integer.hashCode(this.type);
    }

    public String toString() {
        return "InstallDial(appTime=" + this.appTime + ", dialId=" + this.dialId + ", equipmentId=" + this.equipmentId + ", mac=" + this.mac + ", price=" + this.price + ", sourceType=" + this.sourceType + ", type=" + this.type + Separators.RPAREN;
    }

    public InstallDial(long j, int i, int i2, String mac, float f, int i3, int i4) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        this.appTime = j;
        this.dialId = i;
        this.equipmentId = i2;
        this.mac = mac;
        this.price = f;
        this.sourceType = i3;
        this.type = i4;
    }

    public final long getAppTime() {
        return this.appTime;
    }

    public final void setAppTime(long j) {
        this.appTime = j;
    }

    public final int getDialId() {
        return this.dialId;
    }

    public final void setDialId(int i) {
        this.dialId = i;
    }

    public final int getEquipmentId() {
        return this.equipmentId;
    }

    public final void setEquipmentId(int i) {
        this.equipmentId = i;
    }

    public final String getMac() {
        return this.mac;
    }

    public final void setMac(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mac = str;
    }

    public final float getPrice() {
        return this.price;
    }

    public final void setPrice(float f) {
        this.price = f;
    }

    public final int getSourceType() {
        return this.sourceType;
    }

    public final void setSourceType(int i) {
        this.sourceType = i;
    }

    public final int getType() {
        return this.type;
    }

    public final void setType(int i) {
        this.type = i;
    }
}
