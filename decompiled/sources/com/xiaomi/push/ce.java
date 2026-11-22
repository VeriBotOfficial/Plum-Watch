package com.xiaomi.push;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
class ce {

    /* renamed from: a, reason: collision with root package name */
    private String f14484a;

    /* renamed from: a, reason: collision with other field name */
    private final ArrayList<cd> f269a = new ArrayList<>();

    public ce(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("the host is empty");
        }
        this.f14484a = str;
    }

    public ce() {
    }

    public synchronized void a(cd cdVar) {
        int i = 0;
        while (true) {
            if (i >= this.f269a.size()) {
                break;
            }
            if (this.f269a.get(i).a(cdVar)) {
                this.f269a.set(i, cdVar);
                break;
            }
            i++;
        }
        if (i >= this.f269a.size()) {
            this.f269a.add(cdVar);
        }
    }

    public synchronized cd a() {
        for (int size = this.f269a.size() - 1; size >= 0; size--) {
            cd cdVar = this.f269a.get(size);
            if (cdVar.m11954a()) {
                ch.a().m11965a(cdVar.a());
                return cdVar;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f14484a);
        sb.append("\n");
        Iterator<cd> it = this.f269a.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
        }
        return sb.toString();
    }

    /* renamed from: a, reason: collision with other method in class */
    public ArrayList<cd> m11956a() {
        return this.f269a;
    }

    public synchronized void a(boolean z) {
        for (int size = this.f269a.size() - 1; size >= 0; size--) {
            cd cdVar = this.f269a.get(size);
            if (z) {
                if (cdVar.c()) {
                    this.f269a.remove(size);
                }
            } else if (!cdVar.b()) {
                this.f269a.remove(size);
            }
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public String m11955a() {
        return this.f14484a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public synchronized JSONObject m11957a() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        jSONObject.put("host", this.f14484a);
        JSONArray jSONArray = new JSONArray();
        Iterator<cd> it = this.f269a.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().m11952a());
        }
        jSONObject.put("fbs", jSONArray);
        return jSONObject;
    }

    public synchronized ce a(JSONObject jSONObject) {
        this.f14484a = jSONObject.getString("host");
        JSONArray jSONArray = jSONObject.getJSONArray("fbs");
        for (int i = 0; i < jSONArray.length(); i++) {
            this.f269a.add(new cd(this.f14484a).a(jSONArray.getJSONObject(i)));
        }
        return this;
    }
}
