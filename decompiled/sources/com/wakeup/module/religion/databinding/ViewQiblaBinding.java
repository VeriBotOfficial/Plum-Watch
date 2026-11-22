package com.wakeup.module.religion.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.module.religion.R;

/* loaded from: classes4.dex */
public final class ViewQiblaBinding implements ViewBinding {
    public final ConstraintLayout clContainer;
    public final AppCompatImageView ivArrow;
    public final AppCompatImageView ivBg;
    public final AppCompatImageView ivKaaba;
    private final ConstraintLayout rootView;

    private ViewQiblaBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3) {
        this.rootView = constraintLayout;
        this.clContainer = constraintLayout2;
        this.ivArrow = appCompatImageView;
        this.ivBg = appCompatImageView2;
        this.ivKaaba = appCompatImageView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ViewQiblaBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ViewQiblaBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.view_qibla, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ViewQiblaBinding bind(View view) {
        int i = R.id.cl_container;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = R.id.iv_arrow;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = R.id.iv_bg;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView2 != null) {
                    i = R.id.iv_kaaba;
                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                    if (appCompatImageView3 != null) {
                        return new ViewQiblaBinding((ConstraintLayout) view, constraintLayout, appCompatImageView, appCompatImageView2, appCompatImageView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
