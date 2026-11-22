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
public final class ActivityDialDetailBinding implements ViewBinding {
    public final ImageView btnBack;
    public final ImageView ivDialImage;
    private final LinearLayout rootView;
    public final RelativeLayout toolbar;
    public final TextView tvDescription;
    public final TextView tvDialName;
    public final TextView tvDownloads;
    public final TextView tvExchangeBtn;
    public final TextView tvPrice;

    private ActivityDialDetailBinding(LinearLayout linearLayout, ImageView imageView, ImageView imageView2, RelativeLayout relativeLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = linearLayout;
        this.btnBack = imageView;
        this.ivDialImage = imageView2;
        this.toolbar = relativeLayout;
        this.tvDescription = textView;
        this.tvDialName = textView2;
        this.tvDownloads = textView3;
        this.tvExchangeBtn = textView4;
        this.tvPrice = textView5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityDialDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityDialDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_dial_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityDialDetailBinding bind(View view) {
        int i = R.id.btnBack;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.ivDialImage;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = R.id.toolbar;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                if (relativeLayout != null) {
                    i = R.id.tvDescription;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = R.id.tvDialName;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = R.id.tvDownloads;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView3 != null) {
                                i = R.id.tvExchangeBtn;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView4 != null) {
                                    i = R.id.tvPrice;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView5 != null) {
                                        return new ActivityDialDetailBinding((LinearLayout) view, imageView, imageView2, relativeLayout, textView, textView2, textView3, textView4, textView5);
                                    }
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
