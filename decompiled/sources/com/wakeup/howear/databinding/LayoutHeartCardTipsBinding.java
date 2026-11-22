package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.howear.R;

/* loaded from: classes3.dex */
public final class LayoutHeartCardTipsBinding implements ViewBinding {
    public final LinearLayout llHighHeartRate;
    public final LinearLayout llNormalHeartRate;
    public final LinearLayout llSpeedHeartRate;
    private final LinearLayout rootView;
    public final TextView tvHighContent;
    public final TextView tvHighNumber;
    public final TextView tvHighState;
    public final TextView tvNormalContent;
    public final TextView tvNormalNumber;
    public final TextView tvNormalState;
    public final TextView tvSpeedContent;
    public final TextView tvSpeedNumber;
    public final TextView tvSpeedState;

    private LayoutHeartCardTipsBinding(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9) {
        this.rootView = linearLayout;
        this.llHighHeartRate = linearLayout2;
        this.llNormalHeartRate = linearLayout3;
        this.llSpeedHeartRate = linearLayout4;
        this.tvHighContent = textView;
        this.tvHighNumber = textView2;
        this.tvHighState = textView3;
        this.tvNormalContent = textView4;
        this.tvNormalNumber = textView5;
        this.tvNormalState = textView6;
        this.tvSpeedContent = textView7;
        this.tvSpeedNumber = textView8;
        this.tvSpeedState = textView9;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static LayoutHeartCardTipsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutHeartCardTipsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_heart_card_tips, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutHeartCardTipsBinding bind(View view) {
        int i = R.id.ll_high_heart_rate;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.ll_normal_heart_rate;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout2 != null) {
                i = R.id.ll_speed_heart_rate;
                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout3 != null) {
                    i = R.id.tv_high_content;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = R.id.tv_high_number;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = R.id.tv_high_state;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView3 != null) {
                                i = R.id.tv_normal_content;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView4 != null) {
                                    i = R.id.tv_normal_number;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView5 != null) {
                                        i = R.id.tv_normal_state;
                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView6 != null) {
                                            i = R.id.tv_speed_content;
                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView7 != null) {
                                                i = R.id.tv_speed_number;
                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView8 != null) {
                                                    i = R.id.tv_speed_state;
                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView9 != null) {
                                                        return new LayoutHeartCardTipsBinding((LinearLayout) view, linearLayout, linearLayout2, linearLayout3, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
