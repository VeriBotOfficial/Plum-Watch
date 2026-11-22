package com.wakeup.commponent.module.device;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScanDevice.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000e\"\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/wakeup/commponent/module/device/ScanDevice;", "", "mac", "", "bleName", "rssi", "", "productId", "<init>", "(Ljava/lang/String;Ljava/lang/String;II)V", "getMac", "()Ljava/lang/String;", "getBleName", "getRssi", "()I", "getProductId", "setProductId", "(I)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ScanDevice {
    private final String bleName;
    private final String mac;
    private int productId;
    private final int rssi;

    public static /* synthetic */ ScanDevice copy$default(ScanDevice scanDevice, String str, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = scanDevice.mac;
        }
        if ((i3 & 2) != 0) {
            str2 = scanDevice.bleName;
        }
        if ((i3 & 4) != 0) {
            i = scanDevice.rssi;
        }
        if ((i3 & 8) != 0) {
            i2 = scanDevice.productId;
        }
        return scanDevice.copy(str, str2, i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMac() {
        return this.mac;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBleName() {
        return this.bleName;
    }

    /* renamed from: component3, reason: from getter */
    public final int getRssi() {
        return this.rssi;
    }

    /* renamed from: component4, reason: from getter */
    public final int getProductId() {
        return this.productId;
    }

    public final ScanDevice copy(String mac, String bleName, int rssi, int productId) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(bleName, "bleName");
        return new ScanDevice(mac, bleName, rssi, productId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScanDevice)) {
            return false;
        }
        ScanDevice scanDevice = (ScanDevice) other;
        return Intrinsics.areEqual(this.mac, scanDevice.mac) && Intrinsics.areEqual(this.bleName, scanDevice.bleName) && this.rssi == scanDevice.rssi && this.productId == scanDevice.productId;
    }

    public int hashCode() {
        return (((((this.mac.hashCode() * 31) + this.bleName.hashCode()) * 31) + Integer.hashCode(this.rssi)) * 31) + Integer.hashCode(this.productId);
    }

    public String toString() {
        return "ScanDevice(mac=" + this.mac + ", bleName=" + this.bleName + ", rssi=" + this.rssi + ", productId=" + this.productId + Separators.RPAREN;
    }

    public ScanDevice(String mac, String bleName, int i, int i2) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(bleName, "bleName");
        this.mac = mac;
        this.bleName = bleName;
        this.rssi = i;
        this.productId = i2;
    }

    public final String getMac() {
        return this.mac;
    }

    public final String getBleName() {
        return this.bleName;
    }

    public final int getRssi() {
        return this.rssi;
    }

    public final int getProductId() {
        return this.productId;
    }

    public final void setProductId(int i) {
        this.productId = i;
    }
}
