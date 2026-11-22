package com.wakeup.feature.device.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.device.R;

/* loaded from: classes3.dex */
public final class ItemDeviceMsgBinding implements ViewBinding {
    public final ImageView ivIcon;
    public final LinearLayout llMain;
    public final Switch notifySwitch;
    private final LinearLayout rootView;
    public final TextView tvName;

    private ItemDeviceMsgBinding(LinearLayout linearLayout, ImageView imageView, LinearLayout linearLayout2, Switch r4, TextView textView) {
        this.rootView = linearLayout;
        this.ivIcon = imageView;
        this.llMain = linearLayout2;
        this.notifySwitch = r4;
        this.tvName = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemDeviceMsgBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemDeviceMsgBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_device_msg, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemDeviceMsgBinding bind(View view) {
        int i = R.id.iv_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i = R.id.notify_switch;
            Switch r6 = (Switch) ViewBindings.findChildViewById(view, i);
            if (r6 != null) {
                i = R.id.tv_name;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    return new ItemDeviceMsgBinding(linearLayout, imageView, linearLayout, r6, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
