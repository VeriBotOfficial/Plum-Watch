package com.caverock.androidsvg;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes11.dex */
class IntegerParser {
    private int pos;
    private long value;

    IntegerParser(long j, int r3) {
        this.value = j;
        this.pos = r3;
    }

    int getEndPos() {
        return this.pos;
    }

    static IntegerParser parseInt(String str, int r8, int r9, boolean z) {
        if (r8 >= r9) {
            return null;
        }
        boolean z2 = false;
        if (z) {
            char cCharAt = str.charAt(r8);
            if (cCharAt == '+') {
                r8++;
            } else if (cCharAt == '-') {
                z2 = true;
                r8++;
            }
        }
        long j = 0;
        int r10 = r8;
        while (r10 < r9) {
            char cCharAt2 = str.charAt(r10);
            if (cCharAt2 < '0' || cCharAt2 > '9') {
                break;
            }
            if (z2) {
                j = (j * 10) - ((long) (cCharAt2 - '0'));
                if (j < -2147483648L) {
                    return null;
                }
            } else {
                j = (j * 10) + ((long) (cCharAt2 - '0'));
                if (j > 2147483647L) {
                    return null;
                }
            }
            r10++;
        }
        if (r10 == r8) {
            return null;
        }
        return new IntegerParser(j, r10);
    }

    public int value() {
        return (int) this.value;
    }

    static IntegerParser parseHex(String str, int r11, int r12) {
        long j;
        int r4;
        if (r11 >= r12) {
            return null;
        }
        long j2 = 0;
        int r3 = r11;
        while (r3 < r12) {
            char cCharAt = str.charAt(r3);
            if (cCharAt < '0' || cCharAt > '9') {
                if (cCharAt >= 'A' && cCharAt <= 'F') {
                    j = j2 * 16;
                    r4 = cCharAt - 'A';
                } else {
                    if (cCharAt < 'a' || cCharAt > 'f') {
                        break;
                    }
                    j = j2 * 16;
                    r4 = cCharAt - 'a';
                }
                j2 = j + ((long) r4) + 10;
            } else {
                j2 = (j2 * 16) + ((long) (cCharAt - '0'));
            }
            if (j2 > BodyPartID.bodyIdMax) {
                return null;
            }
            r3++;
        }
        if (r3 == r11) {
            return null;
        }
        return new IntegerParser(j2, r3);
    }
}
