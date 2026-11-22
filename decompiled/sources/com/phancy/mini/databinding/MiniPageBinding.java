package com.phancy.mini.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.phancy.mini.R;
import com.phancy.mini.widget.TitleBar;

/* loaded from: classes17.dex */
public final class MiniPageBinding implements ViewBinding {
    public final LinearLayout bottomLayout;
    private final RelativeLayout rootView;
    public final TitleBar titleBar;
    public final FrameLayout titleGroup;
    public final LinearLayout topLayout;
    public final FrameLayout webLayout;

    private MiniPageBinding(RelativeLayout relativeLayout, LinearLayout linearLayout, TitleBar titleBar, FrameLayout frameLayout, LinearLayout linearLayout2, FrameLayout frameLayout2) {
        this.rootView = relativeLayout;
        this.bottomLayout = linearLayout;
        this.titleBar = titleBar;
        this.titleGroup = frameLayout;
        this.topLayout = linearLayout2;
        this.webLayout = frameLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static MiniPageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MiniPageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.mini_page, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static MiniPageBinding bind(View view) {
        int i = R.id.bottom_layout;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.title_bar;
            TitleBar titleBar = (TitleBar) ViewBindings.findChildViewById(view, i);
            if (titleBar != null) {
                i = R.id.title_group;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout != null) {
                    i = R.id.top_layout;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout2 != null) {
                        i = R.id.web_layout;
                        FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                        if (frameLayout2 != null) {
                            return new MiniPageBinding((RelativeLayout) view, linearLayout, titleBar, frameLayout, linearLayout2, frameLayout2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
