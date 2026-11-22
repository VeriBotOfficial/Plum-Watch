package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.howear.R;

/* loaded from: classes3.dex */
public final class LayoutDietHomeEntryBinding implements ViewBinding {
    public final TextView btnDietCta;
    public final CardView dietEntryCard;
    private final CardView rootView;
    public final TextView tvDietSubtitle;
    public final TextView tvDietTitle;

    private LayoutDietHomeEntryBinding(CardView cardView, TextView textView, CardView cardView2, TextView textView2, TextView textView3) {
        this.rootView = cardView;
        this.btnDietCta = textView;
        this.dietEntryCard = cardView2;
        this.tvDietSubtitle = textView2;
        this.tvDietTitle = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public CardView getRoot() {
        return this.rootView;
    }

    public static LayoutDietHomeEntryBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutDietHomeEntryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_diet_home_entry, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutDietHomeEntryBinding bind(View view) {
        int i = R.id.btn_diet_cta;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            CardView cardView = (CardView) view;
            i = R.id.tv_diet_subtitle;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = R.id.tv_diet_title;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView3 != null) {
                    return new LayoutDietHomeEntryBinding(cardView, textView, cardView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
