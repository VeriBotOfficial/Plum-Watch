package com.alipay.sdk.m.c0;

import java.util.Iterator;
import java.util.Stack;

/* loaded from: classes11.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public Stack<e> f1366a = new Stack<>();

    public void a(e eVar) {
        this.f1366a.push(eVar);
    }

    public boolean b() {
        return this.f1366a.isEmpty();
    }

    public e c() {
        return this.f1366a.pop();
    }

    public void a() {
        if (b()) {
            return;
        }
        Iterator<e> it = this.f1366a.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
        this.f1366a.clear();
    }
}
