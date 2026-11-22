package com.anythink.expressad.advanced.d;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import com.anythink.core.common.d.t;
import com.anythink.expressad.advanced.c.d;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.anythink.expressad.advanced.view.ATNativeAdvancedView;
import com.anythink.expressad.advanced.view.ATNativeAdvancedWebview;
import com.anythink.expressad.advanced.view.ATOutNativeAdvancedViewGroup;
import com.anythink.expressad.atsignalcommon.windvane.h;
import com.anythink.expressad.foundation.d.e;
import com.anythink.expressad.foundation.h.aa;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.out.p;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class c implements com.anythink.basead.f.c.c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f4625a = 1;
    public static final int b = 2;
    public static final int c = 3;
    private static String g = "NativeAdvancedProvider";
    private JSONObject C;
    private ATOutNativeAdvancedViewGroup E;
    private boolean F;
    private boolean G;
    private boolean H;
    boolean e;
    e f;
    private String h;
    private String i;
    private com.anythink.expressad.advanced.c.b j;
    private com.anythink.expressad.advanced.c.c k;
    private b l;
    private p m;
    private d n;
    private ATNativeAdvancedView o;
    private ATNativeAdvancedWebview p;

    /* renamed from: q, reason: collision with root package name */
    private com.anythink.expressad.advanced.view.a f4626q;
    private com.anythink.expressad.f.c r;
    private boolean s;
    private int t = -1;
    private boolean u = false;
    private int v = 0;
    private boolean w = false;
    private int x = 0;
    private boolean y = false;
    private int z = 0;
    private int A = 0;
    private Object B = new Object();
    private boolean D = false;
    private boolean I = true;
    public boolean d = false;
    private ViewTreeObserver.OnScrollChangedListener J = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.anythink.expressad.advanced.d.c.1
        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public final void onScrollChanged() {
            if (c.this.I) {
                c.this.I = false;
                if (c.this.E != null) {
                    c.this.E.postDelayed(new Runnable() { // from class: com.anythink.expressad.advanced.d.c.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            c.this.I = true;
                        }
                    }, 1000L);
                }
                try {
                    c.this.j();
                } catch (Throwable unused) {
                }
            }
        }
    };

    @Override // com.anythink.basead.f.c.c
    public boolean isReady() {
        return true;
    }

    public final boolean a() {
        return this.s;
    }

    public final void b() {
        this.s = false;
    }

    public final ATOutNativeAdvancedViewGroup c() {
        return this.E;
    }

    public c(String str, String str2, Context context) {
        com.anythink.expressad.advanced.view.a aVar;
        ViewGroup.LayoutParams layoutParams;
        this.i = TextUtils.isEmpty(str) ? "" : str;
        this.h = str2;
        if (this.k == null) {
            com.anythink.expressad.advanced.c.c cVar = new com.anythink.expressad.advanced.c.c(t.b().g(), this.i, this.h);
            this.k = cVar;
            cVar.a(this);
        }
        if (this.p == null) {
            try {
                this.p = new ATNativeAdvancedWebview(t.b().g());
            } catch (Throwable unused) {
            }
            if (this.f4626q == null) {
                try {
                    this.f4626q = new com.anythink.expressad.advanced.view.a(this.h, this.k.b(), this);
                } catch (Throwable unused2) {
                }
            }
            ATNativeAdvancedWebview aTNativeAdvancedWebview = this.p;
            if (aTNativeAdvancedWebview != null && (aVar = this.f4626q) != null) {
                aTNativeAdvancedWebview.setWebViewClient(aVar);
            }
        }
        if (this.o == null) {
            ATNativeAdvancedView aTNativeAdvancedView = new ATNativeAdvancedView(context);
            this.o = aTNativeAdvancedView;
            aTNativeAdvancedView.setAdvancedNativeWebview(this.p);
            ATNativeAdvancedWebview aTNativeAdvancedWebview2 = this.p;
            if (aTNativeAdvancedWebview2 != null && aTNativeAdvancedWebview2.getParent() == null) {
                this.o.addView(this.p, new ViewGroup.LayoutParams(-1, -1));
            }
        }
        if (this.E == null) {
            this.E = new ATOutNativeAdvancedViewGroup(t.b().g());
            if (this.z == 0 || this.A == 0) {
                layoutParams = new ViewGroup.LayoutParams(-1, -1);
            } else {
                layoutParams = new ViewGroup.LayoutParams(this.z, this.A);
            }
            this.E.setLayoutParams(layoutParams);
            this.E.setProvider(this);
            this.E.addView(this.o);
            this.E.getViewTreeObserver().addOnScrollChangedListener(this.J);
        }
    }

    private void a(JSONObject jSONObject) {
        this.D = true;
        b(jSONObject);
    }

    private void b(JSONObject jSONObject) {
        if (this.D) {
            this.C = jSONObject;
            ATNativeAdvancedWebview aTNativeAdvancedWebview = this.p;
            if (aTNativeAdvancedWebview == null || aTNativeAdvancedWebview.isDestroyed()) {
                return;
            }
            NativeAdvancedJsUtils.sendThirdToH5(this.p, NativeAdvancedJsUtils.d, "", jSONObject);
        }
    }

    private void f(int i) {
        ATNativeAdvancedWebview aTNativeAdvancedWebview = this.p;
        if (aTNativeAdvancedWebview == null || aTNativeAdvancedWebview.isDestroyed()) {
            return;
        }
        try {
            if (this.p != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(NativeAdvancedJsUtils.m, i);
                h.a();
                h.a((WebView) this.p, NativeAdvancedJsUtils.l, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public final int d() {
        return this.t;
    }

    public final void a(p pVar) {
        this.m = pVar;
    }

    public final void a(int i) {
        this.u = true;
        g(i);
    }

    private void g(int i) {
        if (this.u) {
            this.t = i;
            ATNativeAdvancedWebview aTNativeAdvancedWebview = this.p;
            if (aTNativeAdvancedWebview == null || aTNativeAdvancedWebview.isDestroyed()) {
                return;
            }
            int i2 = this.t;
            if (i2 == 1) {
                this.k.a(true);
                NativeAdvancedJsUtils.sendThirdToH5(this.p, NativeAdvancedJsUtils.f, "", null);
            } else if (i2 == 0) {
                this.k.a(false);
                NativeAdvancedJsUtils.sendThirdToH5(this.p, NativeAdvancedJsUtils.g, "", null);
            }
        }
    }

    public final void b(int i) {
        this.w = true;
        h(i);
    }

    private void h(int i) {
        if (this.w) {
            this.v = i;
            ATNativeAdvancedWebview aTNativeAdvancedWebview = this.p;
            if (aTNativeAdvancedWebview == null || aTNativeAdvancedWebview.isDestroyed()) {
                return;
            }
            NativeAdvancedJsUtils.sendThirdToH5(this.p, NativeAdvancedJsUtils.h, "mute", Integer.valueOf(i));
        }
    }

    public final void c(int i) {
        this.y = true;
        i(i);
    }

    private void i(int i) {
        if (this.y) {
            this.x = i;
            ATNativeAdvancedWebview aTNativeAdvancedWebview = this.p;
            if (aTNativeAdvancedWebview == null || aTNativeAdvancedWebview.isDestroyed()) {
                return;
            }
            NativeAdvancedJsUtils.sendThirdToH5(this.p, NativeAdvancedJsUtils.j, NativeAdvancedJsUtils.k, Integer.valueOf(i));
        }
    }

    private void a(final com.anythink.expressad.foundation.d.d dVar) {
        if (dVar != null) {
            if (this.r == null) {
                com.anythink.expressad.f.b.a();
                this.r = com.anythink.expressad.f.b.b(com.anythink.expressad.foundation.b.a.c().f(), this.h);
            }
            this.n = new d(this, this.m, this.r.a(), dVar);
            if (this.e) {
                return;
            }
            this.e = true;
            com.anythink.expressad.advanced.c.d.a(this.o, dVar, this.i, this.h, this.t, new d.a() { // from class: com.anythink.expressad.advanced.d.c.2
                @Override // com.anythink.expressad.advanced.c.d.a
                public final void a() {
                    String unused = c.g;
                    c.this.a(dVar, false);
                }

                @Override // com.anythink.expressad.advanced.c.d.a
                public final void b() {
                    c.this.e = false;
                }
            });
        }
    }

    private String h() {
        if (this.d) {
            com.anythink.expressad.advanced.c.c cVar = this.k;
            if (cVar != null) {
                return cVar.a();
            }
            return "";
        }
        com.anythink.expressad.advanced.c.b bVar = this.j;
        if (bVar != null) {
            return bVar.a();
        }
        return "";
    }

    private void b(com.anythink.expressad.foundation.d.d dVar) {
        this.k.a(this.n);
        this.k.a(dVar, this.o, true);
    }

    private void i() {
        g(this.t);
        h(this.v);
        i(this.x);
        b(this.C);
        t.b().g();
        f(n.b());
    }

    public final void a(e eVar) {
        this.f = eVar;
        this.I = true;
        this.s = true;
        this.o.clearResStateAndRemoveClose();
        com.anythink.expressad.f.b.a();
        com.anythink.expressad.f.c d = com.anythink.expressad.f.b.d(com.anythink.expressad.foundation.b.a.c().f(), this.h);
        this.r = d;
        if (d == null) {
            this.r = com.anythink.expressad.f.c.y();
        }
        b bVar = new b(this);
        this.l = bVar;
        bVar.a(this.m);
        if (this.j == null) {
            this.j = new com.anythink.expressad.advanced.c.b(this.i, this.h);
        }
        b bVar2 = this.l;
        if (bVar2 != null) {
            this.j.a(bVar2);
        }
        this.o.resetLoadState();
        this.j.a(this.o);
        this.j.a(this.r);
        this.j.a(this.z, this.A);
        this.j.a(this.t);
        this.j.a(eVar);
    }

    private void a(Context context) {
        com.anythink.expressad.advanced.view.a aVar;
        ViewGroup.LayoutParams layoutParams;
        if (this.k == null) {
            com.anythink.expressad.advanced.c.c cVar = new com.anythink.expressad.advanced.c.c(t.b().g(), this.i, this.h);
            this.k = cVar;
            cVar.a(this);
        }
        if (this.p == null) {
            try {
                this.p = new ATNativeAdvancedWebview(t.b().g());
            } catch (Throwable unused) {
            }
            if (this.f4626q == null) {
                try {
                    this.f4626q = new com.anythink.expressad.advanced.view.a(this.h, this.k.b(), this);
                } catch (Throwable unused2) {
                }
            }
            ATNativeAdvancedWebview aTNativeAdvancedWebview = this.p;
            if (aTNativeAdvancedWebview != null && (aVar = this.f4626q) != null) {
                aTNativeAdvancedWebview.setWebViewClient(aVar);
            }
        }
        if (this.o == null) {
            ATNativeAdvancedView aTNativeAdvancedView = new ATNativeAdvancedView(context);
            this.o = aTNativeAdvancedView;
            aTNativeAdvancedView.setAdvancedNativeWebview(this.p);
            ATNativeAdvancedWebview aTNativeAdvancedWebview2 = this.p;
            if (aTNativeAdvancedWebview2 != null && aTNativeAdvancedWebview2.getParent() == null) {
                this.o.addView(this.p, new ViewGroup.LayoutParams(-1, -1));
            }
        }
        if (this.E == null) {
            this.E = new ATOutNativeAdvancedViewGroup(t.b().g());
            if (this.z == 0 || this.A == 0) {
                layoutParams = new ViewGroup.LayoutParams(-1, -1);
            } else {
                layoutParams = new ViewGroup.LayoutParams(this.z, this.A);
            }
            this.E.setLayoutParams(layoutParams);
            this.E.setProvider(this);
            this.E.addView(this.o);
            this.E.getViewTreeObserver().addOnScrollChangedListener(this.J);
        }
    }

    public final String a(String str) {
        com.anythink.expressad.advanced.c.b bVar = this.j;
        if (bVar != null) {
            return bVar.a(str);
        }
        return "";
    }

    private void b(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        this.A = i;
        this.z = i2;
        this.E.setLayoutParams(new ViewGroup.LayoutParams(i2, i));
    }

    public final void d(int i) {
        if (i == 1) {
            this.F = true;
        } else if (i == 2) {
            this.G = true;
        } else if (i == 3) {
            this.H = true;
        }
        try {
            j();
        } catch (Throwable unused) {
        }
    }

    public final void e(int i) {
        if (i == 1) {
            this.F = false;
        } else if (i == 2) {
            this.G = false;
        } else if (i == 3) {
            this.H = false;
        }
        com.anythink.expressad.advanced.c.c cVar = this.k;
        if (cVar != null) {
            cVar.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (this.F && this.G && this.H) {
            com.anythink.expressad.advanced.c.b bVar = this.j;
            com.anythink.expressad.foundation.d.d c2 = bVar != null ? bVar.c() : null;
            if (c2 != null) {
                c2.aL();
            }
            if (aa.a(this.o.getAdvancedNativeWebview(), 0) || this.E.getAlpha() < 0.5f || this.E.getVisibility() != 0) {
                return;
            }
            com.anythink.expressad.advanced.c.c cVar = this.k;
            if (cVar != null) {
                cVar.d();
            }
            a(c2);
        }
    }

    private void k() {
        com.anythink.expressad.advanced.c.c cVar = this.k;
        if (cVar != null) {
            cVar.e();
        }
    }

    public final void e() {
        if (this.m != null) {
            this.m = null;
        }
        if (this.l != null) {
            this.l = null;
        }
        if (this.n != null) {
            this.n = null;
        }
        com.anythink.expressad.advanced.c.b bVar = this.j;
        if (bVar != null) {
            bVar.a((ATNativeAdvancedView) null);
            this.j.b();
        }
        com.anythink.expressad.advanced.c.c cVar = this.k;
        if (cVar != null) {
            cVar.c();
        }
        ATNativeAdvancedView aTNativeAdvancedView = this.o;
        if (aTNativeAdvancedView != null) {
            aTNativeAdvancedView.destroy();
        }
        com.anythink.expressad.advanced.a.a.c(this.f.f());
        com.anythink.expressad.advanced.view.a aVar = this.f4626q;
        if (aVar != null) {
            aVar.b();
        }
        ATOutNativeAdvancedViewGroup aTOutNativeAdvancedViewGroup = this.E;
        if (aTOutNativeAdvancedViewGroup != null) {
            aTOutNativeAdvancedViewGroup.getViewTreeObserver().removeOnScrollChangedListener(this.J);
            this.E.removeAllViews();
            this.E = null;
        }
    }

    public final int f() {
        com.anythink.expressad.advanced.c.b bVar = this.j;
        com.anythink.expressad.foundation.d.d c2 = bVar != null ? bVar.c() : null;
        if (c2 != null) {
            return TextUtils.isEmpty(c2.T()) ? 2 : 1;
        }
        return 0;
    }

    private com.anythink.expressad.f.c l() {
        return this.r;
    }

    public final void a(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        this.A = i;
        this.z = i2;
        this.E.setLayoutParams(new ViewGroup.LayoutParams(i2, i));
    }

    final void a(com.anythink.expressad.foundation.d.d dVar, boolean z) {
        c cVar;
        com.anythink.expressad.foundation.d.d dVar2;
        g(this.t);
        h(this.v);
        i(this.x);
        b(this.C);
        t.b().g();
        f(n.b());
        ATOutNativeAdvancedViewGroup aTOutNativeAdvancedViewGroup = this.E;
        if (aTOutNativeAdvancedViewGroup == null || aTOutNativeAdvancedViewGroup.getParent() == null) {
            return;
        }
        if (dVar == null || !z) {
            cVar = this;
            dVar2 = dVar;
        } else {
            if (this.r == null) {
                com.anythink.expressad.f.b.a();
                this.r = com.anythink.expressad.f.b.b(com.anythink.expressad.foundation.b.a.c().f(), this.h);
            }
            cVar = this;
            dVar2 = dVar;
            cVar.n = new d(cVar, this.m, this.r.a(), dVar2);
        }
        if (cVar.k == null) {
            com.anythink.expressad.advanced.c.c cVar2 = new com.anythink.expressad.advanced.c.c(t.b().g(), cVar.i, cVar.h);
            cVar.k = cVar2;
            cVar2.a(this);
        }
        cVar.k.a(cVar.n);
        cVar.k.a(dVar2, cVar.o, true);
    }
}
