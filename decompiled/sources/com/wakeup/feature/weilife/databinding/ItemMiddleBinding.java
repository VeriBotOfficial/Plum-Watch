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
public final class ItemMiddleBinding implements ViewBinding {
    public final AppCompatImageView itemMiddleIv;
    public final TextView itemMiddleTv;
    private final CardView rootView;

    private ItemMiddleBinding(CardView cardView, AppCompatImageView appCompatImageView, TextView textView) {
        this.rootView = cardView;
        this.itemMiddleIv = appCompatImageView;
        this.itemMiddleTv = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public CardView getRoot() {
        return this.rootView;
    }

    public static ItemMiddleBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemMiddleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_middle, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemMiddleBinding bind(View view) {
        int i = R.id.item_middle_iv;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.item_middle_tv;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                return new ItemMiddleBinding((CardView) view, appCompatImageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
