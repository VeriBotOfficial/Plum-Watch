package com.wakeup.feature.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.MyTitleBar;
import com.wakeup.commonui.view.ScaleView;
import com.wakeup.feature.health.R;

/* loaded from: classes3.dex */
public final class ActivityWeightAddBinding implements ViewBinding {
    public final LinearLayout llDate;
    public final LinearLayout llTime;
    private final LinearLayoutCompat rootView;
    public final ScaleView scaleView;
    public final MyTitleBar titleBar;
    public final TextView tvAdd;
    public final TextView tvDate;
    public final TextView tvTime;
    public final TextView tvUnit;
    public final TextView tvValue;

    private ActivityWeightAddBinding(LinearLayoutCompat linearLayoutCompat, LinearLayout linearLayout, LinearLayout linearLayout2, ScaleView scaleView, MyTitleBar myTitleBar, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = linearLayoutCompat;
        this.llDate = linearLayout;
        this.llTime = linearLayout2;
        this.scaleView = scaleView;
        this.titleBar = myTitleBar;
        this.tvAdd = textView;
        this.tvDate = textView2;
        this.tvTime = textView3;
        this.tvUnit = textView4;
        this.tvValue = textView5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static ActivityWeightAddBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityWeightAddBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_weight_add, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityWeightAddBinding bind(View view) {
        int i = R.id.ll_date;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.ll_time;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout2 != null) {
                i = R.id.scale_view;
                ScaleView scaleView = (ScaleView) ViewBindings.findChildViewById(view, i);
                if (scaleView != null) {
                    i = R.id.title_bar;
                    MyTitleBar myTitleBar = (MyTitleBar) ViewBindings.findChildViewById(view, i);
                    if (myTitleBar != null) {
                        i = R.id.tv_add;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = R.id.tv_date;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                i = R.id.tv_time;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView3 != null) {
                                    i = R.id.tv_unit;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView4 != null) {
                                        i = R.id.tv_value;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView5 != null) {
                                            return new ActivityWeightAddBinding((LinearLayoutCompat) view, linearLayout, linearLayout2, scaleView, myTitleBar, textView, textView2, textView3, textView4, textView5);
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
