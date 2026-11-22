package com.wakeup.feature.friend.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.MyTitleBar;
import com.wakeup.feature.friend.R;

/* loaded from: classes3.dex */
public final class ActivityFriendshomeshareBinding implements ViewBinding {
    public final ImageView ivQr;
    public final ImageView ivShare;
    public final NestedScrollView mNestedScrollView;
    public final MyTitleBar mTopBar;
    private final LinearLayout rootView;
    public final TextView tvBottomTip;

    private ActivityFriendshomeshareBinding(LinearLayout linearLayout, ImageView imageView, ImageView imageView2, NestedScrollView nestedScrollView, MyTitleBar myTitleBar, TextView textView) {
        this.rootView = linearLayout;
        this.ivQr = imageView;
        this.ivShare = imageView2;
        this.mNestedScrollView = nestedScrollView;
        this.mTopBar = myTitleBar;
        this.tvBottomTip = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityFriendshomeshareBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityFriendshomeshareBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_friendshomeshare, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityFriendshomeshareBinding bind(View view) {
        int i = R.id.iv_qr;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.ivShare;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = R.id.mNestedScrollView;
                NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                if (nestedScrollView != null) {
                    i = R.id.mTopBar;
                    MyTitleBar myTitleBar = (MyTitleBar) ViewBindings.findChildViewById(view, i);
                    if (myTitleBar != null) {
                        i = R.id.tv_bottomTip;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            return new ActivityFriendshomeshareBinding((LinearLayout) view, imageView, imageView2, nestedScrollView, myTitleBar, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
