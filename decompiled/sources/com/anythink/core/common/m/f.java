package com.anythink.core.common.m;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.anythink.core.api.ATAdRequest;
import com.anythink.core.api.AdError;
import com.anythink.core.common.d.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class f extends a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4018a = "custom";
    private static final String b = "f";
    private String c;
    private String d;
    private String e;
    private Context f;
    private long g;
    private long h;
    private Map<String, Object> i;
    private Map<String, String> j;
    private String k;

    @Override // com.anythink.core.common.m.a
    protected final int a() {
        return 1;
    }

    @Override // com.anythink.core.common.m.a
    protected final void a(AdError adError) {
    }

    @Override // com.anythink.core.common.m.a
    protected final boolean d_() {
        return true;
    }

    @Override // com.anythink.core.common.m.a
    protected final Map<String, Object> k() {
        return null;
    }

    @Override // com.anythink.core.common.m.a
    protected int l() {
        return 187;
    }

    public f(Context context, com.anythink.core.common.h.v vVar) {
        if (vVar == null) {
            return;
        }
        this.i = com.anythink.core.common.d.t.b().m();
        this.c = vVar.a();
        this.d = vVar.b();
        this.f = context;
        this.j = vVar.d();
        this.e = vVar.c();
    }

    @Override // com.anythink.core.common.m.a
    public final void a(int i, q qVar) {
        this.g = System.currentTimeMillis();
        this.h = SystemClock.elapsedRealtime();
        super.a(i, qVar);
    }

    @Override // com.anythink.core.common.m.a
    protected final String b() {
        if (!TextUtils.isEmpty(this.k)) {
            return this.k;
        }
        com.anythink.core.common.i.a();
        return com.anythink.core.common.i.b();
    }

    @Override // com.anythink.core.common.m.a
    protected final Map<String, String> c() {
        HashMap hashMap = new HashMap();
        hashMap.put("Accept-Encoding", "gzip");
        hashMap.put("Content-Type", "application/json;charset=utf-8");
        return hashMap;
    }

    @Override // com.anythink.core.common.m.a
    protected final byte[] d() {
        try {
            return g().getBytes("utf-8");
        } catch (Exception unused) {
            return g().getBytes();
        }
    }

    @Override // com.anythink.core.common.m.a
    protected final String h() {
        return this.c;
    }

    @Override // com.anythink.core.common.m.a
    protected final Context i() {
        return this.f;
    }

    @Override // com.anythink.core.common.m.a
    protected final String j() {
        return this.d;
    }

    @Override // com.anythink.core.common.m.a
    protected final JSONObject e() {
        JSONObject e = super.e();
        try {
            e.put("app_id", this.c);
            e.put("nw_ver", com.anythink.core.common.v.m.g());
            String C = com.anythink.core.common.d.t.b().C();
            if (!TextUtils.isEmpty(C)) {
                e.put("sy_id", C);
            }
            String D = com.anythink.core.common.d.t.b().D();
            if (!TextUtils.isEmpty(D)) {
                e.put("bk_id", D);
            } else {
                com.anythink.core.common.d.t.b().k(com.anythink.core.common.d.t.b().B());
                e.put("bk_id", com.anythink.core.common.d.t.b().B());
            }
            JSONObject a2 = e.a();
            if (a2 != null) {
                e.put("custom", a2);
            }
            e.put("deny", com.anythink.core.common.v.m.q(com.anythink.core.common.d.t.b().g()));
            if (com.anythink.core.common.d.t.b().z()) {
                e.put("is_test", 1);
            }
            com.anythink.core.common.c.b.a();
            e.put("pil_offset", com.anythink.core.common.c.b.b());
            Map<String, String> map = this.j;
            if (map != null && map.size() != 0) {
                try {
                    e.put("cached", new JSONObject(this.j));
                } catch (Throwable unused) {
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                com.anythink.core.common.j.a.a().a(jSONObject);
                if (jSONObject.length() > 0) {
                    e.put(e.bg, jSONObject.toString());
                }
            } catch (Throwable unused2) {
            }
            e.putOpt(e.bh, 1);
            if (!TextUtils.isEmpty(this.e)) {
                e.put(e.bm, this.e);
            }
            e.put(e.bp, com.anythink.core.common.d.t.b().E());
            Pair<Integer, List<String>> I = com.anythink.core.common.d.t.b().I();
            if (I != null && I.first != null) {
                e.put(e.bq, ((Integer) I.first).intValue());
            }
        } catch (JSONException unused3) {
        }
        return e;
    }

    @Override // com.anythink.core.common.m.a
    protected final JSONObject f() {
        return super.f();
    }

    @Override // com.anythink.core.common.m.a
    protected final Object a(Object obj) {
        try {
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                if (this.i != null) {
                    jSONObject.put("custom", new JSONObject(this.i));
                }
            }
        } catch (Exception unused) {
        }
        com.anythink.core.common.u.e.a("app", (String) null, this.g, System.currentTimeMillis(), SystemClock.elapsedRealtime() - this.h, (ATAdRequest) null);
        return obj;
    }

    @Override // com.anythink.core.common.m.a
    protected final void b(AdError adError) {
        com.anythink.core.common.u.e.a("app", adError.getPlatformCode(), adError.getPlatformMSG(), b(), "", "", "", (ATAdRequest) null);
    }

    @Override // com.anythink.core.common.m.a
    protected final List<String> q() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(j.aa.f3673a);
        return arrayList;
    }

    @Override // com.anythink.core.common.m.a
    protected final com.anythink.core.common.m.b.d m() {
        return com.anythink.core.common.m.b.d.a(com.anythink.core.common.m.b.g.b, this.c);
    }

    public final f a(String str) {
        this.k = str;
        return this;
    }
}
