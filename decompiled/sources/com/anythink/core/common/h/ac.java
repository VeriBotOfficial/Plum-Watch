package com.anythink.core.common.h;

import android.text.TextUtils;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class ac {

    /* renamed from: a, reason: collision with root package name */
    static final String f3835a = "reqId";
    static final String b = "hasShow";
    static final String c = "hasClick";
    static final String d = "price";
    static final String e = "networkFirmId";
    static final String f = "isHB";
    static final String g = "adsListType";
    static final String h = "tpBidId";
    static final String i = "deal_type";
    static final String j = "deal_id";
    static final String k = "deal_pri";
    private static String l = "ac";
    private boolean m;
    private final String n;
    private boolean o;
    private boolean p;

    /* renamed from: q, reason: collision with root package name */
    private bv f3836q;
    private bv r;
    private int s;
    private double t;
    private boolean u;
    private int v;
    private String w;
    private String x;
    private String y;
    private int z;

    private static int a(int i2) {
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 == 4 || i2 == 5) {
                    return 4;
                }
                if (i2 != 7) {
                    if (i2 != 8 && i2 != 11) {
                        return 1;
                    }
                }
            }
            return 2;
        }
        return 3;
    }

    public ac(String str) {
        this.n = str;
    }

    public final synchronized void a(bv bvVar) {
        new StringBuilder("refresh: ").append(bvVar);
        this.f3836q = bvVar;
    }

    public final synchronized void b(bv bvVar) {
        new StringBuilder("refreshSecond: ").append(bvVar);
        this.r = bvVar;
    }

    public final synchronized bv a() {
        return this.f3836q;
    }

    public final synchronized bv b() {
        return this.r;
    }

    public final String c() {
        return this.n;
    }

    public final void d() {
        this.o = true;
    }

    public final void e() {
        this.p = true;
    }

    public final boolean f() {
        return this.o;
    }

    public final boolean g() {
        return this.p;
    }

    public String toString() {
        String str = this.m ? ", priceInDisk=" + this.t + ", networkFirmIdInDisk=" + this.s + ", winnerIsHBInDisk=" + this.u + ", adsListTypeInDisk=" + this.v + ", tpBidIdInDisk=" + this.w + ", pmpTypeStringInDisk=" + this.x + ", pmpOrderIdInDisk=" + this.y + ", pmpPriorityInDisk=" + this.z : null;
        StringBuilder append = new StringBuilder("BiddingRecorder{fromLocalDisk=").append(this.m);
        if (str == null) {
            str = "";
        }
        return append.append(str).append(", requestId=").append(this.n).append(", hasShow=").append(this.o).append(", hasClick=").append(this.p).append(", loadedMaxPriceUgInMemory=").append(this.f3836q).append(AbstractJsonLexerKt.END_OBJ).toString();
    }

    public final String h() {
        double a2;
        String str;
        int i2;
        int i3;
        int i4;
        String str2;
        String str3;
        String str4;
        String str5;
        JSONObject jSONObject = new JSONObject();
        try {
            boolean z = this.o;
            int i5 = 0;
            boolean z2 = this.p;
            if (this.m) {
                a2 = this.t;
                i3 = this.s;
                i4 = a(this.v);
                str2 = this.w;
                str3 = this.x;
                str4 = this.y;
                i2 = this.z;
            } else {
                a2 = com.anythink.core.common.v.p.a(this.f3836q);
                int g2 = this.f3836q.g();
                ad R = this.f3836q.R();
                int a3 = a(this.f3836q.d());
                if (R == null || TextUtils.isEmpty(R.g)) {
                    str = "";
                } else {
                    str = R.g;
                }
                if (R == null) {
                    i2 = 0;
                    i3 = g2;
                    i4 = a3;
                    str2 = str;
                    str3 = "";
                    str4 = str3;
                } else {
                    if (TextUtils.isEmpty(R.u())) {
                        str5 = "";
                    } else {
                        str5 = R.u();
                        i5 = R.w();
                    }
                    if (TextUtils.isEmpty(R.v())) {
                        String str6 = str5;
                        i2 = i5;
                        i3 = g2;
                        i4 = a3;
                        str3 = str6;
                        str2 = str;
                        str4 = "";
                    } else {
                        String str7 = str5;
                        i2 = i5;
                        i3 = g2;
                        i4 = a3;
                        str3 = str7;
                        String str8 = str;
                        str4 = R.v();
                        str2 = str8;
                    }
                }
            }
            jSONObject.put("price", a2);
            jSONObject.put(e, i3);
            jSONObject.put("demandType", i4);
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("tp_bid_id", str2);
            }
            jSONObject.put("imp", z ? 1 : 0);
            jSONObject.put("click", z2 ? 1 : 0);
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put(i, str3);
                jSONObject.put(k, i2);
            }
            if (!TextUtils.isEmpty(str4)) {
                jSONObject.put(j, str4);
            }
            return jSONObject.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static ac a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            ac acVar = new ac(jSONObject.getString(f3835a));
            acVar.m = true;
            acVar.o = jSONObject.optBoolean(b);
            acVar.p = jSONObject.optBoolean(c);
            acVar.t = jSONObject.optDouble("price", -1.0d);
            acVar.s = jSONObject.optInt(e);
            acVar.u = jSONObject.optBoolean(f);
            acVar.v = jSONObject.optInt(g);
            acVar.w = jSONObject.optString(h);
            acVar.x = jSONObject.optString(i, "");
            acVar.y = jSONObject.optString(j, "");
            acVar.z = jSONObject.optInt(k, 0);
            return acVar;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public final synchronized JSONObject i() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put(f3835a, this.n);
            jSONObject.put(b, this.o);
            jSONObject.put(c, this.p);
            bv bvVar = this.f3836q;
            if (bvVar != null) {
                jSONObject.put("price", com.anythink.core.common.v.p.a(bvVar));
                jSONObject.put(e, this.f3836q.g());
                jSONObject.put(f, this.f3836q.o());
                jSONObject.put(g, this.f3836q.d());
                ad R = this.f3836q.R();
                if (R != null && !TextUtils.isEmpty(R.g)) {
                    jSONObject.put(h, R.g);
                }
                if (R != null) {
                    if (!TextUtils.isEmpty(R.u())) {
                        jSONObject.put(i, R.u());
                        jSONObject.put(k, R.w());
                    }
                    if (!TextUtils.isEmpty(R.v())) {
                        jSONObject.put(j, R.v());
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    private boolean m() {
        return this.m;
    }

    public final double j() {
        if (this.m) {
            return this.t;
        }
        bv bvVar = this.f3836q;
        if (bvVar != null) {
            return com.anythink.core.common.v.p.a(bvVar);
        }
        return -1.0d;
    }

    public final int k() {
        if (this.m) {
            return this.s;
        }
        bv bvVar = this.f3836q;
        if (bvVar != null) {
            return bvVar.g();
        }
        return 0;
    }

    public final boolean l() {
        if (this.m) {
            return this.u;
        }
        bv bvVar = this.f3836q;
        if (bvVar != null) {
            return bvVar.o();
        }
        return false;
    }
}
