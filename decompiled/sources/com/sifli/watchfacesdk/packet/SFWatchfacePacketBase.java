package com.sifli.watchfacesdk.packet;

/* loaded from: classes17.dex */
public class SFWatchfacePacketBase {
    private int commandType;

    protected SFWatchfacePacketBase(int i) {
        this.commandType = i;
    }

    public int getCommandType() {
        return this.commandType;
    }
}
