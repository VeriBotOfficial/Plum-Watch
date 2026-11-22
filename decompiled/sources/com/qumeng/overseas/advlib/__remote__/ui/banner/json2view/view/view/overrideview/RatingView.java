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

/* loaded from: classes17.dex */
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
        float[][] prepareData = prepareData(rect.width() / 2);
        this.path.moveTo(prepareData[0][1] + rect.centerX(), rect.centerY() - prepareData[0][0]);
        for (int i = 1; i < prepareData.length; i++) {
            this.path.lineTo(prepareData[i][1] + rect.centerX(), rect.centerY() - prepareData[i][0]);
        }
        this.path.close();
        this.paint.setShader(new LinearGradient(rect.left, rect.bottom, ((rect.right + r0) * 2) / 3, rect.centerY(), this.startColor, this.endColor, Shader.TileMode.CLAMP));
        canvas.drawPath(this.path, this.paint);
    }

    private float[] getInsideXY(int i, int i2) {
        double sin = (float) ((i2 * Math.sin(Math.toRadians(18.0d))) / Math.sin(Math.toRadians(36.0d)));
        double d = (i * 72) + 36;
        return new float[]{(float) (Math.cos(Math.toRadians(d)) * sin), (float) (sin * Math.sin(Math.toRadians(d)))};
    }

    private float[] getOutsideXY(int i, int i2) {
        double d = i2;
        double d2 = i * 72;
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

    private float[][] prepareData(int i) {
        float[][] fArr = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 10, 2);
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = i2 * 2;
            fArr[i3] = getOutsideXY(i2, i);
            fArr[i3 + 1] = getInsideXY(i2, i);
        }
        return fArr;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        int height = ((getHeight() - getPaddingTop()) - getPaddingBottom()) - 3;
        for (int i = 0; i < 5; i++) {
            if (i < this.grade) {
                this.paint.setStyle(Paint.Style.FILL);
            } else {
                this.paint.setStyle(Paint.Style.STROKE);
            }
            drawStar2(canvas, new Rect(getPaddingLeft(), getPaddingTop() + 3, getPaddingLeft() + height, getPaddingTop() + 3 + height));
            canvas.translate((getPaddingLeft() * 2) + height, 0.0f);
        }
        canvas.restore();
    }

    public void setEndColor(int i) {
        this.endColor = i;
    }

    public void setGrade(float f) {
        this.grade = f;
    }

    public void setStartColor(int i) {
        this.startColor = i;
    }

    public void setStrokeWidth(int i) {
        this.strokeWidth = i;
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
