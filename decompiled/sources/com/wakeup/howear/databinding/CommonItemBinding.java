package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.howear.R;

/* loaded from: classes3.dex */
public final class CommonItemBinding implements ViewBinding {
    public final ImageView leftImage;
    public final TextView leftText;
    public final LinearLayout ll;
    public final ImageView rightImage;
    public final ImageView rightImage1;
    public final TextView rightText;
    private final RelativeLayout rootView;

    private CommonItemBinding(RelativeLayout relativeLayout, ImageView imageView, TextView textView, LinearLayout linearLayout, ImageView imageView2, ImageView imageView3, TextView textView2) {
        this.rootView = relativeLayout;
        this.leftImage = imageView;
        this.leftText = textView;
        this.ll = linearLayout;
        this.rightImage = imageView2;
        this.rightImage1 = imageView3;
        this.rightText = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static CommonItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static CommonItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.common_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static CommonItemBinding bind(View view) {
        int i = R.id.leftImage;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.leftText;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.ll;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = R.id.rightImage;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView2 != null) {
                        i = R.id.rightImage1;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView3 != null) {
                            i = R.id.rightText;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                return new CommonItemBinding((RelativeLayout) view, imageView, textView, linearLayout, imageView2, imageView3, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
