package com.wakeup.module.device.lib.data;

/* loaded from: classes4.dex */
public class BleMsg {
    public static final String KEY_NOTIFY_BUNDLE_STATUS = "notify_status";
    public static final String KEY_NOTIFY_BUNDLE_VALUE = "notify_value";
    public static final String KEY_SET_MTU_BUNDLE_STATUS = "mtu_status";
    public static final String KEY_SET_MTU_BUNDLE_VALUE = "mtu_value";
    public static final String KEY_WRITE_BUNDLE_STATUS = "write_status";
    public static final String KEY_WRITE_BUNDLE_VALUE = "write_value";
    public static final int MSG_CHA_NOTIFY_DATA_CHANGE = 19;
    public static final int MSG_CHA_NOTIFY_RESULT = 18;
    public static final int MSG_CHA_NOTIFY_START = 17;
    public static final int MSG_CHA_WRITE_RESULT = 50;
    public static final int MSG_CHA_WRITE_START = 49;
    public static final int MSG_CONNECT_FAIL = 1;
    public static final int MSG_CONNECT_OVER_TIME = 7;
    public static final int MSG_DISCONNECTED = 2;
    public static final int MSG_DISCOVER_FAIL = 5;
    public static final int MSG_DISCOVER_SERVICES = 4;
    public static final int MSG_DISCOVER_SUCCESS = 6;
    public static final int MSG_RECONNECT = 3;
    public static final int MSG_SCAN_DEVICE = 0;
    public static final int MSG_SET_MTU_RESULT = 98;
    public static final int MSG_SET_MTU_START = 97;
    public static final int MSG_SPLIT_WRITE_NEXT = 51;
}
