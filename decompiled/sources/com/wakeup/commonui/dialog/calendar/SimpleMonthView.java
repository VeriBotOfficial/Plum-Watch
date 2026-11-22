package com.wakeup.commonui.dialog.calendar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.haibin.calendarview.Calendar;
import com.haibin.calendarview.MonthView;
import com.wakeup.commonui.R;
import com.wakeup.commonui.utils.UIHelper;

/* loaded from: classes2.dex */
public class SimpleMonthView extends MonthView {
    private final Paint mOutPaint;
    private int mRadius;

    @Override // com.haibin.calendarview.BaseMonthView
    protected void onLoopStart(int i, int i2) {
    }

    public SimpleMonthView(Context context) {
        super(context);
        Paint paint = new Paint();
        this.mOutPaint = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setColor(context.getResources().getColor(R.color.color_999999));
        paint.setFakeBoldText(true);
        paint.setTextSize(UIHelper.dp2px(10.0f));
    }

    @Override // com.haibin.calendarview.BaseMonthView, com.haibin.calendarview.BaseView
    protected void onPreviewHook() {
        this.mRadius = (Math.min(this.mItemWidth, this.mItemHeight) / 5) * 2;
        this.mSchemePaint.setStyle(Paint.Style.STROKE);
    }

    @Override // com.haibin.calendarview.MonthView
    protected boolean onDrawSelected(Canvas canvas, Calendar calendar, int i, int i2, boolean z) {
        canvas.drawCircle(i + (this.mItemWidth / 2), i2 + (this.mItemHeight / 2), this.mRadius, this.mSelectedPaint);
        return false;
    }

    @Override // com.haibin.calendarview.MonthView
    protected void onDrawScheme(Canvas canvas, Calendar calendar, int i, int i2) {
        canvas.drawCircle(i + (this.mItemWidth / 2), i2 + (this.mItemHeight / 2), this.mRadius, this.mSchemePaint);
    }

    @Override // com.haibin.calendarview.MonthView
    protected void onDrawText(Canvas canvas, Calendar calendar, int i, int i2, boolean z, boolean z2) {
        Paint paint;
        Paint paint2;
        float f = this.mTextBaseLine + i2;
        int i3 = i + (this.mItemWidth / 2);
        if (!isInRange(calendar)) {
            canvas.drawText(String.valueOf(calendar.getDay()), i3, f, this.mOutPaint);
            return;
        }
        if (z2) {
            canvas.drawText(String.valueOf(calendar.getDay()), i3, f, this.mSelectTextPaint);
            return;
        }
        if (z) {
            String valueOf = String.valueOf(calendar.getDay());
            float f2 = i3;
            if (calendar.isCurrentDay()) {
                paint2 = this.mCurDayTextPaint;
            } else {
                paint2 = calendar.isCurrentMonth() ? this.mSchemeTextPaint : this.mOtherMonthTextPaint;
            }
            canvas.drawText(valueOf, f2, f, paint2);
            return;
        }
        String valueOf2 = String.valueOf(calendar.getDay());
        float f3 = i3;
        if (calendar.isCurrentDay()) {
            paint = this.mCurDayTextPaint;
        } else {
            paint = calendar.isCurrentMonth() ? this.mCurMonthTextPaint : this.mOtherMonthTextPaint;
        }
        canvas.drawText(valueOf2, f3, f, paint);
    }
}
