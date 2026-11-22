package com.wakeup.feature.course.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import com.wakeup.feature.course.R;

/* loaded from: classes2.dex */
public final class AdapterPlanDetailLevel1Binding implements ViewBinding {
    public final ConstraintLayout cl01;
    public final TextView detailDesc;
    public final ImageView detailFinish;
    public final ShapeableImageView detailImage;
    public final TextView detailName;
    public final ImageView ivLock;
    private final ConstraintLayout rootView;

    private AdapterPlanDetailLevel1Binding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, TextView textView, ImageView imageView, ShapeableImageView shapeableImageView, TextView textView2, ImageView imageView2) {
        this.rootView = constraintLayout;
        this.cl01 = constraintLayout2;
        this.detailDesc = textView;
        this.detailFinish = imageView;
        this.detailImage = shapeableImageView;
        this.detailName = textView2;
        this.ivLock = imageView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static AdapterPlanDetailLevel1Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AdapterPlanDetailLevel1Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.adapter_plan_detail_level_1, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static AdapterPlanDetailLevel1Binding bind(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.detail_desc;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.detail_finish;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.detail_image;
                ShapeableImageView shapeableImageView = (ShapeableImageView) ViewBindings.findChildViewById(view, i);
                if (shapeableImageView != null) {
                    i = R.id.detail_name;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = R.id.ivLock;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView2 != null) {
                            return new AdapterPlanDetailLevel1Binding(constraintLayout, constraintLayout, textView, imageView, shapeableImageView, textView2, imageView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
