package com.wakeup.commponent.module.buryPoint;

import android.gov.nist.core.Separators;
import kotlin.Metadata;

/* compiled from: DeviceCpuData.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/wakeup/commponent/module/buryPoint/DeviceCpuData;", "", "type", "", "cpuUsed", "", "memoryUsed", "cpuCoreId", "<init>", "(IFFI)V", "getType", "()I", "getCpuUsed", "()F", "getMemoryUsed", "getCpuCoreId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DeviceCpuData {
    private final int cpuCoreId;
    private final float cpuUsed;
    private final float memoryUsed;
    private final int type;

    public static /* synthetic */ DeviceCpuData copy$default(DeviceCpuData deviceCpuData, int i, float f, float f2, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = deviceCpuData.type;
        }
        if ((i3 & 2) != 0) {
            f = deviceCpuData.cpuUsed;
        }
        if ((i3 & 4) != 0) {
            f2 = deviceCpuData.memoryUsed;
        }
        if ((i3 & 8) != 0) {
            i2 = deviceCpuData.cpuCoreId;
        }
        return deviceCpuData.copy(i, f, f2, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final float getCpuUsed() {
        return this.cpuUsed;
    }

    /* renamed from: component3, reason: from getter */
    public final float getMemoryUsed() {
        return this.memoryUsed;
    }

    /* renamed from: component4, reason: from getter */
    public final int getCpuCoreId() {
        return this.cpuCoreId;
    }

    public final DeviceCpuData copy(int type, float cpuUsed, float memoryUsed, int cpuCoreId) {
        return new DeviceCpuData(type, cpuUsed, memoryUsed, cpuCoreId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceCpuData)) {
            return false;
        }
        DeviceCpuData deviceCpuData = (DeviceCpuData) other;
        return this.type == deviceCpuData.type && Float.compare(this.cpuUsed, deviceCpuData.cpuUsed) == 0 && Float.compare(this.memoryUsed, deviceCpuData.memoryUsed) == 0 && this.cpuCoreId == deviceCpuData.cpuCoreId;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.type) * 31) + Float.hashCode(this.cpuUsed)) * 31) + Float.hashCode(this.memoryUsed)) * 31) + Integer.hashCode(this.cpuCoreId);
    }

    public String toString() {
        return "DeviceCpuData(type=" + this.type + ", cpuUsed=" + this.cpuUsed + ", memoryUsed=" + this.memoryUsed + ", cpuCoreId=" + this.cpuCoreId + Separators.RPAREN;
    }

    public DeviceCpuData(int i, float f, float f2, int i2) {
        this.type = i;
        this.cpuUsed = f;
        this.memoryUsed = f2;
        this.cpuCoreId = i2;
    }

    public final int getType() {
        return this.type;
    }

    public final float getCpuUsed() {
        return this.cpuUsed;
    }

    public final float getMemoryUsed() {
        return this.memoryUsed;
    }

    public final int getCpuCoreId() {
        return this.cpuCoreId;
    }
}
