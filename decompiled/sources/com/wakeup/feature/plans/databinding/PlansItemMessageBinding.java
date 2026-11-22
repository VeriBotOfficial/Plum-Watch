package com.wakeup.feature.plans.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.plans.R;

/* loaded from: classes3.dex */
public final class PlansItemMessageBinding implements ViewBinding {
    public final ImageView ivLoading;
    public final LinearLayout loadingBubble;
    private final FrameLayout rootView;
    public final TextView tvLoading;
    public final TextView tvText;

    private PlansItemMessageBinding(FrameLayout frameLayout, ImageView imageView, LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.rootView = frameLayout;
        this.ivLoading = imageView;
        this.loadingBubble = linearLayout;
        this.tvLoading = textView;
        this.tvText = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static PlansItemMessageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static PlansItemMessageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.plans_item_message, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static PlansItemMessageBinding bind(View view) {
        int i = R.id.ivLoading;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.loadingBubble;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = R.id.tvLoading;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.tvText;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        return new PlansItemMessageBinding((FrameLayout) view, imageView, linearLayout, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
