package com.sifli.siflireadersdk.packet.request.audio;

import com.sifli.siflireadersdk.packet.request.SFReaderRequestPacket;
import com.sifli.siflireadersdk.util.ByteUtil;

/* loaded from: classes16.dex */
public class SFReaderAudioDelayRequestPacket extends SFReaderRequestPacket {
    private int delay;

    public SFReaderAudioDelayRequestPacket(int i) {
        super(33);
        this.delay = i;
        setReservedData(ByteUtil.intTo2Bytes(i));
    }
}
