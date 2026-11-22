package com.wakeup.feature.device.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.device.R;

/* loaded from: classes3.dex */
public final class ItemClockBinding implements ViewBinding {
    public final Switch mSwitch;
    private final ConstraintLayout rootView;
    public final TextView tvTime;
    public final TextView tvTip;

    private ItemClockBinding(ConstraintLayout constraintLayout, Switch r2, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.mSwitch = r2;
        this.tvTime = textView;
        this.tvTip = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemClockBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemClockBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_clock, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemClockBinding bind(View view) {
        int i = R.id.mSwitch;
        Switch r1 = (Switch) ViewBindings.findChildViewById(view, i);
        if (r1 != null) {
            i = R.id.tvTime;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.tvTip;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    return new ItemClockBinding((ConstraintLayout) view, r1, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
