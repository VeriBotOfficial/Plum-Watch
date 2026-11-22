package com.wakeup.feature.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import com.wakeup.feature.health.R;

/* loaded from: classes3.dex */
public final class ItemBloodOxygenInfoBinding implements ViewBinding {
    private final LinearLayoutCompat rootView;

    private ItemBloodOxygenInfoBinding(LinearLayoutCompat linearLayoutCompat) {
        this.rootView = linearLayoutCompat;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static ItemBloodOxygenInfoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemBloodOxygenInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_blood_oxygen_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemBloodOxygenInfoBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new ItemBloodOxygenInfoBinding((LinearLayoutCompat) view);
    }
}
