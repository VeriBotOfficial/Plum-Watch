package com.anythink.core.common.n.b.a.c;

import com.anythink.core.common.n.b.ad;
import com.anythink.core.common.n.b.af;
import com.anythink.core.common.n.b.m;
import com.anythink.core.common.n.b.n;
import com.anythink.core.common.n.b.u;
import com.anythink.core.common.n.b.v;
import com.google.common.net.HttpHeaders;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/* loaded from: classes12.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final com.anythink.core.common.n.c.f f4089a = com.anythink.core.common.n.c.f.a("\"\\");
    private static final com.anythink.core.common.n.c.f b = com.anythink.core.common.n.c.f.a("\t ,=");

    private e() {
    }

    public static long a(af afVar) {
        return a(afVar.f().a("Content-Length"));
    }

    private static long a(u uVar) {
        return a(uVar.a("Content-Length"));
    }

    private static long a(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static boolean b(af afVar) {
        return c(afVar.f()).contains("*");
    }

    private static boolean b(u uVar) {
        return c(uVar).contains("*");
    }

    private static Set<String> e(af afVar) {
        return c(afVar.f());
    }

    private static Set<String> c(u uVar) {
        Set<String> emptySet = Collections.emptySet();
        int a2 = uVar.a();
        for (int i = 0; i < a2; i++) {
            if (HttpHeaders.VARY.equalsIgnoreCase(uVar.a(i))) {
                String b2 = uVar.b(i);
                if (emptySet.isEmpty()) {
                    emptySet = new TreeSet<>((Comparator<? super String>) String.CASE_INSENSITIVE_ORDER);
                }
                for (String str : b2.split(",")) {
                    emptySet.add(str.trim());
                }
            }
        }
        return emptySet;
    }

    public static u c(af afVar) {
        u c = afVar.i().a().c();
        Set<String> c2 = c(afVar.f());
        if (c2.isEmpty()) {
            return com.anythink.core.common.n.b.a.c.c;
        }
        u.a aVar = new u.a();
        int a2 = c.a();
        for (int i = 0; i < a2; i++) {
            String a3 = c.a(i);
            if (c2.contains(a3)) {
                aVar.a(a3, c.b(i));
            }
        }
        return aVar.a();
    }

    private static u a(u uVar, u uVar2) {
        Set<String> c = c(uVar2);
        if (c.isEmpty()) {
            return com.anythink.core.common.n.b.a.c.c;
        }
        u.a aVar = new u.a();
        int a2 = uVar.a();
        for (int i = 0; i < a2; i++) {
            String a3 = uVar.a(i);
            if (c.contains(a3)) {
                aVar.a(a3, uVar.b(i));
            }
        }
        return aVar.a();
    }

    public static List<com.anythink.core.common.n.b.h> a(u uVar, String str) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < uVar.a(); i++) {
            if (str.equalsIgnoreCase(uVar.a(i))) {
                a(arrayList, new com.anythink.core.common.n.c.c().b(uVar.b(i)));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c5, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c5, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(java.util.List<com.anythink.core.common.n.b.h> r7, com.anythink.core.common.n.c.c r8) {
        /*
            r0 = 0
        L1:
            r1 = r0
        L2:
            if (r1 != 0) goto Lf
            a(r8)
            java.lang.String r1 = d(r8)
            if (r1 != 0) goto Lf
            goto Lc2
        Lf:
            boolean r2 = a(r8)
            java.lang.String r3 = d(r8)
            if (r3 != 0) goto L2e
            boolean r8 = r8.g()
            if (r8 != 0) goto L21
            goto Lc2
        L21:
            com.anythink.core.common.n.b.h r8 = new com.anythink.core.common.n.b.h
            java.util.Map r0 = java.util.Collections.emptyMap()
            r8.<init>(r1, r0)
            r7.add(r8)
            return
        L2e:
            int r4 = b(r8)
            boolean r5 = a(r8)
            if (r2 != 0) goto L6a
            if (r5 != 0) goto L40
            boolean r2 = r8.g()
            if (r2 == 0) goto L6a
        L40:
            com.anythink.core.common.n.b.h r2 = new com.anythink.core.common.n.b.h
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r3 = r5.append(r3)
            char[] r4 = new char[r4]
            r5 = 61
            java.util.Arrays.fill(r4, r5)
            java.lang.String r5 = new java.lang.String
            r5.<init>(r4)
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            r2.<init>(r1, r3)
            r7.add(r2)
            goto L1
        L6a:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            int r5 = b(r8)
            int r4 = r4 + r5
        L74:
            if (r3 != 0) goto L84
            java.lang.String r3 = d(r8)
            boolean r4 = a(r8)
            if (r4 != 0) goto Lc5
            int r4 = b(r8)
        L84:
            if (r4 == 0) goto Lc5
            r5 = 1
            if (r4 <= r5) goto L8a
            goto Lc2
        L8a:
            boolean r5 = a(r8)
            if (r5 == 0) goto L91
            goto Lc2
        L91:
            boolean r5 = r8.g()
            if (r5 != 0) goto La6
            r5 = 0
            byte r5 = r8.c(r5)
            r6 = 34
            if (r5 != r6) goto La6
            java.lang.String r5 = c(r8)
            goto Laa
        La6:
            java.lang.String r5 = d(r8)
        Laa:
            if (r5 != 0) goto Lad
            goto Lc2
        Lad:
            java.lang.Object r3 = r2.put(r3, r5)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto Lb6
            goto Lc2
        Lb6:
            boolean r3 = a(r8)
            if (r3 != 0) goto Lc3
            boolean r3 = r8.g()
            if (r3 != 0) goto Lc3
        Lc2:
            return
        Lc3:
            r3 = r0
            goto L74
        Lc5:
            com.anythink.core.common.n.b.h r4 = new com.anythink.core.common.n.b.h
            r4.<init>(r1, r2)
            r7.add(r4)
            r1 = r3
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.n.b.a.c.e.a(java.util.List, com.anythink.core.common.n.c.c):void");
    }

    private static boolean a(com.anythink.core.common.n.c.c cVar) {
        boolean z = false;
        while (!cVar.g()) {
            byte c = cVar.c(0L);
            if (c != 44) {
                if (c != 32 && c != 9) {
                    break;
                }
                cVar.k();
            } else {
                cVar.k();
                z = true;
            }
        }
        return z;
    }

    private static int b(com.anythink.core.common.n.c.c cVar) {
        int i = 0;
        while (!cVar.g() && cVar.c(0L) == 61) {
            i++;
            cVar.k();
        }
        return i;
    }

    private static String c(com.anythink.core.common.n.c.c cVar) {
        if (cVar.k() != 34) {
            throw new IllegalArgumentException();
        }
        com.anythink.core.common.n.c.c cVar2 = new com.anythink.core.common.n.c.c();
        while (true) {
            long c = cVar.c(f4089a);
            if (c == -1) {
                return null;
            }
            if (cVar.c(c) == 34) {
                cVar2.a(cVar, c);
                cVar.k();
                return cVar2.u();
            }
            if (cVar.b() == c + 1) {
                return null;
            }
            cVar2.a(cVar, c);
            cVar.k();
            cVar2.a(cVar, 1L);
        }
    }

    private static String d(com.anythink.core.common.n.c.c cVar) {
        try {
            long c = cVar.c(b);
            if (c == -1) {
                c = cVar.b();
            }
            if (c != 0) {
                return cVar.e(c);
            }
            return null;
        } catch (EOFException unused) {
            throw new AssertionError();
        }
    }

    private static String a(int i) {
        char[] cArr = new char[i];
        Arrays.fill(cArr, com.alipay.sdk.m.p.a.h);
        return new String(cArr);
    }

    public static void a(n nVar, v vVar, u uVar) {
        if (nVar == n.f4194a) {
            return;
        }
        m.a(vVar, uVar).isEmpty();
    }

    public static boolean d(af afVar) {
        if (afVar.a().b().equals("HEAD")) {
            return false;
        }
        int c = afVar.c();
        return (((c >= 100 && c < 200) || c == 204 || c == 304) && a(afVar) == -1 && !"chunked".equalsIgnoreCase(afVar.a(HttpHeaders.TRANSFER_ENCODING))) ? false : true;
    }

    public static int a(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    public static int a(String str, int i) {
        char charAt;
        while (i < str.length() && ((charAt = str.charAt(i)) == ' ' || charAt == '\t')) {
            i++;
        }
        return i;
    }

    public static int b(String str, int i) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static boolean a(af afVar, u uVar, ad adVar) {
        for (String str : c(afVar.f())) {
            if (!Objects.equals(uVar.b(str), adVar.b(str))) {
                return false;
            }
        }
        return true;
    }
}
