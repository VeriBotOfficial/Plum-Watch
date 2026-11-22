package com.wakeup.feature.user.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.MyTitleBar;
import com.wakeup.feature.user.R;

/* loaded from: classes3.dex */
public final class ActivityUserinfoBinding implements ViewBinding {
    public final ImageFilterView ivAvatar;
    public final LinearLayout llActivityHeat;
    public final LinearLayout llActivityHour;
    public final LinearLayout llAims;
    public final LinearLayout llAvatar;
    public final LinearLayout llBirthday;
    public final LinearLayout llExerciseDuration;
    public final LinearLayout llHeight;
    public final LinearLayout llNickName;
    public final LinearLayout llNumActivities;
    public final LinearLayout llSex;
    public final LinearLayout llWeight;
    public final MyTitleBar mTopBar;
    private final LinearLayout rootView;
    public final TextView tvActivityHeat;
    public final TextView tvActivityHour;
    public final TextView tvBirthdayStr;
    public final TextView tvExerciseDuration;
    public final TextView tvGoalNum;
    public final TextView tvHeight;
    public final TextView tvNickName;
    public final TextView tvNumActivities;
    public final TextView tvSex;
    public final TextView tvWeight;

    private ActivityUserinfoBinding(LinearLayout linearLayout, ImageFilterView imageFilterView, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, LinearLayout linearLayout8, LinearLayout linearLayout9, LinearLayout linearLayout10, LinearLayout linearLayout11, LinearLayout linearLayout12, MyTitleBar myTitleBar, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10) {
        this.rootView = linearLayout;
        this.ivAvatar = imageFilterView;
        this.llActivityHeat = linearLayout2;
        this.llActivityHour = linearLayout3;
        this.llAims = linearLayout4;
        this.llAvatar = linearLayout5;
        this.llBirthday = linearLayout6;
        this.llExerciseDuration = linearLayout7;
        this.llHeight = linearLayout8;
        this.llNickName = linearLayout9;
        this.llNumActivities = linearLayout10;
        this.llSex = linearLayout11;
        this.llWeight = linearLayout12;
        this.mTopBar = myTitleBar;
        this.tvActivityHeat = textView;
        this.tvActivityHour = textView2;
        this.tvBirthdayStr = textView3;
        this.tvExerciseDuration = textView4;
        this.tvGoalNum = textView5;
        this.tvHeight = textView6;
        this.tvNickName = textView7;
        this.tvNumActivities = textView8;
        this.tvSex = textView9;
        this.tvWeight = textView10;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityUserinfoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityUserinfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_userinfo, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityUserinfoBinding bind(View view) {
        int i = R.id.ivAvatar;
        ImageFilterView imageFilterView = (ImageFilterView) ViewBindings.findChildViewById(view, i);
        if (imageFilterView != null) {
            i = R.id.ll_activity_heat;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = R.id.ll_activity_hour;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout2 != null) {
                    i = R.id.ll_aims;
                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout3 != null) {
                        i = R.id.ll_avatar;
                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout4 != null) {
                            i = R.id.ll_birthday;
                            LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout5 != null) {
                                i = R.id.ll_exercise_duration;
                                LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout6 != null) {
                                    i = R.id.ll_height;
                                    LinearLayout linearLayout7 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout7 != null) {
                                        i = R.id.ll_nickName;
                                        LinearLayout linearLayout8 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                        if (linearLayout8 != null) {
                                            i = R.id.ll_num_activities;
                                            LinearLayout linearLayout9 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                            if (linearLayout9 != null) {
                                                i = R.id.ll_sex;
                                                LinearLayout linearLayout10 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                if (linearLayout10 != null) {
                                                    i = R.id.ll_weight;
                                                    LinearLayout linearLayout11 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                    if (linearLayout11 != null) {
                                                        i = R.id.mTopBar;
                                                        MyTitleBar myTitleBar = (MyTitleBar) ViewBindings.findChildViewById(view, i);
                                                        if (myTitleBar != null) {
                                                            i = R.id.tv_activity_heat;
                                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView != null) {
                                                                i = R.id.tv_activity_hour;
                                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                if (textView2 != null) {
                                                                    i = R.id.tv_BirthdayStr;
                                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                    if (textView3 != null) {
                                                                        i = R.id.tv_exercise_duration;
                                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                        if (textView4 != null) {
                                                                            i = R.id.tv_GoalNum;
                                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                            if (textView5 != null) {
                                                                                i = R.id.tv_height;
                                                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                if (textView6 != null) {
                                                                                    i = R.id.tvNickName;
                                                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (textView7 != null) {
                                                                                        i = R.id.tv_num_activities;
                                                                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (textView8 != null) {
                                                                                            i = R.id.tv_sex;
                                                                                            TextView textView9 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                            if (textView9 != null) {
                                                                                                i = R.id.tv_Weight;
                                                                                                TextView textView10 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                if (textView10 != null) {
                                                                                                    return new ActivityUserinfoBinding((LinearLayout) view, imageFilterView, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, linearLayout8, linearLayout9, linearLayout10, linearLayout11, myTitleBar, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
