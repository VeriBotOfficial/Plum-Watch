package com.wakeup.feature.device.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.wakeup.feature.device.R;

/* loaded from: classes3.dex */
public final class LayoutScheduleNoDataBinding implements ViewBinding {
    private final ConstraintLayout rootView;

    private LayoutScheduleNoDataBinding(ConstraintLayout constraintLayout) {
        this.rootView = constraintLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static LayoutScheduleNoDataBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutScheduleNoDataBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_schedule_no_data, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutScheduleNoDataBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new LayoutScheduleNoDataBinding((ConstraintLayout) view);
    }
}
