package com.wakeup.feature.plans.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.plans.R;

/* loaded from: classes3.dex */
public final class ItemMainPlansTabBinding implements ViewBinding {
    public final FrameLayout flPlansTabButton;
    public final ImageView ivPlansTabIcon;
    private final FrameLayout rootView;
    public final TextView tvCount;

    private ItemMainPlansTabBinding(FrameLayout frameLayout, FrameLayout frameLayout2, ImageView imageView, TextView textView) {
        this.rootView = frameLayout;
        this.flPlansTabButton = frameLayout2;
        this.ivPlansTabIcon = imageView;
        this.tvCount = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static ItemMainPlansTabBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemMainPlansTabBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_main_plans_tab, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemMainPlansTabBinding bind(View view) {
        int i = R.id.flPlansTabButton;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.ivPlansTabIcon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.tv_count;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    return new ItemMainPlansTabBinding((FrameLayout) view, frameLayout, imageView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
