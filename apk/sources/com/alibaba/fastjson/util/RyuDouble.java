package com.alibaba.fastjson.util;

import androidx.media3.exoplayer.MediaPeriodQueue;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import java.lang.reflect.Array;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class RyuDouble {
    private static final int[][] POW5_SPLIT = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 326, 4);
    private static final int[][] POW5_INV_SPLIT = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 291, 4);

    static {
        BigInteger bigIntegerSubtract = BigInteger.ONE.shiftLeft(31).subtract(BigInteger.ONE);
        BigInteger bigIntegerSubtract2 = BigInteger.ONE.shiftLeft(31).subtract(BigInteger.ONE);
        int r7 = 0;
        while (r7 < 326) {
            BigInteger bigIntegerPow = BigInteger.valueOf(5L).pow(r7);
            int r9 = bigIntegerPow.bitLength();
            int r10 = r7 == 0 ? 1 : (int) (((((long) r7) * 23219280) + 9999999) / 10000000);
            if (r10 != r9) {
                throw new IllegalStateException(r9 + " != " + r10);
            }
            if (r7 < POW5_SPLIT.length) {
                for (int r11 = 0; r11 < 4; r11++) {
                    POW5_SPLIT[r7][r11] = bigIntegerPow.shiftRight((r9 - 121) + ((3 - r11) * 31)).and(bigIntegerSubtract).intValue();
                }
            }
            if (r7 < POW5_INV_SPLIT.length) {
                BigInteger bigIntegerAdd = BigInteger.ONE.shiftLeft(r9 + 121).divide(bigIntegerPow).add(BigInteger.ONE);
                for (int r12 = 0; r12 < 4; r12++) {
                    if (r12 == 0) {
                        POW5_INV_SPLIT[r7][r12] = bigIntegerAdd.shiftRight((3 - r12) * 31).intValue();
                    } else {
                        POW5_INV_SPLIT[r7][r12] = bigIntegerAdd.shiftRight((3 - r12) * 31).and(bigIntegerSubtract2).intValue();
                    }
                }
            }
            r7++;
        }
    }

    public static String toString(double d) {
        char[] cArr = new char[24];
        return new String(cArr, 0, toString(d, cArr, 0));
    }

    public static int toString(double d, char[] cArr, int r44) {
        int r9;
        boolean z;
        boolean z2;
        long j;
        long j2;
        int r2;
        long j3;
        boolean z3;
        boolean z4;
        long j4;
        int r4;
        int r1;
        int r3;
        int r5;
        int r6;
        boolean z5;
        int r7;
        int r8;
        int r10;
        int r0;
        if (Double.isNaN(d)) {
            cArr[r44] = 'N';
            cArr[r44 + 1] = 'a';
            r0 = r44 + 3;
            cArr[r44 + 2] = 'N';
        } else {
            if (d == Double.POSITIVE_INFINITY) {
                cArr[r44] = 'I';
                cArr[r44 + 1] = 'n';
                cArr[r44 + 2] = 'f';
                cArr[r44 + 3] = 'i';
                cArr[r44 + 4] = 'n';
                cArr[r44 + 5] = 'i';
                cArr[r44 + 6] = 't';
                cArr[r44 + 7] = 'y';
                return (r44 + 8) - r44;
            }
            if (d == Double.NEGATIVE_INFINITY) {
                cArr[r44] = '-';
                cArr[r44 + 1] = 'I';
                cArr[r44 + 2] = 'n';
                cArr[r44 + 3] = 'f';
                cArr[r44 + 4] = 'i';
                cArr[r44 + 5] = 'n';
                cArr[r44 + 6] = 'i';
                cArr[r44 + 7] = 't';
                r0 = r44 + 9;
                cArr[r44 + 8] = 'y';
            } else {
                long jDoubleToLongBits = Double.doubleToLongBits(d);
                if (jDoubleToLongBits != 0) {
                    if (jDoubleToLongBits == Long.MIN_VALUE) {
                        cArr[r44] = '-';
                        cArr[r44 + 1] = '0';
                        cArr[r44 + 2] = '.';
                        r6 = r44 + 4;
                        cArr[r44 + 3] = '0';
                    } else {
                        int r11 = (int) ((jDoubleToLongBits >>> 52) & 2047);
                        long j5 = jDoubleToLongBits & 4503599627370495L;
                        if (r11 == 0) {
                            r9 = -1074;
                        } else {
                            r9 = r11 - 1075;
                            j5 |= 4503599627370496L;
                        }
                        boolean z6 = jDoubleToLongBits < 0;
                        boolean z7 = (j5 & 1) == 0;
                        long j6 = 4 * j5;
                        long j7 = j6 + 2;
                        int r12 = (j5 != 4503599627370496L || r11 <= 1) ? 1 : 0;
                        long j8 = (j6 - 1) - ((long) r12);
                        int r13 = r9 - 2;
                        int r23 = 3;
                        if (r13 >= 0) {
                            int r14 = Math.max(0, ((int) ((((long) r13) * 3010299) / 10000000)) - 1);
                            int r15 = (((-r13) + r14) + ((r14 == 0 ? 1 : (int) (((((long) r14) * 23219280) + 9999999) / 10000000)) + 121)) - 114;
                            if (r15 < 0) {
                                throw new IllegalArgumentException("" + r15);
                            }
                            int[] r16 = POW5_INV_SPLIT[r14];
                            long j9 = j6 >>> 31;
                            long j10 = j6 & 2147483647L;
                            int r17 = r16[0];
                            int r18 = r16[1];
                            z = z6;
                            int r19 = r16[2];
                            z2 = z7;
                            int r20 = r16[3];
                            long j11 = ((((((((((((j10 * ((long) r20)) >>> 31) + (((long) r19) * j10)) + (j9 * ((long) r20))) >>> 31) + (((long) r18) * j10)) + (((long) r19) * j9)) >>> 31) + (((long) r17) * j10)) + (((long) r18) * j9)) >>> 21) + ((((long) r17) * j9) << 10)) >>> r15;
                            long j12 = j7 >>> 31;
                            long j13 = j7 & 2147483647L;
                            long j14 = ((((((((((((j13 * ((long) r20)) >>> 31) + (((long) r19) * j13)) + (j12 * ((long) r20))) >>> 31) + (((long) r18) * j13)) + (((long) r19) * j12)) >>> 31) + (((long) r17) * j13)) + (((long) r18) * j12)) >>> 21) + ((((long) r17) * j12) << 10)) >>> r15;
                            long j15 = j8 >>> 31;
                            long j16 = j8 & 2147483647L;
                            j3 = j14;
                            j2 = ((((((((((((j16 * ((long) r20)) >>> 31) + (((long) r19) * j16)) + (j15 * ((long) r20))) >>> 31) + (((long) r18) * j16)) + (((long) r19) * j15)) >>> 31) + (((long) r17) * j16)) + (((long) r18) * j15)) >>> 21) + ((((long) r17) * j15) << 10)) >>> r15;
                            if (r14 <= 21) {
                                long j17 = j6 % 5;
                                if (j17 == 0) {
                                    if (j17 != 0) {
                                        r10 = 0;
                                    } else if (j6 % 25 != 0) {
                                        r10 = 1;
                                    } else if (j6 % 125 != 0) {
                                        r10 = 2;
                                    } else if (j6 % 625 != 0) {
                                        r10 = 3;
                                    } else {
                                        long j18 = j6 / 625;
                                        r10 = 4;
                                        for (long j19 = 0; j18 > j19 && j18 % 5 == j19; j19 = 0) {
                                            j18 /= 5;
                                            r10++;
                                        }
                                    }
                                    z4 = r10 >= r14;
                                    z5 = false;
                                } else {
                                    if (z2) {
                                        if (j8 % 5 != 0) {
                                            r8 = 0;
                                        } else if (j8 % 25 != 0) {
                                            r8 = 1;
                                        } else if (j8 % 125 != 0) {
                                            r8 = 2;
                                        } else if (j8 % 625 != 0) {
                                            r8 = 3;
                                        } else {
                                            long j20 = j8 / 625;
                                            r8 = 4;
                                            for (long j21 = 0; j20 > j21 && j20 % 5 == j21; j21 = 0) {
                                                j20 /= 5;
                                                r8++;
                                            }
                                        }
                                        z5 = r8 >= r14;
                                        z4 = false;
                                    } else {
                                        if (j7 % 5 != 0) {
                                            r7 = 0;
                                        } else if (j7 % 25 != 0) {
                                            r7 = 1;
                                        } else if (j7 % 125 != 0) {
                                            r7 = 2;
                                        } else if (j7 % 625 != 0) {
                                            r7 = 3;
                                        } else {
                                            long j22 = j7 / 625;
                                            r7 = 4;
                                            for (long j23 = 0; j22 > j23 && j22 % 5 == j23; j23 = 0) {
                                                j22 /= 5;
                                                r7++;
                                            }
                                        }
                                        if (r7 >= r14) {
                                            j3--;
                                        }
                                    }
                                    z4 = false;
                                }
                            } else {
                                z4 = false;
                            }
                            j = j11;
                            z3 = z5;
                            r2 = r14;
                        } else {
                            z = z6;
                            z2 = z7;
                            int r21 = -r13;
                            int r22 = Math.max(0, ((int) ((((long) r21) * 6989700) / 10000000)) - 1);
                            int r24 = r21 - r22;
                            int r25 = (r22 - ((r24 == 0 ? 1 : (int) (((((long) r24) * 23219280) + 9999999) / 10000000)) - 121)) - 114;
                            if (r25 < 0) {
                                throw new IllegalArgumentException("" + r25);
                            }
                            int[] r26 = POW5_SPLIT[r24];
                            long j24 = j6 >>> 31;
                            long j25 = j6 & 2147483647L;
                            int r27 = r26[0];
                            int r28 = r26[1];
                            int r29 = r12;
                            int r30 = r26[2];
                            int r31 = r26[3];
                            long j26 = ((((((((((((j25 * ((long) r31)) >>> 31) + (((long) r30) * j25)) + (j24 * ((long) r31))) >>> 31) + (((long) r28) * j25)) + (((long) r30) * j24)) >>> 31) + (((long) r27) * j25)) + (((long) r28) * j24)) >>> 21) + ((((long) r27) * j24) << 10)) >>> r25;
                            long j27 = j7 >>> 31;
                            long j28 = j7 & 2147483647L;
                            j = j26;
                            long j29 = ((((((((((((((long) r31) * j28) >>> 31) + (((long) r30) * j28)) + (j27 * ((long) r31))) >>> 31) + (((long) r28) * j28)) + (((long) r30) * j27)) >>> 31) + (((long) r27) * j28)) + (((long) r28) * j27)) >>> 21) + ((((long) r27) * j27) << 10)) >>> r25;
                            long j30 = j8 >>> 31;
                            long j31 = j8 & 2147483647L;
                            j2 = ((((((((((((((long) r31) * j31) >>> 31) + (((long) r30) * j31)) + (j30 * ((long) r31))) >>> 31) + (((long) r28) * j31)) + (((long) r30) * j30)) >>> 31) + (((long) r27) * j31)) + (((long) r28) * j30)) >>> 21) + ((((long) r27) * j30) << 10)) >>> r25;
                            r2 = r22 + r13;
                            if (r22 <= 1) {
                                if (z2) {
                                    z4 = true;
                                    j3 = j29;
                                    z3 = r29 == 1;
                                } else {
                                    j3 = j29 - 1;
                                    z4 = true;
                                    z3 = false;
                                }
                            } else if (r22 < 63) {
                                z4 = (j6 & ((1 << (r22 - 1)) - 1)) == 0;
                                j3 = j29;
                                z3 = false;
                            } else {
                                j3 = j29;
                                z3 = false;
                                z4 = false;
                            }
                        }
                        if (j3 >= 1000000000000000000L) {
                            r23 = 19;
                        } else if (j3 >= 100000000000000000L) {
                            r23 = 18;
                        } else if (j3 >= 10000000000000000L) {
                            r23 = 17;
                        } else if (j3 >= 1000000000000000L) {
                            r23 = 16;
                        } else if (j3 >= 100000000000000L) {
                            r23 = 15;
                        } else if (j3 >= 10000000000000L) {
                            r23 = 14;
                        } else if (j3 >= MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US) {
                            r23 = 13;
                        } else if (j3 >= 100000000000L) {
                            r23 = 12;
                        } else if (j3 >= 10000000000L) {
                            r23 = 11;
                        } else if (j3 >= 1000000000) {
                            r23 = 10;
                        } else if (j3 >= 100000000) {
                            r23 = 9;
                        } else if (j3 >= 10000000) {
                            r23 = 8;
                        } else if (j3 >= 1000000) {
                            r23 = 7;
                        } else if (j3 >= SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) {
                            r23 = 6;
                        } else if (j3 >= 10000) {
                            r23 = 5;
                        } else if (j3 >= 1000) {
                            r23 = 4;
                        } else if (j3 < 100) {
                            r23 = j3 >= 10 ? 2 : 1;
                        }
                        int r32 = r2 + r23;
                        int r33 = r32 - 1;
                        boolean z8 = r33 < -3 || r33 >= 7;
                        if (z3 || z4) {
                            int r110 = 0;
                            int r111 = 0;
                            while (true) {
                                long j32 = j3 / 10;
                                long j33 = j2 / 10;
                                if (j32 <= j33 || (j3 < 100 && z8)) {
                                    break;
                                }
                                z3 &= j2 % 10 == 0;
                                z4 &= r110 == 0;
                                r110 = (int) (j % 10);
                                j /= 10;
                                r111++;
                                j3 = j32;
                                j2 = j33;
                            }
                            if (z3 && z2) {
                                while (j2 % 10 == 0 && (j3 >= 100 || !z8)) {
                                    z4 &= r110 == 0;
                                    r110 = (int) (j % 10);
                                    j3 /= 10;
                                    j /= 10;
                                    j2 /= 10;
                                    r111++;
                                }
                            }
                            if (z4 && r110 == 5 && j % 2 == 0) {
                                r110 = 4;
                            }
                            j4 = j + ((long) (((j != j2 || (z3 && z2)) && r110 < 5) ? 0 : 1));
                            r4 = r111;
                        } else {
                            int r34 = 0;
                            r4 = 0;
                            while (true) {
                                long j34 = j3 / 10;
                                long j35 = j2 / 10;
                                if (j34 <= j35 || (j3 < 100 && z8)) {
                                    break;
                                }
                                r34 = (int) (j % 10);
                                j /= 10;
                                r4++;
                                j3 = j34;
                                j2 = j35;
                            }
                            j4 = j + ((long) ((j == j2 || r34 >= 5) ? 1 : 0));
                        }
                        int r35 = r23 - r4;
                        if (z) {
                            r1 = r44 + 1;
                            cArr[r44] = '-';
                        } else {
                            r1 = r44;
                        }
                        if (!z8) {
                            char c = '0';
                            if (r33 < 0) {
                                int r36 = r1 + 1;
                                cArr[r1] = '0';
                                int r37 = r1 + 2;
                                cArr[r36] = '.';
                                int r38 = -1;
                                while (r38 > r33) {
                                    cArr[r37] = c;
                                    r38--;
                                    r37++;
                                    c = '0';
                                }
                                r3 = r37;
                                for (int r112 = 0; r112 < r35; r112++) {
                                    cArr[((r37 + r35) - r112) - 1] = (char) ((j4 % 10) + 48);
                                    j4 /= 10;
                                    r3++;
                                }
                            } else if (r32 >= r35) {
                                for (int r113 = 0; r113 < r35; r113++) {
                                    cArr[((r1 + r35) - r113) - 1] = (char) ((j4 % 10) + 48);
                                    j4 /= 10;
                                }
                                int r39 = r1 + r35;
                                while (r35 < r32) {
                                    cArr[r39] = '0';
                                    r35++;
                                    r39++;
                                }
                                cArr[r39] = '.';
                                r3 = r39 + 2;
                                cArr[r39 + 1] = '0';
                            } else {
                                int r40 = r1 + 1;
                                for (int r114 = 0; r114 < r35; r114++) {
                                    if ((r35 - r114) - 1 == r33) {
                                        cArr[((r40 + r35) - r114) - 1] = '.';
                                        r40--;
                                    }
                                    cArr[((r40 + r35) - r114) - 1] = (char) ((j4 % 10) + 48);
                                    j4 /= 10;
                                }
                                r3 = r1 + r35 + 1;
                            }
                            return r3 - r44;
                        }
                        for (int r115 = 0; r115 < r35 - 1; r115++) {
                            int r41 = (int) (j4 % 10);
                            j4 /= 10;
                            cArr[(r1 + r35) - r115] = (char) (r41 + 48);
                        }
                        cArr[r1] = (char) ((j4 % 10) + 48);
                        cArr[r1 + 1] = '.';
                        int r42 = r1 + r35 + 1;
                        if (r35 == 1) {
                            cArr[r42] = '0';
                            r42++;
                        }
                        int r43 = r42 + 1;
                        cArr[r42] = 'E';
                        if (r33 < 0) {
                            cArr[r43] = '-';
                            r33 = -r33;
                            r43 = r42 + 2;
                        }
                        if (r33 >= 100) {
                            int r45 = r43 + 1;
                            r5 = 48;
                            cArr[r43] = (char) ((r33 / 100) + 48);
                            r33 %= 100;
                            r43 += 2;
                            cArr[r45] = (char) ((r33 / 10) + 48);
                        } else {
                            r5 = 48;
                            if (r33 >= 10) {
                                cArr[r43] = (char) ((r33 / 10) + 48);
                                r43++;
                            }
                        }
                        r6 = r43 + 1;
                        cArr[r43] = (char) ((r33 % 10) + r5);
                    }
                    return r6 - r44;
                }
                cArr[r44] = '0';
                cArr[r44 + 1] = '.';
                r0 = r44 + 3;
                cArr[r44 + 2] = '0';
            }
        }
        return r0 - r44;
    }
}
