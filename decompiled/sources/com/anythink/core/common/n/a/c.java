package com.anythink.core.common.n.a;

import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Date;

/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static volatile c f4036a;
    private volatile i[] c;
    private volatile k d = null;
    private i e = null;
    private final j<String, l[]> b = new j<>();

    private c() {
    }

    public static c a() {
        if (f4036a == null) {
            synchronized (c.class) {
                if (f4036a == null) {
                    f4036a = new c();
                }
            }
        }
        return f4036a;
    }

    public final synchronized void a(k kVar, i[] iVarArr) {
        if (kVar == null) {
            try {
                kVar = k.j;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.d = kVar;
        this.c = iVarArr;
    }

    public final synchronized boolean b() {
        if (this.c != null) {
            if (this.c.length > 0) {
                return true;
            }
        }
        return false;
    }

    private static l[] a(l[] lVarArr) {
        ArrayList arrayList = new ArrayList(lVarArr.length);
        for (l lVar : lVarArr) {
            if (lVar != null && (lVar.a() || lVar.b())) {
                arrayList.add(lVar);
            }
        }
        return (l[]) arrayList.toArray(new l[arrayList.size()]);
    }

    private static String[] b(l[] lVarArr) {
        if (lVarArr == null || lVarArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(lVarArr.length);
        for (l lVar : lVarArr) {
            arrayList.add(lVar.g);
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    private static boolean a(String str) {
        if (str == null || str.length() < 7 || str.length() > 15 || str.contains(Constants.ACCEPT_TIME_SEPARATOR_SERVER)) {
            return false;
        }
        try {
            int indexOf = str.indexOf(46);
            if (indexOf != -1 && Integer.parseInt(str.substring(0, indexOf)) > 255) {
                return false;
            }
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(46, i);
            if (indexOf2 != -1 && Integer.parseInt(str.substring(i, indexOf2)) > 255) {
                return false;
            }
            int i2 = indexOf2 + 1;
            int indexOf3 = str.indexOf(46, i2);
            if (indexOf3 != -1 && Integer.parseInt(str.substring(i2, indexOf3)) > 255 && Integer.parseInt(str.substring(indexOf3 + 1, str.length() - 1)) > 255) {
                if (str.charAt(str.length() - 1) != '.') {
                    return false;
                }
            }
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    private synchronized void c() {
        this.b.clear();
    }

    private l[] b(String str) {
        return b(new h(str));
    }

    private l[] b(h hVar) {
        if (hVar == null) {
            throw new IOException("null domain");
        }
        if (hVar.f4044a == null || hVar.f4044a.trim().isEmpty()) {
            throw new IllegalArgumentException("empty domain " + hVar.f4044a);
        }
        if (a(hVar.f4044a)) {
            return new l[]{new l(hVar.f4044a, 1, -1, new Date().getTime(), 0, "")};
        }
        return c(hVar);
    }

    private l[] c(h hVar) {
        l[] lVarArr;
        l[] lVarArr2 = this.b.get(hVar.f4044a);
        Exception e = null;
        if (lVarArr2 != null && lVarArr2.length != 0) {
            ArrayList arrayList = new ArrayList(lVarArr2.length);
            for (l lVar : lVarArr2) {
                if (lVar != null && !TextUtils.isEmpty(lVar.g)) {
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    if (lVar.i == -1 || lVar.j + lVar.i > currentTimeMillis) {
                        arrayList.add(lVar);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                lVarArr = (l[]) arrayList.toArray(new l[arrayList.size()]);
                if (lVarArr == null && lVarArr.length > 0) {
                    return lVarArr;
                }
                if (this.c != null || this.c.length == 0) {
                    throw new IllegalArgumentException("no resolver");
                }
                for (i iVar : this.c) {
                    try {
                        lVarArr2 = iVar.a(hVar);
                        if (lVarArr2 != null && lVarArr2.length > 0) {
                            this.e = iVar;
                            break;
                        }
                    } catch (Exception e2) {
                        e = e2;
                    }
                }
                if (lVarArr2 == null || lVarArr2.length == 0) {
                    throw new UnknownHostException(hVar.f4044a + " " + (e != null ? e.getMessage() : ""));
                }
                l[] a2 = a(lVarArr2);
                if (a2.length == 0) {
                    throw new UnknownHostException("no A/AAAA records");
                }
                this.b.put(hVar.f4044a, a2);
                return a2;
            }
        }
        lVarArr = null;
        if (lVarArr == null) {
        }
        if (this.c != null) {
        }
        throw new IllegalArgumentException("no resolver");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0042 A[Catch: all -> 0x0058, LOOP:1: B:21:0x003f->B:23:0x0042, LOOP_END, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x000d, B:10:0x0017, B:12:0x0021, B:15:0x0028, B:17:0x0038, B:20:0x003c, B:21:0x003f, B:23:0x0042, B:25:0x004d), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized com.anythink.core.common.n.a.m a(com.anythink.core.common.n.a.h r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            com.anythink.core.common.n.a.l[] r7 = r6.b(r7)     // Catch: java.lang.Throwable -> L58
            r0 = 0
            r1 = 0
            if (r7 == 0) goto L35
            int r2 = r7.length     // Catch: java.lang.Throwable -> L58
            if (r2 != 0) goto Ld
            goto L35
        Ld:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L58
            int r3 = r7.length     // Catch: java.lang.Throwable -> L58
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L58
            int r3 = r7.length     // Catch: java.lang.Throwable -> L58
            r4 = r0
        L15:
            if (r4 >= r3) goto L21
            r5 = r7[r4]     // Catch: java.lang.Throwable -> L58
            java.lang.String r5 = r5.g     // Catch: java.lang.Throwable -> L58
            r2.add(r5)     // Catch: java.lang.Throwable -> L58
            int r4 = r4 + 1
            goto L15
        L21:
            int r7 = r2.size()     // Catch: java.lang.Throwable -> L58
            if (r7 != 0) goto L28
            goto L35
        L28:
            int r7 = r2.size()     // Catch: java.lang.Throwable -> L58
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch: java.lang.Throwable -> L58
            java.lang.Object[] r7 = r2.toArray(r7)     // Catch: java.lang.Throwable -> L58
            java.lang.String[] r7 = (java.lang.String[]) r7     // Catch: java.lang.Throwable -> L58
            goto L36
        L35:
            r7 = r1
        L36:
            if (r7 == 0) goto L56
            int r2 = r7.length     // Catch: java.lang.Throwable -> L58
            if (r2 != 0) goto L3c
            goto L56
        L3c:
            int r1 = r7.length     // Catch: java.lang.Throwable -> L58
            java.net.InetAddress[] r1 = new java.net.InetAddress[r1]     // Catch: java.lang.Throwable -> L58
        L3f:
            int r2 = r7.length     // Catch: java.lang.Throwable -> L58
            if (r0 >= r2) goto L4d
            r2 = r7[r0]     // Catch: java.lang.Throwable -> L58
            java.net.InetAddress r2 = java.net.InetAddress.getByName(r2)     // Catch: java.lang.Throwable -> L58
            r1[r0] = r2     // Catch: java.lang.Throwable -> L58
            int r0 = r0 + 1
            goto L3f
        L4d:
            com.anythink.core.common.n.a.m r7 = new com.anythink.core.common.n.a.m     // Catch: java.lang.Throwable -> L58
            com.anythink.core.common.n.a.i r0 = r6.e     // Catch: java.lang.Throwable -> L58
            r7.<init>(r1, r0)     // Catch: java.lang.Throwable -> L58
            monitor-exit(r6)
            return r7
        L56:
            monitor-exit(r6)
            return r1
        L58:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L58
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.n.a.c.a(com.anythink.core.common.n.a.h):com.anythink.core.common.n.a.m");
    }

    private static l[] c(l[] lVarArr) {
        if (lVarArr == null || lVarArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(lVarArr.length);
        for (l lVar : lVarArr) {
            if (lVar != null && !TextUtils.isEmpty(lVar.g)) {
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                if (lVar.i == -1 || lVar.j + lVar.i > currentTimeMillis) {
                    arrayList.add(lVar);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (l[]) arrayList.toArray(new l[arrayList.size()]);
    }
}
