package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.view.MotionWeekChartView;
import com.wakeup.howear.R;

/* loaded from: classes3.dex */
public final class ItemHolderActiveRainbowBinding implements ViewBinding {
    public final AppCompatImageView icTitle;
    public final LinearLayout llBottom;
    public final MotionWeekChartView rainbowRingView;
    private final LinearLayout rootView;
    public final TextView tvTime;
    public final TextView tvTitle;
    public final TextView tvUnit;
    public final TextView tvValue;

    private ItemHolderActiveRainbowBinding(LinearLayout linearLayout, AppCompatImageView appCompatImageView, LinearLayout linearLayout2, MotionWeekChartView motionWeekChartView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = linearLayout;
        this.icTitle = appCompatImageView;
        this.llBottom = linearLayout2;
        this.rainbowRingView = motionWeekChartView;
        this.tvTime = textView;
        this.tvTitle = textView2;
        this.tvUnit = textView3;
        this.tvValue = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemHolderActiveRainbowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemHolderActiveRainbowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_holder_active_rainbow, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemHolderActiveRainbowBinding bind(View view) {
        int i = R.id.ic_title;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.ll_bottom;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = R.id.rainbowRingView;
                MotionWeekChartView motionWeekChartView = (MotionWeekChartView) ViewBindings.findChildViewById(view, i);
                if (motionWeekChartView != null) {
                    i = R.id.tv_time;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = R.id.tv_title;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = R.id.tv_unit;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView3 != null) {
                                i = R.id.tv_value;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView4 != null) {
                                    return new ItemHolderActiveRainbowBinding((LinearLayout) view, appCompatImageView, linearLayout, motionWeekChartView, textView, textView2, textView3, textView4);
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
