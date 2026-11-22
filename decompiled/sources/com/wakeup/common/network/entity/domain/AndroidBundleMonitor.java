package com.wakeup.common.network.entity.domain;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: DomainConfig.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/wakeup/common/network/entity/domain/AndroidBundleMonitor;", "", "enable", "", "totalSize", "", "isClearAll", "<init>", "(ZIZ)V", "getEnable", "()Z", "getTotalSize", "()I", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AndroidBundleMonitor {
    private final boolean enable;
    private final boolean isClearAll;
    private final int totalSize;

    public AndroidBundleMonitor() {
        this(false, 0, false, 7, null);
    }

    public static /* synthetic */ AndroidBundleMonitor copy$default(AndroidBundleMonitor androidBundleMonitor, boolean z, int i, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = androidBundleMonitor.enable;
        }
        if ((i2 & 2) != 0) {
            i = androidBundleMonitor.totalSize;
        }
        if ((i2 & 4) != 0) {
            z2 = androidBundleMonitor.isClearAll;
        }
        return androidBundleMonitor.copy(z, i, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTotalSize() {
        return this.totalSize;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsClearAll() {
        return this.isClearAll;
    }

    public final AndroidBundleMonitor copy(boolean enable, int totalSize, boolean isClearAll) {
        return new AndroidBundleMonitor(enable, totalSize, isClearAll);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AndroidBundleMonitor)) {
            return false;
        }
        AndroidBundleMonitor androidBundleMonitor = (AndroidBundleMonitor) other;
        return this.enable == androidBundleMonitor.enable && this.totalSize == androidBundleMonitor.totalSize && this.isClearAll == androidBundleMonitor.isClearAll;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.enable) * 31) + Integer.hashCode(this.totalSize)) * 31) + Boolean.hashCode(this.isClearAll);
    }

    public String toString() {
        return "AndroidBundleMonitor(enable=" + this.enable + ", totalSize=" + this.totalSize + ", isClearAll=" + this.isClearAll + Separators.RPAREN;
    }

    public AndroidBundleMonitor(boolean z, int i, boolean z2) {
        this.enable = z;
        this.totalSize = i;
        this.isClearAll = z2;
    }

    public /* synthetic */ AndroidBundleMonitor(boolean z, int i, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? true : z2);
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final int getTotalSize() {
        return this.totalSize;
    }

    public final boolean isClearAll() {
        return this.isClearAll;
    }
}
