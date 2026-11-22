package com.beken.iot.smartsdk.core.pack;

import com.beken.iot.smartsdk.core.data.BasicHead;
import com.beken.iot.smartsdk.core.log.BKSmartLog;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes13.dex */
public class TransmissionUnpacked extends TransmissionConstructor {
    public static final int HD_IND_CRC = 12;
    public static final int HD_IND_FLAGS_HB = 3;
    public static final int HD_IND_FLAGS_LB = 2;
    public static final int HD_IND_LENGTH_HB = 11;
    public static final int HD_IND_LENGTH_LB = 10;
    public static final int HD_IND_MAGIC_HB = 1;
    public static final int HD_IND_MAGIC_LB = 0;
    public static final int HD_IND_REV0 = 13;
    public static final int HD_IND_REV1 = 14;
    public static final int HD_IND_REV2 = 15;
    public static final int HD_IND_SEQUENCE_HB = 9;
    public static final int HD_IND_SEQUENCE_LB = 8;
    public static final int HD_IND_TIMESTAMP_HHB = 7;
    public static final int HD_IND_TIMESTAMP_HLB = 6;
    public static final int HD_IND_TIMESTAMP_LHB = 5;
    public static final int HD_IND_TIMESTAMP_LLB = 4;
    public static final byte HD_VAL_MAGIC_HB = -16;
    public static final byte HD_VAL_MAGIC_LB = -43;
    public static final int HEAD_SIZE_TOTAL = 16;
    private static final String TAG = "TransmissionUnpacked";
    protected BasicHead basicHead;

    private static void printD(String str) {
    }

