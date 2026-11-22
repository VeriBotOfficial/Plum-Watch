package sg.bigo.ads.common.u;

/* loaded from: classes9.dex */
public class h extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final int f19712a;
    private String b;
    private Exception c;

    public h(int i, String str) {
        this.f19712a = i;
        this.b = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        Exception exc = this.c;
        return exc != null ? exc.getMessage() : this.b;
    }
}
