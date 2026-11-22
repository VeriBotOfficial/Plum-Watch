package com.wakeup.commonui.dialog.calendar;

import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.text.format.DateUtils;
import android.view.View;
import com.anythink.core.common.e.a;
import com.haibin.calendarview.CalendarView;
import com.wakeup.commonui.R;
import com.wakeup.commonui.databinding.DialogCalendarSelectBinding;
import com.wakeup.commonui.dialog.BaseDialog;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CalendarSelectDialog.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012$\u0010\u0005\u001a \u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0012\u001a\u00020\tH\u0016J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0007H\u0002J\u0014\u0010\u0015\u001a\u00020\t2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0017J\u000e\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0007J\u0018\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\bH\u0002J\u000e\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011R/\u0010\u0005\u001a \u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/wakeup/commonui/dialog/calendar/CalendarSelectDialog;", "Lcom/wakeup/commonui/dialog/BaseDialog;", "Lcom/wakeup/commonui/databinding/DialogCalendarSelectBinding;", "context", "Landroid/content/Context;", "onSelectListener", "Lkotlin/Function4;", "", "", "", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function4;)V", "getOnSelectListener", "()Lkotlin/jvm/functions/Function4;", "mHandler", "Landroid/os/Handler;", "listener", "Lcom/haibin/calendarview/CalendarView$OnMonthChangeListener;", "initViews", "refreshView", "time", "setSchemeDate", "schemeList", "", "show", "setTime", "year", a.C0193a.j, "setMonthChange", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CalendarSelectDialog extends BaseDialog<DialogCalendarSelectBinding> {
    private CalendarView.OnMonthChangeListener listener;
    private final Handler mHandler;
    private final Function4<Long, Integer, Integer, Integer, Unit> onSelectListener;

    public final Function4<Long, Integer, Integer, Integer, Unit> getOnSelectListener() {
        return this.onSelectListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CalendarSelectDialog(Context context, Function4<? super Long, ? super Integer, ? super Integer, ? super Integer, Unit> onSelectListener) {
        super(context, R.style.BaseDialog);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onSelectListener, "onSelectListener");
        this.onSelectListener = onSelectListener;
        this.mHandler = new Handler(Looper.getMainLooper());
    }

    @Override // com.wakeup.commonui.dialog.BaseDialog
    public void initViews() {
        super.initViews();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        getMBinding().calendarView.setRange(1990, 1, 1, calendar.get(1), calendar.get(2) + 1, calendar.get(5));
        getMBinding().calendarView.setOnMonthChangeListener(new CalendarView.OnMonthChangeListener() { // from class: com.wakeup.commonui.dialog.calendar.CalendarSelectDialog$$ExternalSyntheticLambda1
            @Override // com.haibin.calendarview.CalendarView.OnMonthChangeListener
            public final void onMonthChange(int i, int i2) {
                CalendarSelectDialog.initViews$lambda$1(CalendarSelectDialog.this, i, i2);
            }
        });
        getMBinding().ivLeft.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.commonui.dialog.calendar.CalendarSelectDialog$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CalendarSelectDialog.initViews$lambda$2(CalendarSelectDialog.this, view);
            }
        });
        getMBinding().ivRight.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.commonui.dialog.calendar.CalendarSelectDialog$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CalendarSelectDialog.initViews$lambda$3(CalendarSelectDialog.this, view);
            }
        });
        getMBinding().calendarView.setSchemeColor(Color.parseColor("#FF7300"), Color.parseColor("#333333"), Color.parseColor("#333333"));
        getMBinding().calendarView.setOnCalendarSelectListener(new CalendarView.OnCalendarSelectListener() { // from class: com.wakeup.commonui.dialog.calendar.CalendarSelectDialog$initViews$4
            @Override // com.haibin.calendarview.CalendarView.OnCalendarSelectListener
            public void onCalendarOutOfRange(com.haibin.calendarview.Calendar calendar2) {
                Intrinsics.checkNotNullParameter(calendar2, "calendar");
            }

            @Override // com.haibin.calendarview.CalendarView.OnCalendarSelectListener
            public void onCalendarSelect(com.haibin.calendarview.Calendar calendar2, boolean isClick) {
                Intrinsics.checkNotNullParameter(calendar2, "calendar");
                if (isClick) {
                    CalendarSelectDialog.this.getOnSelectListener().invoke(Long.valueOf(calendar2.getTimeInMillis() / 1000), Integer.valueOf(calendar2.getYear()), Integer.valueOf(calendar2.getMonth()), Integer.valueOf(calendar2.getDay()));
                    CalendarSelectDialog.this.dismiss();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$1(CalendarSelectDialog calendarSelectDialog, int i, int i2) {
        calendarSelectDialog.setTime(i, i2);
        CalendarView.OnMonthChangeListener onMonthChangeListener = calendarSelectDialog.listener;
        if (onMonthChangeListener != null) {
            onMonthChangeListener.onMonthChange(i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$2(CalendarSelectDialog calendarSelectDialog, View view) {
        calendarSelectDialog.getMBinding().calendarView.scrollToPre();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$3(CalendarSelectDialog calendarSelectDialog, View view) {
        calendarSelectDialog.getMBinding().calendarView.scrollToNext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshView(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time * 1000);
        int i = calendar.get(1);
        int i2 = calendar.get(2) + 1;
        int i3 = calendar.get(5);
        getMBinding().calendarView.setMonthViewScrollable(false);
        getMBinding().calendarView.setMonthViewScrollable(false);
        getMBinding().calendarView.setYearViewScrollable(false);
        getMBinding().calendarView.scrollToCalendar(i, i2, i3, false);
        setTime(i, i2);
    }

    public final void setSchemeDate(List<Long> schemeList) {
        Intrinsics.checkNotNullParameter(schemeList, "schemeList");
        if (isShowing()) {
            getMBinding().calendarView.clearSchemeDate();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<Long> it = schemeList.iterator();
            while (it.hasNext()) {
                long longValue = it.next().longValue();
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(longValue * 1000);
                com.haibin.calendarview.Calendar calendar2 = new com.haibin.calendarview.Calendar();
                calendar2.setYear(calendar.get(1));
                calendar2.setMonth(calendar.get(2) + 1);
                calendar2.setDay(calendar.get(5));
                linkedHashMap.put(calendar2.toString(), calendar2);
            }
            getMBinding().calendarView.setSchemeDate(linkedHashMap);
        }
    }

    public final void show(final long time) {
        super.show();
        this.mHandler.post(new Runnable() { // from class: com.wakeup.commonui.dialog.calendar.CalendarSelectDialog$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CalendarSelectDialog.this.refreshView(time);
            }
        });
    }

    private final void setTime(int year, int month) {
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(2) + 1;
        int i2 = calendar.get(1);
        calendar.set(2, month - 1);
        calendar.set(1, year);
        getMBinding().tvDate.setText(DateUtils.formatDateTime(getMContext(), calendar.getTimeInMillis(), 52));
        getMBinding().ivRight.setVisibility((i == month && i2 == year) ? 4 : 0);
    }

    public final void setMonthChange(CalendarView.OnMonthChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
    }
}
