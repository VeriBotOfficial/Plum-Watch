package com.sifli.watchfacesdk.packet.request;

/* loaded from: classes17.dex */
public class SFWatchfaceTeminateRequest extends SFWatchfaceRequestPacket {
    private int reason;

    public SFWatchfaceTeminateRequest(int i) {
        super(12);
        setReservedData(new byte[]{(byte) i});
    }
}
