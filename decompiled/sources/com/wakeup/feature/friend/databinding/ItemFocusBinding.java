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
public final class ItemFocusBinding implements ViewBinding {
    public final ShapeableImageView ivAvatar;
    public final ImageView ivRight;
    public final View line;
    public final LinearLayout llYesno;
    public final LinearLayout rlMain;
    private final LinearLayout rootView;
    public final TextView tvMessage;
    public final TextView tvName;
    public final TextView tvNo;
    public final TextView tvStatus;
    public final TextView tvYes;

    private ItemFocusBinding(LinearLayout linearLayout, ShapeableImageView shapeableImageView, ImageView imageView, View view, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = linearLayout;
        this.ivAvatar = shapeableImageView;
        this.ivRight = imageView;
        this.line = view;
        this.llYesno = linearLayout2;
        this.rlMain = linearLayout3;
        this.tvMessage = textView;
        this.tvName = textView2;
        this.tvNo = textView3;
        this.tvStatus = textView4;
        this.tvYes = textView5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemFocusBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemFocusBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_focus, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemFocusBinding bind(View view) {
        View findChildViewById;
        int i = R.id.ivAvatar;
        ShapeableImageView shapeableImageView = (ShapeableImageView) ViewBindings.findChildViewById(view, i);
        if (shapeableImageView != null) {
            i = R.id.ivRight;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.line))) != null) {
                i = R.id.llYesno;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    LinearLayout linearLayout2 = (LinearLayout) view;
                    i = R.id.tvMessage;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = R.id.tvName;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = R.id.tvNo;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView3 != null) {
                                i = R.id.tvStatus;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView4 != null) {
                                    i = R.id.tvYes;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView5 != null) {
                                        return new ItemFocusBinding(linearLayout2, shapeableImageView, imageView, findChildViewById, linearLayout, linearLayout2, textView, textView2, textView3, textView4, textView5);
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
