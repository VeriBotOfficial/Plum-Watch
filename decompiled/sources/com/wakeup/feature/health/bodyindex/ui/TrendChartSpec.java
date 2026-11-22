package com.wakeup.feature.health.bodyindex.ui;

import android.gov.nist.core.Separators;
import androidx.compose.ui.graphics.Color;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BodyIndexCommon.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\t0\t\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010\u0014J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003J\u0015\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\t0\tHÆ\u0003J\t\u0010$\u001a\u00020\rHÆ\u0003J\t\u0010%\u001a\u00020\rHÆ\u0003Jh\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\t0\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0013\u0010)\u001a\u00020\r2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\t0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001c¨\u0006."}, d2 = {"Lcom/wakeup/feature/health/bodyindex/ui/TrendChartSpec;", "", "title", "", "accent", "Landroidx/compose/ui/graphics/Color;", "style", "Lcom/wakeup/feature/health/bodyindex/ui/ChartStyle;", "yLabels", "", "pointsByPeriod", "Lcom/wakeup/feature/health/bodyindex/ui/TrendPoint;", "solidGrid", "", "tableGrid", "<init>", "(Ljava/lang/String;JLcom/wakeup/feature/health/bodyindex/ui/ChartStyle;Ljava/util/List;Ljava/util/List;ZZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getTitle", "()Ljava/lang/String;", "getAccent-0d7_KjU", "()J", "J", "getStyle", "()Lcom/wakeup/feature/health/bodyindex/ui/ChartStyle;", "getYLabels", "()Ljava/util/List;", "getPointsByPeriod", "getSolidGrid", "()Z", "getTableGrid", "component1", "component2", "component2-0d7_KjU", "component3", "component4", "component5", "component6", "component7", "copy", "copy-sW7UJKQ", "(Ljava/lang/String;JLcom/wakeup/feature/health/bodyindex/ui/ChartStyle;Ljava/util/List;Ljava/util/List;ZZ)Lcom/wakeup/feature/health/bodyindex/ui/TrendChartSpec;", "equals", "other", "hashCode", "", "toString", "feature-health_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TrendChartSpec {
    public static final int $stable = 8;
    private final long accent;
    private final List<List<TrendPoint>> pointsByPeriod;
    private final boolean solidGrid;
    private final ChartStyle style;
    private final boolean tableGrid;
    private final String title;
    private final List<String> yLabels;

    public /* synthetic */ TrendChartSpec(String str, long j, ChartStyle chartStyle, List list, List list2, boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, chartStyle, list, list2, z, z2);
    }

    /* renamed from: copy-sW7UJKQ$default, reason: not valid java name */
    public static /* synthetic */ TrendChartSpec m9489copysW7UJKQ$default(TrendChartSpec trendChartSpec, String str, long j, ChartStyle chartStyle, List list, List list2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = trendChartSpec.title;
        }
        if ((i & 2) != 0) {
            j = trendChartSpec.accent;
        }
        if ((i & 4) != 0) {
            chartStyle = trendChartSpec.style;
        }
        if ((i & 8) != 0) {
            list = trendChartSpec.yLabels;
        }
        if ((i & 16) != 0) {
            list2 = trendChartSpec.pointsByPeriod;
        }
        if ((i & 32) != 0) {
            z = trendChartSpec.solidGrid;
        }
        if ((i & 64) != 0) {
            z2 = trendChartSpec.tableGrid;
        }
        boolean z3 = z2;
        List list3 = list2;
        ChartStyle chartStyle2 = chartStyle;
        return trendChartSpec.m9491copysW7UJKQ(str, j, chartStyle2, list, list3, z, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
    public final long getAccent() {
        return this.accent;
    }

    /* renamed from: component3, reason: from getter */
    public final ChartStyle getStyle() {
        return this.style;
    }

    public final List<String> component4() {
        return this.yLabels;
    }

    public final List<List<TrendPoint>> component5() {
        return this.pointsByPeriod;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getSolidGrid() {
        return this.solidGrid;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getTableGrid() {
        return this.tableGrid;
    }

    /* renamed from: copy-sW7UJKQ, reason: not valid java name */
    public final TrendChartSpec m9491copysW7UJKQ(String title, long accent, ChartStyle style, List<String> yLabels, List<? extends List<TrendPoint>> pointsByPeriod, boolean solidGrid, boolean tableGrid) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(yLabels, "yLabels");
        Intrinsics.checkNotNullParameter(pointsByPeriod, "pointsByPeriod");
        return new TrendChartSpec(title, accent, style, yLabels, pointsByPeriod, solidGrid, tableGrid, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrendChartSpec)) {
            return false;
        }
        TrendChartSpec trendChartSpec = (TrendChartSpec) other;
        return Intrinsics.areEqual(this.title, trendChartSpec.title) && Color.m3733equalsimpl0(this.accent, trendChartSpec.accent) && this.style == trendChartSpec.style && Intrinsics.areEqual(this.yLabels, trendChartSpec.yLabels) && Intrinsics.areEqual(this.pointsByPeriod, trendChartSpec.pointsByPeriod) && this.solidGrid == trendChartSpec.solidGrid && this.tableGrid == trendChartSpec.tableGrid;
    }

    public int hashCode() {
        return (((((((((((this.title.hashCode() * 31) + Color.m3739hashCodeimpl(this.accent)) * 31) + this.style.hashCode()) * 31) + this.yLabels.hashCode()) * 31) + this.pointsByPeriod.hashCode()) * 31) + Boolean.hashCode(this.solidGrid)) * 31) + Boolean.hashCode(this.tableGrid);
    }

    public String toString() {
        return "TrendChartSpec(title=" + this.title + ", accent=" + Color.m3740toStringimpl(this.accent) + ", style=" + this.style + ", yLabels=" + this.yLabels + ", pointsByPeriod=" + this.pointsByPeriod + ", solidGrid=" + this.solidGrid + ", tableGrid=" + this.tableGrid + Separators.RPAREN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TrendChartSpec(String title, long j, ChartStyle style, List<String> yLabels, List<? extends List<TrendPoint>> pointsByPeriod, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(yLabels, "yLabels");
        Intrinsics.checkNotNullParameter(pointsByPeriod, "pointsByPeriod");
        this.title = title;
        this.accent = j;
        this.style = style;
        this.yLabels = yLabels;
        this.pointsByPeriod = pointsByPeriod;
        this.solidGrid = z;
        this.tableGrid = z2;
    }

    public /* synthetic */ TrendChartSpec(String str, long j, ChartStyle chartStyle, List list, List list2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, chartStyle, list, list2, (i & 32) != 0 ? false : z, (i & 64) != 0 ? false : z2, null);
    }

    public final String getTitle() {
        return this.title;
    }

    /* renamed from: getAccent-0d7_KjU, reason: not valid java name */
    public final long m9492getAccent0d7_KjU() {
        return this.accent;
    }

    public final ChartStyle getStyle() {
        return this.style;
    }

    public final List<String> getYLabels() {
        return this.yLabels;
    }

    public final List<List<TrendPoint>> getPointsByPeriod() {
        return this.pointsByPeriod;
    }

    public final boolean getSolidGrid() {
        return this.solidGrid;
    }

    public final boolean getTableGrid() {
        return this.tableGrid;
    }
}
