package com.baidu.ar.arplay.representation;

/* JADX INFO: loaded from: classes16.dex */
public final class Matrix {
    private static final float[] TEMP_MATRIX_ARRAY = new float[32];

    private Matrix() {
    }

    public static void frustumM(float[] fArr, int r8, float f, float f2, float f3, float f4, float f5, float f6) {
        if (f == f2) {
            throw new IllegalArgumentException("left == right");
        }
        if (f4 == f3) {
            throw new IllegalArgumentException("top == bottom");
        }
        if (f5 == f6) {
            throw new IllegalArgumentException("near == far");
        }
        if (f5 <= 0.0f) {
            throw new IllegalArgumentException("near <= 0.0f");
        }
        if (f6 <= 0.0f) {
            throw new IllegalArgumentException("far <= 0.0f");
        }
        float f7 = 1.0f / (f2 - f);
        float f8 = 1.0f / (f4 - f3);
        float f9 = 1.0f / (f5 - f6);
        float f10 = (f2 + f) * f7 * 2.0f;
        float f11 = (f4 + f3) * f8;
        fArr[r8] = f5 * f7 * 2.0f;
        fArr[r8 + 5] = f5 * f8 * 2.0f;
        fArr[r8 + 8] = f10;
        fArr[r8 + 9] = f11;
        fArr[r8 + 10] = (f6 + f5) * f9;
        fArr[r8 + 14] = f6 * f5 * f9 * 2.0f;
        fArr[r8 + 11] = -1.0f;
        fArr[r8 + 1] = 0.0f;
        fArr[r8 + 2] = 0.0f;
        fArr[r8 + 3] = 0.0f;
        fArr[r8 + 4] = 0.0f;
        fArr[r8 + 6] = 0.0f;
        fArr[r8 + 7] = 0.0f;
        fArr[r8 + 12] = 0.0f;
        fArr[r8 + 13] = 0.0f;
        fArr[r8 + 15] = 0.0f;
    }

