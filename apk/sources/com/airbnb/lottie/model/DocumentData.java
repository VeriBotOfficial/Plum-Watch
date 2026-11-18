package com.airbnb.lottie.model;

/* JADX INFO: loaded from: classes7.dex */
public class DocumentData {
    public float baselineShift;
    public int color;
    public String fontName;
    public Justification justification;
    public float lineHeight;
    public float size;
    public int strokeColor;
    public boolean strokeOverFill;
    public float strokeWidth;
    public String text;
    public int tracking;

    public enum Justification {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public DocumentData(String str, String str2, float f, Justification justification, int r5, float f2, float f3, int r8, int r9, float f4, boolean z) {
        set(str, str2, f, justification, r5, f2, f3, r8, r9, f4, z);
    }

    public DocumentData() {
    }

    public void set(String str, String str2, float f, Justification justification, int r5, float f2, float f3, int r8, int r9, float f4, boolean z) {
        this.text = str;
        this.fontName = str2;
        this.size = f;
        this.justification = justification;
        this.tracking = r5;
        this.lineHeight = f2;
        this.baselineShift = f3;
        this.color = r8;
        this.strokeColor = r9;
        this.strokeWidth = f4;
        this.strokeOverFill = z;
    }

    public int hashCode() {
        int r0 = (((((int) ((((this.text.hashCode() * 31) + this.fontName.hashCode()) * 31) + this.size)) * 31) + this.justification.ordinal()) * 31) + this.tracking;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.lineHeight);
        return (((r0 * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.color;
    }
}
