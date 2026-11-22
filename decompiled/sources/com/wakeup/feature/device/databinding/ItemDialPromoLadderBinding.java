package com.wakeup.feature.device.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.device.R;

/* loaded from: classes3.dex */
public final class ItemDialPromoLadderBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final TextView tvLadderDesc;
    public final TextView tvLadderIndex;
    public final TextView tvLadderLabel;
    public final View vLadderDivider;

    private ItemDialPromoLadderBinding(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, View view) {
        this.rootView = linearLayout;
        this.tvLadderDesc = textView;
        this.tvLadderIndex = textView2;
        this.tvLadderLabel = textView3;
        this.vLadderDivider = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemDialPromoLadderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemDialPromoLadderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_dial_promo_ladder, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemDialPromoLadderBinding bind(View view) {
        View findChildViewById;
        int i = R.id.tv_ladder_desc;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.tv_ladder_index;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = R.id.tv_ladder_label;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView3 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.v_ladder_divider))) != null) {
                    return new ItemDialPromoLadderBinding((LinearLayout) view, textView, textView2, textView3, findChildViewById);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
