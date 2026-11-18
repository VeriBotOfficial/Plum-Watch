package com.anythink.core.common.u;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes16.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile a f4345a;
    private final Map<String, InterfaceC0302a> b = new ConcurrentHashMap(2);

    /* JADX INFO: renamed from: com.anythink.core.common.u.a$a, reason: collision with other inner class name */
    public interface InterfaceC0302a {
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

    public final void a(String str, InterfaceC0302a interfaceC0302a) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.b.put(str, interfaceC0302a);
    }

    public final void a(String str) {
        InterfaceC0302a interfaceC0302aRemove;
        if (TextUtils.isEmpty(str) || (interfaceC0302aRemove = this.b.remove(str)) == null) {
            return;
        }
        interfaceC0302aRemove.a(str);
    }
}
