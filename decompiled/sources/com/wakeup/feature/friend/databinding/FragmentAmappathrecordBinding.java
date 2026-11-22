package com.wakeup.feature.friend.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.amap.api.maps.MapView;
import com.wakeup.feature.friend.R;

/* loaded from: classes3.dex */
public final class FragmentAmappathrecordBinding implements ViewBinding {
    public final MapView mMapView;
    private final MapView rootView;

    private FragmentAmappathrecordBinding(MapView mapView, MapView mapView2) {
        this.rootView = mapView;
        this.mMapView = mapView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public MapView getRoot() {
        return this.rootView;
    }

    public static FragmentAmappathrecordBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAmappathrecordBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_amappathrecord, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentAmappathrecordBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        MapView mapView = (MapView) view;
        return new FragmentAmappathrecordBinding(mapView, mapView);
    }
}
