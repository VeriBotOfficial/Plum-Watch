package com.wakeup.feature.device.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import com.wakeup.feature.device.R;

/* loaded from: classes3.dex */
public final class ViewDialNudgeBarBinding implements ViewBinding {
    public final ImageView ivDialNudgeClock;
    public final ShapeableImageView ivDialNudgeDial;
    public final LinearLayout llDialNudgeCountdown;
    public final LinearLayout llDialNudgeRoot;
    public final LinearLayout llDialNudgeRow2;
    public final LinearLayout llDialNudgeTx;
    private final LinearLayout rootView;
    public final TextView tvDialNudgeAction;
    public final TextView tvDialNudgeCountdown;
    public final TextView tvDialNudgeCut;
    public final TextView tvDialNudgePrice;
    public final TextView tvDialNudgeTitle;

    private ViewDialNudgeBarBinding(LinearLayout linearLayout, ImageView imageView, ShapeableImageView shapeableImageView, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = linearLayout;
        this.ivDialNudgeClock = imageView;
        this.ivDialNudgeDial = shapeableImageView;
        this.llDialNudgeCountdown = linearLayout2;
        this.llDialNudgeRoot = linearLayout3;
        this.llDialNudgeRow2 = linearLayout4;
        this.llDialNudgeTx = linearLayout5;
        this.tvDialNudgeAction = textView;
        this.tvDialNudgeCountdown = textView2;
        this.tvDialNudgeCut = textView3;
        this.tvDialNudgePrice = textView4;
        this.tvDialNudgeTitle = textView5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ViewDialNudgeBarBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ViewDialNudgeBarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.view_dial_nudge_bar, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ViewDialNudgeBarBinding bind(View view) {
        int i = R.id.iv_dial_nudge_clock;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.iv_dial_nudge_dial;
            ShapeableImageView shapeableImageView = (ShapeableImageView) ViewBindings.findChildViewById(view, i);
            if (shapeableImageView != null) {
                i = R.id.ll_dial_nudge_countdown;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    LinearLayout linearLayout2 = (LinearLayout) view;
                    i = R.id.ll_dial_nudge_row2;
                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout3 != null) {
                        i = R.id.ll_dial_nudge_tx;
                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout4 != null) {
                            i = R.id.tv_dial_nudge_action;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                i = R.id.tv_dial_nudge_countdown;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView2 != null) {
                                    i = R.id.tv_dial_nudge_cut;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView3 != null) {
                                        i = R.id.tv_dial_nudge_price;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView4 != null) {
                                            i = R.id.tv_dial_nudge_title;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView5 != null) {
                                                return new ViewDialNudgeBarBinding(linearLayout2, imageView, shapeableImageView, linearLayout, linearLayout2, linearLayout3, linearLayout4, textView, textView2, textView3, textView4, textView5);
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
