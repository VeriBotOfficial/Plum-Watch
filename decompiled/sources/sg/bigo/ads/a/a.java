package sg.bigo.ads.a;

import android.content.Context;
import android.graphics.Bitmap;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f18866a;
    private final int b;
    private final int c;
    private final boolean d;
    private final Bitmap e;
    private final c f;
    private final b g;

    /* renamed from: sg.bigo.ads.a.a$a, reason: collision with other inner class name */
    public static class C1013a {

        /* renamed from: a, reason: collision with root package name */
        public String f18867a;
        public c b;
        public b c;
        private int d = 0;
        private int e = 0;
        private boolean f = true;
        private Bitmap g;

        public final a a() {
            return new a(this.f18867a, this.d, this.e, this.f, this.g, this.b, this.c);
        }
    }

    public interface b {
        void a(Context context, String str, int i, String str2);

        void a(String str, String str2, String str3);
    }

    public interface c {
        void a();

        void b();

        void c();

        void d();

        void e();

        void f();
    }

    public a(String str, int i, int i2, boolean z, Bitmap bitmap, c cVar, b bVar) {
        this.f18866a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = bitmap;
        this.f = cVar;
        this.g = bVar;
    }

    public final void a(Context context) {
        sg.bigo.ads.a.c.a(context, this.f18866a, this.b, this.c, this.d, this.e, this.f, this.g);
    }
}
