package com.wakeup.commonui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.wakeup.commonui.R;
import com.wakeup.commonui.ad.ScenarioBannerView;

/* loaded from: classes2.dex */
public final class LayoutScenarioBannerBinding implements ViewBinding {
    private final ScenarioBannerView rootView;

    private LayoutScenarioBannerBinding(ScenarioBannerView scenarioBannerView) {
        this.rootView = scenarioBannerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ScenarioBannerView getRoot() {
        return this.rootView;
    }

    public static LayoutScenarioBannerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutScenarioBannerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_scenario_banner, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutScenarioBannerBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new LayoutScenarioBannerBinding((ScenarioBannerView) view);
    }
}