    public static boolean invertM(float[] fArr, int r38, float[] fArr2, int r40) {
        float f = fArr2[r40];
        float f2 = fArr2[r40 + 1];
        float f3 = fArr2[r40 + 2];
        float f4 = fArr2[r40 + 3];
        float f5 = fArr2[r40 + 4];
        float f6 = fArr2[r40 + 5];
        float f7 = fArr2[r40 + 6];
        float f8 = fArr2[r40 + 7];
        float f9 = fArr2[r40 + 8];
        float f10 = fArr2[r40 + 9];
        float f11 = fArr2[r40 + 10];
        float f12 = fArr2[r40 + 11];
        float f13 = fArr2[r40 + 12];
        float f14 = fArr2[r40 + 13];
        float f15 = fArr2[r40 + 14];
        float f16 = fArr2[r40 + 15];
        float f17 = f11 * f16;
        float f18 = f15 * f12;
        float f19 = f7 * f16;
        float f20 = f15 * f8;
        float f21 = f7 * f12;
        float f22 = f11 * f8;
        float f23 = f3 * f16;
        float f24 = f15 * f4;
        float f25 = f3 * f12;
        float f26 = f11 * f4;
        float f27 = f3 * f8;
        float f28 = f7 * f4;
        float f29 = (((f17 * f6) + (f20 * f10)) + (f21 * f14)) - (((f18 * f6) + (f19 * f10)) + (f22 * f14));
        float f30 = (((f18 * f2) + (f23 * f10)) + (f26 * f14)) - (((f17 * f2) + (f24 * f10)) + (f25 * f14));
        float f31 = (((f19 * f2) + (f24 * f6)) + (f27 * f14)) - (((f20 * f2) + (f23 * f6)) + (f28 * f14));
        float f32 = (((f22 * f2) + (f25 * f6)) + (f28 * f10)) - (((f21 * f2) + (f26 * f6)) + (f27 * f10));
        float f33 = (((f18 * f5) + (f19 * f9)) + (f22 * f13)) - (((f17 * f5) + (f20 * f9)) + (f21 * f13));
        float f34 = (((f17 * f) + (f24 * f9)) + (f25 * f13)) - (((f18 * f) + (f23 * f9)) + (f26 * f13));
        float f35 = (((f20 * f) + (f23 * f5)) + (f28 * f13)) - (((f19 * f) + (f24 * f5)) + (f27 * f13));
        float f36 = (((f21 * f) + (f26 * f5)) + (f27 * f9)) - (((f22 * f) + (f25 * f5)) + (f28 * f9));
        float f37 = f9 * f14;
        float f38 = f13 * f10;
        float f39 = f5 * f14;
        float f40 = f13 * f6;
        float f41 = f5 * f10;
        float f42 = f9 * f6;
        float f43 = f14 * f;
        float f44 = f13 * f2;
        float f45 = f10 * f;
        float f46 = f9 * f2;
        float f47 = f6 * f;
        float f48 = f2 * f5;
        float f49 = (((f37 * f8) + (f40 * f12)) + (f41 * f16)) - (((f38 * f8) + (f39 * f12)) + (f42 * f16));
        float f50 = (((f38 * f4) + (f43 * f12)) + (f46 * f16)) - (((f37 * f4) + (f44 * f12)) + (f45 * f16));
        float f51 = (((f39 * f4) + (f44 * f8)) + (f47 * f16)) - (((f40 * f4) + (f43 * f8)) + (f16 * f48));
        float f52 = (((f42 * f4) + (f45 * f8)) + (f48 * f12)) - (((f4 * f41) + (f8 * f46)) + (f12 * f47));
        float f53 = (((f39 * f11) + (f42 * f15)) + (f38 * f7)) - (((f41 * f15) + (f37 * f7)) + (f40 * f11));
        float f54 = (((f45 * f15) + (f37 * f3)) + (f44 * f11)) - (((f43 * f11) + (f46 * f15)) + (f38 * f3));
        float f55 = (((f43 * f7) + (f48 * f15)) + (f40 * f3)) - (((f15 * f47) + (f39 * f3)) + (f44 * f7));
        float f56 = (((f47 * f11) + (f41 * f3)) + (f46 * f7)) - (((f45 * f7) + (f48 * f11)) + (f42 * f3));
        float f57 = (f * f29) + (f5 * f30) + (f9 * f31) + (f13 * f32);
        if (f57 == 0.0f) {
            return false;
        }
        float f58 = 1.0f / f57;
        fArr[r38] = f29 * f58;
        fArr[r38 + 1] = f30 * f58;
        fArr[r38 + 2] = f31 * f58;
        fArr[r38 + 3] = f32 * f58;
        fArr[r38 + 4] = f33 * f58;
        fArr[r38 + 5] = f34 * f58;
        fArr[r38 + 6] = f35 * f58;
        fArr[r38 + 7] = f36 * f58;
        fArr[r38 + 8] = f49 * f58;
        fArr[r38 + 9] = f50 * f58;
        fArr[r38 + 10] = f51 * f58;
        fArr[r38 + 11] = f52 * f58;
        fArr[r38 + 12] = f53 * f58;
        fArr[r38 + 13] = f54 * f58;
        fArr[r38 + 14] = f55 * f58;
        fArr[r38 + 15] = f56 * f58;
        return true;
    }

    public static float length(float f, float f2, float f3) {
        return (float) Math.sqrt((f * f) + (f2 * f2) + (f3 * f3));
    }

