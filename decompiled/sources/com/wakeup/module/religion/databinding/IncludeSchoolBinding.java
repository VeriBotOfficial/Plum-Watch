package com.wakeup.module.religion.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.module.religion.R;

/* loaded from: classes4.dex */
public final class IncludeSchoolBinding implements ViewBinding {
    private final ConstraintLayout rootView;
    public final AppCompatImageView timeSchoolIv;
    public final ConstraintLayout timeSchoolLayout;
    public final TextView timeSchoolTv;

    private IncludeSchoolBinding(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout2, TextView textView) {
        this.rootView = constraintLayout;
        this.timeSchoolIv = appCompatImageView;
        this.timeSchoolLayout = constraintLayout2;
        this.timeSchoolTv = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static IncludeSchoolBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeSchoolBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.include_school, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static IncludeSchoolBinding bind(View view) {
        int i = R.id.time_school_iv;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            int i2 = R.id.time_school_tv;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i2);
            if (textView != null) {
                return new IncludeSchoolBinding(constraintLayout, appCompatImageView, constraintLayout, textView);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
