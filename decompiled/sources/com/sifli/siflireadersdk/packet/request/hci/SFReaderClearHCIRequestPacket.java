package com.sifli.siflireadersdk.packet.request.hci;

import com.sifli.siflireadersdk.packet.request.SFReaderRequestPacket;

/* loaded from: classes16.dex */
public class SFReaderClearHCIRequestPacket extends SFReaderRequestPacket {
    public SFReaderClearHCIRequestPacket() {
        super(40);
        setReservedData(null);
    }
}