    public static void multiplyMM(float[] fArr, int r24, float[] fArr2, int r26, float[] fArr3, int r28) {
        int r1 = r26 + 4;
        int r3 = r28 + 1;
        int r2 = r26 + 8;
        int r5 = r28 + 2;
        int r4 = r26 + 12;
        int r7 = r28 + 3;
        fArr[r24] = (fArr2[r26] * fArr3[r28]) + (fArr2[r1] * fArr3[r3]) + (fArr2[r2] * fArr3[r5]) + (fArr2[r4] * fArr3[r7]);
        int r6 = r26 + 1;
        int r9 = r26 + 5;
        int r10 = r26 + 9;
        int r11 = r26 + 13;
        fArr[r24 + 1] = (fArr2[r6] * fArr3[r28]) + (fArr2[r9] * fArr3[r3]) + (fArr2[r10] * fArr3[r5]) + (fArr2[r11] * fArr3[r7]);
        int r8 = r26 + 2;
        int r13 = r26 + 6;
        int r14 = r26 + 10;
        int r15 = r26 + 14;
        fArr[r24 + 2] = (fArr2[r8] * fArr3[r28]) + (fArr2[r13] * fArr3[r3]) + (fArr2[r14] * fArr3[r5]) + (fArr2[r15] * fArr3[r7]);
        int r12 = r26 + 3;
        int r17 = r26 + 7;
        float f = (fArr2[r12] * fArr3[r28]) + (fArr2[r17] * fArr3[r3]);
        int r16 = r26 + 11;
        float f2 = f + (fArr2[r16] * fArr3[r5]);
        int r18 = r26 + 15;
        fArr[r24 + 3] = f2 + (fArr2[r18] * fArr3[r7]);
        int r19 = r28 + 4;
        int r110 = r28 + 5;
        int r20 = r28 + 6;
        int r21 = r28 + 7;
        fArr[r24 + 4] = (fArr2[r26] * fArr3[r19]) + (fArr2[r1] * fArr3[r110]) + (fArr2[r2] * fArr3[r20]) + (fArr2[r4] * fArr3[r21]);
        fArr[r24 + 5] = (fArr2[r6] * fArr3[r19]) + (fArr2[r9] * fArr3[r110]) + (fArr2[r10] * fArr3[r20]) + (fArr2[r11] * fArr3[r21]);
        fArr[r24 + 6] = (fArr2[r8] * fArr3[r19]) + (fArr2[r13] * fArr3[r110]) + (fArr2[r14] * fArr3[r20]) + (fArr2[r15] * fArr3[r21]);
        fArr[r24 + 7] = (fArr2[r12] * fArr3[r19]) + (fArr2[r17] * fArr3[r110]) + (fArr2[r16] * fArr3[r20]) + (fArr2[r18] * fArr3[r21]);
        int r111 = r28 + 8;
        int r112 = r28 + 9;
        int r22 = r28 + 10;
        int r23 = r28 + 11;
        fArr[r24 + 8] = (fArr2[r26] * fArr3[r111]) + (fArr2[r1] * fArr3[r112]) + (fArr2[r2] * fArr3[r22]) + (fArr2[r4] * fArr3[r23]);
        fArr[r24 + 9] = (fArr2[r6] * fArr3[r111]) + (fArr2[r9] * fArr3[r112]) + (fArr2[r10] * fArr3[r22]) + (fArr2[r11] * fArr3[r23]);
        fArr[r24 + 10] = (fArr2[r8] * fArr3[r111]) + (fArr2[r13] * fArr3[r112]) + (fArr2[r14] * fArr3[r22]) + (fArr2[r15] * fArr3[r23]);
        fArr[r24 + 11] = (fArr2[r12] * fArr3[r111]) + (fArr2[r17] * fArr3[r112]) + (fArr2[r16] * fArr3[r22]) + (fArr2[r18] * fArr3[r23]);
        int r113 = r28 + 12;
        int r114 = r28 + 13;
        float f3 = (fArr2[r26] * fArr3[r113]) + (fArr2[r1] * fArr3[r114]);
        float f4 = fArr2[r2];
        int r25 = r28 + 14;
        float f5 = f3 + (f4 * fArr3[r25]);
        float f6 = fArr2[r4];
        int r27 = r28 + 15;
        fArr[r24 + 12] = f5 + (f6 * fArr3[r27]);
        fArr[r24 + 13] = (fArr2[r6] * fArr3[r113]) + (fArr2[r9] * fArr3[r114]) + (fArr2[r10] * fArr3[r25]) + (fArr2[r11] * fArr3[r27]);
        fArr[r24 + 14] = (fArr2[r8] * fArr3[r113]) + (fArr2[r13] * fArr3[r114]) + (fArr2[r14] * fArr3[r25]) + (fArr2[r15] * fArr3[r27]);
        fArr[r24 + 15] = (fArr2[r12] * fArr3[r113]) + (fArr2[r17] * fArr3[r114]) + (fArr2[r16] * fArr3[r25]) + (fArr2[r18] * fArr3[r27]);
    }

