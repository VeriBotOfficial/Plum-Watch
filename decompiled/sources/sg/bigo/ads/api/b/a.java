package sg.bigo.ads.api.b;

import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdBid;
import sg.bigo.ads.api.core.c;
import sg.bigo.ads.api.core.p;
import sg.bigo.ads.api.core.q;

/* loaded from: classes7.dex */
public abstract class a<T extends Ad, U extends sg.bigo.ads.api.core.c> implements Ad, d<T> {
    protected final sg.bigo.ads.api.b Q;
    protected sg.bigo.ads.common.v.a R;
    protected a T;
    public int N = 0;
    public int O = 0;
    public int P = 0;
    protected int S = sg.bigo.ads.common.v.a.f19739a;
    protected int U = 0;
    protected final p V = new p();

    /* renamed from: sg.bigo.ads.api.b.a$a, reason: collision with other inner class name */
    public interface InterfaceC1065a {
        void a(sg.bigo.ads.api.core.d dVar);

        void b();
    }

    public a(sg.bigo.ads.api.b bVar) {
        this.Q = bVar;
    }

    public final a I() {
        return this.T;
    }

    public final q J() {
        U f = f();
        if (f != null) {
            return f.Y();
        }
        return null;
    }

    public final int K() {
        return this.S;
    }

    public final sg.bigo.ads.api.b L() {
        return this.Q;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(Ad ad) {
        if (ad == null) {
            return 1;
        }
        return g() >= (ad instanceof a ? ((a) ad).g() : 0.0d) ? 1 : -1;
    }

    public void a(int i) {
        this.O = i;
    }

    public abstract void a(int i, int i2, String str);

    public void a(String str, String str2, int i) {
    }

    public void a(boolean z, boolean z2) {
        this.N = z2 ? 1 : !z ? 2 : 3;
    }

    public abstract void b();

    public void b(int i) {
        this.P = i;
    }

    public int b_() {
        int i = this.U + 1;
        this.U = i;
        return i;
    }

    public abstract void c();

    public void c(int i) {
        this.S = i;
    }

    public p c_() {
        return this.V;
    }

    public abstract String d();

    public abstract long e();

    public abstract U f();

    public double g() {
        AdBid bid = getBid();
        return bid != null ? bid.getPrice() : (sg.bigo.ads.common.j.a.a(d(), e()) * 1.0d) / 1.0E8d;
    }
}
