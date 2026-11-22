package com.anythink.expressad.videocommon.b;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes12.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f5516a = "DownLoadManager";
    private static e b;
    private ThreadPoolExecutor c;
    private boolean d = false;
    private ConcurrentHashMap<String, o> e = new ConcurrentHashMap<>();
    private Map<String, List<Map<String, c>>> f;
    private ConcurrentHashMap<String, CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d>> g;
    private ConcurrentHashMap<String, CopyOnWriteArrayList<c>> h;

    private e() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 15, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
        this.c = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static e a() {
        if (b == null) {
            synchronized (e.class) {
                if (b == null) {
                    b = new e();
                }
            }
        }
        return b;
    }

    public final c a(String str, String str2) {
        o c = c(str);
        if (c != null) {
            return c.a(str2);
        }
        return null;
    }

    private List<Map<String, c>> e(String str) {
        Map<String, List<Map<String, c>>> map = this.f;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.f.get(str);
    }

    public final CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> a(String str) {
        ConcurrentHashMap<String, CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d>> concurrentHashMap = this.g;
        if (concurrentHashMap == null || !concurrentHashMap.containsKey(str)) {
            return null;
        }
        return this.g.get(str);
    }

    public final CopyOnWriteArrayList<c> b(String str) {
        ConcurrentHashMap<String, CopyOnWriteArrayList<c>> concurrentHashMap = this.h;
        if (concurrentHashMap == null || !concurrentHashMap.containsKey(str)) {
            return null;
        }
        return this.h.get(str);
    }

    private c b(int i, String str, boolean z) {
        o c = c(str);
        if (c != null) {
            return c.b(i, z);
        }
        return null;
    }

    public final o c(String str) {
        ConcurrentHashMap<String, o> concurrentHashMap = this.e;
        if (concurrentHashMap == null || !concurrentHashMap.containsKey(str)) {
            return null;
        }
        return this.e.get(str);
    }

    public final boolean a(int i, String str, boolean z) {
        try {
            o c = c(str);
            if (c != null) {
                return c.a(i, z) != null;
            }
        } catch (Exception e) {
            if (com.anythink.expressad.a.f4564a) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public final boolean a(String str, boolean z, int i, boolean z2, int i2, List<com.anythink.expressad.foundation.d.d> list) {
        return b(str, z, i, z2, i2, list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0172, code lost:
    
        if (r11.size() > 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0177, code lost:
    
        r11 = r8.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0179, code lost:
    
        if (r11 != null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x017b, code lost:
    
        r8.f = new java.util.HashMap();
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x018e, code lost:
    
        r11 = r8.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0190, code lost:
    
        if (r11 != null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0192, code lost:
    
        r8.h = new java.util.concurrent.ConcurrentHashMap<>();
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01a5, code lost:
    
        r11 = r8.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01a7, code lost:
    
        if (r11 != null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01a9, code lost:
    
        r8.g = new java.util.concurrent.ConcurrentHashMap<>();
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01bc, code lost:
    
        if (r10 == null) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01c2, code lost:
    
        if (r10.size() <= 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01c4, code lost:
    
        r11 = new java.util.concurrent.CopyOnWriteArrayList();
        r12 = new java.util.concurrent.CopyOnWriteArrayList<>();
        r13 = new java.util.concurrent.CopyOnWriteArrayList<>();
        r10 = r10.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x01db, code lost:
    
        if (r10.hasNext() == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x01dd, code lost:
    
        r14 = r10.next();
        r1 = new java.util.concurrent.ConcurrentHashMap();
        r2 = r14.n();
        r1.put(r2.bh() + r2.T() + r2.C(), r14);
        r11.add(r1);
        r12.add(r2);
        r13.add(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x021a, code lost:
    
        r8.f.put(r9, r11);
        r8.g.put(r9, r12);
        r8.h.put(r9, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x01b5, code lost:
    
        if (r11.containsKey(r9) == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01b7, code lost:
    
        r8.g.remove(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x019e, code lost:
    
        if (r11.containsKey(r9) == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x01a0, code lost:
    
        r8.h.remove(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0187, code lost:
    
        if (r11.containsKey(r9) == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0189, code lost:
    
        r8.f.remove(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0110, code lost:
    
        if (r13.size() >= r11) goto L88;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(java.lang.String r9, boolean r10, int r11, boolean r12, int r13, java.util.List<com.anythink.expressad.foundation.d.d> r14) {
        /*
            Method dump skipped, instructions count: 563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.videocommon.b.e.b(java.lang.String, boolean, int, boolean, int, java.util.List):boolean");
    }

    private void b(String str, String str2) {
        o c = c(str);
        if (c != null) {
            try {
                c.b(str2);
            } catch (Exception unused) {
            }
        }
    }

    public final void d(String str) {
        o c = c(str);
        if (c != null) {
            c.a();
        }
    }

    public final o a(String str, CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> copyOnWriteArrayList, int i, com.anythink.expressad.videocommon.d.c cVar) {
        if (TextUtils.isEmpty(str) || copyOnWriteArrayList == null || copyOnWriteArrayList.size() == 0) {
            return null;
        }
        if (this.e.containsKey(str)) {
            o oVar = this.e.get(str);
            if (i == 94 || i == 287) {
                oVar.a(copyOnWriteArrayList.get(0).aa(), cVar);
            } else {
                oVar.a(cVar);
            }
            oVar.a(copyOnWriteArrayList);
            return oVar;
        }
        o oVar2 = new o(copyOnWriteArrayList, this.c, str, i);
        if (cVar != null) {
            oVar2.a(cVar);
        }
        this.e.put(str, oVar2);
        return oVar2;
    }

    private o a(String str, com.anythink.expressad.foundation.d.d dVar, int i, com.anythink.expressad.videocommon.d.c cVar) {
        if (TextUtils.isEmpty(str) || dVar == null) {
            return null;
        }
        if (this.e.containsKey(str)) {
            o oVar = this.e.get(str);
            if (i == 94 || i == 287) {
                oVar.a(dVar.aa(), cVar);
            } else {
                oVar.a(cVar);
            }
            oVar.a(dVar);
            return oVar;
        }
        o oVar2 = new o(dVar, this.c, str, i);
        if (cVar != null) {
            oVar2.a(cVar);
        }
        this.e.put(str, oVar2);
        return oVar2;
    }

    public final void b() {
        this.d = false;
        ConcurrentHashMap<String, o> concurrentHashMap = this.e;
        if (concurrentHashMap != null) {
            Iterator<Map.Entry<String, o>> it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                o value = it.next().getValue();
                if (value != null) {
                    value.c();
                }
            }
        }
    }

    private void d() {
        ConcurrentHashMap<String, o> concurrentHashMap = this.e;
        if (concurrentHashMap != null) {
            Iterator<Map.Entry<String, o>> it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                o value = it.next().getValue();
                if (value != null) {
                    value.b();
                }
            }
        }
    }

    public final void a(boolean z) {
        if (z) {
            if (this.d) {
                return;
            }
        } else {
            this.d = false;
        }
        ConcurrentHashMap<String, o> concurrentHashMap = this.e;
        if (concurrentHashMap != null) {
            Iterator<Map.Entry<String, o>> it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().a();
            }
        }
    }

    public final void c() {
        ConcurrentHashMap<String, o> concurrentHashMap = this.e;
        if (concurrentHashMap != null) {
            for (Map.Entry<String, o> entry : concurrentHashMap.entrySet()) {
                o value = entry.getValue();
                String key = entry.getKey();
                try {
                    com.anythink.expressad.videocommon.e.d a2 = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), key);
                    if (a2 != null) {
                        if (a2.F() == 2) {
                            value.c();
                        } else {
                            value.a();
                        }
                    }
                } catch (Exception e) {
                    e.getMessage();
                    try {
                        if (!TextUtils.isEmpty(key)) {
                            com.anythink.expressad.f.b.a();
                            com.anythink.expressad.f.c c = com.anythink.expressad.f.b.c(com.anythink.expressad.foundation.b.a.c().f(), key);
                            if (c == null) {
                                c = com.anythink.expressad.f.c.d(key);
                            }
                            if (c.m() == 2) {
                                value.c();
                            } else {
                                value.a();
                            }
                        }
                    } catch (Exception e2) {
                        e2.getMessage();
                    }
                }
            }
        }
    }

    private static void a(o oVar, String str) {
        try {
            com.anythink.expressad.videocommon.e.d a2 = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), str);
            if (a2 == null) {
                return;
            }
            if (a2.F() == 2) {
                oVar.c();
            } else {
                oVar.a();
            }
        } catch (Exception e) {
            e.getMessage();
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                com.anythink.expressad.f.b.a();
                com.anythink.expressad.f.c c = com.anythink.expressad.f.b.c(com.anythink.expressad.foundation.b.a.c().f(), str);
                if (c == null) {
                    c = com.anythink.expressad.f.c.d(str);
                }
                if (c.m() == 2) {
                    oVar.c();
                } else {
                    oVar.a();
                }
            } catch (Exception e2) {
                e2.getMessage();
            }
        }
    }

    private void f(String str) {
        o c = c(str);
        if (c != null) {
            c.d();
        }
    }
}
