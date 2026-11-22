package com.wakeup.feature.device.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.MyTitleBar;
import com.wakeup.feature.device.R;

/* loaded from: classes3.dex */
public final class ActivityHrEarlyWarningBinding implements ViewBinding {
    public final LinearLayout llIntervalHrtv7;
    public final LinearLayout llIntervalHrtv8;
    public final LinearLayout llTv2;
    public final LinearLayout llTv4;
    public final LinearLayout llTv5;
    public final Switch mSwitch1;
    public final Switch mSwitch3;
    public final Switch mSwitchtv6;
    public final MyTitleBar mTopBar;
    private final LinearLayout rootView;
    public final TextView tv1;
    public final TextView tv2;
    public final TextView tv2IntervalHr;
    public final TextView tv3;
    public final TextView tv4;
    public final TextView tv5;
    public final TextView tv6;
    public final TextView tv7;
    public final TextView tv8;
    public final TextView tvIntervalHrtv4;
    public final TextView tvIntervalHrtv5;
    public final TextView tvIntervalHrtv7;
    public final TextView tvIntervalHrtv8;

    private ActivityHrEarlyWarningBinding(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, Switch r7, Switch r8, Switch r9, MyTitleBar myTitleBar, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13) {
        this.rootView = linearLayout;
        this.llIntervalHrtv7 = linearLayout2;
        this.llIntervalHrtv8 = linearLayout3;
        this.llTv2 = linearLayout4;
        this.llTv4 = linearLayout5;
        this.llTv5 = linearLayout6;
        this.mSwitch1 = r7;
        this.mSwitch3 = r8;
        this.mSwitchtv6 = r9;
        this.mTopBar = myTitleBar;
        this.tv1 = textView;
        this.tv2 = textView2;
        this.tv2IntervalHr = textView3;
        this.tv3 = textView4;
        this.tv4 = textView5;
        this.tv5 = textView6;
        this.tv6 = textView7;
        this.tv7 = textView8;
        this.tv8 = textView9;
        this.tvIntervalHrtv4 = textView10;
        this.tvIntervalHrtv5 = textView11;
        this.tvIntervalHrtv7 = textView12;
        this.tvIntervalHrtv8 = textView13;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityHrEarlyWarningBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityHrEarlyWarningBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_hr_early_warning, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityHrEarlyWarningBinding bind(View view) {
        int i = R.id.ll_intervalHrtv7;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.ll_intervalHrtv8;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout2 != null) {
                i = R.id.ll_tv2;
                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout3 != null) {
                    i = R.id.ll_tv4;
                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout4 != null) {
                        i = R.id.ll_tv5;
                        LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout5 != null) {
                            i = R.id.mSwitch1;
                            Switch r10 = (Switch) ViewBindings.findChildViewById(view, i);
                            if (r10 != null) {
                                i = R.id.mSwitch3;
                                Switch r11 = (Switch) ViewBindings.findChildViewById(view, i);
                                if (r11 != null) {
                                    i = R.id.mSwitchtv6;
                                    Switch r12 = (Switch) ViewBindings.findChildViewById(view, i);
                                    if (r12 != null) {
                                        i = R.id.mTopBar;
                                        MyTitleBar myTitleBar = (MyTitleBar) ViewBindings.findChildViewById(view, i);
                                        if (myTitleBar != null) {
                                            i = R.id.tv1;
                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView != null) {
                                                i = R.id.tv2;
                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView2 != null) {
                                                    i = R.id.tv2_intervalHr;
                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView3 != null) {
                                                        i = R.id.tv3;
                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView4 != null) {
                                                            i = R.id.tv4;
                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView5 != null) {
                                                                i = R.id.tv5;
                                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                if (textView6 != null) {
                                                                    i = R.id.tv6;
                                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                    if (textView7 != null) {
                                                                        i = R.id.tv7;
                                                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                        if (textView8 != null) {
                                                                            i = R.id.tv8;
                                                                            TextView textView9 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                            if (textView9 != null) {
                                                                                i = R.id.tv_intervalHrtv4;
                                                                                TextView textView10 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                if (textView10 != null) {
                                                                                    i = R.id.tv_intervalHrtv5;
                                                                                    TextView textView11 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (textView11 != null) {
                                                                                        i = R.id.tv_intervalHrtv7;
                                                                                        TextView textView12 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (textView12 != null) {
                                                                                            i = R.id.tv_intervalHrtv8;
                                                                                            TextView textView13 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                            if (textView13 != null) {
                                                                                                return new ActivityHrEarlyWarningBinding((LinearLayout) view, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, r10, r11, r12, myTitleBar, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13);
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
