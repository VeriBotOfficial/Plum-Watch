package com.wakeup.feature.wkvideo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import com.wakeup.feature.wkvideo.R;

/* loaded from: classes3.dex */
public final class LayoutVideoWatchEnterViewBinding implements ViewBinding {
    public final ShapeableImageView ivWatchIcon;
    public final LinearLayout layoutViewWatchEnter;
    public final LinearLayout llWatchIcon;
    private final LinearLayout rootView;
    public final TextView tvBuy;
    public final TextView tvWatchDesc;
    public final TextView tvWatchPrice;
    public final TextView tvWatchTitle;

    private LayoutVideoWatchEnterViewBinding(LinearLayout linearLayout, ShapeableImageView shapeableImageView, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = linearLayout;
        this.ivWatchIcon = shapeableImageView;
        this.layoutViewWatchEnter = linearLayout2;
        this.llWatchIcon = linearLayout3;
        this.tvBuy = textView;
        this.tvWatchDesc = textView2;
        this.tvWatchPrice = textView3;
        this.tvWatchTitle = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static LayoutVideoWatchEnterViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutVideoWatchEnterViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_video_watch_enter_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutVideoWatchEnterViewBinding bind(View view) {
        int i = R.id.ivWatchIcon;
        ShapeableImageView shapeableImageView = (ShapeableImageView) ViewBindings.findChildViewById(view, i);
        if (shapeableImageView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i = R.id.llWatchIcon;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout2 != null) {
                i = R.id.tv_buy;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.tv_watch_desc;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = R.id.tv_watch_price;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView3 != null) {
                            i = R.id.tv_watch_title;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView4 != null) {
                                return new LayoutVideoWatchEnterViewBinding(linearLayout, shapeableImageView, linearLayout, linearLayout2, textView, textView2, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
