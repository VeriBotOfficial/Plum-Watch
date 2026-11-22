package com.wakeup.commonui.chart;

import android.graphics.Path;

/* loaded from: classes2.dex */
public class SleepPath {
    private final SleepChart mChart;

    public SleepPath(SleepChart sleepChart) {
        this.mChart = sleepChart;
    }

    public Path getUpLowPath(float f, float f2, float f3) {
        Path path = new Path();
        path.moveTo(f, f3 - this.mChart.sleepDrawRadius);
        path.lineTo(this.mChart.sleepDrawRadius + f, f3);
        float f4 = f2 + f;
        path.lineTo(f4 - this.mChart.sleepDrawRadius, f3);
        path.lineTo(f4, this.mChart.sleepDrawRadius + f3);
        path.lineTo(f4, this.mChart.sleepRectHeight + f3 + this.mChart.sleepDrawRadius);
        path.lineTo(f4 - this.mChart.sleepDrawRadius, this.mChart.sleepRectHeight + f3);
        path.lineTo(this.mChart.sleepDrawRadius + f, this.mChart.sleepRectHeight + f3);
        path.lineTo(f, (f3 + this.mChart.sleepRectHeight) - this.mChart.sleepDrawRadius);
        path.close();
        return path;
    }

    public Path getLowUpPath(float f, float f2, float f3) {
        Path path = new Path();
        path.moveTo(f, this.mChart.sleepDrawRadius + f3);
        path.lineTo(this.mChart.sleepDrawRadius + f, f3);
        float f4 = f2 + f;
        path.lineTo(f4 - this.mChart.sleepDrawRadius, f3);
        path.lineTo(f4, f3 - this.mChart.sleepDrawRadius);
        path.lineTo(f4, (this.mChart.sleepRectHeight + f3) - this.mChart.sleepDrawRadius);
        path.lineTo(f4 - this.mChart.sleepDrawRadius, this.mChart.sleepRectHeight + f3);
        path.lineTo(this.mChart.sleepDrawRadius + f, this.mChart.sleepRectHeight + f3);
        path.lineTo(f, f3 + this.mChart.sleepRectHeight + this.mChart.sleepDrawRadius);
        path.close();
        return path;
    }

    public Path getConvexPath(float f, float f2, float f3) {
        Path path = new Path();
        path.moveTo(f, this.mChart.sleepDrawRadius + f3);
        path.lineTo(this.mChart.sleepDrawRadius + f, f3);
        float f4 = f2 + f;
        path.lineTo(f4 - this.mChart.sleepDrawRadius, f3);
        path.lineTo(f4, this.mChart.sleepDrawRadius + f3);
        path.lineTo(f4, this.mChart.sleepRectHeight + f3 + this.mChart.sleepDrawRadius);
        path.lineTo(f4 - this.mChart.sleepDrawRadius, this.mChart.sleepRectHeight + f3);
        path.lineTo(this.mChart.sleepDrawRadius + f, this.mChart.sleepRectHeight + f3);
        path.lineTo(f, f3 + this.mChart.sleepRectHeight + this.mChart.sleepDrawRadius);
        path.close();
        return path;
    }

    public Path getConcavePath(float f, float f2, float f3) {
        Path path = new Path();
        path.moveTo(f, (f3 - this.mChart.sleepRectHeight) - this.mChart.sleepDrawRadius);
        path.lineTo(this.mChart.sleepDrawRadius + f, f3 - this.mChart.sleepRectHeight);
        float f4 = f2 + f;
        path.lineTo(f4 - this.mChart.sleepDrawRadius, f3 - this.mChart.sleepRectHeight);
        path.lineTo(f4, (f3 - this.mChart.sleepRectHeight) - this.mChart.sleepDrawRadius);
        path.lineTo(f4, f3 - this.mChart.sleepDrawRadius);
        path.lineTo(f4 - this.mChart.sleepDrawRadius, f3);
        path.lineTo(this.mChart.sleepDrawRadius + f, f3);
        path.lineTo(f, f3 - this.mChart.sleepDrawRadius);
        path.close();
        return path;
    }
}
