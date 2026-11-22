package com.wakeup.module.device.headset;

import android.gov.nist.core.Separators;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HeadsetOrder.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/wakeup/module/device/headset/HeadsetOrder;", "", "tag", "", "data", "", "<init>", "(Ljava/lang/String;[B)V", "getTag", "()Ljava/lang/String;", "getData", "()[B", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "module-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HeadsetOrder {
    private final byte[] data;
    private final String tag;

    public static /* synthetic */ HeadsetOrder copy$default(HeadsetOrder headsetOrder, String str, byte[] bArr, int i, Object obj) {
        if ((i & 1) != 0) {
            str = headsetOrder.tag;
        }
        if ((i & 2) != 0) {
            bArr = headsetOrder.data;
        }
        return headsetOrder.copy(str, bArr);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* renamed from: component2, reason: from getter */
    public final byte[] getData() {
        return this.data;
    }

    public final HeadsetOrder copy(String tag, byte[] data) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(data, "data");
        return new HeadsetOrder(tag, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeadsetOrder)) {
            return false;
        }
        HeadsetOrder headsetOrder = (HeadsetOrder) other;
        return Intrinsics.areEqual(this.tag, headsetOrder.tag) && Intrinsics.areEqual(this.data, headsetOrder.data);
    }

    public int hashCode() {
        return (this.tag.hashCode() * 31) + Arrays.hashCode(this.data);
    }

    public String toString() {
        return "HeadsetOrder(tag=" + this.tag + ", data=" + Arrays.toString(this.data) + Separators.RPAREN;
    }

    public HeadsetOrder(String tag, byte[] data) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(data, "data");
        this.tag = tag;
        this.data = data;
    }

    public final byte[] getData() {
        return this.data;
    }

    public final String getTag() {
        return this.tag;
    }
}
