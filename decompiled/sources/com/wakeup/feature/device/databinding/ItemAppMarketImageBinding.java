package com.wakeup.feature.device.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import com.wakeup.feature.device.R;

/* loaded from: classes3.dex */
public final class ItemAppMarketImageBinding implements ViewBinding {
    public final ShapeableImageView ivImg;
    private final ConstraintLayout rootView;

    private ItemAppMarketImageBinding(ConstraintLayout constraintLayout, ShapeableImageView shapeableImageView) {
        this.rootView = constraintLayout;
        this.ivImg = shapeableImageView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemAppMarketImageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemAppMarketImageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_app_market_image, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemAppMarketImageBinding bind(View view) {
        int i = R.id.iv_img;
        ShapeableImageView shapeableImageView = (ShapeableImageView) ViewBindings.findChildViewById(view, i);
        if (shapeableImageView != null) {
            return new ItemAppMarketImageBinding((ConstraintLayout) view, shapeableImageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
