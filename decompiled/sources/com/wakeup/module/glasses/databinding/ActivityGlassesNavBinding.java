package com.wakeup.module.glasses.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.databinding.StatusBarBinding;
import com.wakeup.module.glasses.R;

/* loaded from: classes4.dex */
public final class ActivityGlassesNavBinding implements ViewBinding {
    public final ConstraintLayout container;
    public final ImageView ivBack;
    private final ConstraintLayout rootView;
    public final StatusBarBinding statusBarLayout;

    private ActivityGlassesNavBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ImageView imageView, StatusBarBinding statusBarBinding) {
        this.rootView = constraintLayout;
        this.container = constraintLayout2;
        this.ivBack = imageView;
        this.statusBarLayout = statusBarBinding;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityGlassesNavBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityGlassesNavBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_glasses_nav, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityGlassesNavBinding bind(View view) {
        View findChildViewById;
        int i = R.id.container;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = R.id.iv_back;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.status_bar_layout))) != null) {
                return new ActivityGlassesNavBinding((ConstraintLayout) view, constraintLayout, imageView, StatusBarBinding.bind(findChildViewById));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
