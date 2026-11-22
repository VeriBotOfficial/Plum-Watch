package com.anythink.core.common.res.b;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes12.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static volatile c f4298a;
    private final Map<String, a> b = new HashMap();

    private c() {
    }

    public static c a() {
        if (f4298a == null) {
            synchronized (c.class) {
                if (f4298a == null) {
                    f4298a = new c();
                }
            }
        }
        return f4298a;
    }

    public final synchronized a a(String str) {
        a aVar = this.b.get(str);
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(str);
        this.b.put(str, aVar2);
        return aVar2;
    }

    public final synchronized void b(String str) {
        if (this.b != null && !TextUtils.isEmpty(str)) {
            this.b.remove(str);
        }
    }

    public final synchronized void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a aVar = this.b.get(str);
        if (aVar != null) {
            aVar.f();
        }
    }

    public final synchronized void d(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a aVar = this.b.get(str);
        if (aVar != null) {
            aVar.g();
        }
    }
}
