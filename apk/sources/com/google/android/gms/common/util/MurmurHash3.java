package com.google.android.gms.common.util;

import androidx.collection.ScatterMapKt;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes15.dex */
public class MurmurHash3 {
    private MurmurHash3() {
    }

    public static int murmurhash3_x86_32(byte[] bArr, int r8, int r9, int r10) {
        int r1;
        int r0 = r8;
        while (true) {
            r1 = (r9 & (-4)) + r8;
            if (r0 >= r1) {
                break;
            }
            int r2 = ((bArr[r0] & 255) | ((bArr[r0 + 1] & 255) << 8) | ((bArr[r0 + 2] & 255) << 16) | (bArr[r0 + 3] << 24)) * ScatterMapKt.MurmurHashC1;
            int r11 = r10 ^ (((r2 >>> 17) | (r2 << 15)) * 461845907);
            r10 = (((r11 >>> 19) | (r11 << 13)) * 5) - 430675100;
            r0 += 4;
        }
        int r12 = r9 & 3;
        int r3 = 0;
        if (r12 == 1) {
            int r7 = ((bArr[r1] & 255) | r3) * ScatterMapKt.MurmurHashC1;
            r10 ^= ((r7 >>> 17) | (r7 << 15)) * 461845907;
        } else {
            if (r12 != 2) {
                r3 = r12 == 3 ? (bArr[r1 + 2] & 255) << 16 : 0;
            }
            r3 |= (bArr[r1 + 1] & 255) << 8;
            int r13 = ((bArr[r1] & 255) | r3) * ScatterMapKt.MurmurHashC1;
            r10 ^= ((r13 >>> 17) | (r13 << 15)) * 461845907;
        }
        int r14 = r10 ^ r9;
        int r15 = (r14 ^ (r14 >>> 16)) * (-2048144789);
        int r16 = (r15 ^ (r15 >>> 13)) * (-1028477387);
        return r16 ^ (r16 >>> 16);
    }
}
