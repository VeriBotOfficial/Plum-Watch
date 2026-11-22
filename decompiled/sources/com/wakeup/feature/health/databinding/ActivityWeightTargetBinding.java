package com.wakeup.feature.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.MyTitleBar;
import com.wakeup.commonui.view.ScaleView;
import com.wakeup.feature.health.R;

/* loaded from: classes3.dex */
public final class ActivityWeightTargetBinding implements ViewBinding {
    private final LinearLayoutCompat rootView;
    public final ScaleView scaleViewEnd;
    public final ScaleView scaleViewFirst;
    public final MyTitleBar titleBar;
    public final TextView tvSave;
    public final TextView tvUnitEnd;
    public final TextView tvUnitFirst;
    public final TextView tvValueEnd;
    public final TextView tvValueFirst;

    private ActivityWeightTargetBinding(LinearLayoutCompat linearLayoutCompat, ScaleView scaleView, ScaleView scaleView2, MyTitleBar myTitleBar, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = linearLayoutCompat;
        this.scaleViewEnd = scaleView;
        this.scaleViewFirst = scaleView2;
        this.titleBar = myTitleBar;
        this.tvSave = textView;
        this.tvUnitEnd = textView2;
        this.tvUnitFirst = textView3;
        this.tvValueEnd = textView4;
        this.tvValueFirst = textView5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static ActivityWeightTargetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityWeightTargetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_weight_target, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityWeightTargetBinding bind(View view) {
        int i = R.id.scale_view_end;
        ScaleView scaleView = (ScaleView) ViewBindings.findChildViewById(view, i);
        if (scaleView != null) {
            i = R.id.scale_view_first;
            ScaleView scaleView2 = (ScaleView) ViewBindings.findChildViewById(view, i);
            if (scaleView2 != null) {
                i = R.id.title_bar;
                MyTitleBar myTitleBar = (MyTitleBar) ViewBindings.findChildViewById(view, i);
                if (myTitleBar != null) {
                    i = R.id.tv_save;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = R.id.tv_unit_end;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = R.id.tv_unit_first;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView3 != null) {
                                i = R.id.tv_value_end;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView4 != null) {
                                    i = R.id.tv_value_first;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView5 != null) {
                                        return new ActivityWeightTargetBinding((LinearLayoutCompat) view, scaleView, scaleView2, myTitleBar, textView, textView2, textView3, textView4, textView5);
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
