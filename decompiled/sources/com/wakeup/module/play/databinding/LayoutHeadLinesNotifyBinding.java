package com.wakeup.module.play.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.module.play.R;

/* loaded from: classes4.dex */
public final class LayoutHeadLinesNotifyBinding implements ViewBinding {
    public final ImageView ivHeadLinesCover;
    public final ImageView ivHeadLinesNotifyBtn;
    private final LinearLayout rootView;
    public final TextView tvHeadLinesNotifyTitle;

    private LayoutHeadLinesNotifyBinding(LinearLayout linearLayout, ImageView imageView, ImageView imageView2, TextView textView) {
        this.rootView = linearLayout;
        this.ivHeadLinesCover = imageView;
        this.ivHeadLinesNotifyBtn = imageView2;
        this.tvHeadLinesNotifyTitle = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static LayoutHeadLinesNotifyBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutHeadLinesNotifyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_head_lines_notify, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutHeadLinesNotifyBinding bind(View view) {
        int i = R.id.iv_head_lines_cover;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.iv_head_lines_notify_btn;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = R.id.tv_head_lines_notify_title;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    return new LayoutHeadLinesNotifyBinding((LinearLayout) view, imageView, imageView2, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
