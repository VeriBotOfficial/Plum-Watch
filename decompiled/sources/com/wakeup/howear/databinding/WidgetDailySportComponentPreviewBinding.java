package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import com.wakeup.howear.R;

/* loaded from: classes3.dex */
public final class WidgetDailySportComponentPreviewBinding implements ViewBinding {
    private final FrameLayout rootView;

    private WidgetDailySportComponentPreviewBinding(FrameLayout frameLayout) {
        this.rootView = frameLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static WidgetDailySportComponentPreviewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static WidgetDailySportComponentPreviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.widget_daily_sport_component_preview, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static WidgetDailySportComponentPreviewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new WidgetDailySportComponentPreviewBinding((FrameLayout) view);
    }
}
