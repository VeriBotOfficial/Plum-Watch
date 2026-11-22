package com.wakeup.feature.health.bodyindex.ui;

import android.gov.nist.core.Separators;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BodyIndexCommon.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u00020\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/wakeup/feature/health/bodyindex/ui/BodyIndexMetric;", "", "label", "", "value", "color", "Landroidx/compose/ui/graphics/Color;", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getLabel", "()Ljava/lang/String;", "getValue", "getColor-0d7_KjU", "()J", "J", "component1", "component2", "component3", "component3-0d7_KjU", "copy", "copy-mxwnekA", "(Ljava/lang/String;Ljava/lang/String;J)Lcom/wakeup/feature/health/bodyindex/ui/BodyIndexMetric;", "equals", "", "other", "hashCode", "", "toString", "feature-health_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BodyIndexMetric {
    public static final int $stable = 0;
    private final long color;
    private final String label;
    private final String value;

    public /* synthetic */ BodyIndexMetric(String str, String str2, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j);
    }

    /* renamed from: copy-mxwnekA$default, reason: not valid java name */
    public static /* synthetic */ BodyIndexMetric m9468copymxwnekA$default(BodyIndexMetric bodyIndexMetric, String str, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bodyIndexMetric.label;
        }
        if ((i & 2) != 0) {
            str2 = bodyIndexMetric.value;
        }
        if ((i & 4) != 0) {
            j = bodyIndexMetric.color;
        }
        return bodyIndexMetric.m9470copymxwnekA(str, str2, j);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
    public final long getColor() {
        return this.color;
    }

    /* renamed from: copy-mxwnekA, reason: not valid java name */
    public final BodyIndexMetric m9470copymxwnekA(String label, String value, long color) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        return new BodyIndexMetric(label, value, color, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BodyIndexMetric)) {
            return false;
        }
        BodyIndexMetric bodyIndexMetric = (BodyIndexMetric) other;
        return Intrinsics.areEqual(this.label, bodyIndexMetric.label) && Intrinsics.areEqual(this.value, bodyIndexMetric.value) && Color.m3733equalsimpl0(this.color, bodyIndexMetric.color);
    }

    public int hashCode() {
        return (((this.label.hashCode() * 31) + this.value.hashCode()) * 31) + Color.m3739hashCodeimpl(this.color);
    }

    public String toString() {
        return "BodyIndexMetric(label=" + this.label + ", value=" + this.value + ", color=" + Color.m3740toStringimpl(this.color) + Separators.RPAREN;
    }

    private BodyIndexMetric(String label, String value, long j) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        this.label = label;
        this.value = value;
        this.color = j;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getValue() {
        return this.value;
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m9471getColor0d7_KjU() {
        return this.color;
    }
}
