package com.vivo.push.e;

import com.vivo.push.restructure.request.a.a.c;
import org.json.JSONException;

/* compiled from: ProfileInfoDS.java */
/* loaded from: classes2.dex */
public final class b implements com.vivo.push.restructure.request.a.a.c {

    /* renamed from: a, reason: collision with root package name */
    public static c.a<b> f14076a = new c();
    private String b;

    public b(String str) {
        this.b = str;
    }

    protected b(com.vivo.push.restructure.request.a.a.a aVar) throws JSONException {
        this.b = aVar.c();
    }

    @Override // com.vivo.push.restructure.request.a.a.c
    public final String a() {
        com.vivo.push.restructure.request.a.a.a aVar = new com.vivo.push.restructure.request.a.a.a();
        aVar.a(this.b);
        return aVar.e();
    }

    public final String b() {
        return this.b;
    }
}
