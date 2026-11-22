package com.wakeup.feature.wkvideo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import com.wakeup.feature.wkvideo.R;

/* loaded from: classes3.dex */
public final class LayoutVideoWatchImgViewBinding implements ViewBinding {
    public final ShapeableImageView ivWatchIcon;
    public final LinearLayout llWatchIcon;
    private final LinearLayout rootView;

    private LayoutVideoWatchImgViewBinding(LinearLayout linearLayout, ShapeableImageView shapeableImageView, LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.ivWatchIcon = shapeableImageView;
        this.llWatchIcon = linearLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static LayoutVideoWatchImgViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutVideoWatchImgViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_video_watch_img_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutVideoWatchImgViewBinding bind(View view) {
        int i = R.id.ivWatchIcon;
        ShapeableImageView shapeableImageView = (ShapeableImageView) ViewBindings.findChildViewById(view, i);
        if (shapeableImageView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            return new LayoutVideoWatchImgViewBinding(linearLayout, shapeableImageView, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
