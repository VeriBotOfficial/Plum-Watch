package com.wakeup.commonui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.R;

/* loaded from: classes2.dex */
public final class ViewSportStartBinding implements ViewBinding {
    public final ImageView ivRolling1;
    public final ImageView ivRolling2;
    private final FrameLayout rootView;

    private ViewSportStartBinding(FrameLayout frameLayout, ImageView imageView, ImageView imageView2) {
        this.rootView = frameLayout;
        this.ivRolling1 = imageView;
        this.ivRolling2 = imageView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static ViewSportStartBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ViewSportStartBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.view_sport_start, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ViewSportStartBinding bind(View view) {
        int i = R.id.iv_rolling1;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.iv_rolling2;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                return new ViewSportStartBinding((FrameLayout) view, imageView, imageView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
