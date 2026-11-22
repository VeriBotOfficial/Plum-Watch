package com.haibin.calendarview;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* loaded from: classes11.dex */
public abstract class MonthView extends BaseMonthView {
    protected abstract void onDrawScheme(Canvas canvas, Calendar calendar, int i, int i2);

    protected abstract boolean onDrawSelected(Canvas canvas, Calendar calendar, int i, int i2, boolean z);

    protected abstract void onDrawText(Canvas canvas, Calendar calendar, int i, int i2, boolean z, boolean z2);

    public MonthView(Context context) {
        super(context);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.mLineCount == 0) {
            return;
        }
        this.mItemWidth = (getWidth() - (this.mDelegate.getCalendarPadding() * 2)) / 7;
        onPreviewHook();
        int i = this.mLineCount * 7;
        int i2 = 0;
        int i3 = 0;
        while (i3 < this.mLineCount) {
            int i4 = 0;
            int i5 = i2;
            while (i4 < 7) {
                Calendar calendar = this.mItems.get(i5);
                if (this.mDelegate.getMonthViewShowMode() == 1) {
                    if (i5 > this.mItems.size() - this.mNextDiff) {
                        return;
                    }
                    if (!calendar.isCurrentMonth()) {
                        i5++;
                        canvas2 = canvas;
                        i4++;
                        canvas = canvas2;
                    }
                } else if (this.mDelegate.getMonthViewShowMode() == 2 && i5 >= i) {
                    return;
                }
                canvas2 = canvas;
                draw(canvas2, calendar, i3, i4, i5);
                i5++;
                i4++;
                canvas = canvas2;
            }
            i3++;
            i2 = i5;
        }
    }

    private void draw(Canvas canvas, Calendar calendar, int i, int i2, int i3) {
        Canvas canvas2;
        Calendar calendar2;
        MonthView monthView;
        int calendarPadding = (i2 * this.mItemWidth) + this.mDelegate.getCalendarPadding();
        int i4 = i * this.mItemHeight;
        onLoopStart(calendarPadding, i4);
        boolean z = false;
        boolean z2 = i3 == this.mCurrentItem;
        boolean hasScheme = calendar.hasScheme();
        if (hasScheme) {
            if (z2) {
                monthView = this;
                canvas2 = canvas;
                calendar2 = calendar;
                z = monthView.onDrawSelected(canvas2, calendar2, calendarPadding, i4, true);
            } else {
                monthView = this;
                canvas2 = canvas;
                calendar2 = calendar;
            }
            if (z || !z2) {
                monthView.mSchemePaint.setColor(calendar2.getSchemeColor() != 0 ? calendar2.getSchemeColor() : monthView.mDelegate.getSchemeThemeColor());
                onDrawScheme(canvas2, calendar2, calendarPadding, i4);
            }
        } else {
            canvas2 = canvas;
            calendar2 = calendar;
            if (z2) {
                onDrawSelected(canvas2, calendar2, calendarPadding, i4, false);
            }
            monthView = this;
        }
        monthView.onDrawText(canvas2, calendar2, calendarPadding, i4, hasScheme, z2);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Calendar index;
        if (this.isClick && (index = getIndex()) != null) {
            if (this.mDelegate.getMonthViewShowMode() != 1 || index.isCurrentMonth()) {
                if (onCalendarIntercept(index)) {
                    this.mDelegate.mCalendarInterceptListener.onCalendarInterceptClick(index, true);
                    return;
                }
                if (!isInRange(index)) {
                    if (this.mDelegate.mCalendarSelectListener != null) {
                        this.mDelegate.mCalendarSelectListener.onCalendarOutOfRange(index);
                        return;
                    }
                    return;
                }
                this.mCurrentItem = this.mItems.indexOf(index);
                if (!index.isCurrentMonth() && this.mMonthViewPager != null) {
                    int currentItem = this.mMonthViewPager.getCurrentItem();
                    this.mMonthViewPager.setCurrentItem(this.mCurrentItem < 7 ? currentItem - 1 : currentItem + 1);
                }
                if (this.mDelegate.mInnerListener != null) {
                    this.mDelegate.mInnerListener.onMonthDateSelected(index, true);
                }
                if (this.mParentLayout != null) {
                    if (index.isCurrentMonth()) {
                        this.mParentLayout.updateSelectPosition(this.mItems.indexOf(index));
                    } else {
                        this.mParentLayout.updateSelectWeek(CalendarUtil.getWeekFromDayInMonth(index, this.mDelegate.getWeekStart()));
                    }
                }
                if (this.mDelegate.mCalendarSelectListener != null) {
                    this.mDelegate.mCalendarSelectListener.onCalendarSelect(index, true);
                }
            }
        }
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        Calendar index;
        if (this.mDelegate.mCalendarLongClickListener == null || !this.isClick || (index = getIndex()) == null) {
            return false;
        }
        if (this.mDelegate.getMonthViewShowMode() == 1 && !index.isCurrentMonth()) {
            return false;
        }
        if (onCalendarIntercept(index)) {
            this.mDelegate.mCalendarInterceptListener.onCalendarInterceptClick(index, true);
            return false;
        }
        if (!isInRange(index)) {
            if (this.mDelegate.mCalendarLongClickListener != null) {
                this.mDelegate.mCalendarLongClickListener.onCalendarLongClickOutOfRange(index);
            }
            return true;
        }
        if (this.mDelegate.isPreventLongPressedSelected()) {
            if (this.mDelegate.mCalendarLongClickListener != null) {
                this.mDelegate.mCalendarLongClickListener.onCalendarLongClick(index);
            }
            return true;
        }
        this.mCurrentItem = this.mItems.indexOf(index);
        if (!index.isCurrentMonth() && this.mMonthViewPager != null) {
            int currentItem = this.mMonthViewPager.getCurrentItem();
            this.mMonthViewPager.setCurrentItem(this.mCurrentItem < 7 ? currentItem - 1 : currentItem + 1);
        }
        if (this.mDelegate.mInnerListener != null) {
            this.mDelegate.mInnerListener.onMonthDateSelected(index, true);
        }
        if (this.mParentLayout != null) {
            if (index.isCurrentMonth()) {
                this.mParentLayout.updateSelectPosition(this.mItems.indexOf(index));
            } else {
                this.mParentLayout.updateSelectWeek(CalendarUtil.getWeekFromDayInMonth(index, this.mDelegate.getWeekStart()));
            }
        }
        if (this.mDelegate.mCalendarSelectListener != null) {
            this.mDelegate.mCalendarSelectListener.onCalendarSelect(index, true);
        }
        if (this.mDelegate.mCalendarLongClickListener != null) {
            this.mDelegate.mCalendarLongClickListener.onCalendarLongClick(index);
        }
        invalidate();
        return true;
    }
}
