package com.wakeup.commonui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.R;
import com.wakeup.commonui.view.SquareImageView;

/* loaded from: classes2.dex */
public final class ItemMarketMenuListBinding implements ViewBinding {
    public final SquareImageView ivImage;
    public final LinearLayout llMain;
    private final LinearLayout rootView;
    public final TextView tvTip;
    public final TextView tvTitle;

    private ItemMarketMenuListBinding(LinearLayout linearLayout, SquareImageView squareImageView, LinearLayout linearLayout2, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.ivImage = squareImageView;
        this.llMain = linearLayout2;
        this.tvTip = textView;
        this.tvTitle = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemMarketMenuListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemMarketMenuListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_market_menu_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemMarketMenuListBinding bind(View view) {
        int i = R.id.iv_image;
        SquareImageView squareImageView = (SquareImageView) ViewBindings.findChildViewById(view, i);
        if (squareImageView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i = R.id.tv_tip;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.tv_title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    return new ItemMarketMenuListBinding(linearLayout, squareImageView, linearLayout, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
