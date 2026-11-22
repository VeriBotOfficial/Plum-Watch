package com.wakeup.feature.user.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import com.wakeup.feature.user.R;

/* loaded from: classes3.dex */
public final class ItemRankBinding implements ViewBinding {
    public final ShapeableImageView ivAvatar;
    public final ShapeableImageView ivCountry;
    public final ImageView ivLike;
    public final ImageView ivVip;
    public final LinearLayout llLike;
    private final LinearLayout rootView;
    public final TextView tvLike;
    public final TextView tvName;
    public final TextView tvRank;
    public final TextView tvStepCount;

    private ItemRankBinding(LinearLayout linearLayout, ShapeableImageView shapeableImageView, ShapeableImageView shapeableImageView2, ImageView imageView, ImageView imageView2, LinearLayout linearLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = linearLayout;
        this.ivAvatar = shapeableImageView;
        this.ivCountry = shapeableImageView2;
        this.ivLike = imageView;
        this.ivVip = imageView2;
        this.llLike = linearLayout2;
        this.tvLike = textView;
        this.tvName = textView2;
        this.tvRank = textView3;
        this.tvStepCount = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemRankBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemRankBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_rank, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemRankBinding bind(View view) {
        int i = R.id.ivAvatar;
        ShapeableImageView shapeableImageView = (ShapeableImageView) ViewBindings.findChildViewById(view, i);
        if (shapeableImageView != null) {
            i = R.id.iv_country;
            ShapeableImageView shapeableImageView2 = (ShapeableImageView) ViewBindings.findChildViewById(view, i);
            if (shapeableImageView2 != null) {
                i = R.id.iv_like;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.iv_vip;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView2 != null) {
                        i = R.id.ll_like;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout != null) {
                            i = R.id.tv_like;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                i = R.id.tvName;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView2 != null) {
                                    i = R.id.tv_rank;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView3 != null) {
                                        i = R.id.tv_stepCount;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView4 != null) {
                                            return new ItemRankBinding((LinearLayout) view, shapeableImageView, shapeableImageView2, imageView, imageView2, linearLayout, textView, textView2, textView3, textView4);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
