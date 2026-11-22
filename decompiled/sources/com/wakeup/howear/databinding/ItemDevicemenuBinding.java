package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.howear.R;

/* loaded from: classes3.dex */
public final class ItemDevicemenuBinding implements ViewBinding {
    public final ImageView ivIcon;
    public final RelativeLayout rlMain;
    private final RelativeLayout rootView;
    public final TextView tvName;

    private ItemDevicemenuBinding(RelativeLayout relativeLayout, ImageView imageView, RelativeLayout relativeLayout2, TextView textView) {
        this.rootView = relativeLayout;
        this.ivIcon = imageView;
        this.rlMain = relativeLayout2;
        this.tvName = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ItemDevicemenuBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemDevicemenuBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_devicemenu, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemDevicemenuBinding bind(View view) {
        int i = R.id.iv_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            int i2 = R.id.tvName;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i2);
            if (textView != null) {
                return new ItemDevicemenuBinding(relativeLayout, imageView, relativeLayout, textView);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
