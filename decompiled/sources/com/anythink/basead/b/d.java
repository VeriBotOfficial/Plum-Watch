package com.anythink.basead.b;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes11.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2292a = "d";
    private static volatile d c;
    ConcurrentHashMap<String, com.anythink.basead.d.e> b = new ConcurrentHashMap<>();

    private d() {
    }

    public static d a() {
        if (c == null) {
            synchronized (d.class) {
                if (c == null) {
                    c = new d();
                }
            }
        }
        return c;
    }

    public final void a(int i, String str, com.anythink.basead.d.e eVar) {
        this.b.put(i + str, eVar);
    }

    public final com.anythink.basead.d.e a(int i, String str) {
        return this.b.get(i + str);
    }
}
