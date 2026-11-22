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
public final class ActivityWeatherBinding implements ViewBinding {
    public final LinearLayout itemTemperature;
    public final LinearLayout llMenu;
    public final Switch mSwitch;
    public final MyTitleBar mTopBar;
    private final LinearLayout rootView;
    public final TextView tv1;
    public final TextView tvTemperature;
    public final TextView tvText;
    public final TextView tvTip;

    private ActivityWeatherBinding(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, Switch r4, MyTitleBar myTitleBar, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = linearLayout;
        this.itemTemperature = linearLayout2;
        this.llMenu = linearLayout3;
        this.mSwitch = r4;
        this.mTopBar = myTitleBar;
        this.tv1 = textView;
        this.tvTemperature = textView2;
        this.tvText = textView3;
        this.tvTip = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityWeatherBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityWeatherBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_weather, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityWeatherBinding bind(View view) {
        int i = R.id.item_temperature;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.llMenu;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout2 != null) {
                i = R.id.mSwitch;
                Switch r6 = (Switch) ViewBindings.findChildViewById(view, i);
                if (r6 != null) {
                    i = R.id.mTopBar;
                    MyTitleBar myTitleBar = (MyTitleBar) ViewBindings.findChildViewById(view, i);
                    if (myTitleBar != null) {
                        i = R.id.tv1;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = R.id.tv_temperature;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                i = R.id.tv_text;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView3 != null) {
                                    i = R.id.tv_tip;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView4 != null) {
                                        return new ActivityWeatherBinding((LinearLayout) view, linearLayout, linearLayout2, r6, myTitleBar, textView, textView2, textView3, textView4);
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
