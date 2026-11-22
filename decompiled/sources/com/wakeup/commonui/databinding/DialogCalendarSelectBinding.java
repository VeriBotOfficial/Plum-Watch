package com.wakeup.commonui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.haibin.calendarview.CalendarLayout;
import com.haibin.calendarview.CalendarView;
import com.wakeup.commonui.R;

/* loaded from: classes2.dex */
public final class DialogCalendarSelectBinding implements ViewBinding {
    public final CalendarLayout calendarLayout;
    public final CalendarView calendarView;
    public final ImageView ivLeft;
    public final ImageView ivRight;
    private final LinearLayoutCompat rootView;
    public final ConstraintLayout topLayout;
    public final TextView tvDate;

    private DialogCalendarSelectBinding(LinearLayoutCompat linearLayoutCompat, CalendarLayout calendarLayout, CalendarView calendarView, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout, TextView textView) {
        this.rootView = linearLayoutCompat;
        this.calendarLayout = calendarLayout;
        this.calendarView = calendarView;
        this.ivLeft = imageView;
        this.ivRight = imageView2;
        this.topLayout = constraintLayout;
        this.tvDate = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static DialogCalendarSelectBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogCalendarSelectBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_calendar_select, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogCalendarSelectBinding bind(View view) {
        int i = R.id.calendar_layout;
        CalendarLayout calendarLayout = (CalendarLayout) ViewBindings.findChildViewById(view, i);
        if (calendarLayout != null) {
            i = R.id.calendarView;
            CalendarView calendarView = (CalendarView) ViewBindings.findChildViewById(view, i);
            if (calendarView != null) {
                i = R.id.iv_left;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.iv_right;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView2 != null) {
                        i = R.id.top_layout;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout != null) {
                            i = R.id.tv_date;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                return new DialogCalendarSelectBinding((LinearLayoutCompat) view, calendarLayout, calendarView, imageView, imageView2, constraintLayout, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
