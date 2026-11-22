package com.sifli.watchfacesdk.packet.request;

import com.sifli.siflicore.util.ByteUtil;

/* loaded from: classes17.dex */
public class SFWatchfaceFileDataRequest extends SFWatchfaceRequestPacket {
    private byte[] fileData;
    private int index;

    public SFWatchfaceFileDataRequest(int i, byte[] bArr) {
        super(4);
        this.index = i;
        this.fileData = bArr;
        setReservedData(ByteUtil.mergeArrays(ByteUtil.intTo4Bytes(i), bArr));
    }
}
