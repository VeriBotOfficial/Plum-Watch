package com.wakeup.feature.friend.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import com.wakeup.feature.friend.R;

/* loaded from: classes3.dex */
public final class ItemFriendHomeBinding implements ViewBinding {
    public final ShapeableImageView ivHead;
    public final ImageView ivSelector;
    private final LinearLayout rootView;
    public final TextView tvName;
    public final View vOnLineState;

    private ItemFriendHomeBinding(LinearLayout linearLayout, ShapeableImageView shapeableImageView, ImageView imageView, TextView textView, View view) {
        this.rootView = linearLayout;
        this.ivHead = shapeableImageView;
        this.ivSelector = imageView;
        this.tvName = textView;
        this.vOnLineState = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemFriendHomeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemFriendHomeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_friend_home, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemFriendHomeBinding bind(View view) {
        View findChildViewById;
        int i = R.id.ivHead;
        ShapeableImageView shapeableImageView = (ShapeableImageView) ViewBindings.findChildViewById(view, i);
        if (shapeableImageView != null) {
            i = R.id.ivSelector;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.tvName;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.vOnLineState))) != null) {
                    return new ItemFriendHomeBinding((LinearLayout) view, shapeableImageView, imageView, textView, findChildViewById);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
