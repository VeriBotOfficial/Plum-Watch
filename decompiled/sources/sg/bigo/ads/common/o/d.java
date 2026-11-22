package sg.bigo.ads.common.o;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    private final Context f19664a;
    private final long b;

    private d(Context context, long j) {
        this.f19664a = context;
        this.b = j;
    }

    private synchronized sg.bigo.ads.common.a a() {
        f a2;
        e a3 = a(this.f19664a);
        if (a3 == null) {
            throw new b();
        }
        a2 = a3.a(this.b, TimeUnit.MILLISECONDS);
        if (a2 == null) {
            a3.a();
            throw new b();
        }
        return new sg.bigo.ads.common.a(a2.a(), a2.b());
    }

    public static sg.bigo.ads.common.a a(Context context, long j) {
        try {
            return new d(context, j).a();
        } catch (Throwable unused) {
            return null;
        }
    }

    private static e a(Context context) {
        boolean bindService;
        e a2 = e.a(context);
        if (a2.f19665a.isEmpty()) {
            Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
            intent.setPackage("com.huawei.hwid");
            try {
                a2.b = true;
                bindService = context.bindService(intent, a2, 1);
            } catch (Exception unused) {
            } catch (Throwable th) {
                a2.a();
                throw th;
            }
            if (!bindService) {
                if (bindService) {
                    return null;
                }
                a2.a();
                return null;
            }
            if (!bindService) {
                a2.a();
            }
        }
        return a2;
    }
}
