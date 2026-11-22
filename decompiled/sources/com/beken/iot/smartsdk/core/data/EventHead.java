package com.beken.iot.smartsdk.core.data;

/* loaded from: classes13.dex */
public class EventHead {
    public static final int STATUS_ALREADY = 2;
    public static final int STATUS_ERROR = 1;
    public static final int STATUS_NULL = 11;
    public static final int STATUS_OK = 0;
    public static final int STATUS_UNKNOWN = 12;
    public int eventFlags;
    public int length;
    public int opcode;
    public int status;

    public EventHead(int i, int i2, int i3, int i4) {
        this.opcode = i;
        this.status = i2;
        this.eventFlags = i3;
        this.length = i4;
    }
}
