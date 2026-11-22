package com.baidu.ar;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;

/* loaded from: classes12.dex */
public class ic implements f8 {

    /* renamed from: a, reason: collision with root package name */
    public final String f6986a;
    public volatile f8 b;
    public Boolean c;
    public Method d;
    public w3 e;
    public Queue<kc> f;
    public final boolean g;

    public ic(String str, Queue<kc> queue, boolean z) {
        this.f6986a = str;
        this.f = queue;
        this.g = z;
    }

    public void a(f8 f8Var) {
        this.b = f8Var;
    }

    public void a(h8 h8Var) {
        if (d()) {
            try {
                this.d.invoke(this.b, h8Var);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
    }

    @Override // com.baidu.ar.f8
    public void a(String str) {
        b().a(str);
    }

    @Override // com.baidu.ar.f8
    public void a(String str, Object obj) {
        b().a(str, obj);
    }

    @Override // com.baidu.ar.f8
    public void a(String str, Object obj, Object obj2) {
        b().a(str, obj, obj2);
    }

    @Override // com.baidu.ar.f8
    public void a(String str, Throwable th) {
        b().a(str, th);
    }

    @Override // com.baidu.ar.f8
    public boolean a() {
        return b().a();
    }

    public f8 b() {
        return this.b != null ? this.b : this.g ? e9.b : c();
    }

    @Override // com.baidu.ar.f8
    public void b(String str) {
        b().b(str);
    }

    @Override // com.baidu.ar.f8
    public void b(String str, Throwable th) {
        b().b(str, th);
    }

    public final f8 c() {
        if (this.e == null) {
            this.e = new w3(this, this.f);
        }
        return this.e;
    }

    public boolean d() {
        Boolean bool = this.c;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.d = this.b.getClass().getMethod("log", h8.class);
            this.c = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.c = Boolean.FALSE;
        }
        return this.c.booleanValue();
    }

    public boolean e() {
        return this.b instanceof e9;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && ic.class == obj.getClass() && this.f6986a.equals(((ic) obj).f6986a);
    }

    public boolean f() {
        return this.b == null;
    }

    @Override // com.baidu.ar.f8
    public String getName() {
        return this.f6986a;
    }

    public int hashCode() {
        return this.f6986a.hashCode();
    }
}
