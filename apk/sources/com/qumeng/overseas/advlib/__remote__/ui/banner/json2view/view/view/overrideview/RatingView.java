package com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.view.overrideview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes2.dex */
public class RatingView extends View {
    private int endColor;
    private float grade;
    private Paint paint;
    private Path path;
    private int startColor;
    private int strokeWidth;

    public RatingView(Context context) {
        super(context);
        this.grade = 3.0f;
        this.strokeWidth = 3;
        this.startColor = Color.parseColor("#f9de6a");
        this.endColor = Color.parseColor("#F5cd78");
        init();
    }

    private void drawStar2(Canvas canvas, Rect rect) {
        float[][] fArrPrepareData = prepareData(rect.width() / 2);
        this.path.moveTo(fArrPrepareData[0][1] + rect.centerX(), rect.centerY() - fArrPrepareData[0][0]);
        for (int r1 = 1; r1 < fArrPrepareData.length; r1++) {
            this.path.lineTo(fArrPrepareData[r1][1] + rect.centerX(), rect.centerY() - fArrPrepareData[r1][0]);
        }
        this.path.close();
        int r2 = rect.left;
        this.paint.setShader(new LinearGradient(r2, rect.bottom, ((rect.right + r2) * 2) / 3, rect.centerY(), this.startColor, this.endColor, Shader.TileMode.CLAMP));
        canvas.drawPath(this.path, this.paint);
    }

    private float[] getInsideXY(int r5, int r6) {
        double dSin = (float) ((((double) r6) * Math.sin(Math.toRadians(18.0d))) / Math.sin(Math.toRadians(36.0d)));
        double d = (r5 * 72) + 36;
        return new float[]{(float) (Math.cos(Math.toRadians(d)) * dSin), (float) (dSin * Math.sin(Math.toRadians(d)))};
    }

    private float[] getOutsideXY(int r5, int r6) {
        double d = r6;
        double d2 = r5 * 72;
        return new float[]{(float) (Math.cos(Math.toRadians(d2)) * d), (float) (d * Math.sin(Math.toRadians(d2)))};
    }

    private void init() {
        Paint paint = new Paint();
        this.paint = paint;
        paint.setStrokeWidth(this.strokeWidth);
        this.paint.setAntiAlias(true);
        this.paint.setDither(true);
        this.paint.setStrokeJoin(Paint.Join.ROUND);
        this.paint.setStrokeCap(Paint.Cap.ROUND);
        this.path = new Path();
    }

    private float[][] prepareData(int r6) {
        float[][] fArr = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 10, 2);
        for (int r0 = 0; r0 < 5; r0++) {
            int r3 = r0 * 2;
            fArr[r3] = getOutsideXY(r0, r6);
            fArr[r3 + 1] = getInsideXY(r0, r6);
        }
        return fArr;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        int height = ((getHeight() - getPaddingTop()) - getPaddingBottom()) - 3;
        for (int r1 = 0; r1 < 5; r1++) {
            if (r1 < this.grade) {
                this.paint.setStyle(Paint.Style.FILL);
            } else {
                this.paint.setStyle(Paint.Style.STROKE);
            }
            drawStar2(canvas, new Rect(getPaddingLeft(), getPaddingTop() + 3, getPaddingLeft() + height, getPaddingTop() + 3 + height));
            canvas.translate((getPaddingLeft() * 2) + height, 0.0f);
        }
        canvas.restore();
    }

    public void setEndColor(int r1) {
        this.endColor = r1;
    }

    public void setGrade(float f) {
        this.grade = f;
    }

    public void setStartColor(int r1) {
        this.startColor = r1;
    }

    public void setStrokeWidth(int r1) {
        this.strokeWidth = r1;
    }

    public RatingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.grade = 3.0f;
        this.strokeWidth = 3;
        this.startColor = Color.parseColor("#f9de6a");
        this.endColor = Color.parseColor("#F5cd78");
        init();
    }
}
