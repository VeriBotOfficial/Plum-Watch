package com.baidu.bbalbscesium.o;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
public class a {
    public static final String d = "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567=";
    public static final String e = "0123456789ABCDEFGHIJKLMNOPQRSTUV=";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f7440a;
    private boolean b;
    private boolean c;

    public a(String str, boolean z, boolean z2) {
        this.f7440a = str;
        this.b = z;
        this.c = z2;
    }

    private static int a(int r3) {
        if (r3 == 1) {
            return 6;
        }
        if (r3 == 2) {
            return 4;
        }
        if (r3 == 3) {
            return 3;
        }
        if (r3 != 4) {
            return r3 != 5 ? -1 : 0;
        }
        return 1;
    }

    private static int b(int r3) {
        if (r3 == 0) {
            return 5;
        }
        if (r3 == 1) {
            return 4;
        }
        if (r3 == 3) {
            return 3;
        }
        if (r3 != 4) {
            return r3 != 6 ? -1 : 1;
        }
        return 2;
    }

    public String a(byte[] bArr) {
        int r9;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int r4 = 0; r4 < (bArr.length + 4) / 5; r4++) {
            short[] sArr = new short[5];
            int r10 = 5;
            for (int r8 = 0; r8 < 5; r8++) {
                int r11 = (r4 * 5) + r8;
                if (r11 < bArr.length) {
                    sArr[r8] = (short) (bArr[r11] & 255);
                } else {
                    sArr[r8] = 0;
                    r10--;
                }
            }
            int r7 = a(r10);
            short s = sArr[0];
            int r12 = (byte) ((s >> 3) & 31);
            short s2 = sArr[1];
            int r13 = (byte) (((s & 7) << 2) | ((s2 >> 6) & 3));
            int r14 = (byte) ((s2 >> 1) & 31);
            short s3 = sArr[2];
            int r15 = (byte) (((s2 & 1) << 4) | ((s3 >> 4) & 15));
            short s4 = sArr[3];
            short s5 = sArr[4];
            int[] r5 = {r12, r13, r14, r15, (byte) (((s3 & 15) << 1) | ((s4 >> 7) & 1)), (byte) ((s4 >> 2) & 31), (byte) (((s5 >> 5) & 7) | ((s4 & 3) << 3)), (byte) (s5 & 31)};
            int r6 = 0;
            while (true) {
                r9 = 8 - r7;
                if (r6 >= r9) {
                    break;
                }
                char cCharAt = this.f7440a.charAt(r5[r6]);
                if (this.c) {
                    cCharAt = Character.toLowerCase(cCharAt);
                }
                byteArrayOutputStream.write(cCharAt);
                r6++;
            }
            if (this.b) {
                while (r9 < 8) {
                    byteArrayOutputStream.write(61);
                    r9++;
                }
            }
        }
        return new String(byteArrayOutputStream.toByteArray());
    }

    public byte[] a(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (byte b : str.getBytes()) {
            char c = (char) b;
            if (!Character.isWhitespace(c)) {
                byteArrayOutputStream.write((byte) Character.toUpperCase(c));
            }
        }
        if (!this.b) {
            while (byteArrayOutputStream.size() % 8 != 0) {
                byteArrayOutputStream.write(61);
            }
        } else if (byteArrayOutputStream.size() % 8 != 0) {
            return null;
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.reset();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        for (int r8 = 0; r8 < byteArray.length / 8; r8++) {
            short[] sArr = new short[8];
            int r11 = 8;
            for (int r10 = 0; r10 < 8; r10++) {
                byte b2 = byteArray[(r8 * 8) + r10];
                if (((char) b2) == '=') {
                    break;
                }
                short sIndexOf = (short) this.f7440a.indexOf(b2);
                sArr[r10] = sIndexOf;
                if (sIndexOf < 0) {
                    return null;
                }
                r11--;
            }
            int r12 = b(r11);
            if (r12 < 0) {
                return null;
            }
            int r13 = sArr[0] << 3;
            short s = sArr[1];
            int r14 = r13 | (s >> 2);
            int r15 = sArr[2] << 1;
            short s2 = sArr[3];
            int r16 = r15 | ((s & 3) << 6) | (s2 >> 4);
            short s3 = sArr[4];
            int r17 = ((s2 & 15) << 4) | ((s3 >> 1) & 15);
            int r18 = (s3 << 7) | (sArr[5] << 2);
            short s4 = sArr[6];
            int[] r9 = {r14, r16, r17, r18 | (s4 >> 3), sArr[7] | ((s4 & 7) << 5)};
            for (int r19 = 0; r19 < r12; r19++) {
                try {
                    dataOutputStream.writeByte((byte) (r9[r19] & 255));
                } catch (IOException unused) {
                }
            }
        }
        return byteArrayOutputStream.toByteArray();
    }
}
