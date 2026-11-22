package com.wakeup.feature.device.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import com.wakeup.feature.device.R;

/* loaded from: classes3.dex */
public final class LayoutDialMemberEntryBinding implements ViewBinding {
    public final ConstraintLayout clDialMemberEntry;
    public final ImageView ivDialMemberClose;
    public final ShapeableImageView ivDialMemberThumb;
    public final LinearLayout llDialMemberCopy;
    private final ConstraintLayout rootView;
    public final TextView tvDialMemberCta;
    public final TextView tvDialMemberPrice;
    public final TextView tvDialMemberSubtitle;
    public final TextView tvDialMemberTitle;

    private LayoutDialMemberEntryBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ImageView imageView, ShapeableImageView shapeableImageView, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = constraintLayout;
        this.clDialMemberEntry = constraintLayout2;
        this.ivDialMemberClose = imageView;
        this.ivDialMemberThumb = shapeableImageView;
        this.llDialMemberCopy = linearLayout;
        this.tvDialMemberCta = textView;
        this.tvDialMemberPrice = textView2;
        this.tvDialMemberSubtitle = textView3;
        this.tvDialMemberTitle = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static LayoutDialMemberEntryBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutDialMemberEntryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_dial_member_entry, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutDialMemberEntryBinding bind(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.iv_dial_member_close;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.iv_dial_member_thumb;
            ShapeableImageView shapeableImageView = (ShapeableImageView) ViewBindings.findChildViewById(view, i);
            if (shapeableImageView != null) {
                i = R.id.ll_dial_member_copy;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = R.id.tv_dial_member_cta;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = R.id.tv_dial_member_price;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = R.id.tv_dial_member_subtitle;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView3 != null) {
                                i = R.id.tv_dial_member_title;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView4 != null) {
                                    return new LayoutDialMemberEntryBinding(constraintLayout, constraintLayout, imageView, shapeableImageView, linearLayout, textView, textView2, textView3, textView4);
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
