package com.anythink.core.common.m.c;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.common.v.af;

/* loaded from: classes12.dex */
public class a extends d {
    public a(Context context) {
        super(context);
    }

    @Override // com.anythink.core.common.m.c.d, com.anythink.core.common.m.c.i
    public final com.anythink.core.common.m.b.f a(com.anythink.core.common.m.b.d dVar) {
        if (!b(dVar)) {
            return null;
        }
        com.anythink.core.common.m.b.f a2 = super.a(dVar);
        if (a2 != null && a2.e()) {
            a2.b(com.anythink.core.common.m.a.m);
        }
        return a2;
    }

    @Override // com.anythink.core.common.m.c.i
    public final void a(com.anythink.core.common.m.b.f fVar, com.anythink.core.common.m.b.d dVar) {
        if (!b(dVar) || fVar == null) {
            return;
        }
        int c = fVar.c();
        String b = fVar.b();
        long d = fVar.d();
        if (c != 699 || d <= 0) {
            return;
        }
        synchronized (this.d) {
            new Object[]{b, Long.valueOf(d)};
            if (this.c != null) {
                this.c.put(b, Long.valueOf(d));
            }
            af.a(this.b, "anythink_app_pl_cl_retry", b, d);
        }
    }

    @Override // com.anythink.core.common.m.c.d
    protected final boolean b(com.anythink.core.common.m.b.d dVar) {
        if (this.b != null && dVar != null) {
            String b = dVar.b();
            String a2 = dVar.a();
            if ((com.anythink.core.common.m.b.g.b.equals(b) || com.anythink.core.common.m.b.g.f4000a.equals(b) || com.anythink.core.common.m.b.g.e.equals(b)) && !TextUtils.isEmpty(a2)) {
                return true;
            }
        }
        return false;
    }

    private void a(String str, long j) {
        new Object[]{str, Long.valueOf(j)};
        if (this.c != null) {
            this.c.put(str, Long.valueOf(j));
        }
        af.a(this.b, "anythink_app_pl_cl_retry", str, j);
    }
}
