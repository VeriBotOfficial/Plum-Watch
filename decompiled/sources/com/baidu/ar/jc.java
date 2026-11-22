package com.baidu.ar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes12.dex */
public class jc implements i6 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f7041a = false;
    public final Map<String, ic> b = new HashMap();
    public final LinkedBlockingQueue<kc> c = new LinkedBlockingQueue<>();

    @Override // com.baidu.ar.i6
    public synchronized f8 a(String str) {
        ic icVar;
        icVar = this.b.get(str);
        if (icVar == null) {
            icVar = new ic(str, this.c, this.f7041a);
            this.b.put(str, icVar);
        }
        return icVar;
    }

    public void a() {
        this.b.clear();
        this.c.clear();
    }

    public LinkedBlockingQueue<kc> b() {
        return this.c;
    }

    public List<ic> c() {
        return new ArrayList(this.b.values());
    }

    public void d() {
        this.f7041a = true;
    }
}