    public TransmissionUnpacked(int i, int i2, int i3, byte b, int i4, byte[] bArr, byte[] bArr2) {
        this.basicHead = null;
        BasicHead basicHead = new BasicHead(i, i2, i3);
        this.basicHead = basicHead;
        basicHead.createTime = System.currentTimeMillis();
        this.basicHead.length = i4;
        this.basicHead.crc = b;
        this.basicHead.reserved = bArr2;
        this.payload = new byte[i4];
        System.arraycopy(bArr, 0, this.payload, 0, i4);
        printD(String.format("flags: %X, timestamp: %d, sequence: %d, length: %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
        byte hndCrc8 = BasicHead.hndCrc8(bArr, bArr.length, (byte) -1);
        if (hndCrc8 != b) {
            printD(String.format("Head CRC: %X, Payload CRC: %X", Byte.valueOf(b), Byte.valueOf(hndCrc8)));
        } else {
            printD(String.format("Head CRC: %X, Payload CRC: %X", Byte.valueOf(b), Byte.valueOf(hndCrc8)) + ((int) bArr[0]) + " " + ((int) bArr[1]) + " " + ((int) bArr[2]) + " " + ((int) bArr[3]));
        }
    }

    public TransmissionUnpacked() {
        this.basicHead = null;
    }

    public static byte[] unpack(List<TransmissionUnpacked> list, byte[] bArr, byte[] bArr2) {
        char c = 3;
        byte[] bArr3 = new byte[3];
        printD("unpack rxData: " + bArr2.length);
        byte[] bArr4 = bArr;
        int i = 0;
        while (i < bArr2.length) {
            printD("index: " + i);
            char c2 = c;
            if (bArr4.length == 0) {
                int i2 = i + 16;
                if (i2 > bArr2.length) {
                    byte[] bArr5 = new byte[bArr2.length - i];
                    System.arraycopy(bArr2, i, bArr5, 0, bArr2.length - i);
                    return bArr5;
                }
                int i3 = i + 1;
                if (bArr2[i3] == -16 && bArr2[i] == -43) {
                    int unsignedInt = (Byte.toUnsignedInt(bArr2[i + 3]) << 8) | Byte.toUnsignedInt(bArr2[i + 2]);
                    int unsignedInt2 = Byte.toUnsignedInt(bArr2[i + 4]) | (Byte.toUnsignedInt(bArr2[i + 6]) << 16) | (Byte.toUnsignedInt(bArr2[i + 7]) << 24) | (Byte.toUnsignedInt(bArr2[i + 5]) << 8);
                    int unsignedInt3 = Byte.toUnsignedInt(bArr2[i + 8]) | (Byte.toUnsignedInt(bArr2[i + 9]) << 8);
                    int unsignedInt4 = (Byte.toUnsignedInt(bArr2[i + 11]) << 8) | Byte.toUnsignedInt(bArr2[i + 10]);
                    byte b = bArr2[i + 12];
                    bArr3[0] = bArr2[i + 13];
                    bArr3[1] = bArr2[i + 14];
                    bArr3[2] = bArr2[i + 15];
                    if (i2 + unsignedInt4 > bArr2.length) {
                        byte[] bArr6 = new byte[bArr2.length - i];
                        System.arraycopy(bArr2, i, bArr6, 0, bArr2.length - i);
                        return bArr6;
                    }
                    byte[] bArr7 = new byte[unsignedInt4];
                    System.arraycopy(bArr2, i2, bArr7, 0, unsignedInt4);
                    list.add(new TransmissionUnpacked(unsignedInt, unsignedInt2, unsignedInt3, b, unsignedInt4, bArr7, bArr3));
                    i += unsignedInt4 + 16;
                } else {
                    printE("invalid src data: " + Byte.toUnsignedInt(bArr2[i3]) + " " + Byte.toUnsignedInt(bArr2[i3]));
                    TransmissionProfile.dump(TAG, bArr2, 20);
                    return bArr4;
                }
            } else {
                printD("index: " + i + " rxData: " + bArr2.length + " cached len: " + bArr4.length);
                if (bArr4.length < 16) {
                    if (i + 16 > bArr2.length) {
                        int length = bArr4.length;
                        byte[] copyOf = Arrays.copyOf(bArr4, (bArr2.length + length) - i);
                        System.arraycopy(bArr2, i, copyOf, length, bArr2.length - i);
                        return copyOf;
                    }
                    int length2 = bArr4.length;
                    bArr4 = Arrays.copyOf(bArr4, (length2 + 16) - length2);
                    int i4 = 16 - length2;
                    System.arraycopy(bArr2, i, bArr4, length2, i4);
                    i += i4;
                }
                if (bArr4[1] == -16 && bArr4[0] == -43) {
                    int unsignedInt5 = Byte.toUnsignedInt(bArr4[2]) | (Byte.toUnsignedInt(bArr4[c2]) << 8);
                    int unsignedInt6 = Byte.toUnsignedInt(bArr4[4]) | (Byte.toUnsignedInt(bArr4[7]) << 24) | (Byte.toUnsignedInt(bArr4[6]) << 16) | (Byte.toUnsignedInt(bArr4[5]) << 8);
                    int unsignedInt7 = Byte.toUnsignedInt(bArr4[8]) | (Byte.toUnsignedInt(bArr4[9]) << 8);
                    int unsignedInt8 = (Byte.toUnsignedInt(bArr4[11]) << 8) | Byte.toUnsignedInt(bArr4[10]);
                    byte b2 = bArr4[12];
                    bArr3[0] = bArr4[13];
                    bArr3[1] = bArr4[14];
                    bArr3[2] = bArr4[15];
                    int i5 = unsignedInt8 + 16;
                    if (bArr4.length < i5) {
                        if (((i + 16) + unsignedInt8) - bArr4.length > bArr2.length) {
                            int length3 = bArr4.length;
                            byte[] copyOf2 = Arrays.copyOf(bArr4, (bArr2.length + length3) - i);
                            System.arraycopy(bArr2, i, copyOf2, length3, bArr2.length - i);
                            return copyOf2;
                        }
                        int length4 = bArr4.length;
                        int length5 = i5 - bArr4.length;
                        byte[] copyOf3 = Arrays.copyOf(bArr4, length4 + length5);
                        System.arraycopy(bArr2, i, copyOf3, length4, length5);
                        i += length5;
                        byte[] bArr8 = new byte[unsignedInt8];
                        System.arraycopy(copyOf3, 16, bArr8, 0, unsignedInt8);
                        list.add(new TransmissionUnpacked(unsignedInt5, unsignedInt6, unsignedInt7, b2, unsignedInt8, bArr8, bArr3));
                        bArr4 = new byte[0];
                    } else {
                        printE("invalid flow data: " + unsignedInt8);
                        return bArr4;
                    }
                } else {
                    printE("invalid cached data index: " + i);
                    TransmissionProfile.dump(TAG, bArr4, 20);
                    break;
                }
            }
            c = c2;
        }
        return bArr4;
    }

    public byte[] getPayload() {
        return this.payload;
    }

    public int getSequence() {
        BasicHead basicHead = this.basicHead;
        if (basicHead == null) {
            printE("getSequence null");
            return -1;
        }
        return basicHead.sequence;
    }

    public BasicHead getBasicHead() {
        return this.basicHead;
    }

    private static void printE(String str) {
        BKSmartLog.INSTANCE.e(TAG, str);
    }
}
