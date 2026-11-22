package sg.bigo.ads.controller.c;

import android.os.SystemClock;
import android.text.TextUtils;
import com.anythink.basead.c.b;
import com.iflytek.cloud.ErrorCode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.api.core.c;

/* loaded from: classes9.dex */
public class b implements sg.bigo.ads.api.core.c {
    int A;
    public final Map<String, String> B;
    int C;
    private JSONObject D;
    private final long E;
    private final long G;
    private final sg.bigo.ads.api.core.h H;
    private long I;
    private int J;
    private int K;
    private boolean M;
    private long N;
    private final String O;
    private String P;
    private boolean Q;
    private boolean R;
    private String S;
    private final double U;
    private String V;
    private final boolean W;
    private String X;
    private String Y;
    private String Z;

    /* renamed from: a, reason: collision with root package name */
    List<sg.bigo.ads.api.core.c> f19852a;
    private c.d aa;
    private String ab;
    private int ac;
    private int ad;
    private boolean ae;
    private int af;
    private boolean ag;

    /* renamed from: ai, reason: collision with root package name */
    private int f19853ai;
    private int aj;
    private sg.bigo.ads.api.core.q ak;
    private String al;
    private int am;
    private int an;
    private int ao;
    private int ap;
    protected final sg.bigo.ads.api.a.l b;
    protected String c;
    protected String d;
    protected String e;
    protected String f;
    protected final String g;
    protected int h;
    protected int i;
    protected long j;
    protected String k;
    protected String l;
    protected c.e m;
    protected c.f[] n;
    protected c.f[] o;
    protected c.f[] p;

    /* renamed from: q, reason: collision with root package name */
    protected c.f[] f19854q;
    protected List<c.InterfaceC1067c> r;
    protected String s;
    protected long t;
    protected String u;
    protected String v;
    protected c.b w;
    protected c.a x;
    sg.bigo.ads.api.a.m y;
    public String z;
    private int L = 0;
    private int T = 2;
    private int ah = 1;
    private sg.bigo.ads.api.core.j aq = new sg.bigo.ads.api.core.j();
    private final long F = SystemClock.elapsedRealtime();

