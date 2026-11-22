package com.xiaomi.push;

import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
class ck implements Comparable<ck> {

    /* renamed from: a, reason: collision with root package name */
    protected int f14490a;

    /* renamed from: a, reason: collision with other field name */
    private long f283a;

    /* renamed from: a, reason: collision with other field name */
    String f284a;

    /* renamed from: a, reason: collision with other field name */
    private final LinkedList<cc> f285a;

    public ck() {
        this(null, 0);
    }

    public ck(String str) {
        this(str, 0);
    }

    public ck(String str, int i) {
        this.f285a = new LinkedList<>();
        this.f283a = 0L;
        this.f284a = str;
        this.f14490a = i;
    }

    protected synchronized void a(cc ccVar) {
        if (ccVar != null) {
            this.f285a.add(ccVar);
            int a2 = ccVar.a();
            if (a2 > 0) {
                this.f14490a += ccVar.a();
            } else {
                int i = 0;
                for (int size = this.f285a.size() - 1; size >= 0 && this.f285a.get(size).a() < 0; size--) {
                    i++;
                }
                this.f14490a += a2 * i;
            }
            if (this.f285a.size() > 30) {
                this.f14490a -= this.f285a.remove().a();
            }
        }
    }

    public String toString() {
        return this.f284a + ":" + this.f14490a;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(ck ckVar) {
        if (ckVar == null) {
            return 1;
        }
        return ckVar.f14490a - this.f14490a;
    }

    public synchronized JSONObject a() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        jSONObject.put("tt", this.f283a);
        jSONObject.put(com.anythink.expressad.f.a.b.R, this.f14490a);
        jSONObject.put("host", this.f284a);
        JSONArray jSONArray = new JSONArray();
        Iterator<cc> it = this.f285a.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().m11950a());
        }
        jSONObject.put("ah", jSONArray);
        return jSONObject;
    }

    public synchronized ck a(JSONObject jSONObject) {
        this.f283a = jSONObject.getLong("tt");
        this.f14490a = jSONObject.getInt(com.anythink.expressad.f.a.b.R);
        this.f284a = jSONObject.getString("host");
        JSONArray jSONArray = jSONObject.getJSONArray("ah");
        for (int i = 0; i < jSONArray.length(); i++) {
            this.f285a.add(new cc().a(jSONArray.getJSONObject(i)));
        }
        return this;
    }
}
