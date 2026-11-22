package com.wakeup.commponent.module.ble;

import android.gov.nist.core.Separators;
import io.nats.client.support.ApiConstants;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BleOrderModel.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\tHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0010R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, d2 = {"Lcom/wakeup/commponent/module/ble/BleOrderModel;", "", "type", "", ApiConstants.BYTES, "", "isSplit", "", "splitNum", "", "<init>", "(Ljava/lang/String;[BZI)V", "getType", "()Ljava/lang/String;", "getBytes", "()[B", "()Z", "getSplitNum", "()I", "setSplitNum", "(I)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BleOrderModel {
    private final byte[] bytes;
    private final boolean isSplit;
    private int splitNum;
    private final String type;

    public static /* synthetic */ BleOrderModel copy$default(BleOrderModel bleOrderModel, String str, byte[] bArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = bleOrderModel.type;
        }
        if ((i2 & 2) != 0) {
            bArr = bleOrderModel.bytes;
        }
        if ((i2 & 4) != 0) {
            z = bleOrderModel.isSplit;
        }
        if ((i2 & 8) != 0) {
            i = bleOrderModel.splitNum;
        }
        return bleOrderModel.copy(str, bArr, z, i);
    }

    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final byte[] getBytes() {
        return this.bytes;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsSplit() {
        return this.isSplit;
    }

    /* renamed from: component4, reason: from getter */
    public final int getSplitNum() {
        return this.splitNum;
    }

    public final BleOrderModel copy(String type, byte[] bytes, boolean isSplit, int splitNum) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return new BleOrderModel(type, bytes, isSplit, splitNum);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BleOrderModel)) {
            return false;
        }
        BleOrderModel bleOrderModel = (BleOrderModel) other;
        return Intrinsics.areEqual(this.type, bleOrderModel.type) && Intrinsics.areEqual(this.bytes, bleOrderModel.bytes) && this.isSplit == bleOrderModel.isSplit && this.splitNum == bleOrderModel.splitNum;
    }

    public int hashCode() {
        return (((((this.type.hashCode() * 31) + Arrays.hashCode(this.bytes)) * 31) + Boolean.hashCode(this.isSplit)) * 31) + Integer.hashCode(this.splitNum);
    }

    public String toString() {
        return "BleOrderModel(type=" + this.type + ", bytes=" + Arrays.toString(this.bytes) + ", isSplit=" + this.isSplit + ", splitNum=" + this.splitNum + Separators.RPAREN;
    }

    public BleOrderModel(String type, byte[] bytes, boolean z, int i) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.type = type;
        this.bytes = bytes;
        this.isSplit = z;
        this.splitNum = i;
    }

    public /* synthetic */ BleOrderModel(String str, byte[] bArr, boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bArr, (i2 & 4) != 0 ? true : z, (i2 & 8) != 0 ? 0 : i);
    }

    public final String getType() {
        return this.type;
    }

    public final byte[] getBytes() {
        return this.bytes;
    }

    public final boolean isSplit() {
        return this.isSplit;
    }

    public final int getSplitNum() {
        return this.splitNum;
    }

    public final void setSplitNum(int i) {
        this.splitNum = i;
    }
}
