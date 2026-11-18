package com.beken.iot.smartsdk.core.data;

/* JADX INFO: loaded from: classes15.dex */
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

    public EventHead(int r1, int r2, int r3, int r4) {
        this.opcode = r1;
        this.status = r2;
        this.eventFlags = r3;
        this.length = r4;
    }
}
