package com.wakeup.feature.wkvideo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import com.wakeup.feature.wkvideo.R;

/* loaded from: classes3.dex */
public final class IncludeVideoPlayCartBinding implements ViewBinding {
    public final ShapeableImageView ivCartIcon;
    public final LinearLayout layoutCart;
    private final LinearLayout rootView;
    public final AppCompatTextView tvCartBuyBtn;
    public final AppCompatTextView tvCartFinalPrice;
    public final AppCompatTextView tvCartHotTag;
    public final AppCompatTextView tvCartOriginPrice;
    public final AppCompatTextView tvCartTitle;

    private IncludeVideoPlayCartBinding(LinearLayout linearLayout, ShapeableImageView shapeableImageView, LinearLayout linearLayout2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, AppCompatTextView appCompatTextView5) {
        this.rootView = linearLayout;
        this.ivCartIcon = shapeableImageView;
        this.layoutCart = linearLayout2;
        this.tvCartBuyBtn = appCompatTextView;
        this.tvCartFinalPrice = appCompatTextView2;
        this.tvCartHotTag = appCompatTextView3;
        this.tvCartOriginPrice = appCompatTextView4;
        this.tvCartTitle = appCompatTextView5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static IncludeVideoPlayCartBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeVideoPlayCartBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.include_video_play_cart, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static IncludeVideoPlayCartBinding bind(View view) {
        int i = R.id.ivCartIcon;
        ShapeableImageView shapeableImageView = (ShapeableImageView) ViewBindings.findChildViewById(view, i);
        if (shapeableImageView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i = R.id.tvCartBuyBtn;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView != null) {
                i = R.id.tvCartFinalPrice;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView2 != null) {
                    i = R.id.tvCartHotTag;
                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView3 != null) {
                        i = R.id.tvCartOriginPrice;
                        AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView4 != null) {
                            i = R.id.tvCartTitle;
                            AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                            if (appCompatTextView5 != null) {
                                return new IncludeVideoPlayCartBinding(linearLayout, shapeableImageView, linearLayout, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
