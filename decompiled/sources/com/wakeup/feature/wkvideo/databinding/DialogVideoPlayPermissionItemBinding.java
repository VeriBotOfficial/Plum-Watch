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
public final class DialogVideoPlayPermissionItemBinding implements ViewBinding {
    public final ImageView ivPermissionIcon;
    public final ImageView ivSelectIcon;
    public final View line;
    private final LinearLayout rootView;
    public final TextView tvName;

    private DialogVideoPlayPermissionItemBinding(LinearLayout linearLayout, ImageView imageView, ImageView imageView2, View view, TextView textView) {
        this.rootView = linearLayout;
        this.ivPermissionIcon = imageView;
        this.ivSelectIcon = imageView2;
        this.line = view;
        this.tvName = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static DialogVideoPlayPermissionItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogVideoPlayPermissionItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_video_play_permission_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogVideoPlayPermissionItemBinding bind(View view) {
        View findChildViewById;
        int i = R.id.ivPermissionIcon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.ivSelectIcon;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.line))) != null) {
                i = R.id.tvName;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    return new DialogVideoPlayPermissionItemBinding((LinearLayout) view, imageView, imageView2, findChildViewById, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
