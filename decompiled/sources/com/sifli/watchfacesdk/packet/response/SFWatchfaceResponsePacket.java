package com.sifli.watchfacesdk.packet.response;

import com.sifli.watchfacesdk.packet.SFWatchfacePacketBase;

/* loaded from: classes17.dex */
public class SFWatchfaceResponsePacket extends SFWatchfacePacketBase {
    private int result;

    protected SFWatchfaceResponsePacket(int i, int i2) {
        super(i);
        this.result = i2;
    }

    public int getResult() {
        return this.result;
    }
}
