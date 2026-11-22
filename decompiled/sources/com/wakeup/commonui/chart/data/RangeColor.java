package com.wakeup.commonui.chart.data;

/* loaded from: classes2.dex */
public class RangeColor {
    private final int color;
    private final int highlightColor;
    private float max;
    private float maxY;
    private float min;
    private float minY;

    public RangeColor(float f, float f2, int i, int i2) {
        this.min = f;
        this.max = f2;
        this.color = i;
        this.highlightColor = i2;
    }

    public void setMin(float f) {
        this.min = f;
    }

    public float getMin() {
        return this.min;
    }

    public void setMax(float f) {
        this.max = f;
    }

    public float getMax() {
        return this.max;
    }

    public int getColor() {
        return this.color;
    }

    public int getHighlightColor() {
        return this.highlightColor;
    }

    public void setMinY(float f) {
        this.minY = f;
    }

    public void setMaxY(float f) {
        this.maxY = f;
    }

    public float getMaxY() {
        return this.maxY;
    }

    public float getMinY() {
        return this.minY;
    }
}
