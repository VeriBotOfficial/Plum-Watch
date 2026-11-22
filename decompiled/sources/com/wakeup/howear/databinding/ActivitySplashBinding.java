package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.howear.R;

/* loaded from: classes3.dex */
public final class ActivitySplashBinding implements ViewBinding {
    public final TextView btnSplashLogin;
    public final RelativeLayout root;
    private final RelativeLayout rootView;
    public final ImageView splashBg;
    public final FrameLayout splashBgClip;

    private ActivitySplashBinding(RelativeLayout relativeLayout, TextView textView, RelativeLayout relativeLayout2, ImageView imageView, FrameLayout frameLayout) {
        this.rootView = relativeLayout;
        this.btnSplashLogin = textView;
        this.root = relativeLayout2;
        this.splashBg = imageView;
        this.splashBgClip = frameLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivitySplashBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivitySplashBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_splash, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivitySplashBinding bind(View view) {
        int i = R.id.btn_splash_login;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            i = R.id.splash_bg;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.splash_bg_clip;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout != null) {
                    return new ActivitySplashBinding(relativeLayout, textView, relativeLayout, imageView, frameLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
