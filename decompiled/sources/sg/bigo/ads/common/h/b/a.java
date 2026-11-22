package sg.bigo.ads.common.h.b;

/* loaded from: classes9.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    String f19629a;
    sg.bigo.ads.common.h.a b;
    d c;
    float d;
    int e;
    String f;

    public a(sg.bigo.ads.common.h.a aVar) {
        this.b = aVar;
        this.f19629a = aVar.f19620a;
    }

    protected final void a(long j) {
        this.b.i = j;
    }

    protected final void b(long j) {
        this.b.g = j;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != a.class) {
            return false;
        }
        a aVar = (a) obj;
        return this.f19629a.equals(aVar.f19629a) && this.b.d.equals(aVar.b.d) && this.b.c.equals(aVar.b.c);
    }

    public String toString() {
        return this.b.toString();
    }
}
