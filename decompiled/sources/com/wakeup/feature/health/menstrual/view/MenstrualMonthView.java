package com.wakeup.feature.health.menstrual.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import com.haibin.calendarview.Calendar;
import com.haibin.calendarview.MonthView;
import com.wakeup.common.utils.DateUtil;
import com.wakeup.commonui.utils.UIHelper;
import com.wakeup.commponent.module.health.MenstrualUtils;
import oqml.a;

/* loaded from: classes3.dex */
public class MenstrualMonthView extends MonthView {
    private final int dp14;
    private final int dp16;
    private final int dp4;
    private final int dp5;
    private final Paint forecastPaint;
    private final Paint schemePaint;
    private final Paint selectPaint;
    private final Paint textPaint;

    @Override // com.haibin.calendarview.BaseMonthView
    protected void onLoopStart(int i, int i2) {
    }

    public MenstrualMonthView(Context context) {
        super(context);
        this.dp4 = UIHelper.dp2px(4.0f);
        this.dp5 = UIHelper.dp2px(5.0f);
        this.dp14 = UIHelper.dp2px(14.0f);
        this.dp16 = UIHelper.dp2px(16.0f);
        Paint paint = new Paint();
        this.textPaint = paint;
        Paint paint2 = new Paint();
        this.selectPaint = paint2;
        Paint paint3 = new Paint();
        this.schemePaint = paint3;
        Paint paint4 = new Paint();
        this.forecastPaint = paint4;
        setLayerType(1, null);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTextSize(UIHelper.dp2px(16.0f));
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(Color.parseColor("#FD5B7A"));
        paint2.setStrokeWidth(UIHelper.dp2px(1.5f));
        paint3.setAntiAlias(true);
        paint3.setStyle(Paint.Style.FILL);
        paint3.setStrokeWidth(UIHelper.dp2px(1.0f));
        paint4.setAntiAlias(true);
        paint4.setStyle(Paint.Style.STROKE);
        paint4.setColor(Color.parseColor("#FD5B7A"));
        paint4.setPathEffect(new DashPathEffect(new float[]{10.0f, 10.0f}, 0.0f));
        paint4.setStrokeWidth(UIHelper.dp2px(1.0f));
    }

    @Override // com.haibin.calendarview.BaseMonthView, com.haibin.calendarview.BaseView
    protected void onPreviewHook() {
        this.mSchemePaint.setStyle(Paint.Style.STROKE);
        this.mSelectTextPaint.setFakeBoldText(false);
        this.mCurMonthTextPaint.setFakeBoldText(false);
        this.mOtherMonthTextPaint.setFakeBoldText(false);
    }

    @Override // com.haibin.calendarview.MonthView
    protected boolean onDrawSelected(Canvas canvas, Calendar calendar, int i, int i2, boolean z) {
        String scheme = calendar.getScheme();
        int i3 = i + (this.mItemWidth / 2);
        int i4 = (i2 + (this.mItemHeight / 2)) - (this.dp4 * 2);
        if (!z) {
            this.schemePaint.setColor(Color.parseColor("#F6F6F6"));
            int i5 = this.dp16;
            float f = i3 - i5;
            float f2 = i4 - i5;
            float f3 = i3 + i5;
            float f4 = (i2 + this.mItemHeight) - this.dp5;
            int i6 = this.dp16;
            canvas.drawRoundRect(f, f2, f3, f4, i6, i6, this.schemePaint);
            return false;
        }
        if (z && !"3".equals(scheme)) {
            drawScheme(canvas, calendar, i, i2);
        }
        this.selectPaint.setColor(Color.parseColor("2".equals(scheme) ? "#70B6FE" : "#FD5B7A"));
        int i7 = this.dp16;
        float f5 = i3 - i7;
        float f6 = i4 - i7;
        float f7 = i3 + i7;
        float f8 = (i2 + this.mItemHeight) - this.dp5;
        int i8 = this.dp16;
        canvas.drawRoundRect(f5, f6, f7, f8, i8, i8, this.selectPaint);
        return false;
    }

    @Override // com.haibin.calendarview.MonthView
    protected void onDrawScheme(Canvas canvas, Calendar calendar, int i, int i2) {
        drawScheme(canvas, calendar, i, i2);
    }

    private void drawScheme(Canvas canvas, Calendar calendar, int i, int i2) {
        int i3 = i + (this.mItemWidth / 2);
        int i4 = (i2 + (this.mItemHeight / 2)) - (this.dp4 * 2);
        String scheme = calendar.getScheme();
        if ("3".equals(scheme)) {
            float f = i3 + this.dp16;
            float f2 = (i2 + this.mItemHeight) - this.dp5;
            int i5 = this.dp16;
            canvas.drawRoundRect(i3 - r3, i4 - r3, f, f2, i5, i5, this.forecastPaint);
            return;
        }
        if ("1".equals(scheme)) {
            this.schemePaint.setColor(Color.parseColor("#FFEDF0"));
        } else if ("2".equals(scheme)) {
            this.schemePaint.setColor(Color.parseColor("#D8EBFF"));
        }
        int i6 = this.dp16;
        float f3 = (i2 + this.mItemHeight) - this.dp5;
        int i7 = this.dp16;
        canvas.drawRoundRect(i3 - i6, i4 - i6, i6 + i3, f3, i7, i7, this.schemePaint);
        if ("1".equals(scheme)) {
            this.schemePaint.setColor(Color.parseColor("#FE9EB1"));
        } else if ("2".equals(scheme)) {
            this.schemePaint.setColor(Color.parseColor("#70B6FE"));
        }
        canvas.drawCircle(i3, i4, this.dp14, this.schemePaint);
    }

    @Override // com.haibin.calendarview.MonthView
    protected void onDrawText(Canvas canvas, Calendar calendar, int i, int i2, boolean z, boolean z2) {
        float f = (this.mTextBaseLine + i2) - (this.dp4 * 2);
        int i3 = i + (this.mItemWidth / 2);
        calendar.isCurrentDay();
        String valueOf = String.valueOf(calendar.getDay());
        if (z && !"3".equals(calendar.getScheme())) {
            this.textPaint.setColor(Color.parseColor("#ffffff"));
        } else {
            boolean z3 = MenstrualUtils.getTime(calendar.getTimeInMillis() / 1000) <= MenstrualUtils.getTime(DateUtil.getDayStartTime());
            this.textPaint.setColor(Color.parseColor("#333333"));
            if (!z3) {
                this.textPaint.setColor(Color.parseColor(a.C1008a.f18760a));
            }
        }
        canvas.drawText(valueOf, i3, f, this.textPaint);
    }
}
