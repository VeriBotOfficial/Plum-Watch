package com.anythink.expressad.foundation.g.h;

/* JADX INFO: loaded from: classes16.dex */
public abstract class a implements Runnable {
    public static long d;
    public b e = b.READY;
    public InterfaceC0327a f;

    /* JADX INFO: renamed from: com.anythink.expressad.foundation.g.h.a$a, reason: collision with other inner class name */
    public interface InterfaceC0327a {
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
        InterfaceC0327a interfaceC0327a = this.f;
        if (interfaceC0327a != null) {
            interfaceC0327a.a(bVar);
        }
    }

    private void a(InterfaceC0327a interfaceC0327a) {
        this.f = interfaceC0327a;
    }
}