    public static void multiplyMM(float[] fArr, float[] fArr2, float[] fArr3) {
        float f = fArr2[0] * fArr3[0];
        float f2 = fArr2[4];
        float f3 = fArr3[1];
        float f4 = fArr2[8];
        float f5 = fArr3[2];
        float f6 = fArr2[12];
        float f7 = fArr3[3];
        fArr[0] = f + (f2 * f3) + (f4 * f5) + (f6 * f7);
        float f8 = fArr2[1];
        float f9 = fArr3[0];
        float f10 = fArr2[5];
        float f11 = fArr2[9];
        float f12 = fArr2[13];
        fArr[1] = (f8 * f9) + (f3 * f10) + (f11 * f5) + (f12 * f7);
        float f13 = fArr2[2] * f9;
        float f14 = fArr2[6];
        float f15 = fArr3[1];
        float f16 = fArr2[10];
        float f17 = fArr2[14];
        fArr[2] = f13 + (f14 * f15) + (f5 * f16) + (f17 * f7);
        float f18 = fArr2[3] * f9;
        float f19 = fArr2[7];
        float f20 = fArr2[11];
        float f21 = f18 + (f15 * f19) + (fArr3[2] * f20);
        float f22 = fArr2[15];
        fArr[3] = f21 + (f7 * f22);
        float f23 = fArr2[0];
        float f24 = fArr3[4] * f23;
        float f25 = fArr3[5];
        float f26 = f24 + (f2 * f25);
        float f27 = fArr3[6];
        float f28 = fArr3[7];
        fArr[4] = f26 + (f4 * f27) + (f6 * f28);
        float f29 = fArr2[1];
        float f30 = fArr3[4];
        fArr[5] = (f29 * f30) + (f10 * f25) + (f11 * f27) + (f12 * f28);
        float f31 = fArr2[2];
        float f32 = fArr3[5];
        fArr[6] = (f31 * f30) + (f14 * f32) + (f27 * f16) + (f17 * f28);
        float f33 = fArr2[3];
        fArr[7] = (f30 * f33) + (f19 * f32) + (fArr3[6] * f20) + (f28 * f22);
        float f34 = fArr3[8] * f23;
        float f35 = fArr2[4];
        float f36 = fArr3[9];
        float f37 = fArr3[10];
        float f38 = f34 + (f35 * f36) + (f4 * f37);
        float f39 = fArr3[11];
        fArr[8] = f38 + (f6 * f39);
        float f40 = fArr3[8];
        float f41 = fArr2[5];
        fArr[9] = (f29 * f40) + (f36 * f41) + (f11 * f37) + (f12 * f39);
        float f42 = fArr2[6];
        float f43 = fArr3[9];
        fArr[10] = (f31 * f40) + (f42 * f43) + (f16 * f37) + (f17 * f39);
        float f44 = fArr2[7];
        fArr[11] = (f40 * f33) + (f43 * f44) + (f20 * fArr3[10]) + (f39 * f22);
        float f45 = f23 * fArr3[12];
        float f46 = fArr3[13];
        float f47 = f45 + (f35 * f46);
        float f48 = fArr2[8];
        float f49 = fArr3[14];
        float f50 = f47 + (f48 * f49);
        float f51 = fArr3[15];
        fArr[12] = f50 + (f6 * f51);
        float f52 = fArr3[12];
        fArr[13] = (f29 * f52) + (f41 * f46) + (fArr2[9] * f49) + (f12 * f51);
        float f53 = fArr3[13];
        fArr[14] = (f31 * f52) + (f42 * f53) + (fArr2[10] * f49) + (f17 * f51);
        fArr[15] = (f33 * f52) + (f44 * f53) + (fArr2[11] * fArr3[14]) + (f22 * f51);
    }

