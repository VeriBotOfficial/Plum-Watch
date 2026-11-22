package com.sifli.siflireadersdk.packet.request.hci;

import com.sifli.siflireadersdk.packet.request.SFReaderRequestPacket;

/* loaded from: classes16.dex */
public class SFReaderHCIOptionRequestPacket extends SFReaderRequestPacket {
    private boolean option;

    public SFReaderHCIOptionRequestPacket(boolean z) {
        super(39);
        setReservedData(new byte[]{z ? (byte) 1 : (byte) 0});
    }
}
