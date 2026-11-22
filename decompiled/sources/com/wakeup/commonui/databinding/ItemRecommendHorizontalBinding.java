package com.wakeup.commonui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import com.wakeup.commonui.R;

/* loaded from: classes2.dex */
public final class ItemRecommendHorizontalBinding implements ViewBinding {
    public final ShapeableImageView imageView;
    private final ConstraintLayout rootView;
    public final TextView tvComment;
    public final TextView tvJoinNum;
    public final TextView tvKcal;
    public final TextView tvName;
    public final TextView tvPraise;
    public final TextView tvShare;

    private ItemRecommendHorizontalBinding(ConstraintLayout constraintLayout, ShapeableImageView shapeableImageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.rootView = constraintLayout;
        this.imageView = shapeableImageView;
        this.tvComment = textView;
        this.tvJoinNum = textView2;
        this.tvKcal = textView3;
        this.tvName = textView4;
        this.tvPraise = textView5;
        this.tvShare = textView6;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemRecommendHorizontalBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemRecommendHorizontalBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_recommend_horizontal, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemRecommendHorizontalBinding bind(View view) {
        int i = R.id.imageView;
        ShapeableImageView shapeableImageView = (ShapeableImageView) ViewBindings.findChildViewById(view, i);
        if (shapeableImageView != null) {
            i = R.id.tvComment;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.tvJoinNum;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = R.id.tvKcal;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null) {
                        i = R.id.tvName;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView4 != null) {
                            i = R.id.tvPraise;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView5 != null) {
                                i = R.id.tvShare;
                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView6 != null) {
                                    return new ItemRecommendHorizontalBinding((ConstraintLayout) view, shapeableImageView, textView, textView2, textView3, textView4, textView5, textView6);
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
