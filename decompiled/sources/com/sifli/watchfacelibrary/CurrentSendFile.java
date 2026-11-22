package com.sifli.watchfacelibrary;

import java.util.ArrayList;

/* loaded from: classes17.dex */
public class CurrentSendFile {
    ArrayList<byte[]> sendData;
    int totalCount;
    int totalSize;

    public CurrentSendFile(byte[] bArr, int i) {
        byte[] bArr2;
        int length = bArr.length;
        this.totalSize = length;
        if (length == 0) {
            this.totalCount = 0;
            this.sendData = null;
            return;
        }
        if (bArr.length % i == 0) {
            this.totalCount = bArr.length / i;
        } else {
            this.totalCount = (bArr.length / i) + 1;
        }
        this.sendData = new ArrayList<>(this.totalCount);
        int i2 = 0;
        for (int i3 = 0; i3 < this.totalCount; i3++) {
            int i4 = i2 + i;
            if (i4 <= bArr.length) {
                bArr2 = new byte[i];
                System.arraycopy(bArr, i2, bArr2, 0, i);
                i2 = i4;
            } else {
                int length2 = bArr.length - i2;
                bArr2 = new byte[length2];
                System.arraycopy(bArr, i2, bArr2, 0, length2);
                i2 += length2;
            }
            this.sendData.add(i3, bArr2);
        }
    }

    public byte[] getData(int i) {
        return this.sendData.get(i);
    }

    public int getTotalCount() {
        return this.totalCount;
    }
}
