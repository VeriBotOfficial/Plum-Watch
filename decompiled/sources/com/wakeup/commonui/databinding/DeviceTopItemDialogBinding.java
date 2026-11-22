package com.wakeup.commonui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.R;

/* loaded from: classes2.dex */
public final class DeviceTopItemDialogBinding implements ViewBinding {
    public final ConstraintLayout itemLayout;
    public final ImageView ivIcon;
    public final View line;
    private final ConstraintLayout rootView;
    public final TextView tvText;

    private DeviceTopItemDialogBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ImageView imageView, View view, TextView textView) {
        this.rootView = constraintLayout;
        this.itemLayout = constraintLayout2;
        this.ivIcon = imageView;
        this.line = view;
        this.tvText = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static DeviceTopItemDialogBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DeviceTopItemDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.device_top_item_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DeviceTopItemDialogBinding bind(View view) {
        View findChildViewById;
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.iv_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.line))) != null) {
            i = R.id.tv_text;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                return new DeviceTopItemDialogBinding(constraintLayout, constraintLayout, imageView, findChildViewById, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
