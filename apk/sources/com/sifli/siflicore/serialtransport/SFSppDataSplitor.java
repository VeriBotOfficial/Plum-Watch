package com.sifli.siflicore.serialtransport;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class SFSppDataSplitor {
    public static ArrayList<byte[]> split(byte[] bArr, int r6) {
        ArrayList<byte[]> arrayList = new ArrayList<>();
        if (bArr != null && bArr.length != 0 && r6 > 0) {
            int r2 = 0;
            while (r2 < bArr.length) {
                int r3 = Math.min(r6, bArr.length - r2);
                byte[] bArr2 = new byte[r3];
                System.arraycopy(bArr, r2, bArr2, 0, r3);
                arrayList.add(bArr2);
                r2 += r3;
            }
        }
        return arrayList;
    }
}
