package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.howear.R;

/* loaded from: classes3.dex */
public final class LayoutHealthyBasicDataBinding implements ViewBinding {
    public final AppCompatImageView ivFitArrow;
    private final LinearLayout rootView;
    public final AppCompatTextView tvDurationTarget;
    public final AppCompatTextView tvDurationValue;
    public final AppCompatTextView tvExerciseTimeTitle;
    public final AppCompatTextView tvKcalTarget;
    public final AppCompatTextView tvKcalTitle;
    public final AppCompatTextView tvKcalValue;
    public final AppCompatTextView tvSportCount;
    public final AppCompatTextView tvSportCountTarget;
    public final AppCompatTextView tvSportCountTitle;
    public final AppCompatTextView tvStepTitle;
    public final AppCompatTextView tvStepValue;
    public final AppCompatTextView tvStepValueDes;

    private LayoutHealthyBasicDataBinding(LinearLayout linearLayout, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, AppCompatTextView appCompatTextView5, AppCompatTextView appCompatTextView6, AppCompatTextView appCompatTextView7, AppCompatTextView appCompatTextView8, AppCompatTextView appCompatTextView9, AppCompatTextView appCompatTextView10, AppCompatTextView appCompatTextView11, AppCompatTextView appCompatTextView12) {
        this.rootView = linearLayout;
        this.ivFitArrow = appCompatImageView;
        this.tvDurationTarget = appCompatTextView;
        this.tvDurationValue = appCompatTextView2;
        this.tvExerciseTimeTitle = appCompatTextView3;
        this.tvKcalTarget = appCompatTextView4;
        this.tvKcalTitle = appCompatTextView5;
        this.tvKcalValue = appCompatTextView6;
        this.tvSportCount = appCompatTextView7;
        this.tvSportCountTarget = appCompatTextView8;
        this.tvSportCountTitle = appCompatTextView9;
        this.tvStepTitle = appCompatTextView10;
        this.tvStepValue = appCompatTextView11;
        this.tvStepValueDes = appCompatTextView12;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static LayoutHealthyBasicDataBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutHealthyBasicDataBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_healthy_basic_data, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutHealthyBasicDataBinding bind(View view) {
        int i = R.id.iv_fit_arrow;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.tv_duration_target;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView != null) {
                i = R.id.tv_duration_value;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView2 != null) {
                    i = R.id.tv_exercise_time_title;
                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView3 != null) {
                        i = R.id.tv_kcal_target;
                        AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView4 != null) {
                            i = R.id.tv_kcal_title;
                            AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                            if (appCompatTextView5 != null) {
                                i = R.id.tv_kcal_value;
                                AppCompatTextView appCompatTextView6 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView6 != null) {
                                    i = R.id.tv_sport_count;
                                    AppCompatTextView appCompatTextView7 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                    if (appCompatTextView7 != null) {
                                        i = R.id.tv_sport_count_target;
                                        AppCompatTextView appCompatTextView8 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                        if (appCompatTextView8 != null) {
                                            i = R.id.tv_sport_count_title;
                                            AppCompatTextView appCompatTextView9 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                            if (appCompatTextView9 != null) {
                                                i = R.id.tv_step_title;
                                                AppCompatTextView appCompatTextView10 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                if (appCompatTextView10 != null) {
                                                    i = R.id.tv_step_value;
                                                    AppCompatTextView appCompatTextView11 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                    if (appCompatTextView11 != null) {
                                                        i = R.id.tv_step_value_des;
                                                        AppCompatTextView appCompatTextView12 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                        if (appCompatTextView12 != null) {
                                                            return new LayoutHealthyBasicDataBinding((LinearLayout) view, appCompatImageView, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5, appCompatTextView6, appCompatTextView7, appCompatTextView8, appCompatTextView9, appCompatTextView10, appCompatTextView11, appCompatTextView12);
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
