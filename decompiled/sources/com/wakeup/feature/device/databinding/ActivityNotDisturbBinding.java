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
public final class ActivityNotDisturbBinding implements ViewBinding {
    public final LinearLayout llDisturb;
    public final LinearLayout llTiming;
    public final Switch mSwitch3;
    public final Switch mSwitchtv1;
    public final Switch mSwitchtv2;
    public final MyTitleBar mTopBar;
    private final LinearLayout rootView;
    public final TextView tv1;
    public final TextView tv2;
    public final TextView tv3;
    public final TextView tv3Hint;
    public final TextView tvIntervaltiming;
    public final TextView tvtiming;

    private ActivityNotDisturbBinding(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, Switch r4, Switch r5, Switch r6, MyTitleBar myTitleBar, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.rootView = linearLayout;
        this.llDisturb = linearLayout2;
        this.llTiming = linearLayout3;
        this.mSwitch3 = r4;
        this.mSwitchtv1 = r5;
        this.mSwitchtv2 = r6;
        this.mTopBar = myTitleBar;
        this.tv1 = textView;
        this.tv2 = textView2;
        this.tv3 = textView3;
        this.tv3Hint = textView4;
        this.tvIntervaltiming = textView5;
        this.tvtiming = textView6;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityNotDisturbBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityNotDisturbBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_not_disturb, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityNotDisturbBinding bind(View view) {
        int i = R.id.ll_disturb;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.ll_timing;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout2 != null) {
                i = R.id.mSwitch3;
                Switch r7 = (Switch) ViewBindings.findChildViewById(view, i);
                if (r7 != null) {
                    i = R.id.mSwitchtv1;
                    Switch r8 = (Switch) ViewBindings.findChildViewById(view, i);
                    if (r8 != null) {
                        i = R.id.mSwitchtv2;
                        Switch r9 = (Switch) ViewBindings.findChildViewById(view, i);
                        if (r9 != null) {
                            i = R.id.mTopBar;
                            MyTitleBar myTitleBar = (MyTitleBar) ViewBindings.findChildViewById(view, i);
                            if (myTitleBar != null) {
                                i = R.id.tv1;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView != null) {
                                    i = R.id.tv2;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView2 != null) {
                                        i = R.id.tv3;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView3 != null) {
                                            i = R.id.tv3_hint;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView4 != null) {
                                                i = R.id.tv_intervaltiming;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView5 != null) {
                                                    i = R.id.tvtiming;
                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView6 != null) {
                                                        return new ActivityNotDisturbBinding((LinearLayout) view, linearLayout, linearLayout2, r7, r8, r9, myTitleBar, textView, textView2, textView3, textView4, textView5, textView6);
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
