package com.wakeup.feature.wkvideo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.wkvideo.R;

/* loaded from: classes3.dex */
public final class ActivityLivecutPurchaseDetailBinding implements ViewBinding {
    public final Button btnAddCart;
    public final Button btnBuyNow;
    public final Button btnGoCart;
    public final ImageView ivBack;
    private final ConstraintLayout rootView;
    public final TextView tvBuyPath;
    public final TextView tvClipId;
    public final TextView tvPageTitle;
    public final TextView tvPrice;
    public final TextView tvTitle;

    private ActivityLivecutPurchaseDetailBinding(ConstraintLayout constraintLayout, Button button, Button button2, Button button3, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = constraintLayout;
        this.btnAddCart = button;
        this.btnBuyNow = button2;
        this.btnGoCart = button3;
        this.ivBack = imageView;
        this.tvBuyPath = textView;
        this.tvClipId = textView2;
        this.tvPageTitle = textView3;
        this.tvPrice = textView4;
        this.tvTitle = textView5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityLivecutPurchaseDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityLivecutPurchaseDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_livecut_purchase_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityLivecutPurchaseDetailBinding bind(View view) {
        int i = R.id.btnAddCart;
        Button button = (Button) ViewBindings.findChildViewById(view, i);
        if (button != null) {
            i = R.id.btnBuyNow;
            Button button2 = (Button) ViewBindings.findChildViewById(view, i);
            if (button2 != null) {
                i = R.id.btnGoCart;
                Button button3 = (Button) ViewBindings.findChildViewById(view, i);
                if (button3 != null) {
                    i = R.id.ivBack;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R.id.tvBuyPath;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = R.id.tvClipId;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                i = R.id.tvPageTitle;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView3 != null) {
                                    i = R.id.tvPrice;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView4 != null) {
                                        i = R.id.tvTitle;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView5 != null) {
                                            return new ActivityLivecutPurchaseDetailBinding((ConstraintLayout) view, button, button2, button3, imageView, textView, textView2, textView3, textView4, textView5);
                                        }
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
