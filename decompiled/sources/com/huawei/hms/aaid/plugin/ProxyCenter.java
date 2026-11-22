package com.huawei.hms.aaid.plugin;

/* loaded from: classes14.dex */
public class ProxyCenter {
    private PushProxy proxy;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static ProxyCenter f10220a = new ProxyCenter();
    }

    private static ProxyCenter getInstance() {
        return a.f10220a;
    }

    public static PushProxy getProxy() {
        return getInstance().proxy;
    }

    public static void register(PushProxy pushProxy) {
        getInstance().proxy = pushProxy;
    }
}
