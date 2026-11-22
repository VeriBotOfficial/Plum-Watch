package com.anythink.core.common.h;

import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.basead.adx.api.IATAdxHandler;
import com.anythink.core.common.e.o;
import com.anythink.core.d.l;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import io.nats.client.support.ApiConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class ad extends z implements Comparable<ad> {
    public static final String A = "PA";
    public static final int B = 0;
    public static final int C = 1;
    public static final int D = 2;
    public static final int E = 3;
    public static final String x = "";
    public static final String y = "PDB";
    public static final String z = "PD";
    private final String F;
    private boolean G;
    private bv H;
    private String I;
    private a J;
    private IATAdxHandler K;
    private double L;
    private String M;
    private int N;
    private boolean O;
    private String P;
    private int Q;
    private String R;
    private String S;
    private int T;
    private String U;
    private int V;
    private String W;

    /* renamed from: a, reason: collision with root package name */
    public int f3837a;
    public String b;
    public String c;
    public int d;
    public long e;
    public long f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public double l;
    public String m;
    public int n;
    public double o;
    public double p;

    /* renamed from: q, reason: collision with root package name */
    public String f3838q;
    public double r;
    public com.anythink.core.b.c.b s;
    public boolean t;
    public List<ac> u;
    public cd v;
    public JSONObject w;

    public interface a {
        void a(Map<String, Object> map);

        void b(Map<String, Object> map);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(ad adVar) {
        return com.anythink.core.common.v.l.a(this, adVar);
    }

    public ad(boolean z2, double d, String str, String str2, String str3, String str4, String str5) {
        super(z2, d, str, str2, str3, str4, str5, ATAdConst.CURRENCY.USD);
        this.F = getClass().getSimpleName() + ":";
        this.L = 0.0d;
        this.Q = -1;
        this.S = "";
        this.T = 0;
    }

    public ad(boolean z2, double d, double d2, String str, String str2, String str3, String str4, String str5) {
        super(z2, d2, str, str2, str3, str4, str5, ATAdConst.CURRENCY.USD);
        this.F = getClass().getSimpleName() + ":";
        this.L = 0.0d;
        this.Q = -1;
        this.S = "";
        this.T = 0;
        this.sortPrice = d;
    }

    public final boolean a() {
        return this.f < System.currentTimeMillis();
    }

    public final String b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(o.a.c, this.token);
            jSONObject.put(BidResponsed.KEY_CUR, this.b);
            jSONObject.put("origin_price", this.originPrice);
            jSONObject.put("price", this.price);
            jSONObject.put("nurl", this.winNoticeUrl);
            jSONObject.put("lurl", this.loseNoticeUrl);
            jSONObject.put("unit_id", this.c);
            jSONObject.put("nw_firm_id", this.d);
            jSONObject.put("is_success", this.isSuccess ? 1 : 0);
            jSONObject.put(ApiConstants.ERR_CODE, this.f3837a);
            jSONObject.put("err_msg", this.errorMsg);
            jSONObject.put("expire", this.e);
            jSONObject.put("out_data_time", this.f);
            jSONObject.put("is_send_winurl", this.G);
            jSONObject.put("tp_bid_id", this.g);
            jSONObject.put("burl", this.displayNoticeUrl);
            jSONObject.put("ad_source_id", this.k);
            jSONObject.put("cur_rate", this.l);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(com.anythink.core.common.k.f3958ai, this.n);
            jSONObject.put("ctrl", jSONObject2);
            if (!TextUtils.isEmpty(this.m)) {
                jSONObject.put("bid_response", this.m);
            }
            jSONObject.put("ecpm_api", this.o);
            jSONObject.put("cny_ecpm_api", this.p);
            jSONObject.put("precision", this.f3838q);
            jSONObject.put("second_price", this.r);
            jSONObject.put("req_url", this.h);
            jSONObject.put("bd_type", this.useType);
            jSONObject.put(com.anythink.core.common.k.ap, this.sortPrice);
            jSONObject.put("cny_price", this.rmbPrice);
            jSONObject.put("request_id", this.I);
            jSONObject.put("a_r", this.L);
            Object obj = this.w;
            if (obj != null) {
                jSONObject.put("adx_ctrl", obj);
            }
            if (!TextUtils.isEmpty(this.M)) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(com.anythink.core.common.k.aS, this.M);
                jSONObject3.put("id", this.N);
                if (!TextUtils.isEmpty(this.P)) {
                    jSONObject3.put("cny_e_c", this.P);
                }
                jSONObject.put(l.a.aB, jSONObject3);
            }
            jSONObject.put("adx_mtg_mix_type", this.Q);
            jSONObject.put("deal_type", this.S);
            jSONObject.put("deal_id", this.U);
            jSONObject.put("deal_pri", this.V);
            jSONObject.put("origin_request_id", getOriginRequestId());
            jSONObject.put("x_c", this.W);
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    public static ad a(String str) {
        try {
            return a(new JSONObject(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x01be, code lost:
    
        if (r3 == 1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01c0, code lost:
    
        if (r3 == 2) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01c2, code lost:
    
        r6.T = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01c6, code lost:
    
        r6.T = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01c9, code lost:
    
        r6.T = 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.anythink.core.common.h.ad a(org.json.JSONObject r16) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.h.ad.a(org.json.JSONObject):com.anythink.core.common.h.ad");
    }

    private int a(ad adVar) {
        return com.anythink.core.common.v.l.a(this, adVar);
    }

    public final void b(String str) {
        this.I = str;
    }

    public final String c() {
        return this.I;
    }

    public final synchronized boolean d() {
        if (this.G) {
            return true;
        }
        this.G = true;
        return false;
    }

    public final synchronized void e() {
        this.biddingNotice = null;
    }

    public final synchronized void a(ac acVar) {
        if (acVar == null) {
            return;
        }
        if (this.u == null) {
            this.u = Collections.synchronizedList(new ArrayList(4));
        }
        if (!this.u.contains(acVar)) {
            this.u.add(acVar);
        }
    }

    public final synchronized bv f() {
        bv bvVar;
        List<ac> list = this.u;
        bvVar = null;
        if (list != null) {
            Iterator<ac> it = list.iterator();
            while (it.hasNext()) {
                bv a2 = it.next().a();
                if (a2 != null && com.anythink.core.common.v.l.a(a2, bvVar) < 0) {
                    bvVar = a2;
                }
            }
        }
        return bvVar;
    }

    public final synchronized bv g() {
        bv bvVar;
        List<ac> list = this.u;
        bvVar = null;
        if (list != null) {
            Iterator<ac> it = list.iterator();
            while (it.hasNext()) {
                bv b = it.next().b();
                if (b != null && com.anythink.core.common.v.l.a(b, bvVar) < 0) {
                    bvVar = b;
                }
            }
        }
        return bvVar;
    }

    public final synchronized void h() {
        List<ac> list = this.u;
        if (list != null) {
            list.clear();
        }
    }

    private cd y() {
        return this.v;
    }

    private void a(cd cdVar) {
        this.v = cdVar;
    }

    public final void a(IATAdxHandler iATAdxHandler) {
        this.K = iATAdxHandler;
    }

    public final IATAdxHandler i() {
        return this.K;
    }

    public final double j() {
        return this.L;
    }

    public final a k() {
        return this.J;
    }

    public final void a(a aVar) {
        this.J = aVar;
    }

    public final bv l() {
        return this.H;
    }

    public final void a(bv bvVar, double d) {
        this.H = bvVar;
        this.r = d;
    }

    public final String m() {
        return this.M;
    }

    private void d(String str) {
        this.M = str;
    }

    public final String n() {
        return this.P;
    }

    private void e(String str) {
        this.P = str;
    }

    public final int o() {
        return this.N;
    }

    private void b(int i) {
        this.N = i;
    }

    public final boolean p() {
        return this.O;
    }

    public final void q() {
        this.O = true;
    }

    public final String r() {
        return this.R;
    }

    public final void c(String str) {
        this.R = str;
    }

    public final int a(int i) {
        int i2 = this.Q;
        if (i2 < 0 || i != 4) {
            return -1;
        }
        return i2 == 5 ? 3 : 4;
    }

    private List<ac> z() {
        return this.u;
    }

    public final boolean s() {
        return this.T != 0;
    }

    public final int t() {
        return this.T;
    }

    public final String u() {
        return this.S;
    }

    public final String v() {
        return this.U;
    }

    public final int w() {
        return this.V;
    }

    public final String x() {
        return this.W;
    }
}
