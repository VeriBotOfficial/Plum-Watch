package com.wakeup.feature.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.health.R;

/* loaded from: classes3.dex */
public final class LayoutHdNavBinding implements ViewBinding {
    public final FrameLayout navAction;
    public final TextView navActionIcon;
    public final FrameLayout navBack;
    public final TextView navBackIcon;
    public final LinearLayout navBar;
    public final TextView navTitle;
    private final LinearLayout rootView;

    private LayoutHdNavBinding(LinearLayout linearLayout, FrameLayout frameLayout, TextView textView, FrameLayout frameLayout2, TextView textView2, LinearLayout linearLayout2, TextView textView3) {
        this.rootView = linearLayout;
        this.navAction = frameLayout;
        this.navActionIcon = textView;
        this.navBack = frameLayout2;
        this.navBackIcon = textView2;
        this.navBar = linearLayout2;
        this.navTitle = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static LayoutHdNavBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutHdNavBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_hd_nav, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutHdNavBinding bind(View view) {
        int i = R.id.nav_action;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.nav_action_icon;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.nav_back;
                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout2 != null) {
                    i = R.id.nav_back_icon;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        LinearLayout linearLayout = (LinearLayout) view;
                        i = R.id.nav_title;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView3 != null) {
                            return new LayoutHdNavBinding(linearLayout, frameLayout, textView, frameLayout2, textView2, linearLayout, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
