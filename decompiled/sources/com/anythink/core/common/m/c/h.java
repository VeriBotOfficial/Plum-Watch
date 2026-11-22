package com.anythink.core.common.m.c;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.common.v.af;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private static final String f4005a = "HttpReqLimitInterceptor";
    private final Object b = new Object();
    private final Context c;
    private final Map<String, Long> d;
    private final a e;
    private long f;

    public h(Context context, Map<String, Long> map, a aVar) {
        this.c = context;
        this.d = map;
        this.e = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e9 A[Catch: all -> 0x0121, TryCatch #0 {, blocks: (B:12:0x0033, B:14:0x0042, B:16:0x0098, B:18:0x009e, B:20:0x00a4, B:21:0x00b2, B:23:0x00b8, B:25:0x00c2, B:27:0x00e5, B:29:0x00e9, B:30:0x00ed, B:32:0x00f3, B:34:0x00f9, B:35:0x00fb, B:37:0x0106, B:38:0x010d, B:39:0x0115, B:41:0x00cc, B:42:0x00db, B:43:0x011f, B:46:0x0046, B:48:0x0068, B:51:0x0078), top: B:11:0x0033, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f3 A[Catch: all -> 0x0121, TryCatch #0 {, blocks: (B:12:0x0033, B:14:0x0042, B:16:0x0098, B:18:0x009e, B:20:0x00a4, B:21:0x00b2, B:23:0x00b8, B:25:0x00c2, B:27:0x00e5, B:29:0x00e9, B:30:0x00ed, B:32:0x00f3, B:34:0x00f9, B:35:0x00fb, B:37:0x0106, B:38:0x010d, B:39:0x0115, B:41:0x00cc, B:42:0x00db, B:43:0x011f, B:46:0x0046, B:48:0x0068, B:51:0x0078), top: B:11:0x0033, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0115 A[Catch: all -> 0x0121, TryCatch #0 {, blocks: (B:12:0x0033, B:14:0x0042, B:16:0x0098, B:18:0x009e, B:20:0x00a4, B:21:0x00b2, B:23:0x00b8, B:25:0x00c2, B:27:0x00e5, B:29:0x00e9, B:30:0x00ed, B:32:0x00f3, B:34:0x00f9, B:35:0x00fb, B:37:0x0106, B:38:0x010d, B:39:0x0115, B:41:0x00cc, B:42:0x00db, B:43:0x011f, B:46:0x0046, B:48:0x0068, B:51:0x0078), top: B:11:0x0033, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ec  */
    /* JADX WARN: Type inference failed for: r13v4, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r19v0, types: [com.anythink.core.common.m.b.f] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.anythink.core.common.m.b.f a(com.anythink.core.common.m.b.d r18, com.anythink.core.common.m.b.f r19) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.m.c.h.a(com.anythink.core.common.m.b.d, com.anythink.core.common.m.b.f):com.anythink.core.common.m.b.f");
    }

    public final void a(com.anythink.core.common.m.b.f fVar, com.anythink.core.common.m.b.d dVar) {
        Object g = fVar.g();
        try {
            synchronized (this.b) {
                a aVar = this.e;
                if (aVar != null && aVar.c && g != null) {
                    af.b(this.c, "anythink_app_pl_cl_retry", e(dVar), g.toString());
                    af.a(this.c, "anythink_app_pl_cl_retry", f(dVar), System.currentTimeMillis());
                }
                String a2 = a(dVar);
                String d = d(dVar);
                this.d.put(a2, 0L);
                com.anythink.core.common.s.a c = af.c(this.c, "anythink_app_pl_cl_retry");
                c.a(a2, 0L);
                c.a(d, 0L);
            }
        } catch (Throwable th) {
            new Object[]{th.getMessage()};
        }
    }

    public static String a(com.anythink.core.common.m.b.d dVar) {
        return dVar != null ? dVar.b() + "_req_next_timestamp" : "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.anythink.core.common.m.b.f] */
    /* JADX WARN: Type inference failed for: r8v4, types: [org.json.JSONObject] */
    private void a(com.anythink.core.common.m.b.f fVar, com.anythink.core.common.m.b.d dVar, com.anythink.core.common.s.a aVar) {
        a aVar2 = this.e;
        if (aVar2 == null || aVar2.c) {
            long longValue = ((Long) aVar.b(f(dVar), 0L)).longValue();
            String str = (String) aVar.b(e(dVar), "");
            boolean z = longValue > 0 && System.currentTimeMillis() - longValue <= a();
            new Object[]{Boolean.valueOf(z), str};
            if (TextUtils.isEmpty(str) || !z) {
                return;
            }
            try {
                str = new JSONObject(str);
            } catch (Throwable unused) {
            }
            try {
                fVar.a(str);
                fVar.b(200);
                fVar.a(true);
            } catch (Throwable unused2) {
            }
        }
    }

    private void b(com.anythink.core.common.m.b.d dVar) {
        String a2 = a(dVar);
        String d = d(dVar);
        this.d.put(a2, 0L);
        com.anythink.core.common.s.a c = af.c(this.c, "anythink_app_pl_cl_retry");
        c.a(a2, 0L);
        c.a(d, 0L);
    }

    private static String c(com.anythink.core.common.m.b.d dVar) {
        return dVar != null ? dVar.b() + "_req_frist_timestamp" : "";
    }

    private static String d(com.anythink.core.common.m.b.d dVar) {
        return dVar != null ? dVar.b() + "_req_count" : "";
    }

    private static String e(com.anythink.core.common.m.b.d dVar) {
        return dVar != null ? dVar.b() + "_data" : "";
    }

    private static String f(com.anythink.core.common.m.b.d dVar) {
        return dVar != null ? dVar.b() + "_data_timestamp" : "";
    }

    private long a(com.anythink.core.common.s.a aVar, String str) {
        long j = this.f;
        return j <= 0 ? ((Long) aVar.b(str, 0L)).longValue() : j;
    }

    private long a() {
        a aVar = this.e;
        if (aVar != null) {
            return aVar.b;
        }
        return 3600000L;
    }

    private int b() {
        a aVar = this.e;
        if (aVar != null) {
            return aVar.f4006a;
        }
        return 5;
    }

    public static class a {
        public long b;
        public boolean c = true;

        /* renamed from: a, reason: collision with root package name */
        public int f4006a = 5;

        public a(long j) {
            this.b = j;
        }
    }
}
