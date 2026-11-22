package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.MyTitleBar;
import com.wakeup.howear.R;

/* loaded from: classes3.dex */
public final class ActivityTemperatureunitBinding implements ViewBinding {
    public final LinearLayout llTemperature;
    public final LinearLayout llToChange;
    private final LinearLayout rootView;
    public final MyTitleBar topBar;
    public final TextView tvCelsius;
    public final TextView tvFahrenheit;

    private ActivityTemperatureunitBinding(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, MyTitleBar myTitleBar, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.llTemperature = linearLayout2;
        this.llToChange = linearLayout3;
        this.topBar = myTitleBar;
        this.tvCelsius = textView;
        this.tvFahrenheit = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityTemperatureunitBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityTemperatureunitBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_temperatureunit, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityTemperatureunitBinding bind(View view) {
        int i = R.id.ll_temperature;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.llToChange;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout2 != null) {
                i = R.id.topBar;
                MyTitleBar myTitleBar = (MyTitleBar) ViewBindings.findChildViewById(view, i);
                if (myTitleBar != null) {
                    i = R.id.tv_celsius;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = R.id.tv_fahrenheit;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            return new ActivityTemperatureunitBinding((LinearLayout) view, linearLayout, linearLayout2, myTitleBar, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
