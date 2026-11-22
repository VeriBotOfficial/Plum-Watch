package com.anythink.core.common.m.c;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.common.v.af;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public abstract class d implements i {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4003a = "anythink_app_pl_cl_retry";
    protected final Context b;
    protected final Object d = new Object();
    protected final Map<String, Long> c = new ConcurrentHashMap(1);

    protected boolean b(com.anythink.core.common.m.b.d dVar) {
        return false;
    }

    public d(Context context) {
        this.b = context;
    }

    @Override // com.anythink.core.common.m.c.i
    public com.anythink.core.common.m.b.f a(com.anythink.core.common.m.b.d dVar) {
        String c = c(dVar);
        if (this.c == null || TextUtils.isEmpty(c)) {
            return null;
        }
        com.anythink.core.common.m.b.f a2 = com.anythink.core.common.m.b.f.a();
        synchronized (this.d) {
            Long l = this.c.get(c);
            if (l == null) {
                getClass().getSimpleName();
                new Object[]{c};
                l = Long.valueOf(af.b(this.b, "anythink_app_pl_cl_retry", c, 0L));
                this.c.put(c, l);
            }
            getClass().getSimpleName();
            new Object[]{c, l};
            if (l.longValue() == 0) {
                a2.a(false);
            } else if (l.longValue() == -1) {
                a2.a(true);
                a2.b(700);
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                getClass().getSimpleName();
                new Object[]{Long.valueOf(currentTimeMillis), l};
                boolean z = currentTimeMillis - l.longValue() < 0;
                if (z) {
                    a2.b(700);
                }
                a2.a(z);
            }
        }
        return a2;
    }

    protected String c(com.anythink.core.common.m.b.d dVar) {
        return dVar != null ? dVar.a() : "";
    }
}
