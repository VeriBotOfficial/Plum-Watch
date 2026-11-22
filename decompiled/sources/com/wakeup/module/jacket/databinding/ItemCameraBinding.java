package com.wakeup.module.jacket.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.module.jacket.R;

/* loaded from: classes4.dex */
public final class ItemCameraBinding implements ViewBinding {
    public final ImageView ivDel;
    private final ConstraintLayout rootView;
    public final TextView tvCameraTime;
    public final TextView tvCameraTitle;
    public final View viewLine;

    private ItemCameraBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, View view) {
        this.rootView = constraintLayout;
        this.ivDel = imageView;
        this.tvCameraTime = textView;
        this.tvCameraTitle = textView2;
        this.viewLine = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemCameraBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemCameraBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_camera, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemCameraBinding bind(View view) {
        View findChildViewById;
        int i = R.id.iv_del;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.tv_camera_time;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.tv_camera_title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.view_line))) != null) {
                    return new ItemCameraBinding((ConstraintLayout) view, imageView, textView, textView2, findChildViewById);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
