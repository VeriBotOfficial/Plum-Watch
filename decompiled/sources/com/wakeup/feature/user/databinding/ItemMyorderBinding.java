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
public final class ItemMyorderBinding implements ViewBinding {
    public final ImageView ivIcon;
    public final View line;
    public final ConstraintLayout llMain;
    private final ConstraintLayout rootView;
    public final TextView tvAmount;
    public final TextView tvDate;
    public final TextView tvOrderItem;
    public final TextView tvStatus;

    private ItemMyorderBinding(ConstraintLayout constraintLayout, ImageView imageView, View view, ConstraintLayout constraintLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = constraintLayout;
        this.ivIcon = imageView;
        this.line = view;
        this.llMain = constraintLayout2;
        this.tvAmount = textView;
        this.tvDate = textView2;
        this.tvOrderItem = textView3;
        this.tvStatus = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemMyorderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemMyorderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_myorder, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemMyorderBinding bind(View view) {
        View findChildViewById;
        int i = R.id.iv_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.line))) != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.tv_amount;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.tv_date;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = R.id.tv_orderItem;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null) {
                        i = R.id.tv_status;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView4 != null) {
                            return new ItemMyorderBinding(constraintLayout, imageView, findChildViewById, constraintLayout, textView, textView2, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
