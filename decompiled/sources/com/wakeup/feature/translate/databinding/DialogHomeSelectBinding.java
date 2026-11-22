package com.wakeup.feature.translate.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.translate.R;

/* loaded from: classes3.dex */
public final class DialogHomeSelectBinding implements ViewBinding {
    public final ImageView ivClose;
    private final FrameLayout rootView;
    public final RecyclerView rvLanguage;
    public final TextView tvLeftLanguage;
    public final TextView tvRightLanguage;

    private DialogHomeSelectBinding(FrameLayout frameLayout, ImageView imageView, RecyclerView recyclerView, TextView textView, TextView textView2) {
        this.rootView = frameLayout;
        this.ivClose = imageView;
        this.rvLanguage = recyclerView;
        this.tvLeftLanguage = textView;
        this.tvRightLanguage = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static DialogHomeSelectBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogHomeSelectBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_home_select, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogHomeSelectBinding bind(View view) {
        int i = R.id.iv_close;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.rv_language;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = R.id.tv_left_language;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.tv_right_language;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        return new DialogHomeSelectBinding((FrameLayout) view, imageView, recyclerView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
