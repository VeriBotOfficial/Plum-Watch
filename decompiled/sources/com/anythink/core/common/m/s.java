package com.anythink.core.common.m;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATAdRequest;
import com.anythink.core.api.AdError;
import com.anythink.core.basead.adx.api.ATAdxSetting;
import com.anythink.core.common.d.j;
import com.anythink.core.common.h.bm;
import com.anythink.core.common.w;
import com.wakeup.common.DeviceFeatures;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class s extends a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f4028a = "s";
    public static final String b = "sdk_custom";
    private static final String f = "YXBpdjQ=";
    private JSONObject A;
    private final AtomicInteger B = new AtomicInteger(0);
    private ATAdRequest C;
    private String D;
    private boolean E;
    private final bm F;
    Map<String, Object> c;
    long d;
    long e;
    private String g;
    private String h;
    private String i;
    private Context j;
    private String k;
    private String l;
    private String u;
    private Map<String, Object> v;
    private Map<String, String> w;
    private int x;
    private JSONObject y;
    private String z;

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
    protected final int l() {
        return DeviceFeatures.DIAL_THUMB;
    }

    public s(Context context, bm bmVar) {
        this.y = null;
        this.F = bmVar;
        if (bmVar != null) {
            this.k = bmVar.b();
            this.l = bmVar.c();
            this.j = context;
            this.i = bmVar.d();
            this.g = com.anythink.core.common.d.t.b().r();
            this.h = com.anythink.core.common.d.t.b().g(this.i);
            this.u = bmVar.e();
            this.c = bmVar.f();
            this.v = bmVar.g();
            this.x = bmVar.h();
            this.w = bmVar.i();
            this.y = bmVar.k();
            this.z = bmVar.l();
            this.A = bmVar.m();
            this.C = bmVar.j();
        }
    }

    @Override // com.anythink.core.common.m.a
    public final void a(int i, q qVar) {
        this.d = System.currentTimeMillis();
        this.e = SystemClock.elapsedRealtime();
        super.a(i, qVar);
    }

    @Override // com.anythink.core.common.m.a
    protected String b() {
        if (!TextUtils.isEmpty(this.D)) {
            return this.D;
        }
        com.anythink.core.common.i.a();
        return com.anythink.core.common.i.c();
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
        return this.k;
    }

    @Override // com.anythink.core.common.m.a
    protected final Context i() {
        return this.j;
    }

    @Override // com.anythink.core.common.m.a
    protected final String j() {
        return this.l;
    }

    @Override // com.anythink.core.common.m.a
    protected JSONObject e() {
        Object obj;
        JSONObject e = super.e();
        try {
            e.put("app_id", this.k);
            e.put(e.bk, this.i);
            e.put("session_id", this.h);
            e.put("nw_ver", com.anythink.core.common.v.m.g());
            e.put("exclude_myofferid", com.anythink.core.common.r.a().a(this.j));
            if (com.anythink.core.common.d.t.b().l() != null) {
                e.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.EXCLUDE_OFFER, com.anythink.core.common.d.t.b().l());
            }
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
            JSONObject a2 = e.a(this.c);
            if (a2 != null) {
                e.put("custom", a2);
            }
            e.put("deny", com.anythink.core.common.v.m.q(com.anythink.core.common.d.t.b().g()));
            if (com.anythink.core.common.d.t.b().z()) {
                com.anythink.core.common.d.t.b().A().fillRequestParam(e);
            }
            Map<String, Object> map = this.v;
            if (map != null && (obj = map.get(ATAdConst.KEY.CP_PLACEMENT_ID)) != null) {
                e.put(e.f4016ai, obj.toString());
            }
            Map<String, String> map2 = this.w;
            if (map2 != null && map2.size() != 0) {
                try {
                    e.put("cached", new JSONObject(this.w));
                } catch (Throwable unused) {
                }
            }
            e.put(e.aq, this.x);
            JSONObject a3 = com.anythink.core.c.b.a().a(this.i);
            if (a3 != null) {
                e.put(e.ar, a3);
            }
            if (w.a().a(this.i)) {
                e.put(e.as, 2);
            } else {
                e.put(e.as, 1);
            }
            if (ATAdxSetting.getInstance().isAdxNetworkMode(this.i)) {
                e.put(e.be, 1);
            }
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = this.y;
                if (jSONObject2 != null && jSONObject2.length() > 0) {
                    Iterator<String> keys = this.y.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject.put(next, this.y.get(next));
                    }
                }
                if (jSONObject.length() > 0) {
                    e.put(e.bg, jSONObject.toString());
                }
            } catch (Throwable unused2) {
            }
            e.put(e.bj, new JSONArray(ATAdConst.AD_SUPPORT_SDK_DSP_ID_ARRAY));
            if (!TextUtils.isEmpty(this.z)) {
                e.put(e.bm, this.z);
                JSONObject jSONObject3 = this.A;
                if (jSONObject3 != null) {
                    e.put(e.bn, jSONObject3);
                }
            }
            ATAdRequest aTAdRequest = this.C;
            if (aTAdRequest != null) {
                e.put(e.bp, aTAdRequest.getChannelSource());
            } else {
                e.put(e.bp, com.anythink.core.common.d.t.b().E());
            }
            Pair<Integer, List<String>> I = com.anythink.core.common.d.t.b().I();
            if (I != null && I.first != null) {
                e.put(e.bq, ((Integer) I.first).intValue());
            }
            com.anythink.core.d.b b2 = com.anythink.core.d.d.a(com.anythink.core.common.d.t.b().g()).b(com.anythink.core.common.d.t.b().p());
            if (b2 != null) {
                String f2 = b2.f();
                if (!TextUtils.isEmpty(f2)) {
                    e.put(e.br, f2);
                }
            }
        } catch (JSONException unused3) {
        }
        return e;
    }

    private void a(JSONObject jSONObject) {
        JSONObject a2 = com.anythink.core.c.b.a().a(this.i);
        if (a2 != null) {
            jSONObject.put(e.ar, a2);
        }
    }

    @Override // com.anythink.core.common.m.a
    protected final JSONObject f() {
        return super.f();
    }

    @Override // com.anythink.core.common.m.a
    protected Object a(Object obj) {
        try {
            bm bmVar = this.F;
            if (bmVar != null) {
                bmVar.b(this.E);
            }
            com.anythink.core.common.u.e.a("placement", this.i, this.d, System.currentTimeMillis(), SystemClock.elapsedRealtime() - this.e, this.C);
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                if (this.c != null) {
                    jSONObject.put(b, new JSONObject(this.c));
                }
                return jSONObject;
            }
        } catch (Throwable unused) {
        }
        return obj;
    }

    @Override // com.anythink.core.common.m.a
    protected void b(AdError adError) {
        com.anythink.core.common.u.e.a("placement", adError.getPlatformCode(), adError.getPlatformMSG(), b(), this.i, "", "", this.C);
    }

    @Override // com.anythink.core.common.m.a
    protected final List<String> q() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(j.aa.f3673a);
        return arrayList;
    }

    @Override // com.anythink.core.common.m.a
    protected final com.anythink.core.common.m.b.d m() {
        return com.anythink.core.common.m.b.d.a(com.anythink.core.common.m.b.g.f4000a, this.i);
    }

    @Override // com.anythink.core.common.m.a
    protected final void a(int i, int i2, String str, AdError adError) {
        if (this.r != null) {
            u();
            this.r.onLoadError(i, str, adError);
        }
        b(adError);
        a(i2);
    }

    @Override // com.anythink.core.common.m.a
    protected final void a(int i) {
        try {
            t();
            super.a(i);
        } catch (Throwable unused) {
        }
    }

    private synchronized void t() {
        try {
            b();
            u();
        } catch (Throwable unused) {
        }
    }

    public final s a(String str) {
        this.D = str;
        return this;
    }

    public final s s() {
        this.E = true;
        return this;
    }

    private static boolean u() {
        try {
            com.anythink.core.common.d.t.b();
        } catch (Throwable unused) {
        }
        return false;
    }
}
