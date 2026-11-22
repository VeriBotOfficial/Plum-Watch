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
public final class ViewSleepTimeBinding implements ViewBinding {
    public final AppCompatImageView ivAdd;
    public final LinearLayoutCompat ivData;
    public final AppCompatImageView ivDel;
    public final LinearLayoutCompat ivEmpty;
    private final FrameLayout rootView;
    public final BarChartView sleepTimeChart;
    public final TextView tvSleepTimeMinText;
    public final TextView tvSleepTimeMinValue;
    public final TextView tvSleepTimeText;
    public final TextView tvSleepTimeValue;

    private ViewSleepTimeBinding(FrameLayout frameLayout, AppCompatImageView appCompatImageView, LinearLayoutCompat linearLayoutCompat, AppCompatImageView appCompatImageView2, LinearLayoutCompat linearLayoutCompat2, BarChartView barChartView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = frameLayout;
        this.ivAdd = appCompatImageView;
        this.ivData = linearLayoutCompat;
        this.ivDel = appCompatImageView2;
        this.ivEmpty = linearLayoutCompat2;
        this.sleepTimeChart = barChartView;
        this.tvSleepTimeMinText = textView;
        this.tvSleepTimeMinValue = textView2;
        this.tvSleepTimeText = textView3;
        this.tvSleepTimeValue = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static ViewSleepTimeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ViewSleepTimeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.view_sleep_time, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ViewSleepTimeBinding bind(View view) {
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
                        i = R.id.sleep_time_chart;
                        BarChartView barChartView = (BarChartView) ViewBindings.findChildViewById(view, i);
                        if (barChartView != null) {
                            i = R.id.tv_sleep_time_min_text;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                i = R.id.tv_sleep_time_min_value;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView2 != null) {
                                    i = R.id.tv_sleep_time_text;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView3 != null) {
                                        i = R.id.tv_sleep_time_value;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView4 != null) {
                                            return new ViewSleepTimeBinding((FrameLayout) view, appCompatImageView, linearLayoutCompat, appCompatImageView2, linearLayoutCompat2, barChartView, textView, textView2, textView3, textView4);
                                        }
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
