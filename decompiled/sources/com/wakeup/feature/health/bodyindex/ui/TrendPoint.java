package com.wakeup.feature.health.bodyindex.ui;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BodyIndexCommon.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\u001f"}, d2 = {"Lcom/wakeup/feature/health/bodyindex/ui/TrendPoint;", "", "label", "", "value", "", "display", "hasValue", "", "subLabel", "<init>", "(Ljava/lang/String;FLjava/lang/String;ZLjava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "getValue", "()F", "getDisplay", "getHasValue", "()Z", "getSubLabel", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "feature-health_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TrendPoint {
    public static final int $stable = 0;
    private final String display;
    private final boolean hasValue;
    private final String label;
    private final String subLabel;
    private final float value;

    public static /* synthetic */ TrendPoint copy$default(TrendPoint trendPoint, String str, float f, String str2, boolean z, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = trendPoint.label;
        }
        if ((i & 2) != 0) {
            f = trendPoint.value;
        }
        if ((i & 4) != 0) {
            str2 = trendPoint.display;
        }
        if ((i & 8) != 0) {
            z = trendPoint.hasValue;
        }
        if ((i & 16) != 0) {
            str3 = trendPoint.subLabel;
        }
        String str4 = str3;
        String str5 = str2;
        return trendPoint.copy(str, f, str5, z, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component2, reason: from getter */
    public final float getValue() {
        return this.value;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDisplay() {
        return this.display;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getHasValue() {
        return this.hasValue;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSubLabel() {
        return this.subLabel;
    }

    public final TrendPoint copy(String label, float value, String display, boolean hasValue, String subLabel) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(display, "display");
        Intrinsics.checkNotNullParameter(subLabel, "subLabel");
        return new TrendPoint(label, value, display, hasValue, subLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrendPoint)) {
            return false;
        }
        TrendPoint trendPoint = (TrendPoint) other;
        return Intrinsics.areEqual(this.label, trendPoint.label) && Float.compare(this.value, trendPoint.value) == 0 && Intrinsics.areEqual(this.display, trendPoint.display) && this.hasValue == trendPoint.hasValue && Intrinsics.areEqual(this.subLabel, trendPoint.subLabel);
    }

    public int hashCode() {
        return (((((((this.label.hashCode() * 31) + Float.hashCode(this.value)) * 31) + this.display.hashCode()) * 31) + Boolean.hashCode(this.hasValue)) * 31) + this.subLabel.hashCode();
    }

    public String toString() {
        return "TrendPoint(label=" + this.label + ", value=" + this.value + ", display=" + this.display + ", hasValue=" + this.hasValue + ", subLabel=" + this.subLabel + Separators.RPAREN;
    }

    public TrendPoint(String label, float f, String display, boolean z, String subLabel) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(display, "display");
        Intrinsics.checkNotNullParameter(subLabel, "subLabel");
        this.label = label;
        this.value = f;
        this.display = display;
        this.hasValue = z;
        this.subLabel = subLabel;
    }

    public final String getLabel() {
        return this.label;
    }

    public final float getValue() {
        return this.value;
    }

    public /* synthetic */ TrendPoint(String str, float f, String str2, boolean z, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, f, (i & 4) != 0 ? String.valueOf((int) f) : str2, (i & 8) != 0 ? true : z, (i & 16) != 0 ? "" : str3);
    }

    public final String getDisplay() {
        return this.display;
    }

    public final boolean getHasValue() {
        return this.hasValue;
    }

    public final String getSubLabel() {
        return this.subLabel;
    }
}
