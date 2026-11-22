package com.wakeup.feature.user.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.user.R;

/* loaded from: classes3.dex */
public final class ActivityOperartionGuideItemBinding implements ViewBinding {
    public final ImageView ivGuide;
    public final View line3;
    private final ConstraintLayout rootView;
    public final TextView tvGuideName;

    private ActivityOperartionGuideItemBinding(ConstraintLayout constraintLayout, ImageView imageView, View view, TextView textView) {
        this.rootView = constraintLayout;
        this.ivGuide = imageView;
        this.line3 = view;
        this.tvGuideName = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityOperartionGuideItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityOperartionGuideItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_operartion_guide_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityOperartionGuideItemBinding bind(View view) {
        View findChildViewById;
        int i = R.id.iv_guide;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.line3))) != null) {
            i = R.id.tv_guide_name;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                return new ActivityOperartionGuideItemBinding((ConstraintLayout) view, imageView, findChildViewById, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
