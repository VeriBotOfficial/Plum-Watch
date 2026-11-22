package sg.bigo.ads.ad.banner;

import android.os.SystemClock;
import java.util.Map;
import java.util.WeakHashMap;
import sg.bigo.ads.api.Ad;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<InterfaceC1024b, a> f18930a = new WeakHashMap();

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        final long[] f18931a;

        private a() {
            this.f18931a = new long[9];
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: sg.bigo.ads.ad.banner.b$b, reason: collision with other inner class name */
    public interface InterfaceC1024b {
    }

    public static <T extends Ad> long a(InterfaceC1024b interfaceC1024b, long j) {
        if (j == -1) {
            return -1L;
        }
        return j - j(interfaceC1024b).f18931a[4];
    }

    public static <T extends Ad> void a(InterfaceC1024b interfaceC1024b) {
        a(interfaceC1024b, 0);
    }

    private static <T extends Ad> void a(InterfaceC1024b interfaceC1024b, int i) {
        j(interfaceC1024b).f18931a[i] = SystemClock.elapsedRealtime();
    }

    public static <T extends Ad> void b(InterfaceC1024b interfaceC1024b) {
        a(interfaceC1024b, 1);
    }

    public static <T extends Ad> void c(InterfaceC1024b interfaceC1024b) {
        a(interfaceC1024b, 2);
    }

    public static <T extends Ad> void d(InterfaceC1024b interfaceC1024b) {
        a(interfaceC1024b, 3);
    }

    public static <T extends Ad> void e(InterfaceC1024b interfaceC1024b) {
        a(interfaceC1024b, 4);
    }

    public static <T extends Ad> void f(InterfaceC1024b interfaceC1024b) {
        a(interfaceC1024b, 5);
    }

    public static <T extends Ad> void g(InterfaceC1024b interfaceC1024b) {
        a(interfaceC1024b, 6);
    }

    public static <T extends Ad> void h(InterfaceC1024b interfaceC1024b) {
        f18930a.remove(interfaceC1024b);
    }

    public static <T extends Ad> long i(InterfaceC1024b interfaceC1024b) {
        a j = j(interfaceC1024b);
        return j.f18931a[6] - j.f18931a[4];
    }

    private static <T extends Ad> a j(InterfaceC1024b interfaceC1024b) {
        Map<InterfaceC1024b, a> map = f18930a;
        a aVar = map.get(interfaceC1024b);
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a((byte) 0);
        map.put(interfaceC1024b, aVar2);
        return aVar2;
    }
}
