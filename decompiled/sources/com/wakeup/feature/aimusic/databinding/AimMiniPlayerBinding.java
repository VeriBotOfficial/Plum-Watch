package com.wakeup.feature.aimusic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.aimusic.R;

/* loaded from: classes2.dex */
public final class AimMiniPlayerBinding implements ViewBinding {
    public final FrameLayout miniBall;
    public final ImageView miniClose;
    public final ImageView miniCover;
    public final LinearLayout miniPill;
    public final FrameLayout miniRoot;
    public final ImageView miniState;
    private final FrameLayout rootView;

    private AimMiniPlayerBinding(FrameLayout frameLayout, FrameLayout frameLayout2, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, FrameLayout frameLayout3, ImageView imageView3) {
        this.rootView = frameLayout;
        this.miniBall = frameLayout2;
        this.miniClose = imageView;
        this.miniCover = imageView2;
        this.miniPill = linearLayout;
        this.miniRoot = frameLayout3;
        this.miniState = imageView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static AimMiniPlayerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AimMiniPlayerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.aim_mini_player, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static AimMiniPlayerBinding bind(View view) {
        int i = R.id.miniBall;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.miniClose;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.miniCover;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    i = R.id.miniPill;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        FrameLayout frameLayout2 = (FrameLayout) view;
                        i = R.id.miniState;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView3 != null) {
                            return new AimMiniPlayerBinding(frameLayout2, frameLayout, imageView, imageView2, linearLayout, frameLayout2, imageView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
