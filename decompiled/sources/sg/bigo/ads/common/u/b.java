package sg.bigo.ads.common.u;

import sg.bigo.ads.common.u.b.c;
import sg.bigo.ads.common.u.c.c;

/* loaded from: classes9.dex */
public abstract class b<Req extends sg.bigo.ads.common.u.b.c, Res extends sg.bigo.ads.common.u.c.c> {
    public static b<sg.bigo.ads.common.u.b.c, sg.bigo.ads.common.u.c.a> d = new a();

    static class a<Req extends sg.bigo.ads.common.u.b.c> extends b<Req, sg.bigo.ads.common.u.c.a> {

        /* renamed from: a, reason: collision with root package name */
        Req f19703a;
        sg.bigo.ads.common.u.c.a b;
        h c;

        a() {
        }

        @Override // sg.bigo.ads.common.u.b
        public final /* bridge */ /* synthetic */ sg.bigo.ads.common.u.c.a a(sg.bigo.ads.common.u.c.a aVar) {
            return aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // sg.bigo.ads.common.u.b
        public final /* bridge */ /* synthetic */ void a(sg.bigo.ads.common.u.b.c cVar, sg.bigo.ads.common.u.c.a aVar) {
            this.f19703a = cVar;
            this.b = aVar;
        }

        @Override // sg.bigo.ads.common.u.b
        public final void a(Req req, h hVar) {
            this.f19703a = req;
            this.c = hVar;
        }
    }

    public abstract Res a(sg.bigo.ads.common.u.c.a aVar);

    public void a(Req req) {
    }

    public void a(Req req, String str, int i) {
    }

    public abstract void a(Req req, Res res);

    public abstract void a(Req req, h hVar);

    public boolean a(Req req, int i) {
        return i >= 200 && i < 300;
    }
}
