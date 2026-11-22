package com.haibin.calendarview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.internal.view.SupportMenu;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class YearView extends View {
    protected Paint mCurDayLunarTextPaint;
    protected Paint mCurDayTextPaint;
    protected Paint mCurMonthLunarTextPaint;
    protected Paint mCurMonthTextPaint;
    CalendarViewDelegate mDelegate;
    protected int mItemHeight;
    protected int mItemWidth;
    List<Calendar> mItems;
    protected int mLineCount;
    protected int mMonth;
    protected float mMonthTextBaseLine;
    protected Paint mMonthTextPaint;
    protected int mNextDiff;
    protected Paint mOtherMonthLunarTextPaint;
    protected Paint mOtherMonthTextPaint;
    protected Paint mSchemeLunarTextPaint;
    protected Paint mSchemePaint;
    protected Paint mSchemeTextPaint;
    protected Paint mSelectTextPaint;
    protected Paint mSelectedLunarTextPaint;
    protected Paint mSelectedPaint;
    protected float mTextBaseLine;
    protected int mWeekStart;
    protected float mWeekTextBaseLine;
    protected Paint mWeekTextPaint;
    protected int mYear;

    protected abstract void onDrawMonth(Canvas canvas, int i, int i2, int i3, int i4, int i5, int i6);

    protected abstract void onDrawScheme(Canvas canvas, Calendar calendar, int i, int i2);

    protected abstract boolean onDrawSelected(Canvas canvas, Calendar calendar, int i, int i2, boolean z);

    protected abstract void onDrawText(Canvas canvas, Calendar calendar, int i, int i2, boolean z, boolean z2);

    protected abstract void onDrawWeek(Canvas canvas, int i, int i2, int i3, int i4, int i5);

    protected void onPreviewHook() {
    }

    public YearView(Context context) {
        this(context, null);
    }

    public YearView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mCurMonthTextPaint = new Paint();
        this.mOtherMonthTextPaint = new Paint();
        this.mCurMonthLunarTextPaint = new Paint();
        this.mSelectedLunarTextPaint = new Paint();
        this.mOtherMonthLunarTextPaint = new Paint();
        this.mSchemeLunarTextPaint = new Paint();
        this.mSchemePaint = new Paint();
        this.mSelectedPaint = new Paint();
        this.mSchemeTextPaint = new Paint();
        this.mSelectTextPaint = new Paint();
        this.mCurDayTextPaint = new Paint();
        this.mCurDayLunarTextPaint = new Paint();
        this.mMonthTextPaint = new Paint();
        this.mWeekTextPaint = new Paint();
        initPaint();
    }

    private void initPaint() {
        this.mCurMonthTextPaint.setAntiAlias(true);
        this.mCurMonthTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mCurMonthTextPaint.setColor(-15658735);
        this.mCurMonthTextPaint.setFakeBoldText(true);
        this.mOtherMonthTextPaint.setAntiAlias(true);
        this.mOtherMonthTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mOtherMonthTextPaint.setColor(-1973791);
        this.mOtherMonthTextPaint.setFakeBoldText(true);
        this.mCurMonthLunarTextPaint.setAntiAlias(true);
        this.mCurMonthLunarTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mSelectedLunarTextPaint.setAntiAlias(true);
        this.mSelectedLunarTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mOtherMonthLunarTextPaint.setAntiAlias(true);
        this.mOtherMonthLunarTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mMonthTextPaint.setAntiAlias(true);
        this.mMonthTextPaint.setFakeBoldText(true);
        this.mWeekTextPaint.setAntiAlias(true);
        this.mWeekTextPaint.setFakeBoldText(true);
        this.mWeekTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mSchemeLunarTextPaint.setAntiAlias(true);
        this.mSchemeLunarTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mSchemeTextPaint.setAntiAlias(true);
        this.mSchemeTextPaint.setStyle(Paint.Style.FILL);
        this.mSchemeTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mSchemeTextPaint.setColor(-1223853);
        this.mSchemeTextPaint.setFakeBoldText(true);
        this.mSelectTextPaint.setAntiAlias(true);
        this.mSelectTextPaint.setStyle(Paint.Style.FILL);
        this.mSelectTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mSelectTextPaint.setColor(-1223853);
        this.mSelectTextPaint.setFakeBoldText(true);
        this.mSchemePaint.setAntiAlias(true);
        this.mSchemePaint.setStyle(Paint.Style.FILL);
        this.mSchemePaint.setStrokeWidth(2.0f);
        this.mSchemePaint.setColor(-1052689);
        this.mCurDayTextPaint.setAntiAlias(true);
        this.mCurDayTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mCurDayTextPaint.setColor(SupportMenu.CATEGORY_MASK);
        this.mCurDayTextPaint.setFakeBoldText(true);
        this.mCurDayLunarTextPaint.setAntiAlias(true);
        this.mCurDayLunarTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mCurDayLunarTextPaint.setColor(SupportMenu.CATEGORY_MASK);
        this.mCurDayLunarTextPaint.setFakeBoldText(true);
        this.mSelectedPaint.setAntiAlias(true);
        this.mSelectedPaint.setStyle(Paint.Style.FILL);
        this.mSelectedPaint.setStrokeWidth(2.0f);
    }

    final void setup(CalendarViewDelegate calendarViewDelegate) {
        this.mDelegate = calendarViewDelegate;
        updateStyle();
    }

    final void updateStyle() {
        if (this.mDelegate == null) {
            return;
        }
        this.mCurMonthTextPaint.setTextSize(r0.getYearViewDayTextSize());
        this.mSchemeTextPaint.setTextSize(this.mDelegate.getYearViewDayTextSize());
        this.mOtherMonthTextPaint.setTextSize(this.mDelegate.getYearViewDayTextSize());
        this.mCurDayTextPaint.setTextSize(this.mDelegate.getYearViewDayTextSize());
        this.mSelectTextPaint.setTextSize(this.mDelegate.getYearViewDayTextSize());
        this.mSchemeTextPaint.setColor(this.mDelegate.getYearViewSchemeTextColor());
        this.mCurMonthTextPaint.setColor(this.mDelegate.getYearViewDayTextColor());
        this.mOtherMonthTextPaint.setColor(this.mDelegate.getYearViewDayTextColor());
        this.mCurDayTextPaint.setColor(this.mDelegate.getYearViewCurDayTextColor());
        this.mSelectTextPaint.setColor(this.mDelegate.getYearViewSelectTextColor());
        this.mMonthTextPaint.setTextSize(this.mDelegate.getYearViewMonthTextSize());
        this.mMonthTextPaint.setColor(this.mDelegate.getYearViewMonthTextColor());
        this.mWeekTextPaint.setColor(this.mDelegate.getYearViewWeekTextColor());
        this.mWeekTextPaint.setTextSize(this.mDelegate.getYearViewWeekTextSize());
    }

    final void init(int i, int i2) {
        this.mYear = i;
        this.mMonth = i2;
        this.mNextDiff = CalendarUtil.getMonthEndDiff(i, i2, this.mDelegate.getWeekStart());
        CalendarUtil.getMonthViewStartDiff(this.mYear, this.mMonth, this.mDelegate.getWeekStart());
        this.mItems = CalendarUtil.initCalendarForMonthView(this.mYear, this.mMonth, this.mDelegate.getCurrentDay(), this.mDelegate.getWeekStart());
        this.mLineCount = 6;
        addSchemesFromMap();
    }

    final void measureSize(int i, int i2) {
        Rect rect = new Rect();
        this.mCurMonthTextPaint.getTextBounds("1", 0, 1, rect);
        int height = (rect.height() * 12) + getMonthViewTop();
        if (i2 < height) {
            i2 = height;
        }
        getLayoutParams().width = i;
        getLayoutParams().height = i2;
        this.mItemHeight = (i2 - getMonthViewTop()) / 6;
        Paint.FontMetrics fontMetrics = this.mCurMonthTextPaint.getFontMetrics();
        this.mTextBaseLine = ((this.mItemHeight / 2) - fontMetrics.descent) + ((fontMetrics.bottom - fontMetrics.top) / 2.0f);
        Paint.FontMetrics fontMetrics2 = this.mMonthTextPaint.getFontMetrics();
        this.mMonthTextBaseLine = ((this.mDelegate.getYearViewMonthHeight() / 2) - fontMetrics2.descent) + ((fontMetrics2.bottom - fontMetrics2.top) / 2.0f);
        Paint.FontMetrics fontMetrics3 = this.mWeekTextPaint.getFontMetrics();
        this.mWeekTextBaseLine = ((this.mDelegate.getYearViewWeekHeight() / 2) - fontMetrics3.descent) + ((fontMetrics3.bottom - fontMetrics3.top) / 2.0f);
        invalidate();
    }

    private void addSchemesFromMap() {
        if (this.mDelegate.mSchemeDatesMap == null || this.mDelegate.mSchemeDatesMap.size() == 0) {
            return;
        }
        for (Calendar calendar : this.mItems) {
            if (this.mDelegate.mSchemeDatesMap.containsKey(calendar.toString())) {
                Calendar calendar2 = this.mDelegate.mSchemeDatesMap.get(calendar.toString());
                calendar.setScheme(TextUtils.isEmpty(calendar2.getScheme()) ? this.mDelegate.getSchemeText() : calendar2.getScheme());
                calendar.setSchemeColor(calendar2.getSchemeColor());
                calendar.setSchemes(calendar2.getSchemes());
            } else {
                calendar.setScheme("");
                calendar.setSchemeColor(0);
                calendar.setSchemes(null);
            }
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        this.mItemWidth = (getWidth() - (this.mDelegate.getYearViewPadding() * 2)) / 7;
        onPreviewHook();
        onDrawMonth(canvas);
        onDrawWeek(canvas);
        onDrawMonthView(canvas);
    }

    private void onDrawMonth(Canvas canvas) {
        onDrawMonth(canvas, this.mYear, this.mMonth, this.mDelegate.getYearViewPadding(), this.mDelegate.getYearViewMonthMarginTop(), getWidth() - (this.mDelegate.getYearViewPadding() * 2), this.mDelegate.getYearViewMonthHeight() + this.mDelegate.getYearViewMonthMarginTop());
    }

    private int getMonthViewTop() {
        return this.mDelegate.getYearViewMonthMarginTop() + this.mDelegate.getYearViewMonthHeight() + this.mDelegate.getYearViewMonthMarginBottom() + this.mDelegate.getYearViewWeekHeight();
    }

    private void onDrawWeek(Canvas canvas) {
        if (this.mDelegate.getYearViewWeekHeight() <= 0) {
            return;
        }
        int weekStart = this.mDelegate.getWeekStart();
        if (weekStart > 0) {
            weekStart--;
        }
        int width = (getWidth() - (this.mDelegate.getYearViewPadding() * 2)) / 7;
        int i = weekStart;
        int i2 = 0;
        while (i2 < 7) {
            Canvas canvas2 = canvas;
            onDrawWeek(canvas2, i, this.mDelegate.getYearViewPadding() + (i2 * width), this.mDelegate.getYearViewMonthHeight() + this.mDelegate.getYearViewMonthMarginTop() + this.mDelegate.getYearViewMonthMarginBottom(), width, this.mDelegate.getYearViewWeekHeight());
            i++;
            if (i >= 7) {
                i = 0;
            }
            i2++;
            canvas = canvas2;
        }
    }

    private void onDrawMonthView(Canvas canvas) {
        Canvas canvas2;
        int i = 0;
        int i2 = 0;
        while (i2 < this.mLineCount) {
            int i3 = 0;
            int i4 = i;
            while (i3 < 7) {
                Calendar calendar = this.mItems.get(i4);
                if (i4 > this.mItems.size() - this.mNextDiff) {
                    return;
                }
                if (calendar.isCurrentMonth()) {
                    canvas2 = canvas;
                    draw(canvas2, calendar, i2, i3, i4);
                    i4++;
                } else {
                    i4++;
                    canvas2 = canvas;
                }
                i3++;
                canvas = canvas2;
            }
            i2++;
            i = i4;
        }
    }

    private void draw(Canvas canvas, Calendar calendar, int i, int i2, int i3) {
        Canvas canvas2;
        Calendar calendar2;
        YearView yearView;
        boolean z;
        int yearViewPadding = (i2 * this.mItemWidth) + this.mDelegate.getYearViewPadding();
        int monthViewTop = (i * this.mItemHeight) + getMonthViewTop();
        boolean equals = calendar.equals(this.mDelegate.mSelectedCalendar);
        boolean hasScheme = calendar.hasScheme();
        if (hasScheme) {
            if (equals) {
                yearView = this;
                canvas2 = canvas;
                calendar2 = calendar;
                z = yearView.onDrawSelected(canvas2, calendar2, yearViewPadding, monthViewTop, true);
            } else {
                yearView = this;
                canvas2 = canvas;
                calendar2 = calendar;
                z = false;
            }
            if (z || !equals) {
                yearView.mSchemePaint.setColor(calendar2.getSchemeColor() != 0 ? calendar2.getSchemeColor() : yearView.mDelegate.getSchemeThemeColor());
                onDrawScheme(canvas2, calendar2, yearViewPadding, monthViewTop);
            }
        } else {
            canvas2 = canvas;
            calendar2 = calendar;
            if (equals) {
                onDrawSelected(canvas2, calendar2, yearViewPadding, monthViewTop, false);
            }
            yearView = this;
        }
        yearView.onDrawText(canvas2, calendar2, yearViewPadding, monthViewTop, hasScheme, equals);
    }
}
