package com.sifli.watchfacesdk.packet.factory;

import com.sifli.siflicore.error.SFError;
import com.sifli.watchfacesdk.packet.response.SFWatchfaceResponsePacket;

/* loaded from: classes17.dex */
public class SFWatchfaceResponseResult {
    private SFError error;
    private SFWatchfaceResponsePacket response;
    private boolean success;

    public SFWatchfaceResponseResult(boolean z, SFWatchfaceResponsePacket sFWatchfaceResponsePacket, SFError sFError) {
        this.success = z;
        this.response = sFWatchfaceResponsePacket;
        this.error = sFError;
    }

    public SFWatchfaceResponseResult() {
    }

    public boolean isSuccess() {
        return this.success;
    }

    public void setSuccess(boolean z) {
        this.success = z;
    }

    public SFWatchfaceResponsePacket getResponse() {
        return this.response;
    }

    public void setResponse(SFWatchfaceResponsePacket sFWatchfaceResponsePacket) {
        this.response = sFWatchfaceResponsePacket;
    }

    public SFError getError() {
        return this.error;
    }

    public void setError(SFError sFError) {
        this.error = sFError;
    }
}