    public static void multiplyMV(float[] fArr, int r8, float[] fArr2, int r10, float[] fArr3, int r12) {
        int r2 = r12 + 1;
        int r3 = r12 + 2;
        int r4 = r12 + 3;
        fArr[r8] = (fArr2[r10] * fArr3[r12]) + (fArr2[r10 + 4] * fArr3[r2]) + (fArr2[r10 + 8] * fArr3[r3]) + (fArr2[r10 + 12] * fArr3[r4]);
        fArr[r8 + 1] = (fArr2[r10 + 1] * fArr3[r12]) + (fArr2[r10 + 5] * fArr3[r2]) + (fArr2[r10 + 9] * fArr3[r3]) + (fArr2[r10 + 13] * fArr3[r4]);
        fArr[r8 + 2] = (fArr2[r10 + 2] * fArr3[r12]) + (fArr2[r10 + 6] * fArr3[r2]) + (fArr2[r10 + 10] * fArr3[r3]) + (fArr2[r10 + 14] * fArr3[r4]);
        fArr[r8 + 3] = (fArr2[r10 + 3] * fArr3[r12]) + (fArr2[r10 + 7] * fArr3[r2]) + (fArr2[r10 + 11] * fArr3[r3]) + (fArr2[r10 + 15] * fArr3[r4]);
    }

    public static void multiplyMV(float[] fArr, float[] fArr2, float[] fArr3) {
        float f = fArr2[0] * fArr3[0];
        float f2 = fArr2[4];
        float f3 = fArr3[1];
        float f4 = f + (f2 * f3);
        float f5 = fArr2[8];
        float f6 = fArr3[2];
        float f7 = f4 + (f5 * f6);
        float f8 = fArr2[12];
        float f9 = fArr3[3];
        fArr[0] = f7 + (f8 * f9);
        float f10 = fArr2[1];
        float f11 = fArr3[0];
        fArr[1] = (f10 * f11) + (fArr2[5] * f3) + (fArr2[9] * f6) + (fArr2[13] * f9);
        float f12 = fArr2[2] * f11;
        float f13 = fArr2[6];
        float f14 = fArr3[1];
        fArr[2] = f12 + (f13 * f14) + (fArr2[10] * f6) + (fArr2[14] * f9);
        fArr[3] = (fArr2[3] * f11) + (fArr2[7] * f14) + (fArr2[11] * fArr3[2]) + (fArr2[15] * f9);
    }

    public static void multiplyMV3(float[] fArr, float[] fArr2, float[] fArr3, float f) {
        float f2 = fArr2[0] * fArr3[0];
        float f3 = fArr2[4];
        float f4 = fArr3[1];
        float f5 = f2 + (f3 * f4);
        float f6 = fArr2[8];
        float f7 = fArr3[2];
        fArr[0] = f5 + (f6 * f7) + (fArr2[12] * f);
        float f8 = fArr2[1];
        float f9 = fArr3[0];
        fArr[1] = (f8 * f9) + (fArr2[5] * f4) + (fArr2[9] * f7) + (fArr2[13] * f);
        fArr[2] = (fArr2[2] * f9) + (fArr2[6] * fArr3[1]) + (fArr2[10] * f7) + (fArr2[14] * f);
    }

