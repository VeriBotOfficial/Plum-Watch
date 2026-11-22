package sg.bigo.ads.core.player.a;

import java.io.OutputStream;
import java.util.Locale;

/* loaded from: classes9.dex */
final class c extends i {

    /* renamed from: a, reason: collision with root package name */
    sg.bigo.ads.core.player.a.a.a f20127a;

    public c(sg.bigo.ads.common.h.a aVar) {
        this.e = aVar;
        sg.bigo.ads.core.player.a.a.a aVar2 = new sg.bigo.ads.core.player.a.a.a(aVar);
        this.f20127a = aVar2;
        this.b = aVar2;
    }

    static String a(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    final void a(OutputStream outputStream, long j) {
        byte[] bArr = new byte[8192];
        sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", "responseWithCache start thread=" + Thread.currentThread().getName());
        while (true) {
            int a2 = a(bArr, j);
            if (a2 == -1) {
                sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", "responseWithCache end thread=" + Thread.currentThread().getName() + ",offset=" + j);
                outputStream.flush();
                return;
            } else {
                outputStream.write(bArr, 0, a2);
                j += a2;
            }
        }
    }
}
