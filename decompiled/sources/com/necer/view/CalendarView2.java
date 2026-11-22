package com.necer.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.necer.adapter.GridCalendarAdapter;
import com.necer.calendar.BaseCalendar;
import com.necer.enumeration.CalendarType;
import com.necer.helper.CalendarHelper;
import com.necer.painter.CalendarAdapter;
import com.necer.painter.CalendarBackground;
import com.necer.utils.CalendarUtil;
import com.necer.utils.DrawableUtil;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;

/* loaded from: classes17.dex */
public class CalendarView2 extends GridView implements ICalendarView {
    private BaseAdapter gridViewAdapter;
    private CalendarAdapter mCalendarAdapter;
    private CalendarHelper mCalendarHelper;
    private int mCurrentDistance;
    private List<LocalDate> mDateList;

    public CalendarView2(Context context, BaseCalendar baseCalendar, LocalDate localDate, CalendarType calendarType) {
        super(context);
        this.mCurrentDistance = -1;
        setWillNotDraw(false);
        setNumColumns(7);
        CalendarHelper calendarHelper = new CalendarHelper(baseCalendar, localDate, calendarType);
        this.mCalendarHelper = calendarHelper;
        this.mCalendarAdapter = calendarHelper.getCalendarAdapter();
        this.mDateList = this.mCalendarHelper.getDateList();
        float calendarHeight = this.mCalendarHelper.getCalendarHeight() / 5.0f;
        float f = (4.0f * calendarHeight) / 5.0f;
        if (this.mCalendarHelper.getLineNum() == 6) {
            int i = (int) ((calendarHeight - f) / 2.0f);
            setPadding(0, i, 0, i);
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.mDateList.size(); i2++) {
            arrayList.add(this.mCalendarAdapter.getCalendarItemView(context));
        }
        GridCalendarAdapter gridCalendarAdapter = new GridCalendarAdapter(arrayList);
        this.gridViewAdapter = gridCalendarAdapter;
        setAdapter((ListAdapter) gridCalendarAdapter);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawBackground(canvas, this.mCalendarHelper.getCalendarBackground());
    }

    private void drawBackground(Canvas canvas, CalendarBackground calendarBackground) {
        int i = this.mCurrentDistance;
        if (i == -1) {
            i = this.mCalendarHelper.getInitialDistance();
        }
        Drawable backgroundDrawable = calendarBackground.getBackgroundDrawable(this.mCalendarHelper.getMiddleLocalDate(), i, this.mCalendarHelper.getCalendarHeight());
        Rect backgroundRectF = this.mCalendarHelper.getBackgroundRectF();
        backgroundDrawable.setBounds(DrawableUtil.getDrawableBounds(backgroundRectF.centerX(), backgroundRectF.centerY(), backgroundDrawable));
        backgroundDrawable.draw(canvas);
    }

    public void bindView(int i, View view) {
        LocalDate localDate = this.mDateList.get(i);
        if (this.mCalendarHelper.isAvailableDate(localDate)) {
            if (this.mCalendarHelper.isCurrentMonthOrWeek(localDate)) {
                if (CalendarUtil.isToday(localDate)) {
                    this.mCalendarAdapter.onBindToadyView(view, localDate, this.mCalendarHelper.getAllSelectListDate());
                    return;
                } else {
                    this.mCalendarAdapter.onBindCurrentMonthOrWeekView(view, localDate, this.mCalendarHelper.getAllSelectListDate());
                    return;
                }
            }
            this.mCalendarAdapter.onBindLastOrNextMonthView(view, localDate, this.mCalendarHelper.getAllSelectListDate());
            return;
        }
        this.mCalendarAdapter.onBindDisableDateView(view, localDate);
    }

    @Override // android.widget.AbsListView, android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.mCalendarHelper.resetRectFSize();
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.mCalendarHelper.onTouchEvent(motionEvent);
    }

    @Override // com.necer.view.ICalendarView
    public LocalDate getPagerInitialDate() {
        return this.mCalendarHelper.getPagerInitialDate();
    }

    @Override // com.necer.view.ICalendarView
    public LocalDate getMiddleLocalDate() {
        return this.mCalendarHelper.getMiddleLocalDate();
    }

    @Override // com.necer.view.ICalendarView
    public int getDistanceFromTop(LocalDate localDate) {
        return this.mCalendarHelper.getDistanceFromTop(localDate);
    }

    @Override // com.necer.view.ICalendarView
    public LocalDate getPivotDate() {
        return this.mCalendarHelper.getPivotDate();
    }

    @Override // com.necer.view.ICalendarView
    public int getPivotDistanceFromTop() {
        return this.mCalendarHelper.getPivotDistanceFromTop();
    }

    @Override // com.necer.view.ICalendarView
    public List<LocalDate> getCurrPagerCheckDateList() {
        return this.mCalendarHelper.getCurrentSelectDateList();
    }

    @Override // com.necer.view.ICalendarView
    public void updateSlideDistance(int i) {
        this.mCurrentDistance = i;
        invalidate();
    }

    @Override // com.necer.view.ICalendarView
    public List<LocalDate> getCurrPagerDateList() {
        return this.mCalendarHelper.getCurrentDateList();
    }

    @Override // com.necer.view.ICalendarView
    public void notifyCalendarView() {
        this.gridViewAdapter.notifyDataSetChanged();
    }

    @Override // com.necer.view.ICalendarView
    public LocalDate getCurrPagerFirstDate() {
        return this.mCalendarHelper.getCurrPagerFirstDate();
    }

    @Override // com.necer.view.ICalendarView
    public CalendarType getCalendarType() {
        return this.mCalendarHelper.getCalendarType();
    }
}
