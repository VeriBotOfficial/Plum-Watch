package com.necer.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.necer.R;

/* loaded from: classes17.dex */
public class WeekBar extends AppCompatTextView {
    public String[] days;
    private TextPaint textPaint;
    private int type;

    public WeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.days = new String[]{"日", "一", "二", "三", "四", "五", "六"};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.NCalendar);
        this.type = obtainStyledAttributes.getInt(R.styleable.NCalendar_firstDayOfWeek, 300);
        obtainStyledAttributes.recycle();
        TextPaint paint = getPaint();
        this.textPaint = paint;
        paint.setTextAlign(Paint.Align.CENTER);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        String str;
        super.onDraw(canvas);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int measuredWidth = (getMeasuredWidth() - paddingRight) - paddingLeft;
        int measuredHeight = (getMeasuredHeight() - paddingTop) - paddingBottom;
        int i = 0;
        while (i < this.days.length) {
            String[] strArr = this.days;
            int i2 = i + 1;
            Rect rect = new Rect(((i * measuredWidth) / strArr.length) + paddingLeft, paddingTop, ((i2 * measuredWidth) / strArr.length) + paddingLeft, paddingTop + measuredHeight);
            Paint.FontMetrics fontMetrics = this.textPaint.getFontMetrics();
            int centerY = (int) ((rect.centerY() - (fontMetrics.top / 2.0f)) - (fontMetrics.bottom / 2.0f));
            if (this.type == 301) {
                String[] strArr2 = this.days;
                str = strArr2[i2 > strArr2.length + (-1) ? 0 : i2];
            } else {
                str = this.days[i];
            }
            canvas.drawText(str, rect.centerX(), centerY, this.textPaint);
            i = i2;
        }
    }
}
