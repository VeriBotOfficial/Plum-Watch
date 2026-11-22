package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.howear.R;

/* loaded from: classes3.dex */
public final class ItemHolderHomeAdCardBinding implements ViewBinding {
    public final ImageFilterView bg;
    private final ConstraintLayout rootView;

    private ItemHolderHomeAdCardBinding(ConstraintLayout constraintLayout, ImageFilterView imageFilterView) {
        this.rootView = constraintLayout;
        this.bg = imageFilterView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemHolderHomeAdCardBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemHolderHomeAdCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_holder_home_ad_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemHolderHomeAdCardBinding bind(View view) {
        int i = R.id.bg;
        ImageFilterView imageFilterView = (ImageFilterView) ViewBindings.findChildViewById(view, i);
        if (imageFilterView != null) {
            return new ItemHolderHomeAdCardBinding((ConstraintLayout) view, imageFilterView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
