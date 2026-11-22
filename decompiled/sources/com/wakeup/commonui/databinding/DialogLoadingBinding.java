package com.wakeup.commonui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.wakeup.commonui.R;

/* loaded from: classes2.dex */
public final class DialogLoadingBinding implements ViewBinding {
    public final ImageView ivLoading;
    public final LottieAnimationView lottieLoading;
    private final LinearLayout rootView;
    public final TextView tvTip;

    private DialogLoadingBinding(LinearLayout linearLayout, ImageView imageView, LottieAnimationView lottieAnimationView, TextView textView) {
        this.rootView = linearLayout;
        this.ivLoading = imageView;
        this.lottieLoading = lottieAnimationView;
        this.tvTip = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static DialogLoadingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogLoadingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_loading, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogLoadingBinding bind(View view) {
        int i = R.id.ivLoading;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.lottie_loading;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
            if (lottieAnimationView != null) {
                i = R.id.tvTip;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    return new DialogLoadingBinding((LinearLayout) view, imageView, lottieAnimationView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
