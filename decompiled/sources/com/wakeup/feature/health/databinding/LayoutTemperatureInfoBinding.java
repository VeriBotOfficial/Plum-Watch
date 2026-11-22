package com.wakeup.feature.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.health.R;

/* loaded from: classes3.dex */
public final class LayoutTemperatureInfoBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final ItemTemperatureReferenceLayoutBinding temReferenceLayout;
    public final TextView tvTemHint;
    public final TextView tvTemIllustrateTitle;

    private LayoutTemperatureInfoBinding(LinearLayout linearLayout, ItemTemperatureReferenceLayoutBinding itemTemperatureReferenceLayoutBinding, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.temReferenceLayout = itemTemperatureReferenceLayoutBinding;
        this.tvTemHint = textView;
        this.tvTemIllustrateTitle = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static LayoutTemperatureInfoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutTemperatureInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_temperature_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutTemperatureInfoBinding bind(View view) {
        int i = R.id.tem_reference_layout;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            ItemTemperatureReferenceLayoutBinding bind = ItemTemperatureReferenceLayoutBinding.bind(findChildViewById);
            int i2 = R.id.tv_tem_hint;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i2);
            if (textView != null) {
                i2 = R.id.tv_tem_illustrate_title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i2);
                if (textView2 != null) {
                    return new LayoutTemperatureInfoBinding((LinearLayout) view, bind, textView, textView2);
                }
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
