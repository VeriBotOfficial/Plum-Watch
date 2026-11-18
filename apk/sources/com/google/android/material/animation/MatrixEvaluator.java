package com.google.android.material.animation;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* JADX INFO: loaded from: classes3.dex */
public class MatrixEvaluator implements TypeEvaluator<Matrix> {
    private final float[] tempStartValues = new float[9];
    private final float[] tempEndValues = new float[9];
    private final Matrix tempMatrix = new Matrix();

    @Override // android.animation.TypeEvaluator
    public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.tempStartValues);
        matrix2.getValues(this.tempEndValues);
        for (int r4 = 0; r4 < 9; r4++) {
            float[] fArr = this.tempEndValues;
            float f2 = fArr[r4];
            float f3 = this.tempStartValues[r4];
            fArr[r4] = f3 + ((f2 - f3) * f);
        }
        this.tempMatrix.setValues(this.tempEndValues);
        return this.tempMatrix;
    }
}
