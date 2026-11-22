package oqmu;

import com.qumeng.overseas.advlib.__remote__.core.proto.utils.f;

/* loaded from: classes8.dex */
public class a {
    private static final String d = "today_ad_count";
    private static volatile a e;

    /* renamed from: a, reason: collision with root package name */
    private int f18764a = 2;
    private String b;
    private String c;

    private a() {
    }

    public static a a() {
        if (e == null) {
            synchronized (a.class) {
                if (e == null) {
                    e = new a();
                }
            }
        }
        return e;
    }

    private void f() {
        if (f.a(d + this.b + this.c)) {
            oqme.a.a(d + this.b + this.c, 0);
        }
    }

    public int b() {
        return this.f18764a - c();
    }

    public int c() {
        return oqme.a.b(d + this.b + this.c);
    }

    public void d() {
        oqme.a.a(d + this.b + this.c, c() + 1);
    }

    public boolean e() {
        return c() >= this.f18764a;
    }

    public void a(String str, String str2, int i) {
        this.b = str;
        this.c = str2;
        this.f18764a = i;
        f();
    }

    public void a(int i) {
        this.f18764a = i;
    }
}
