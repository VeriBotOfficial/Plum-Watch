package com.wakeup.module.device.lib.exception;

/* loaded from: classes4.dex */
public class HeadsetException extends BleException {
    public HeadsetException(int i, String str) {
        super(i, str);
    }

    public static HeadsetException createHeadsetException() {
        return new HeadsetException(200, "Headset connect Exception");
    }

    public static HeadsetException createHeadsetDeviceNullException() {
        return new HeadsetException(201, "Headset device is null");
    }
}
