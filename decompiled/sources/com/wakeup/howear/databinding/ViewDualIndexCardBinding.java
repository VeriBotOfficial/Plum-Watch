package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.howear.R;
import com.wakeup.howear.view.home.device.view.BodyIndexRingView;

/* loaded from: classes3.dex */
public final class ViewDualIndexCardBinding implements ViewBinding {
    public final LinearLayout llRecovery;
    public final LinearLayout llRings;
    public final LinearLayout llStrain;
    public final BodyIndexRingView ringRecovery;
    public final BodyIndexRingView ringStrain;
    private final ConstraintLayout rootView;
    public final TextView tvRecoveryLabel;
    public final TextView tvRecoveryMax;
    public final TextView tvRecoveryScore;
    public final TextView tvStrainLabel;
    public final TextView tvStrainMax;
    public final TextView tvStrainScore;
    public final TextView tvSyncTime;
    public final TextView tvTip;

    private ViewDualIndexCardBinding(ConstraintLayout constraintLayout, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, BodyIndexRingView bodyIndexRingView, BodyIndexRingView bodyIndexRingView2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8) {
        this.rootView = constraintLayout;
        this.llRecovery = linearLayout;
        this.llRings = linearLayout2;
        this.llStrain = linearLayout3;
        this.ringRecovery = bodyIndexRingView;
        this.ringStrain = bodyIndexRingView2;
        this.tvRecoveryLabel = textView;
        this.tvRecoveryMax = textView2;
        this.tvRecoveryScore = textView3;
        this.tvStrainLabel = textView4;
        this.tvStrainMax = textView5;
        this.tvStrainScore = textView6;
        this.tvSyncTime = textView7;
        this.tvTip = textView8;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ViewDualIndexCardBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ViewDualIndexCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.view_dual_index_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ViewDualIndexCardBinding bind(View view) {
        int i = R.id.ll_recovery;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.ll_rings;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout2 != null) {
                i = R.id.ll_strain;
                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout3 != null) {
                    i = R.id.ring_recovery;
                    BodyIndexRingView bodyIndexRingView = (BodyIndexRingView) ViewBindings.findChildViewById(view, i);
                    if (bodyIndexRingView != null) {
                        i = R.id.ring_strain;
                        BodyIndexRingView bodyIndexRingView2 = (BodyIndexRingView) ViewBindings.findChildViewById(view, i);
                        if (bodyIndexRingView2 != null) {
                            i = R.id.tv_recovery_label;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                i = R.id.tv_recovery_max;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView2 != null) {
                                    i = R.id.tv_recovery_score;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView3 != null) {
                                        i = R.id.tv_strain_label;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView4 != null) {
                                            i = R.id.tv_strain_max;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView5 != null) {
                                                i = R.id.tv_strain_score;
                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView6 != null) {
                                                    i = R.id.tv_sync_time;
                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView7 != null) {
                                                        i = R.id.tv_tip;
                                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView8 != null) {
                                                            return new ViewDualIndexCardBinding((ConstraintLayout) view, linearLayout, linearLayout2, linearLayout3, bodyIndexRingView, bodyIndexRingView2, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
