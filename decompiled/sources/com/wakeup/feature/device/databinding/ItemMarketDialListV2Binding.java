package com.wakeup.feature.device.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.view.SquareImageView;
import com.wakeup.feature.device.R;

/* loaded from: classes3.dex */
public final class ItemMarketDialListV2Binding implements ViewBinding {
    public final AppCompatImageView ivBonus;
    public final SquareImageView ivImage;
    public final LinearLayout llMain;
    public final LinearLayoutCompat llState;
    private final LinearLayout rootView;
    public final TextView tvTip;
    public final TextView tvTitle;

    private ItemMarketDialListV2Binding(LinearLayout linearLayout, AppCompatImageView appCompatImageView, SquareImageView squareImageView, LinearLayout linearLayout2, LinearLayoutCompat linearLayoutCompat, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.ivBonus = appCompatImageView;
        this.ivImage = squareImageView;
        this.llMain = linearLayout2;
        this.llState = linearLayoutCompat;
        this.tvTip = textView;
        this.tvTitle = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemMarketDialListV2Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemMarketDialListV2Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_market_dial_list_v2, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemMarketDialListV2Binding bind(View view) {
        int i = R.id.iv_bonus;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.iv_image;
            SquareImageView squareImageView = (SquareImageView) ViewBindings.findChildViewById(view, i);
            if (squareImageView != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                i = R.id.ll_state;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                if (linearLayoutCompat != null) {
                    i = R.id.tv_tip;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = R.id.tv_title;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            return new ItemMarketDialListV2Binding(linearLayout, appCompatImageView, squareImageView, linearLayout, linearLayoutCompat, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
