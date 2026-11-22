package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.MyTitleBar;
import com.wakeup.howear.R;

/* loaded from: classes3.dex */
public final class ActivitySettingBinding implements ViewBinding {
    public final View line1;
    public final View line2;
    public final LinearLayout llClean;
    public final LinearLayout llPrivacy;
    public final LinearLayout llProtocol;
    public final LinearLayout llRoam;
    public final LinearLayout llSafe;
    public final LinearLayout llTemperature;
    public final LinearLayout llUnit;
    private final LinearLayout rootView;
    public final Switch switchRoam;
    public final MyTitleBar topBar;
    public final TextView tvClean;
    public final TextView tvPrivacy;
    public final TextView tvSafe;
    public final TextView tvSetTemperature;
    public final TextView tvSetUnit;
    public final TextView tvTemperature;
    public final TextView tvUnit;

    private ActivitySettingBinding(LinearLayout linearLayout, View view, View view2, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, LinearLayout linearLayout8, Switch r11, MyTitleBar myTitleBar, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        this.rootView = linearLayout;
        this.line1 = view;
        this.line2 = view2;
        this.llClean = linearLayout2;
        this.llPrivacy = linearLayout3;
        this.llProtocol = linearLayout4;
        this.llRoam = linearLayout5;
        this.llSafe = linearLayout6;
        this.llTemperature = linearLayout7;
        this.llUnit = linearLayout8;
        this.switchRoam = r11;
        this.topBar = myTitleBar;
        this.tvClean = textView;
        this.tvPrivacy = textView2;
        this.tvSafe = textView3;
        this.tvSetTemperature = textView4;
        this.tvSetUnit = textView5;
        this.tvTemperature = textView6;
        this.tvUnit = textView7;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivitySettingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivitySettingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_setting, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivitySettingBinding bind(View view) {
        View findChildViewById;
        int i = R.id.line1;
        View findChildViewById2 = ViewBindings.findChildViewById(view, i);
        if (findChildViewById2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.line2))) != null) {
            i = R.id.llClean;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = R.id.llPrivacy;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout2 != null) {
                    i = R.id.llProtocol;
                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout3 != null) {
                        i = R.id.llRoam;
                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout4 != null) {
                            i = R.id.llSafe;
                            LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout5 != null) {
                                i = R.id.llTemperature;
                                LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout6 != null) {
                                    i = R.id.llUnit;
                                    LinearLayout linearLayout7 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout7 != null) {
                                        i = R.id.switch_roam;
                                        Switch r13 = (Switch) ViewBindings.findChildViewById(view, i);
                                        if (r13 != null) {
                                            i = R.id.topBar;
                                            MyTitleBar myTitleBar = (MyTitleBar) ViewBindings.findChildViewById(view, i);
                                            if (myTitleBar != null) {
                                                i = R.id.tvClean;
                                                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView != null) {
                                                    i = R.id.tvPrivacy;
                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView2 != null) {
                                                        i = R.id.tvSafe;
                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView3 != null) {
                                                            i = R.id.tvSetTemperature;
                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView4 != null) {
                                                                i = R.id.tvSetUnit;
                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                if (textView5 != null) {
                                                                    i = R.id.tvTemperature;
                                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                    if (textView6 != null) {
                                                                        i = R.id.tvUnit;
                                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                        if (textView7 != null) {
                                                                            return new ActivitySettingBinding((LinearLayout) view, findChildViewById2, findChildViewById, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, r13, myTitleBar, textView, textView2, textView3, textView4, textView5, textView6, textView7);
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
