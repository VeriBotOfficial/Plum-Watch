package sg.bigo.ads.core.f.a;

/* loaded from: classes9.dex */
public final class c extends n implements Comparable<c> {

    /* renamed from: a, reason: collision with root package name */
    public final int f20029a;

    public c(String str, int i) {
        super(str);
        this.f20029a = i;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(c cVar) {
        return this.f20029a - cVar.f20029a;
    }

    @Override // sg.bigo.ads.core.f.a.n
    public final String toString() {
        return "{\"Content\":\"" + this.b + "\",\"pro_ms\":\"" + this.f20029a + "\"}";
    }
}
