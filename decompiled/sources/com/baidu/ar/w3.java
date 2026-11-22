package com.baidu.ar;

import java.util.Queue;

/* loaded from: classes12.dex */
public class w3 implements f8 {

    /* renamed from: a, reason: collision with root package name */
    public String f7301a;
    public ic b;
    public Queue<kc> c;

    public w3(ic icVar, Queue<kc> queue) {
        this.b = icVar;
        this.f7301a = icVar.getName();
        this.c = queue;
    }

    public final void a(z7 z7Var, n8 n8Var, String str, Object[] objArr, Throwable th) {
        kc kcVar = new kc();
        kcVar.a(System.currentTimeMillis());
        kcVar.a(z7Var);
        kcVar.a(this.b);
        kcVar.a(this.f7301a);
        kcVar.a(n8Var);
        kcVar.b(str);
        kcVar.a(objArr);
        kcVar.a(th);
        kcVar.c(Thread.currentThread().getName());
        this.c.add(kcVar);
    }

    public final void a(z7 z7Var, String str, Object[] objArr, Throwable th) {
        a(z7Var, null, str, objArr, th);
    }

    @Override // com.baidu.ar.f8
    public void a(String str) {
        a(z7.ERROR, str, null, null);
    }

    @Override // com.baidu.ar.f8
    public void a(String str, Object obj) {
        a(z7.TRACE, str, new Object[]{obj}, null);
    }

    @Override // com.baidu.ar.f8
    public void a(String str, Object obj, Object obj2) {
        a(z7.TRACE, str, new Object[]{obj, obj2}, null);
    }

    @Override // com.baidu.ar.f8
    public void a(String str, Throwable th) {
        a(z7.TRACE, str, null, th);
    }

    @Override // com.baidu.ar.f8
    public boolean a() {
        return true;
    }

    @Override // com.baidu.ar.f8
    public void b(String str) {
        a(z7.TRACE, str, null, null);
    }

    @Override // com.baidu.ar.f8
    public void b(String str, Throwable th) {
        a(z7.ERROR, str, null, th);
    }

    @Override // com.baidu.ar.f8
    public String getName() {
        return this.f7301a;
    }
}
