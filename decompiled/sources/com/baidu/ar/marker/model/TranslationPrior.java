package com.baidu.ar.marker.model;

import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes12.dex */
public class TranslationPrior {

    /* renamed from: a, reason: collision with root package name */
    public String f7089a;
    public int b;
    public String c;
    public float[] d;
    public float e;
    public float f;
    public long g;

    public TranslationPrior() {
        this.e = 1.0f;
        this.f = 1.0f;
    }

    public TranslationPrior(TranslationPrior translationPrior) {
        this.e = 1.0f;
        this.f = 1.0f;
        if (translationPrior == null) {
            return;
        }
        this.f7089a = translationPrior.getFloorID();
        this.b = translationPrior.getType();
        this.c = translationPrior.getBuildingId();
        this.d = Arrays.copyOf(translationPrior.getCoordinate(), translationPrior.getCoordinate().length);
        this.e = translationPrior.getPrecision();
        this.f = translationPrior.getConfidence();
        this.g = translationPrior.getTime();
    }

    public String getBuildingId() {
        return this.c;
    }

    public float getConfidence() {
        return this.f;
    }

    public float[] getCoordinate() {
        return this.d;
    }

    public String getFloorID() {
        return this.f7089a;
    }

    public float getPrecision() {
        return this.e;
    }

    public long getTime() {
        return this.g;
    }

    public int getType() {
        return this.b;
    }

    public void setBuildingId(String str) {
        this.c = str;
    }

    public void setConfidence(float f) {
        this.f = f;
    }

    public void setCoordinate(float[] fArr) {
        this.d = fArr;
    }

    public void setFloorID(String str) {
        this.f7089a = str;
    }

    public void setPrecision(float f) {
        this.e = f;
    }

    public void setTime(long j) {
        this.g = j;
    }

    public void setType(int i) {
        this.b = i;
    }

    public String toString() {
        return "TranslationPrior{type=" + this.b + ", floor_id='" + this.f7089a + "', building_id='" + this.c + "', prior=" + Arrays.toString(this.d) + ", prior_accuracy=" + this.e + ", prior_confidence=" + this.f + AbstractJsonLexerKt.END_OBJ;
    }
}
