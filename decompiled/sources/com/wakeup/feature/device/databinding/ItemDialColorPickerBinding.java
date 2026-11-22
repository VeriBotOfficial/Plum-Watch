package com.wakeup.feature.device.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import com.wakeup.feature.device.R;

/* loaded from: classes3.dex */
public final class ItemDialColorPickerBinding implements ViewBinding {
    public final ShapeableImageView imgColor;
    public final AppCompatImageView ivSelect;
    private final RelativeLayout rootView;

    private ItemDialColorPickerBinding(RelativeLayout relativeLayout, ShapeableImageView shapeableImageView, AppCompatImageView appCompatImageView) {
        this.rootView = relativeLayout;
        this.imgColor = shapeableImageView;
        this.ivSelect = appCompatImageView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ItemDialColorPickerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemDialColorPickerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_dial_color_picker, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemDialColorPickerBinding bind(View view) {
        int i = R.id.img_color;
        ShapeableImageView shapeableImageView = (ShapeableImageView) ViewBindings.findChildViewById(view, i);
        if (shapeableImageView != null) {
            i = R.id.iv_select;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                return new ItemDialColorPickerBinding((RelativeLayout) view, shapeableImageView, appCompatImageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
