package com.wakeup.feature.plans.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.wakeup.feature.plans.R;

/* loaded from: classes3.dex */
public final class PlansTimePickerItemBinding implements ViewBinding {
    private final TextView rootView;
    public final TextView tvOption;

    private PlansTimePickerItemBinding(TextView textView, TextView textView2) {
        this.rootView = textView;
        this.tvOption = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public TextView getRoot() {
        return this.rootView;
    }

    public static PlansTimePickerItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static PlansTimePickerItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.plans_time_picker_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static PlansTimePickerItemBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) view;
        return new PlansTimePickerItemBinding(textView, textView);
    }
}
