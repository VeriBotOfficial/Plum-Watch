package com.wakeup.module.glasses.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.wakeup.module.glasses.R;

/* loaded from: classes4.dex */
public final class DialogGlassesFilmBinding implements ViewBinding {
    public final AppCompatImageView ivClose;
    public final LottieAnimationView lavFilm;
    private final ConstraintLayout rootView;
    public final AppCompatTextView tvFilmTip1;
    public final AppCompatTextView tvFilmTip2;
    public final View viewLine;

    private DialogGlassesFilmBinding(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, LottieAnimationView lottieAnimationView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, View view) {
        this.rootView = constraintLayout;
        this.ivClose = appCompatImageView;
        this.lavFilm = lottieAnimationView;
        this.tvFilmTip1 = appCompatTextView;
        this.tvFilmTip2 = appCompatTextView2;
        this.viewLine = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static DialogGlassesFilmBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogGlassesFilmBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_glasses_film, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogGlassesFilmBinding bind(View view) {
        View findChildViewById;
        int i = R.id.iv_close;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.lav_film;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
            if (lottieAnimationView != null) {
                i = R.id.tv_film_tip1;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView != null) {
                    i = R.id.tv_film_tip2;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.view_line))) != null) {
                        return new DialogGlassesFilmBinding((ConstraintLayout) view, appCompatImageView, lottieAnimationView, appCompatTextView, appCompatTextView2, findChildViewById);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
