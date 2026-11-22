package com.wakeup.commonui.chart.data;

import com.github.mikephil.charting.data.BarEntry;
import java.util.List;

/* loaded from: classes2.dex */
public class BarChartData {
    private int[] colors;
    private final List<BarEntry> data;
    private int[] highlightColors;
    private final long time;

    public BarChartData(long j, List<BarEntry> list) {
        this.time = j;
        this.data = list;
    }

    public long getTime() {
        return this.time;
    }

    public List<BarEntry> getData() {
        return this.data;
    }

    public void setColors(int[] iArr) {
        this.colors = iArr;
    }

    public void setHighlightColors(int[] iArr) {
        this.highlightColors = iArr;
    }

    public int[] getColors() {
        return this.colors;
    }

    public int[] getHighlightColors() {
        return this.highlightColors;
    }
}
