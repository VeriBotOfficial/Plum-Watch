package com.wakeup.feature.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.wakeup.feature.health.R;

/* loaded from: classes3.dex */
public final class ItemBreathLabelBinding implements ViewBinding {
    private final TextView rootView;
    public final TextView tvName;

    private ItemBreathLabelBinding(TextView textView, TextView textView2) {
        this.rootView = textView;
        this.tvName = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public TextView getRoot() {
        return this.rootView;
    }

    public static ItemBreathLabelBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemBreathLabelBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_breath_label, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemBreathLabelBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) view;
        return new ItemBreathLabelBinding(textView, textView);
    }
}
