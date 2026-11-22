package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.howear.R;

/* loaded from: classes3.dex */
public final class ViewComponentFillMultiplePiecesBinding implements ViewBinding {
    public final TextView calorieTarget;
    public final TextView calorieValue;
    public final View dividerHealthInsight;
    public final TextView exerciseDurationTarget;
    public final TextView exerciseDurationValue;
    public final LinearLayout flStepsRankEntry;
    public final ConstraintLayout healthFunctionContainer;
    public final ImageView iconCalorie;
    public final ImageView iconExerciseDuration;
    public final ImageView iconHealthInsight;
    public final ImageView iconSteps;
    public final ImageView ivStepsRankIcon;
    public final LinearLayout layoutCalorie;
    public final LinearLayout layoutExerciseDuration;
    public final LinearLayout layoutHealthInsight;
    public final LinearLayout layoutSteps;
    private final ConstraintLayout rootView;
    public final TextView stepsTarget;
    public final TextView stepsValue;
    public final TextView titleCalorie;
    public final TextView titleExerciseDuration;
    public final TextView titleSteps;
    public final TextView tvStepsRankEntry;

    private ViewComponentFillMultiplePiecesBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, View view, TextView textView3, TextView textView4, LinearLayout linearLayout, ConstraintLayout constraintLayout2, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10) {
        this.rootView = constraintLayout;
        this.calorieTarget = textView;
        this.calorieValue = textView2;
        this.dividerHealthInsight = view;
        this.exerciseDurationTarget = textView3;
        this.exerciseDurationValue = textView4;
        this.flStepsRankEntry = linearLayout;
        this.healthFunctionContainer = constraintLayout2;
        this.iconCalorie = imageView;
        this.iconExerciseDuration = imageView2;
        this.iconHealthInsight = imageView3;
        this.iconSteps = imageView4;
        this.ivStepsRankIcon = imageView5;
        this.layoutCalorie = linearLayout2;
        this.layoutExerciseDuration = linearLayout3;
        this.layoutHealthInsight = linearLayout4;
        this.layoutSteps = linearLayout5;
        this.stepsTarget = textView5;
        this.stepsValue = textView6;
        this.titleCalorie = textView7;
        this.titleExerciseDuration = textView8;
        this.titleSteps = textView9;
        this.tvStepsRankEntry = textView10;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ViewComponentFillMultiplePiecesBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ViewComponentFillMultiplePiecesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.view_component_fill_multiple_pieces, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ViewComponentFillMultiplePiecesBinding bind(View view) {
        View findChildViewById;
        int i = R.id.calorie_target;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.calorie_value;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.divider_health_insight))) != null) {
                i = R.id.exercise_duration_target;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView3 != null) {
                    i = R.id.exercise_duration_value;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView4 != null) {
                        i = R.id.fl_steps_rank_entry;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                            i = R.id.icon_calorie;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView != null) {
                                i = R.id.icon_exercise_duration;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView2 != null) {
                                    i = R.id.icon_health_insight;
                                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView3 != null) {
                                        i = R.id.icon_steps;
                                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i);
                                        if (imageView4 != null) {
                                            i = R.id.iv_steps_rank_icon;
                                            ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, i);
                                            if (imageView5 != null) {
                                                i = R.id.layout_calorie;
                                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                if (linearLayout2 != null) {
                                                    i = R.id.layout_exercise_duration;
                                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                    if (linearLayout3 != null) {
                                                        i = R.id.layout_health_insight;
                                                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                        if (linearLayout4 != null) {
                                                            i = R.id.layout_steps;
                                                            LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                            if (linearLayout5 != null) {
                                                                i = R.id.steps_target;
                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                if (textView5 != null) {
                                                                    i = R.id.steps_value;
                                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                    if (textView6 != null) {
                                                                        i = R.id.title_calorie;
                                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                        if (textView7 != null) {
                                                                            i = R.id.title_exercise_duration;
                                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                            if (textView8 != null) {
                                                                                i = R.id.title_steps;
                                                                                TextView textView9 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                if (textView9 != null) {
                                                                                    i = R.id.tv_steps_rank_entry;
                                                                                    TextView textView10 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (textView10 != null) {
                                                                                        return new ViewComponentFillMultiplePiecesBinding(constraintLayout, textView, textView2, findChildViewById, textView3, textView4, linearLayout, constraintLayout, imageView, imageView2, imageView3, imageView4, imageView5, linearLayout2, linearLayout3, linearLayout4, linearLayout5, textView5, textView6, textView7, textView8, textView9, textView10);
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
