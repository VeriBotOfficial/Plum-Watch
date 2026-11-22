package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.howear.R;
import com.wakeup.howear.view.newui.view.BarChartView;

/* loaded from: classes3.dex */
public final class ViewRespiratoryRateBinding implements ViewBinding {
    public final AppCompatImageView ivAdd;
    public final LinearLayoutCompat ivData;
    public final AppCompatImageView ivDel;
    public final LinearLayoutCompat ivEmpty;
    public final BarChartView respiratoryRateChart;
    private final FrameLayout rootView;
    public final TextView tvRespiratoryRateText;
    public final TextView tvRespiratoryRateValue;

    private ViewRespiratoryRateBinding(FrameLayout frameLayout, AppCompatImageView appCompatImageView, LinearLayoutCompat linearLayoutCompat, AppCompatImageView appCompatImageView2, LinearLayoutCompat linearLayoutCompat2, BarChartView barChartView, TextView textView, TextView textView2) {
        this.rootView = frameLayout;
        this.ivAdd = appCompatImageView;
        this.ivData = linearLayoutCompat;
        this.ivDel = appCompatImageView2;
        this.ivEmpty = linearLayoutCompat2;
        this.respiratoryRateChart = barChartView;
        this.tvRespiratoryRateText = textView;
        this.tvRespiratoryRateValue = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static ViewRespiratoryRateBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ViewRespiratoryRateBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.view_respiratory_rate, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ViewRespiratoryRateBinding bind(View view) {
        int i = R.id.iv_add;
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
                        i = R.id.respiratory_rate_chart;
                        BarChartView barChartView = (BarChartView) ViewBindings.findChildViewById(view, i);
                        if (barChartView != null) {
                            i = R.id.tv_respiratory_rate_text;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                i = R.id.tv_respiratory_rate_value;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView2 != null) {
                                    return new ViewRespiratoryRateBinding((FrameLayout) view, appCompatImageView, linearLayoutCompat, appCompatImageView2, linearLayoutCompat2, barChartView, textView, textView2);
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
