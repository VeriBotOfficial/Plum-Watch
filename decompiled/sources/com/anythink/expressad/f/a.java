package com.anythink.expressad.f;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.anythink.core.common.d.j;
import com.anythink.core.common.d.t;
import com.anythink.core.common.v.m;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.h.i;
import com.anythink.expressad.foundation.h.k;
import com.anythink.expressad.foundation.h.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class a {
    private int A;
    private String B;
    private long C;
    private int D;
    private long E;
    private long F;
    private int G;
    private int H;
    private int I;
    private String J;
    private String K;
    private int L;
    private List<d> M;
    private List<com.anythink.expressad.foundation.d.c> N;
    private int R;
    private LinkedList<String> S;
    private int Y;
    private List<String> Z;
    private int aE;
    private long aG;
    private long aH;
    private int aI;
    private int aJ;
    private long aK;
    private int aM;
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    private String ae;
    private String af;
    private String ao;
    private String b;
    private Map<String, C0234a> be;
    private b bg;
    private String bl;
    private String bm;
    private long c;
    private int d;
    private int f;
    private boolean g;
    private Map<String, String> h;
    private boolean i;
    private long j;
    private List<c> l;
    private boolean m;
    private long n;
    private long o;
    private long p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f4751q;
    private int r;
    private int s;
    private int t;
    private long u;
    private List<String> v;
    private int w;
    private int x;
    private int y;
    private int z;

    /* renamed from: a, reason: collision with root package name */
    private int f4749a = 0;
    private long e = 86400;
    private String k = "";
    private boolean O = false;
    private int P = 3;
    private boolean Q = true;
    private int T = 0;
    private int U = 3600;
    private int V = 10;
    private int W = 120;
    private String X = "";
    private int ag = 1;
    private int ah = 1;

    /* renamed from: ai, reason: collision with root package name */
    private int f4750ai = 1;
    private int aj = 0;
    private int ak = 1;
    private String al = "";
    private int am = 0;
    private int an = 2;
    private int ap = 86400;
    private String aq = "LdxThdi1WBK\\/WgfPhbxQYkeXHBPwHZKAJ7eXHM==";
    private String ar = "LdxThdi1WBK\\/WgfPhbxQYkeXHBPwHZKsYFh=";
    private int as = 1;
    private int at = 30;
    private int au = 5;
    private int av = 0;
    private int aw = 0;
    private int ax = j.g.b.f3686a;
    private int ay = 0;
    private int az = 0;
    private int aA = 0;
    private int aB = 2;
    private int aC = 10;
    private List<Integer> aD = new ArrayList();
    private int aF = 1;
    private int aL = 3;
    private String aN = "";
    private String aO = "";
    private String aP = "";
    private String aQ = "";
    private String aR = "";
    private int aS = 0;
    private int aT = 21600;
    private int aU = 2;
    private int aV = 0;
    private int aW = 0;
    private int aX = 604800;
    private int aY = 0;
    private String aZ = "";
    private String ba = "";
    private String bb = "";
    private String bc = "";
    private String bd = "";
    private int bf = 0;
    private int bh = 0;
    private String bi = "";
    private int bj = 2;
    private int bk = 7200;
    private int bn = 0;
    private boolean bo = false;
    private int bp = 1;
    private int bq = 0;
    private int br = 0;
    private int bs = 0;
    private int bt = 3;
    private int bu = 600;
    private int bv = 10;

    public final void a() {
        this.R = 10;
    }

    private int W() {
        return this.R;
    }

    private List<com.anythink.expressad.foundation.d.c> X() {
        return this.N;
    }

    private String Y() {
        return this.X;
    }

    private void e(String str) {
        this.X = str;
    }

    private int Z() {
        return this.V;
    }

    private void g(int i) {
        this.V = i;
    }

    public final int b() {
        return this.W;
    }

    public final void a(int i) {
        this.W = i;
    }

    private LinkedList<String> aa() {
        return this.S;
    }

    private int ab() {
        return this.f4749a;
    }

    public final void c() {
        this.f4749a = 0;
    }

    private void a(LinkedList<String> linkedList) {
        this.S = linkedList;
    }

    private int ac() {
        return this.T;
    }

    private void h(int i) {
        this.T = i;
    }

    private int ad() {
        return this.U * 1000;
    }

    private void i(int i) {
        this.U = i;
    }

    private void a(List<com.anythink.expressad.foundation.d.c> list) {
        this.N = list;
    }

    public final void b(int i) {
        if (i > 0) {
            this.aC = i;
        }
    }

    private int ae() {
        return this.aC;
    }

    public final void c(int i) {
        this.ay = i;
    }

    private int af() {
        return this.ay;
    }

    public final void d(int i) {
        this.az = i;
    }

    private int ag() {
        return this.az;
    }

    public final void e(int i) {
        this.aA = i;
    }

    private int ah() {
        return this.aA;
    }

    public final void f(int i) {
        this.aB = i;
    }

    private int ai() {
        return this.aB;
    }

    private int aj() {
        return this.as;
    }

    private void j(int i) {
        this.aD.add(Integer.valueOf(i));
    }

    private boolean k(int i) {
        return this.aD.contains(Integer.valueOf(i));
    }

    private void l(int i) {
        this.as = i;
    }

    private String ak() {
        return this.aq;
    }

    private void f(String str) {
        this.aq = str;
    }

    private String al() {
        return this.ar;
    }

    private void g(String str) {
        this.ar = str;
    }

    private int am() {
        return this.ap;
    }

    private void m(int i) {
        this.ap = i;
    }

    private int an() {
        return this.an;
    }

    private void n(int i) {
        this.an = i;
    }

    private String ao() {
        return this.ao;
    }

    private void h(String str) {
        this.ao = str;
    }

    private int ap() {
        return this.ag;
    }

    public final void d() {
        this.ag = 1;
    }

    private int aq() {
        return this.ah;
    }

    public final void e() {
        this.ah = 1;
    }

    private int ar() {
        return this.f4750ai;
    }

    public final void f() {
        this.f4750ai = 1;
    }

    private int as() {
        return this.aj;
    }

    public final void g() {
        this.aj = 0;
    }

    private int at() {
        return this.ak;
    }

    public final void h() {
        this.ak = 1;
    }

    private String au() {
        return this.al;
    }

    private void i(String str) {
        this.al = str;
    }

    private int av() {
        return this.am;
    }

    public final void i() {
        this.am = -1;
    }

    private int aw() {
        return this.L;
    }

    public final void j() {
        this.L = 1;
    }

    private String ax() {
        return this.K;
    }

    public final void a(String str) {
        this.K = str;
    }

    private int ay() {
        return this.aF;
    }

    private void o(int i) {
        this.aF = i;
    }

    private int az() {
        return this.aE;
    }

    private void p(int i) {
        this.aE = i;
    }

    private int aA() {
        return this.Y;
    }

    private void q(int i) {
        this.Y = i;
    }

    private List<String> aB() {
        return this.Z;
    }

    private void b(List<String> list) {
        this.Z = list;
    }

    private int aC() {
        return this.aa;
    }

    private void r(int i) {
        this.aa = i;
    }

    private int aD() {
        return this.ab;
    }

    private void s(int i) {
        this.ab = i;
    }

    private int aE() {
        return this.ac;
    }

    private void t(int i) {
        this.ac = i;
    }

    private int aF() {
        return this.ad;
    }

    private void u(int i) {
        this.ad = i;
    }

    private String aG() {
        return this.ae;
    }

    private void j(String str) {
        this.ae = str;
    }

    private int aH() {
        return this.G;
    }

    private void v(int i) {
        this.G = i;
    }

    private int aI() {
        return this.H;
    }

    private void w(int i) {
        this.H = i;
    }

    private List<d> aJ() {
        return this.M;
    }

    private void c(List<d> list) {
        this.M = list;
    }

    private int aK() {
        return this.I;
    }

    private void x(int i) {
        this.I = i;
    }

    private String aL() {
        return this.J;
    }

    private void k(String str) {
        this.J = str;
    }

    private int aM() {
        return this.D;
    }

    private void y(int i) {
        this.D = i;
    }

    private long aN() {
        return this.E;
    }

    private void a(long j) {
        this.E = j;
    }

    private long aO() {
        return this.F;
    }

    private void z(int i) {
        this.F = i;
    }

    private long aP() {
        return this.C * 1000;
    }

    private void b(long j) {
        this.C = j;
    }

    private int aQ() {
        return this.t;
    }

    private void A(int i) {
        this.t = i;
    }

    private String aR() {
        return this.B;
    }

    private void l(String str) {
        this.B = str;
    }

    public final int k() {
        return this.A;
    }

    private void B(int i) {
        this.A = i;
    }

    private int aS() {
        return this.x;
    }

    private void C(int i) {
        this.x = i;
    }

    private int aT() {
        return this.y;
    }

    private void D(int i) {
        this.y = i;
    }

    private int aU() {
        return this.z;
    }

    private void E(int i) {
        this.z = i;
    }

    public final long l() {
        if (this.u <= 0) {
            this.u = com.anythink.expressad.f.a.b.Q;
        }
        return this.u;
    }

    public final void m() {
        this.u = com.anythink.expressad.f.a.b.Q;
    }

    private int aV() {
        return this.aL;
    }

    private void F(int i) {
        this.aL = i;
    }

    public final int n() {
        return this.aM;
    }

    public final void o() {
        this.aM = com.anythink.expressad.f.a.b.by;
    }

    private long aW() {
        return this.aK;
    }

    public final void p() {
        this.aK = 1800L;
    }

    private int aX() {
        return this.aI;
    }

    private void G(int i) {
        this.aI = i;
    }

    private int aY() {
        return this.aJ;
    }

    private void H(int i) {
        this.aJ = i;
    }

    private long aZ() {
        return this.aG * 1000;
    }

    private void c(long j) {
        this.aG = j;
    }

    public final long q() {
        return this.aH * 1000;
    }

    public final void r() {
        this.aH = 10L;
    }

    public final boolean s() {
        return this.f4751q;
    }

    public final void t() {
        this.f4751q = false;
    }

    private long ba() {
        return this.p;
    }

    private void d(long j) {
        this.p = j;
    }

    public final boolean u() {
        return this.m;
    }

    public final void v() {
        this.m = false;
    }

    public final long w() {
        return this.n;
    }

    public final void x() {
        this.n = com.anythink.expressad.f.a.b.P;
    }

    private long bb() {
        return this.o;
    }

    public final void y() {
        this.o = 0L;
    }

    public final String toString() {
        return "cc=" + this.b + " upal=" + this.c + " cfc=" + this.d + " getpf=" + this.e + " uplc=" + this.f + " rurl=" + this.m;
    }

    public final String z() {
        return this.b;
    }

    private void m(String str) {
        this.b = str;
    }

    private long bc() {
        return this.c;
    }

    private void e(long j) {
        this.c = j;
    }

    private int bd() {
        return this.d;
    }

    public final void A() {
        this.d = 1;
    }

    private long be() {
        return this.e;
    }

    private void f(long j) {
        this.e = j;
    }

    private int bf() {
        return this.f;
    }

    private void I(int i) {
        this.f = i;
    }

    private List<c> bg() {
        return this.l;
    }

    private void d(List<c> list) {
        this.l = list;
    }

    private String bh() {
        return this.af;
    }

    private void n(String str) {
        this.af = str;
    }

    private void o(String str) {
        this.k = str;
    }

    private String bi() {
        return this.k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static a b(String str) {
        ArrayList arrayList;
        ArrayList arrayList2 = null;
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                a aVar = new a();
                try {
                    aVar.b = jSONObject.optString(com.anythink.expressad.f.a.b.h);
                    aVar.K = jSONObject.optString(com.anythink.expressad.f.a.b.j, "anythink");
                    aVar.c = jSONObject.optLong(com.anythink.expressad.f.a.b.l);
                    aVar.d = jSONObject.optInt(com.anythink.expressad.f.a.b.m);
                    aVar.e = jSONObject.optLong("getpf");
                    aVar.f = jSONObject.optInt(com.anythink.expressad.f.a.b.p);
                    aVar.g = jSONObject.optBoolean(com.anythink.expressad.f.a.b.w);
                    aVar.j = jSONObject.optLong("current_time");
                    aVar.i = jSONObject.optBoolean(com.anythink.expressad.f.a.b.o);
                    aVar.o = jSONObject.optLong(com.anythink.expressad.f.a.b.B);
                    aVar.n = jSONObject.optLong("plct") == 0 ? com.anythink.expressad.f.a.b.P : jSONObject.optLong("plct");
                    aVar.m = jSONObject.optBoolean(com.anythink.expressad.f.a.b.C);
                    aVar.p = jSONObject.optLong(com.anythink.expressad.f.a.b.F);
                    aVar.f4751q = jSONObject.optBoolean(com.anythink.expressad.f.a.b.G);
                    aVar.r = jSONObject.optInt(com.anythink.expressad.f.a.b.X);
                    aVar.s = jSONObject.optInt(com.anythink.expressad.f.a.b.Y);
                    aVar.L = jSONObject.optInt(com.anythink.expressad.f.a.b.k);
                    aVar.t = jSONObject.optInt(com.anythink.expressad.f.a.b.Z, 1800);
                    aVar.x = jSONObject.optInt(com.anythink.expressad.f.a.b.aa);
                    aVar.u = jSONObject.optLong("plctb") == 0 ? com.anythink.expressad.f.a.b.Q : jSONObject.optLong("plctb");
                    aVar.aI = jSONObject.optInt(com.anythink.expressad.f.a.b.ad);
                    aVar.aJ = jSONObject.optInt(com.anythink.expressad.f.a.b.ae);
                    aVar.x = jSONObject.optInt(com.anythink.expressad.f.a.b.aa, 100);
                    aVar.y = jSONObject.optInt(com.anythink.expressad.f.a.b.af, 2);
                    aVar.z = jSONObject.optInt(com.anythink.expressad.f.a.b.ag, 2);
                    boolean z = true;
                    aVar.A = jSONObject.optInt(com.anythink.expressad.f.a.b.ah, 1);
                    aVar.aK = jSONObject.optLong(com.anythink.expressad.f.a.b.f4754ai, 1800L);
                    aVar.B = jSONObject.optString(com.anythink.expressad.f.a.b.aj);
                    aVar.C = jSONObject.optLong(com.anythink.expressad.f.a.b.ak, 21600000L);
                    aVar.D = jSONObject.optInt(com.anythink.expressad.f.a.b.aE, 1);
                    aVar.E = jSONObject.optInt(com.anythink.expressad.f.a.b.aF, 604800);
                    aVar.F = jSONObject.optInt(com.anythink.expressad.f.a.b.aG, com.anythink.expressad.f.a.b.aK);
                    aVar.aL = jSONObject.optInt(com.anythink.expressad.f.a.b.bo, 3);
                    aVar.aF = jSONObject.optInt(com.anythink.expressad.f.a.b.bw, 1);
                    aVar.af = jSONObject.optString(com.anythink.expressad.f.a.b.aH, "");
                    aVar.aE = jSONObject.optInt(com.anythink.expressad.f.a.b.al, 1);
                    aVar.ah = jSONObject.optInt(com.anythink.expressad.f.a.b.bF, 1);
                    aVar.ag = jSONObject.optInt(com.anythink.expressad.f.a.b.bG, 1);
                    aVar.f4750ai = jSONObject.optInt(com.anythink.expressad.f.a.b.bH, 1);
                    int i = 0;
                    aVar.aj = jSONObject.optInt(com.anythink.expressad.f.a.b.bI, 0);
                    aVar.ak = jSONObject.optInt(com.anythink.expressad.f.a.b.bJ, 1);
                    aVar.am = jSONObject.optInt(com.anythink.expressad.f.a.b.bL, -1);
                    aVar.an = jSONObject.optInt(com.anythink.expressad.f.a.b.bW, 2);
                    aVar.ap = jSONObject.optInt(com.anythink.expressad.f.a.b.bZ, 86400);
                    aVar.ao = jSONObject.optString(com.anythink.expressad.f.a.b.bX);
                    aVar.ar = jSONObject.optString(com.anythink.expressad.f.a.b.cH);
                    aVar.aq = jSONObject.optString(com.anythink.expressad.f.a.b.cG);
                    aVar.as = jSONObject.optInt(com.anythink.expressad.f.a.b.cO);
                    aVar.U = jSONObject.optInt(com.anythink.expressad.f.a.b.cj, 3600);
                    aVar.T = jSONObject.optInt(com.anythink.expressad.f.a.b.ci, 0);
                    try {
                        JSONArray optJSONArray = jSONObject.optJSONArray(com.anythink.expressad.f.a.b.ch);
                        if (optJSONArray != null && optJSONArray.length() > 0) {
                            LinkedList<String> linkedList = new LinkedList<>();
                            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                                linkedList.add(optJSONArray.optString(i2));
                            }
                            aVar.S = linkedList;
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    long optLong = jSONObject.optLong(com.anythink.expressad.f.a.b.ab);
                    if (optLong == 0) {
                        aVar.aG = 20L;
                    } else {
                        aVar.aG = optLong;
                    }
                    long optLong2 = jSONObject.optLong(com.anythink.expressad.f.a.b.ac);
                    if (optLong2 == 0) {
                        aVar.aH = 10L;
                    } else {
                        aVar.aH = optLong2;
                        JSONArray optJSONArray2 = jSONObject.optJSONArray(com.anythink.expressad.f.a.b.v);
                        if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                            HashMap hashMap = new HashMap();
                            for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                                JSONObject optJSONObject = optJSONArray2.optJSONObject(i3);
                                hashMap.put(optJSONObject.optString("domain"), optJSONObject.optString("format"));
                            }
                            aVar.h = hashMap;
                        }
                    }
                    aVar.G = jSONObject.optInt(com.anythink.expressad.f.a.b.ao, 3);
                    aVar.H = jSONObject.optInt(com.anythink.expressad.f.a.b.ap, 86400);
                    aVar.I = jSONObject.optInt("iex", 1);
                    JSONArray optJSONArray3 = jSONObject.optJSONArray(com.anythink.expressad.f.a.b.ar);
                    if (optJSONArray3 == null || optJSONArray3.length() <= 0) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList();
                        for (int i4 = 0; i4 < optJSONArray3.length(); i4++) {
                            String optString = optJSONArray3.optString(i4);
                            if (y.b(optString)) {
                                arrayList.add(d.a(new JSONObject(optString)));
                            }
                        }
                    }
                    if (arrayList != null) {
                        aVar.M = arrayList;
                    }
                    try {
                        JSONArray optJSONArray4 = jSONObject.optJSONArray(com.anythink.expressad.f.a.b.as);
                        if (optJSONArray4 != null && optJSONArray4.length() > 0) {
                            arrayList2 = new ArrayList();
                            for (int i5 = 0; i5 < optJSONArray4.length(); i5++) {
                                String optString2 = optJSONArray4.optString(i5);
                                if (y.b(optString2)) {
                                    JSONObject jSONObject2 = new JSONObject(optString2);
                                    arrayList2.add(new com.anythink.expressad.foundation.d.c(jSONObject2.optInt("adtype"), jSONObject2.optString("unitid")));
                                }
                            }
                        }
                        if (arrayList2 != null) {
                            aVar.N = arrayList2;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    aVar.aM = jSONObject.optInt(com.anythink.expressad.f.a.b.at, com.anythink.expressad.f.a.b.by);
                    aVar.Y = jSONObject.optInt("pf", 900);
                    aVar.aa = jSONObject.optInt(com.anythink.expressad.f.a.b.aA, 20);
                    aVar.ae = jSONObject.optString("pid");
                    JSONArray optJSONArray5 = jSONObject.optJSONArray(com.anythink.expressad.f.a.b.av);
                    if (optJSONArray5 != null && optJSONArray5.length() > 0) {
                        ArrayList arrayList3 = new ArrayList();
                        for (int i6 = 0; i6 < optJSONArray5.length(); i6++) {
                            arrayList3.add(optJSONArray5.optString(i6));
                        }
                        aVar.Z = arrayList3;
                    }
                    JSONObject optJSONObject2 = jSONObject.optJSONObject(com.anythink.expressad.f.a.b.aw);
                    if (optJSONObject2 != null) {
                        aVar.ab = optJSONObject2.optInt(com.anythink.expressad.f.a.b.ax, 1);
                        aVar.ac = optJSONObject2.optInt(com.anythink.expressad.f.a.b.ay, 1);
                        aVar.ad = optJSONObject2.optInt("delete", 1);
                    }
                    aVar.aN = jSONObject.optString(com.anythink.expressad.f.a.b.cu, "");
                    aVar.aO = jSONObject.optString(com.anythink.expressad.f.a.b.cv, "");
                    aVar.aP = jSONObject.optString(com.anythink.expressad.f.a.b.cw, "");
                    aVar.aQ = jSONObject.optString(com.anythink.expressad.f.a.b.cx, "");
                    aVar.aR = jSONObject.optString(com.anythink.expressad.f.a.b.cy, "");
                    aVar.aS = jSONObject.optInt(com.anythink.expressad.f.a.b.cz, 0);
                    aVar.aT = jSONObject.optInt(com.anythink.expressad.f.a.b.cA, 21600);
                    aVar.aU = jSONObject.optInt(com.anythink.expressad.f.a.b.cB, 2);
                    aVar.aV = jSONObject.optInt(com.anythink.expressad.f.a.b.cC, 0);
                    aVar.aW = jSONObject.optInt(com.anythink.expressad.f.a.b.cD, 0);
                    aVar.aX = jSONObject.optInt(com.anythink.expressad.f.a.b.cE, 604800);
                    aVar.aY = jSONObject.optInt(com.anythink.expressad.f.a.b.cF, 0);
                    aVar.aZ = jSONObject.optString("adchoice_icon", "");
                    aVar.bb = jSONObject.optString("adchoice_link", "");
                    aVar.ba = jSONObject.optString("adchoice_size", "");
                    aVar.bd = jSONObject.optString("platform_logo", "");
                    aVar.bc = jSONObject.optString("platform_name", "");
                    aVar.be = z(jSONObject.optString(com.anythink.expressad.f.a.b.cN, ""));
                    aVar.f4749a = jSONObject.optInt(com.anythink.expressad.f.a.b.cP, 0);
                    aVar.bh = jSONObject.optInt(com.anythink.expressad.f.a.b.cR, 0);
                    aVar.W = jSONObject.optInt(com.anythink.expressad.f.a.b.dj, 120);
                    aVar.V = jSONObject.optInt(com.anythink.expressad.f.a.b.dh, 10);
                    aVar.X = jSONObject.optString(com.anythink.expressad.f.a.b.dJ, "");
                    aVar.bi = jSONObject.optString(com.anythink.expressad.f.a.b.cU, "");
                    aVar.bj = jSONObject.optInt(com.anythink.expressad.f.a.b.cV, 2);
                    aVar.bk = jSONObject.optInt(com.anythink.expressad.f.a.b.cW, 7200);
                    aVar.bm = jSONObject.optString(com.anythink.expressad.f.a.b.dt);
                    aVar.bl = jSONObject.optString(com.anythink.expressad.f.a.b.dB);
                    int optInt = jSONObject.optInt(com.anythink.expressad.f.a.b.du, 0);
                    if (optInt > 2 || optInt < 0) {
                        optInt = 0;
                    }
                    aVar.bn = optInt;
                    aVar.bo = jSONObject.optBoolean(com.anythink.expressad.f.a.b.dx, false);
                    JSONArray optJSONArray6 = jSONObject.optJSONArray(com.anythink.expressad.f.a.b.ds);
                    if (optJSONArray6 != null && optJSONArray6.length() > 0) {
                        for (int i7 = 0; i7 < optJSONArray6.length(); i7++) {
                            JSONObject jSONObject3 = optJSONArray6.getJSONObject(i7);
                            Iterator<String> keys = jSONObject3.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                if (!TextUtils.isEmpty(next) && jSONObject3.getBoolean(next)) {
                                    aVar.aD.add(Integer.valueOf(Integer.parseInt(next)));
                                }
                            }
                        }
                    }
                    try {
                        int optInt2 = jSONObject.optInt("lqcnt", 30);
                        int optInt3 = jSONObject.optInt("lqto", 5);
                        int optInt4 = jSONObject.optInt("lqswt", 0);
                        int optInt5 = jSONObject.optInt("lqtype", 0);
                        aVar.au = optInt3;
                        aVar.at = optInt2;
                        aVar.av = optInt4;
                        aVar.aw = optInt5;
                        int parseInt = Integer.parseInt(com.anythink.core.express.a.a.b(jSONObject.optString("lqpt")));
                        if (parseInt > 0 && parseInt < 65535) {
                            aVar.ax = parseInt;
                        }
                    } catch (Exception unused) {
                    }
                    aVar.bp = jSONObject.optInt(com.anythink.expressad.f.a.b.dC, 0);
                    try {
                        int optInt6 = jSONObject.optInt("l", 3);
                        boolean z2 = jSONObject.optInt("k", 0) == 1;
                        if (jSONObject.optInt("m", 1) != 1) {
                            z = false;
                        }
                        aVar.P = optInt6;
                        aVar.O = z2;
                        aVar.Q = z;
                    } catch (Exception e2) {
                        e2.getMessage();
                    }
                    aVar.bf = jSONObject.optInt(com.anythink.expressad.f.a.b.dL, 0);
                    aVar.bg = b.a(jSONObject.optJSONObject(com.anythink.expressad.f.a.b.dM));
                    try {
                        int optInt7 = jSONObject.optInt(com.anythink.expressad.f.a.b.dR, com.anythink.expressad.foundation.g.a.cL);
                        int optInt8 = jSONObject.optInt(com.anythink.expressad.f.a.b.dS, com.anythink.expressad.foundation.g.a.cN);
                        int optInt9 = jSONObject.optInt(com.anythink.expressad.f.a.b.dT, com.anythink.expressad.foundation.g.a.cO);
                        int optInt10 = jSONObject.optInt(com.anythink.expressad.f.a.b.dV, com.anythink.expressad.foundation.g.a.cT);
                        if (optInt7 <= 0) {
                            optInt7 = com.anythink.expressad.foundation.g.a.cL;
                        }
                        if (optInt8 <= 0) {
                            optInt8 = com.anythink.expressad.foundation.g.a.cN;
                        }
                        if (optInt9 <= 0) {
                            optInt9 = com.anythink.expressad.foundation.g.a.cO;
                        }
                        if (optInt10 < 0) {
                            optInt10 = com.anythink.expressad.foundation.g.a.cT;
                        }
                        aVar.aA = optInt7;
                        aVar.ay = optInt8;
                        aVar.az = optInt9;
                        aVar.aB = optInt10;
                        int optInt11 = jSONObject.optInt(com.anythink.expressad.f.a.b.dU, 0);
                        if (optInt11 >= 0) {
                            i = optInt11;
                        }
                        aVar.R = i;
                        aVar.b(jSONObject.optInt(com.anythink.expressad.f.a.b.dW, 10));
                        return aVar;
                    } catch (Exception unused2) {
                        arrayList2 = aVar;
                    }
                } catch (Exception e3) {
                    e = e3;
                    arrayList2 = aVar;
                    e.printStackTrace();
                    return arrayList2;
                }
            }
        } catch (Exception e4) {
            e = e4;
        }
        return arrayList2;
    }

    private long bj() {
        return this.j;
    }

    private void g(long j) {
        this.j = j;
    }

    private Map<String, String> bk() {
        return this.h;
    }

    private void a(Map<String, String> map) {
        this.h = map;
    }

    private boolean bl() {
        return this.g;
    }

    private void a(boolean z) {
        this.g = z;
    }

    public static String c(String str) {
        try {
            com.anythink.expressad.f.b.a();
            com.anythink.expressad.foundation.b.a.c().f();
            a b2 = com.anythink.expressad.f.b.b();
            if (b2 != null && b2.h != null) {
                String host = Uri.parse(str).getHost();
                Iterator<Map.Entry<String, String>> it = b2.h.entrySet().iterator();
                while (it.hasNext()) {
                    String key = it.next().getKey();
                    if (!TextUtils.isEmpty(host) && host.contains(key)) {
                        String str2 = b2.h.get(key);
                        if (TextUtils.isEmpty(str2)) {
                            return "";
                        }
                        return str2.replace("{gaid}", m.f());
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    private boolean bm() {
        return this.i;
    }

    public final void B() {
        this.i = true;
    }

    private int bn() {
        return this.r;
    }

    private void J(int i) {
        this.r = i;
    }

    private int bo() {
        return this.s;
    }

    private void K(int i) {
        this.s = i;
    }

    private static boolean bp() {
        try {
            com.anythink.expressad.f.b.a();
            com.anythink.expressad.foundation.b.a.c().f();
            a b2 = com.anythink.expressad.f.b.b();
            if (b2 != null) {
                return b2.g;
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    public final String C() {
        return this.aN;
    }

    private void p(String str) {
        this.aN = str;
    }

    public final String D() {
        return this.aO;
    }

    private void q(String str) {
        this.aO = str;
    }

    public final String E() {
        return this.aP;
    }

    private void r(String str) {
        this.aP = str;
    }

    private String bq() {
        return this.aQ;
    }

    private void s(String str) {
        this.aQ = str;
    }

    public final String F() {
        return this.aR;
    }

    private void t(String str) {
        this.aR = str;
    }

    public final void G() {
        Locale.getDefault().getLanguage();
        if (TextUtils.isEmpty(this.aN) || TextUtils.isEmpty(this.aO) || TextUtils.isEmpty(this.aP) || TextUtils.isEmpty(this.aQ)) {
            this.aN = "Confirm to close? ";
            this.aO = "You will not be rewarded after closing the window";
            this.aP = "Close it";
            this.aQ = "Continue";
        }
        if (TextUtils.isEmpty(this.aN) || TextUtils.isEmpty(this.aO) || TextUtils.isEmpty(this.aP) || TextUtils.isEmpty(this.aR)) {
            this.aN = "Confirm to close? ";
            this.aO = "You will not be rewarded after closing the window";
            this.aP = "Close it";
            this.aR = "Continue";
        }
    }

    private boolean br() {
        return (TextUtils.isEmpty(this.aN) || TextUtils.isEmpty(this.aO) || TextUtils.isEmpty(this.aP) || TextUtils.isEmpty(this.aQ)) ? false : true;
    }

    private boolean bs() {
        return (TextUtils.isEmpty(this.aN) || TextUtils.isEmpty(this.aO) || TextUtils.isEmpty(this.aP) || TextUtils.isEmpty(this.aR)) ? false : true;
    }

    private void L(int i) {
        this.aY = i;
    }

    private int bt() {
        return this.aY;
    }

    private int bu() {
        return this.aS;
    }

    private void M(int i) {
        this.aS = i;
    }

    private int bv() {
        return this.aT;
    }

    private void N(int i) {
        this.aT = i;
    }

    private int bw() {
        return this.aU;
    }

    private void O(int i) {
        this.aU = i;
    }

    private int bx() {
        return this.aV;
    }

    private void P(int i) {
        this.aV = i;
    }

    private int by() {
        return this.aW;
    }

    private void Q(int i) {
        this.aW = i;
    }

    private int bz() {
        return this.aX;
    }

    private void R(int i) {
        this.aX = i;
    }

    public final String H() {
        return this.aZ;
    }

    private void u(String str) {
        this.aZ = str;
    }

    public final String I() {
        return this.ba;
    }

    private void v(String str) {
        this.ba = str;
    }

    public final String J() {
        return this.bb;
    }

    private void w(String str) {
        this.bb = str;
    }

    private String bA() {
        return this.bc;
    }

    private void x(String str) {
        this.bc = str;
    }

    private String bB() {
        return this.bd;
    }

    private void y(String str) {
        this.bd = str;
    }

    private Map<String, C0234a> bC() {
        return this.be;
    }

    private void b(Map<String, C0234a> map) {
        this.be = map;
    }

    private boolean bD() {
        return (TextUtils.isEmpty(this.aZ) || TextUtils.isEmpty(this.bb) || TextUtils.isEmpty(this.ba)) ? false : true;
    }

    private static Map<String, C0234a> z(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                C0234a c0234a = new C0234a();
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                if (optJSONObject != null) {
                    c0234a.a(optJSONObject);
                }
                hashMap.put(next, c0234a);
            }
            return hashMap;
        } catch (JSONException e) {
            if (com.anythink.expressad.a.f4564a) {
                e.printStackTrace();
            }
            return null;
        } catch (Exception e2) {
            if (com.anythink.expressad.a.f4564a) {
                e2.printStackTrace();
            }
            return null;
        }
    }

    private int bE() {
        return this.at;
    }

    private void S(int i) {
        this.at = i;
    }

    private int bF() {
        return this.au;
    }

    private void T(int i) {
        this.au = i;
    }

    private int bG() {
        return this.av;
    }

    private void U(int i) {
        this.av = i;
    }

    private int bH() {
        return this.aw;
    }

    private void V(int i) {
        this.aw = i;
    }

    private void W(int i) {
        this.ax = i;
    }

    private int bI() {
        return this.ax;
    }

    private void b(boolean z) {
        this.O = z;
    }

    private boolean bJ() {
        return this.O;
    }

    private void X(int i) {
        this.P = i;
    }

    private int bK() {
        return this.P;
    }

    private void c(boolean z) {
        this.Q = z;
    }

    private boolean bL() {
        return this.Q;
    }

    public final int K() {
        return this.bf;
    }

    private void Y(int i) {
        this.bf = i;
    }

    public final b L() {
        return this.bg;
    }

    private void a(b bVar) {
        this.bg = bVar;
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private String f4756a;
        private String b;
        private String c;
        private JSONArray d;

        public static b a(JSONObject jSONObject) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            b bVar = new b();
            Context g = t.b().g();
            bVar.f4756a = jSONObject.optString("title", g.getString(k.a(g, "anythink_cm_feedback_dialog_title", "string")));
            bVar.b = jSONObject.optString("cancel", g.getString(k.a(g, "anythink_cm_feedback_dialog_close_close", "string")));
            bVar.c = jSONObject.optString("submit", g.getString(k.a(g, "anythink_cm_feedback_dialog_close_submit", "string")));
            JSONArray optJSONArray = jSONObject.optJSONArray("content");
            bVar.d = optJSONArray;
            if (optJSONArray == null) {
                JSONArray jSONArray = new JSONArray();
                bVar.d = jSONArray;
                jSONArray.put(g.getString(k.a(g, "anythink_cm_feedback_dialog_content_stuck", "string")));
                bVar.d.put(g.getString(k.a(g, "anythink_cm_feedback_dialog_content_cnr", "string")));
                bVar.d.put(g.getString(k.a(g, "anythink_cm_feedback_dialog_content_balck_screen", "string")));
                bVar.d.put(g.getString(k.a(g, "anythink_cm_feedback_dialog_content_other", "string")));
            }
            return bVar;
        }

        public final String a() {
            return this.f4756a;
        }

        private void a(String str) {
            this.f4756a = str;
        }

        public final String b() {
            return this.b;
        }

        private void b(String str) {
            this.b = str;
        }

        public final String c() {
            return this.c;
        }

        private void c(String str) {
            this.c = str;
        }

        public final JSONArray d() {
            return this.d;
        }

        private void a(JSONArray jSONArray) {
            this.d = jSONArray;
        }
    }

    /* renamed from: com.anythink.expressad.f.a$a, reason: collision with other inner class name */
    public static class C0234a {

        /* renamed from: a, reason: collision with root package name */
        private List<String> f4752a;
        private List<String> b;
        private List<String> c;
        private List<String> d;

        private List<String> a() {
            return this.f4752a;
        }

        private void a(List<String> list) {
            this.f4752a = list;
        }

        private List<String> b() {
            return this.b;
        }

        private void b(List<String> list) {
            this.b = list;
        }

        private List<String> c() {
            return this.c;
        }

        private void c(List<String> list) {
            this.c = list;
        }

        private List<String> d() {
            return this.d;
        }

        private void d(List<String> list) {
            this.d = list;
        }

        public final void a(JSONObject jSONObject) {
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("x");
                if (optJSONArray != null) {
                    this.f4752a = i.a(optJSONArray);
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("y");
                if (optJSONArray2 != null) {
                    this.b = i.a(optJSONArray2);
                }
                JSONArray optJSONArray3 = jSONObject.optJSONArray("width");
                if (optJSONArray3 != null) {
                    this.c = i.a(optJSONArray3);
                }
                JSONArray optJSONArray4 = jSONObject.optJSONArray("height");
                if (optJSONArray4 != null) {
                    this.d = i.a(optJSONArray4);
                }
            } catch (Exception e) {
                if (com.anythink.expressad.a.f4564a) {
                    e.printStackTrace();
                }
            }
        }
    }

    private int bM() {
        return this.bh;
    }

    private void Z(int i) {
        this.bh = i;
    }

    private String bN() {
        return this.bi;
    }

    public final void d(String str) {
        this.bi = str;
    }

    private int bO() {
        return this.bj;
    }

    private void aa(int i) {
        this.bj = i;
    }

    private int bP() {
        return this.bk;
    }

    private void ab(int i) {
        this.bk = i;
    }

    private String bQ() {
        return this.bl;
    }

    private void A(String str) {
        this.bl = str;
    }

    private String bR() {
        return this.bm;
    }

    private void B(String str) {
        this.bm = str;
    }

    private int bS() {
        return this.bn;
    }

    public final void M() {
        this.bn = 0;
    }

    private boolean bT() {
        return this.bo;
    }

    public final void N() {
        this.bo = false;
    }

    public final int O() {
        return this.bp;
    }

    private void ac(int i) {
        this.bp = i;
    }

    private int bU() {
        return this.bq;
    }

    public final void P() {
        this.bq = 1;
    }

    public final String Q() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.anythink.expressad.f.a.b.h, this.b);
            jSONObject.put(com.anythink.expressad.f.a.b.l, this.c);
            jSONObject.put(com.anythink.expressad.f.a.b.m, this.d);
            jSONObject.put(com.anythink.expressad.f.a.b.p, this.f);
            jSONObject.put(com.anythink.expressad.f.a.b.w, this.g);
            jSONObject.put(com.anythink.expressad.f.a.b.o, this.i);
            jSONObject.put("plct", this.n);
            jSONObject.put(com.anythink.expressad.f.a.b.B, this.o);
            jSONObject.put(com.anythink.expressad.f.a.b.C, this.m);
            jSONObject.put(com.anythink.expressad.f.a.b.G, this.f4751q);
            jSONObject.put("plctb", this.u);
            jSONObject.put(com.anythink.expressad.f.a.b.ab, this.aG);
            jSONObject.put(com.anythink.expressad.f.a.b.ac, this.aH);
            jSONObject.put(com.anythink.expressad.f.a.b.af, this.y);
            jSONObject.put(com.anythink.expressad.f.a.b.ag, this.z);
            jSONObject.put(com.anythink.expressad.f.a.b.i, this.J);
            jSONObject.put(com.anythink.expressad.f.a.b.j, this.K);
            jSONObject.put(com.anythink.expressad.f.a.b.k, this.L);
            jSONObject.put(com.anythink.expressad.f.a.b.f4754ai, this.aK);
            jSONObject.put(com.anythink.expressad.f.a.b.aa, this.x);
            jSONObject.put(com.anythink.expressad.f.a.b.aG, this.F);
            jSONObject.put(com.anythink.expressad.f.a.b.aE, this.D);
            jSONObject.put(com.anythink.expressad.f.a.b.aF, this.E);
            jSONObject.put(com.anythink.expressad.f.a.b.ae, this.aJ);
            jSONObject.put(com.anythink.expressad.f.a.b.bo, this.aL);
            jSONObject.put(com.anythink.expressad.f.a.b.bw, this.aF);
            jSONObject.put("iex", this.I);
            jSONObject.put(com.anythink.expressad.f.a.b.ao, this.G);
            jSONObject.put(com.anythink.expressad.f.a.b.ap, this.H);
            jSONObject.put(com.anythink.expressad.f.a.b.at, this.aM);
            jSONObject.put(com.anythink.expressad.f.a.b.al, this.aE);
            jSONObject.put("pf", this.Y);
            jSONObject.put(com.anythink.expressad.f.a.b.aA, this.aa);
            jSONObject.put("pid", this.ae);
            jSONObject.put(com.anythink.expressad.f.a.b.ax, this.ab);
            jSONObject.put(com.anythink.expressad.f.a.b.ay, this.ac);
            jSONObject.put("delete", this.ad);
            jSONObject.put(com.anythink.expressad.f.a.b.ad, this.aI);
            jSONObject.put(com.anythink.expressad.f.a.b.bF, this.ah);
            jSONObject.put(com.anythink.expressad.f.a.b.bG, this.ag);
            jSONObject.put(com.anythink.expressad.f.a.b.bH, this.f4750ai);
            jSONObject.put(com.anythink.expressad.f.a.b.bI, this.aj);
            jSONObject.put(com.anythink.expressad.f.a.b.bJ, this.ak);
            jSONObject.put(com.anythink.expressad.f.a.b.bL, this.am);
            jSONObject.put(com.anythink.expressad.f.a.b.bK, this.al);
            jSONObject.put(com.anythink.expressad.f.a.b.bW, this.an);
            jSONObject.put(com.anythink.expressad.f.a.b.bZ, this.ap);
            jSONObject.put(com.anythink.expressad.f.a.b.cP, this.f4749a);
            jSONObject.put(com.anythink.expressad.f.a.b.cU, this.bi);
            jSONObject.put(com.anythink.expressad.f.a.b.dj, this.W);
            jSONObject.put(com.anythink.expressad.f.a.b.dh, this.V);
            jSONObject.put(com.anythink.expressad.f.a.b.dx, this.bo);
            jSONObject.put(com.anythink.expressad.f.a.b.du, this.bn);
            jSONObject.put("isDefault", this.bq);
            return jSONObject.toString();
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    public final int R() {
        return this.br;
    }

    private void ad(int i) {
        this.br = i;
    }

    public final int S() {
        return this.bs;
    }

    private void ae(int i) {
        this.bs = i;
    }

    public final int T() {
        return this.bt;
    }

    private void af(int i) {
        this.bt = i;
    }

    public final int U() {
        return this.bu;
    }

    private void ag(int i) {
        this.bu = i;
    }

    public final int V() {
        return this.bv;
    }

    private void ah(int i) {
        this.bv = i;
    }
}
