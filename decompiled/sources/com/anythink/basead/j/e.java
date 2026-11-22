package com.anythink.basead.j;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.v.ac;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    w f2824a;
    x b;
    b c;
    a d;
    d e;
    float f;
    float g;
    private boolean m;
    private WeakReference<View> n;
    private List<WeakReference<View>> o;
    private final String j = "e";
    private boolean k = false;
    private boolean l = false;
    boolean h = false;
    boolean i = false;

    static /* synthetic */ boolean e(e eVar) {
        eVar.l = true;
        return true;
    }

    public e(w wVar, x xVar) {
        this.f2824a = wVar;
        this.b = xVar;
        ac.a();
        boolean d = ac.d();
        this.m = d;
        if (d) {
            return;
        }
        t.b().F();
    }

    private static boolean c() {
        return f.a().b();
    }

    public final void a(final int i, final View view) {
        if (this.k || !this.m || !f.a().b() || this.h || this.i || TextUtils.isEmpty(this.f2824a.av())) {
            return;
        }
        t.b().b(new Runnable() { // from class: com.anythink.basead.j.e.1
            @Override // java.lang.Runnable
            public final void run() {
                View view2;
                View view3;
                if (e.this.h || e.this.i) {
                    return;
                }
                Context g = t.b().g();
                if (g == null) {
                    g = com.anythink.basead.c.a().f();
                }
                if (g == null && (view3 = view) != null && (g = view3.getContext()) != null) {
                    g = g.getApplicationContext();
                }
                String unused = e.this.j;
                int i2 = i;
                try {
                    switch (i2) {
                        case 112:
                            if (e.this.c != null) {
                                e.this.i = true;
                                e.this.c.b();
                                e.this.c = null;
                                break;
                            }
                            break;
                        case 113:
                            if (e.this.e != null && e.this.c != null) {
                                e.this.e.j();
                                break;
                            }
                            break;
                        case 114:
                            if (!e.this.l) {
                                e.e(e.this);
                                if (!e.this.a()) {
                                    boolean isEmpty = TextUtils.isEmpty(e.this.f2824a.E());
                                    boolean z = !isEmpty;
                                    if (e.this.c != null && e.this.d == null) {
                                        e eVar = e.this;
                                        eVar.d = eVar.c.c();
                                    }
                                    if (e.this.d != null) {
                                        e.this.d.a(z);
                                        e.this.d.a();
                                    } else {
                                        String str = "";
                                        if (e.this.b != null) {
                                            str = e.this.b.d;
                                        }
                                        r3 = e.this.f2824a != null ? e.this.f2824a.ao() : 0;
                                        String unused2 = e.this.j;
                                        com.anythink.core.common.u.e.b("Omsdk Exception", "create omsdkAdEvent fail:is empty,requestId:" + str + ",offerResourceType:" + r3, t.b().r());
                                    }
                                    if (!isEmpty && e.this.c != null && e.this.e == null) {
                                        e eVar2 = e.this;
                                        eVar2.e = eVar2.c.d();
                                        break;
                                    }
                                }
                            } else {
                                break;
                            }
                            break;
                        default:
                            switch (i2) {
                                case 201:
                                    if (view == null) {
                                        e.a(e.this, "2", "omsdkMeasureView is empty");
                                        e.this.h = true;
                                        break;
                                    } else {
                                        if (e.this.a()) {
                                            if ((view instanceof WebView) && g != null) {
                                                if (!TextUtils.isEmpty(e.this.f2824a.o())) {
                                                    e.this.c = f.a().a(g, (WebView) view, e.this.f2824a, e.this.b);
                                                }
                                            } else {
                                                e.a(e.this, "2", "omsdkMeasureView is not webview");
                                            }
                                        } else {
                                            e.this.c = f.a().a(g, !TextUtils.isEmpty(e.this.f2824a.E()), e.this.f2824a, e.this.b);
                                        }
                                        if (e.this.c != null) {
                                            e.this.c.a(view);
                                            if (e.this.n != null && (view2 = (View) e.this.n.get()) != null) {
                                                e.this.c.b(view2);
                                            }
                                            if (e.this.o != null && !e.this.o.isEmpty()) {
                                                ArrayList arrayList = new ArrayList();
                                                while (r3 < e.this.o.size()) {
                                                    View view4 = (View) ((WeakReference) e.this.o.get(r3)).get();
                                                    if (view4 != null) {
                                                        arrayList.add(view4);
                                                    }
                                                    r3++;
                                                }
                                                e.this.c.a(arrayList);
                                            }
                                            e.this.c.a();
                                            break;
                                        } else {
                                            e.this.h = true;
                                            break;
                                        }
                                    }
                                    break;
                                case 202:
                                    if (e.this.e != null && e.this.c != null) {
                                        e.this.e.a(e.this.f, e.this.g);
                                        break;
                                    }
                                    break;
                                case 203:
                                    if (e.this.e != null && e.this.c != null) {
                                        e.this.e.a();
                                        break;
                                    }
                                    break;
                                case 204:
                                    if (e.this.e != null && e.this.c != null) {
                                        e.this.e.b();
                                        break;
                                    }
                                    break;
                                case 205:
                                    if (e.this.e != null && e.this.c != null) {
                                        e.this.e.c();
                                        break;
                                    }
                                    break;
                                case 206:
                                    if (e.this.e != null && e.this.c != null) {
                                        e.this.e.d();
                                        break;
                                    }
                                    break;
                                case 207:
                                    if (e.this.e != null && e.this.c != null) {
                                        e.this.e.e();
                                        break;
                                    }
                                    break;
                                case 208:
                                    if (e.this.e != null && e.this.c != null) {
                                        e.this.e.f();
                                        break;
                                    }
                                    break;
                                case 209:
                                    if (e.this.e != null && e.this.c != null) {
                                        e.this.e.g();
                                        break;
                                    }
                                    break;
                                case 210:
                                    if (e.this.e != null && e.this.c != null) {
                                        e.this.e.h();
                                        break;
                                    }
                                    break;
                                case 211:
                                    if (e.this.e != null && e.this.c != null) {
                                        e.this.e.i();
                                        break;
                                    }
                                    break;
                                case 212:
                                    if (e.this.e != null && e.this.c != null) {
                                        e.this.e.a(e.this.g);
                                        break;
                                    }
                                    break;
                            }
                    }
                } catch (Throwable th) {
                    if (t.b().F()) {
                        th.printStackTrace();
                    }
                    String unused3 = e.this.j;
                    th.getMessage();
                    com.anythink.core.common.u.e.b("Omsdk Exception", "handle:" + i + " with throwable:" + th.getMessage(), t.b().r());
                }
            }
        });
    }

    private void a(String str, String str2) {
        String str3;
        if (a()) {
            str3 = "1";
        } else if (!TextUtils.isEmpty(this.f2824a.E())) {
            str3 = "3";
        } else {
            str3 = "2";
        }
        com.anythink.core.common.u.e.a(this.b, this.f2824a, f.a().c(), str3, false, str, str2);
    }

    public final boolean a() {
        return !com.anythink.basead.b.e.a(this.f2824a, this.b) && this.f2824a.n();
    }

    public final void a(boolean z) {
        if (z) {
            this.g = 0.0f;
        } else {
            this.g = 1.0f;
        }
    }

    public final void a(long j) {
        this.f = j;
    }

    public final void a(View view) {
        if (view != null) {
            this.n = new WeakReference<>(view);
        }
    }

    public final void b(View view) {
        if (view != null) {
            if (this.o == null) {
                this.o = new ArrayList();
            }
            this.o.add(new WeakReference<>(view));
        }
    }

    public final void b() {
        this.k = true;
    }

    static /* synthetic */ void a(e eVar, String str, String str2) {
        String str3;
        if (eVar.a()) {
            str3 = "1";
        } else if (!TextUtils.isEmpty(eVar.f2824a.E())) {
            str3 = "3";
        } else {
            str3 = "2";
        }
        com.anythink.core.common.u.e.a(eVar.b, eVar.f2824a, f.a().c(), str3, false, str, str2);
    }
}
