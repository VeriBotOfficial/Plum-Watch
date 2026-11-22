package com.anythink.basead.exoplayer.g.b;

import android.util.Log;
import com.anythink.basead.exoplayer.k.af;
import com.anythink.basead.exoplayer.k.s;
import com.reactnativecommunity.clipboard.ClipboardModule;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.apache.commons.codec.CharEncoding;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes11.dex */
public final class g implements com.anythink.basead.exoplayer.g.b {

    /* renamed from: a, reason: collision with root package name */
    public static final a f2497a = new a() { // from class: com.anythink.basead.exoplayer.g.b.g.1
        @Override // com.anythink.basead.exoplayer.g.b.g.a
        public final boolean a(int i2, int i3, int i4, int i5, int i6) {
            return false;
        }
    };
    public static final int b = af.f("ID3");
    public static final int c = 10;
    private static final String d = "Id3Decoder";
    private static final int e = 128;
    private static final int f = 64;
    private static final int g = 32;
    private static final int h = 8;
    private static final int i = 4;
    private static final int j = 64;
    private static final int k = 2;
    private static final int l = 1;
    private static final int m = 0;
    private static final int n = 1;
    private static final int o = 2;
    private static final int p = 3;

    /* renamed from: q, reason: collision with root package name */
    private final a f2498q;

    public interface a {
        boolean a(int i, int i2, int i3, int i4, int i5);
    }

    private static int b(int i2) {
        return (i2 == 0 || i2 == 3) ? 1 : 2;
    }

    public g() {
        this(null);
    }

    private g(a aVar) {
        this.f2498q = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x00a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a3  */
    @Override // com.anythink.basead.exoplayer.g.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.anythink.basead.exoplayer.g.a a(com.anythink.basead.exoplayer.g.e r14) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.exoplayer.g.b.g.a(com.anythink.basead.exoplayer.g.e):com.anythink.basead.exoplayer.g.a");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.anythink.basead.exoplayer.g.a a(byte[] r13, int r14) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.exoplayer.g.b.g.a(byte[], int):com.anythink.basead.exoplayer.g.a");
    }

