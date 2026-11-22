package com.sifli.watchfacesdk.packet.request;

import com.sifli.siflicore.util.ByteUtil;
import com.sifli.watchfacesdk.packet.SFWatchfacePacketBase;

/* loaded from: classes17.dex */
public class SFWatchfaceRequestPacket extends SFWatchfacePacketBase {
    private int length;
    private byte[] reservedData;

    public SFWatchfaceRequestPacket(int i) {
        super(i);
    }

    public void setReservedData(byte[] bArr) {
        if (bArr == null) {
            this.reservedData = new byte[0];
        } else {
            this.reservedData = bArr;
        }
        this.length = this.reservedData.length;
    }

    public byte[] mashal() {
        byte[] bArr = new byte[this.length + 4];
        byte[] intTo2Bytes = ByteUtil.intTo2Bytes(getCommandType());
        byte[] intTo2Bytes2 = ByteUtil.intTo2Bytes(this.length);
        int i = 0;
        bArr[0] = intTo2Bytes[0];
        bArr[1] = intTo2Bytes[1];
        bArr[2] = intTo2Bytes2[0];
        bArr[3] = intTo2Bytes2[1];
        while (true) {
            byte[] bArr2 = this.reservedData;
            if (i >= bArr2.length) {
                return bArr;
            }
            bArr[i + 4] = bArr2[i];
            i++;
        }
    }
}
