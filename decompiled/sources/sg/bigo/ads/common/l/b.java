package sg.bigo.ads.common.l;

import android.content.Context;
import sg.bigo.ads.common.utils.r;

/* loaded from: classes9.dex */
public final class b {
    public static sg.bigo.ads.common.a a(Context context) {
        long a2 = r.f19732a.a(15);
        sg.bigo.ads.common.a a3 = a.a(context);
        if (a3 == null) {
            try {
                a3 = c.a(context, a2);
            } catch (Exception unused) {
            }
        }
        return a3 == null ? new sg.bigo.ads.common.a("", true) : a3;
    }
}
