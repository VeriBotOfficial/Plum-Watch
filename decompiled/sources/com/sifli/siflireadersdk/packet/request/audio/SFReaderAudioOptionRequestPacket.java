package com.sifli.siflireadersdk.packet.request.audio;

import com.sifli.siflireadersdk.packet.request.SFReaderRequestPacket;

/* loaded from: classes16.dex */
public class SFReaderAudioOptionRequestPacket extends SFReaderRequestPacket {
    private int type;

    public SFReaderAudioOptionRequestPacket(int i) {
        super(30);
        this.type = i;
        setReservedData(new byte[]{(byte) i});
    }
}
