package com.phancy.mini.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.phancy.mini.R;
import com.phancy.mini.widget.CircleImageView;

/* loaded from: classes17.dex */
public final class MiniMoreMenuBinding implements ViewBinding {
    public final CircleImageView appIcon;
    public final TextView appTitle;
    public final TextView cancel;
    public final RelativeLayout relaunchButton;
    public final ImageView relaunchIcon;
    private final FrameLayout rootView;
    public final RelativeLayout settingButton;
    public final ImageView settingIcon;

    private MiniMoreMenuBinding(FrameLayout frameLayout, CircleImageView circleImageView, TextView textView, TextView textView2, RelativeLayout relativeLayout, ImageView imageView, RelativeLayout relativeLayout2, ImageView imageView2) {
        this.rootView = frameLayout;
        this.appIcon = circleImageView;
        this.appTitle = textView;
        this.cancel = textView2;
        this.relaunchButton = relativeLayout;
        this.relaunchIcon = imageView;
        this.settingButton = relativeLayout2;
        this.settingIcon = imageView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static MiniMoreMenuBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MiniMoreMenuBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.mini_more_menu, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static MiniMoreMenuBinding bind(View view) {
        int i = R.id.app_icon;
        CircleImageView circleImageView = (CircleImageView) ViewBindings.findChildViewById(view, i);
        if (circleImageView != null) {
            i = R.id.app_title;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.cancel;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = R.id.relaunch_button;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                    if (relativeLayout != null) {
                        i = R.id.relaunch_icon;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            i = R.id.setting_button;
                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                            if (relativeLayout2 != null) {
                                i = R.id.setting_icon;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView2 != null) {
                                    return new MiniMoreMenuBinding((FrameLayout) view, circleImageView, textView, textView2, relativeLayout, imageView, relativeLayout2, imageView2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
