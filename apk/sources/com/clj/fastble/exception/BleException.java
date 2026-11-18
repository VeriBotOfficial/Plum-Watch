package com.clj.fastble.exception;

import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public abstract class BleException implements Serializable {
    public static final int ERROR_CODE_GATT = 101;
    public static final int ERROR_CODE_OTHER = 102;
    public static final int ERROR_CODE_TIMEOUT = 100;
    private static final long serialVersionUID = 8004414918500865564L;
    private int code;
    private String description;

    public BleException(int r1, String str) {
        this.code = r1;
        this.description = str;
    }

    public int getCode() {
        return this.code;
    }

    public BleException setCode(int r1) {
        this.code = r1;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public BleException setDescription(String str) {
        this.description = str;
        return this;
    }

    public String toString() {
        return "BleException { code=" + this.code + ", description='" + this.description + "'}";
    }
}
