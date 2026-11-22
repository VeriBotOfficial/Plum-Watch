package com.wakeup.commonui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import com.wakeup.commonui.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class WeekBar extends AppCompatTextView {
    public List<String> days;
    private final TextPaint textPaint;
    private final int type;

    public WeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ArrayList arrayList = new ArrayList();
        this.days = arrayList;
        arrayList.add(context.getString(R.string.course_tip_103));
        this.days.add(context.getString(R.string.course_tip_104));
        this.days.add(context.getString(R.string.course_tip_105));
        this.days.add(context.getString(R.string.course_tip_106));
        this.days.add(context.getString(R.string.course_tip_107));
        this.days.add(context.getString(R.string.course_tip_108));
        this.days.add(context.getString(R.string.course_tip_109));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.WeekBar);
        this.type = obtainStyledAttributes.getInt(R.styleable.WeekBar_week_firstDayOfWeek, 300);
        int color = obtainStyledAttributes.getColor(R.styleable.WeekBar_weekBar_textColor, ContextCompat.getColor(context, R.color.color_666666));
        obtainStyledAttributes.recycle();
        TextPaint paint = getPaint();
        this.textPaint = paint;
        paint.setColor(color);
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
        while (i < this.days.size()) {
            int i2 = i + 1;
            Rect rect = new Rect(((i * measuredWidth) / this.days.size()) + paddingLeft, paddingTop, ((i2 * measuredWidth) / this.days.size()) + paddingLeft, paddingTop + measuredHeight);
            Paint.FontMetrics fontMetrics = this.textPaint.getFontMetrics();
            int centerY = (int) ((rect.centerY() - (fontMetrics.top / 2.0f)) - (fontMetrics.bottom / 2.0f));
            if (this.type == 301) {
                List<String> list = this.days;
                str = list.get(i2 > list.size() + (-1) ? 0 : i2);
            } else {
                str = this.days.get(i);
            }
            canvas.drawText(str, rect.centerX(), centerY, this.textPaint);
            i = i2;
        }
    }
}
