package com.sifli.siflicore.util;

import java.util.ArrayList;

/* loaded from: classes14.dex */
public class DataTool {
    public static ArrayList<byte[]> splitData(byte[] bArr, int i) {
        ArrayList<byte[]> arrayList = new ArrayList<>();
        if (i <= 0) {
            arrayList.add(bArr);
            return arrayList;
        }
        int i2 = 0;
        int length = (bArr.length / i) + (bArr.length % i == 0 ? 0 : 1);
        while (i2 < length) {
            int i3 = i2 * i;
            arrayList.add(ByteUtil.copyFrom(bArr, i3, i2 == length + (-1) ? bArr.length - i3 : i));
            i2++;
        }
        return arrayList;
    }

    public static int computeSliceCount(long j, int i) {
        long j2 = i;
        return (int) ((j / j2) + (j % j2 == 0 ? 0 : 1));
    }

    public static int calculateFileBlock(int i, int i2) {
        return (i2 / i) + (i2 % i > 0 ? 1 : 0);
    }
}
