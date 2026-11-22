package com.wakeup.module.device.headset;

import android.gov.nist.core.Separators;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TLV.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/wakeup/module/device/headset/TLV;", "", "type", "", "len", "value", "", "<init>", "(II[B)V", "getType", "()I", "getLen", "getValue", "()[B", "getTotalLen", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "module-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TLV {
    private final int len;
    private final int type;
    private final byte[] value;

    public static /* synthetic */ TLV copy$default(TLV tlv, int i, int i2, byte[] bArr, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = tlv.type;
        }
        if ((i3 & 2) != 0) {
            i2 = tlv.len;
        }
        if ((i3 & 4) != 0) {
            bArr = tlv.value;
        }
        return tlv.copy(i, i2, bArr);
    }

    /* renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final int getLen() {
        return this.len;
    }

    /* renamed from: component3, reason: from getter */
    public final byte[] getValue() {
        return this.value;
    }

    public final TLV copy(int type, int len, byte[] value) {
        return new TLV(type, len, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TLV)) {
            return false;
        }
        TLV tlv = (TLV) other;
        return this.type == tlv.type && this.len == tlv.len && Intrinsics.areEqual(this.value, tlv.value);
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.type) * 31) + Integer.hashCode(this.len)) * 31;
        byte[] bArr = this.value;
        return hashCode + (bArr == null ? 0 : Arrays.hashCode(bArr));
    }

    public String toString() {
        return "TLV(type=" + this.type + ", len=" + this.len + ", value=" + Arrays.toString(this.value) + Separators.RPAREN;
    }

    public TLV(int i, int i2, byte[] bArr) {
        this.type = i;
        this.len = i2;
        this.value = bArr;
    }

    public /* synthetic */ TLV(int i, int i2, byte[] bArr, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? null : bArr);
    }

    public final int getLen() {
        return this.len;
    }

    public final int getType() {
        return this.type;
    }

    public final byte[] getValue() {
        return this.value;
    }

    public final int getTotalLen() {
        return this.len + 2;
    }
}
