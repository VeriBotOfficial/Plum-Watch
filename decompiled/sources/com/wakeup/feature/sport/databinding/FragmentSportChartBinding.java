package com.wakeup.feature.sport.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.sport.R;

/* loaded from: classes3.dex */
public final class FragmentSportChartBinding implements ViewBinding {
    public final LinearLayoutCompat llContainer;
    private final NestedScrollView rootView;

    private FragmentSportChartBinding(NestedScrollView nestedScrollView, LinearLayoutCompat linearLayoutCompat) {
        this.rootView = nestedScrollView;
        this.llContainer = linearLayoutCompat;
    }

    @Override // androidx.viewbinding.ViewBinding
    public NestedScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentSportChartBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSportChartBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_sport_chart, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentSportChartBinding bind(View view) {
        int i = R.id.ll_container;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
        if (linearLayoutCompat != null) {
            return new FragmentSportChartBinding((NestedScrollView) view, linearLayoutCompat);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
