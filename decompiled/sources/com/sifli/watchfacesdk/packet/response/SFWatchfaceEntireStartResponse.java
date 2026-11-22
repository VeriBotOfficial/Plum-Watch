package com.sifli.watchfacesdk.packet.response;

/* loaded from: classes17.dex */
public class SFWatchfaceEntireStartResponse extends SFWatchfaceResponsePacket {
    private long blockLeft;
    private int blockLength;
    private int maxDataLen;
    private int version;

    public SFWatchfaceEntireStartResponse(int i, int i2, int i3, int i4, long j) {
        super(1, i);
        this.maxDataLen = i2;
        this.version = i3;
        this.blockLength = i4;
        this.blockLeft = j;
    }

    public int getMaxDataLen() {
        return this.maxDataLen;
    }

    public int getVersion() {
        return this.version;
    }

    public int getBlockLength() {
        return this.blockLength;
    }

    public long getBlockLeft() {
        return this.blockLeft;
    }

    public String description() {
        return String.format("version=%d,blockLength=%d,blockLeft=%d,result=%d,maxDataLen=%d", Integer.valueOf(this.version), Integer.valueOf(this.blockLength), Long.valueOf(this.blockLeft), Integer.valueOf(getResult()), Integer.valueOf(this.maxDataLen));
    }
}
