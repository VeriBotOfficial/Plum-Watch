package com.sifli.siflireadersdk.packet.request.asset;

import com.sifli.siflireadersdk.packet.request.SFReaderRequestPacket;

/* loaded from: classes16.dex */
public class SFReaderAssetOptionRequestPacket extends SFReaderRequestPacket {
    private boolean option;

    public SFReaderAssetOptionRequestPacket(boolean z) {
        super(19);
        setReservedData(new byte[]{z ? (byte) 1 : (byte) 0});
    }
}
