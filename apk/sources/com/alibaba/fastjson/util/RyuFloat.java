package com.alibaba.fastjson.util;

import com.tencent.mm.opensdk.constants.Build;

/* JADX INFO: loaded from: classes7.dex */
public final class RyuFloat {
    private static final int[][] POW5_SPLIT = {new int[]{536870912, 0}, new int[]{Build.SUPPORT_SEND_MUSIC_VIDEO_MESSAGE, 0}, new int[]{838860800, 0}, new int[]{1048576000, 0}, new int[]{655360000, 0}, new int[]{819200000, 0}, new int[]{1024000000, 0}, new int[]{640000000, 0}, new int[]{800000000, 0}, new int[]{1000000000, 0}, new int[]{625000000, 0}, new int[]{781250000, 0}, new int[]{976562500, 0}, new int[]{610351562, 1073741824}, new int[]{762939453, 268435456}, new int[]{953674316, 872415232}, new int[]{596046447, 1619001344}, new int[]{745058059, 1486880768}, new int[]{931322574, 1321730048}, new int[]{582076609, 289210368}, new int[]{727595761, 898383872}, new int[]{909494701, 1659850752}, new int[]{568434188, 1305842176}, new int[]{710542735, 1632302720}, new int[]{888178419, 1503507488}, new int[]{555111512, 671256724}, new int[]{693889390, 839070905}, new int[]{867361737, 2122580455}, new int[]{542101086, 521306416}, new int[]{677626357, 1725374844}, new int[]{847032947, 546105819}, new int[]{1058791184, 145761362}, new int[]{661744490, 91100851}, new int[]{827180612, 1187617888}, new int[]{1033975765, 1484522360}, new int[]{646234853, 1196261931}, new int[]{807793566, 2032198326}, new int[]{1009741958, 1466506084}, new int[]{631088724, 379695390}, new int[]{788860905, 474619238}, new int[]{986076131, 1130144959}, new int[]{616297582, 437905143}, new int[]{770371977, 1621123253}, new int[]{962964972, 415791331}, new int[]{601853107, 1333611405}, new int[]{752316384, 1130143345}, new int[]{940395480, 1412679181}};
    private static final int[][] POW5_INV_SPLIT = {new int[]{268435456, 1}, new int[]{214748364, 1717986919}, new int[]{171798691, 1803886265}, new int[]{137438953, 1013612282}, new int[]{219902325, 1192282922}, new int[]{175921860, 953826338}, new int[]{140737488, 763061070}, new int[]{225179981, 791400982}, new int[]{180143985, 203624056}, new int[]{144115188, 162899245}, new int[]{230584300, 1978625710}, new int[]{184467440, 1582900568}, new int[]{147573952, 1266320455}, new int[]{236118324, 308125809}, new int[]{188894659, 675997377}, new int[]{151115727, 970294631}, new int[]{241785163, 1981968139}, new int[]{193428131, 297084323}, new int[]{154742504, 1955654377}, new int[]{247588007, 1840556814}, new int[]{198070406, 613451992}, new int[]{158456325, 61264864}, new int[]{253530120, 98023782}, new int[]{202824096, 78419026}, new int[]{162259276, 1780722139}, new int[]{259614842, 1990161963}, new int[]{207691874, 733136111}, new int[]{166153499, 1016005619}, new int[]{265845599, 337118801}, new int[]{212676479, 699191770}, new int[]{170141183, 988850146}};

    public static String toString(float f) {
        char[] cArr = new char[15];
        return new String(cArr, 0, toString(f, cArr, 0));
    }

