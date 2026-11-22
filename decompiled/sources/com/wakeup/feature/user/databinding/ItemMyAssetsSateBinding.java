package com.wakeup.feature.user.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import com.wakeup.feature.user.R;

/* loaded from: classes3.dex */
public final class ItemMyAssetsSateBinding implements ViewBinding {
    public final Button btnStatus;
    public final ShapeableImageView ivAssets;
    public final ConstraintLayout llMain;
    private final ConstraintLayout rootView;
    public final TextView tvAssetsDes;
    public final TextView tvAssetsName;
    public final TextView tvAssetsValidityPeriod;

    private ItemMyAssetsSateBinding(ConstraintLayout constraintLayout, Button button, ShapeableImageView shapeableImageView, ConstraintLayout constraintLayout2, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = constraintLayout;
        this.btnStatus = button;
        this.ivAssets = shapeableImageView;
        this.llMain = constraintLayout2;
        this.tvAssetsDes = textView;
        this.tvAssetsName = textView2;
        this.tvAssetsValidityPeriod = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemMyAssetsSateBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemMyAssetsSateBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_my_assets_sate, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemMyAssetsSateBinding bind(View view) {
        int i = R.id.btn_status;
        Button button = (Button) ViewBindings.findChildViewById(view, i);
        if (button != null) {
            i = R.id.iv_assets;
            ShapeableImageView shapeableImageView = (ShapeableImageView) ViewBindings.findChildViewById(view, i);
            if (shapeableImageView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = R.id.tv_assets_des;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.tv_assets_name;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = R.id.tv_assets_validity_period;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView3 != null) {
                            return new ItemMyAssetsSateBinding(constraintLayout, button, shapeableImageView, constraintLayout, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
