package sg.bigo.ads.common;

/* loaded from: classes9.dex */
public interface k {

    public static class a implements b {

        /* renamed from: a, reason: collision with root package name */
        private final String f19644a;

        public a(String str) {
            this.f19644a = str;
        }

        @Override // sg.bigo.ads.common.k.b
        public final String a() {
            return this.f19644a;
        }

        @Override // sg.bigo.ads.common.k.b
        public final String b() {
            return this.f19644a;
        }

        @Override // sg.bigo.ads.common.k.b
        public final String c() {
            return "";
        }

        @Override // sg.bigo.ads.common.k.b
        public final boolean d() {
            return false;
        }
    }

    public interface b {
        String a();

        String b();

        String c();

        boolean d();
    }

    b a(String str);
}
