package com.wakeup.common.location;

/* loaded from: classes2.dex */
public interface ILocationListener {
    default void onLastKnownLocation(LocationBean lastLocationBean) {
    }

    void onLocationChanged(LocationBean locationBean);

    default void onLocationError(Integer errCode, String errMsg) {
    }
}
