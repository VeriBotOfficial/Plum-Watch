package com.wakeup.feature.device.dial.bean;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DiyLocationOrder.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ:\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/wakeup/feature/device/dial/bean/DiyLocationOrder;", "", "dateX", "", "dateY", "funcX", "funcY", "<init>", "(IILjava/lang/Integer;Ljava/lang/Integer;)V", "getDateX", "()I", "getDateY", "getFuncX", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFuncY", "component1", "component2", "component3", "component4", "copy", "(IILjava/lang/Integer;Ljava/lang/Integer;)Lcom/wakeup/feature/device/dial/bean/DiyLocationOrder;", "equals", "", "other", "hashCode", "toString", "", "feature-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DiyLocationOrder {
    private final int dateX;
    private final int dateY;
    private final Integer funcX;
    private final Integer funcY;

    public static /* synthetic */ DiyLocationOrder copy$default(DiyLocationOrder diyLocationOrder, int i, int i2, Integer num, Integer num2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = diyLocationOrder.dateX;
        }
        if ((i3 & 2) != 0) {
            i2 = diyLocationOrder.dateY;
        }
        if ((i3 & 4) != 0) {
            num = diyLocationOrder.funcX;
        }
        if ((i3 & 8) != 0) {
            num2 = diyLocationOrder.funcY;
        }
        return diyLocationOrder.copy(i, i2, num, num2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getDateX() {
        return this.dateX;
    }

    /* renamed from: component2, reason: from getter */
    public final int getDateY() {
        return this.dateY;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getFuncX() {
        return this.funcX;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getFuncY() {
        return this.funcY;
    }

    public final DiyLocationOrder copy(int dateX, int dateY, Integer funcX, Integer funcY) {
        return new DiyLocationOrder(dateX, dateY, funcX, funcY);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DiyLocationOrder)) {
            return false;
        }
        DiyLocationOrder diyLocationOrder = (DiyLocationOrder) other;
        return this.dateX == diyLocationOrder.dateX && this.dateY == diyLocationOrder.dateY && Intrinsics.areEqual(this.funcX, diyLocationOrder.funcX) && Intrinsics.areEqual(this.funcY, diyLocationOrder.funcY);
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.dateX) * 31) + Integer.hashCode(this.dateY)) * 31;
        Integer num = this.funcX;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.funcY;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "DiyLocationOrder(dateX=" + this.dateX + ", dateY=" + this.dateY + ", funcX=" + this.funcX + ", funcY=" + this.funcY + Separators.RPAREN;
    }

    public DiyLocationOrder(int i, int i2, Integer num, Integer num2) {
        this.dateX = i;
        this.dateY = i2;
        this.funcX = num;
        this.funcY = num2;
    }

    public final int getDateX() {
        return this.dateX;
    }

    public final int getDateY() {
        return this.dateY;
    }

    public final Integer getFuncX() {
        return this.funcX;
    }

    public final Integer getFuncY() {
        return this.funcY;
    }
}
