package com.wakeup.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.common.R;

/* loaded from: classes2.dex */
public final class ItemChangeUrlBinding implements ViewBinding {
    public final ImageView ivSelect;
    private final RelativeLayout rootView;
    public final TextView tvUrl;

    private ItemChangeUrlBinding(RelativeLayout rootView, ImageView ivSelect, TextView tvUrl) {
        this.rootView = rootView;
        this.ivSelect = ivSelect;
        this.tvUrl = tvUrl;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ItemChangeUrlBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemChangeUrlBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_change_url, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemChangeUrlBinding bind(View rootView) {
        int i = R.id.iv_select;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
        if (imageView != null) {
            i = R.id.tv_url;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
            if (textView != null) {
                return new ItemChangeUrlBinding((RelativeLayout) rootView, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
