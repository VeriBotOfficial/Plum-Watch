package com.anythink.expressad.foundation.g.h;

/* loaded from: classes12.dex */
public abstract class a implements Runnable {
    public static long d;
    public b e = b.READY;
    public InterfaceC0240a f;

    /* renamed from: com.anythink.expressad.foundation.g.h.a$a, reason: collision with other inner class name */
    public interface InterfaceC0240a {
        void a(b bVar);
    }

    public abstract void a();

    public abstract void b();

    public abstract void c();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.e == b.READY) {
                a(b.RUNNING);
                a();
                a(b.FINISH);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public a() {
        d++;
    }

    public static long e() {
        return d;
    }

    public enum b {
        READY,
        RUNNING,
        PAUSE,
        CANCEL,
        FINISH;

        private static /* synthetic */ b[] a() {
            return new b[]{READY, RUNNING, PAUSE, CANCEL, FINISH};
        }
    }

    public final void f() {
        if (this.e != b.CANCEL) {
            a(b.CANCEL);
        }
    }

    public final void g() {
        if (this.e == b.PAUSE || this.e == b.CANCEL || this.e == b.FINISH) {
            return;
        }
        a(b.RUNNING);
    }

    private b d() {
        return this.e;
    }

    private void a(b bVar) {
        this.e = bVar;
        InterfaceC0240a interfaceC0240a = this.f;
        if (interfaceC0240a != null) {
            interfaceC0240a.a(bVar);
        }
    }

    private void a(InterfaceC0240a interfaceC0240a) {
        this.f = interfaceC0240a;
    }
}
