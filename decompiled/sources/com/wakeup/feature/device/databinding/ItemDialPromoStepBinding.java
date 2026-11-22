package com.wakeup.feature.device.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.device.R;

/* loaded from: classes3.dex */
public final class ItemDialPromoStepBinding implements ViewBinding {
    public final FrameLayout flStepDot;
    public final ImageView ivStepCheck;
    private final LinearLayout rootView;
    public final TextView tvStepLabel;
    public final TextView tvStepNum;
    public final View vStepLine;

    private ItemDialPromoStepBinding(LinearLayout linearLayout, FrameLayout frameLayout, ImageView imageView, TextView textView, TextView textView2, View view) {
        this.rootView = linearLayout;
        this.flStepDot = frameLayout;
        this.ivStepCheck = imageView;
        this.tvStepLabel = textView;
        this.tvStepNum = textView2;
        this.vStepLine = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemDialPromoStepBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemDialPromoStepBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_dial_promo_step, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemDialPromoStepBinding bind(View view) {
        View findChildViewById;
        int i = R.id.fl_step_dot;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.iv_step_check;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.tv_step_label;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.tv_step_num;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.v_step_line))) != null) {
                        return new ItemDialPromoStepBinding((LinearLayout) view, frameLayout, imageView, textView, textView2, findChildViewById);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
