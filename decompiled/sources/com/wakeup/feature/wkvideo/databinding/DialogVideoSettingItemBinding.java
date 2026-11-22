package com.wakeup.feature.wkvideo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.wkvideo.R;

/* loaded from: classes3.dex */
public final class DialogVideoSettingItemBinding implements ViewBinding {
    public final ImageView ivArrow;
    public final ImageView ivPermissionIcon;
    public final ImageView ivSelectIcon;
    public final LinearLayout llRoot;
    private final LinearLayout rootView;
    public final TextView tvName;
    public final TextView tvValue;

    private DialogVideoSettingItemBinding(LinearLayout linearLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, LinearLayout linearLayout2, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.ivArrow = imageView;
        this.ivPermissionIcon = imageView2;
        this.ivSelectIcon = imageView3;
        this.llRoot = linearLayout2;
        this.tvName = textView;
        this.tvValue = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static DialogVideoSettingItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogVideoSettingItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_video_setting_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogVideoSettingItemBinding bind(View view) {
        int i = R.id.ivArrow;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.ivPermissionIcon;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = R.id.ivSelectIcon;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView3 != null) {
                    LinearLayout linearLayout = (LinearLayout) view;
                    i = R.id.tvName;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = R.id.tvValue;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            return new DialogVideoSettingItemBinding(linearLayout, imageView, imageView2, imageView3, linearLayout, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
