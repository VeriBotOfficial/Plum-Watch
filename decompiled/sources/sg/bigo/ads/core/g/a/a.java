package sg.bigo.ads.core.g.a;

import android.content.Context;
import android.view.ViewGroup;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.core.g.a.b;
import sg.bigo.ads.core.g.f;

/* loaded from: classes9.dex */
public final class a implements sg.bigo.ads.core.g.a {

    /* renamed from: a, reason: collision with root package name */
    final ViewGroup f20045a;
    public b b;
    public InterfaceC1105a c;
    private final b.a d = new b.a() { // from class: sg.bigo.ads.core.g.a.a.1
        @Override // sg.bigo.ads.core.g.a.b.a
        public final void a() {
            if (a.this.c != null) {
                a.this.c.a();
            }
            b b = a.this.b();
            u.a(b, a.this.f20045a, null, -1);
            b.setVPAIDEvenListener(a.this.b.getVPAIDEvenListener());
            b.setLayoutParams(a.this.b.getLayoutParams());
            u.b(a.this.b);
            a.this.b = b;
        }
    };
    private final Context e;
    private final String f;
    private final int g;
    private final int h;
    private final f i;
    private final String j;
    private final int k;
    private sg.bigo.ads.api.core.u l;

    /* renamed from: sg.bigo.ads.core.g.a.a$a, reason: collision with other inner class name */
    public interface InterfaceC1105a {
        void a();
    }

    public a(Context context, ViewGroup viewGroup, String str, int i, int i2, f fVar, String str2, int i3, sg.bigo.ads.api.core.u uVar) {
        this.e = context;
        this.f20045a = viewGroup;
        this.f = str;
        this.g = i;
        this.h = i2;
        this.i = fVar;
        this.j = str2;
        this.k = i3;
        this.l = uVar;
        b b = b();
        this.b = b;
        u.a(b, viewGroup, null, 0);
    }

    @Override // sg.bigo.ads.api.c.a
    public final void a() {
        this.b.a("window.vpaidwrapper.pauseAd()");
    }

    final b b() {
        b bVar = new b(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
        bVar.setOnRenderProcessGoneListener(this.d);
        return bVar;
    }
}
