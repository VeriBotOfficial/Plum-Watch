package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class c8 {

    /* renamed from: a, reason: collision with root package name */
    private final ya f15166a = new ya();
    private final jj1 b = new jj1();

    public final pp1 a(v7 v7Var) {
        pp1 pp1Var = new pp1((Map) null, 3);
        if (v7Var != null) {
            Map<String, String> h = v7Var.h();
            this.f15166a.getClass();
            pp1 pp1Var2 = new pp1(new HashMap(), 2);
            if (h != null) {
                Object obj = (String) h.get("adapter_network_name");
                Object obj2 = (String) h.get("adapter_version");
                Object obj3 = (String) h.get("adapter_network_sdk_version");
                pp1Var2.a(obj, "adapter_network_name");
                pp1Var2.a(obj2, "adapter_version");
                pp1Var2.a(obj3, "adapter_network_sdk_version");
            }
            Map<String, Object> b = pp1Var2.b();
            this.b.getClass();
            pp1 pp1Var3 = new pp1(new HashMap(), 2);
            if (h != null) {
                Object obj4 = (String) h.get("plugin_type");
                Object obj5 = (String) h.get("plugin_version");
                pp1Var3.a(obj4, "plugin_type");
                pp1Var3.a(obj5, "plugin_version");
            }
            Map<String, Object> b2 = pp1Var3.b();
            String j = v7Var.j();
            pp1Var.a((Map<String, ? extends Object>) b);
            pp1Var.a((Map<String, ? extends Object>) b2);
            pp1Var.a(j, "preload_type");
        }
        String g = v7Var != null ? v7Var.g() : null;
        boolean z = g == null || g.length() == 0;
        pp1Var.b(Boolean.valueOf(!z), "open_bidding");
        if (!z) {
            pp1Var.a("openbidding", "integration_type");
        }
        return pp1Var;
    }
}
