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
public final class PlansItemTaskBinding implements ViewBinding {
    private final MaterialCardView rootView;
    public final TextView tvEmoji;
    public final TextView tvFreqChip;
    public final TextView tvMeta;
    public final TextView tvNew;
    public final TextView tvPausedBadge;
    public final TextView tvRecordCount;
    public final TextView tvTitle;

    private PlansItemTaskBinding(MaterialCardView materialCardView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        this.rootView = materialCardView;
        this.tvEmoji = textView;
        this.tvFreqChip = textView2;
        this.tvMeta = textView3;
        this.tvNew = textView4;
        this.tvPausedBadge = textView5;
        this.tvRecordCount = textView6;
        this.tvTitle = textView7;
    }

    @Override // androidx.viewbinding.ViewBinding
    public MaterialCardView getRoot() {
        return this.rootView;
    }

    public static PlansItemTaskBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static PlansItemTaskBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.plans_item_task, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static PlansItemTaskBinding bind(View view) {
        int i = R.id.tvEmoji;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.tvFreqChip;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = R.id.tvMeta;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView3 != null) {
                    i = R.id.tvNew;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView4 != null) {
                        i = R.id.tvPausedBadge;
                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView5 != null) {
                            i = R.id.tvRecordCount;
                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView6 != null) {
                                i = R.id.tvTitle;
                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView7 != null) {
                                    return new PlansItemTaskBinding((MaterialCardView) view, textView, textView2, textView3, textView4, textView5, textView6, textView7);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
