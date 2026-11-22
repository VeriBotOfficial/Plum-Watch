package com.amap.api.maps;

import android.location.Location;

/* loaded from: classes11.dex */
public interface LocationSource {

    public interface OnLocationChangedListener {
        void onLocationChanged(Location location);
    }

    void activate(OnLocationChangedListener onLocationChangedListener);

    void deactivate();
}
