package com.beken.iot.smartsdk.core.pack;

import com.beken.iot.smartsdk.core.data.BasicHead;
import com.beken.iot.smartsdk.core.log.BKSmartLog;
import java.util.Arrays;

/* loaded from: classes13.dex */
public class TransmissionPacked extends TransmissionConstructor {
    private byte[] packData = null;
    private int sequence = 0;

    public TransmissionPacked(byte[] bArr) {
        this.payload = bArr;
    }

    public int getSequence() {
        return this.sequence;
    }

    public byte[] pack() {
        byte[] bArr = this.packData;
        if (bArr != null) {
            return bArr;
        }
        int currentTimeMillis = (int) System.currentTimeMillis();
        this.sequence = TransmissionConstructor.getChannelSequence();
        this.basicHead = new BasicHead(1, currentTimeMillis, this.sequence);
        byte[] byteArrayMerge = TransmissionConstructor.byteArrayMerge(this.basicHead.pack(this.payload), this.payload);
        this.packData = byteArrayMerge;
        return byteArrayMerge;
    }

    public byte[] packExpand() {
        byte[] bArr = this.packData;
        if (bArr != null) {
            return bArr;
        }
        int currentTimeMillis = (int) System.currentTimeMillis();
        this.sequence = TransmissionConstructor.getChannelSequence();
        this.basicHead = new BasicHead(1, currentTimeMillis, this.sequence);
        int headLength = 200 - this.basicHead.headLength();
        if (this.payload.length < headLength) {
            byte[] bArr2 = new byte[headLength];
            System.arraycopy(this.payload, 0, bArr2, 0, this.payload.length);
            Arrays.fill(bArr2, this.payload.length, headLength, (byte) 0);
            this.payload = bArr2;
        }
        this.packData = TransmissionConstructor.byteArrayMerge(this.basicHead.pack(this.payload), this.payload);
        printD("pack: length " + this.packData.length);
        printD("pack: data " + Arrays.toString(this.packData));
        return this.packData;
    }

    private void printD(String str) {
        BKSmartLog.INSTANCE.d("TransmissionPacked", str);
    }
}
