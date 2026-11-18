package com.caverock.androidsvg;

/* JADX INFO: loaded from: classes11.dex */
class NumberParser {
    private int pos;
    private static final float[] positivePowersOf10 = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f, 1.0E11f, 1.0E12f, 1.0E13f, 1.0E14f, 1.0E15f, 1.0E16f, 1.0E17f, 1.0E18f, 1.0E19f, 1.0E20f, 1.0E21f, 1.0E22f, 1.0E23f, 1.0E24f, 1.0E25f, 1.0E26f, 1.0E27f, 1.0E28f, 1.0E29f, 1.0E30f, 1.0E31f, 1.0E32f, 1.0E33f, 1.0E34f, 1.0E35f, 1.0E36f, 1.0E37f, 1.0E38f};
    private static final float[] negativePowersOf10 = {1.0f, 0.1f, 0.01f, 0.001f, 1.0E-4f, 1.0E-5f, 1.0E-6f, 1.0E-7f, 1.0E-8f, 1.0E-9f, 1.0E-10f, 1.0E-11f, 1.0E-12f, 1.0E-13f, 1.0E-14f, 1.0E-15f, 1.0E-16f, 1.0E-17f, 1.0E-18f, 1.0E-19f, 1.0E-20f, 1.0E-21f, 1.0E-22f, 1.0E-23f, 1.0E-24f, 1.0E-25f, 1.0E-26f, 1.0E-27f, 1.0E-28f, 1.0E-29f, 1.0E-30f, 1.0E-31f, 1.0E-32f, 1.0E-33f, 1.0E-34f, 1.0E-35f, 1.0E-36f, 1.0E-37f, 1.0E-38f};

    NumberParser() {
    }

    int getEndPos() {
        return this.pos;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x008a A[EDGE_INSN: B:108:0x008a->B:42:0x008a BREAK  A[LOOP:0: B:13:0x0032->B:41:0x0080], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x00ff A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x003f  */
    /* JADX WARN: Code duplicated, block: B:17:0x0045 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0047  */
    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    /* JADX WARN: Code duplicated, block: B:20:0x004d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x0097 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x0098  */
    /* JADX WARN: Code duplicated, block: B:51:0x009b  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:61:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00db  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:85:0x0103 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:86:0x0104 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x0106  */
    /* JADX WARN: Code duplicated, block: B:88:0x0108  */
    float parseNumber(String str, int r24, int r25) {
        boolean z;
        int r12;
        int r13;
        int r14;
        boolean z2;
        int r16;
        int r8;
        int r6;
        int r15;
        float f;
        char cCharAt;
        int r7;
        char cCharAt2;
        boolean z3;
        boolean z4;
        int r9;
        int r10;
        int r17;
        char cCharAt3;
        char cCharAt4;
        this.pos = r24;
        if (r24 >= r25) {
            return Float.NaN;
        }
        char cCharAt5 = str.charAt(r24);
        if (cCharAt5 != '+') {
            if (cCharAt5 != '-') {
                z = false;
            } else {
                z = true;
            }
            int r11 = this.pos;
            long j = 0;
            r12 = 0;
            r13 = 0;
            r14 = 0;
            z2 = false;
            r16 = 0;
            while (true) {
                r8 = this.pos;
                if (r8 >= r25) {
                    break;
                }
                cCharAt4 = str.charAt(r8);
                if (cCharAt4 != '0') {
                    if (r12 == 0) {
                        r14++;
                    } else {
                        r13++;
                    }
                } else if (cCharAt4 < '1' && cCharAt4 <= '9') {
                    int r18 = r12 + r13;
                    while (r13 > 0) {
                        if (j > 922337203685477580L) {
                            return Float.NaN;
                        }
                        j *= 10;
                        r13--;
                    }
                    if (j > 922337203685477580L) {
                        return Float.NaN;
                    }
                    j = (j * 10) + ((long) (cCharAt4 - '0'));
                    r12 = r18 + 1;
                    if (j < 0) {
                        return Float.NaN;
                    }
                } else {
                    if (cCharAt4 != '.' || z2) {
                        break;
                    }
                    r16 = this.pos - r11;
                    z2 = true;
                }
                this.pos++;
            }
            if (!z2 && this.pos == r16 + 1) {
                return Float.NaN;
            }
            if (r12 == 0) {
                if (r14 == 0) {
                    return Float.NaN;
                }
                r12 = 1;
            }
            if (z2) {
                r13 = (r16 - r14) - r12;
            }
            r6 = this.pos;
            if (r6 < r25 && ((cCharAt = str.charAt(r6)) == 'E' || cCharAt == 'e')) {
                r7 = this.pos + 1;
                this.pos = r7;
                if (r7 == r25) {
                    return Float.NaN;
                }
                cCharAt2 = str.charAt(r7);
                if (cCharAt2 != '+') {
                    if (cCharAt2 != '-') {
                        switch (cCharAt2) {
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                z3 = false;
                                z4 = false;
                                break;
                            default:
                                this.pos--;
                                z4 = true;
                                z3 = false;
                                break;
                        }
                    } else {
                        z3 = true;
                    }
                    if (!z4) {
                        r9 = this.pos;
                        r10 = 0;
                        while (true) {
                            r17 = this.pos;
                            if (r17 >= r25 && (cCharAt3 = str.charAt(r17)) >= '0' && cCharAt3 <= '9') {
                                if (r10 > 922337203685477580L) {
                                    return Float.NaN;
                                }
                                r10 = (r10 * 10) + (cCharAt3 - '0');
                                this.pos++;
                            }
                        }
                        if (this.pos == r9) {
                            return Float.NaN;
                        }
                        if (z3) {
                            r13 -= r10;
                        } else {
                            r13 += r10;
                        }
                    }
                } else {
                    z3 = false;
                }
                this.pos++;
                z4 = false;
                if (!z4) {
                    r9 = this.pos;
                    r10 = 0;
                    while (true) {
                        r17 = this.pos;
                        if (r17 >= r25) {
                        }
                        r10 = (r10 * 10) + (cCharAt3 - '0');
                        this.pos++;
                    }
                    if (this.pos == r9) {
                        return Float.NaN;
                    }
                    if (z3) {
                        r13 -= r10;
                    } else {
                        r13 += r10;
                    }
                }
            }
            r15 = r12 + r13;
            if (r15 <= 39 || r15 < -44) {
                return Float.NaN;
            }
            long j2 = j;
            float f2 = j2;
            if (j2 != 0) {
                if (r13 > 0) {
                    f = positivePowersOf10[r13];
                } else if (r13 < 0) {
                    if (r13 < -38) {
                        f2 = (float) (((double) f2) * 1.0E-20d);
                        r13 += 20;
                    }
                    f = negativePowersOf10[-r13];
                }
                f2 *= f;
            }
            return z ? -f2 : f2;
        }
        z = false;
        this.pos++;
        int r19 = this.pos;
        long j3 = 0;
        r12 = 0;
        r13 = 0;
        r14 = 0;
        z2 = false;
        r16 = 0;
        while (true) {
            r8 = this.pos;
            if (r8 >= r25) {
                break;
                break;
            }
            cCharAt4 = str.charAt(r8);
            if (cCharAt4 != '0') {
                if (cCharAt4 < '1') {
                }
                if (cCharAt4 != '.') {
                    break;
                }
                break;
                break;
            }
            if (r12 == 0) {
                r14++;
            } else {
                r13++;
            }
            this.pos++;
        }
        if (!z2) {
        }
        if (r12 == 0) {
            if (r14 == 0) {
                return Float.NaN;
            }
            r12 = 1;
        }
        if (z2) {
            r13 = (r16 - r14) - r12;
        }
        r6 = this.pos;
        if (r6 < r25) {
            r7 = this.pos + 1;
            this.pos = r7;
            if (r7 == r25) {
                return Float.NaN;
            }
            cCharAt2 = str.charAt(r7);
            if (cCharAt2 != '+') {
                if (cCharAt2 != '-') {
                    switch (cCharAt2) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            z3 = false;
                            z4 = false;
                            break;
                        default:
                            this.pos--;
                            z4 = true;
                            z3 = false;
                            break;
                    }
                } else {
                    z3 = true;
                }
                if (!z4) {
                    r9 = this.pos;
                    r10 = 0;
                    while (true) {
                        r17 = this.pos;
                        if (r17 >= r25) {
                        }
                        r10 = (r10 * 10) + (cCharAt3 - '0');
                        this.pos++;
                    }
                    if (this.pos == r9) {
                        return Float.NaN;
                    }
                    if (z3) {
                        r13 -= r10;
                    } else {
                        r13 += r10;
                    }
                }
            } else {
                z3 = false;
            }
            this.pos++;
            z4 = false;
            if (!z4) {
                r9 = this.pos;
                r10 = 0;
                while (true) {
                    r17 = this.pos;
                    if (r17 >= r25) {
                    }
                    r10 = (r10 * 10) + (cCharAt3 - '0');
                    this.pos++;
                }
                if (this.pos == r9) {
                    return Float.NaN;
                }
                if (z3) {
                    r13 -= r10;
                } else {
                    r13 += r10;
                }
            }
        }
        r15 = r12 + r13;
        if (r15 <= 39) {
        }
        return Float.NaN;
    }
}
