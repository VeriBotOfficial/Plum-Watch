package com.alipay.sdk.m.t;

import com.alipay.sdk.m.y.q;
import java.util.Locale;

/* loaded from: classes11.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1457a;
    public String b = q.a(24);

    public c(boolean z) {
        this.f1457a = z;
    }

    public static byte[] b(String str, byte[] bArr, String str2) {
        return com.alipay.sdk.m.p.e.b(str, bArr, str2);
    }

    public d a(b bVar, boolean z, String str) {
        if (bVar == null) {
            return null;
        }
        byte[] bytes = bVar.b().getBytes();
        byte[] bytes2 = bVar.a().getBytes();
        if (z) {
            try {
                bytes2 = com.alipay.sdk.m.p.b.a(bytes2);
            } catch (Exception unused) {
                z = false;
            }
        }
        return new d(z, this.f1457a ? a(bytes, a(this.b, com.alipay.sdk.m.n.a.g), b(this.b, bytes2, str)) : a(bytes, bytes2));
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.alipay.sdk.m.t.b a(com.alipay.sdk.m.t.d r6, java.lang.String r7) {
        /*
            r5 = this;
            r0 = 0
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
            byte[] r2 = r6.a()     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
            r2 = 5
            byte[] r3 = new byte[r2]     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            r1.read(r3)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            int r3 = a(r4)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            r1.read(r3)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            byte[] r2 = new byte[r2]     // Catch: java.lang.Exception -> L57 java.lang.Throwable -> L59
            r1.read(r2)     // Catch: java.lang.Exception -> L57 java.lang.Throwable -> L59
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Exception -> L57 java.lang.Throwable -> L59
            r3.<init>(r2)     // Catch: java.lang.Exception -> L57 java.lang.Throwable -> L59
            int r2 = a(r3)     // Catch: java.lang.Exception -> L57 java.lang.Throwable -> L59
            if (r2 <= 0) goto L52
            byte[] r2 = new byte[r2]     // Catch: java.lang.Exception -> L57 java.lang.Throwable -> L59
            r1.read(r2)     // Catch: java.lang.Exception -> L57 java.lang.Throwable -> L59
            boolean r3 = r5.f1457a     // Catch: java.lang.Exception -> L57 java.lang.Throwable -> L59
            if (r3 == 0) goto L42
            java.lang.String r3 = r5.b     // Catch: java.lang.Exception -> L57 java.lang.Throwable -> L59
            byte[] r2 = a(r3, r2, r7)     // Catch: java.lang.Exception -> L57 java.lang.Throwable -> L59
        L42:
            boolean r6 = r6.b()     // Catch: java.lang.Exception -> L57 java.lang.Throwable -> L59
            if (r6 == 0) goto L4c
            byte[] r2 = com.alipay.sdk.m.p.b.b(r2)     // Catch: java.lang.Exception -> L57 java.lang.Throwable -> L59
        L4c:
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Exception -> L57 java.lang.Throwable -> L59
            r6.<init>(r2)     // Catch: java.lang.Exception -> L57 java.lang.Throwable -> L59
            goto L53
        L52:
            r6 = r0
        L53:
            r1.close()     // Catch: java.lang.Exception -> L6c
            goto L6c
        L57:
            r6 = move-exception
            goto L63
        L59:
            r6 = move-exception
            goto L7a
        L5b:
            r6 = move-exception
            r4 = r0
            goto L63
        L5e:
            r6 = move-exception
            goto L79
        L60:
            r6 = move-exception
            r1 = r0
            r4 = r1
        L63:
            com.alipay.sdk.m.y.g.a(r6)     // Catch: java.lang.Throwable -> L77
            if (r1 == 0) goto L6b
            r1.close()     // Catch: java.lang.Exception -> L6b
        L6b:
            r6 = r0
        L6c:
            if (r4 != 0) goto L71
            if (r6 != 0) goto L71
            return r0
        L71:
            com.alipay.sdk.m.t.b r7 = new com.alipay.sdk.m.t.b
            r7.<init>(r4, r6)
            return r7
        L77:
            r6 = move-exception
            r0 = r1
        L79:
            r1 = r0
        L7a:
            if (r1 == 0) goto L7f
            r1.close()     // Catch: java.lang.Exception -> L7f
        L7f:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.m.t.c.a(com.alipay.sdk.m.t.d, java.lang.String):com.alipay.sdk.m.t.b");
    }

    public static byte[] a(String str, String str2) {
        return com.alipay.sdk.m.p.d.a(str, str2);
    }

    public static byte[] a(String str, byte[] bArr, String str2) {
        return com.alipay.sdk.m.p.e.a(str, bArr, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] a(byte[]... r7) {
        /*
            r0 = 0
            if (r7 == 0) goto L64
            int r1 = r7.length
            if (r1 != 0) goto L8
            goto L64
        L8:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L44
            r1.<init>()     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L44
            java.io.DataOutputStream r2 = new java.io.DataOutputStream     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            int r3 = r7.length     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            r4 = 0
        L14:
            if (r4 >= r3) goto L2a
            r5 = r7[r4]     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            int r6 = r5.length     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            java.lang.String r6 = a(r6)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            byte[] r6 = r6.getBytes()     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            r2.write(r6)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            r2.write(r5)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            int r4 = r4 + 1
            goto L14
        L2a:
            r2.flush()     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            byte[] r0 = r1.toByteArray()     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            r1.close()     // Catch: java.lang.Exception -> L34
        L34:
            r2.close()     // Catch: java.lang.Exception -> L54
            goto L54
        L38:
            r7 = move-exception
            goto L58
        L3a:
            r7 = move-exception
            goto L47
        L3c:
            r7 = move-exception
            goto L59
        L3e:
            r7 = move-exception
            r2 = r0
            goto L47
        L41:
            r7 = move-exception
            r2 = r0
            goto L57
        L44:
            r7 = move-exception
            r1 = r0
            r2 = r1
        L47:
            com.alipay.sdk.m.y.g.a(r7)     // Catch: java.lang.Throwable -> L55
            if (r1 == 0) goto L4f
            r1.close()     // Catch: java.lang.Exception -> L4f
        L4f:
            if (r2 == 0) goto L54
            r2.close()     // Catch: java.lang.Exception -> L54
        L54:
            return r0
        L55:
            r7 = move-exception
            r0 = r1
        L57:
            r1 = r0
        L58:
            r0 = r2
        L59:
            if (r1 == 0) goto L5e
            r1.close()     // Catch: java.lang.Exception -> L5e
        L5e:
            if (r0 == 0) goto L63
            r0.close()     // Catch: java.lang.Exception -> L63
        L63:
            throw r7
        L64:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.m.t.c.a(byte[][]):byte[]");
    }

    public static String a(int i) {
        return String.format(Locale.getDefault(), "%05d", Integer.valueOf(i));
    }

    public static int a(String str) {
        return Integer.parseInt(str);
    }
}
