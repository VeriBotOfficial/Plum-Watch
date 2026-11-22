package com.phancy.mini.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.phancy.mini.R;

/* loaded from: classes17.dex */
public final class MiniToastViewBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final ImageView toastImage;
    public final LinearLayout toastLayout;
    public final ProgressBar toastLoading;
    public final TextView toastText;

    private MiniToastViewBinding(LinearLayout linearLayout, ImageView imageView, LinearLayout linearLayout2, ProgressBar progressBar, TextView textView) {
        this.rootView = linearLayout;
        this.toastImage = imageView;
        this.toastLayout = linearLayout2;
        this.toastLoading = progressBar;
        this.toastText = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static MiniToastViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MiniToastViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.mini_toast_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static MiniToastViewBinding bind(View view) {
        int i = R.id.toast_image;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i = R.id.toast_loading;
            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
            if (progressBar != null) {
                i = R.id.toast_text;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    return new MiniToastViewBinding(linearLayout, imageView, linearLayout, progressBar, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
