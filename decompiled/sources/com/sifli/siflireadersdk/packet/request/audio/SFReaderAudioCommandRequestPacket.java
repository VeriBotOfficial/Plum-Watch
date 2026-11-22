package com.sifli.siflireadersdk.packet.request.audio;

import com.sifli.siflireadersdk.packet.request.SFReaderRequestPacket;
import com.sifli.siflireadersdk.util.ByteUtil;
import java.nio.charset.Charset;

/* loaded from: classes16.dex */
public class SFReaderAudioCommandRequestPacket extends SFReaderRequestPacket {
    private String command;

    public SFReaderAudioCommandRequestPacket(String str) {
        super(34);
        setReservedData(ByteUtil.mergeArrays(str.getBytes(Charset.defaultCharset()), new byte[]{0}));
    }
}
