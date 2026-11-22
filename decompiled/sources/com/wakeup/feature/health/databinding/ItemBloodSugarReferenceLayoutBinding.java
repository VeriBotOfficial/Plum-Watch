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
public final class ItemBloodSugarReferenceLayoutBinding implements ViewBinding {
    public final ItemBloodSugarReferenceChildLayoutBinding llFastingBloodSugar;
    public final ItemBloodSugarReferenceChildLayoutBinding llOtherBloodSugar;
    private final LinearLayout rootView;
    public final TextView tvHint;

    private ItemBloodSugarReferenceLayoutBinding(LinearLayout linearLayout, ItemBloodSugarReferenceChildLayoutBinding itemBloodSugarReferenceChildLayoutBinding, ItemBloodSugarReferenceChildLayoutBinding itemBloodSugarReferenceChildLayoutBinding2, TextView textView) {
        this.rootView = linearLayout;
        this.llFastingBloodSugar = itemBloodSugarReferenceChildLayoutBinding;
        this.llOtherBloodSugar = itemBloodSugarReferenceChildLayoutBinding2;
        this.tvHint = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemBloodSugarReferenceLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemBloodSugarReferenceLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_blood_sugar_reference_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemBloodSugarReferenceLayoutBinding bind(View view) {
        int i = R.id.ll_fasting_blood_sugar;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            ItemBloodSugarReferenceChildLayoutBinding bind = ItemBloodSugarReferenceChildLayoutBinding.bind(findChildViewById);
            int i2 = R.id.ll_other_blood_sugar;
            View findChildViewById2 = ViewBindings.findChildViewById(view, i2);
            if (findChildViewById2 != null) {
                ItemBloodSugarReferenceChildLayoutBinding bind2 = ItemBloodSugarReferenceChildLayoutBinding.bind(findChildViewById2);
                int i3 = R.id.tv_hint;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i3);
                if (textView != null) {
                    return new ItemBloodSugarReferenceLayoutBinding((LinearLayout) view, bind, bind2, textView);
                }
                i = i3;
            } else {
                i = i2;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
