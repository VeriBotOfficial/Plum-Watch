package com.wakeup.feature.health.menstrual.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import com.haibin.calendarview.Calendar;
import com.haibin.calendarview.MonthView;
import com.wakeup.commonui.R;
import com.wakeup.commonui.utils.UIHelper;

/* loaded from: classes3.dex */
public class MenstrualSetMonthView extends MonthView {
    private final Paint mOutPaint;
    private final Paint mPaint;
    private int mRadius;

    @Override // com.haibin.calendarview.MonthView
    protected void onDrawScheme(Canvas canvas, Calendar calendar, int i, int i2) {
    }

    @Override // com.haibin.calendarview.BaseMonthView
    protected void onLoopStart(int i, int i2) {
    }

    public MenstrualSetMonthView(Context context) {
        super(context);
        Paint paint = new Paint();
        this.mOutPaint = paint;
        Paint paint2 = new Paint();
        this.mPaint = paint2;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setColor(context.getResources().getColor(R.color.color_999999));
        paint.setTextSize(UIHelper.dp2px(14.0f));
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(UIHelper.dp2px(1.0f));
        paint2.setColor(Color.parseColor("#FF7300"));
    }

    @Override // com.haibin.calendarview.BaseMonthView, com.haibin.calendarview.BaseView
    protected void onPreviewHook() {
        this.mRadius = (Math.min(this.mItemWidth, this.mItemHeight) / 5) * 2;
        this.mSchemePaint.setStyle(Paint.Style.STROKE);
        this.mSelectTextPaint.setFakeBoldText(false);
        this.mCurMonthTextPaint.setFakeBoldText(false);
        this.mOtherMonthTextPaint.setFakeBoldText(false);
    }

    @Override // com.haibin.calendarview.MonthView
    protected boolean onDrawSelected(Canvas canvas, Calendar calendar, int i, int i2, boolean z) {
        canvas.drawCircle(i + (this.mItemWidth / 2), i2 + (this.mItemHeight / 2), this.mRadius, this.mPaint);
        return false;
    }

    @Override // com.haibin.calendarview.MonthView
    protected void onDrawText(Canvas canvas, Calendar calendar, int i, int i2, boolean z, boolean z2) {
        Paint paint;
        float f = this.mTextBaseLine + i2;
        int i3 = i + (this.mItemWidth / 2);
        if (!isInRange(calendar)) {
            canvas.drawText(String.valueOf(calendar.getDay()), i3, f, this.mOutPaint);
            return;
        }
        calendar.isCurrentDay();
        String valueOf = String.valueOf(calendar.getDay());
        if (z2) {
            canvas.drawText(valueOf, i3, f, this.mSelectTextPaint);
            return;
        }
        float f2 = i3;
        if (calendar.isCurrentDay()) {
            paint = this.mCurDayTextPaint;
        } else {
            paint = calendar.isCurrentMonth() ? this.mCurMonthTextPaint : this.mOtherMonthTextPaint;
        }
        canvas.drawText(valueOf, f2, f, paint);
    }
}
