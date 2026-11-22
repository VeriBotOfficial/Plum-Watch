package com.wakeup.feature.health.menstrual.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.haibin.calendarview.WeekBar;
import com.wakeup.feature.health.R;

/* loaded from: classes3.dex */
public class MenstrualWeekBar extends WeekBar {
    public MenstrualWeekBar(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.layout_menstrual_calendar_week, (ViewGroup) this, true);
    }
}
