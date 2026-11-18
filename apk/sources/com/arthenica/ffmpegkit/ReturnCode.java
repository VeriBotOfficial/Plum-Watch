package com.arthenica.ffmpegkit;

/* JADX INFO: loaded from: classes16.dex */
public class ReturnCode {
    public static int CANCEL = 255;
    public static int SUCCESS;
    private final int value;

    public ReturnCode(int r1) {
        this.value = r1;
    }

    public static boolean isSuccess(ReturnCode returnCode) {
        return returnCode != null && returnCode.getValue() == SUCCESS;
    }

    public static boolean isCancel(ReturnCode returnCode) {
        return returnCode != null && returnCode.getValue() == CANCEL;
    }

    public int getValue() {
        return this.value;
    }

    public boolean isValueSuccess() {
        return this.value == SUCCESS;
    }

    public boolean isValueError() {
        int r0 = this.value;
        return (r0 == SUCCESS || r0 == CANCEL) ? false : true;
    }

    public boolean isValueCancel() {
        return this.value == CANCEL;
    }

    public String toString() {
        return String.valueOf(this.value);
    }
}
