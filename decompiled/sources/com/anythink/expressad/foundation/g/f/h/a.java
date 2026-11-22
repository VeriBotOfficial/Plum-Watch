package com.anythink.expressad.foundation.g.f.h;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.expressad.foundation.g.f.d.c;
import com.anythink.expressad.foundation.g.f.d.d;
import com.anythink.expressad.foundation.g.f.d.g;
import com.anythink.expressad.foundation.g.f.e;
import com.anythink.expressad.foundation.g.f.j;
import com.anythink.expressad.foundation.g.f.m;
import com.anythink.expressad.foundation.g.f.n;
import com.anythink.expressad.foundation.h.s;
import com.anythink.expressad.out.l;
import java.io.File;

/* loaded from: classes12.dex */
public class a {
    private static final String b = "a";

    /* renamed from: a, reason: collision with root package name */
    protected Context f4885a;

    public a(Context context) {
        if (context == null) {
            this.f4885a = com.anythink.expressad.foundation.b.a.c().e();
        } else {
            this.f4885a = context.getApplicationContext();
        }
    }

    public void a(String str, b bVar) {
        if (bVar != null) {
            bVar.a("open", com.anythink.expressad.foundation.g.a.cC);
            StringBuilder sb = new StringBuilder();
            com.anythink.expressad.foundation.g.f.a.a();
            bVar.a("band_width", sb.append(com.anythink.expressad.foundation.g.f.a.b()).toString());
            String str2 = bVar.b().get("unit_id");
            if (str2 != null) {
                String a2 = l.a().a(str2, str);
                if (TextUtils.isEmpty(a2)) {
                    return;
                }
                bVar.a("ch_info", a2);
            }
        }
    }

    public void a(int i, String str, b bVar, e eVar) {
        a(i, str, bVar, new com.anythink.expressad.foundation.g.f.b(), eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r6, java.lang.String r7, com.anythink.expressad.foundation.g.f.h.b r8, com.anythink.expressad.foundation.g.f.m r9, com.anythink.expressad.foundation.g.f.e r10) {
        /*
            r5 = this;
            if (r8 != 0) goto L8
            com.anythink.expressad.foundation.g.f.h.b r0 = new com.anythink.expressad.foundation.g.f.h.b     // Catch: java.lang.Exception -> L43
            r0.<init>()     // Catch: java.lang.Exception -> L43
            r8 = r0
        L8:
            r5.a(r7, r8)     // Catch: java.lang.Exception -> L43
            java.util.Map r0 = r8.b()     // Catch: java.lang.Exception -> L43
            java.lang.String r1 = "sign"
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L43
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L43
            if (r0 != 0) goto L1b
            java.lang.String r0 = ""
        L1b:
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L43
            java.lang.String r3 = "ts"
            java.lang.String r4 = java.lang.String.valueOf(r1)     // Catch: java.lang.Exception -> L43
            r8.a(r3, r4)     // Catch: java.lang.Exception -> L43
            java.lang.String r3 = "st"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L43
            r4.<init>()     // Catch: java.lang.Exception -> L43
            java.lang.StringBuilder r0 = r4.append(r0)     // Catch: java.lang.Exception -> L43
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Exception -> L43
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L43
            java.lang.String r0 = com.anythink.expressad.foundation.h.s.a(r0)     // Catch: java.lang.Exception -> L43
            r8.a(r3, r0)     // Catch: java.lang.Exception -> L43
            goto L47
        L43:
            r0 = move-exception
            r0.getMessage()
        L47:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r7 = r0.append(r7)
            java.lang.String r0 = "?"
            java.lang.StringBuilder r7 = r7.append(r0)
            java.lang.String r8 = r8.toString()
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            r8 = 0
            r0 = 0
            if (r6 == 0) goto L79
            r1 = 1
            if (r6 == r1) goto L73
            r1 = 2
            if (r6 == r1) goto L6d
            goto L7f
        L6d:
            com.anythink.expressad.foundation.g.f.d.c r6 = new com.anythink.expressad.foundation.g.f.d.c
            r6.<init>(r8, r7, r0, r10)
            goto L7e
        L73:
            com.anythink.expressad.foundation.g.f.d.d r6 = new com.anythink.expressad.foundation.g.f.d.d
            r6.<init>(r8, r7, r0, r10)
            goto L7e
        L79:
            com.anythink.expressad.foundation.g.f.d.g r6 = new com.anythink.expressad.foundation.g.f.d.g
            r6.<init>(r8, r7, r0, r10)
        L7e:
            r0 = r6
        L7f:
            if (r0 == 0) goto L87
            r0.a(r9)
            com.anythink.expressad.foundation.g.f.n.a(r0)
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.foundation.g.f.h.a.a(int, java.lang.String, com.anythink.expressad.foundation.g.f.h.b, com.anythink.expressad.foundation.g.f.m, com.anythink.expressad.foundation.g.f.e):void");
    }

    public static void a(File file, String str, e eVar) {
        n.a().a(file, str, (e<Void>) eVar);
    }

    private void b(int i, String str, b bVar, e eVar) {
        String str2 = bVar.b().get("sign");
        if (str2 == null) {
            str2 = "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        bVar.a("ts", String.valueOf(currentTimeMillis));
        bVar.a("st", s.a(str2 + currentTimeMillis));
        b(i, str, bVar, new com.anythink.expressad.foundation.g.f.b(), eVar);
    }

    private void c(int i, String str, b bVar, e eVar) {
        b(i, str, bVar, new com.anythink.expressad.foundation.g.f.b(), eVar);
    }

    private void b(int i, String str, b bVar, m mVar, e eVar) {
        j gVar;
        if (bVar == null) {
            try {
                bVar = new b();
            } catch (Exception e) {
                e.getMessage();
            }
        }
        a(str, bVar);
        if (i == 0) {
            gVar = new g(1, str, bVar.toString(), eVar);
            gVar.a("Content-Type", "application/x-www-form-urlencoded");
        } else if (i == 1) {
            gVar = new d(1, str, bVar.toString(), eVar);
            gVar.a("Content-Type", "application/x-www-form-urlencoded");
        } else if (i != 2) {
            gVar = null;
        } else {
            gVar = new c(1, str, bVar.toString(), eVar);
            gVar.a("Content-Type", "application/x-www-form-urlencoded");
        }
        if (gVar != null) {
            gVar.a(mVar);
            n.a(gVar);
        }
    }
}
