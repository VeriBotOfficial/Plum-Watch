package com.sifli.siflicore.serialtransport;

import java.util.ArrayList;

/* loaded from: classes14.dex */
public class SFSppDataSplitor {
    public static ArrayList<byte[]> split(byte[] bArr, int i) {
        ArrayList<byte[]> arrayList = new ArrayList<>();
        if (bArr != null && bArr.length != 0 && i > 0) {
            int i2 = 0;
            while (i2 < bArr.length) {
                int min = Math.min(i, bArr.length - i2);
                byte[] bArr2 = new byte[min];
                System.arraycopy(bArr, i2, bArr2, 0, min);
                arrayList.add(bArr2);
                i2 += min;
            }
        }
        return arrayList;
    }
}
