package com.wakeup.feature.plans.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.wakeup.feature.plans.R;

/* loaded from: classes3.dex */
public final class PlansItemTemplateBinding implements ViewBinding {
    public final MaterialCardView cardRoot;
    private final MaterialCardView rootView;
    public final TextView tvEmoji;
    public final TextView tvHint;
    public final TextView tvTitle;

    private PlansItemTemplateBinding(MaterialCardView materialCardView, MaterialCardView materialCardView2, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = materialCardView;
        this.cardRoot = materialCardView2;
        this.tvEmoji = textView;
        this.tvHint = textView2;
        this.tvTitle = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public MaterialCardView getRoot() {
        return this.rootView;
    }

    public static PlansItemTemplateBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static PlansItemTemplateBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.plans_item_template, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static PlansItemTemplateBinding bind(View view) {
        MaterialCardView materialCardView = (MaterialCardView) view;
        int i = R.id.tvEmoji;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.tvHint;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = R.id.tvTitle;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView3 != null) {
                    return new PlansItemTemplateBinding(materialCardView, materialCardView, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
