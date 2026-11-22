package com.necer.calendar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.Toast;
import androidx.viewpager.widget.ViewPager;
import com.necer.R;
import com.necer.adapter.BasePagerAdapter;
import com.necer.calendar.BaseCalendar;
import com.necer.enumeration.CalendarBuild;
import com.necer.enumeration.CheckModel;
import com.necer.enumeration.DateChangeBehavior;
import com.necer.enumeration.MultipleCountModel;
import com.necer.listener.OnCalendarChangedListener;
import com.necer.listener.OnCalendarMultipleChangedListener;
import com.necer.listener.OnClickDisableDateListener;
import com.necer.listener.OnMWDateChangeListener;
import com.necer.painter.CalendarAdapter;
import com.necer.painter.CalendarBackground;
import com.necer.painter.CalendarPainter;
import com.necer.painter.InnerPainter;
import com.necer.painter.NumBackground;
import com.necer.painter.WhiteBackground;
import com.necer.utils.Attrs;
import com.necer.utils.AttrsUtil;
import com.necer.view.ICalendarView;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;

/* loaded from: classes17.dex */
public abstract class BaseCalendar extends ViewPager implements ICalendar {
    private static final String mDefaultEndDateDate = "2099-12-31";
    private static final String mDefaultStartDate = "1901-02-01";
    private boolean mAllMonthSixLine;
    private Attrs mAttrs;
    private CalendarAdapter mCalendarAdapter;
    private CalendarBackground mCalendarBackground;
    private CalendarBuild mCalendarBuild;
    private int mCalendarCurrIndex;
    private int mCalendarPagerSize;
    protected CalendarPainter mCalendarPainter;
    private CheckModel mCheckModel;
    private Context mContext;
    private DateChangeBehavior mDateChangeBehavior;
    private boolean mDefaultCheckedFirstDate;
    protected LocalDate mEndDate;
    private int mFirstDayOfWeek;
    protected LocalDate mInitializeDate;
    private boolean mLastNextMonthClickEnable;
    private int mMultipleCount;
    private MultipleCountModel mMultipleCountModel;
    private OnCalendarChangedListener mOnCalendarChangedListener;
    private OnCalendarMultipleChangedListener mOnCalendarMultipleChangedListener;
    protected OnClickDisableDateListener mOnClickDisableDateListener;
    private OnMWDateChangeListener mOnMWDateChangeListener;
    private boolean mScrollEnable;
    protected LocalDate mStartDate;
    private List<LocalDate> mTotalCheckedDateList;

    protected abstract LocalDate getIntervalDate(LocalDate localDate, int i);

    protected abstract BasePagerAdapter getPagerAdapter(Context context, BaseCalendar baseCalendar);

    protected abstract int getTwoDateCount(LocalDate localDate, LocalDate localDate2, int i);

