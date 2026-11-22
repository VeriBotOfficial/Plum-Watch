package com.wakeup.commonui.chart.renderer;

import com.github.mikephil.charting.buffer.BarBuffer;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;

/* loaded from: classes2.dex */
public class RoundBarBuffer extends BarBuffer {
    public RoundBarBuffer(int i, int i2, boolean z) {
        super(i, i2, z);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.buffer.BarBuffer, com.github.mikephil.charting.buffer.AbstractBuffer
    public void feed(IBarDataSet iBarDataSet) {
        float entryCount = iBarDataSet.getEntryCount() * this.phaseX;
        float f = this.mBarWidth / 2.0f;
        for (int i = 0; i < entryCount; i++) {
            BarEntry barEntry = (BarEntry) iBarDataSet.getEntryForIndex(i);
            if (barEntry != null) {
                float x = barEntry.getX();
                float[] yVals = barEntry.getYVals();
                if (yVals != null) {
                    float f2 = x - f;
                    float f3 = x + f;
                    float f4 = Float.MIN_VALUE;
                    float f5 = Float.MAX_VALUE;
                    for (float f6 : yVals) {
                        f4 = Math.max(f6, f4);
                        f5 = Math.min(f6, f5);
                    }
                    if (f4 > 0.0f) {
                        f4 *= this.phaseY;
                    } else {
                        f5 *= this.phaseY;
                    }
                    addBar(f2, f4, f3, f5);
                }
            }
        }
        reset();
    }
}
