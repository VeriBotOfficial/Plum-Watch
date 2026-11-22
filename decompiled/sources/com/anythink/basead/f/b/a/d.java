package com.anythink.basead.f.b.a;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.anythink.basead.d.j;
import com.anythink.basead.ui.a;
import com.anythink.core.common.h.bj;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.v.a.f;
import org.json.JSONArray;

/* loaded from: classes11.dex */
public abstract class d implements com.anythink.basead.f.a {
    protected int A;
    protected int B;
    JSONArray C;
    protected long D;

    /* renamed from: a, reason: collision with root package name */
    private final String f2767a = "d";
    protected Context r;
    bj s;
    x t;
    protected boolean u;
    protected com.anythink.basead.g.a v;
    protected a.InterfaceC0166a w;
    boolean x;
    String y;
    protected int z;

    @Override // com.anythink.basead.f.a
    public View B() {
        return null;
    }

    @Override // com.anythink.basead.f.a
    public long C() {
        return 0L;
    }

    protected abstract View H();

    @Override // com.anythink.basead.f.a
    public void b(boolean z) {
    }

    @Override // com.anythink.basead.f.a
    public void q() {
    }

    @Override // com.anythink.basead.f.a
    public void u() {
    }

    @Override // com.anythink.basead.f.a
    public void v() {
    }

    public d(Context context, bj bjVar, x xVar, boolean z) {
        this.z = 1;
        this.r = context.getApplicationContext();
        this.s = bjVar;
        this.t = xVar;
        this.u = z;
        this.z = com.anythink.basead.b.e.a(bjVar, xVar) ? 1 : 2;
    }

    @Override // com.anythink.basead.f.a
    public void a(int i, int i2) {
        this.A = i;
        this.B = i2;
    }

    @Override // com.anythink.basead.f.a
    public final void a(JSONArray jSONArray) {
        this.C = jSONArray;
    }

    @Override // com.anythink.basead.f.a
    public final w a() {
        return this.s;
    }

    @Override // com.anythink.basead.f.a
    public final String c() {
        bj bjVar = this.s;
        if (bjVar != null) {
            return bjVar.x();
        }
        return "";
    }

    @Override // com.anythink.basead.f.a
    public final String d() {
        bj bjVar = this.s;
        if (bjVar != null) {
            return bjVar.y();
        }
        return "";
    }

    @Override // com.anythink.basead.f.a
    public final String e() {
        bj bjVar = this.s;
        if (bjVar != null) {
            return bjVar.D();
        }
        return "";
    }

    @Override // com.anythink.basead.f.a
    public final String f() {
        bj bjVar = this.s;
        if (bjVar != null) {
            return bjVar.z();
        }
        return "";
    }

    @Override // com.anythink.basead.f.a
    public final String g() {
        bj bjVar = this.s;
        if (bjVar != null) {
            return bjVar.B();
        }
        return "";
    }

    @Override // com.anythink.basead.f.a
    public final String h() {
        bj bjVar = this.s;
        if (bjVar != null) {
            return bjVar.C();
        }
        return "";
    }

    @Override // com.anythink.basead.f.a
    public final String i() {
        bj bjVar = this.s;
        if (bjVar != null) {
            return bjVar.aL();
        }
        return "";
    }

    @Override // com.anythink.basead.f.a
    public final String j() {
        bj bjVar = this.s;
        if (bjVar != null) {
            return bjVar.M();
        }
        return "";
    }

    @Override // com.anythink.basead.f.a
    public final String k() {
        bj bjVar = this.s;
        if (bjVar != null) {
            return bjVar.P();
        }
        return "";
    }

    @Override // com.anythink.basead.f.a
    public final String l() {
        bj bjVar = this.s;
        if (bjVar != null) {
            return bjVar.O();
        }
        return "";
    }

    @Override // com.anythink.basead.f.a
    public final String m() {
        bj bjVar = this.s;
        if (bjVar != null) {
            return bjVar.N();
        }
        return "";
    }

    @Override // com.anythink.basead.f.a
    public final String n() {
        bj bjVar = this.s;
        if (bjVar != null) {
            return bjVar.h();
        }
        return "";
    }

    @Override // com.anythink.basead.f.a
    public final boolean o() {
        bj bjVar = this.s;
        if (bjVar != null) {
            return (TextUtils.isEmpty(bjVar.M()) && TextUtils.isEmpty(this.s.aL()) && TextUtils.isEmpty(this.s.P()) && TextUtils.isEmpty(this.s.O()) && TextUtils.isEmpty(this.s.h()) && TextUtils.isEmpty(this.s.N())) ? false : true;
        }
        return false;
    }

    @Override // com.anythink.basead.f.a
    public boolean p() {
        return this.u;
    }

    @Override // com.anythink.basead.f.a
    public void a(com.anythink.basead.g.a aVar) {
        this.v = aVar;
    }

    @Override // com.anythink.basead.f.a
    public void a(boolean z) {
        this.x = z;
    }

    @Override // com.anythink.basead.f.a
    public void a(String str) {
        this.y = str;
    }

    @Override // com.anythink.basead.f.a
    public void r() {
        q();
        this.v = null;
    }

    @Override // com.anythink.basead.f.a
    public final boolean a(boolean z, boolean z2) {
        if (this.s.t() != 67) {
            return false;
        }
        return this.s.a(z, z2);
    }

    @Override // com.anythink.basead.f.a
    public void s() {
        u();
    }

    @Override // com.anythink.basead.f.a
    public void t() {
        v();
    }

    @Override // com.anythink.basead.f.a
    public final int w() {
        return this.z;
    }

    @Override // com.anythink.basead.f.a
    public final int x() {
        bj bjVar = this.s;
        if (bjVar != null) {
            return bjVar.ab();
        }
        return 0;
    }

    @Override // com.anythink.basead.f.a
    public final int y() {
        bj bjVar = this.s;
        if (bjVar != null) {
            return bjVar.ac();
        }
        return 0;
    }

    @Override // com.anythink.basead.f.a
    public final int z() {
        bj bjVar = this.s;
        if (bjVar != null) {
            return bjVar.K();
        }
        return 0;
    }

    @Override // com.anythink.basead.f.a
    public final int A() {
        bj bjVar;
        if (this.u || (bjVar = this.s) == null) {
            return 0;
        }
        return bjVar.aa();
    }

    @Override // com.anythink.basead.f.a
    public final void a(a.InterfaceC0166a interfaceC0166a) {
        this.w = interfaceC0166a;
    }

    @Override // com.anythink.basead.f.a
    public final int D() {
        bj bjVar = this.s;
        if (bjVar != null) {
            return bjVar.V();
        }
        return 0;
    }

    @Override // com.anythink.basead.f.a
    public final int E() {
        bj bjVar = this.s;
        if (bjVar != null) {
            return bjVar.W();
        }
        return 0;
    }

    @Override // com.anythink.basead.f.a
    public final long F() {
        bj bjVar = this.s;
        if (bjVar != null) {
            return bjVar.X();
        }
        return 0L;
    }

    final j M() {
        j jVar = new j(this.t, "");
        View H = H();
        if (H != null) {
            jVar.g = H.getWidth();
            jVar.h = H.getHeight();
            try {
                int[] iArr = new int[2];
                H.getLocationOnScreen(iArr);
                jVar.n = iArr[0];
                jVar.o = iArr[1];
            } catch (Throwable unused) {
            }
            jVar.p = f.b.a(H);
            long j = this.D;
            if (j > 0) {
                jVar.f2339q = j;
            }
        }
        return jVar;
    }
}
