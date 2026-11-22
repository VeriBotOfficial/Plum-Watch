package com.wakeup.feature.sport.bean;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: TrailLineBean.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/wakeup/feature/sport/bean/TrailLineBean;", "", "distance", "", "isDotted", "", "<init>", "(DZ)V", "getDistance", "()D", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-sport_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TrailLineBean {
    private final double distance;
    private final boolean isDotted;

    public static /* synthetic */ TrailLineBean copy$default(TrailLineBean trailLineBean, double d, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            d = trailLineBean.distance;
        }
        if ((i & 2) != 0) {
            z = trailLineBean.isDotted;
        }
        return trailLineBean.copy(d, z);
    }

    /* renamed from: component1, reason: from getter */
    public final double getDistance() {
        return this.distance;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsDotted() {
        return this.isDotted;
    }

    public final TrailLineBean copy(double distance, boolean isDotted) {
        return new TrailLineBean(distance, isDotted);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrailLineBean)) {
            return false;
        }
        TrailLineBean trailLineBean = (TrailLineBean) other;
        return Double.compare(this.distance, trailLineBean.distance) == 0 && this.isDotted == trailLineBean.isDotted;
    }

    public int hashCode() {
        return (Double.hashCode(this.distance) * 31) + Boolean.hashCode(this.isDotted);
    }

    public String toString() {
        return "TrailLineBean(distance=" + this.distance + ", isDotted=" + this.isDotted + Separators.RPAREN;
    }

    public TrailLineBean(double d, boolean z) {
        this.distance = d;
        this.isDotted = z;
    }

    public /* synthetic */ TrailLineBean(double d, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, (i & 2) != 0 ? false : z);
    }

    public final double getDistance() {
        return this.distance;
    }

    public final boolean isDotted() {
        return this.isDotted;
    }
}
