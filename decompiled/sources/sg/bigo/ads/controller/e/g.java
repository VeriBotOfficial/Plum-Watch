package sg.bigo.ads.controller.e;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes9.dex */
public final class g {
    private static final g b = new g();

    /* renamed from: a, reason: collision with root package name */
    final Map<String, a> f19900a = new ConcurrentHashMap();
    private boolean c = false;

    public class a {

        /* renamed from: a, reason: collision with root package name */
        final AtomicInteger f19901a = new AtomicInteger(0);
        final AtomicInteger b = new AtomicInteger(0);
        final AtomicInteger c = new AtomicInteger(0);

        public a() {
        }
    }

    public static g a() {
        return b;
    }

    public final a a(String str) {
        if (TextUtils.isEmpty(str)) {
            str = AbstractJsonLexerKt.NULL;
        }
        a aVar = this.f19900a.get(str);
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a();
        this.f19900a.put(str, aVar2);
        return aVar2;
    }

    public final void a(boolean z) {
        this.c = z;
        if (z) {
            Iterator<Map.Entry<String, a>> it = this.f19900a.entrySet().iterator();
            while (it.hasNext()) {
                a value = it.next().getValue();
                if (value != null) {
                    value.c.set(0);
                }
            }
        }
    }
}
