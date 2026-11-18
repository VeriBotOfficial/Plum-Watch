package com.sifli.siflidfu;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public class CurrentSendFile {
    String fileName;
    int packetSize;
    ArrayList<byte[]> sendData;
    int totalCount;
    int totalSize;

    public CurrentSendFile(byte[] bArr, int r6, String str) {
        byte[] bArr2;
        this.packetSize = 2048;
        int length = bArr.length;
        this.totalSize = length;
        this.fileName = str;
        if (length == 0) {
            this.totalCount = 0;
            this.sendData = null;
            return;
        }
        this.packetSize = r6;
        if (bArr.length % r6 == 0) {
            this.totalCount = bArr.length / r6;
        } else {
            this.totalCount = (bArr.length / r6) + 1;
        }
        this.sendData = new ArrayList<>(this.totalCount);
        int r1 = 0;
        for (int r0 = 0; r0 < this.totalCount; r0++) {
            int r2 = r1 + r6;
            if (r2 <= bArr.length) {
                bArr2 = new byte[r6];
                System.arraycopy(bArr, r1, bArr2, 0, r6);
                r1 = r2;
            } else {
                int length2 = bArr.length - r1;
                bArr2 = new byte[length2];
                System.arraycopy(bArr, r1, bArr2, 0, length2);
                r1 += length2;
            }
            this.sendData.add(r0, bArr2);
        }
    }

    public CurrentSendFile(int r1, int r2, String str) {
        this.totalSize = r1;
        this.fileName = str;
        this.packetSize = r2;
        if (r1 % r2 == 0) {
            this.totalCount = r1 / r2;
        } else {
            this.totalCount = (r1 / r2) + 1;
        }
    }

    public byte[] getData(int r2) {
        return this.sendData.get(r2);
    }

    public int getTotalCount() {
        return this.totalCount;
    }

    public String getFileName() {
        return this.fileName;
    }

    public int getTotalSize() {
        return this.totalSize;
    }

    public int getPacketSize() {
        return this.packetSize;
    }
}
