package com.wakeup.module.glasses.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.wakeup.module.glasses.R;

/* loaded from: classes4.dex */
public final class DialogGlassesFilmCheckoutBinding implements ViewBinding {
    public final LottieAnimationView lavFilm;
    private final ConstraintLayout rootView;

    private DialogGlassesFilmCheckoutBinding(ConstraintLayout constraintLayout, LottieAnimationView lottieAnimationView) {
        this.rootView = constraintLayout;
        this.lavFilm = lottieAnimationView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static DialogGlassesFilmCheckoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogGlassesFilmCheckoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_glasses_film_checkout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogGlassesFilmCheckoutBinding bind(View view) {
        int i = R.id.lav_film;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
        if (lottieAnimationView != null) {
            return new DialogGlassesFilmCheckoutBinding((ConstraintLayout) view, lottieAnimationView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