    private static b a(s sVar) {
        if (sVar.a() < 10) {
            Log.w(d, "Data too short to be an ID3 tag");
            return null;
        }
        int g2 = sVar.g();
        if (g2 != b) {
            Log.w(d, "Unexpected first three bytes of ID3 tag header: ".concat(String.valueOf(g2)));
            return null;
        }
        int d2 = sVar.d();
        sVar.d(1);
        int d3 = sVar.d();
        int l2 = sVar.l();
        if (d2 == 2) {
            if ((d3 & 64) != 0) {
                Log.w(d, "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (d2 == 3) {
            if ((d3 & 64) != 0) {
                int i2 = sVar.i();
                sVar.d(i2);
                l2 -= i2 + 4;
            }
        } else {
            if (d2 != 4) {
                Log.w(d, "Skipped ID3 tag with unsupported majorVersion=".concat(String.valueOf(d2)));
                return null;
            }
            if ((d3 & 64) != 0) {
                int l3 = sVar.l();
                sVar.d(l3 - 4);
                l2 -= l3;
            }
            if ((d3 & 16) != 0) {
                l2 -= 10;
            }
        }
        return new b(d2, d2 < 4 && (d3 & 128) != 0, l2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
    
        if ((r10 & 1) != 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0079, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0086, code lost:
    
        if ((r10 & 128) != 0) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean a(com.anythink.basead.exoplayer.k.s r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.c()
        L8:
            int r3 = r1.a()     // Catch: java.lang.Throwable -> Laf
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lab
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L22
            int r7 = r1.i()     // Catch: java.lang.Throwable -> Laf
            long r8 = r1.h()     // Catch: java.lang.Throwable -> Laf
            int r10 = r1.e()     // Catch: java.lang.Throwable -> Laf
            goto L2c
        L22:
            int r7 = r1.g()     // Catch: java.lang.Throwable -> Laf
            int r8 = r1.g()     // Catch: java.lang.Throwable -> Laf
            long r8 = (long) r8
            r10 = r6
        L2c:
            r11 = 0
            if (r7 != 0) goto L3a
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3a
            if (r10 != 0) goto L3a
            r1.c(r2)
            return r4
        L3a:
            r7 = 4
            if (r0 != r7) goto L6b
            if (r21 != 0) goto L6b
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4b
            r1.c(r2)
            return r6
        L4b:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6b:
            if (r0 != r7) goto L7b
            r3 = r10 & 64
            if (r3 == 0) goto L73
            r3 = r4
            goto L74
        L73:
            r3 = r6
        L74:
            r7 = r10 & 1
            if (r7 == 0) goto L79
            goto L8b
        L79:
            r4 = r6
            goto L8b
        L7b:
            if (r0 != r3) goto L89
            r3 = r10 & 32
            if (r3 == 0) goto L83
            r3 = r4
            goto L84
        L83:
            r3 = r6
        L84:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L79
            goto L8b
        L89:
            r3 = r6
            r4 = r3
        L8b:
            if (r4 == 0) goto L8f
            int r3 = r3 + 4
        L8f:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L98
            r1.c(r2)
            return r6
        L98:
            int r3 = r1.a()     // Catch: java.lang.Throwable -> Laf
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La5
            r1.c(r2)
            return r6
        La5:
            int r3 = (int) r8
            r1.d(r3)     // Catch: java.lang.Throwable -> Laf
            goto L8
        Lab:
            r1.c(r2)
            return r4
        Laf:
            r0 = move-exception
            r1.c(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.exoplayer.g.b.g.a(com.anythink.basead.exoplayer.k.s, int, int, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:189:0x0283, code lost:
    
        if (r4 == 67) goto L146;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [com.anythink.basead.exoplayer.k.s] */
    /* JADX WARN: Type inference failed for: r1v13, types: [com.anythink.basead.exoplayer.k.s] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31, types: [com.anythink.basead.exoplayer.k.s] */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.anythink.basead.exoplayer.g.b.h a(int r22, com.anythink.basead.exoplayer.k.s r23, boolean r24, int r25, com.anythink.basead.exoplayer.g.b.g.a r26) {
        /*
            Method dump skipped, instructions count: 1050
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.exoplayer.g.b.g.a(int, com.anythink.basead.exoplayer.k.s, boolean, int, com.anythink.basead.exoplayer.g.b.g$a):com.anythink.basead.exoplayer.g.b.h");
    }

    private static k a(s sVar, int i2) {
        if (i2 <= 0) {
            return null;
        }
        int d2 = sVar.d();
        String a2 = a(d2);
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        sVar.a(bArr, 0, i3);
        int a3 = a(bArr, 0, d2);
        String str = new String(bArr, 0, a3, a2);
        int b2 = a3 + b(d2);
        return new k("TXXX", str, a(bArr, b2, a(bArr, b2, d2), a2));
    }

    private static k a(s sVar, int i2, String str) {
        if (i2 <= 0) {
            return null;
        }
        int d2 = sVar.d();
        String a2 = a(d2);
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        sVar.a(bArr, 0, i3);
        return new k(str, null, new String(bArr, 0, a(bArr, 0, d2), a2));
    }

    private static l b(s sVar, int i2) {
        if (i2 <= 0) {
            return null;
        }
        int d2 = sVar.d();
        String a2 = a(d2);
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        sVar.a(bArr, 0, i3);
        int a3 = a(bArr, 0, d2);
        String str = new String(bArr, 0, a3, a2);
        int b2 = a3 + b(d2);
        return new l("WXXX", str, a(bArr, b2, b(bArr, b2), "ISO-8859-1"));
    }

    private static l b(s sVar, int i2, String str) {
        byte[] bArr = new byte[i2];
        sVar.a(bArr, 0, i2);
        return new l(str, null, new String(bArr, 0, b(bArr, 0), "ISO-8859-1"));
    }

    private static j c(s sVar, int i2) {
        byte[] bArr = new byte[i2];
        sVar.a(bArr, 0, i2);
        int b2 = b(bArr, 0);
        return new j(new String(bArr, 0, b2, "ISO-8859-1"), b(bArr, b2 + 1, i2));
    }

    private static f d(s sVar, int i2) {
        int d2 = sVar.d();
        String a2 = a(d2);
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        sVar.a(bArr, 0, i3);
        int b2 = b(bArr, 0);
        String str = new String(bArr, 0, b2, "ISO-8859-1");
        int i4 = b2 + 1;
        int a3 = a(bArr, i4, d2);
        String a4 = a(bArr, i4, a3, a2);
        int b3 = a3 + b(d2);
        int a5 = a(bArr, b3, d2);
        return new f(str, a4, a(bArr, b3, a5, a2), b(bArr, a5 + b(d2), i3));
    }

    private static com.anythink.basead.exoplayer.g.b.a a(s sVar, int i2, int i3) {
        int b2;
        String concat;
        int d2 = sVar.d();
        String a2 = a(d2);
        int i4 = i2 - 1;
        byte[] bArr = new byte[i4];
        sVar.a(bArr, 0, i4);
        if (i3 == 2) {
            concat = "image/" + af.d(new String(bArr, 0, 3, "ISO-8859-1"));
            if (ClipboardModule.MIMETYPE_JPG.equals(concat)) {
                concat = "image/jpeg";
            }
            b2 = 2;
        } else {
            b2 = b(bArr, 0);
            String d3 = af.d(new String(bArr, 0, b2, "ISO-8859-1"));
            concat = d3.indexOf(47) == -1 ? "image/".concat(String.valueOf(d3)) : d3;
        }
        int i5 = bArr[b2 + 1] & 255;
        int i6 = b2 + 2;
        int a3 = a(bArr, i6, d2);
        return new com.anythink.basead.exoplayer.g.b.a(concat, new String(bArr, i6, a3 - i6, a2), i5, b(bArr, a3 + b(d2), i4));
    }

    private static e e(s sVar, int i2) {
        if (i2 < 4) {
            return null;
        }
        int d2 = sVar.d();
        String a2 = a(d2);
        byte[] bArr = new byte[3];
        sVar.a(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i3 = i2 - 4;
        byte[] bArr2 = new byte[i3];
        sVar.a(bArr2, 0, i3);
        int a3 = a(bArr2, 0, d2);
        String str2 = new String(bArr2, 0, a3, a2);
        int b2 = a3 + b(d2);
        return new e(str, str2, a(bArr2, b2, a(bArr2, b2, d2), a2));
    }

    private static c a(s sVar, int i2, int i3, boolean z, int i4, a aVar) {
        int c2 = sVar.c();
        int b2 = b(sVar.f2693a, c2);
        String str = new String(sVar.f2693a, c2, b2 - c2, "ISO-8859-1");
        sVar.c(b2 + 1);
        int i5 = sVar.i();
        int i6 = sVar.i();
        long h2 = sVar.h();
        if (h2 == BodyPartID.bodyIdMax) {
            h2 = -1;
        }
        long h3 = sVar.h();
        long j2 = h3 == BodyPartID.bodyIdMax ? -1L : h3;
        ArrayList arrayList = new ArrayList();
        int i7 = c2 + i2;
        while (sVar.c() < i7) {
            h a2 = a(i3, sVar, z, i4, aVar);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        h[] hVarArr = new h[arrayList.size()];
        arrayList.toArray(hVarArr);
        return new c(str, i5, i6, h2, j2, hVarArr);
    }

    private static d b(s sVar, int i2, int i3, boolean z, int i4, a aVar) {
        int c2 = sVar.c();
        int b2 = b(sVar.f2693a, c2);
        String str = new String(sVar.f2693a, c2, b2 - c2, "ISO-8859-1");
        sVar.c(b2 + 1);
        int d2 = sVar.d();
        boolean z2 = (d2 & 2) != 0;
        boolean z3 = (d2 & 1) != 0;
        int d3 = sVar.d();
        String[] strArr = new String[d3];
        for (int i5 = 0; i5 < d3; i5++) {
            int c3 = sVar.c();
            int b3 = b(sVar.f2693a, c3);
            strArr[i5] = new String(sVar.f2693a, c3, b3 - c3, "ISO-8859-1");
            sVar.c(b3 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i6 = c2 + i2;
        while (sVar.c() < i6) {
            h a2 = a(i3, sVar, z, i4, aVar);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        h[] hVarArr = new h[arrayList.size()];
        arrayList.toArray(hVarArr);
        return new d(str, z2, z3, strArr, hVarArr);
    }

    private static com.anythink.basead.exoplayer.g.b.b c(s sVar, int i2, String str) {
        byte[] bArr = new byte[i2];
        sVar.a(bArr, 0, i2);
        return new com.anythink.basead.exoplayer.g.b.b(str, bArr);
    }

    private static int f(s sVar, int i2) {
        byte[] bArr = sVar.f2693a;
        int c2 = sVar.c();
        while (true) {
            int i3 = c2 + 1;
            if (i3 >= i2) {
                return i2;
            }
            if ((bArr[c2] & 255) == 255 && bArr[i3] == 0) {
                System.arraycopy(bArr, c2 + 2, bArr, i3, (i2 - c2) - 2);
                i2--;
            }
            c2 = i3;
        }
    }

    private static String a(int i2) {
        if (i2 == 1) {
            return "UTF-16";
        }
        if (i2 == 2) {
            return CharEncoding.UTF_16BE;
        }
        if (i2 == 3) {
            return "UTF-8";
        }
        return "ISO-8859-1";
    }

    private static String a(int i2, int i3, int i4, int i5, int i6) {
        if (i2 == 2) {
            return String.format(Locale.US, "%c%c%c", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
        }
        return String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6));
    }

    private static int a(byte[] bArr, int i2, int i3) {
        int b2 = b(bArr, i2);
        if (i3 == 0 || i3 == 3) {
            return b2;
        }
        while (b2 < bArr.length - 1) {
            if (b2 % 2 == 0 && bArr[b2 + 1] == 0) {
                return b2;
            }
            b2 = b(bArr, b2 + 1);
        }
        return bArr.length;
    }

    private static int b(byte[] bArr, int i2) {
        while (i2 < bArr.length) {
            if (bArr[i2] == 0) {
                return i2;
            }
            i2++;
        }
        return bArr.length;
    }

    private static byte[] b(byte[] bArr, int i2, int i3) {
        if (i3 <= i2) {
            return new byte[0];
        }
        return Arrays.copyOfRange(bArr, i2, i3);
    }

    private static String a(byte[] bArr, int i2, int i3, String str) {
        if (i3 <= i2 || i3 > bArr.length) {
            return "";
        }
        return new String(bArr, i2, i3 - i2, str);
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f2499a;
        private final boolean b;
        private final int c;

        public b(int i, boolean z, int i2) {
            this.f2499a = i;
            this.b = z;
            this.c = i2;
        }
    }
}
