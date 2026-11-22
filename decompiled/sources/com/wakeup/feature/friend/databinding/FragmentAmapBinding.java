package com.wakeup.feature.friend.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.amap.api.maps.TextureMapView;
import com.wakeup.feature.friend.R;

/* loaded from: classes3.dex */
public final class FragmentAmapBinding implements ViewBinding {
    public final TextureMapView mMapView;
    private final FrameLayout rootView;

    private FragmentAmapBinding(FrameLayout frameLayout, TextureMapView textureMapView) {
        this.rootView = frameLayout;
        this.mMapView = textureMapView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentAmapBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAmapBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_amap, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentAmapBinding bind(View view) {
        int i = R.id.mMapView;
        TextureMapView textureMapView = (TextureMapView) ViewBindings.findChildViewById(view, i);
        if (textureMapView != null) {
            return new FragmentAmapBinding((FrameLayout) view, textureMapView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
