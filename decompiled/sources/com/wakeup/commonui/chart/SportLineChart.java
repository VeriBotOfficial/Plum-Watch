package com.wakeup.commonui.chart;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.utils.Transformer;
import com.wakeup.commonui.chart.renderer.SportLineRenderer;
import com.wakeup.commonui.utils.UIHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oqml.a;

/* loaded from: classes2.dex */
public class SportLineChart extends BaseLineChart {
    private final Paint mPaintText;
    private final Paint mScaleLinePaint;
    private final Paint mScaleTextPaint;
    private int mViewHeight;
    private int mViewWidth;
    private List<SportScaleLabel> mXLabels;
    private List<SportScaleLabel> mYLabels;
    private float textWidth;

    public SportLineChart(Context context) {
        this(context, null);
    }

    public SportLineChart(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public SportLineChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mYLabels = new ArrayList();
        this.mXLabels = new ArrayList();
        setRenderer(new SportLineRenderer(this, this.mAnimator, this.mViewPortHandler));
        setExtraTopOffset(20.0f);
        setExtraBottomOffset(18.0f);
        setExtraLeftOffset(30.0f);
        setExtraRightOffset(10.0f);
        Paint paint = new Paint(1);
        this.mPaintText = paint;
        paint.setColor(Color.parseColor(a.C1008a.f18760a));
        paint.setTextSize(UIHelper.dp2px(10.0f));
        paint.setStrokeWidth(1.0f);
        Paint paint2 = new Paint(1);
        this.mScaleLinePaint = paint2;
        paint2.setColor(Color.parseColor("#EEEEEE"));
        paint2.setStrokeWidth(UIHelper.dp2px(1.0f));
        Paint paint3 = new Paint(1);
        this.mScaleTextPaint = paint3;
        paint3.setColor(Color.parseColor(a.C1008a.f18760a));
        paint3.setStrokeWidth(UIHelper.dp2px(1.0f));
        paint3.setTextSize(UIHelper.dp2px(10.0f));
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart, android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.mViewWidth = i;
        this.mViewHeight = i2;
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart, android.view.View
    protected void onDraw(Canvas canvas) {
        drawYLabel(canvas);
        drawXLabel(canvas);
        super.onDraw(canvas);
    }

    private void drawXLabel(Canvas canvas) {
        getTextWidth();
        Transformer transformer = getTransformer(YAxis.AxisDependency.LEFT);
        float dp2px = this.mViewHeight - UIHelper.dp2px(8.0f);
        for (int i = 0; i < this.mXLabels.size(); i++) {
            canvas.drawText(this.mXLabels.get(i).getText(), ((float) transformer.getPixelForValues((int) r3.getValue(), 1.0f).x) - (this.textWidth / 2.0f), dp2px, this.mPaintText);
        }
    }

    private void getTextWidth() {
        Iterator<SportScaleLabel> it = this.mXLabels.iterator();
        while (it.hasNext()) {
            this.textWidth = Math.max(this.textWidth, this.mPaintText.measureText(it.next().getText()));
        }
    }

    private void drawYLabel(Canvas canvas) {
        float dp2px = UIHelper.dp2px(2.0f);
        for (SportScaleLabel sportScaleLabel : this.mYLabels) {
            float y = getY((int) sportScaleLabel.getValue());
            Canvas canvas2 = canvas;
            canvas2.drawLine(0.0f, y, this.mViewWidth, y, this.mScaleLinePaint);
            canvas2.drawText(sportScaleLabel.getText(), 0.0f, y - dp2px, this.mScaleTextPaint);
            canvas = canvas2;
        }
    }

    private float getY(float f) {
        return (float) getTransformer(YAxis.AxisDependency.LEFT).getPixelForValues(1.0f, f).y;
    }

    public void setData(List<Entry> list, int i) {
        LineDataSet lineDataSet = new LineDataSet(list, "");
        lineDataSet.setDrawCircles(false);
        lineDataSet.setLineWidth(1.0f);
        if (i != 0) {
            lineDataSet.setCircleColor(i);
            lineDataSet.setColor(i);
        }
        if (this.mFillDrawable != null) {
            lineDataSet.setDrawFilled(true);
            lineDataSet.setFillDrawable(this.mFillDrawable);
        }
        lineDataSet.setMode(LineDataSet.Mode.HORIZONTAL_BEZIER);
        this.mLineData.addDataSet(lineDataSet);
        this.mLineData.setDrawValues(false);
        setData(this.mLineData);
        invalidate();
    }

    public void setXRange(float f, float f2) {
        XAxis xAxis = getXAxis();
        xAxis.setAxisMinimum(f);
        xAxis.setAxisMaximum(f2);
    }

    public void setYLabels(List<SportScaleLabel> list) {
        this.mYLabels = list;
    }

    public void setXLabels(List<SportScaleLabel> list) {
        this.mXLabels = list;
    }

    public static class SportScaleLabel {
        private final String text;
        private final float value;

        public SportScaleLabel(float f) {
            this.value = f;
            this.text = ((int) f) + "";
        }

        public SportScaleLabel(float f, String str) {
            this.value = f;
            this.text = str;
        }

        public float getValue() {
            return this.value;
        }

        public String getText() {
            return this.text;
        }
    }
}
