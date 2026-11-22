package com.wakeup.feature.friend.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import com.wakeup.feature.friend.R;

/* loaded from: classes3.dex */
public final class ViewMapMarkerBinding implements ViewBinding {
    public final ShapeableImageView ivHead;
    private final FrameLayout rootView;
    public final TextView tvAgo;

    private ViewMapMarkerBinding(FrameLayout frameLayout, ShapeableImageView shapeableImageView, TextView textView) {
        this.rootView = frameLayout;
        this.ivHead = shapeableImageView;
        this.tvAgo = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static ViewMapMarkerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ViewMapMarkerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.view_map_marker, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ViewMapMarkerBinding bind(View view) {
        int i = R.id.ivHead;
        ShapeableImageView shapeableImageView = (ShapeableImageView) ViewBindings.findChildViewById(view, i);
        if (shapeableImageView != null) {
            i = R.id.tvAgo;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                return new ViewMapMarkerBinding((FrameLayout) view, shapeableImageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
