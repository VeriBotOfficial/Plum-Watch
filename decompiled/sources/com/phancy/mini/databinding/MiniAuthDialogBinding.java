package com.phancy.mini.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.phancy.mini.R;
import com.phancy.mini.widget.CircleImageView;

/* loaded from: classes17.dex */
public final class MiniAuthDialogBinding implements ViewBinding {
    public final TextView acceptButton;
    public final CircleImageView appIcon;
    public final TextView appTitle;
    public final TextView rejectButton;
    private final FrameLayout rootView;
    public final TextView scopeTitle;
    public final ImageView warnIcon;

    private MiniAuthDialogBinding(FrameLayout frameLayout, TextView textView, CircleImageView circleImageView, TextView textView2, TextView textView3, TextView textView4, ImageView imageView) {
        this.rootView = frameLayout;
        this.acceptButton = textView;
        this.appIcon = circleImageView;
        this.appTitle = textView2;
        this.rejectButton = textView3;
        this.scopeTitle = textView4;
        this.warnIcon = imageView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static MiniAuthDialogBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MiniAuthDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.mini_auth_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static MiniAuthDialogBinding bind(View view) {
        int i = R.id.accept_button;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.app_icon;
            CircleImageView circleImageView = (CircleImageView) ViewBindings.findChildViewById(view, i);
            if (circleImageView != null) {
                i = R.id.app_title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = R.id.reject_button;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null) {
                        i = R.id.scope_title;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView4 != null) {
                            i = R.id.warn_icon;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView != null) {
                                return new MiniAuthDialogBinding((FrameLayout) view, textView, circleImageView, textView2, textView3, textView4, imageView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
