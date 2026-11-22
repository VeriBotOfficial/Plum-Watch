package com.wakeup.module.ble;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public class OrderUtil {
    public static byte[] addBytes(byte[] bArr, byte[] bArr2) {
        if (bArr2 == null || bArr2.length == 0) {
            return bArr;
        }
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static byte[] handleMessageBytes(byte[] bArr) {
        int i;
        List<Integer> bytesToArrayList = bytesToArrayList(bArr);
        if ((bytesToArrayList.get(0).intValue() == 171 || bytesToArrayList.get(0).intValue() == 234 || bytesToArrayList.get(0).intValue() == 196) && bArr.length > 20) {
            byte[] bArr2 = new byte[20];
            System.arraycopy(bArr, 0, bArr2, 0, 20);
            int length = bArr.length - 20;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, 20, bArr3, 0, bArr.length - 20);
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (true) {
                i = length / 19;
                if (i2 >= i + 1) {
                    break;
                }
                byte[] bArr4 = new byte[19];
                int i3 = length % 19;
                byte[] bArr5 = new byte[i3];
                if (i2 < i) {
                    System.arraycopy(bArr3, i2 * 19, bArr4, 0, 19);
                    arrayList.add(bArr4);
                } else {
                    System.arraycopy(bArr3, i2 * 19, bArr5, 0, i3);
                    arrayList.add(bArr5);
                }
                i2++;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                arrayList2.add(addBytes(new byte[]{(byte) i4}, (byte[]) arrayList.get(i4)));
            }
            int i5 = length % 19;
            bArr = new byte[(i * 20) + 20 + i5 + 1];
            System.arraycopy(bArr2, 0, bArr, 0, 20);
            for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                if (((byte[]) arrayList2.get(i6)).length >= 2) {
                    if (i6 < arrayList2.size() - 1) {
                        System.arraycopy(arrayList2.get(i6), 0, bArr, (i6 + 1) * 20, 20);
                    } else {
                        System.arraycopy(arrayList2.get(i6), 0, bArr, (i6 + 1) * 20, i5 + 1);
                    }
                }
            }
        }
        return bArr;
    }

    public static byte[] handleMessageBytes(byte[] bArr, int i) {
        int i2;
        int i3;
        if (bArr.length <= i) {
            return bArr;
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        int length = bArr.length - i;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, i, bArr3, 0, bArr.length - i);
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        while (true) {
            i2 = i - 1;
            i3 = length / i2;
            if (i4 >= i3 + 1) {
                break;
            }
            byte[] bArr4 = new byte[i2];
            int i5 = length % i2;
            byte[] bArr5 = new byte[i5];
            if (i4 < i3) {
                System.arraycopy(bArr3, i4 * i2, bArr4, 0, i2);
                arrayList.add(bArr4);
            } else {
                System.arraycopy(bArr3, i2 * i4, bArr5, 0, i5);
                arrayList.add(bArr5);
            }
            i4++;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            arrayList2.add(addBytes(new byte[]{(byte) i6}, (byte[]) arrayList.get(i6)));
        }
        int i7 = length % i2;
        byte[] bArr6 = new byte[(i3 * i) + i + i7 + 1];
        System.arraycopy(bArr2, 0, bArr6, 0, i);
        for (int i8 = 0; i8 < arrayList2.size(); i8++) {
            if (((byte[]) arrayList2.get(i8)).length >= 2) {
                if (i8 < arrayList2.size() - 1) {
                    System.arraycopy(arrayList2.get(i8), 0, bArr6, (i8 + 1) * i, i);
                } else {
                    System.arraycopy(arrayList2.get(i8), 0, bArr6, (i8 + 1) * i, i7 + 1);
                }
            }
        }
        return bArr6;
    }

    public static List<Integer> bytesToArrayList(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        for (byte b : bArr) {
            arrayList.add(Integer.valueOf(b & 255));
        }
        return arrayList;
    }

    public static int string2Int(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            String substring = str.substring(i, i3);
            i2 += (substring.equals("+") ? 10 : Integer.parseInt(substring)) << (i * 4);
            i = i3;
        }
        return i2;
    }

    public static String keepDigital(String str) {
        StringBuilder sb = new StringBuilder();
        Matcher matcher = Pattern.compile("[+\\d]").matcher(str);
        while (matcher.find()) {
            sb.append(matcher.group());
        }
        return sb.toString();
    }
}
