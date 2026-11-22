package com.amap.api.col.p0003sl;

/* compiled from: StyleElementType.java */
/* loaded from: classes11.dex */
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


    /* renamed from: a, reason: collision with root package name */
    private String f1908a;
    private int b;

    v3(String str, int i) {
        this.f1908a = str;
        this.b = i;
    }

    public static int a(String str) {
        v3[] values = values();
        for (int i = 0; i < 12; i++) {
            v3 v3Var = values[i];
            if (v3Var.f1908a.equals(str)) {
                return v3Var.b;
            }
        }
        return -1;
    }
}
