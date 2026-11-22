package com.xiaomi.push;

import org.json.JSONObject;

/* loaded from: classes4.dex */
public class cc {

    /* renamed from: a, reason: collision with root package name */
    private int f14482a;

    /* renamed from: a, reason: collision with other field name */
    private long f263a;

    /* renamed from: a, reason: collision with other field name */
    private String f264a;
    private long b;
    private long c;

    public cc() {
        this(0, 0L, 0L, null);
    }

    public cc(int i, long j, long j2, Exception exc) {
        this.f14482a = i;
        this.f263a = j;
        this.c = j2;
        this.b = System.currentTimeMillis();
        if (exc != null) {
            this.f264a = exc.getClass().getSimpleName();
        }
    }

    public int a() {
        return this.f14482a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public JSONObject m11950a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cost", this.f263a);
        jSONObject.put("size", this.c);
        jSONObject.put("ts", this.b);
        jSONObject.put(com.anythink.expressad.f.a.b.R, this.f14482a);
        jSONObject.put("expt", this.f264a);
        return jSONObject;
    }

    public cc a(JSONObject jSONObject) {
        this.f263a = jSONObject.getLong("cost");
        this.c = jSONObject.getLong("size");
        this.b = jSONObject.getLong("ts");
        this.f14482a = jSONObject.getInt(com.anythink.expressad.f.a.b.R);
        this.f264a = jSONObject.optString("expt");
        return this;
    }
}
