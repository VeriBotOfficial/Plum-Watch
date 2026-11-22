package com.sifli.siflicore.serialtransport;

import com.sifli.siflicore.log.SFLog;
import com.sifli.siflicore.util.ByteUtil;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes14.dex */
public class SFSerialTransportPack {
    private static final String TAG = "SFSerialTransportPack";
    private byte cateID;
    private byte flag;
    private byte[] payloadData;
    private int serialDataLength;

    public SFSerialTransportPack(byte b, byte b2, int i, byte[] bArr) {
        this.cateID = b;
        this.flag = b2;
        this.serialDataLength = i;
        if (bArr != null) {
            this.payloadData = bArr;
        } else {
            this.payloadData = new byte[0];
        }
    }

    public byte[] getPayloadData() {
        return this.payloadData;
    }

    public byte[] marshal() {
        byte b = this.flag;
        int i = 4;
        int i2 = (b == 0 || b == 1) ? 4 : 2;
        byte[] bArr = this.payloadData;
        if (bArr != null) {
            i2 += bArr.length;
        }
        byte[] bArr2 = new byte[i2];
        int i3 = 0;
        bArr2[0] = this.cateID;
        bArr2[1] = b;
        if (b == 0 || b == 1) {
            byte[] intTo2Bytes = ByteUtil.intTo2Bytes(this.serialDataLength);
            bArr2[2] = intTo2Bytes[0];
            bArr2[3] = intTo2Bytes[1];
        } else {
            i = 2;
        }
        while (true) {
            byte[] bArr3 = this.payloadData;
            if (i3 >= bArr3.length) {
                return bArr2;
            }
            bArr2[i + i3] = bArr3[i3];
            i3++;
        }
    }

    public static SFSerialTransportPack parseSingleResponse(byte[] bArr) {
        if (bArr.length < 4) {
            SFLog.e(TAG, "SFSerialTransportPack 长度不足");
            return null;
        }
        return new SFSerialTransportPack(bArr[0], bArr[1], ByteUtil.parseBytesToInt16(new byte[]{bArr[2], bArr[3]}), copyDataFrom(bArr, 4, bArr.length - 4));
    }

    public static ArrayList<SFSerialTransportPack> parsePackets(int i, byte b, byte[] bArr) {
        byte[] copyDataFrom;
        byte[] copyDataFrom2;
        byte b2;
        ArrayList arrayList = new ArrayList();
        int i2 = i - 7;
        int i3 = i - 5;
        byte[] bArr2 = new byte[0];
        if (bArr.length < i2) {
            copyDataFrom2 = bArr2;
            copyDataFrom = bArr;
        } else {
            copyDataFrom = copyDataFrom(bArr, 0, i2);
            copyDataFrom2 = copyDataFrom(bArr, i2, bArr.length - i2);
        }
        arrayList.add(copyDataFrom);
        if (copyDataFrom2.length > 0) {
            Iterator<byte[]> it = splitData(copyDataFrom2, i3).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        SFLog.i(TAG, "dataArray count = %d", Integer.valueOf(arrayList.size()));
        ArrayList<SFSerialTransportPack> arrayList2 = new ArrayList<>();
        if (arrayList.size() == 1 || arrayList.size() == 0) {
            SFSerialTransportPack sFSerialTransportPack = new SFSerialTransportPack(b, (byte) 0, 0, null);
            if (arrayList.size() > 0) {
                sFSerialTransportPack.payloadData = (byte[]) arrayList.get(0);
            }
            arrayList2.add(sFSerialTransportPack);
        } else {
            Iterator it2 = arrayList.iterator();
            int i4 = 0;
            while (it2.hasNext()) {
                byte[] bArr3 = (byte[]) it2.next();
                if (i4 == 0) {
                    b2 = 1;
                } else {
                    b2 = i4 == arrayList.size() - 1 ? (byte) 3 : (byte) 2;
                }
                arrayList2.add(new SFSerialTransportPack(b, b2, 0, bArr3));
                i4++;
            }
        }
        arrayList2.get(0).serialDataLength = bArr.length;
        SFLog.d(TAG, "parsePackets srcLen =%d,packts=%d", Integer.valueOf(bArr.length), Integer.valueOf(arrayList2.size()));
        return arrayList2;
    }

    private static ArrayList<byte[]> splitData(byte[] bArr, int i) {
        SFLog.d(TAG, "splitData len=%d,upperlimit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i));
        ArrayList<byte[]> arrayList = new ArrayList<>();
        if (i <= 0) {
            arrayList.add(bArr);
            return arrayList;
        }
        int i2 = 0;
        int length = (bArr.length / i) + (bArr.length % i == 0 ? 0 : 1);
        SFLog.d(TAG, "count=%d", Integer.valueOf(length));
        while (i2 < length) {
            int i3 = i2 * i;
            arrayList.add(ByteUtil.copyFrom(bArr, i3, i2 == length + (-1) ? bArr.length - i3 : i));
            i2++;
        }
        SFLog.d(TAG, "splitData done=%d", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    private static byte[] copyDataFrom(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr2[i3] = bArr[i + i3];
        }
        return bArr2;
    }
}
