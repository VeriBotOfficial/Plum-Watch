package sg.bigo.ads.common.o;

import android.content.Context;
import sg.bigo.ads.common.utils.r;

/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f19663a = true;

    public static sg.bigo.ads.common.a a(Context context) {
        sg.bigo.ads.common.a aVar;
        boolean z;
        if (!f19663a) {
            return new sg.bigo.ads.common.a("", true);
        }
        long a2 = r.f19732a.a(15);
        try {
            aVar = d.a(context, a2);
            z = true;
        } catch (b unused) {
            aVar = null;
            z = false;
        }
        if (aVar != null) {
            return aVar;
        }
        try {
            aVar = a.a(context, a2);
        } catch (b unused2) {
            if (!z) {
                f19663a = false;
            }
        }
        return aVar != null ? aVar : new sg.bigo.ads.common.a("", true);
    }
}