    protected b(long j, sg.bigo.ads.api.core.h hVar, sg.bigo.ads.api.a.l lVar, JSONObject jSONObject) {
        JSONObject jSONObject2;
        this.am = 1;
        this.an = 0;
        this.ao = 1;
        this.C = 0;
        this.G = j;
        this.H = hVar;
        this.b = lVar;
        this.c = jSONObject.optString("ad_id", "");
        this.d = jSONObject.optString("title", "");
        this.e = jSONObject.optString("description", "");
        this.f = jSONObject.optString(b.a.k, "");
        String optString = jSONObject.optString("dsp_name", "");
        this.g = optString;
        this.W = "BigoDsp".equalsIgnoreCase(optString);
        this.h = jSONObject.optInt("adx_type", 0);
        this.i = jSONObject.optInt("ad_type", -1);
        this.j = jSONObject.optLong("sid");
        this.k = jSONObject.optString("creative_id", "");
        this.l = jSONObject.optString("series_id", "");
        JSONObject optJSONObject = jSONObject.optJSONObject(com.qumeng.overseas.advlib.__remote__.core.proto.response.presenter.helper.b.f12848a);
        if (optJSONObject != null) {
            this.m = new o(optJSONObject);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("track_clicks_third");
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                if (optJSONObject2 != null) {
                    arrayList.add(new p(optJSONObject2));
                }
            }
            c.f[] fVarArr = new c.f[arrayList.size()];
            this.o = fVarArr;
            this.o = (c.f[]) arrayList.toArray(fVarArr);
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("track_impls_third");
        if (optJSONArray2 != null) {
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                JSONObject optJSONObject3 = optJSONArray2.optJSONObject(i2);
                if (optJSONObject3 != null) {
                    arrayList2.add(new p(optJSONObject3));
                }
            }
            c.f[] fVarArr2 = new c.f[arrayList2.size()];
            this.n = fVarArr2;
            this.n = (c.f[]) arrayList2.toArray(fVarArr2);
        }
        JSONArray optJSONArray3 = jSONObject.optJSONArray("ad_nurls");
        if (optJSONArray3 != null) {
            ArrayList arrayList3 = new ArrayList();
            for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                JSONObject optJSONObject4 = optJSONArray3.optJSONObject(i3);
                if (optJSONObject4 != null) {
                    arrayList3.add(new p(optJSONObject4));
                }
            }
            c.f[] fVarArr3 = new c.f[arrayList3.size()];
            this.p = fVarArr3;
            this.p = (c.f[]) arrayList3.toArray(fVarArr3);
        }
        JSONArray optJSONArray4 = jSONObject.optJSONArray("ad_lurls");
        if (optJSONArray4 != null) {
            ArrayList arrayList4 = new ArrayList();
            for (int i4 = 0; i4 < optJSONArray4.length(); i4++) {
                JSONObject optJSONObject5 = optJSONArray4.optJSONObject(i4);
                if (optJSONObject5 != null) {
                    arrayList4.add(new p(optJSONObject5));
                }
            }
            c.f[] fVarArr4 = new c.f[arrayList4.size()];
            this.f19854q = fVarArr4;
            this.f19854q = (c.f[]) arrayList4.toArray(fVarArr4);
        }
        this.r = new ArrayList();
        JSONArray optJSONArray5 = jSONObject.optJSONArray("om_data");
        if (optJSONArray5 != null) {
            this.r = new ArrayList();
            for (int i5 = 0; i5 < optJSONArray5.length(); i5++) {
                this.r.add(new m(optJSONArray5.optJSONObject(i5)));
            }
        }
        this.s = jSONObject.optString("enc_price", "");
        this.w = new k(jSONObject);
        this.x = new f(jSONObject);
        this.t = jSONObject.optLong("switch_bit_map", 0L);
        this.u = jSONObject.optString("abflags", "");
        this.E = jSONObject.optLong("expired_interval", 0L);
        this.v = jSONObject.optString("mapping_slot", "");
        this.I = jSONObject.optLong("probe_interval");
        this.J = jSONObject.optInt("playable_ad_switch", 0);
        this.z = jSONObject.optString("req_slot");
        String optString2 = jSONObject.optString("interstitial_style_getad_config");
        if (!TextUtils.isEmpty(optString2)) {
            try {
                this.y = new sg.bigo.ads.controller.b.j(new JSONObject(optString2));
            } catch (JSONException unused) {
            }
        }
        this.aq.a(jSONObject.optString("ad_form"));
        this.P = jSONObject.optString("advertiser");
        this.O = jSONObject.optString("sdk_style_id");
        this.Q = jSONObject.optInt("banner_show_ad", 0) == 1;
        this.R = jSONObject.optInt("banner_show_domain", 0) == 1;
        this.S = jSONObject.optString("ru_ad_marker");
        this.U = (jSONObject.optLong("bid_price", 0L) * 1.0d) / 1.0E8d;
        this.V = jSONObject.optString("adx_country");
        this.aj = jSONObject.optInt("orientation", 0);
        if (sg.bigo.ads.api.core.b.d(this.i)) {
            this.D = jSONObject;
        }
        this.X = jSONObject.optString("ad_bundle_id", "");
        this.Y = jSONObject.optString("pop_h5");
        this.Z = jSONObject.optString("pop_img");
        JSONObject optJSONObject6 = jSONObject.optJSONObject("pop_page");
        if (optJSONObject6 != null) {
            this.aa = new n(optJSONObject6);
        }
        int optInt = jSONObject.optInt("ad_resp_type");
        this.A = optInt;
        if (optInt == 1) {
            jSONObject2 = jSONObject;
            a(jSONObject2, j, hVar, lVar);
        } else {
            jSONObject2 = jSONObject;
        }
        this.B = sg.bigo.ads.common.utils.l.a(jSONObject2.optString("pub_extra_info"));
        this.al = jSONObject2.optString("dsp_extra");
        this.am = jSONObject2.optInt("native_banner_fill_strategy", 1);
        this.an = jSONObject2.optInt("guide_type", 0);
        this.ao = jSONObject2.optInt("native_banner_click_type", 0);
        this.ap = jSONObject2.optInt("is_interactive", 0);
        this.C = jSONObject2.optInt("vpaid_imp_method", 0);
    }

    public static b a(long j, sg.bigo.ads.api.core.h hVar, sg.bigo.ads.api.a.l lVar, String str) {
        try {
            return a(j, hVar, lVar, new JSONObject(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    public static b a(long j, sg.bigo.ads.api.core.h hVar, sg.bigo.ads.api.a.l lVar, JSONObject jSONObject) {
        int optInt = jSONObject.optInt("adx_type", 0);
        if (optInt != 1 && optInt != 2) {
            if (optInt == 3) {
                return new d(j, hVar, lVar, jSONObject);
            }
            if (optInt != 5) {
                return null;
            }
        }
        return new l(j, hVar, lVar, jSONObject);
    }

    private void a(JSONObject jSONObject, long j, sg.bigo.ads.api.core.h hVar, sg.bigo.ads.api.a.l lVar) {
        JSONArray optJSONArray = jSONObject.optJSONArray("ads");
        ArrayList arrayList = null;
        if (optJSONArray != null && optJSONArray.length() > 0) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    b a2 = a(j, hVar, lVar, optJSONObject);
                    if (a2 != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        a2.A = this.A;
                        arrayList.add(a2);
                    } else {
                        sg.bigo.ads.core.d.b.a(1005, ErrorCode.MSP_ERROR_NET_RECVSOCK, "Error ad in ads");
                    }
                }
            }
        }
        this.f19852a = arrayList;
    }

    @Override // sg.bigo.ads.api.core.c
    public final String A() {
        return this.l;
    }

    @Override // sg.bigo.ads.api.core.c
    public final c.e B() {
        return this.m;
    }

    @Override // sg.bigo.ads.api.core.c
    public final c.f[] C() {
        return this.n;
    }

    @Override // sg.bigo.ads.api.core.c
    public final c.f[] D() {
        return this.o;
    }

    @Override // sg.bigo.ads.api.core.c
    public final c.f[] E() {
        return this.p;
    }

    @Override // sg.bigo.ads.api.core.c
    public final c.f[] F() {
        return this.f19854q;
    }

    @Override // sg.bigo.ads.api.core.c
    public final List<c.InterfaceC1067c> G() {
        return this.r;
    }

    @Override // sg.bigo.ads.api.core.c
    public final String H() {
        return this.s;
    }

    @Override // sg.bigo.ads.api.core.c
    public final String I() {
        return this.u;
    }

    @Override // sg.bigo.ads.api.core.c
    public final boolean J() {
        return (!this.M || this.N <= 0) ? SystemClock.elapsedRealtime() - this.F >= this.E * 1000 : System.currentTimeMillis() > this.N;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b A[RETURN] */
    @Override // sg.bigo.ads.api.core.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long K() {
        /*
            r9 = this;
            boolean r0 = r9.M
            r1 = 0
            if (r0 == 0) goto L1e
            long r3 = r9.N
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L1e
            long r5 = r9.E
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r7
            long r3 = r3 - r5
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L1c
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r3
            goto L26
        L1c:
            r5 = r1
            goto L26
        L1e:
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r5 = r9.F
            long r5 = r3 - r5
        L26:
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L2b
            return r5
        L2b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.controller.c.b.K():long");
    }

    @Override // sg.bigo.ads.api.core.c
    public final long L() {
        return this.E;
    }

    @Override // sg.bigo.ads.api.core.c
    public final String M() {
        return this.v;
    }

    @Override // sg.bigo.ads.api.core.c
    public final c.b N() {
        return this.w;
    }

    @Override // sg.bigo.ads.api.core.c
    public final c.a O() {
        return this.x;
    }

    @Override // sg.bigo.ads.api.core.c
    public final int P() {
        return this.A;
    }

    @Override // sg.bigo.ads.api.core.c
    public final String Q() {
        return this.ab;
    }

    @Override // sg.bigo.ads.api.core.c
    public final int R() {
        return this.ac;
    }

    @Override // sg.bigo.ads.api.core.c
    public final void S() {
        this.ac = this.ad;
    }

    @Override // sg.bigo.ads.api.core.c
    public final void T() {
        this.ae = true;
    }

    @Override // sg.bigo.ads.api.core.c
    public final boolean U() {
        return this.ae;
    }

    @Override // sg.bigo.ads.api.core.c
    public final int V() {
        return this.af;
    }

    @Override // sg.bigo.ads.api.core.c
    public final int W() {
        return this.ah;
    }

    @Override // sg.bigo.ads.api.core.c
    public final int X() {
        return this.f19853ai;
    }

    @Override // sg.bigo.ads.api.core.c
    public final sg.bigo.ads.api.core.q Y() {
        return this.ak;
    }

    @Override // sg.bigo.ads.api.core.c
    public final long Z() {
        return this.G;
    }

    @Override // sg.bigo.ads.api.core.c
    public final long a() {
        return sg.bigo.ads.api.a.i.f19524a.i();
    }

    @Override // sg.bigo.ads.api.core.c
    public final void a(int i, int i2, boolean z) {
        if (!this.ag || z) {
            this.ag = true;
            this.ah = i;
            this.f19853ai = i2;
        }
    }

    @Override // sg.bigo.ads.api.core.c
    public final void a(long j) {
        this.N = j;
    }

    @Override // sg.bigo.ads.api.core.c
    public final void a(String str) {
        this.ab = str;
    }

    @Override // sg.bigo.ads.api.core.c
    public final void a(sg.bigo.ads.api.core.q qVar) {
        this.ak = qVar;
    }

    @Override // sg.bigo.ads.api.core.c
    public final void a(boolean z) {
        this.T = z ? 1 : 2;
    }

    @Override // sg.bigo.ads.api.core.c
    public final boolean a(int i) {
        return (this.t & ((long) i)) > 0;
    }

    @Override // sg.bigo.ads.api.core.c
    public final sg.bigo.ads.api.core.h aa() {
        return this.H;
    }

    @Override // sg.bigo.ads.api.core.c
    public final String ab() {
        int i = this.i;
        return (i == 3 && this.h == 3) ? "1999999" : (i == 4 && this.h == 3) ? "2999999" : !sg.bigo.ads.common.utils.q.a((CharSequence) this.O) ? this.O : this.b.p();
    }

    @Override // sg.bigo.ads.api.core.c
    public final boolean ac() {
        return this.J == 1;
    }

    @Override // sg.bigo.ads.api.core.c
    public final int ad() {
        return this.K;
    }

    @Override // sg.bigo.ads.api.core.c
    public final int ae() {
        return this.L;
    }

    @Override // sg.bigo.ads.api.core.c
    public final JSONObject af() {
        return this.D;
    }

    @Override // sg.bigo.ads.api.core.c
    public final void ag() {
        this.M = true;
    }

    @Override // sg.bigo.ads.api.core.c
    public final boolean ah() {
        return this.M;
    }

    @Override // sg.bigo.ads.api.core.c
    public final double ai() {
        return this.U;
    }

    @Override // sg.bigo.ads.api.core.c
    public final int aj() {
        return this.b.v();
    }

    @Override // sg.bigo.ads.api.core.c
    public final boolean ak() {
        return this.b.v() == 2;
    }

    @Override // sg.bigo.ads.api.core.c
    public final boolean al() {
        return this.W;
    }

    @Override // sg.bigo.ads.api.core.c
    public final List<sg.bigo.ads.api.core.c> am() {
        return this.f19852a;
    }

    @Override // sg.bigo.ads.api.core.c
    public final String an() {
        return this.al;
    }

    @Override // sg.bigo.ads.api.core.c
    public final int ao() {
        return this.am;
    }

    @Override // sg.bigo.ads.api.core.c
    public final int ap() {
        return this.an;
    }

    @Override // sg.bigo.ads.api.core.c
    public final int aq() {
        return this.ao;
    }

    @Override // sg.bigo.ads.api.core.c
    public final boolean ar() {
        return this.aj == 1;
    }

    @Override // sg.bigo.ads.api.core.c
    public final int as() {
        return this.ap;
    }

    @Override // sg.bigo.ads.api.core.c
    public final int at() {
        return this.C;
    }

    @Override // sg.bigo.ads.api.core.c
    public final String b() {
        return this.b.l();
    }

    @Override // sg.bigo.ads.api.core.c
    public final String b(String str) {
        if (str == null) {
            return "";
        }
        Map<String, String> map = this.B;
        String str2 = map != null ? map.get(str) : "";
        return str2 == null ? "" : str2;
    }

    @Override // sg.bigo.ads.api.core.c
    public final void b(int i) {
        this.ad = i;
    }

    @Override // sg.bigo.ads.api.core.c
    public final String c() {
        return this.b.n();
    }

    @Override // sg.bigo.ads.api.core.c
    public final void c(int i) {
        this.af = i;
    }

    @Override // sg.bigo.ads.api.core.c
    public final sg.bigo.ads.api.a.l d() {
        return this.b;
    }

    @Override // sg.bigo.ads.api.core.c
    public final void d(int i) {
        this.K = i;
    }

    @Override // sg.bigo.ads.api.core.c
    public final sg.bigo.ads.api.a.m e() {
        return this.y;
    }

    @Override // sg.bigo.ads.api.core.c
    public final void e(int i) {
        this.L = i;
    }

    @Override // sg.bigo.ads.api.core.c
    public final sg.bigo.ads.api.a.e f() {
        return this.aq;
    }

    @Override // sg.bigo.ads.api.core.c
    public final int g() {
        return this.T;
    }

    @Override // sg.bigo.ads.api.core.c
    public final boolean h() {
        sg.bigo.ads.api.a.m mVar = this.y;
        return mVar != null && mVar.a("endpage.ad_component_layout") == 5;
    }

    @Override // sg.bigo.ads.api.core.c
    public final String i() {
        return this.P;
    }

    @Override // sg.bigo.ads.api.core.c
    public final boolean j() {
        return this.Q;
    }

    @Override // sg.bigo.ads.api.core.c
    public final boolean k() {
        return this.R;
    }

    @Override // sg.bigo.ads.api.core.c
    public final String l() {
        return this.S;
    }

    @Override // sg.bigo.ads.api.core.c
    public final String m() {
        return this.V;
    }

    @Override // sg.bigo.ads.api.core.c
    public final String n() {
        return this.X;
    }

    @Override // sg.bigo.ads.api.core.c
    public final String o() {
        return this.Y;
    }

    @Override // sg.bigo.ads.api.core.c
    public final String p() {
        return this.Z;
    }

    @Override // sg.bigo.ads.api.core.c
    public final c.d q() {
        return this.aa;
    }

    @Override // sg.bigo.ads.api.core.c
    public final String r() {
        return this.c;
    }

    @Override // sg.bigo.ads.api.core.c
    public String s() {
        if (!sg.bigo.ads.common.utils.q.a((CharSequence) this.d)) {
            return this.d;
        }
        c.d dVar = this.aa;
        return (dVar == null || sg.bigo.ads.common.utils.q.a((CharSequence) dVar.b())) ? this.d : this.aa.b();
    }

    @Override // sg.bigo.ads.api.core.c
    public String t() {
        if (!sg.bigo.ads.common.utils.q.a((CharSequence) this.e)) {
            return this.e;
        }
        c.d dVar = this.aa;
        return (dVar == null || sg.bigo.ads.common.utils.q.a((CharSequence) dVar.c())) ? this.e : this.aa.c();
    }

    @Override // sg.bigo.ads.api.core.c
    public final String u() {
        return this.f;
    }

    @Override // sg.bigo.ads.api.core.c
    public final String v() {
        return this.g;
    }

    @Override // sg.bigo.ads.api.core.c
    public final int w() {
        return this.h;
    }

    @Override // sg.bigo.ads.api.core.c
    public final int x() {
        return this.i;
    }

    @Override // sg.bigo.ads.api.core.c
    public final long y() {
        return this.j;
    }

    @Override // sg.bigo.ads.api.core.c
    public final String z() {
        return this.k;
    }
}
