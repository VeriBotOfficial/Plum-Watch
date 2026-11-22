package com.wakeup.howear.view.newui.view;

import android.content.Context;
import android.util.AttributeSet;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.wakeup.commonui.chart.BaseBarChart;
import com.wakeup.commonui.chart.data.BarChartData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BarChartView.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B)\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\fH\u0016J\b\u0010\u0013\u001a\u00020\u0011H\u0002J\b\u0010\u0014\u001a\u00020\u0011H\u0002J\u000e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0007J\b\u0010\u0017\u001a\u0004\u0018\u00010\fJ\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u0016\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0007J\u0016\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0007R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/wakeup/howear/view/newui/view/BarChartView;", "Lcom/wakeup/commonui/chart/BaseBarChart;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mBarColor", "barChartData", "Lcom/wakeup/commonui/chart/data/BarChartData;", "yAxisMin", "", "yAxisMax", "setData", "", "data", "initBarWidth", "initRange", "setBarColor", "color", "getBarChartData", "createXScaleData", "Lcom/github/mikephil/charting/data/BarDataSet;", "dip2px", "dpValue", "px2dip", "pxValue", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BarChartView extends BaseBarChart {
    private BarChartData barChartData;
    private int mBarColor;
    private float yAxisMax;
    private float yAxisMin;

    public BarChartView(Context context) {
        this(context, null, 0, 6, null);
    }

    public BarChartView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ BarChartView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? -1 : i);
    }

    public BarChartView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.yAxisMax = 100.0f;
        initRange();
        initBarWidth();
    }

    @Override // com.wakeup.commonui.chart.BaseBarChart
    public void setData(BarChartData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.barChartData = data;
        this.mTime = data.getTime();
        this.mBarData.getDataSets().clear();
        this.mBarData.addDataSet(createXScaleData());
        List<BarEntry> data2 = data.getData();
        if (data2 != null && data2.size() > 0) {
            BarDataSet barDataSet = new BarDataSet(data2, "");
            int i = this.mBarColor;
            if (i != 0) {
                barDataSet.setColor(i);
            }
            this.mBarDataSet = barDataSet;
            this.mBarData.addDataSet(this.mBarDataSet);
        }
        if (data.getColors() != null && data.getColors().length > 0 && this.mBarDataSet != null) {
            BarDataSet barDataSet2 = this.mBarDataSet;
            int[] colors = data.getColors();
            barDataSet2.setColors(Arrays.copyOf(colors, colors.length));
        }
        this.mBarData.setDrawValues(false);
        setData((BarChartView) this.mBarData);
        invalidate();
    }

    private final void initBarWidth() {
        this.mBarData.setBarWidth(0.7f);
    }

    private final void initRange() {
        XAxis xAxis = getXAxis();
        xAxis.setAxisMinimum(-0.5f);
        xAxis.setAxisMaximum(24.5f);
    }

    public final void setBarColor(int color) {
        this.mBarColor = color;
    }

    public final BarChartData getBarChartData() {
        return this.barChartData;
    }

    private final BarDataSet createXScaleData() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            arrayList.add(new BarEntry(i, 0.0f));
            if (i == 23) {
                BarDataSet barDataSet = new BarDataSet(arrayList, "");
                barDataSet.setDrawIcons(false);
                barDataSet.setColor(this.mBarColor);
                return barDataSet;
            }
            i++;
        }
    }

    public final float dip2px(Context context, int dpValue) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (dpValue * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    public final float px2dip(Context context, int pxValue) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (pxValue / context.getResources().getDisplayMetrics().density) + 0.5f;
    }
}
