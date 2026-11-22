package com.sifli.watchfacesdk.packet.response;

/* loaded from: classes17.dex */
public class SFWatchfaceVideoDataResponse extends SFWatchfaceResponsePacket {
    private long expectIndex;

    public SFWatchfaceVideoDataResponse(int i, long j) {
        super(16, i);
        this.expectIndex = j;
    }

    public long getExpectIndex() {
        return this.expectIndex;
    }
}
