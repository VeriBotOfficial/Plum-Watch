package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.howear.R;

/* loaded from: classes3.dex */
public final class ViewHealthDataBinding implements ViewBinding {
    public final ImageView imageViewCalories;
    public final AppCompatImageView ivAdd;
    public final LinearLayoutCompat ivData;
    public final AppCompatImageView ivDel;
    public final LinearLayoutCompat ivEmpty;
    private final FrameLayout rootView;
    public final TextView textViewCalories;
    public final TextView textViewCaloriesGoal;
    public final TextView textViewCaloriesGoalEmpty;
    public final TextView textViewCaloriesValue;
    public final TextView textViewDurationGoal;
    public final TextView textViewDurationGoalEmpty;
    public final TextView textViewDurationValue;
    public final TextView textViewSessionsGoal;
    public final TextView textViewSessionsGoalEmpty;
    public final TextView textViewSessionsValue;
    public final TextView textViewStepsGoal;
    public final TextView textViewStepsGoalEmpty;
    public final TextView textViewStepsValue;

    private ViewHealthDataBinding(FrameLayout frameLayout, ImageView imageView, AppCompatImageView appCompatImageView, LinearLayoutCompat linearLayoutCompat, AppCompatImageView appCompatImageView2, LinearLayoutCompat linearLayoutCompat2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13) {
        this.rootView = frameLayout;
        this.imageViewCalories = imageView;
        this.ivAdd = appCompatImageView;
        this.ivData = linearLayoutCompat;
        this.ivDel = appCompatImageView2;
        this.ivEmpty = linearLayoutCompat2;
        this.textViewCalories = textView;
        this.textViewCaloriesGoal = textView2;
        this.textViewCaloriesGoalEmpty = textView3;
        this.textViewCaloriesValue = textView4;
        this.textViewDurationGoal = textView5;
        this.textViewDurationGoalEmpty = textView6;
        this.textViewDurationValue = textView7;
        this.textViewSessionsGoal = textView8;
        this.textViewSessionsGoalEmpty = textView9;
        this.textViewSessionsValue = textView10;
        this.textViewStepsGoal = textView11;
        this.textViewStepsGoalEmpty = textView12;
        this.textViewStepsValue = textView13;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static ViewHealthDataBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ViewHealthDataBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.view_health_data, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ViewHealthDataBinding bind(View view) {
        int i = R.id.imageView_calories;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.iv_add;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = R.id.iv_data;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                if (linearLayoutCompat != null) {
                    i = R.id.iv_del;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                    if (appCompatImageView2 != null) {
                        i = R.id.iv_empty;
                        LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                        if (linearLayoutCompat2 != null) {
                            i = R.id.textView_calories;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                i = R.id.textView_calories_goal;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView2 != null) {
                                    i = R.id.textView_calories_goal_empty;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView3 != null) {
                                        i = R.id.textView_calories_value;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView4 != null) {
                                            i = R.id.textView_duration_goal;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView5 != null) {
                                                i = R.id.textView_duration_goal_empty;
                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView6 != null) {
                                                    i = R.id.textView_duration_value;
                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView7 != null) {
                                                        i = R.id.textView_sessions_goal;
                                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView8 != null) {
                                                            i = R.id.textView_sessions_goal_empty;
                                                            TextView textView9 = (TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView9 != null) {
                                                                i = R.id.textView_sessions_value;
                                                                TextView textView10 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                if (textView10 != null) {
                                                                    i = R.id.textView_steps_goal;
                                                                    TextView textView11 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                    if (textView11 != null) {
                                                                        i = R.id.textView_steps_goal_empty;
                                                                        TextView textView12 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                        if (textView12 != null) {
                                                                            i = R.id.textView_steps_value;
                                                                            TextView textView13 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                            if (textView13 != null) {
                                                                                return new ViewHealthDataBinding((FrameLayout) view, imageView, appCompatImageView, linearLayoutCompat, appCompatImageView2, linearLayoutCompat2, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13);
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
