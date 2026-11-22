package com.sifli.siflireadersdk.packet.request.log;

import com.sifli.siflireadersdk.packet.request.SFReaderRequestPacket;

/* loaded from: classes16.dex */
public class SFReaderLogOptionRequest extends SFReaderRequestPacket {
    private boolean option;

    public SFReaderLogOptionRequest(boolean z) {
        super(16);
        setReservedData(new byte[]{z ? (byte) 1 : (byte) 0});
    }
}
