package com.wakeup.feature.device.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.device.R;

/* loaded from: classes3.dex */
public final class ItemApplicationmarketBinding implements ViewBinding {
    public final ImageView ivApplicationImage;
    public final View line;
    public final LinearLayout llMain;
    private final LinearLayout rootView;
    public final TextView tvApplicationName;
    public final TextView tvInstall;
    public final TextView tvTip;

    private ItemApplicationmarketBinding(LinearLayout linearLayout, ImageView imageView, View view, LinearLayout linearLayout2, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = linearLayout;
        this.ivApplicationImage = imageView;
        this.line = view;
        this.llMain = linearLayout2;
        this.tvApplicationName = textView;
        this.tvInstall = textView2;
        this.tvTip = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemApplicationmarketBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemApplicationmarketBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_applicationmarket, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemApplicationmarketBinding bind(View view) {
        View findChildViewById;
        int i = R.id.ivApplicationImage;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.line))) != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i = R.id.tvApplicationName;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.tvInstall;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = R.id.tvTip;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null) {
                        return new ItemApplicationmarketBinding(linearLayout, imageView, findChildViewById, linearLayout, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
