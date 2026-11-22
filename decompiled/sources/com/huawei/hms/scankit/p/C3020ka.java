package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.C2967a;
import com.huawei.hms.scankit.aiscan.common.C2971e;
import com.huawei.hms.scankit.aiscan.common.EnumC2969c;
import com.huawei.hms.scankit.aiscan.common.EnumC2970d;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Map;

/* compiled from: DecodedBitStreamParser.java */
/* renamed from: com.huawei.hms.scankit.p.ka, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C3020ka {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f10660a = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();
    private static final char[] b = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();
    private static final BigInteger[] c;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DecodedBitStreamParser.java */
    /* renamed from: com.huawei.hms.scankit.p.ka$a */
    enum a {
        ALPHA,
        LOWER,
        MIXED,
        PUNCT,
        ALPHA_SHIFT,
        PUNCT_SHIFT
    }

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        c = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger valueOf = BigInteger.valueOf(900L);
        bigIntegerArr[1] = valueOf;
        int i = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = c;
            if (i >= bigIntegerArr2.length) {
                return;
            }
            bigIntegerArr2[i] = bigIntegerArr2[i - 1].multiply(valueOf);
            i++;
        }
    }

    static C2971e a(int[] iArr, String str, Map<EnumC2970d, ?> map) throws C2967a {
        int i;
        int[] iArr2;
        int a2;
        StringBuilder sb = new StringBuilder(iArr.length * 2);
        Charset charset = StandardCharsets.ISO_8859_1;
        int i2 = iArr[1];
        C3067wa c3067wa = new C3067wa();
        Charset charset2 = charset;
        int i3 = i2;
        int i4 = 2;
        while (true) {
            int i5 = iArr[0];
            if (i4 > i5 || (i4 == i5 && sb.length() > 0)) {
                break;
            }
            if (i3 == 927) {
                a2 = i4 + 1;
                charset2 = Charset.forName(EnumC2969c.a(iArr[i4]).name());
                iArr2 = iArr;
            } else {
                iArr2 = iArr;
                a2 = a(sb, i3, iArr2, i4, charset2, c3067wa);
            }
            if (a2 >= iArr2.length) {
                throw C2967a.a();
            }
            i4 = a2 + 1;
            i3 = iArr2[a2];
            iArr = iArr2;
        }
        if (sb.length() == 0) {
            throw C2967a.a();
        }
        if (charset2 != StandardCharsets.ISO_8859_1) {
            C2971e c2971e = new C2971e(null, sb.toString(), null, str);
            c2971e.a(c3067wa);
            return c2971e;
        }
        int length = sb.length();
        byte[] bArr = new byte[length];
        for (i = 0; i < length; i++) {
            bArr[i] = (byte) sb.charAt(i);
        }
        try {
            C2971e c2971e2 = new C2971e(null, new String(bArr, com.huawei.hms.scankit.aiscan.common.B.a(bArr, map)), null, str);
            c2971e2.a(c3067wa);
            return c2971e2;
        } catch (UnsupportedEncodingException unused) {
            throw C2967a.a();
        }
    }

    private static boolean a(int i) {
        return i == 901 || i == 924 || i == 902 || i == 928 || i == 923 || i == 922;
    }

    private static int b(int[] iArr, int i, StringBuilder sb) throws C2967a {
        int i2 = iArr[0];
        int[] iArr2 = new int[(i2 - i) * 2];
        int[] iArr3 = new int[(i2 - i) * 2];
        boolean z = false;
        int i3 = 0;
        while (i < iArr[0] && !z) {
            int i4 = i + 1;
            int i5 = iArr[i];
            if (i5 < 900) {
                iArr2[i3] = i5 / 30;
                iArr2[i3 + 1] = i5 % 30;
                i3 += 2;
            } else if (i5 == 900) {
                iArr2[i3] = 900;
                i3++;
            } else if (i5 == 913) {
                iArr2[i3] = 913;
                i += 2;
                iArr3[i3] = iArr[i4];
                i3++;
            } else {
                if (!a(i5)) {
                    throw C2967a.a();
                }
                z = true;
            }
            i = i4;
        }
        a(iArr2, iArr3, i3, sb);
        return i;
    }

    private static a[] c(StringBuilder sb, int[] iArr, a aVar, a aVar2, int[] iArr2) throws C2967a {
        a aVar3;
        int i = iArr2[1];
        if (i < 26) {
            iArr2[2] = (char) (i + 97);
        } else if (i == 900) {
            aVar = a.ALPHA;
        } else if (i != 913) {
            switch (i) {
                case 26:
                    iArr2[2] = 32;
                    break;
                case 27:
                    aVar3 = a.ALPHA_SHIFT;
                    aVar2 = aVar;
                    aVar = aVar3;
                    break;
                case 28:
                    aVar = a.MIXED;
                    break;
                case 29:
                    aVar3 = a.PUNCT_SHIFT;
                    aVar2 = aVar;
                    aVar = aVar3;
                    break;
                default:
                    throw C2967a.a();
            }
        } else {
            sb.append((char) iArr[iArr2[0]]);
        }
        return new a[]{aVar, aVar2};
    }

    private static a[] d(StringBuilder sb, int[] iArr, a aVar, a aVar2, int[] iArr2) throws C2967a {
        int i = iArr2[1];
        if (i < 25) {
            iArr2[2] = b[i];
        } else {
            if (i != 900) {
                if (i != 913) {
                    switch (i) {
                        case 25:
                            aVar = a.PUNCT;
                            break;
                        case 26:
                            iArr2[2] = 32;
                            break;
                        case 27:
                            aVar = a.LOWER;
                            break;
                        case 28:
                            break;
                        case 29:
                            aVar2 = aVar;
                            aVar = a.PUNCT_SHIFT;
                            break;
                        default:
                            throw C2967a.a();
                    }
                } else {
                    sb.append((char) iArr[iArr2[0]]);
                }
            }
            aVar = a.ALPHA;
        }
        return new a[]{aVar, aVar2};
    }

    private static a[] e(StringBuilder sb, int[] iArr, a aVar, a aVar2, int[] iArr2) throws C2967a {
        int i = iArr2[1];
        if (i < 29) {
            iArr2[2] = f10660a[i];
        } else if (i == 29 || i == 900) {
            aVar = a.ALPHA;
        } else {
            if (i != 913) {
                throw C2967a.a();
            }
            sb.append((char) iArr[iArr2[0]]);
        }
        return new a[]{aVar, aVar2};
    }

    private static a[] f(StringBuilder sb, int[] iArr, a aVar, a aVar2, int[] iArr2) throws C2967a {
        a aVar3;
        int i = iArr2[1];
        if (i < 29) {
            iArr2[2] = f10660a[i];
        } else {
            if (i == 29 || i == 900) {
                aVar3 = a.ALPHA;
                return new a[]{aVar3, aVar2};
            }
            if (i != 913) {
                throw C2967a.a();
            }
            sb.append((char) iArr[iArr2[0]]);
        }
        aVar3 = aVar2;
        return new a[]{aVar3, aVar2};
    }

    private static a[] b(StringBuilder sb, int[] iArr, a aVar, a aVar2, int[] iArr2) throws C2967a {
        a aVar3;
        int i = iArr2[1];
        if (i < 26) {
            iArr2[2] = (char) (i + 65);
        } else {
            if (i != 26) {
                if (i == 900) {
                    aVar3 = a.ALPHA;
                    return new a[]{aVar3, aVar2};
                }
                throw C2967a.a();
            }
            iArr2[2] = 32;
        }
        aVar3 = aVar2;
        return new a[]{aVar3, aVar2};
    }

    private static int a(StringBuilder sb, int i, int[] iArr, int i2, Charset charset, C3067wa c3067wa) throws C2967a {
        if (i == 913) {
            int i3 = i2 + 1;
            sb.append((char) iArr[i2]);
            return i3;
        }
        if (i != 928) {
            switch (i) {
                case 900:
                    return b(iArr, i2, sb);
                case 901:
                    break;
                case 902:
                    return a(iArr, i2, sb);
                default:
                    switch (i) {
                        case 922:
                        case 923:
                            throw C2967a.a();
                        case 924:
                            break;
                        case 925:
                            return i2 + 1;
                        case 926:
                            return i2 + 2;
                        default:
                            return b(iArr, i2 - 1, sb);
                    }
            }
            return a(i, iArr, charset, i2, sb);
        }
        return a(iArr, i2, c3067wa);
    }

    static int a(int[] iArr, int i, C3067wa c3067wa) throws C2967a {
        int i2 = 0;
        if (i + 2 <= iArr[0]) {
            int[] iArr2 = new int[2];
            while (i2 < 2) {
                iArr2[i2] = iArr[i];
                i2++;
                i++;
            }
            try {
                c3067wa.c(Integer.parseInt(a(iArr2, 2)));
                StringBuilder sb = new StringBuilder();
                int b2 = b(iArr, i, sb);
                c3067wa.b(sb.toString());
                int i3 = iArr[b2] == 923 ? b2 + 1 : -1;
                a(b2, iArr, c3067wa);
                if (i3 != -1) {
                    int i4 = b2 - i3;
                    if (c3067wa.a()) {
                        i4--;
                    }
                    c3067wa.a(Arrays.copyOfRange(iArr, i3, i4 + i3));
                }
                return b2;
            } catch (Exception unused) {
                throw C2967a.a();
            }
        }
        throw C2967a.a();
    }

    private static void a(int i, int[] iArr, C3067wa c3067wa) throws C2967a {
        while (i < iArr[0]) {
            int i2 = iArr[i];
            if (i2 == 923) {
                int i3 = iArr[i + 1];
                if (i3 == 0) {
                    StringBuilder sb = new StringBuilder();
                    i = b(iArr, i + 2, sb);
                    c3067wa.c(sb.toString());
                } else if (i3 == 3) {
                    StringBuilder sb2 = new StringBuilder();
                    i = b(iArr, i + 2, sb2);
                    c3067wa.d(sb2.toString());
                } else if (i3 == 4) {
                    StringBuilder sb3 = new StringBuilder();
                    i = b(iArr, i + 2, sb3);
                    c3067wa.a(sb3.toString());
                } else if (i3 == 1) {
                    StringBuilder sb4 = new StringBuilder();
                    i = a(iArr, i + 2, sb4);
                    c3067wa.b(Integer.parseInt(sb4.toString()));
                } else if (i3 == 2) {
                    StringBuilder sb5 = new StringBuilder();
                    i = a(iArr, i + 2, sb5);
                    c3067wa.b(Long.parseLong(sb5.toString()));
                } else if (i3 == 6) {
                    StringBuilder sb6 = new StringBuilder();
                    i = a(iArr, i + 2, sb6);
                    c3067wa.a(Integer.parseInt(sb6.toString()));
                } else if (i3 == 5) {
                    StringBuilder sb7 = new StringBuilder();
                    i = a(iArr, i + 2, sb7);
                    c3067wa.a(Long.parseLong(sb7.toString()));
                } else {
                    throw C2967a.a();
                }
            } else if (i2 == 922) {
                i++;
                c3067wa.a(true);
            } else {
                throw C2967a.a();
            }
        }
    }

    private static void a(int[] iArr, int[] iArr2, int i, StringBuilder sb) throws C2967a {
        a aVar = a.ALPHA;
        a aVar2 = aVar;
        int i2 = 0;
        while (i2 < i) {
            int[] iArr3 = {i2, iArr[i2], 0};
            a[] aVarArr = {aVar, aVar2};
            switch (C3016ja.f10656a[aVar.ordinal()]) {
                case 1:
                    aVarArr = a(sb, iArr2, aVar, aVar2, iArr3);
                    break;
                case 2:
                    aVarArr = c(sb, iArr2, aVar, aVar2, iArr3);
                    break;
                case 3:
                    aVarArr = d(sb, iArr2, aVar, aVar2, iArr3);
                    break;
                case 4:
                    aVarArr = e(sb, iArr2, aVar, aVar2, iArr3);
                    break;
                case 5:
                    aVarArr = b(sb, iArr2, aVar, aVar2, iArr3);
                    break;
                case 6:
                    aVarArr = f(sb, iArr2, aVar, aVar2, iArr3);
                    break;
            }
            aVar = aVarArr[0];
            aVar2 = aVarArr[1];
            int i3 = iArr3[0];
            int i4 = iArr3[1];
            char c2 = (char) iArr3[2];
            if (c2 != 0) {
                sb.append(c2);
            }
            i2 = i3 + 1;
        }
    }

    private static a[] a(StringBuilder sb, int[] iArr, a aVar, a aVar2, int[] iArr2) throws C2967a {
        int i = iArr2[1];
        if (i < 26) {
            iArr2[2] = (char) (i + 65);
        } else if (i == 900) {
            aVar = a.ALPHA;
        } else if (i != 913) {
            switch (i) {
                case 26:
                    iArr2[2] = 32;
                    break;
                case 27:
                    aVar = a.LOWER;
                    break;
                case 28:
                    aVar = a.MIXED;
                    break;
                case 29:
                    aVar2 = aVar;
                    aVar = a.PUNCT_SHIFT;
                    break;
                default:
                    throw C2967a.a();
            }
        } else {
            sb.append((char) iArr[iArr2[0]]);
        }
        return new a[]{aVar, aVar2};
    }

    private static int a(int i, int[] iArr, Charset charset, int i2, StringBuilder sb) throws C2967a {
        int a2;
        int i3;
        int i4;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i5 = 0;
        long j = 0;
        boolean z = false;
        if (i == 901) {
            int[] iArr2 = new int[6];
            int i6 = i2 + 1;
            int i7 = iArr[i2];
            while (true) {
                i4 = iArr[0];
                if (i6 < i4 && !z) {
                    int i8 = i5 + 1;
                    iArr2[i5] = i7;
                    j = (j * 900) + i7;
                    int i9 = i6 + 1;
                    i7 = iArr[i6];
                    if (i7 != 928) {
                        switch (i7) {
                            case 900:
                            case 901:
                            case 902:
                                break;
                            default:
                                switch (i7) {
                                    case 922:
                                    case 923:
                                    case 924:
                                        break;
                                    default:
                                        if (i8 % 5 != 0 || i8 <= 0) {
                                            i6 = i9;
                                            i5 = i8;
                                            break;
                                        } else {
                                            for (int i10 = 0; i10 < 6; i10++) {
                                                byteArrayOutputStream.write((byte) (j >> ((5 - i10) * 8)));
                                            }
                                            j = 0;
                                            i6 = i9;
                                            i5 = 0;
                                            break;
                                        }
                                        break;
                                }
                        }
                    }
                    z = true;
                    i5 = i8;
                }
            }
            if (i6 == i4 && i7 < 900) {
                iArr2[i5] = i7;
                i5++;
            }
            for (i3 = 0; i3 < i5; i3++) {
                byteArrayOutputStream.write((byte) iArr2[i3]);
            }
            a2 = i6;
        } else {
            a2 = i == 924 ? a(i2, iArr, false, 0, 0L, byteArrayOutputStream) : i2;
        }
        sb.append(new String(byteArrayOutputStream.toByteArray(), charset));
        return a2;
    }

    private static int a(int i, int[] iArr, boolean z, int i2, long j, ByteArrayOutputStream byteArrayOutputStream) throws C2967a {
        while (i < iArr[0] && !z) {
            int i3 = i + 1;
            int i4 = iArr[i];
            if (i4 < 900) {
                i2++;
                j = (j * 900) + i4;
                i = i3;
            } else {
                if (i4 != 928) {
                    switch (i4) {
                        default:
                            switch (i4) {
                                case 922:
                                case 923:
                                case 924:
                                    break;
                                default:
                                    throw C2967a.a();
                            }
                        case 900:
                        case 901:
                        case 902:
                            z = true;
                            break;
                    }
                }
                z = true;
            }
            if (i2 % 5 == 0 && i2 > 0) {
                for (int i5 = 0; i5 < 6; i5++) {
                    byteArrayOutputStream.write((byte) (j >> ((5 - i5) * 8)));
                }
                j = 0;
                i2 = 0;
            }
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
    
        r10.append(a(r0, r3));
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0047, code lost:
    
        return r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int a(int[] r8, int r9, java.lang.StringBuilder r10) throws com.huawei.hms.scankit.aiscan.common.C2967a {
        /*
            r0 = 15
            int[] r0 = new int[r0]
            r1 = 0
            r2 = r1
            r3 = r2
        L7:
            r4 = r8[r1]
            if (r9 >= r4) goto L47
            if (r2 != 0) goto L47
            int r5 = r9 + 1
            r6 = r8[r9]
            r7 = 1
            if (r5 != r4) goto L15
            r2 = r7
        L15:
            r4 = 900(0x384, float:1.261E-42)
            if (r6 >= r4) goto L1f
            r0[r3] = r6
            int r3 = r3 + 1
            r9 = r5
            goto L32
        L1f:
            if (r6 == r4) goto L31
            r2 = 901(0x385, float:1.263E-42)
            if (r6 == r2) goto L31
            r2 = 928(0x3a0, float:1.3E-42)
            if (r6 == r2) goto L31
            switch(r6) {
                case 922: goto L31;
                case 923: goto L31;
                case 924: goto L31;
                default: goto L2c;
            }
        L2c:
            com.huawei.hms.scankit.aiscan.common.a r8 = com.huawei.hms.scankit.aiscan.common.C2967a.a()
            throw r8
        L31:
            r2 = r7
        L32:
            int r4 = r3 % 15
            if (r4 == 0) goto L3c
            r4 = 902(0x386, float:1.264E-42)
            if (r6 == r4) goto L3c
            if (r2 == 0) goto L7
        L3c:
            if (r3 <= 0) goto L7
            java.lang.String r3 = a(r0, r3)
            r10.append(r3)
            r3 = r1
            goto L7
        L47:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.p.C3020ka.a(int[], int, java.lang.StringBuilder):int");
    }

    private static String a(int[] iArr, int i) throws C2967a {
        BigInteger bigInteger = BigInteger.ZERO;
        for (int i2 = 0; i2 < i; i2++) {
            bigInteger = bigInteger.add(c[(i - i2) - 1].multiply(BigInteger.valueOf(iArr[i2])));
        }
        String bigInteger2 = bigInteger.toString();
        if (bigInteger2.charAt(0) == '1') {
            return bigInteger2.substring(1);
        }
        throw C2967a.a();
    }
}
