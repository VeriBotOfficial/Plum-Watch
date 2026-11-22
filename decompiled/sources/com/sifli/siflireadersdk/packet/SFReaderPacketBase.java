package com.sifli.siflireadersdk.packet;

/* loaded from: classes16.dex */
public class SFReaderPacketBase {
    private int commandType;

    protected SFReaderPacketBase(int i) {
        this.commandType = i;
    }

    public int getCommandType() {
        return this.commandType;
    }
}
