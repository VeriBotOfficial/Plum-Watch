package com.wakeup.commonui.dialog.calendar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.haibin.calendarview.WeekBar;
import com.wakeup.commonui.R;

/* loaded from: classes2.dex */
public class SimpleWeekBar extends WeekBar {
    public SimpleWeekBar(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.layout_calendar_week, (ViewGroup) this, true);
    }
}
