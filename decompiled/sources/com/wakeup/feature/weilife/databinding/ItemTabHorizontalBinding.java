package com.wakeup.feature.weilife.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.weilife.R;

/* loaded from: classes3.dex */
public final class ItemTabHorizontalBinding implements ViewBinding {
    public final AppCompatImageView itemTabHorizontalIv;
    public final CardView itemTabHorizontalLayout;
    private final CardView rootView;

    private ItemTabHorizontalBinding(CardView cardView, AppCompatImageView appCompatImageView, CardView cardView2) {
        this.rootView = cardView;
        this.itemTabHorizontalIv = appCompatImageView;
        this.itemTabHorizontalLayout = cardView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public CardView getRoot() {
        return this.rootView;
    }

    public static ItemTabHorizontalBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemTabHorizontalBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_tab_horizontal, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemTabHorizontalBinding bind(View view) {
        int i = R.id.item_tab_horizontal_iv;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            CardView cardView = (CardView) view;
            return new ItemTabHorizontalBinding(cardView, appCompatImageView, cardView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
