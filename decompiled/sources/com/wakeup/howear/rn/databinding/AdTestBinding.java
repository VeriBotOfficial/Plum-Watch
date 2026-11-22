package com.wakeup.howear.rn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.wakeup.howear.rn.R;

/* loaded from: classes3.dex */
public final class AdTestBinding implements ViewBinding {
    private final LinearLayout rootView;

    private AdTestBinding(LinearLayout linearLayout) {
        this.rootView = linearLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static AdTestBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AdTestBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.ad_test, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static AdTestBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new AdTestBinding((LinearLayout) view);
    }
}
