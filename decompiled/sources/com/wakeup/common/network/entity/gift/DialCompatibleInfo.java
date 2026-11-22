package com.wakeup.common.network.entity.gift;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: GiftModels.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/wakeup/common/network/entity/gift/DialCompatibleInfo;", "", "compatible", "", "<init>", "(Z)V", "getCompatible", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DialCompatibleInfo {
    private final boolean compatible;

    public DialCompatibleInfo() {
        this(false, 1, null);
    }

    public static /* synthetic */ DialCompatibleInfo copy$default(DialCompatibleInfo dialCompatibleInfo, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = dialCompatibleInfo.compatible;
        }
        return dialCompatibleInfo.copy(z);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getCompatible() {
        return this.compatible;
    }

    public final DialCompatibleInfo copy(boolean compatible) {
        return new DialCompatibleInfo(compatible);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DialCompatibleInfo) && this.compatible == ((DialCompatibleInfo) other).compatible;
    }

    public int hashCode() {
        return Boolean.hashCode(this.compatible);
    }

    public String toString() {
        return "DialCompatibleInfo(compatible=" + this.compatible + Separators.RPAREN;
    }

    public DialCompatibleInfo(boolean z) {
        this.compatible = z;
    }

    public /* synthetic */ DialCompatibleInfo(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public final boolean getCompatible() {
        return this.compatible;
    }
}
