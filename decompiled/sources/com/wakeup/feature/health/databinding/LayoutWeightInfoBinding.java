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
public final class LayoutWeightInfoBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final TextView tvWeightHint;
    public final TextView tvWeightIllustrateTitle;
    public final ItemWeightReferenceLayoutBinding weightReferenceLayout;

    private LayoutWeightInfoBinding(LinearLayout linearLayout, TextView textView, TextView textView2, ItemWeightReferenceLayoutBinding itemWeightReferenceLayoutBinding) {
        this.rootView = linearLayout;
        this.tvWeightHint = textView;
        this.tvWeightIllustrateTitle = textView2;
        this.weightReferenceLayout = itemWeightReferenceLayoutBinding;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static LayoutWeightInfoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutWeightInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_weight_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutWeightInfoBinding bind(View view) {
        View findChildViewById;
        int i = R.id.tv_weight_hint;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.tv_weight_illustrate_title;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.weight_reference_layout))) != null) {
                return new LayoutWeightInfoBinding((LinearLayout) view, textView, textView2, ItemWeightReferenceLayoutBinding.bind(findChildViewById));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
