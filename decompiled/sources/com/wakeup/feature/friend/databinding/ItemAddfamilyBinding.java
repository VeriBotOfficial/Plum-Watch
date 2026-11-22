package com.wakeup.feature.friend.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import com.wakeup.feature.friend.R;

/* loaded from: classes3.dex */
public final class ItemAddfamilyBinding implements ViewBinding {
    public final ShapeableImageView ivAvatar;
    public final LinearLayout llMain;
    private final RelativeLayout rootView;
    public final TextView tvId;
    public final TextView tvName;
    public final TextView tvStatus;

    private ItemAddfamilyBinding(RelativeLayout relativeLayout, ShapeableImageView shapeableImageView, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = relativeLayout;
        this.ivAvatar = shapeableImageView;
        this.llMain = linearLayout;
        this.tvId = textView;
        this.tvName = textView2;
        this.tvStatus = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ItemAddfamilyBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemAddfamilyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_addfamily, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemAddfamilyBinding bind(View view) {
        int i = R.id.ivAvatar;
        ShapeableImageView shapeableImageView = (ShapeableImageView) ViewBindings.findChildViewById(view, i);
        if (shapeableImageView != null) {
            i = R.id.ll_main;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = R.id.tv_id;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.tvName;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = R.id.tvStatus;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView3 != null) {
                            return new ItemAddfamilyBinding((RelativeLayout) view, shapeableImageView, linearLayout, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
