package com.anythink.core.a;

import android.text.TextUtils;
import android.util.Pair;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.e.a;
import com.anythink.core.common.h.bv;
import com.anythink.core.common.h.f;
import com.anythink.core.common.h.k;
import com.anythink.core.common.h.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes11.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f3491a = "AdSourceFltRuleHandler";
    private final com.anythink.core.common.e.a b;
    private final Map<String, Long> c = new ConcurrentHashMap();
    private final Map<String, Pair<Integer, Long>> e = new ConcurrentHashMap();
    private final Set<String> d = new CopyOnWriteArraySet();

    public e(com.anythink.core.common.e.a aVar) {
        this.b = aVar;
    }

    public final void a(bv bvVar) {
        try {
            l bv = bvVar.bv();
            int a2 = bv.a();
            if (a2 != 3) {
                new Object[]{Integer.valueOf(a2)};
                return;
            }
            String z = bvVar.z();
            if (TextUtils.isEmpty(z)) {
                return;
            }
            f a3 = a("3", z, a2);
            int i = 1;
            boolean z2 = a3 != null;
            long currentTimeMillis = System.currentTimeMillis();
            if (z2) {
                long i2 = a3.i();
                if (currentTimeMillis < bv.d() + i2) {
                    i = 1 + a3.f3912a;
                    currentTimeMillis = i2;
                }
            } else {
                a3 = new f("3");
                a3.a(z);
                a3.a(a2);
            }
            a3.a(currentTimeMillis);
            a3.f3912a = i;
            this.e.put(z, new Pair<>(Integer.valueOf(i), Long.valueOf(currentTimeMillis)));
            new Object[]{z, Integer.valueOf(i), Boolean.valueOf(z2)};
            this.b.a(a3, z2);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r3.longValue() > java.lang.System.currentTimeMillis()) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.anythink.core.common.h.k b(com.anythink.core.common.h.bv r11) {
        /*
            r10 = this;
            r0 = 0
            java.lang.String r1 = r11.z()     // Catch: java.lang.Throwable -> L81
            com.anythink.core.common.h.l r11 = r11.bv()     // Catch: java.lang.Throwable -> L81
            int r2 = r11.a()     // Catch: java.lang.Throwable -> L81
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L81
            if (r3 == 0) goto L14
            return r0
        L14:
            java.util.Map<java.lang.String, java.lang.Long> r3 = r10.c     // Catch: java.lang.Throwable -> L81
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L81
            java.lang.Long r3 = (java.lang.Long) r3     // Catch: java.lang.Throwable -> L81
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L2e
            long r6 = r3.longValue()     // Catch: java.lang.Throwable -> L81
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L81
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 <= 0) goto L43
        L2c:
            r5 = r4
            goto L43
        L2e:
            java.lang.String r3 = "4"
            com.anythink.core.common.h.f r3 = r10.a(r3, r1, r2)     // Catch: java.lang.Throwable -> L81
            if (r3 == 0) goto L43
            long r6 = r3.n()     // Catch: java.lang.Throwable -> L81
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L81
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 <= 0) goto L43
            goto L2c
        L43:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L81
            new java.lang.Object[]{r1, r3, r11}     // Catch: java.lang.Throwable -> L81
            if (r5 == 0) goto L81
            java.lang.String r11 = ""
            if (r2 == r4) goto L73
            r1 = 2
            if (r2 == r1) goto L65
            r1 = 3
            if (r2 == r1) goto L57
            return r0
        L57:
            com.anythink.core.common.h.k r1 = new com.anythink.core.common.h.k     // Catch: java.lang.Throwable -> L81
            java.lang.String r2 = "2038"
            com.anythink.core.api.AdError r11 = com.anythink.core.api.ErrorCode.getErrorCode(r2, r11, r11)     // Catch: java.lang.Throwable -> L81
            r2 = 34
            r1.<init>(r2, r11)     // Catch: java.lang.Throwable -> L81
            return r1
        L65:
            com.anythink.core.common.h.k r1 = new com.anythink.core.common.h.k     // Catch: java.lang.Throwable -> L81
            java.lang.String r2 = "2037"
            com.anythink.core.api.AdError r11 = com.anythink.core.api.ErrorCode.getErrorCode(r2, r11, r11)     // Catch: java.lang.Throwable -> L81
            r2 = 33
            r1.<init>(r2, r11)     // Catch: java.lang.Throwable -> L81
            return r1
        L73:
            com.anythink.core.common.h.k r1 = new com.anythink.core.common.h.k     // Catch: java.lang.Throwable -> L81
            java.lang.String r2 = "2036"
            com.anythink.core.api.AdError r11 = com.anythink.core.api.ErrorCode.getErrorCode(r2, r11, r11)     // Catch: java.lang.Throwable -> L81
            r2 = 32
            r1.<init>(r2, r11)     // Catch: java.lang.Throwable -> L81
            return r1
        L81:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.a.e.b(com.anythink.core.common.h.bv):com.anythink.core.common.h.k");
    }

    public final void c(bv bvVar) {
        try {
            l bv = bvVar.bv();
            if (bv == null) {
                return;
            }
            int a2 = bv.a();
            String z = bvVar.z();
            if (a2 != 1) {
                new Object[]{Integer.valueOf(a2)};
                return;
            }
            if (TextUtils.isEmpty(z)) {
                return;
            }
            new Object[]{z, bv};
            List<Pair<String, String>> b = b("4", z, a2);
            if (this.d.contains(z)) {
                new Object[]{z};
                return;
            }
            this.d.add(z);
            this.c.remove(z);
            this.b.a(b);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c2 A[Catch: all -> 0x01a6, TryCatch #0 {all -> 0x01a6, blocks: (B:3:0x0006, B:8:0x001e, B:10:0x002f, B:14:0x0043, B:15:0x0061, B:16:0x0091, B:18:0x0097, B:21:0x00a9, B:36:0x00c2, B:44:0x0158, B:45:0x0167, B:47:0x0184, B:50:0x018d, B:51:0x0194, B:54:0x00e1, B:56:0x00eb, B:59:0x00fc, B:61:0x0100, B:64:0x0107, B:66:0x0110, B:67:0x0150, B:68:0x0115, B:69:0x0121, B:71:0x012b, B:72:0x013b, B:74:0x0141, B:75:0x0146, B:77:0x014c, B:78:0x016f, B:80:0x00b5), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0184 A[Catch: all -> 0x01a6, TryCatch #0 {all -> 0x01a6, blocks: (B:3:0x0006, B:8:0x001e, B:10:0x002f, B:14:0x0043, B:15:0x0061, B:16:0x0091, B:18:0x0097, B:21:0x00a9, B:36:0x00c2, B:44:0x0158, B:45:0x0167, B:47:0x0184, B:50:0x018d, B:51:0x0194, B:54:0x00e1, B:56:0x00eb, B:59:0x00fc, B:61:0x0100, B:64:0x0107, B:66:0x0110, B:67:0x0150, B:68:0x0115, B:69:0x0121, B:71:0x012b, B:72:0x013b, B:74:0x0141, B:75:0x0146, B:77:0x014c, B:78:0x016f, B:80:0x00b5), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016f A[Catch: all -> 0x01a6, TryCatch #0 {all -> 0x01a6, blocks: (B:3:0x0006, B:8:0x001e, B:10:0x002f, B:14:0x0043, B:15:0x0061, B:16:0x0091, B:18:0x0097, B:21:0x00a9, B:36:0x00c2, B:44:0x0158, B:45:0x0167, B:47:0x0184, B:50:0x018d, B:51:0x0194, B:54:0x00e1, B:56:0x00eb, B:59:0x00fc, B:61:0x0100, B:64:0x0107, B:66:0x0110, B:67:0x0150, B:68:0x0115, B:69:0x0121, B:71:0x012b, B:72:0x013b, B:74:0x0141, B:75:0x0146, B:77:0x014c, B:78:0x016f, B:80:0x00b5), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(com.anythink.core.common.h.bv r23) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.a.e.d(com.anythink.core.common.h.bv):void");
    }

    private static f a(l lVar, f fVar, f fVar2) {
        long f;
        long j;
        String e = fVar2.e();
        int i = 1;
        int m = fVar2.m() + 1;
        long i2 = fVar2.i();
        long currentTimeMillis = System.currentTimeMillis();
        int a2 = lVar.a();
        if (a2 == 1) {
            if (m >= lVar.b()) {
                f = lVar.f();
                j = currentTimeMillis + f;
                i = m;
            }
            i = m;
            j = 0;
        } else if (a2 != 2) {
            if (a2 == 3) {
                if (currentTimeMillis >= i2 + lVar.d()) {
                    fVar2.a(currentTimeMillis);
                    new Object[]{e, 1, Integer.valueOf(a2)};
                    j = 0;
                } else {
                    int i3 = fVar != null ? fVar.f3912a : 0;
                    if (i3 <= 0 || i3 < lVar.g()) {
                        new Object[]{e, Integer.valueOf(i3), Integer.valueOf(a2)};
                    } else if ((m * 100) / i3 >= lVar.e()) {
                        f = lVar.f();
                        j = currentTimeMillis + f;
                        i = m;
                    }
                }
            }
            i = m;
            j = 0;
        } else if (currentTimeMillis >= i2 + lVar.d()) {
            fVar2.a(currentTimeMillis);
            new Object[]{e, 1, Integer.valueOf(a2)};
            j = 0;
        } else {
            if (m >= lVar.c()) {
                f = lVar.f();
                j = currentTimeMillis + f;
                i = m;
            }
            i = m;
            j = 0;
        }
        if (j > 0) {
            new Object[]{e, Integer.valueOf(lVar.a()), Long.valueOf(j)};
        }
        fVar2.b(j);
        fVar2.b(i);
        return fVar2;
    }

    private static k a(int i) {
        if (i == 1) {
            return new k(32, ErrorCode.getErrorCode(ErrorCode.noFillNcError, "", ""));
        }
        if (i == 2) {
            return new k(33, ErrorCode.getErrorCode(ErrorCode.noFillSError, "", ""));
        }
        if (i != 3) {
            return null;
        }
        return new k(34, ErrorCode.getErrorCode(ErrorCode.noFillSrError, "", ""));
    }

    private static String a(String str) {
        return a(str, "=");
    }

    private static String a(String str, String str2) {
        return String.format("%s %s ?", str, str2);
    }

    private f a(String str, String str2, int i) {
        List<f> a2 = this.b.a(b(str, str2, i), 1);
        if (a2.isEmpty()) {
            return null;
        }
        return a2.get(0);
    }

    private List<f> a(String str, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair(a(a.C0193a.h, "="), str));
        arrayList.add(new Pair(a(a.C0193a.o, "="), String.valueOf(i)));
        return this.b.a(arrayList, 2);
    }

    private static List<Pair<String, String>> b(String str, String str2, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair(a(a.C0193a.b, "="), str));
        arrayList.add(new Pair(a(a.C0193a.h, "="), str2));
        arrayList.add(new Pair(a(a.C0193a.o, "="), String.valueOf(i)));
        return arrayList;
    }
}
