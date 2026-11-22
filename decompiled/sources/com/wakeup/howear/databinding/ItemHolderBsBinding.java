package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.github.mikephil.charting.charts.LineChart;
import com.wakeup.howear.R;

/* loaded from: classes3.dex */
public final class ItemHolderBsBinding implements ViewBinding {
    public final AppCompatImageView icTitle;
    public final LinearLayoutCompat llBottom;
    public final LineChart mLineChart;
    private final LinearLayoutCompat rootView;
    public final TextView tvTip;
    public final TextView tvTitle;
    public final TextView tvValue;

    private ItemHolderBsBinding(LinearLayoutCompat linearLayoutCompat, AppCompatImageView appCompatImageView, LinearLayoutCompat linearLayoutCompat2, LineChart lineChart, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = linearLayoutCompat;
        this.icTitle = appCompatImageView;
        this.llBottom = linearLayoutCompat2;
        this.mLineChart = lineChart;
        this.tvTip = textView;
        this.tvTitle = textView2;
        this.tvValue = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static ItemHolderBsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemHolderBsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_holder_bs, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemHolderBsBinding bind(View view) {
        int i = R.id.ic_title;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.ll_bottom;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
            if (linearLayoutCompat != null) {
                i = R.id.mLineChart;
                LineChart lineChart = (LineChart) ViewBindings.findChildViewById(view, i);
                if (lineChart != null) {
                    i = R.id.tv_tip;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = R.id.tv_title;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = R.id.tv_value;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView3 != null) {
                                return new ItemHolderBsBinding((LinearLayoutCompat) view, appCompatImageView, linearLayoutCompat, lineChart, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
