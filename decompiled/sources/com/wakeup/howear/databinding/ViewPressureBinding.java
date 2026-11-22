package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.howear.R;

/* loaded from: classes3.dex */
public final class ViewPressureBinding implements ViewBinding {
    public final View cursorDot;
    public final View cursorLine;
    public final Button edit;
    public final View gradientLine;
    public final AppCompatImageView ivAdd;
    public final LinearLayoutCompat ivData;
    public final AppCompatImageView ivDel;
    public final LinearLayoutCompat ivEmpty;
    public final LinearLayout llValueLabels;
    private final FrameLayout rootView;
    public final TextView tvStepNumberValue;

    private ViewPressureBinding(FrameLayout frameLayout, View view, View view2, Button button, View view3, AppCompatImageView appCompatImageView, LinearLayoutCompat linearLayoutCompat, AppCompatImageView appCompatImageView2, LinearLayoutCompat linearLayoutCompat2, LinearLayout linearLayout, TextView textView) {
        this.rootView = frameLayout;
        this.cursorDot = view;
        this.cursorLine = view2;
        this.edit = button;
        this.gradientLine = view3;
        this.ivAdd = appCompatImageView;
        this.ivData = linearLayoutCompat;
        this.ivDel = appCompatImageView2;
        this.ivEmpty = linearLayoutCompat2;
        this.llValueLabels = linearLayout;
        this.tvStepNumberValue = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static ViewPressureBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ViewPressureBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.view_pressure, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ViewPressureBinding bind(View view) {
        View findChildViewById;
        View findChildViewById2;
        int i = R.id.cursor_dot;
        View findChildViewById3 = ViewBindings.findChildViewById(view, i);
        if (findChildViewById3 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.cursor_line))) != null) {
            i = R.id.edit;
            Button button = (Button) ViewBindings.findChildViewById(view, i);
            if (button != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.gradient_line))) != null) {
                i = R.id.iv_add;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView != null) {
                    i = R.id.iv_data;
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                    if (linearLayoutCompat != null) {
                        i = R.id.iv_del;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                        if (appCompatImageView2 != null) {
                            i = R.id.iv_empty;
                            LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                            if (linearLayoutCompat2 != null) {
                                i = R.id.ll_value_labels;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout != null) {
                                    i = R.id.tv_step_number_value;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView != null) {
                                        return new ViewPressureBinding((FrameLayout) view, findChildViewById3, findChildViewById, button, findChildViewById2, appCompatImageView, linearLayoutCompat, appCompatImageView2, linearLayoutCompat2, linearLayout, textView);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