    public static void orthoM(float[] fArr, int r8, float f, float f2, float f3, float f4, float f5, float f6) {
        if (f == f2) {
            throw new IllegalArgumentException("left == right");
        }
        if (f3 == f4) {
            throw new IllegalArgumentException("bottom == top");
        }
        if (f5 == f6) {
            throw new IllegalArgumentException("near == far");
        }
        float f7 = 1.0f / (f2 - f);
        float f8 = 1.0f / (f4 - f3);
        float f9 = 1.0f / (f6 - f5);
        float f10 = (-(f2 + f)) * f7;
        float f11 = (-(f4 + f3)) * f8;
        fArr[r8] = f7 * 2.0f;
        fArr[r8 + 5] = 2.0f * f8;
        fArr[r8 + 10] = (-2.0f) * f9;
        fArr[r8 + 12] = f10;
        fArr[r8 + 13] = f11;
        fArr[r8 + 14] = (-(f6 + f5)) * f9;
        fArr[r8 + 15] = 1.0f;
        fArr[r8 + 1] = 0.0f;
        fArr[r8 + 2] = 0.0f;
        fArr[r8 + 3] = 0.0f;
        fArr[r8 + 4] = 0.0f;
        fArr[r8 + 6] = 0.0f;
        fArr[r8 + 7] = 0.0f;
        fArr[r8 + 8] = 0.0f;
        fArr[r8 + 9] = 0.0f;
        fArr[r8 + 11] = 0.0f;
    }

    public static void perspectiveM(float[] fArr, int r5, float f, float f2, float f3, float f4) {
        float fTan = 1.0f / ((float) Math.tan(((double) f) * 0.008726646259971648d));
        float f5 = 1.0f / (f3 - f4);
        fArr[r5] = fTan / f2;
        fArr[r5 + 1] = 0.0f;
        fArr[r5 + 2] = 0.0f;
        fArr[r5 + 3] = 0.0f;
        fArr[r5 + 4] = 0.0f;
        fArr[r5 + 5] = fTan;
        fArr[r5 + 6] = 0.0f;
        fArr[r5 + 7] = 0.0f;
        fArr[r5 + 8] = 0.0f;
        fArr[r5 + 9] = 0.0f;
        fArr[r5 + 10] = (f4 + f3) * f5;
        fArr[r5 + 11] = -1.0f;
        fArr[r5 + 12] = 0.0f;
        fArr[r5 + 13] = 0.0f;
        fArr[r5 + 14] = f4 * 2.0f * f3 * f5;
        fArr[r5 + 15] = 0.0f;
    }

    public static void rotateM(float[] fArr, int r8, float f, float f2, float f3, float f4) {
        float[] fArr2 = TEMP_MATRIX_ARRAY;
        synchronized (fArr2) {
            setRotateM(fArr2, 0, f, f2, f3, f4);
            multiplyMM(fArr2, 16, fArr, r8, fArr2, 0);
            System.arraycopy(fArr2, 16, fArr, r8, 16);
        }
    }

    public static void rotateM(float[] fArr, int r8, float[] fArr2, int r10, float f, float f2, float f3, float f4) {
        float[] fArr3 = TEMP_MATRIX_ARRAY;
        synchronized (fArr3) {
            setRotateM(fArr3, 0, f, f2, f3, f4);
            multiplyMM(fArr, r8, fArr2, r10, fArr3, 0);
        }
    }

    public static void scaleM(float[] fArr, int r5, float f, float f2, float f3) {
        for (int r0 = 0; r0 < 4; r0++) {
            int r1 = r5 + r0;
            fArr[r1] = fArr[r1] * f;
            int r2 = r1 + 4;
            fArr[r2] = fArr[r2] * f2;
            int r3 = r1 + 8;
            fArr[r3] = fArr[r3] * f3;
        }
    }

    public static void scaleM(float[] fArr, int r6, float[] fArr2, int r8, float f, float f2, float f3) {
        for (int r0 = 0; r0 < 4; r0++) {
            int r1 = r6 + r0;
            int r2 = r8 + r0;
            fArr[r1] = fArr2[r2] * f;
            fArr[r1 + 4] = fArr2[r2 + 4] * f2;
            fArr[r1 + 8] = fArr2[r2 + 8] * f3;
            fArr[r1 + 12] = fArr2[r2 + 12];
        }
    }

    public static void setIdentityM(float[] fArr, int r5) {
        for (int r1 = 0; r1 < 16; r1++) {
            fArr[r5 + r1] = 0.0f;
        }
        for (int r0 = 0; r0 < 16; r0 += 5) {
            fArr[r5 + r0] = 1.0f;
        }
    }

