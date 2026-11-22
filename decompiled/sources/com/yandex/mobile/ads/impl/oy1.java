package com.yandex.mobile.ads.impl;

import java.io.File;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
final class oy1 extends fn {
    private static final Pattern h = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
    private static final Pattern i = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
    private static final Pattern j = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);
    public static final /* synthetic */ int k = 0;

    private oy1(String str, long j2, long j3, long j4, File file) {
        super(str, j2, j3, j4, file);
    }

    public final oy1 a(File file, long j2) {
        if (this.e) {
            return new oy1(this.b, this.c, this.d, j2, file);
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0094, code lost:
    
        if (r14.renameTo(r3) == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.yandex.mobile.ads.impl.oy1 a(java.io.File r14, long r15, long r17, com.yandex.mobile.ads.impl.kn r19) {
        /*
            r0 = r19
            java.lang.String r1 = r14.getName()
            java.lang.String r2 = ".v3.exo"
            boolean r3 = r1.endsWith(r2)
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r3 != 0) goto La6
            java.lang.String r1 = r14.getName()
            java.util.regex.Pattern r3 = com.yandex.mobile.ads.impl.oy1.i
            java.util.regex.Matcher r3 = r3.matcher(r1)
            boolean r8 = r3.matches()
            if (r8 == 0) goto L2e
            java.lang.String r1 = r3.group(r6)
            r1.getClass()
            java.lang.String r1 = com.yandex.mobile.ads.impl.f92.f(r1)
            goto L43
        L2e:
            java.util.regex.Pattern r3 = com.yandex.mobile.ads.impl.oy1.h
            java.util.regex.Matcher r3 = r3.matcher(r1)
            boolean r1 = r3.matches()
            if (r1 == 0) goto L42
            java.lang.String r1 = r3.group(r6)
            r1.getClass()
            goto L43
        L42:
            r1 = r7
        L43:
            if (r1 != 0) goto L46
            goto L96
        L46:
            java.io.File r8 = r14.getParentFile()
            if (r8 == 0) goto La0
            com.yandex.mobile.ads.impl.jn r1 = r0.c(r1)
            int r1 = r1.f15931a
            java.lang.String r9 = r3.group(r5)
            r9.getClass()
            long r9 = java.lang.Long.parseLong(r9)
            java.lang.String r3 = r3.group(r4)
            r3.getClass()
            long r11 = java.lang.Long.parseLong(r3)
            java.io.File r3 = new java.io.File
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.StringBuilder r1 = r13.append(r1)
            java.lang.String r13 = "."
            java.lang.StringBuilder r1 = r1.append(r13)
            java.lang.StringBuilder r1 = r1.append(r9)
            java.lang.StringBuilder r1 = r1.append(r13)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r3.<init>(r8, r1)
            boolean r1 = r14.renameTo(r3)
            if (r1 != 0) goto L97
        L96:
            r3 = r7
        L97:
            if (r3 != 0) goto L9a
            return r7
        L9a:
            java.lang.String r1 = r3.getName()
            r9 = r3
            goto La7
        La0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        La6:
            r9 = r14
        La7:
            java.util.regex.Pattern r2 = com.yandex.mobile.ads.impl.oy1.j
            java.util.regex.Matcher r1 = r2.matcher(r1)
            boolean r2 = r1.matches()
            if (r2 != 0) goto Lb4
            return r7
        Lb4:
            java.lang.String r2 = r1.group(r6)
            r2.getClass()
            int r2 = java.lang.Integer.parseInt(r2)
            java.lang.String r2 = r0.a(r2)
            if (r2 != 0) goto Lc6
            return r7
        Lc6:
            r10 = -1
            int r0 = (r15 > r10 ? 1 : (r15 == r10 ? 0 : -1))
            if (r0 != 0) goto Ld1
            long r10 = r9.length()
            goto Ld2
        Ld1:
            r10 = r15
        Ld2:
            r12 = 0
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 != 0) goto Ld9
            return r7
        Ld9:
            java.lang.String r0 = r1.group(r5)
            r0.getClass()
            long r5 = java.lang.Long.parseLong(r0)
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r17 > r7 ? 1 : (r17 == r7 ? 0 : -1))
            if (r0 != 0) goto Lfa
            java.lang.String r0 = r1.group(r4)
            r0.getClass()
            long r0 = java.lang.Long.parseLong(r0)
            r7 = r0
            goto Lfc
        Lfa:
            r7 = r17
        Lfc:
            com.yandex.mobile.ads.impl.oy1 r1 = new com.yandex.mobile.ads.impl.oy1
            r3 = r5
            r5 = r10
            r1.<init>(r2, r3, r5, r7, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.oy1.a(java.io.File, long, long, com.yandex.mobile.ads.impl.kn):com.yandex.mobile.ads.impl.oy1");
    }

    public static oy1 a(String str, long j2) {
        return new oy1(str, j2, -1L, -9223372036854775807L, null);
    }

    public static oy1 a(String str, long j2, long j3) {
        return new oy1(str, j2, j3, -9223372036854775807L, null);
    }
}
