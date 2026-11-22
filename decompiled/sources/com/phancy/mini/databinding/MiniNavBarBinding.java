package com.phancy.mini.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.phancy.mini.R;
import com.phancy.mini.widget.IconButton;

/* loaded from: classes17.dex */
public final class MiniNavBarBinding implements ViewBinding {
    public final IconButton navButton;
    public final ProgressBar navProgress;
    public final LinearLayout navTextLayout;
    public final TextView navTitle;
    private final RelativeLayout rootView;

    private MiniNavBarBinding(RelativeLayout relativeLayout, IconButton iconButton, ProgressBar progressBar, LinearLayout linearLayout, TextView textView) {
        this.rootView = relativeLayout;
        this.navButton = iconButton;
        this.navProgress = progressBar;
        this.navTextLayout = linearLayout;
        this.navTitle = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static MiniNavBarBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MiniNavBarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.mini_nav_bar, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static MiniNavBarBinding bind(View view) {
        int i = R.id.nav_button;
        IconButton iconButton = (IconButton) ViewBindings.findChildViewById(view, i);
        if (iconButton != null) {
            i = R.id.nav_progress;
            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
            if (progressBar != null) {
                i = R.id.nav_text_layout;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = R.id.nav_title;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        return new MiniNavBarBinding((RelativeLayout) view, iconButton, progressBar, linearLayout, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
