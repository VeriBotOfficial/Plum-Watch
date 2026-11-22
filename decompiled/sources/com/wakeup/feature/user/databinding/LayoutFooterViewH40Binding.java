package com.wakeup.feature.user.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.wakeup.feature.user.R;

/* loaded from: classes3.dex */
public final class LayoutFooterViewH40Binding implements ViewBinding {
    private final View rootView;

    private LayoutFooterViewH40Binding(View view) {
        this.rootView = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static LayoutFooterViewH40Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutFooterViewH40Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_footer_view_h40, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutFooterViewH40Binding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new LayoutFooterViewH40Binding(view);
    }
}
