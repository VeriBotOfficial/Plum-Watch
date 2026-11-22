package com.wakeup.commonui.chart.data;

/* loaded from: classes2.dex */
public class ScaleLabel {
    private boolean isDrawText;
    private final float value;

    public ScaleLabel(float f) {
        this.isDrawText = true;
        this.value = f;
    }

    public ScaleLabel(float f, boolean z) {
        this.value = f;
        this.isDrawText = z;
    }

    public float getValue() {
        return this.value;
    }

    public boolean isDrawText() {
        return this.isDrawText;
    }
}
