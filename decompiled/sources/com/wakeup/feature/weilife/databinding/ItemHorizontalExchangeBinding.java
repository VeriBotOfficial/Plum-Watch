package com.wakeup.feature.weilife.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.weilife.R;

/* loaded from: classes3.dex */
public final class ItemHorizontalExchangeBinding implements ViewBinding {
    public final AppCompatImageView itemHorizontalIv;
    public final CardView itemHorizontalLayout;
    public final TextView itemHorizontalTitle;
    private final CardView rootView;

    private ItemHorizontalExchangeBinding(CardView cardView, AppCompatImageView appCompatImageView, CardView cardView2, TextView textView) {
        this.rootView = cardView;
        this.itemHorizontalIv = appCompatImageView;
        this.itemHorizontalLayout = cardView2;
        this.itemHorizontalTitle = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public CardView getRoot() {
        return this.rootView;
    }

    public static ItemHorizontalExchangeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemHorizontalExchangeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_horizontal_exchange, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemHorizontalExchangeBinding bind(View view) {
        int i = R.id.item_horizontal_iv;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            CardView cardView = (CardView) view;
            int i2 = R.id.item_horizontal_title;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i2);
            if (textView != null) {
                return new ItemHorizontalExchangeBinding(cardView, appCompatImageView, cardView, textView);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
