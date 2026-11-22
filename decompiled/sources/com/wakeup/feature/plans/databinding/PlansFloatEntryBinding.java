package com.wakeup.feature.plans.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.plans.R;

/* loaded from: classes3.dex */
public final class PlansFloatEntryBinding implements ViewBinding {
    public final LinearLayout llPlansFloatBody;
    private final View rootView;
    public final TextView tvPlansFloatBadge;

    private PlansFloatEntryBinding(View view, LinearLayout linearLayout, TextView textView) {
        this.rootView = view;
        this.llPlansFloatBody = linearLayout;
        this.tvPlansFloatBadge = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static PlansFloatEntryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.plans_float_entry, viewGroup);
        return bind(viewGroup);
    }

    public static PlansFloatEntryBinding bind(View view) {
        int i = R.id.llPlansFloatBody;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.tvPlansFloatBadge;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                return new PlansFloatEntryBinding(view, linearLayout, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
