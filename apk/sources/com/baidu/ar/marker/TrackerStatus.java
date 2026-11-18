package com.baidu.ar.marker;

/* JADX INFO: loaded from: classes16.dex */
public enum TrackerStatus {
    TRACKING_STATUS_NORMAL(0),
    TRACKING_STATUS_LIMITED_INITIALIZING(1),
    TRACKING_STATUS_LIMITED_EXCESSIVE_MOTION(2),
    TRACKING_STATUS_LIMITED_INSUFFICIENT_FEATURES(3),
    TRACKING_STATUS_LIMITED_RELOCALIZING(4),
    TRACKING_STATUS_LIMITED_UNKNOWN(99);

    private int value;

    TrackerStatus(int r3) {
        this.value = r3;
    }

    public int getValue() {
        return this.value;
    }
}
