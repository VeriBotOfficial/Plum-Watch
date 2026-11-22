package com.yandex.mobile.ads.impl;

/* loaded from: classes5.dex */
public final class ty {

    /* renamed from: a, reason: collision with root package name */
    public final String f17001a;
    public final jc0 b;
    public final jc0 c;
    public final int d;
    public final int e;

    public ty(String str, jc0 jc0Var, jc0 jc0Var2, int i, int i2) {
        hg.a(i == 0 || i2 == 0);
        this.f17001a = hg.a(str);
        this.b = (jc0) hg.a(jc0Var);
        this.c = (jc0) hg.a(jc0Var2);
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ty.class == obj.getClass()) {
            ty tyVar = (ty) obj;
            if (this.d == tyVar.d && this.e == tyVar.e && this.f17001a.equals(tyVar.f17001a) && this.b.equals(tyVar.b) && this.c.equals(tyVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + v3.a(this.f17001a, (((this.d + 527) * 31) + this.e) * 31, 31)) * 31);
    }
}
