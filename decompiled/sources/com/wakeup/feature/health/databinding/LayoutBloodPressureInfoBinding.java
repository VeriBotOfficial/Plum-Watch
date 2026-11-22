package com.wakeup.feature.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.health.R;

/* loaded from: classes3.dex */
public final class LayoutBloodPressureInfoBinding implements ViewBinding {
    public final AppCompatTextView hint1;
    public final AppCompatTextView hint2;
    private final LinearLayoutCompat rootView;

    private LayoutBloodPressureInfoBinding(LinearLayoutCompat linearLayoutCompat, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.rootView = linearLayoutCompat;
        this.hint1 = appCompatTextView;
        this.hint2 = appCompatTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static LayoutBloodPressureInfoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutBloodPressureInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_blood_pressure_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutBloodPressureInfoBinding bind(View view) {
        int i = R.id.hint_1;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
        if (appCompatTextView != null) {
            i = R.id.hint_2;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView2 != null) {
                return new LayoutBloodPressureInfoBinding((LinearLayoutCompat) view, appCompatTextView, appCompatTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
