package sg.bigo.ads.ad.interstitial.f;

import android.view.MotionEvent;
import java.lang.ref.WeakReference;
import sg.bigo.ads.controller.landing.LandingPageStyleConfig;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static WeakReference<InterfaceC1054b> f19228a;
    protected final int b;
    protected final int c;
    protected final int d;
    protected final float e;

    public interface a {
        boolean a();
    }

    /* renamed from: sg.bigo.ads.ad.interstitial.f.b$b, reason: collision with other inner class name */
    public interface InterfaceC1054b {
        void a(int i);

        void a(int i, int i2, int i3, int i4, int i5);

        boolean a(MotionEvent motionEvent, a aVar, int i);

        void b(int i);

        void c(int i);

        void d(int i);
    }

    b(int i, int i2, int i3, float f) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = f;
    }

    public static void a(LandingPageStyleConfig landingPageStyleConfig) {
        if (landingPageStyleConfig == null || !landingPageStyleConfig.a() || landingPageStyleConfig.b()) {
            return;
        }
        WeakReference<InterfaceC1054b> weakReference = f19228a;
        InterfaceC1054b interfaceC1054b = weakReference != null ? weakReference.get() : null;
        if (interfaceC1054b != null) {
            interfaceC1054b.a(landingPageStyleConfig.c);
        }
    }

    public final void a() {
        int i = this.b;
        WeakReference<InterfaceC1054b> weakReference = f19228a;
        InterfaceC1054b interfaceC1054b = weakReference != null ? weakReference.get() : null;
        if (interfaceC1054b != null) {
            interfaceC1054b.b(i);
        }
    }

    public final void a(int i, int i2, int i3, int i4) {
        int i5 = this.b;
        WeakReference<InterfaceC1054b> weakReference = f19228a;
        InterfaceC1054b interfaceC1054b = weakReference != null ? weakReference.get() : null;
        if (interfaceC1054b != null) {
            interfaceC1054b.a(i, i2, i3, i4, i5);
        }
    }

    public final boolean a(MotionEvent motionEvent, a aVar) {
        int i = this.b;
        WeakReference<InterfaceC1054b> weakReference = f19228a;
        InterfaceC1054b interfaceC1054b = weakReference != null ? weakReference.get() : null;
        if (interfaceC1054b != null) {
            return interfaceC1054b.a(motionEvent, aVar, i);
        }
        return false;
    }

    public final void b() {
        int i = this.b;
        WeakReference<InterfaceC1054b> weakReference = f19228a;
        InterfaceC1054b interfaceC1054b = weakReference != null ? weakReference.get() : null;
        if (interfaceC1054b != null) {
            interfaceC1054b.c(i);
        }
    }

    public final void c() {
        int i = this.b;
        WeakReference<InterfaceC1054b> weakReference = f19228a;
        InterfaceC1054b interfaceC1054b = weakReference != null ? weakReference.get() : null;
        if (interfaceC1054b != null) {
            interfaceC1054b.d(i);
        }
    }

    public final int d() {
        return this.d;
    }

    public final float e() {
        return this.e;
    }

    public final boolean f() {
        int i = this.c;
        return i == 2 || i == 4 || i == 6;
    }

    public final boolean g() {
        int i = this.c;
        return (i == 3 || i == 4 || i == 5 || i == 6) ? false : true;
    }
}
