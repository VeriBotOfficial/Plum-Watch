package com.anythink.core.common.u;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f4345a;
    private final Map<String, InterfaceC0215a> b = new ConcurrentHashMap(2);

    /* renamed from: com.anythink.core.common.u.a$a, reason: collision with other inner class name */
    public interface InterfaceC0215a {
        void a(String str);
    }

    private a() {
    }

    public static a a() {
        if (f4345a == null) {
            synchronized (a.class) {
                if (f4345a == null) {
                    f4345a = new a();
                }
            }
        }
        return f4345a;
    }

    public final void a(String str, InterfaceC0215a interfaceC0215a) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.b.put(str, interfaceC0215a);
    }

    public final void a(String str) {
        InterfaceC0215a remove;
        if (TextUtils.isEmpty(str) || (remove = this.b.remove(str)) == null) {
            return;
        }
        remove.a(str);
    }
}
