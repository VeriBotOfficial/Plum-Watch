package sg.bigo.ads.common.u.c;

import com.xiaomi.mipush.sdk.Constants;
import sg.bigo.ads.common.utils.q;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public long f19708a;
    public long b = -1;
    private long c;

    private b() {
    }

    public static b a(String str) {
        b bVar = null;
        if (q.a((CharSequence) str)) {
            return null;
        }
        int indexOf = str.indexOf(" ");
        int indexOf2 = str.indexOf(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        int indexOf3 = str.indexOf("/");
        if (indexOf >= 0 && indexOf3 >= 0 && indexOf < indexOf3) {
            bVar = new b();
            if (indexOf2 > indexOf && indexOf2 < indexOf3) {
                try {
                    bVar.f19708a = Long.parseLong(str.substring(indexOf + 1, indexOf2));
                    bVar.c = Long.parseLong(str.substring(indexOf2 + 1, indexOf3));
                } catch (Exception unused) {
                }
            }
            String substring = str.substring(indexOf3 + 1);
            if (!"*".equals(substring)) {
                bVar.b = Long.parseLong(substring);
            }
        }
        return bVar;
    }
}
