package com.wakeup.feature.plans.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.wakeup.feature.plans.R;

/* loaded from: classes3.dex */
public final class PlansItemHistoryBinding implements ViewBinding {
    private final MaterialCardView rootView;
    public final TextView tvEmoji;
    public final TextView tvNew;
    public final TextView tvPreview;
    public final TextView tvTime;
    public final TextView tvTitle;

    private PlansItemHistoryBinding(MaterialCardView materialCardView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = materialCardView;
        this.tvEmoji = textView;
        this.tvNew = textView2;
        this.tvPreview = textView3;
        this.tvTime = textView4;
        this.tvTitle = textView5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public MaterialCardView getRoot() {
        return this.rootView;
    }

    public static PlansItemHistoryBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static PlansItemHistoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.plans_item_history, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static PlansItemHistoryBinding bind(View view) {
        int i = R.id.tvEmoji;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.tvNew;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = R.id.tvPreview;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView3 != null) {
                    i = R.id.tvTime;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView4 != null) {
                        i = R.id.tvTitle;
                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView5 != null) {
                            return new PlansItemHistoryBinding((MaterialCardView) view, textView, textView2, textView3, textView4, textView5);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
