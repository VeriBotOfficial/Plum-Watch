package com.sifli.watchfacesdk.packet.request;

import com.sifli.siflicore.util.ByteUtil;

/* loaded from: classes17.dex */
public class SFWatchfaceFileSpaceRequest extends SFWatchfaceRequestPacket {
    private int wfBlock;

    public SFWatchfaceFileSpaceRequest(int i) {
        super(13);
        this.wfBlock = i;
        setReservedData(ByteUtil.intTo4Bytes(i));
    }
}
