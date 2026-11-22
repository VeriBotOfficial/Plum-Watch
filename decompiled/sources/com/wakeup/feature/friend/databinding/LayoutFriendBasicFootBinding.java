package com.wakeup.feature.friend.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import com.wakeup.feature.friend.R;

/* loaded from: classes3.dex */
public final class LayoutFriendBasicFootBinding implements ViewBinding {
    public final ShapeableImageView ivAvatar;
    public final ImageView ivEditNicName;
    public final LinearLayout ll1;
    public final RelativeLayout rlTop;
    private final RelativeLayout rootView;
    public final TextView tvAddress;
    public final TextView tvAgo;
    public final TextView tvFriendTime;
    public final TextView tvName;
    public final TextView tvOnlineHint;
    public final TextView tvRemind;

    private LayoutFriendBasicFootBinding(RelativeLayout relativeLayout, ShapeableImageView shapeableImageView, ImageView imageView, LinearLayout linearLayout, RelativeLayout relativeLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.rootView = relativeLayout;
        this.ivAvatar = shapeableImageView;
        this.ivEditNicName = imageView;
        this.ll1 = linearLayout;
        this.rlTop = relativeLayout2;
        this.tvAddress = textView;
        this.tvAgo = textView2;
        this.tvFriendTime = textView3;
        this.tvName = textView4;
        this.tvOnlineHint = textView5;
        this.tvRemind = textView6;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static LayoutFriendBasicFootBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutFriendBasicFootBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_friend_basic_foot, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutFriendBasicFootBinding bind(View view) {
        int i = R.id.ivAvatar;
        ShapeableImageView shapeableImageView = (ShapeableImageView) ViewBindings.findChildViewById(view, i);
        if (shapeableImageView != null) {
            i = R.id.ivEditNicName;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.ll1;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) view;
                    i = R.id.tvAddress;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = R.id.tvAgo;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = R.id.tvFriendTime;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView3 != null) {
                                i = R.id.tvName;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView4 != null) {
                                    i = R.id.tvOnlineHint;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView5 != null) {
                                        i = R.id.tvRemind;
                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView6 != null) {
                                            return new LayoutFriendBasicFootBinding(relativeLayout, shapeableImageView, imageView, linearLayout, relativeLayout, textView, textView2, textView3, textView4, textView5, textView6);
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
