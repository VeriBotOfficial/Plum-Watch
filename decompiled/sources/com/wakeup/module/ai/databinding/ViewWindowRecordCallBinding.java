package com.wakeup.module.ai.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.wakeup.module.ai.R;

/* loaded from: classes4.dex */
public final class ViewWindowRecordCallBinding implements ViewBinding {
    private final LinearLayout rootView;

    private ViewWindowRecordCallBinding(LinearLayout linearLayout) {
        this.rootView = linearLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ViewWindowRecordCallBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ViewWindowRecordCallBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.view_window_record_call, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ViewWindowRecordCallBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new ViewWindowRecordCallBinding((LinearLayout) view);
    }
}
