package com.anythink.basead.webtemplet;

import java.util.HashMap;

/* loaded from: classes11.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static HashMap<String, Class> f3472a = new HashMap<>();
    private Object b;
    private WTWebView c;

    public f(WTWebView wTWebView) {
        this.c = wTWebView;
        try {
            a("common", Class.forName("com.anythink.basead.webtemplet.adformat.WTCommonJSBridgePlugin"));
            a(com.anythink.expressad.foundation.g.a.f.f, Class.forName("com.anythink.basead.webtemplet.adformat.splash.WTSplashJSBridgePlugin"));
            Class<?> cls = Class.forName("com.anythink.basead.webtemplet.adformat.intestitial.WTScreenJSBridgePlugin");
            a("inter", cls);
            a("reward", cls);
        } catch (ClassNotFoundException unused) {
        }
    }

    private void a(Object obj) {
        this.b = obj;
    }

    private static Object a(String str, WTWebView wTWebView) {
        Class cls = f3472a.get(str);
        if (cls == null) {
            return null;
        }
        try {
            if (!d.class.isAssignableFrom(cls)) {
                return null;
            }
            d dVar = (d) cls.newInstance();
            dVar.initialize(wTWebView);
            return dVar;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static void a(String str, Class cls) {
        if (f3472a == null) {
            f3472a = new HashMap<>();
        }
        f3472a.put(str, cls);
    }

    public final Object a(String str) {
        if (f3472a == null) {
            f3472a = new HashMap<>();
        }
        return a(str, this.c);
    }

    private static void b(String str) {
        if (f3472a == null) {
            f3472a = new HashMap<>();
        }
        f3472a.remove(str);
    }

    private static void a() {
        try {
            a("common", Class.forName("com.anythink.basead.webtemplet.adformat.WTCommonJSBridgePlugin"));
            a(com.anythink.expressad.foundation.g.a.f.f, Class.forName("com.anythink.basead.webtemplet.adformat.splash.WTSplashJSBridgePlugin"));
            Class<?> cls = Class.forName("com.anythink.basead.webtemplet.adformat.intestitial.WTScreenJSBridgePlugin");
            a("inter", cls);
            a("reward", cls);
        } catch (ClassNotFoundException unused) {
        }
    }
}
