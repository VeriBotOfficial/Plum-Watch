package com.anythink.expressad.out;

/* loaded from: classes12.dex */
public final class q {

    public interface a {
        void a();
    }

    public interface b {
        void a();

        void b();

        void c();

        void d();

        void e();
    }

    public interface c {
        void a(com.anythink.expressad.foundation.d.d dVar, String str);

        void a(k kVar);

        void a(k kVar, String str);

        void b(k kVar);

        void b(k kVar, String str);

        boolean b();

        void c();

        void c(k kVar);

        void d(k kVar);
    }

    public interface e extends c {
        void a();
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private int f5022a;
        private int b;

        private d(int i, int i2) {
            this.f5022a = i;
            this.b = i2;
        }

        private int a() {
            return this.f5022a;
        }

        private void a(int i) {
            this.f5022a = i;
        }

        private int b() {
            return this.b;
        }

        private void b(int i) {
            this.b = i;
        }
    }
}
