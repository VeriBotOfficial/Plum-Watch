package sg.bigo.ads.controller.f;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.List;
import sg.bigo.ads.common.d.c;

/* loaded from: classes9.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f19904a;
    private final List<InterfaceC1095a> b = new ArrayList();

    /* renamed from: sg.bigo.ads.controller.f.a$a, reason: collision with other inner class name */
    public interface InterfaceC1095a {
        void a(boolean z);
    }

    public static synchronized void a(Context context, InterfaceC1095a interfaceC1095a) {
        synchronized (a.class) {
            if (f19904a == null) {
                f19904a = new a();
                sg.bigo.ads.common.d.a.a().a(context, f19904a);
            }
            synchronized (f19904a.b) {
                if (interfaceC1095a != null) {
                    f19904a.b.add(interfaceC1095a);
                }
            }
        }
    }

    @Override // sg.bigo.ads.common.d.b
    public final void a(Context context, Intent intent) {
        boolean b = sg.bigo.ads.common.aa.c.b(context);
        sg.bigo.ads.common.t.a.a(0, 3, "NetworkStateReceiver", "Network state changed, available: ".concat(String.valueOf(b)));
        synchronized (this.b) {
            for (InterfaceC1095a interfaceC1095a : this.b) {
                if (interfaceC1095a != null) {
                    interfaceC1095a.a(b);
                } else {
                    sg.bigo.ads.common.t.a.a(0, 3, "NetworkStateReceiver", "OnNetworkStateChangeListener is null object reference");
                }
            }
        }
    }
}
