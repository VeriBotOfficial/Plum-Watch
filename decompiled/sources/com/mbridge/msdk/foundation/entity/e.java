package com.mbridge.msdk.foundation.entity;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.o0;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: ClickTime.java */
/* loaded from: classes17.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private String f11532a;
    private String b;
    private String c;
    private int d;
    private int e;
    private String f;
    private String g;
    private String h;
    private int i;
    private String j;
    private int k;
    private String l;
    private int m;
    private String n;
    private String o;
    private int p;

    /* renamed from: q, reason: collision with root package name */
    private String f11533q;

    public String a() {
        return this.f11532a;
    }

    public String b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    public String d() {
        return this.b;
    }

    public void e(int i) {
        this.m = i;
    }

    public void f(int i) {
        this.p = i;
    }

    public String g() {
        return this.g;
    }

    public void h(String str) {
        this.l = str;
    }

    public void i(String str) {
        this.n = str;
    }

    public String j() {
        return this.j;
    }

    public void k(String str) {
        this.f11533q = str;
    }

    public String l() {
        return this.l;
    }

    public int m() {
        return this.m;
    }

    public String n() {
        return this.n;
    }

    public String o() {
        return this.o;
    }

    public int p() {
        return this.p;
    }

    public String q() {
        return this.f11533q;
    }

    public String toString() {
        return "ClickTime [campaignId=" + this.f11532a + ", click_duration=" + this.b + ", lastUrl=" + this.j + ", code=" + this.e + ", excepiton=" + this.g + ", header=" + this.h + ", content=" + this.f + ", type=" + this.p + ", click_type=" + this.d + "]";
    }

    public void a(int i) {
        this.d = i;
    }

    public void b(String str) {
        this.c = str;
    }

    public void c(int i) {
        this.i = i;
    }

    public void d(int i) {
        this.k = i;
    }

    public int e() {
        return this.e;
    }

    public String f() {
        return this.f;
    }

    public void g(String str) {
        this.j = str;
    }

    public String h() {
        return this.h;
    }

    public int i() {
        return this.i;
    }

    public void j(String str) {
        this.o = str;
    }

    public int k() {
        return this.k;
    }

    public void a(String str) {
        this.f11532a = str;
    }

    public void b(int i) {
        this.e = i;
    }

    public void c(String str) {
        this.b = str;
    }

    public void d(String str) {
        this.f = str;
    }

    public void e(String str) {
        this.g = str;
    }

    public void f(String str) {
        this.h = str;
    }

    public static JSONObject a(e eVar) {
        if (eVar == null) {
            return null;
        }
        String j = eVar.j();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("rid", eVar.n());
            jSONObject.put("rid_n", eVar.o());
            jSONObject.put("click_type", eVar.c());
            jSONObject.put("type", eVar.p());
            jSONObject.put("cid", eVar.a());
            jSONObject.put("click_duration", eVar.d());
            jSONObject.put("key", com.anythink.expressad.foundation.d.g.v);
            jSONObject.put("unit_id", eVar.q());
            jSONObject.put(com.anythink.expressad.foundation.d.g.f, j);
            jSONObject.put("code", eVar.e());
            jSONObject.put("exception", eVar.g());
            jSONObject.put("landing_type", eVar.i());
            jSONObject.put("link_type", eVar.k());
            jSONObject.put(com.anythink.expressad.foundation.d.g.s, eVar.b());
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                jSONObject.put("network_type", eVar.m());
                jSONObject.put("network_str", eVar.l());
            }
            return jSONObject;
        } catch (Throwable th) {
            o0.b("ClickTime", th.getMessage());
            return null;
        }
    }

    public static ArrayList<JSONObject> a(List<e> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList<JSONObject> arrayList = new ArrayList<>();
        for (e eVar : list) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("rid", eVar.n());
                jSONObject.put("rid_n", eVar.o());
                jSONObject.put("cid", eVar.a());
                jSONObject.put("click_type", eVar.c());
                jSONObject.put("type", eVar.p());
                jSONObject.put("click_duration", eVar.d());
                jSONObject.put("key", com.anythink.expressad.foundation.d.g.u);
                jSONObject.put("unit_id", eVar.q());
                jSONObject.put(com.anythink.expressad.foundation.d.g.f, eVar.j());
                jSONObject.put("content", eVar.f());
                jSONObject.put("code", eVar.e());
                jSONObject.put("exception", eVar.g());
                jSONObject.put("header", eVar.h());
                jSONObject.put("landing_type", eVar.i());
                jSONObject.put("link_type", eVar.k());
                jSONObject.put(com.anythink.expressad.foundation.d.g.s, eVar.b());
                if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                    jSONObject.put("network_type", eVar.m());
                    jSONObject.put("network_str", eVar.l());
                }
                String q2 = eVar.q();
                if (!TextUtils.isEmpty(q2)) {
                    String str = com.mbridge.msdk.foundation.controller.a.r.get(q2);
                    if (str == null) {
                        str = "";
                    }
                    jSONObject.put("u_stid", str);
                }
                arrayList.add(jSONObject);
            } catch (Throwable th) {
                o0.b("ClickTime", th.getMessage());
            }
        }
        return arrayList;
    }
}
