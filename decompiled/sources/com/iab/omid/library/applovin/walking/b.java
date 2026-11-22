package com.iab.omid.library.applovin.walking;

import com.iab.omid.library.applovin.walking.async.b;
import com.iab.omid.library.applovin.walking.async.d;
import com.iab.omid.library.applovin.walking.async.e;
import com.iab.omid.library.applovin.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public class b implements b.InterfaceC0618b {

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f10891a;
    private final com.iab.omid.library.applovin.walking.async.c b;

    public b(com.iab.omid.library.applovin.walking.async.c cVar) {
        this.b = cVar;
    }

    @Override // com.iab.omid.library.applovin.walking.async.b.InterfaceC0618b
    public JSONObject a() {
        return this.f10891a;
    }

    @Override // com.iab.omid.library.applovin.walking.async.b.InterfaceC0618b
    public void a(JSONObject jSONObject) {
        this.f10891a = jSONObject;
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.b.b(new e(this, hashSet, jSONObject, j));
    }

    public void b() {
        this.b.b(new d(this));
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.b.b(new f(this, hashSet, jSONObject, j));
    }
}