    public static void setLookAtM(float[] fArr, int r18, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        float f10 = f4 - f;
        float f11 = f5 - f2;
        float f12 = f6 - f3;
        float length = length(f10, f11, f12) != 0.0f ? 1.0f / length(f10, f11, f12) : 1.0f;
        float f13 = f10 * length;
        float f14 = f11 * length;
        float f15 = f12 * length;
        float f16 = (f14 * f9) - (f15 * f8);
        float f17 = (f15 * f7) - (f13 * f9);
        float f18 = (f13 * f8) - (f14 * f7);
        float length2 = length(f16, f17, f18) != 0.0f ? 1.0f / length(f16, f17, f18) : 1.0f;
        float f19 = f16 * length2;
        float f20 = f17 * length2;
        float f21 = f18 * length2;
        fArr[r18] = f19;
        fArr[r18 + 1] = (f20 * f15) - (f21 * f14);
        fArr[r18 + 2] = -f13;
        fArr[r18 + 3] = 0.0f;
        fArr[r18 + 4] = f20;
        fArr[r18 + 5] = (f21 * f13) - (f19 * f15);
        fArr[r18 + 6] = -f14;
        fArr[r18 + 7] = 0.0f;
        fArr[r18 + 8] = f21;
        fArr[r18 + 9] = (f19 * f14) - (f20 * f13);
        fArr[r18 + 10] = -f15;
        fArr[r18 + 11] = 0.0f;
        fArr[r18 + 12] = 0.0f;
        fArr[r18 + 13] = 0.0f;
        fArr[r18 + 14] = 0.0f;
        fArr[r18 + 15] = 1.0f;
        translateM(fArr, r18, -f, -f2, -f3);
    }

    public static void setRotateEulerM(float[] fArr, int r9, float f, float f2, float f3) {
        double d = f * 0.017453292f;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        double d2 = f2 * 0.017453292f;
        float fCos2 = (float) Math.cos(d2);
        float fSin2 = (float) Math.sin(d2);
        double d3 = f3 * 0.017453292f;
        float fCos3 = (float) Math.cos(d3);
        float fSin3 = (float) Math.sin(d3);
        float f4 = fCos * fSin2;
        float f5 = fSin * fSin2;
        fArr[r9] = fCos2 * fCos3;
        fArr[r9 + 1] = (-fCos2) * fSin3;
        fArr[r9 + 2] = fSin2;
        fArr[r9 + 3] = 0.0f;
        fArr[r9 + 4] = (f4 * fCos3) + (fCos * fSin3);
        fArr[r9 + 5] = ((-f4) * fSin3) + (fCos * fCos3);
        fArr[r9 + 6] = (-fSin) * fCos2;
        fArr[r9 + 7] = 0.0f;
        fArr[r9 + 8] = ((-f5) * fCos3) + (fSin * fSin3);
        fArr[r9 + 9] = (f5 * fSin3) + (fSin * fCos3);
        fArr[r9 + 10] = fCos * fCos2;
        fArr[r9 + 11] = 0.0f;
        fArr[r9 + 12] = 0.0f;
        fArr[r9 + 13] = 0.0f;
        fArr[r9 + 14] = 0.0f;
        fArr[r9 + 15] = 1.0f;
    }

