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
public final class ActivityPhyOnOffBinding implements ViewBinding {
    public final Switch mSwitch1;
    public final Switch mSwitch2;
    public final Switch mSwitch3;
    public final Switch mSwitch4;
    public final MyTitleBar mTopBar;
    private final LinearLayout rootView;
    public final TextView tv1;
    public final TextView tv1Hint;
    public final TextView tv2;
    public final TextView tv2Hint;
    public final TextView tv3;
    public final TextView tv3Hint;
    public final TextView tv4;
    public final TextView tv4Hint;

    private ActivityPhyOnOffBinding(LinearLayout linearLayout, Switch r2, Switch r3, Switch r4, Switch r5, MyTitleBar myTitleBar, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8) {
        this.rootView = linearLayout;
        this.mSwitch1 = r2;
        this.mSwitch2 = r3;
        this.mSwitch3 = r4;
        this.mSwitch4 = r5;
        this.mTopBar = myTitleBar;
        this.tv1 = textView;
        this.tv1Hint = textView2;
        this.tv2 = textView3;
        this.tv2Hint = textView4;
        this.tv3 = textView5;
        this.tv3Hint = textView6;
        this.tv4 = textView7;
        this.tv4Hint = textView8;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityPhyOnOffBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityPhyOnOffBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_phy_on_off, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityPhyOnOffBinding bind(View view) {
        int i = R.id.mSwitch1;
        Switch r5 = (Switch) ViewBindings.findChildViewById(view, i);
        if (r5 != null) {
            i = R.id.mSwitch2;
            Switch r6 = (Switch) ViewBindings.findChildViewById(view, i);
            if (r6 != null) {
                i = R.id.mSwitch3;
                Switch r7 = (Switch) ViewBindings.findChildViewById(view, i);
                if (r7 != null) {
                    i = R.id.mSwitch4;
                    Switch r8 = (Switch) ViewBindings.findChildViewById(view, i);
                    if (r8 != null) {
                        i = R.id.mTopBar;
                        MyTitleBar myTitleBar = (MyTitleBar) ViewBindings.findChildViewById(view, i);
                        if (myTitleBar != null) {
                            i = R.id.tv1;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                i = R.id.tv1_hint;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView2 != null) {
                                    i = R.id.tv2;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView3 != null) {
                                        i = R.id.tv2_hint;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView4 != null) {
                                            i = R.id.tv3;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView5 != null) {
                                                i = R.id.tv3_hint;
                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView6 != null) {
                                                    i = R.id.tv4;
                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView7 != null) {
                                                        i = R.id.tv4_hint;
                                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView8 != null) {
                                                            return new ActivityPhyOnOffBinding((LinearLayout) view, r5, r6, r7, r8, myTitleBar, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8);
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
