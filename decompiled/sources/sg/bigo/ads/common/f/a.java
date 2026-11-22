package sg.bigo.ads.common.f;

import android.os.SystemClock;

/* loaded from: classes9.dex */
public final class a {
    private static final a e = new a();

    /* renamed from: a, reason: collision with root package name */
    boolean f19573a = true;
    long b;
    long c;
    public InterfaceC1072a d;

    /* renamed from: sg.bigo.ads.common.f.a$a, reason: collision with other inner class name */
    public interface InterfaceC1072a {
        void a(long j, long j2);

        void a(boolean z, long j, long j2, long j3);
    }

    private a() {
        b();
    }

    public static a a() {
        return e;
    }

    final void b() {
        this.b = SystemClock.elapsedRealtime();
        this.c = System.currentTimeMillis();
    }

    final boolean c() {
        return this.b > 0;
    }
}
