package com.wakeup.feature.device.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.view.SquareImageView;
import com.wakeup.feature.device.R;

/* loaded from: classes3.dex */
public final class ItemMarketDialListBinding implements ViewBinding {
    public final AppCompatImageView ivBonus;
    public final SquareImageView ivImage;
    public final LinearLayout llMain;
    private final LinearLayout rootView;
    public final TextView tvOldPrice;
    public final TextView tvTip;
    public final TextView tvTitle;

    private ItemMarketDialListBinding(LinearLayout linearLayout, AppCompatImageView appCompatImageView, SquareImageView squareImageView, LinearLayout linearLayout2, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = linearLayout;
        this.ivBonus = appCompatImageView;
        this.ivImage = squareImageView;
        this.llMain = linearLayout2;
        this.tvOldPrice = textView;
        this.tvTip = textView2;
        this.tvTitle = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemMarketDialListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemMarketDialListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_market_dial_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemMarketDialListBinding bind(View view) {
        int i = R.id.iv_bonus;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.iv_image;
            SquareImageView squareImageView = (SquareImageView) ViewBindings.findChildViewById(view, i);
            if (squareImageView != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                i = R.id.tv_old_price;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.tv_tip;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = R.id.tv_title;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView3 != null) {
                            return new ItemMarketDialListBinding(linearLayout, appCompatImageView, squareImageView, linearLayout, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
