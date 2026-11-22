package com.sifli.watchfacesdk.packet.request;

import com.sifli.siflicore.util.ByteUtil;

/* loaded from: classes17.dex */
public class SFWatchfaceEntireStartRequest extends SFWatchfaceRequestPacket {
    private int allFilesLen;
    private int phoneType;
    private int type;

    public SFWatchfaceEntireStartRequest(int i, int i2, int i3) {
        super(0);
        this.type = i;
        this.phoneType = i2;
        this.allFilesLen = i3;
        setReservedData(ByteUtil.mergeArrays(ByteUtil.mergeArrays(ByteUtil.intTo2Bytes(i), new byte[]{(byte) i2}), ByteUtil.intTo4Bytes(i3)));
    }

    public int getType() {
        return this.type;
    }

    public int getPhoneType() {
        return this.phoneType;
    }

    public int getAllFilesLen() {
        return this.allFilesLen;
    }
}
