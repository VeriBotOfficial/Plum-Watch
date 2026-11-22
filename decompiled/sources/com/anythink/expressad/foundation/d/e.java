package com.anythink.expressad.foundation.d;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class e implements com.anythink.expressad.g.b, Serializable {
    public static final String A = "ia_all_ext2";
    public static final String B = "cam_tpl_url";
    public static final String C = "cam_html";
    public static final String D = "cam_tpl_url";
    public static final String E = "cam_html";
    public static final String F = "nscpt";
    public static final String G = "mof_template_url";
    public static final String H = "mof_tplid";
    public static final String I = "req_ext_data";
    public static final String J = "replace_tmp";
    private static final String L = "e";
    private static final long M = 1;

    /* renamed from: a, reason: collision with root package name */
    public static final String f4784a = "a";
    public static final String b = "pv_urls";
    public static final String c = "parent_session_id";
    public static final String d = "ad_type";
    public static final String e = "unit_size";
    public static final String f = "html_url";
    public static final String g = "only_impression_url";
    public static final String h = "ads";
    public static final String i = "template";
    public static final String j = "frames";
    public static final String k = "end_screen_url";
    public static final String l = "jm_do";
    public static final String m = "rks";
    public static final String n = "vcn";
    public static final String o = "token_r";
    public static final String p = "encrypt_p";

    /* renamed from: q, reason: collision with root package name */
    public static final String f4785q = "irlfa";
    public static final String r = "tk_tcp_port";
    public static final String s = "csp";
    public static final String t = "do";
    public static final String u = "sh";
    public static final String v = "ia_icon";
    public static final String w = "ia_rst";
    public static final String x = "ia_url";
    public static final String y = "ia_ori";
    public static final String z = "ia_all_ext1";
    public ArrayList<d> K;
    private String O;
    private String P;
    private String Q;
    private String R;
    private String S;
    private int T;
    private String U;
    private int V;
    private String W;
    private String X;
    private String Y;
    private String Z;
    private int aa;
    private String ab;
    private String ac;
    private String ad;
    private int ae;
    private List<com.anythink.expressad.out.m> af;
    private HashMap<String, String> ah;

    /* renamed from: ai, reason: collision with root package name */
    private HashMap<String, String> f4786ai;
    private String aj;
    private String ak;
    private String al;
    private int am;
    private int an;
    private int ap;
    private String aq;
    private String N = "";
    private StringBuffer ag = new StringBuffer();
    private String ao = "";

    private String g() {
        return this.N;
    }

    private void b(String str) {
        this.N = str;
    }

    private String h() {
        return this.O;
    }

    private void c(String str) {
        this.O = str;
    }

    private String i() {
        return this.P;
    }

    private void d(String str) {
        this.P = str;
    }

    private String j() {
        return this.Q;
    }

    private void e(String str) {
        this.Q = str;
    }

    private String k() {
        return this.R;
    }

    private void f(String str) {
        this.R = str;
    }

    private String l() {
        return this.S;
    }

    private void g(String str) {
        this.S = str;
    }

    private int m() {
        return this.T;
    }

    private void a(int i2) {
        this.T = i2;
    }

    private String n() {
        return this.U;
    }

    private void h(String str) {
        this.U = str;
    }

    private int o() {
        return this.V;
    }

    private void b(int i2) {
        this.V = i2;
    }

    private String p() {
        return this.W;
    }

    private void i(String str) {
        this.W = str;
    }

    private String q() {
        return this.X;
    }

    private void j(String str) {
        this.X = str;
    }

    private String r() {
        return this.ao;
    }

    private void k(String str) {
        this.ao = str;
    }

    private int s() {
        int i2 = this.am;
        if (i2 > 1) {
            return i2;
        }
        return 1;
    }

    private void c(int i2) {
        this.am = i2;
    }

    private int t() {
        int i2 = this.an;
        if (i2 == 1) {
            return i2;
        }
        return 0;
    }

    private void d(int i2) {
        this.an = i2;
    }

    public final HashMap<String, String> a() {
        return this.ah;
    }

    private void a(HashMap<String, String> hashMap) {
        this.ah = hashMap;
    }

    public final HashMap<String, String> b() {
        return this.f4786ai;
    }

    private void b(HashMap<String, String> hashMap) {
        this.f4786ai = hashMap;
    }

    private String u() {
        return this.aj;
    }

    private void l(String str) {
        this.aj = str;
    }

    private String v() {
        return this.ak;
    }

    private void m(String str) {
        this.ak = str;
    }

    private String w() {
        return this.al;
    }

    private void n(String str) {
        this.al = str;
    }

    private int x() {
        return this.ap;
    }

    private void e(int i2) {
        this.ap = i2;
    }

    private List<com.anythink.expressad.out.m> y() {
        return this.af;
    }

    private void a(List<com.anythink.expressad.out.m> list) {
        this.af = list;
    }

    public final String c() {
        return this.Y;
    }

    private void o(String str) {
        this.Y = str;
    }

    private String z() {
        return this.Z;
    }

    private void p(String str) {
        this.Z = str;
    }

    public final int d() {
        return this.aa;
    }

    private void f(int i2) {
        this.aa = i2;
    }

    private String A() {
        return this.ab;
    }

    private void q(String str) {
        this.ab = str;
    }

    private String B() {
        return this.ac;
    }

    private void r(String str) {
        this.ac = str;
    }

    private String C() {
        return this.ad;
    }

    private void s(String str) {
        this.ad = str;
    }

    private ArrayList<d> D() {
        return this.K;
    }

    private void a(ArrayList<d> arrayList) {
        this.K = arrayList;
    }

    private int E() {
        return this.ae;
    }

    private void g(int i2) {
        this.ae = i2;
    }

    private static Object a(Object obj) {
        return obj == null ? "" : obj;
    }

    public final String e() {
        StringBuffer stringBuffer = this.ag;
        if (stringBuffer != null && stringBuffer.length() > 0) {
            return this.ag.toString();
        }
        try {
            String f2 = com.anythink.core.common.v.m.f();
            String c2 = com.anythink.core.common.v.m.c(com.anythink.core.common.d.t.b().g());
            String b2 = com.anythink.core.common.v.m.b(com.anythink.core.common.d.t.b().g());
            com.anythink.core.common.d.t.b().g();
            this.ag = this.ag.append(this.aa).append("|").append(a((Object) "1")).append("|").append(a((Object) Build.VERSION.RELEASE)).append("|").append(a((Object) com.anythink.expressad.out.b.f5013a)).append("|").append(a((Object) com.anythink.core.common.v.m.a())).append("|").append(a((Object) (com.anythink.expressad.foundation.h.n.f(com.anythink.core.common.d.t.b().g()) + "x" + com.anythink.expressad.foundation.h.n.g(com.anythink.core.common.d.t.b().g())))).append("|").append(a(Integer.valueOf(com.anythink.expressad.foundation.h.n.c(com.anythink.expressad.foundation.b.a.c().e())))).append("|").append(a((Object) com.anythink.core.common.v.m.e(com.anythink.expressad.foundation.b.a.c().e()))).append("|").append(a((Object) String.valueOf(com.anythink.expressad.foundation.h.n.b()))).append("|").append(a((Object) b2)).append(a((Object) c2)).append("|").append(a((Object) "at_device1")).append("|").append(a((Object) "at_device2")).append("|").append(a((Object) com.anythink.core.common.v.m.d(com.anythink.core.common.d.t.b().g()))).append("|").append(a((Object) f2)).append("|").append(a((Object) "")).append("|").append(a((Object) com.anythink.core.common.v.m.b())).append("|").append(a((Object) "")).append("||").append(a((Object) "")).append("|").append(a((Object) (com.anythink.core.common.d.t.b().C() + "," + com.anythink.core.common.d.t.b().D()))).append("|");
            com.anythink.core.common.d.s c3 = com.anythink.core.common.d.t.b().c();
            if (c3 != null) {
                return c3.fillCDataParam(this.ag.toString());
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        String stringBuffer2 = this.ag.toString();
        stringBuffer2.replaceAll("at_device1", "");
        stringBuffer2.replaceAll("at_device2", "");
        return stringBuffer2;
    }

    private static e a(JSONObject jSONObject) {
        return b(jSONObject, "");
    }

    private static e b(JSONObject jSONObject) {
        return b(jSONObject, "");
    }

    public final String f() {
        try {
            if (!TextUtils.isEmpty(this.aq)) {
                return this.aq;
            }
            if (!TextUtils.isEmpty(this.ad)) {
                Uri parse = Uri.parse(this.ad);
                if (parse != null) {
                    this.aq = parse.getQueryParameter("k");
                }
                return this.aq;
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    private static e a(JSONObject jSONObject, String str) {
        return b(jSONObject, str);
    }

    public static e a(String str) {
        try {
            return b(new JSONObject(str), "");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static e b(JSONObject jSONObject, String str) {
        String str2;
        int i2;
        ArrayList arrayList;
        String str3 = "ads";
        String str4 = "template";
        String str5 = "parent_session_id";
        String str6 = "a";
        String str7 = "only_impression_url";
        String str8 = "html_url";
        if (jSONObject == null) {
            return null;
        }
        try {
            e eVar = new e();
            try {
                String optString = jSONObject.optString("rks");
                if (!TextUtils.isEmpty(optString)) {
                    JSONObject jSONObject2 = new JSONObject(optString);
                    Iterator<String> keys = jSONObject2.keys();
                    HashMap<String, String> hashMap = new HashMap<>();
                    while (keys != null && keys.hasNext()) {
                        String next = keys.next();
                        hashMap.put(next, jSONObject2.optString(next));
                    }
                    eVar.ah = hashMap;
                }
                if (!TextUtils.isEmpty(str)) {
                    HashMap<String, String> hashMap2 = new HashMap<>();
                    hashMap2.put("encrypt_p", "");
                    hashMap2.put("irlfa", "");
                    eVar.f4786ai = hashMap2;
                }
                JSONObject optJSONObject = jSONObject.optJSONObject("req_ext_data");
                int optInt = jSONObject.optInt("nscpt", 1);
                String optString2 = jSONObject.optString("mof_template_url", "");
                int optInt2 = jSONObject.optInt("mof_tplid", 0);
                String jSONObject3 = optJSONObject != null ? optJSONObject.toString() : "";
                new JSONArray();
                JSONArray optJSONArray = jSONObject.optJSONArray("pv_urls");
                if (optJSONArray == null || optJSONArray.length() <= 0) {
                    str2 = jSONObject3;
                    i2 = optInt;
                    arrayList = null;
                } else {
                    str2 = jSONObject3;
                    arrayList = new ArrayList(optJSONArray.length());
                    i2 = optInt;
                    for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                        arrayList.add(optJSONArray.getString(i3));
                    }
                }
                com.anythink.expressad.foundation.c.a.a.a().a(jSONObject.optJSONObject("replace_tmp"));
                eVar.Y = jSONObject.optString("a");
                eVar.Z = jSONObject.optString("parent_session_id");
                eVar.aa = jSONObject.optInt("ad_type");
                eVar.ab = jSONObject.optString("unit_size");
                eVar.ac = jSONObject.optString("html_url");
                eVar.ad = jSONObject.optString("only_impression_url");
                eVar.ae = jSONObject.optInt("template");
                eVar.ap = jSONObject.optInt("jm_do");
                eVar.S = jSONObject.optString("ia_icon");
                eVar.T = jSONObject.optInt("ia_rst");
                eVar.U = jSONObject.optString("ia_url");
                eVar.V = jSONObject.optInt("ia_ori");
                eVar.W = jSONObject.optString("ia_all_ext1");
                eVar.X = jSONObject.optString("ia_all_ext2");
                eVar.am = jSONObject.optInt("vcn");
                eVar.an = jSONObject.optInt("token_r");
                eVar.ao = jSONObject.optString("encrypt_p");
                JSONArray optJSONArray2 = jSONObject.optJSONArray("ads");
                JSONArray optJSONArray3 = jSONObject.optJSONArray("frames");
                String str9 = "parse campaign error ,campaign is null";
                String str10 = "end_screen_url";
                if (optJSONArray3 != null && optJSONArray3.length() > 0) {
                    ArrayList arrayList2 = new ArrayList();
                    String str11 = optString2;
                    int i4 = 0;
                    while (i4 < optJSONArray3.length()) {
                        JSONObject optJSONObject2 = optJSONArray3.optJSONObject(i4);
                        int i5 = i4;
                        JSONArray jSONArray = optJSONObject2.getJSONArray(str3);
                        String str12 = str3;
                        ArrayList arrayList3 = new ArrayList();
                        String str13 = str4;
                        JSONObject jSONObject4 = optJSONObject2;
                        int i6 = 0;
                        while (i6 < jSONArray.length()) {
                            JSONObject optJSONObject3 = jSONArray.optJSONObject(i6);
                            JSONArray jSONArray2 = optJSONArray3;
                            String optString3 = jSONObject.optString(str7);
                            String str14 = str9;
                            String optString4 = jSONObject.optString(str8);
                            int i7 = i6;
                            String str15 = str10;
                            String optString5 = jSONObject.optString(str15);
                            JSONArray jSONArray3 = jSONArray;
                            String str16 = str11;
                            String str17 = str6;
                            String str18 = str2;
                            String str19 = str8;
                            ArrayList arrayList4 = arrayList2;
                            int i8 = i2;
                            JSONObject jSONObject5 = jSONObject4;
                            String str20 = str5;
                            String str21 = str7;
                            int i9 = optInt2;
                            d a2 = d.a(optJSONObject3, optString3, optString4, optString5, false, eVar, str);
                            if (a2 != null) {
                                a2.i(eVar.U);
                                a2.j(eVar.V);
                                a2.i(eVar.T);
                                a2.h(eVar.S);
                                a2.h(jSONObject.optInt("ad_type"));
                                a2.f(jSONObject.optString("ia_ext1"));
                                a2.g(jSONObject.optString("ia_ext2"));
                                a2.f(eVar.s());
                                a2.e(eVar.t());
                                a2.c(eVar.ao);
                                a2.m(i9);
                                a2.s(str16);
                                a2.l(i8);
                                a2.a((List<String>) arrayList);
                                a2.t(str18);
                                arrayList3.add(a2);
                            } else {
                                eVar.N = str14;
                            }
                            str2 = str18;
                            str6 = str17;
                            str11 = str16;
                            str8 = str19;
                            str9 = str14;
                            optInt2 = i9;
                            str7 = str21;
                            str5 = str20;
                            optJSONArray3 = jSONArray2;
                            jSONArray = jSONArray3;
                            arrayList2 = arrayList4;
                            jSONObject4 = jSONObject5;
                            str10 = str15;
                            i2 = i8;
                            i6 = i7 + 1;
                        }
                        String str22 = str11;
                        String str23 = str6;
                        ArrayList arrayList5 = arrayList2;
                        JSONObject jSONObject6 = jSONObject4;
                        String str24 = str5;
                        com.anythink.expressad.out.m mVar = new com.anythink.expressad.out.m();
                        mVar.b(jSONObject.optString(str24));
                        mVar.a(jSONObject.optString(str23));
                        mVar.a(arrayList3);
                        mVar.a(jSONObject6.optInt(str13));
                        arrayList5.add(mVar);
                        i4 = i5 + 1;
                        arrayList2 = arrayList5;
                        optInt2 = optInt2;
                        str11 = str22;
                        str8 = str8;
                        str7 = str7;
                        str3 = str12;
                        i2 = i2;
                        str2 = str2;
                        str6 = str23;
                        str4 = str13;
                        str10 = str10;
                        str9 = str9;
                        str5 = str24;
                        optJSONArray3 = optJSONArray3;
                    }
                    eVar.af = arrayList2;
                    return eVar;
                }
                String str25 = "end_screen_url";
                String str26 = str2;
                int i10 = i2;
                String str27 = "only_impression_url";
                String str28 = "html_url";
                if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                    ArrayList<d> arrayList6 = new ArrayList<>();
                    int i11 = 0;
                    while (i11 < optJSONArray2.length()) {
                        JSONArray jSONArray4 = optJSONArray2;
                        String str29 = str27;
                        str27 = str29;
                        String str30 = str28;
                        String str31 = str25;
                        str28 = str30;
                        str25 = str31;
                        d a3 = d.a(jSONArray4.optJSONObject(i11), jSONObject.optString(str29), jSONObject.optString(str30), jSONObject.optString(str31), false, eVar, str);
                        if (a3 != null) {
                            a3.m(optInt2);
                            a3.s(optString2);
                            a3.l(i10);
                            a3.a((List<String>) arrayList);
                            a3.t(str26);
                            a3.f(eVar.s());
                            a3.e(eVar.t());
                            a3.c(eVar.ao);
                            arrayList6.add(a3);
                        } else {
                            eVar.N = "parse campaign error ,campaign is null";
                        }
                        i11++;
                        optJSONArray2 = jSONArray4;
                    }
                    eVar.K = arrayList6;
                }
                return eVar;
            } catch (Exception unused) {
                return eVar;
            }
        } catch (Exception unused2) {
            return null;
        }
    }
}
