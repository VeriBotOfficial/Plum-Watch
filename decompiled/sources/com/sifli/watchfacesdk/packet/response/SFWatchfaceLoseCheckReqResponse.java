package com.sifli.watchfacesdk.packet.response;

/* loaded from: classes17.dex */
public class SFWatchfaceLoseCheckReqResponse extends SFWatchfaceResponsePacket {
    private long expectIndex;

    public SFWatchfaceLoseCheckReqResponse(int i, long j) {
        super(10, i);
        this.expectIndex = j;
    }

    public long getExpectIndex() {
        return this.expectIndex;
    }
}
