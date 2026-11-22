package com.anythink.core.common;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.common.d.u;
import com.anythink.core.common.h.bz;
import com.anythink.core.common.v.af;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public class x {
    private static final String c = "x";
    private static volatile x d;

    /* renamed from: a, reason: collision with root package name */
    Map<String, bz> f4495a;
    Context b;

    private static void b() {
    }

    public static x a(Context context) {
        if (d == null) {
            synchronized (x.class) {
                if (d == null) {
                    d = new x(context);
                }
            }
        }
        return d;
    }

    private x(Context context) {
        this.b = context.getApplicationContext();
        a();
    }

    private void a() {
        if (this.f4495a == null) {
            this.f4495a = new ConcurrentHashMap(5);
            try {
                Map<String, ?> b = af.b(this.b, u.b.k);
                if (b != null) {
                    for (Map.Entry<String, ?> entry : b.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (value instanceof String) {
                            this.f4495a.put(key, bz.a((String) value));
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void a(String str, String str2, bz.a aVar, bz.a aVar2) {
        Map<String, bz> map = this.f4495a;
        if (map == null) {
            return;
        }
        bz bzVar = map.get(str);
        if (bzVar == null) {
            synchronized (this) {
                bzVar = this.f4495a.get(str);
                if (bzVar == null) {
                    bzVar = new bz();
                    bzVar.b(str2);
                    this.f4495a.put(str, bzVar);
                }
            }
        }
        if (TextUtils.equals(str2, bzVar.b())) {
            if (aVar != null) {
                bzVar.a(aVar);
                bzVar.a(System.currentTimeMillis());
            }
            if (aVar2 != null) {
                bzVar.b(aVar2);
            }
        }
    }

    private bz b(String str) {
        Map<String, bz> map = this.f4495a;
        if (map != null) {
            return map.remove(str);
        }
        return null;
    }

    public final void a(String str) {
        Map<String, bz> map = this.f4495a;
        if (map == null) {
            return;
        }
        try {
            bz bzVar = map.get(str);
            if (bzVar != null) {
                af.b(this.b, u.b.k, str, bzVar.a().toString());
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
