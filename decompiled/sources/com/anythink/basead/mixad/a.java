package com.anythink.basead.mixad;

import android.text.TextUtils;
import com.anythink.core.common.l.e.a.a;
import com.anythink.core.common.l.f.a.a;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f2886a;
    private final Map<String, com.anythink.basead.mixad.c.a.a> b = new HashMap(2);
    private final Map<String, a.InterfaceC0200a> c = new HashMap(2);
    private final Map<String, a.InterfaceC0199a> d = new HashMap(2);

    private a() {
    }

    public static a a() {
        if (f2886a == null) {
            synchronized (a.class) {
                if (f2886a == null) {
                    f2886a = new a();
                }
            }
        }
        return f2886a;
    }

    public final void a(String str, com.anythink.basead.mixad.c.a.a aVar) {
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.b.put(str, aVar);
    }

    public final com.anythink.basead.mixad.c.a.a a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.b.remove(str);
    }

    public final void a(String str, a.InterfaceC0199a interfaceC0199a) {
        if (interfaceC0199a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.d.put(str, interfaceC0199a);
    }

    public final a.InterfaceC0199a b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.d.remove(str);
    }

    public final void a(String str, a.InterfaceC0200a interfaceC0200a) {
        if (interfaceC0200a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.c.put(str, interfaceC0200a);
    }

    public final a.InterfaceC0200a c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.c.remove(str);
    }
}
