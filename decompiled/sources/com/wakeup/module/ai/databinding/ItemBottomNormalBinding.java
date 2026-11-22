package com.wakeup.module.ai.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.view.AiEnergyExpendView;
import com.wakeup.module.ai.R;

/* loaded from: classes4.dex */
public final class ItemBottomNormalBinding implements ViewBinding {
    public final AiEnergyExpendView aeeTs;
    public final ImageView ivSound;
    private final ConstraintLayout rootView;
    public final TextView tvStartSound;

    private ItemBottomNormalBinding(ConstraintLayout constraintLayout, AiEnergyExpendView aiEnergyExpendView, ImageView imageView, TextView textView) {
        this.rootView = constraintLayout;
        this.aeeTs = aiEnergyExpendView;
        this.ivSound = imageView;
        this.tvStartSound = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemBottomNormalBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemBottomNormalBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_bottom_normal, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemBottomNormalBinding bind(View view) {
        int i = R.id.aee_ts;
        AiEnergyExpendView aiEnergyExpendView = (AiEnergyExpendView) ViewBindings.findChildViewById(view, i);
        if (aiEnergyExpendView != null) {
            i = R.id.iv_sound;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.tv_start_sound;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    return new ItemBottomNormalBinding((ConstraintLayout) view, aiEnergyExpendView, imageView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
