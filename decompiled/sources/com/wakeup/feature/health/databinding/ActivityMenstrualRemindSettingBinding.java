package com.wakeup.feature.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.MyTitleBar;
import com.wakeup.feature.health.R;

/* loaded from: classes3.dex */
public final class ActivityMenstrualRemindSettingBinding implements ViewBinding {
    public final Switch endSwich;
    public final Switch fertilePeriodEndSwich;
    public final Switch fertilePeriodStartSwich;
    public final MyTitleBar mTopBar;
    public final Switch menstrualCycleSwitch;
    private final LinearLayout rootView;
    public final Switch swich;
    public final TextView tvEndOfPeriod;
    public final TextView tvFertilePeriodEnd;
    public final TextView tvFertilePeriodStart;
    public final TextView tvPeriodStarts;
    public final TextView tvRemind;

    private ActivityMenstrualRemindSettingBinding(LinearLayout linearLayout, Switch r2, Switch r3, Switch r4, MyTitleBar myTitleBar, Switch r6, Switch r7, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = linearLayout;
        this.endSwich = r2;
        this.fertilePeriodEndSwich = r3;
        this.fertilePeriodStartSwich = r4;
        this.mTopBar = myTitleBar;
        this.menstrualCycleSwitch = r6;
        this.swich = r7;
        this.tvEndOfPeriod = textView;
        this.tvFertilePeriodEnd = textView2;
        this.tvFertilePeriodStart = textView3;
        this.tvPeriodStarts = textView4;
        this.tvRemind = textView5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityMenstrualRemindSettingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityMenstrualRemindSettingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_menstrual_remind_setting, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityMenstrualRemindSettingBinding bind(View view) {
        int i = R.id.end_swich;
        Switch r4 = (Switch) ViewBindings.findChildViewById(view, i);
        if (r4 != null) {
            i = R.id.fertile_period_end_swich;
            Switch r5 = (Switch) ViewBindings.findChildViewById(view, i);
            if (r5 != null) {
                i = R.id.fertile_period_start_swich;
                Switch r6 = (Switch) ViewBindings.findChildViewById(view, i);
                if (r6 != null) {
                    i = R.id.mTopBar;
                    MyTitleBar myTitleBar = (MyTitleBar) ViewBindings.findChildViewById(view, i);
                    if (myTitleBar != null) {
                        i = R.id.menstrual_cycle_switch;
                        Switch r8 = (Switch) ViewBindings.findChildViewById(view, i);
                        if (r8 != null) {
                            i = R.id.swich;
                            Switch r9 = (Switch) ViewBindings.findChildViewById(view, i);
                            if (r9 != null) {
                                i = R.id.tv_end_of_period;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView != null) {
                                    i = R.id.tv_fertile_period_end;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView2 != null) {
                                        i = R.id.tv_fertile_period_start;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView3 != null) {
                                            i = R.id.tv_period_starts;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView4 != null) {
                                                i = R.id.tv_remind;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView5 != null) {
                                                    return new ActivityMenstrualRemindSettingBinding((LinearLayout) view, r4, r5, r6, myTitleBar, r8, r9, textView, textView2, textView3, textView4, textView5);
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
