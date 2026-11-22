package com.wakeup.feature.user.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.user.R;

/* loaded from: classes3.dex */
public final class AdapterClockInCalendarDetailItemBinding implements ViewBinding {
    public final AppCompatImageView icon;
    private final ConstraintLayout rootView;

    private AdapterClockInCalendarDetailItemBinding(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView) {
        this.rootView = constraintLayout;
        this.icon = appCompatImageView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static AdapterClockInCalendarDetailItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AdapterClockInCalendarDetailItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.adapter_clock_in_calendar_detail_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static AdapterClockInCalendarDetailItemBinding bind(View view) {
        int i = R.id.icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            return new AdapterClockInCalendarDetailItemBinding((ConstraintLayout) view, appCompatImageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
