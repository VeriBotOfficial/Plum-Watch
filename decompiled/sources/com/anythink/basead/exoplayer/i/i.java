package com.anythink.basead.exoplayer.i;

import com.anythink.basead.exoplayer.aa;
import com.anythink.basead.exoplayer.k.af;

/* loaded from: classes11.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f2617a;
    public final aa[] b;
    public final g c;
    public final Object d;

    public i(aa[] aaVarArr, f[] fVarArr, Object obj) {
        this.b = aaVarArr;
        this.c = new g(fVarArr);
        this.d = obj;
        this.f2617a = aaVarArr.length;
    }

    public final boolean a(int i) {
        return this.b[i] != null;
    }

    public final boolean a(i iVar) {
        if (iVar == null || iVar.c.f2615a != this.c.f2615a) {
            return false;
        }
        for (int i = 0; i < this.c.f2615a; i++) {
            if (!a(iVar, i)) {
                return false;
            }
        }
        return true;
    }

    public final boolean a(i iVar, int i) {
        return iVar != null && af.a(this.b[i], iVar.b[i]) && af.a(this.c.a(i), iVar.c.a(i));
    }
}
