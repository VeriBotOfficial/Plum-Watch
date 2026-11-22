package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.howear.R;

/* loaded from: classes3.dex */
public final class LayoutReturnUserCardBinding implements ViewBinding {
    public final ConstraintLayout clReturnUser;
    public final ImageView ivClose;
    public final LinearLayout llMetrics;
    private final CardView rootView;
    public final TextView tvMetric1Label;
    public final TextView tvMetric1Value;
    public final TextView tvMetric2Label;
    public final TextView tvMetric2Value;
    public final TextView tvMetric3Label;
    public final TextView tvMetric3Value;
    public final TextView tvReturnCta;
    public final TextView tvReturnSubtitle;
    public final TextView tvReturnTitle;

    private LayoutReturnUserCardBinding(CardView cardView, ConstraintLayout constraintLayout, ImageView imageView, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9) {
        this.rootView = cardView;
        this.clReturnUser = constraintLayout;
        this.ivClose = imageView;
        this.llMetrics = linearLayout;
        this.tvMetric1Label = textView;
        this.tvMetric1Value = textView2;
        this.tvMetric2Label = textView3;
        this.tvMetric2Value = textView4;
        this.tvMetric3Label = textView5;
        this.tvMetric3Value = textView6;
        this.tvReturnCta = textView7;
        this.tvReturnSubtitle = textView8;
        this.tvReturnTitle = textView9;
    }

    @Override // androidx.viewbinding.ViewBinding
    public CardView getRoot() {
        return this.rootView;
    }

    public static LayoutReturnUserCardBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutReturnUserCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_return_user_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutReturnUserCardBinding bind(View view) {
        int i = R.id.cl_return_user;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = R.id.iv_close;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.ll_metrics;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = R.id.tv_metric1_label;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = R.id.tv_metric1_value;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = R.id.tv_metric2_label;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView3 != null) {
                                i = R.id.tv_metric2_value;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView4 != null) {
                                    i = R.id.tv_metric3_label;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView5 != null) {
                                        i = R.id.tv_metric3_value;
                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView6 != null) {
                                            i = R.id.tv_return_cta;
                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView7 != null) {
                                                i = R.id.tv_return_subtitle;
                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView8 != null) {
                                                    i = R.id.tv_return_title;
                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView9 != null) {
                                                        return new LayoutReturnUserCardBinding((CardView) view, constraintLayout, imageView, linearLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9);
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
