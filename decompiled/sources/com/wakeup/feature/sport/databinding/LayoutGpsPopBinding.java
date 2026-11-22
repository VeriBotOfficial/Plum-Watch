package com.wakeup.feature.sport.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import com.wakeup.feature.sport.R;

/* loaded from: classes3.dex */
public final class LayoutGpsPopBinding implements ViewBinding {
    private final LinearLayoutCompat rootView;

    private LayoutGpsPopBinding(LinearLayoutCompat linearLayoutCompat) {
        this.rootView = linearLayoutCompat;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static LayoutGpsPopBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutGpsPopBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_gps_pop, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutGpsPopBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new LayoutGpsPopBinding((LinearLayoutCompat) view);
    }
}
