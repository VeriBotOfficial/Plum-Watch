package com.wakeup.feature.device.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.device.R;

/* loaded from: classes3.dex */
public final class LayoutCustomizeDialBinding implements ViewBinding {
    public final AppCompatImageView ivBg;
    public final ImageView ivStyleBottom;
    public final ImageView ivStyleCenter;
    public final ImageView ivStyleTop;
    private final LinearLayoutCompat rootView;

    private LayoutCustomizeDialBinding(LinearLayoutCompat linearLayoutCompat, AppCompatImageView appCompatImageView, ImageView imageView, ImageView imageView2, ImageView imageView3) {
        this.rootView = linearLayoutCompat;
        this.ivBg = appCompatImageView;
        this.ivStyleBottom = imageView;
        this.ivStyleCenter = imageView2;
        this.ivStyleTop = imageView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static LayoutCustomizeDialBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutCustomizeDialBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_customize_dial, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutCustomizeDialBinding bind(View view) {
        int i = R.id.iv_bg;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.iv_style_bottom;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.iv_style_center;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    i = R.id.iv_style_top;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView3 != null) {
                        return new LayoutCustomizeDialBinding((LinearLayoutCompat) view, appCompatImageView, imageView, imageView2, imageView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
