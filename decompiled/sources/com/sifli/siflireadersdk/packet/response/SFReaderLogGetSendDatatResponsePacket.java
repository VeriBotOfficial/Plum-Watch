package com.sifli.siflireadersdk.packet.response;

/* loaded from: classes16.dex */
public class SFReaderLogGetSendDatatResponsePacket extends SFReaderResponsePacket {
    private int index;

    public SFReaderLogGetSendDatatResponsePacket(int i, int i2, byte[] bArr) {
        super(i, 2, 0L, bArr);
        this.index = i2;
    }

    public int getIndex() {
        return this.index;
    }
}
