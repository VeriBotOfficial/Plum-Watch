package com.huawei.hms.scankit.p;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: CodaBarWriter.java */
/* renamed from: com.huawei.hms.scankit.p.mc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C3030mc extends AbstractC3057tc {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f10669a;
    private static final char[] b = {'T', 'N', '*', 'E'};
    private static final char[] c = {'/', AbstractJsonLexerKt.COLON, '+', '.'};
    private static final char d;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        f10669a = cArr;
        d = cArr[0];
    }

    @Override // com.huawei.hms.scankit.p.AbstractC3057tc
    public boolean[] a(String str) {
        int i;
        if (str.length() < 2) {
            StringBuilder sb = new StringBuilder();
            char c2 = d;
            str = sb.append(c2).append(str).append(c2).toString();
        } else {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr = f10669a;
            boolean a2 = O.a(cArr, upperCase);
            boolean a3 = O.a(cArr, upperCase2);
            char[] cArr2 = b;
            boolean a4 = O.a(cArr2, upperCase);
            boolean a5 = O.a(cArr2, upperCase2);
            if (a2) {
                if (!a3) {
                    throw new IllegalArgumentException("Invalid start/end guards: error contents");
                }
            } else if (!a4) {
                if (a3 || a5) {
                    throw new IllegalArgumentException("Invalid start/end guards: error contents");
                }
                StringBuilder sb2 = new StringBuilder();
                char c3 = d;
                str = sb2.append(c3).append(str).append(c3).toString();
            } else if (!a5) {
                throw new IllegalArgumentException("Invalid start/end guards: error contents");
            }
        }
        int i2 = 20;
        for (int i3 = 1; i3 < str.length() - 1; i3++) {
            if (Character.isDigit(str.charAt(i3)) || str.charAt(i3) == '-' || str.charAt(i3) == '$') {
                i2 += 9;
            } else {
                if (!O.a(c, str.charAt(i3))) {
                    throw new IllegalArgumentException("Cannot encode : '" + str.charAt(i3) + '\'');
                }
                i2 += 10;
            }
        }
        boolean[] zArr = new boolean[i2 + (str.length() - 1)];
        int i4 = 0;
        for (int i5 = 0; i5 < str.length(); i5++) {
            char upperCase3 = Character.toUpperCase(str.charAt(i5));
            if (i5 == 0 || i5 == str.length() - 1) {
                if (upperCase3 == '*') {
                    upperCase3 = 'C';
                } else if (upperCase3 == 'E') {
                    upperCase3 = 'D';
                } else if (upperCase3 == 'N') {
                    upperCase3 = 'B';
                } else if (upperCase3 == 'T') {
                    upperCase3 = 'A';
                }
            }
            int i6 = 0;
            while (true) {
                char[] cArr3 = O.f10585a;
                if (i6 >= cArr3.length) {
                    i = 0;
                    break;
                }
                if (upperCase3 == cArr3[i6]) {
                    i = O.b[i6];
                    break;
                }
                i6++;
            }
            int i7 = 0;
            int i8 = 0;
            boolean z = true;
            while (i7 < 7) {
                zArr[i4] = z;
                i4++;
                if (((i >> (6 - i7)) & 1) == 0 || i8 == 1) {
                    z = !z;
                    i7++;
                    i8 = 0;
                } else {
                    i8++;
                }
            }
            if (i5 < str.length() - 1) {
                zArr[i4] = false;
                i4++;
            }
        }
        return zArr;
    }
}
