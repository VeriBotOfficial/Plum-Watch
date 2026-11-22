package com.vivo.push.restructure.a.a;

import com.vivo.push.util.t;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: AbstractMessageNodeMonitor.java */
/* loaded from: classes2.dex */
abstract class a<T> {

    /* renamed from: a, reason: collision with root package name */
    protected T f14116a;
    private String b;
    private i e;
    private a g;
    private long c = -1;
    private int d = -1;
    private boolean f = false;

    protected abstract int a(T t);

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;TT;Lcom/vivo/push/restructure/a/a/i;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public a(String str, com.vivo.push.restructure.a.a aVar, j jVar) {
        this.b = str;
        this.f14116a = aVar;
        this.e = jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        long currentTimeMillis = System.currentTimeMillis();
        this.d = a((a<T>) this.f14116a);
        this.c = System.currentTimeMillis() - currentTimeMillis;
        int i = this.d;
        if (i != 0) {
            i iVar = this.e;
            if (iVar != null) {
                iVar.a(this, this.f14116a, i);
                return;
            }
            return;
        }
        a aVar = this.g;
        if (aVar != null) {
            aVar.a();
            return;
        }
        i iVar2 = this.e;
        if (iVar2 != null) {
            iVar2.a((i) this.f14116a);
        }
    }

    public synchronized String b() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("name", this.b);
            jSONObject.put("code", this.d);
            jSONObject.put("cost", this.c);
        } catch (Exception e) {
            t.a("AbstractMessageNodeMoni", e);
        }
        return jSONObject.toString();
    }

    public final void a(a aVar) {
        if (this != aVar) {
            this.g = aVar;
        }
    }

    public final void a(long j) {
        this.c = j;
    }

    public final JSONArray c() {
        JSONArray jSONArray = new JSONArray();
        for (a<T> aVar = this; aVar != null; aVar = aVar.g) {
            try {
                jSONArray.put(aVar.b());
            } catch (Exception e) {
                t.a("AbstractMessageNodeMoni", e);
            }
        }
        return jSONArray;
    }

    public final void a() {
        if (this.f) {
            com.vivo.push.util.g.a().execute(new b(this));
        } else {
            d();
        }
    }
}
