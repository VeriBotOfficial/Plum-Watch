package com.wakeup.commonui.chart.data;

import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import java.util.List;

/* loaded from: classes2.dex */
public class ForeColorDataSet extends BarDataSet {
    private int foreColor;

    public ForeColorDataSet(List<BarEntry> list, String str) {
        super(list, str);
        this.foreColor = -1;
    }

    public void setForeColor(int i) {
        this.foreColor = i;
    }

    public int getForeColor() {
        return this.foreColor;
    }
}
