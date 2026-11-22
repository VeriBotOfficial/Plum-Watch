package com.wakeup.common.network.entity.device;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BluetoothNameInfo.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/wakeup/common/network/entity/device/BluetoothNameInfo;", "", "bluetoothName", "", "productId", "", "<init>", "(Ljava/lang/String;I)V", "getBluetoothName", "()Ljava/lang/String;", "getProductId", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BluetoothNameInfo {
    private final String bluetoothName;
    private final int productId;

    public static /* synthetic */ BluetoothNameInfo copy$default(BluetoothNameInfo bluetoothNameInfo, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = bluetoothNameInfo.bluetoothName;
        }
        if ((i2 & 2) != 0) {
            i = bluetoothNameInfo.productId;
        }
        return bluetoothNameInfo.copy(str, i);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBluetoothName() {
        return this.bluetoothName;
    }

    /* renamed from: component2, reason: from getter */
    public final int getProductId() {
        return this.productId;
    }

    public final BluetoothNameInfo copy(String bluetoothName, int productId) {
        Intrinsics.checkNotNullParameter(bluetoothName, "bluetoothName");
        return new BluetoothNameInfo(bluetoothName, productId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BluetoothNameInfo)) {
            return false;
        }
        BluetoothNameInfo bluetoothNameInfo = (BluetoothNameInfo) other;
        return Intrinsics.areEqual(this.bluetoothName, bluetoothNameInfo.bluetoothName) && this.productId == bluetoothNameInfo.productId;
    }

    public int hashCode() {
        return (this.bluetoothName.hashCode() * 31) + Integer.hashCode(this.productId);
    }

    public String toString() {
        return "BluetoothNameInfo(bluetoothName=" + this.bluetoothName + ", productId=" + this.productId + Separators.RPAREN;
    }

    public BluetoothNameInfo(String bluetoothName, int i) {
        Intrinsics.checkNotNullParameter(bluetoothName, "bluetoothName");
        this.bluetoothName = bluetoothName;
        this.productId = i;
    }

    public final String getBluetoothName() {
        return this.bluetoothName;
    }

    public final int getProductId() {
        return this.productId;
    }
}
