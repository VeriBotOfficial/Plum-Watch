package sg.bigo.ads.common.u.c;

import android.text.TextUtils;
import java.io.Closeable;
import java.io.InputStream;
import java.util.List;
import sg.bigo.ads.common.utils.h;
import sg.bigo.ads.common.utils.q;

/* loaded from: classes9.dex */
public final class a implements c<InputStream> {

    /* renamed from: a, reason: collision with root package name */
    public final int f19707a;
    public final InputStream b;
    public final h<List<String>> c;
    private final int d;
    private final Closeable e;

    public a(int i, int i2, InputStream inputStream, h<List<String>> hVar, Closeable closeable) {
        this.d = i;
        this.f19707a = i2;
        this.b = inputStream;
        this.c = hVar;
        this.e = closeable;
    }

    public final long a() {
        String a2 = a("Content-Length");
        if (!q.b((CharSequence) a2)) {
            return -1L;
        }
        try {
            return Long.parseLong(a2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public final String a(String str) {
        List<String> a2;
        if (!TextUtils.isEmpty(str) && (a2 = this.c.a(str)) != null && !a2.isEmpty()) {
            for (String str2 : a2) {
                if (!TextUtils.isEmpty(str2)) {
                    return str2;
                }
            }
        }
        return "";
    }
}
