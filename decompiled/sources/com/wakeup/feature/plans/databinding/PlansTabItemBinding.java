package com.wakeup.feature.plans.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.plans.R;

/* loaded from: classes3.dex */
public final class PlansTabItemBinding implements ViewBinding {
    private final FrameLayout rootView;
    public final TextView tvTabTitle;
    public final View vTabDot;

    private PlansTabItemBinding(FrameLayout frameLayout, TextView textView, View view) {
        this.rootView = frameLayout;
        this.tvTabTitle = textView;
        this.vTabDot = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static PlansTabItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static PlansTabItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.plans_tab_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static PlansTabItemBinding bind(View view) {
        View findChildViewById;
        int i = R.id.tvTabTitle;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.vTabDot))) != null) {
            return new PlansTabItemBinding((FrameLayout) view, textView, findChildViewById);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
