package com.amap.api.col.p0003sl;

/* JADX INFO: compiled from: StyleElementType.java */
/* JADX INFO: loaded from: classes7.dex */
public enum v3 {
    STYLE_ELEMENT_LABELFILL_OLD("labels.text.fill", 0),
    STYLE_ELEMENT_LABELSTROKE_OLD("labels.text.stroke", 1),
    STYLE_ELEMENT_GEOMETRYSTROKE_OLD("geometry.stroke", 2),
    STYLE_ELEMENT_GEOMETRYFILL_OLD("geometry.fill", 3),
    STYLE_ELEMENT_LABELFILL("textFillColor", 0),
    STYLE_ELEMENT_LABELSTROKE("textStrokeColor", 1),
    STYLE_ELEMENT_GEOMETRYSTROKE("strokeColor", 2),
    STYLE_ELEMENT_GEOMETRYFILL("fillColor", 3),
    STYLE_ELEMENT_GEOMETRYFILL1("color", 3),
    STYLE_ELEMENT_GEOMETRYFILL2("textureName", 3),
    STYLE_ELEMENT_BACKGROUNDFILL("backgroundColor", 4),
    STYLE_ELEMENT_VISIBLE("visible", 5);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f1908a;
    private int b;

    v3(String str, int r4) {
        this.f1908a = str;
        this.b = r4;
    }

    public static int a(String str) {
        v3[] v3VarArrValues = values();
        for (int r1 = 0; r1 < 12; r1++) {
            v3 v3Var = v3VarArrValues[r1];
            if (v3Var.f1908a.equals(str)) {
                return v3Var.b;
            }
        }
        return -1;
    }
}
