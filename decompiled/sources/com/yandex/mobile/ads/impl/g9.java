package com.yandex.mobile.ads.impl;

import android.webkit.WebView;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public abstract class g9 {

    /* renamed from: a, reason: collision with root package name */
    private jo2 f15564a;
    private p3 b;
    private dw0 c;
    private int d;
    private long e;

    public g9() {
        g();
        this.f15564a = new jo2(null);
    }

    public void a() {
    }

    public void b() {
        this.f15564a.clear();
    }

    public final p3 c() {
        return this.b;
    }

    public final dw0 d() {
        return this.c;
    }

    public final void b(String str, long j) {
        if (j < this.e || this.d == 3) {
            return;
        }
        this.d = 3;
        wo2.a(this.f15564a.get(), str);
    }

    public final void e() {
        wo2.a(this.f15564a.get());
    }

    public final void f() {
        wo2.b(this.f15564a.get());
    }

    public final void g() {
        this.e = System.nanoTime();
        this.d = 1;
    }

    public final void a(float f) {
        wo2.a(this.f15564a.get(), f);
    }

    final void a(WebView webView) {
        this.f15564a = new jo2(webView);
    }

    public final void a(p3 p3Var) {
        this.b = p3Var;
    }

    public final void a(c9 c9Var) {
        wo2.a(this.f15564a.get(), c9Var.d());
    }

    public final void a(dw0 dw0Var) {
        this.c = dw0Var;
    }

    public void a(vn2 vn2Var, d9 d9Var) {
        a(vn2Var, d9Var, null);
    }

    protected final void a(vn2 vn2Var, d9 d9Var, JSONObject jSONObject) {
        String i = vn2Var.i();
        JSONObject jSONObject2 = new JSONObject();
        io2.a(jSONObject2, "environment", "app");
        io2.a(jSONObject2, "adSessionType", d9Var.a());
        io2.a(jSONObject2, "deviceInfo", yn2.a());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        io2.a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        io2.a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, d9Var.f().b());
        io2.a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, d9Var.f().c());
        io2.a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        io2.a(jSONObject4, "libraryVersion", "1.3.26-Yandex");
        io2.a(jSONObject4, "appId", ro2.a().b().getApplicationContext().getPackageName());
        io2.a(jSONObject2, "app", jSONObject4);
        if (d9Var.b() != null) {
            io2.a(jSONObject2, "contentUrl", d9Var.b());
        }
        if (d9Var.c() != null) {
            io2.a(jSONObject2, "customReferenceData", d9Var.c());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (eb2 eb2Var : d9Var.g()) {
            io2.a(jSONObject5, eb2Var.b(), eb2Var.c());
        }
        wo2.a(this.f15564a.get(), i, jSONObject2, jSONObject5, jSONObject);
    }

    public final void a(String str) {
        wo2.a(this.f15564a.get(), str, (JSONObject) null);
    }

    public final void a(String str, long j) {
        if (j >= this.e) {
            this.d = 2;
            wo2.a(this.f15564a.get(), str);
        }
    }

    public final void a(String str, JSONObject jSONObject) {
        wo2.a(this.f15564a.get(), str, jSONObject);
    }

    public final void a(JSONObject jSONObject) {
        wo2.b(this.f15564a.get(), jSONObject);
    }

    public final void a(boolean z) {
        if (this.f15564a.get() != null) {
            wo2.b(this.f15564a.get(), z ? "foregrounded" : "backgrounded");
        }
    }
}
