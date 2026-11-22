package com.sifli.watchfacesdk.packet.response;

/* loaded from: classes17.dex */
public class SFWatchfaceFileDataResponse extends SFWatchfaceResponsePacket {
    private long expectIndex;

    public SFWatchfaceFileDataResponse(int i, long j) {
        super(5, i);
        this.expectIndex = j;
    }

    public long getExpectIndex() {
        return this.expectIndex;
    }
}
