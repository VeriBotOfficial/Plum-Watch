package com.wakeup.feature.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.health.R;

/* loaded from: classes3.dex */
public final class ActivityHealthDashboardBinding implements ViewBinding {
    public final FrameLayout pageContainer;
    public final FrameLayout root;
    private final FrameLayout rootView;
    public final LayoutHdSheetBinding sheet;

    private ActivityHealthDashboardBinding(FrameLayout frameLayout, FrameLayout frameLayout2, FrameLayout frameLayout3, LayoutHdSheetBinding layoutHdSheetBinding) {
        this.rootView = frameLayout;
        this.pageContainer = frameLayout2;
        this.root = frameLayout3;
        this.sheet = layoutHdSheetBinding;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static ActivityHealthDashboardBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityHealthDashboardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_health_dashboard, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityHealthDashboardBinding bind(View view) {
        int i = R.id.page_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            FrameLayout frameLayout2 = (FrameLayout) view;
            int i2 = R.id.sheet;
            View findChildViewById = ViewBindings.findChildViewById(view, i2);
            if (findChildViewById != null) {
                return new ActivityHealthDashboardBinding(frameLayout2, frameLayout, frameLayout2, LayoutHdSheetBinding.bind(findChildViewById));
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
