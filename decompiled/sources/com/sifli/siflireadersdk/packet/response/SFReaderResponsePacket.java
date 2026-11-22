package com.sifli.siflireadersdk.packet.response;

import com.sifli.siflireadersdk.packet.SFReaderPacketBase;

/* loaded from: classes16.dex */
public class SFReaderResponsePacket extends SFReaderPacketBase {
    private long allDataLength;
    private byte[] data;
    private int packetType;

    public SFReaderResponsePacket(int i, int i2, long j, byte[] bArr) {
        super(i);
        this.packetType = i2;
        this.allDataLength = j;
        this.data = bArr;
    }

    public int getPacketType() {
        return this.packetType;
    }

    public long getAllDataLength() {
        return this.allDataLength;
    }

    public byte[] getData() {
        return this.data;
    }
}
