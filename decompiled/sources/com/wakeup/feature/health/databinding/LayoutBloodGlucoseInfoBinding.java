package com.wakeup.feature.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.health.R;

/* loaded from: classes3.dex */
public final class LayoutBloodGlucoseInfoBinding implements ViewBinding {
    public final ItemBloodSugarReferenceLayoutBinding llBsReference;
    private final LinearLayout rootView;

    private LayoutBloodGlucoseInfoBinding(LinearLayout linearLayout, ItemBloodSugarReferenceLayoutBinding itemBloodSugarReferenceLayoutBinding) {
        this.rootView = linearLayout;
        this.llBsReference = itemBloodSugarReferenceLayoutBinding;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static LayoutBloodGlucoseInfoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutBloodGlucoseInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_blood_glucose_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutBloodGlucoseInfoBinding bind(View view) {
        int i = R.id.ll_bs_reference;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new LayoutBloodGlucoseInfoBinding((LinearLayout) view, ItemBloodSugarReferenceLayoutBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
