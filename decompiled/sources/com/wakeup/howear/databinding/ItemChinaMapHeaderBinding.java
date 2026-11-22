package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.howear.R;
import com.wakeup.howear.view.gift.ChinaMapView;

/* loaded from: classes3.dex */
public final class ItemChinaMapHeaderBinding implements ViewBinding {
    public final ChinaMapView chinaMapView;
    private final FrameLayout rootView;

    private ItemChinaMapHeaderBinding(FrameLayout frameLayout, ChinaMapView chinaMapView) {
        this.rootView = frameLayout;
        this.chinaMapView = chinaMapView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static ItemChinaMapHeaderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemChinaMapHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_china_map_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemChinaMapHeaderBinding bind(View view) {
        int i = R.id.chinaMapView;
        ChinaMapView chinaMapView = (ChinaMapView) ViewBindings.findChildViewById(view, i);
        if (chinaMapView != null) {
            return new ItemChinaMapHeaderBinding((FrameLayout) view, chinaMapView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
