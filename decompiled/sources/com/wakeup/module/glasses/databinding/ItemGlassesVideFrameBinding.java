package com.wakeup.module.glasses.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.module.glasses.R;

/* loaded from: classes4.dex */
public final class ItemGlassesVideFrameBinding implements ViewBinding {
    public final AppCompatImageView ivFrame;
    private final ConstraintLayout rootView;

    private ItemGlassesVideFrameBinding(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView) {
        this.rootView = constraintLayout;
        this.ivFrame = appCompatImageView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemGlassesVideFrameBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemGlassesVideFrameBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_glasses_vide_frame, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemGlassesVideFrameBinding bind(View view) {
        int i = R.id.iv_frame;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            return new ItemGlassesVideFrameBinding((ConstraintLayout) view, appCompatImageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
