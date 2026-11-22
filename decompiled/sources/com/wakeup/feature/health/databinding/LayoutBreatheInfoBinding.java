package com.wakeup.feature.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.health.R;

/* loaded from: classes3.dex */
public final class LayoutBreatheInfoBinding implements ViewBinding {
    public final ItemBreatheReferenceLayoutBinding breatheReferenceLayout;
    private final LinearLayout rootView;

    private LayoutBreatheInfoBinding(LinearLayout linearLayout, ItemBreatheReferenceLayoutBinding itemBreatheReferenceLayoutBinding) {
        this.rootView = linearLayout;
        this.breatheReferenceLayout = itemBreatheReferenceLayoutBinding;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static LayoutBreatheInfoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutBreatheInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_breathe_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutBreatheInfoBinding bind(View view) {
        int i = R.id.breathe_reference_layout;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new LayoutBreatheInfoBinding((LinearLayout) view, ItemBreatheReferenceLayoutBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
