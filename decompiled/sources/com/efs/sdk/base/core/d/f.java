package com.efs.sdk.base.core.d;

import com.efs.sdk.base.core.controller.ControllerCenter;

/* loaded from: classes14.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public c f9634a;
    public ControllerCenter b;
    public d c;
    public g d;

    /* synthetic */ f(byte b) {
        this();
    }

    private f() {
        this.f9634a = new c();
        this.c = new d();
        this.d = new g();
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final f f9635a = new f(0);
    }

    public final void a(String str, String str2, String str3) {
        this.d.a(str, str2, str3);
    }

    public final void a(int i) {
        ControllerCenter controllerCenter = this.b;
        if (controllerCenter != null) {
            controllerCenter.send(a("flow_limit", i));
        }
    }

    public final void a(int i, String str) {
        if (this.b != null || ControllerCenter.getGlobalEnvStruct().isEnableWaStat()) {
            b a2 = a("flow_limit_type", i);
            a2.put("code", str);
            this.b.send(a2);
        }
    }

    public final b a(String str, int i) {
        b bVar = new b("efs_core", str, this.f9634a.c);
        bVar.put("cver", Integer.valueOf(i));
        return bVar;
    }
}