    public static void setRotateM(float[] fArr, int r9, float f, float f2, float f3, float f4) {
        fArr[r9 + 3] = 0.0f;
        fArr[r9 + 7] = 0.0f;
        fArr[r9 + 11] = 0.0f;
        fArr[r9 + 12] = 0.0f;
        fArr[r9 + 13] = 0.0f;
        fArr[r9 + 14] = 0.0f;
        fArr[r9 + 15] = 1.0f;
        double d = f * 0.017453292f;
        float fSin = (float) Math.sin(d);
        float fCos = (float) Math.cos(d);
        if (1.0f == f2 && 0.0f == f3 && 0.0f == f4) {
            fArr[r9 + 5] = fCos;
            fArr[r9 + 10] = fCos;
            fArr[r9 + 6] = fSin;
            fArr[r9 + 9] = -fSin;
            fArr[r9 + 1] = 0.0f;
            fArr[r9 + 2] = 0.0f;
            fArr[r9 + 4] = 0.0f;
            fArr[r9 + 8] = 0.0f;
            fArr[r9] = 1.0f;
            return;
        }
        if (0.0f == f2 && 1.0f == f3 && 0.0f == f4) {
            fArr[r9] = fCos;
            fArr[r9 + 10] = fCos;
            fArr[r9 + 8] = fSin;
            fArr[r9 + 2] = -fSin;
            fArr[r9 + 1] = 0.0f;
            fArr[r9 + 4] = 0.0f;
            fArr[r9 + 6] = 0.0f;
            fArr[r9 + 9] = 0.0f;
            fArr[r9 + 5] = 1.0f;
            return;
        }
        if (0.0f == f2 && 0.0f == f3 && 1.0f == f4) {
            fArr[r9] = fCos;
            fArr[r9 + 5] = fCos;
            fArr[r9 + 1] = fSin;
            fArr[r9 + 4] = -fSin;
            fArr[r9 + 2] = 0.0f;
            fArr[r9 + 6] = 0.0f;
            fArr[r9 + 8] = 0.0f;
            fArr[r9 + 9] = 0.0f;
            fArr[r9 + 10] = 1.0f;
            return;
        }
        float length = length(f2, f3, f4);
        if (1.0f != length) {
            float f5 = 1.0f / length;
            f2 *= f5;
            f3 *= f5;
            f4 *= f5;
        }
        float f6 = 1.0f - fCos;
        float f7 = f2 * fSin;
        float f8 = f3 * fSin;
        float f9 = fSin * f4;
        fArr[r9] = (f2 * f2 * f6) + fCos;
        float f10 = f2 * f3 * f6;
        fArr[r9 + 4] = f10 - f9;
        float f11 = f4 * f2 * f6;
        fArr[r9 + 8] = f11 + f8;
        fArr[r9 + 1] = f10 + f9;
        fArr[r9 + 5] = (f3 * f3 * f6) + fCos;
        float f12 = f3 * f4 * f6;
        fArr[r9 + 9] = f12 - f7;
        fArr[r9 + 2] = f11 - f8;
        fArr[r9 + 6] = f12 + f7;
        fArr[r9 + 10] = (f4 * f4 * f6) + fCos;
    }

    public static void translateM(float[] fArr, int r7, float f, float f2, float f3) {
        for (int r0 = 0; r0 < 4; r0++) {
            int r1 = r7 + r0;
            int r2 = r1 + 12;
            fArr[r2] = fArr[r2] + (fArr[r1] * f) + (fArr[r1 + 4] * f2) + (fArr[r1 + 8] * f3);
        }
    }

    public static void translateM(float[] fArr, int r7, float[] fArr2, int r9, float f, float f2, float f3) {
        for (int r1 = 0; r1 < 12; r1++) {
            fArr[r7 + r1] = fArr2[r9 + r1];
        }
        for (int r0 = 0; r0 < 4; r0++) {
            int r3 = r9 + r0;
            fArr[r7 + r0 + 12] = (fArr2[r3] * f) + (fArr2[r3 + 4] * f2) + (fArr2[r3 + 8] * f3) + fArr2[r3 + 12];
        }
    }

    public static void transposeM(float[] fArr, int r5, float[] fArr2, int r7) {
        for (int r0 = 0; r0 < 4; r0++) {
            int r1 = (r0 * 4) + r7;
            fArr[r0 + r5] = fArr2[r1];
            fArr[r0 + 4 + r5] = fArr2[r1 + 1];
            fArr[r0 + 8 + r5] = fArr2[r1 + 2];
            fArr[r0 + 12 + r5] = fArr2[r1 + 3];
        }
    }
}