    public static int toString(float f, char[] cArr, int r31) {
        int r6;
        int r21;
        int r4;
        int r5;
        int r1;
        int r9;
        int r14;
        int r2;
        int r3;
        int r7;
        int r8;
        int r0;
        int r10;
        int r11;
        int r12;
        int r13;
        if (!Float.isNaN(f)) {
            if (f == Float.POSITIVE_INFINITY) {
                cArr[r31] = 'I';
                cArr[r31 + 1] = 'n';
                cArr[r31 + 2] = 'f';
                cArr[r31 + 3] = 'i';
                cArr[r31 + 4] = 'n';
                cArr[r31 + 5] = 'i';
                cArr[r31 + 6] = 't';
                r12 = r31 + 8;
                cArr[r31 + 7] = 'y';
            } else if (f == Float.NEGATIVE_INFINITY) {
                cArr[r31] = '-';
                cArr[r31 + 1] = 'I';
                cArr[r31 + 2] = 'n';
                cArr[r31 + 3] = 'f';
                cArr[r31 + 4] = 'i';
                cArr[r31 + 5] = 'n';
                cArr[r31 + 6] = 'i';
                cArr[r31 + 7] = 't';
                r13 = r31 + 9;
                cArr[r31 + 8] = 'y';
            } else {
                int r15 = Float.floatToIntBits(f);
                if (r15 == 0) {
                    cArr[r31] = '0';
                    cArr[r31 + 1] = '.';
                    r13 = r31 + 3;
                    cArr[r31 + 2] = '0';
                } else if (r15 == Integer.MIN_VALUE) {
                    cArr[r31] = '-';
                    cArr[r31 + 1] = '0';
                    cArr[r31 + 2] = '.';
                    r12 = r31 + 4;
                    cArr[r31 + 3] = '0';
                } else {
                    int r16 = (r15 >> 23) & 255;
                    int r17 = 8388607 & r15;
                    if (r16 == 0) {
                        r6 = -149;
                    } else {
                        r6 = r16 - 150;
                        r17 |= 8388608;
                    }
                    boolean z = r15 < 0;
                    boolean z2 = (r17 & 1) == 0;
                    int r18 = r17 * 4;
                    int r19 = r18 + 2;
                    int r20 = r18 - ((((long) r17) != 8388608 || r16 <= 1) ? 2 : 1);
                    int r22 = r6 - 2;
                    if (r22 >= 0) {
                        r2 = (int) ((((long) r22) * 3010299) / 10000000);
                        int r23 = r2 == 0 ? 1 : (int) (((((long) r2) * 23219280) + 9999999) / 10000000);
                        int r24 = (-r22) + r2;
                        int[][] r25 = POW5_INV_SPLIT;
                        int[] r26 = r25[r2];
                        long j = r26[0];
                        long j2 = r26[1];
                        long j3 = r18;
                        int r27 = ((r23 + 58) + r24) - 31;
                        r21 = (int) (((j3 * j) + ((j3 * j2) >> 31)) >> r27);
                        long j4 = r19;
                        r8 = (int) (((j4 * j) + ((j4 * j2) >> 31)) >> r27);
                        int r28 = r20;
                        long j5 = r28;
                        r4 = (int) (((j * j5) + ((j5 * j2) >> 31)) >> r27);
                        if (r2 == 0 || (r8 - 1) / 10 > r4 / 10) {
                            r14 = 0;
                        } else {
                            int r29 = r2 - 1;
                            int r30 = (r24 - 1) + (r29 == 0 ? 1 : (int) (((((long) r29) * 23219280) + 9999999) / 10000000)) + 58;
                            int[] r32 = r25[r29];
                            r14 = (int) ((((((long) r32[0]) * j3) + ((j3 * ((long) r32[1])) >> 31)) >> (r30 - 31)) % 10);
                        }
                        int r33 = 0;
                        while (r19 > 0 && r19 % 5 == 0) {
                            r19 /= 5;
                            r33++;
                        }
                        int r110 = r18;
                        int r34 = 0;
                        while (r110 > 0 && r110 % 5 == 0) {
                            r110 /= 5;
                            r34++;
                        }
                        int r35 = 0;
                        while (r28 > 0 && r28 % 5 == 0) {
                            r28 /= 5;
                            r35++;
                        }
                        r3 = r33 >= r2 ? 1 : 0;
                        int r36 = r34 >= r2 ? 1 : 0;
                        r7 = r35 >= r2 ? 1 : 0;
                        r9 = r36;
                        r5 = 0;
                    } else {
                        int r37 = -r22;
                        int r38 = (int) ((((long) r37) * 6989700) / 10000000);
                        int r39 = r37 - r38;
                        int r40 = r39 == 0 ? 1 : (int) (((((long) r39) * 23219280) + 9999999) / 10000000);
                        int[][] r41 = POW5_SPLIT;
                        int[] r42 = r41[r39];
                        long j6 = r42[0];
                        long j7 = r42[1];
                        int r43 = (r38 - (r40 - 61)) - 31;
                        long j8 = r18;
                        long j9 = r19;
                        int r111 = (int) (((j9 * j6) + ((j9 * j7) >> 31)) >> r43);
                        r21 = (int) (((j8 * j6) + ((j8 * j7) >> 31)) >> r43);
                        long j10 = r20;
                        r4 = (int) (((j6 * j10) + ((j10 * j7) >> 31)) >> r43);
                        if (r38 == 0 || (r111 - 1) / 10 > r4 / 10) {
                            r5 = 0;
                            r1 = 0;
                        } else {
                            int r44 = r39 + 1;
                            int r45 = (r38 - 1) - ((r44 == 0 ? 1 : (int) (((((long) r44) * 23219280) + 9999999) / 10000000)) - 61);
                            int[] r46 = r41[r44];
                            r5 = 0;
                            r1 = (int) ((((((long) r46[0]) * j8) + ((j8 * ((long) r46[1])) >> 31)) >> (r45 - 31)) % 10);
                        }
                        int r47 = r22 + r38;
                        int r48 = 1 >= r38 ? 1 : r5;
                        r9 = (r38 >= 23 || (r18 & ((1 << (r38 + (-1))) - 1)) != 0) ? r5 : 1;
                        int r49 = (r20 % 2 == 1 ? r5 : 1) >= r38 ? 1 : r5;
                        r14 = r1;
                        r2 = r47;
                        r3 = r48;
                        r7 = r49;
                        r8 = r111;
                    }
                    int r50 = 1000000000;
                    int r51 = 10;
                    while (r51 > 0 && r8 < r50) {
                        r50 /= 10;
                        r51--;
                    }
                    int r52 = r2 + r51;
                    int r53 = r52 - 1;
                    int r112 = (r53 < -3 || r53 >= 7) ? 1 : r5;
                    if (r3 != 0 && !z2) {
                        r8--;
                    }
                    int r54 = r5;
                    while (true) {
                        int r113 = r8 / 10;
                        int r114 = r4 / 10;
                        if (r113 <= r114 || (r8 < 100 && r112 != 0)) {
                            break;
                        }
                        r7 &= r4 % 10 == 0 ? 1 : r5;
                        r14 = r21 % 10;
                        r21 /= 10;
                        r54++;
                        r8 = r113;
                        r4 = r114;
                    }
                    if (r7 != 0 && z2 != 0) {
                        while (r4 % 10 == 0 && (r8 >= 100 || r112 == 0)) {
                            r8 /= 10;
                            r14 = r21 % 10;
                            r21 /= 10;
                            r4 /= 10;
                            r54++;
                        }
                    }
                    int r55 = r21;
                    if (r9 != 0 && r14 == 5 && r55 % 2 == 0) {
                        r14 = 4;
                    }
                    int r56 = ((!(r55 == r4 && (r7 == 0 || z2 == 0)) && r14 < 5) ? r5 : 1) + r55;
                    int r57 = r51 - r54;
                    if (z) {
                        r0 = r31 + 1;
                        cArr[r31] = '-';
                    } else {
                        r0 = r31;
                    }
                    if (r112 != 0) {
                        while (r5 < r57 - 1) {
                            int r58 = r56 % 10;
                            r56 /= 10;
                            cArr[(r0 + r57) - r5] = (char) (r58 + 48);
                            r5++;
                        }
                        cArr[r0] = (char) ((r56 % 10) + 48);
                        cArr[r0 + 1] = '.';
                        int r59 = r0 + r57 + 1;
                        if (r57 == 1) {
                            cArr[r59] = '0';
                            r59++;
                        }
                        int r60 = r59 + 1;
                        cArr[r59] = 'E';
                        if (r53 < 0) {
                            cArr[r60] = '-';
                            r53 = -r53;
                            r60 = r59 + 2;
                        }
                        if (r53 >= 10) {
                            r11 = 48;
                            cArr[r60] = (char) ((r53 / 10) + 48);
                            r60++;
                        } else {
                            r11 = 48;
                        }
                        r10 = r60 + 1;
                        cArr[r60] = (char) ((r53 % 10) + r11);
                    } else {
                        int r61 = 48;
                        if (r53 < 0) {
                            int r62 = r0 + 1;
                            cArr[r0] = '0';
                            int r63 = r0 + 2;
                            cArr[r62] = '.';
                            int r64 = -1;
                            while (r64 > r53) {
                                cArr[r63] = '0';
                                r64--;
                                r63++;
                            }
                            int r65 = r63;
                            int r66 = r5;
                            while (r66 < r57) {
                                cArr[((r63 + r57) - r66) - 1] = (char) ((r56 % 10) + r61);
                                r56 /= 10;
                                r65++;
                                r66++;
                                r61 = 48;
                            }
                            r10 = r65;
                        } else if (r52 >= r57) {
                            for (int r67 = r5; r67 < r57; r67++) {
                                cArr[((r0 + r57) - r67) - 1] = (char) ((r56 % 10) + 48);
                                r56 /= 10;
                            }
                            int r68 = r0 + r57;
                            while (r57 < r52) {
                                cArr[r68] = '0';
                                r57++;
                                r68++;
                            }
                            int r69 = r68 + 1;
                            cArr[r68] = '.';
                            r10 = r68 + 2;
                            cArr[r69] = '0';
                        } else {
                            int r70 = r0 + 1;
                            while (r5 < r57) {
                                if ((r57 - r5) - 1 == r53) {
                                    cArr[((r70 + r57) - r5) - 1] = '.';
                                    r70--;
                                }
                                cArr[((r70 + r57) - r5) - 1] = (char) ((r56 % 10) + 48);
                                r56 /= 10;
                                r5++;
                            }
                            r10 = r0 + r57 + 1;
                        }
                    }
                    return r10 - r31;
                }
            }
            return r12 - r31;
        }
        cArr[r31] = 'N';
        cArr[r31 + 1] = 'a';
        r13 = r31 + 3;
        cArr[r31 + 2] = 'N';
        return r13 - r31;
    }
}
