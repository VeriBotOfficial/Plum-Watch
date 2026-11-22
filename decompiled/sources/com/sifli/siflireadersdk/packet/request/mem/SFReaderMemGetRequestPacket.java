package com.sifli.siflireadersdk.packet.request.mem;

import com.sifli.siflireadersdk.packet.request.SFReaderRequestPacket;
import java.nio.charset.Charset;

/* loaded from: classes16.dex */
public class SFReaderMemGetRequestPacket extends SFReaderRequestPacket {
    private String addr;

    public SFReaderMemGetRequestPacket(String str) {
        super(36);
        this.addr = str;
        setReservedData(str.getBytes(Charset.defaultCharset()));
    }
}