    public BaseCalendar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mScrollEnable = true;
        this.mAttrs = AttrsUtil.getAttrs(context, attributeSet);
        this.mContext = context;
        this.mCheckModel = CheckModel.SINGLE_DEFAULT_CHECKED;
        this.mCalendarBuild = CalendarBuild.DRAW;
        this.mDateChangeBehavior = DateChangeBehavior.INITIALIZE;
        this.mTotalCheckedDateList = new ArrayList();
        this.mInitializeDate = new LocalDate();
        this.mStartDate = new LocalDate(mDefaultStartDate);
        this.mEndDate = new LocalDate(mDefaultEndDateDate);
        if (this.mAttrs.showNumberBackground) {
            this.mCalendarBackground = new NumBackground(this.mAttrs.numberBackgroundTextSize, this.mAttrs.numberBackgroundTextColor, this.mAttrs.numberBackgroundAlphaColor);
        } else if (this.mAttrs.calendarBackground != null) {
            this.mCalendarBackground = new CalendarBackground() { // from class: com.necer.calendar.BaseCalendar$$ExternalSyntheticLambda0
                @Override // com.necer.painter.CalendarBackground
                public final Drawable getBackgroundDrawable(LocalDate localDate, int i, int i2) {
                    return BaseCalendar.this.m8178lambda$new$0$comnecercalendarBaseCalendar(localDate, i, i2);
                }
            };
        } else {
            this.mCalendarBackground = new WhiteBackground();
        }
        this.mFirstDayOfWeek = this.mAttrs.firstDayOfWeek;
        this.mAllMonthSixLine = this.mAttrs.allMonthSixLine;
        this.mLastNextMonthClickEnable = this.mAttrs.lastNextMonthClickEnable;
        addOnPageChangeListener(new AnonymousClass1());
        initAdapter();
    }

    /* renamed from: lambda$new$0$com-necer-calendar-BaseCalendar, reason: not valid java name */
    /* synthetic */ Drawable m8178lambda$new$0$comnecercalendarBaseCalendar(LocalDate localDate, int i, int i2) {
        return this.mAttrs.calendarBackground;
    }

    /* renamed from: com.necer.calendar.BaseCalendar$1, reason: invalid class name */
    class AnonymousClass1 extends ViewPager.SimpleOnPageChangeListener {
        AnonymousClass1() {
        }

        /* renamed from: lambda$onPageSelected$0$com-necer-calendar-BaseCalendar$1, reason: not valid java name */
        /* synthetic */ void m8179lambda$onPageSelected$0$comnecercalendarBaseCalendar$1(int i) {
            BaseCalendar.this.drawView(i);
        }

        @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(final int i) {
            BaseCalendar.this.post(new Runnable() { // from class: com.necer.calendar.BaseCalendar$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    BaseCalendar.AnonymousClass1.this.m8179lambda$onPageSelected$0$comnecercalendarBaseCalendar$1(i);
                }
            });
        }

        @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            if (i == 1) {
                BaseCalendar.this.mDateChangeBehavior = DateChangeBehavior.PAGE;
            }
        }
    }

    private void initAdapter() {
        if (this.mCheckModel == CheckModel.SINGLE_DEFAULT_CHECKED) {
            this.mTotalCheckedDateList.clear();
            this.mTotalCheckedDateList.add(this.mInitializeDate);
        }
        if (this.mStartDate.isAfter(this.mEndDate)) {
            throw new IllegalArgumentException(getContext().getString(R.string.N_start_after_end));
        }
        if (this.mStartDate.isBefore(new LocalDate(mDefaultStartDate))) {
            throw new IllegalArgumentException(getContext().getString(R.string.N_start_before_19010101));
        }
        if (this.mEndDate.isAfter(new LocalDate(mDefaultEndDateDate))) {
            throw new IllegalArgumentException(getContext().getString(R.string.N_end_after_20991231));
        }
        if (this.mStartDate.isAfter(this.mInitializeDate) || this.mEndDate.isBefore(this.mInitializeDate)) {
            throw new IllegalArgumentException(getContext().getString(R.string.N_initialize_date_illegal));
        }
        this.mCalendarPagerSize = getTwoDateCount(this.mStartDate, this.mEndDate, this.mFirstDayOfWeek) + 1;
        this.mCalendarCurrIndex = getTwoDateCount(this.mStartDate, this.mInitializeDate, this.mFirstDayOfWeek);
        setAdapter(getPagerAdapter(this.mContext, this));
        setCurrentItem(this.mCalendarCurrIndex);
    }

    @Override // com.necer.calendar.ICalendar
    public void setDateInterval(String str, String str2) {
        try {
            this.mStartDate = new LocalDate(str);
            this.mEndDate = new LocalDate(str2);
            initAdapter();
        } catch (Exception unused) {
            throw new IllegalArgumentException(getContext().getString(R.string.N_date_format_illegal));
        }
    }

    @Override // com.necer.calendar.ICalendar
    public void setInitializeDate(String str) {
        try {
            this.mInitializeDate = new LocalDate(str);
            initAdapter();
        } catch (Exception unused) {
            throw new IllegalArgumentException(getContext().getString(R.string.N_date_format_illegal));
        }
    }

    @Override // com.necer.calendar.ICalendar
    public void setDateInterval(String str, String str2, String str3) {
        try {
            this.mStartDate = new LocalDate(str);
            this.mEndDate = new LocalDate(str2);
            this.mInitializeDate = new LocalDate(str3);
            initAdapter();
        } catch (Exception unused) {
            throw new IllegalArgumentException(getContext().getString(R.string.N_date_format_illegal));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void drawView(int i) {
        ICalendarView iCalendarView = (ICalendarView) findViewWithTag(Integer.valueOf(i));
        if (iCalendarView == null) {
            return;
        }
        if (this.mCheckModel == CheckModel.SINGLE_DEFAULT_CHECKED && this.mDateChangeBehavior == DateChangeBehavior.PAGE) {
            LocalDate pagerInitialDate = iCalendarView.getPagerInitialDate();
            LocalDate localDate = this.mTotalCheckedDateList.get(0);
            LocalDate intervalDate = getIntervalDate(localDate, getTwoDateCount(localDate, pagerInitialDate, this.mFirstDayOfWeek));
            if (this.mDefaultCheckedFirstDate) {
                intervalDate = getFirstDate();
            }
            LocalDate availableDate = getAvailableDate(intervalDate);
            this.mTotalCheckedDateList.clear();
            this.mTotalCheckedDateList.add(availableDate);
        }
        iCalendarView.notifyCalendarView();
        callBack();
    }

    public void onClickCurrentMonthOrWeekDate(LocalDate localDate) {
        jump(localDate, true, DateChangeBehavior.CLICK);
    }

    public void onClickLastMonthDate(LocalDate localDate) {
        if (this.mLastNextMonthClickEnable && this.mScrollEnable) {
            jump(localDate, true, DateChangeBehavior.CLICK_PAGE);
        }
    }

    public void onClickNextMonthDate(LocalDate localDate) {
        if (this.mLastNextMonthClickEnable && this.mScrollEnable) {
            jump(localDate, true, DateChangeBehavior.CLICK_PAGE);
        }
    }

    protected void jump(LocalDate localDate, boolean z, DateChangeBehavior dateChangeBehavior) {
        this.mDateChangeBehavior = dateChangeBehavior;
        if (!isAvailable(localDate)) {
            if (getVisibility() == 0) {
                OnClickDisableDateListener onClickDisableDateListener = this.mOnClickDisableDateListener;
                if (onClickDisableDateListener != null) {
                    onClickDisableDateListener.onClickDisableDate(localDate);
                    return;
                } else {
                    Toast.makeText(getContext(), TextUtils.isEmpty(this.mAttrs.disabledString) ? getResources().getString(R.string.N_disabledString) : this.mAttrs.disabledString, 0).show();
                    return;
                }
            }
            return;
        }
        int twoDateCount = getTwoDateCount(localDate, ((ICalendarView) findViewWithTag(Integer.valueOf(getCurrentItem()))).getPagerInitialDate(), this.mFirstDayOfWeek);
        if (z) {
            if (this.mCheckModel == CheckModel.MULTIPLE) {
                if (!this.mTotalCheckedDateList.contains(localDate)) {
                    if (this.mTotalCheckedDateList.size() == this.mMultipleCount && this.mMultipleCountModel == MultipleCountModel.FULL_CLEAR) {
                        this.mTotalCheckedDateList.clear();
                    } else if (this.mTotalCheckedDateList.size() == this.mMultipleCount && this.mMultipleCountModel == MultipleCountModel.FULL_REMOVE_FIRST) {
                        this.mTotalCheckedDateList.remove(0);
                    }
                    this.mTotalCheckedDateList.add(localDate);
                } else {
                    this.mTotalCheckedDateList.remove(localDate);
                }
            } else {
                this.mTotalCheckedDateList.clear();
                this.mTotalCheckedDateList.add(localDate);
            }
        }
        if (twoDateCount == 0) {
            drawView(getCurrentItem());
        } else {
            setCurrentItem(getCurrentItem() - twoDateCount, Math.abs(twoDateCount) == 1);
        }
    }

    private void callBack() {
        BaseCalendar baseCalendar;
        ICalendarView iCalendarView = (ICalendarView) findViewWithTag(Integer.valueOf(getCurrentItem()));
        LocalDate middleLocalDate = iCalendarView.getMiddleLocalDate();
        List<LocalDate> currPagerCheckDateList = iCalendarView.getCurrPagerCheckDateList();
        if (this instanceof MonthCalendar) {
            middleLocalDate = iCalendarView.getPagerInitialDate();
        } else if (currPagerCheckDateList.size() != 0) {
            middleLocalDate = currPagerCheckDateList.get(0);
        }
        OnMWDateChangeListener onMWDateChangeListener = this.mOnMWDateChangeListener;
        if (onMWDateChangeListener != null) {
            onMWDateChangeListener.onMwDateChange(this, iCalendarView.getPivotDate(), this.mTotalCheckedDateList);
        }
        if (this.mOnCalendarChangedListener == null || this.mCheckModel == CheckModel.MULTIPLE || getVisibility() != 0) {
            baseCalendar = this;
        } else {
            this.mOnCalendarChangedListener.onCalendarChange(this, middleLocalDate.getYear(), middleLocalDate.getMonthOfYear(), currPagerCheckDateList.size() == 0 ? null : currPagerCheckDateList.get(0), this.mDateChangeBehavior);
            baseCalendar = this;
        }
        if (baseCalendar.mOnCalendarMultipleChangedListener != null && baseCalendar.mCheckModel == CheckModel.MULTIPLE && getVisibility() == 0) {
            baseCalendar.mOnCalendarMultipleChangedListener.onCalendarChange(baseCalendar, middleLocalDate.getYear(), middleLocalDate.getMonthOfYear(), currPagerCheckDateList, baseCalendar.mTotalCheckedDateList, baseCalendar.mDateChangeBehavior);
        }
    }

    @Override // com.necer.calendar.ICalendar
    public void notifyCalendar() {
        for (int i = 0; i < getChildCount(); i++) {
            KeyEvent.Callback childAt = getChildAt(i);
            if (childAt instanceof ICalendarView) {
                ((ICalendarView) childAt).notifyCalendarView();
            }
        }
    }

    private LocalDate getAvailableDate(LocalDate localDate) {
        if (localDate.isBefore(this.mStartDate)) {
            return this.mStartDate;
        }
        return localDate.isAfter(this.mEndDate) ? this.mEndDate : localDate;
    }

    @Override // com.necer.calendar.ICalendar
    public void setOnClickDisableDateListener(OnClickDisableDateListener onClickDisableDateListener) {
        this.mOnClickDisableDateListener = onClickDisableDateListener;
    }

    @Override // com.necer.calendar.ICalendar
    public void toNextPager() {
        this.mDateChangeBehavior = DateChangeBehavior.PAGE;
        setCurrentItem(getCurrentItem() + 1, true);
    }

    @Override // com.necer.calendar.ICalendar
    public void toLastPager() {
        this.mDateChangeBehavior = DateChangeBehavior.PAGE;
        setCurrentItem(getCurrentItem() - 1, true);
    }

    @Override // com.necer.calendar.ICalendar
    public void toToday() {
        jump(new LocalDate(), true, DateChangeBehavior.API);
    }

    @Override // com.necer.calendar.ICalendar
    public void jumpDate(String str) {
        try {
            jump(new LocalDate(str), true, DateChangeBehavior.API);
        } catch (Exception unused) {
            throw new IllegalArgumentException(getContext().getString(R.string.N_date_format_illegal));
        }
    }

    @Override // com.necer.calendar.ICalendar
    public void jumpDate(int i, int i2, int i3) {
        try {
            jump(new LocalDate(i, i2, i3), true, DateChangeBehavior.API);
        } catch (Exception unused) {
            throw new IllegalArgumentException("");
        }
    }

    @Override // com.necer.calendar.ICalendar
    public void jumpMonth(int i, int i2) {
        try {
            jump(new LocalDate(i, i2, 1), this.mCheckModel == CheckModel.SINGLE_DEFAULT_CHECKED, DateChangeBehavior.API);
        } catch (Exception unused) {
            throw new IllegalArgumentException(getContext().getString(R.string.N_date_format_jump));
        }
    }

    @Override // com.necer.calendar.ICalendar
    public List<LocalDate> getTotalCheckedDateList() {
        return this.mTotalCheckedDateList;
    }

    @Override // com.necer.calendar.ICalendar
    public void setCheckedDates(List<String> list) {
        if (this.mCheckModel != CheckModel.MULTIPLE) {
            throw new RuntimeException(getContext().getString(R.string.N_set_checked_dates_illegal));
        }
        if (this.mMultipleCountModel != null && list.size() > this.mMultipleCount) {
            throw new RuntimeException(getContext().getString(R.string.N_set_checked_dates_count_illegal));
        }
        this.mTotalCheckedDateList.clear();
        for (int i = 0; i < list.size(); i++) {
            try {
                this.mTotalCheckedDateList.add(new LocalDate(list.get(i)));
            } catch (Exception unused) {
                throw new IllegalArgumentException(getContext().getString(R.string.N_date_format_illegal));
            }
        }
    }

    public boolean isAvailable(LocalDate localDate) {
        return (localDate.isBefore(this.mStartDate) || localDate.isAfter(this.mEndDate)) ? false : true;
    }

    public LocalDate getInitializeDate() {
        return this.mInitializeDate;
    }

    public int getCalendarCurrIndex() {
        return this.mCalendarCurrIndex;
    }

    public int getCalendarPagerSize() {
        return this.mCalendarPagerSize;
    }

    public int getFirstDayOfWeek() {
        return this.mFirstDayOfWeek;
    }

    public boolean isAllMonthSixLine() {
        return this.mAllMonthSixLine;
    }

    public CalendarBuild getCalendarBuild() {
        return this.mCalendarBuild;
    }

    @Override // com.necer.calendar.ICalendar
    public void setCalendarPainter(CalendarPainter calendarPainter) {
        this.mCalendarBuild = CalendarBuild.DRAW;
        this.mCalendarPainter = calendarPainter;
        notifyCalendar();
    }

    @Override // com.necer.calendar.ICalendar
    public void setCalendarAdapter(CalendarAdapter calendarAdapter) {
        this.mCalendarBuild = CalendarBuild.ADAPTER;
        this.mCalendarAdapter = calendarAdapter;
        notifyCalendar();
    }

    @Override // com.necer.calendar.ICalendar
    public CalendarAdapter getCalendarAdapter() {
        return this.mCalendarAdapter;
    }

    @Override // com.necer.calendar.ICalendar
    public CalendarPainter getCalendarPainter() {
        if (this.mCalendarPainter == null) {
            this.mCalendarPainter = new InnerPainter(getContext(), this);
        }
        return this.mCalendarPainter;
    }

    @Override // com.necer.calendar.ICalendar
    public void updateSlideDistance(int i) {
        ICalendarView iCalendarView = (ICalendarView) findViewWithTag(Integer.valueOf(getCurrentItem()));
        if (iCalendarView != null) {
            iCalendarView.updateSlideDistance(i);
        }
    }

    public void exchangeCheckedDateList(List<LocalDate> list) {
        this.mTotalCheckedDateList.clear();
        this.mTotalCheckedDateList.addAll(list);
        notifyCalendar();
    }

    protected void setOnMWDateChangeListener(OnMWDateChangeListener onMWDateChangeListener) {
        this.mOnMWDateChangeListener = onMWDateChangeListener;
    }

    @Override // com.necer.calendar.ICalendar
    public void setOnCalendarChangedListener(OnCalendarChangedListener onCalendarChangedListener) {
        this.mOnCalendarChangedListener = onCalendarChangedListener;
    }

    @Override // com.necer.calendar.ICalendar
    public void setOnCalendarMultipleChangedListener(OnCalendarMultipleChangedListener onCalendarMultipleChangedListener) {
        this.mOnCalendarMultipleChangedListener = onCalendarMultipleChangedListener;
    }

    public LocalDate getFirstDate() {
        ICalendarView iCalendarView = (ICalendarView) findViewWithTag(Integer.valueOf(getCurrentItem()));
        if (iCalendarView != null) {
            return iCalendarView.getCurrPagerFirstDate();
        }
        return null;
    }

    public LocalDate getPivotDate() {
        ICalendarView iCalendarView = (ICalendarView) findViewWithTag(Integer.valueOf(getCurrentItem()));
        if (iCalendarView != null) {
            return iCalendarView.getPivotDate();
        }
        return null;
    }

    public int getDistanceFromTop(LocalDate localDate) {
        ICalendarView iCalendarView = (ICalendarView) findViewWithTag(Integer.valueOf(getCurrentItem()));
        if (iCalendarView != null) {
            return iCalendarView.getDistanceFromTop(localDate);
        }
        return 0;
    }

    public int getPivotDistanceFromTop() {
        ICalendarView iCalendarView = (ICalendarView) findViewWithTag(Integer.valueOf(getCurrentItem()));
        if (iCalendarView != null) {
            return iCalendarView.getPivotDistanceFromTop();
        }
        return 0;
    }

    @Override // com.necer.calendar.ICalendar
    public List<LocalDate> getCurrPagerCheckDateList() {
        ICalendarView iCalendarView = (ICalendarView) findViewWithTag(Integer.valueOf(getCurrentItem()));
        if (iCalendarView != null) {
            return iCalendarView.getCurrPagerCheckDateList();
        }
        return null;
    }

    @Override // com.necer.calendar.ICalendar
    public List<LocalDate> getCurrPagerDateList() {
        ICalendarView iCalendarView = (ICalendarView) findViewWithTag(Integer.valueOf(getCurrentItem()));
        if (iCalendarView != null) {
            return iCalendarView.getCurrPagerDateList();
        }
        return null;
    }

    @Override // com.necer.calendar.ICalendar
    public Attrs getAttrs() {
        return this.mAttrs;
    }

    @Override // com.necer.calendar.ICalendar
    public void setLastNextMonthClickEnable(boolean z) {
        this.mLastNextMonthClickEnable = z;
    }

    @Override // com.necer.calendar.ICalendar
    public void setCheckMode(CheckModel checkModel) {
        this.mCheckModel = checkModel;
        this.mTotalCheckedDateList.clear();
        if (this.mCheckModel == CheckModel.SINGLE_DEFAULT_CHECKED) {
            this.mTotalCheckedDateList.add(this.mInitializeDate);
        }
    }

    @Override // com.necer.calendar.ICalendar
    public CheckModel getCheckModel() {
        return this.mCheckModel;
    }

    @Override // com.necer.calendar.ICalendar
    public void setDefaultCheckedFirstDate(boolean z) {
        this.mDefaultCheckedFirstDate = z;
    }

    @Override // com.necer.calendar.ICalendar
    public void setMultipleCount(int i, MultipleCountModel multipleCountModel) {
        this.mCheckModel = CheckModel.MULTIPLE;
        this.mMultipleCountModel = multipleCountModel;
        this.mMultipleCount = i;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.mScrollEnable) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // com.necer.calendar.ICalendar
    public void setScrollEnable(boolean z) {
        this.mScrollEnable = z;
    }

    @Override // com.necer.calendar.ICalendar
    public void setCalendarBackground(CalendarBackground calendarBackground) {
        this.mCalendarBackground = calendarBackground;
    }

    @Override // com.necer.calendar.ICalendar
    public CalendarBackground getCalendarBackground() {
        return this.mCalendarBackground;
    }
}
