package com.phancy.mini.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.phancy.mini.R;

/* loaded from: classes17.dex */
public final class MiniShareImageBinding implements ViewBinding {
    public final TextView cancel;
    public final ImageView image;
    private final RelativeLayout rootView;
    public final RelativeLayout saveToAblum;
    public final ImageView saveToAblumImage;
    public final RelativeLayout shareButton;
    public final ImageView shareIcon;

    private MiniShareImageBinding(RelativeLayout relativeLayout, TextView textView, ImageView imageView, RelativeLayout relativeLayout2, ImageView imageView2, RelativeLayout relativeLayout3, ImageView imageView3) {
        this.rootView = relativeLayout;
        this.cancel = textView;
        this.image = imageView;
        this.saveToAblum = relativeLayout2;
        this.saveToAblumImage = imageView2;
        this.shareButton = relativeLayout3;
        this.shareIcon = imageView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static MiniShareImageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MiniShareImageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.mini_share_image, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static MiniShareImageBinding bind(View view) {
        int i = R.id.cancel;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.image;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.saveToAblum;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                if (relativeLayout != null) {
                    i = R.id.saveToAblumImage;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView2 != null) {
                        i = R.id.share_button;
                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                        if (relativeLayout2 != null) {
                            i = R.id.share_icon;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView3 != null) {
                                return new MiniShareImageBinding((RelativeLayout) view, textView, imageView, relativeLayout, imageView2, relativeLayout2, imageView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
