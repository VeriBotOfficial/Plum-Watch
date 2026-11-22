package oqmc;

/* loaded from: classes8.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private long f18746a;

    public void a(long j) {
        this.f18746a = j;
    }

    public long b() {
        return this.f18746a;
    }

    public void c() {
        a(System.currentTimeMillis());
    }

    public long a() {
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.f18746a;
        if (j > 0) {
            return currentTimeMillis - j;
        }
        return 0L;
    }
}
