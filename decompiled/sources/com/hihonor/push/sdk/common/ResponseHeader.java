package com.hihonor.push.sdk.common;

import com.hihonor.push.sdk.c;
import com.hihonor.push.sdk.g;

/* loaded from: classes11.dex */
public class ResponseHeader implements c {

    @g
    public int statusCode;

    @g
    public String statusMessage;

    public ResponseHeader() {
        this.statusCode = -1;
    }

    public ResponseHeader(int i, String str) {
        this.statusCode = i;
        this.statusMessage = str;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }

    public void setStatusCode(int i) {
        this.statusCode = i;
    }

    public void setStatusMessage(String str) {
        this.statusMessage = str;
    }
}
