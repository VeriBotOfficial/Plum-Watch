package com.baidu.ar.marker.model;

import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes12.dex */
public class Segments {

    /* renamed from: a, reason: collision with root package name */
    public Existance f7088a;
    public int b;
    public List<double[]> c;

    public Existance getExistance() {
        return this.f7088a;
    }

    public List<double[]> getPoints() {
        return this.c;
    }

    public int getPointsCount() {
        return this.b;
    }

    public void setExistance(Existance existance) {
        this.f7088a = existance;
    }

    public void setPoints(List<double[]> list) {
        this.c = list;
    }

    public void setPointsCount(int i) {
        this.b = i;
    }

    public String toString() {
        return "Segments{existance=" + this.f7088a.toString() + ", pointsCount=" + this.b + ", points=" + this.c + AbstractJsonLexerKt.END_OBJ;
    }
}
