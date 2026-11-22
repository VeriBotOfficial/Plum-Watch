package com.wakeup.commonui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import com.wakeup.commonui.R;

/* loaded from: classes2.dex */
public final class LayoutCommonStateLoadingBinding implements ViewBinding {
    private final FrameLayout rootView;

    private LayoutCommonStateLoadingBinding(FrameLayout frameLayout) {
        this.rootView = frameLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static LayoutCommonStateLoadingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutCommonStateLoadingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_common_state_loading, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutCommonStateLoadingBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new LayoutCommonStateLoadingBinding((FrameLayout) view);
    }
}
