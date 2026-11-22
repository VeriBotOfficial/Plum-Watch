package com.wakeup.feature.health.dashboard;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HdScenes.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/wakeup/feature/health/dashboard/HdDim;", "", "icon", "", "nameRes", "", "weight", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getIcon", "()Ljava/lang/String;", "getNameRes", "()I", "getWeight", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "feature-health_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HdDim {
    public static final int $stable = 0;
    private final String icon;
    private final int nameRes;
    private final String weight;

    public static /* synthetic */ HdDim copy$default(HdDim hdDim, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = hdDim.icon;
        }
        if ((i2 & 2) != 0) {
            i = hdDim.nameRes;
        }
        if ((i2 & 4) != 0) {
            str2 = hdDim.weight;
        }
        return hdDim.copy(str, i, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component2, reason: from getter */
    public final int getNameRes() {
        return this.nameRes;
    }

    /* renamed from: component3, reason: from getter */
    public final String getWeight() {
        return this.weight;
    }

    public final HdDim copy(String icon, int nameRes, String weight) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(weight, "weight");
        return new HdDim(icon, nameRes, weight);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HdDim)) {
            return false;
        }
        HdDim hdDim = (HdDim) other;
        return Intrinsics.areEqual(this.icon, hdDim.icon) && this.nameRes == hdDim.nameRes && Intrinsics.areEqual(this.weight, hdDim.weight);
    }

    public int hashCode() {
        return (((this.icon.hashCode() * 31) + Integer.hashCode(this.nameRes)) * 31) + this.weight.hashCode();
    }

    public String toString() {
        return "HdDim(icon=" + this.icon + ", nameRes=" + this.nameRes + ", weight=" + this.weight + Separators.RPAREN;
    }

    public HdDim(String icon, int i, String weight) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(weight, "weight");
        this.icon = icon;
        this.nameRes = i;
        this.weight = weight;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final int getNameRes() {
        return this.nameRes;
    }

    public final String getWeight() {
        return this.weight;
    }
}
