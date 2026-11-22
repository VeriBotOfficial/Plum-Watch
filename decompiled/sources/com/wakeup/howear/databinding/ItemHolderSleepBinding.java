package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.howear.R;
import com.wakeup.howear.view.home.card.SleepHomeItemBarChart;

/* loaded from: classes3.dex */
public final class ItemHolderSleepBinding implements ViewBinding {
    public final AppCompatImageView icTitle;
    public final LinearLayout llBottom;
    public final SleepHomeItemBarChart mSleepBarChart;
    private final LinearLayout rootView;
    public final TextView tvTip;
    public final TextView tvTip1;
    public final TextView tvTip2;
    public final TextView tvTitle;
    public final TextView tvValue1;
    public final TextView tvValue2;

    private ItemHolderSleepBinding(LinearLayout linearLayout, AppCompatImageView appCompatImageView, LinearLayout linearLayout2, SleepHomeItemBarChart sleepHomeItemBarChart, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.rootView = linearLayout;
        this.icTitle = appCompatImageView;
        this.llBottom = linearLayout2;
        this.mSleepBarChart = sleepHomeItemBarChart;
        this.tvTip = textView;
        this.tvTip1 = textView2;
        this.tvTip2 = textView3;
        this.tvTitle = textView4;
        this.tvValue1 = textView5;
        this.tvValue2 = textView6;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemHolderSleepBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemHolderSleepBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_holder_sleep, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemHolderSleepBinding bind(View view) {
        int i = R.id.ic_title;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.ll_bottom;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = R.id.mSleepBarChart;
                SleepHomeItemBarChart sleepHomeItemBarChart = (SleepHomeItemBarChart) ViewBindings.findChildViewById(view, i);
                if (sleepHomeItemBarChart != null) {
                    i = R.id.tv_tip;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = R.id.tv_tip1;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = R.id.tv_tip2;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView3 != null) {
                                i = R.id.tv_title;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView4 != null) {
                                    i = R.id.tv_value1;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView5 != null) {
                                        i = R.id.tv_value2;
                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView6 != null) {
                                            return new ItemHolderSleepBinding((LinearLayout) view, appCompatImageView, linearLayout, sleepHomeItemBarChart, textView, textView2, textView3, textView4, textView5, textView6);
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
