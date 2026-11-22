package com.wakeup.feature.user.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.MyTitleBar;
import com.wakeup.feature.user.R;

/* loaded from: classes3.dex */
public final class ActivityAnnualGoalEditBinding implements ViewBinding {
    public final LinearLayoutCompat annualGoalsLl;
    public final ImageView ivAnnualGoalIcon;
    public final LinearLayoutCompat llRoot;
    private final LinearLayoutCompat rootView;
    public final TextView tvGoalDate;
    public final TextView tvGoalTitle;
    public final MyTitleBar tvTitleBar;

    private ActivityAnnualGoalEditBinding(LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2, ImageView imageView, LinearLayoutCompat linearLayoutCompat3, TextView textView, TextView textView2, MyTitleBar myTitleBar) {
        this.rootView = linearLayoutCompat;
        this.annualGoalsLl = linearLayoutCompat2;
        this.ivAnnualGoalIcon = imageView;
        this.llRoot = linearLayoutCompat3;
        this.tvGoalDate = textView;
        this.tvGoalTitle = textView2;
        this.tvTitleBar = myTitleBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static ActivityAnnualGoalEditBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityAnnualGoalEditBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_annual_goal_edit, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityAnnualGoalEditBinding bind(View view) {
        int i = R.id.annual_goals_ll;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
        if (linearLayoutCompat != null) {
            i = R.id.iv_annual_goal_icon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) view;
                i = R.id.tv_goal_date;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.tv_goal_title;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = R.id.tv_title_bar;
                        MyTitleBar myTitleBar = (MyTitleBar) ViewBindings.findChildViewById(view, i);
                        if (myTitleBar != null) {
                            return new ActivityAnnualGoalEditBinding(linearLayoutCompat2, linearLayoutCompat, imageView, linearLayoutCompat2, textView, textView2, myTitleBar);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
