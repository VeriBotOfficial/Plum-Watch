package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import com.wakeup.howear.R;

/* loaded from: classes3.dex */
public final class ItemTextViewBinding implements ViewBinding {
    public final CardView cardView;
    private final CardView rootView;

    private ItemTextViewBinding(CardView cardView, CardView cardView2) {
        this.rootView = cardView;
        this.cardView = cardView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public CardView getRoot() {
        return this.rootView;
    }

    public static ItemTextViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemTextViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_text_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemTextViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        CardView cardView = (CardView) view;
        return new ItemTextViewBinding(cardView, cardView);
    }
}
