package com.wakeup.common.network.entity.device;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UpdateDeviceInfo.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/wakeup/common/network/entity/device/UpdateDeviceInfo;", "", "mac", "", "equipmentAlias", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getMac", "()Ljava/lang/String;", "setMac", "(Ljava/lang/String;)V", "getEquipmentAlias", "setEquipmentAlias", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UpdateDeviceInfo {
    private String equipmentAlias;
    private String mac;

    public static /* synthetic */ UpdateDeviceInfo copy$default(UpdateDeviceInfo updateDeviceInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateDeviceInfo.mac;
        }
        if ((i & 2) != 0) {
            str2 = updateDeviceInfo.equipmentAlias;
        }
        return updateDeviceInfo.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMac() {
        return this.mac;
    }

    /* renamed from: component2, reason: from getter */
    public final String getEquipmentAlias() {
        return this.equipmentAlias;
    }

    public final UpdateDeviceInfo copy(String mac, String equipmentAlias) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(equipmentAlias, "equipmentAlias");
        return new UpdateDeviceInfo(mac, equipmentAlias);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateDeviceInfo)) {
            return false;
        }
        UpdateDeviceInfo updateDeviceInfo = (UpdateDeviceInfo) other;
        return Intrinsics.areEqual(this.mac, updateDeviceInfo.mac) && Intrinsics.areEqual(this.equipmentAlias, updateDeviceInfo.equipmentAlias);
    }

    public int hashCode() {
        return (this.mac.hashCode() * 31) + this.equipmentAlias.hashCode();
    }

    public String toString() {
        return "UpdateDeviceInfo(mac=" + this.mac + ", equipmentAlias=" + this.equipmentAlias + Separators.RPAREN;
    }

    public UpdateDeviceInfo(String mac, String equipmentAlias) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(equipmentAlias, "equipmentAlias");
        this.mac = mac;
        this.equipmentAlias = equipmentAlias;
    }

    public final String getMac() {
        return this.mac;
    }

    public final void setMac(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mac = str;
    }

    public final String getEquipmentAlias() {
        return this.equipmentAlias;
    }

    public final void setEquipmentAlias(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.equipmentAlias = str;
    }
}
