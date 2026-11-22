package com.sifli.siflireadersdk.packet.response;

import com.clj.fastble.utils.HexUtil;

/* loaded from: classes16.dex */
public class SFReaderMemGetResponsePacket extends SFReaderResponsePacket {
    private String hexMem;

    public SFReaderMemGetResponsePacket(int i, byte[] bArr) {
        super(i, 0, 0L, new byte[0]);
        this.hexMem = HexUtil.encodeHexStr(bArr);
    }

    public String getHexMem() {
        return this.hexMem;
    }
}
