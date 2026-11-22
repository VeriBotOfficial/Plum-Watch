package com.wakeup.commonui.chart.data;

/* loaded from: classes2.dex */
public class RangeFill {
    public static final int LINE_STYLE_DOTTED = 1;
    public static final int LINE_STYLE_SOLID = 0;
    private final int fillColor;
    private final int lineColor;
    private final float max;
    private final float min;
    private int lineStyle = 0;
    private String rangText = "";
    private int rangTextColor = 0;
    private boolean isInteger = true;

    public RangeFill(float f, float f2, int i, int i2) {
        this.min = f;
        this.max = f2;
        this.lineColor = i;
        this.fillColor = i2;
    }

    public float getMax() {
        return this.max;
    }

    public float getMin() {
        return this.min;
    }

    public int getLineColor() {
        return this.lineColor;
    }

    public int getFillColor() {
        return this.fillColor;
    }

    public void setLineStyle(int i) {
        this.lineStyle = i;
    }

    public int getLineStyle() {
        return this.lineStyle;
    }

    public boolean isInteger() {
        return this.isInteger;
    }

    public void setInteger(boolean z) {
        this.isInteger = z;
    }

    public String getRangText() {
        return this.rangText;
    }

    public void setRangText(String str) {
        this.rangText = str;
    }

    public int getRangTextColor() {
        return this.rangTextColor;
    }

    public void setRangTextColor(int i) {
        this.rangTextColor = i;
    }
}
