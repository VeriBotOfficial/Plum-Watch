package com.wakeup.feature.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.health.R;

/* loaded from: classes3.dex */
public final class LayoutHeartInfoBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final TextView tvHrFastLow;
    public final TextView tvHrFastUp;
    public final TextView tvHrHintOne;
    public final TextView tvHrHintTwo;
    public final TextView tvHrSlowLow;
    public final TextView tvHrSlowUp;
    public final TextView tvIdealHeartRateLow;
    public final TextView tvIdealHeartRateUp;
    public final TextView tvNormalHrLow;
    public final TextView tvNormalHrUp;

    private LayoutHeartInfoBinding(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10) {
        this.rootView = linearLayout;
        this.tvHrFastLow = textView;
        this.tvHrFastUp = textView2;
        this.tvHrHintOne = textView3;
        this.tvHrHintTwo = textView4;
        this.tvHrSlowLow = textView5;
        this.tvHrSlowUp = textView6;
        this.tvIdealHeartRateLow = textView7;
        this.tvIdealHeartRateUp = textView8;
        this.tvNormalHrLow = textView9;
        this.tvNormalHrUp = textView10;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static LayoutHeartInfoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutHeartInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_heart_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutHeartInfoBinding bind(View view) {
        int i = R.id.tv_hr_fast_low;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.tv_hr_fast_up;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = R.id.tv_hr_hint_one;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView3 != null) {
                    i = R.id.tv_hr_hint_two;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView4 != null) {
                        i = R.id.tv_hr_slow_low;
                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView5 != null) {
                            i = R.id.tv_hr_slow_up;
                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView6 != null) {
                                i = R.id.tv_ideal_heart_rate_low;
                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView7 != null) {
                                    i = R.id.tv_ideal_heart_rate_up;
                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView8 != null) {
                                        i = R.id.tv_normal_hr_low;
                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView9 != null) {
                                            i = R.id.tv_normal_hr_up;
                                            TextView textView10 = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView10 != null) {
                                                return new LayoutHeartInfoBinding((LinearLayout) view, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10);
                                            }
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
