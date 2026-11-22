package com.amap.location.support.signal.status;

/* loaded from: classes11.dex */
public interface ISwitchManager {
    void addStatusListener(StatusChangeListener statusChangeListener);

    boolean isAirplaneModeOn();

    boolean isLocationCoarsePermissionAllowed();

    boolean isLocationFinePermissionAllowed();

    boolean isLocationOn();

    boolean isScreenOn();

    void removeStatusListener(StatusChangeListener statusChangeListener);
}
