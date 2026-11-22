package com.amap.location.support.signal.status;

/* loaded from: classes11.dex */
public interface StatusChangeListener {
    public static final int STATUS_ACTION_AIRPLANE_MODE = 2;
    public static final int STATUS_ACTION_LOCATION_MODE = 1;
    public static final int STATUS_ACTION_NETWORK_CHANGE = 3;
    public static final int STATUS_ACTION_SCREEN_ONOFF = 6;
    public static final int STATUS_ACTION_WIFI_CONNECTION = 5;
    public static final int STATUS_ACTION_WIFI_ENABLE = 4;

    int getAction();

    void onChange(int i, boolean z, int i2, int i3);
}
