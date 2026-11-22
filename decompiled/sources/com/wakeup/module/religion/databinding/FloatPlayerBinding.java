package com.wakeup.module.religion.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.module.religion.R;

/* loaded from: classes4.dex */
public final class FloatPlayerBinding implements ViewBinding {
    public final AppCompatImageView floatPlayerIv;
    public final CardView floatPlayerLayout;
    private final CardView rootView;

    private FloatPlayerBinding(CardView cardView, AppCompatImageView appCompatImageView, CardView cardView2) {
        this.rootView = cardView;
        this.floatPlayerIv = appCompatImageView;
        this.floatPlayerLayout = cardView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public CardView getRoot() {
        return this.rootView;
    }

    public static FloatPlayerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FloatPlayerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.float_player, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FloatPlayerBinding bind(View view) {
        int i = R.id.float_player_iv;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            CardView cardView = (CardView) view;
            return new FloatPlayerBinding(cardView, appCompatImageView, cardView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
