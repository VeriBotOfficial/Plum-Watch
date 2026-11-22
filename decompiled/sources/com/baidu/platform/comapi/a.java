package com.baidu.platform.comapi;

import android.content.Context;
import com.baidu.mapapi.OpenLogUtil;
import com.baidu.platform.comjni.engine.MessageProxy;
import com.baidu.platform.comjni.engine.NAEngine;

/* compiled from: EngineManager.java */
/* loaded from: classes13.dex */
class a {

    /* renamed from: a, reason: collision with root package name */
    static boolean f8501a = false;
    private NAEngine b;

    public boolean a(Context context) {
        f8501a = false;
        this.b = new NAEngine();
        boolean a2 = NAEngine.a(context, null);
        if (OpenLogUtil.isMapLogEnable()) {
            com.baidu.mapsdkplatform.comapi.commonutils.a.a().a("initEngine isEngineSuccess = " + a2);
        }
        if (a2) {
            return a2;
        }
        com.baidu.platform.comapi.c.a.a().a("engine_init_failed");
        return false;
    }

    public boolean b(Context context) {
        boolean initLongLinkClient = NAEngine.initLongLinkClient();
        if (initLongLinkClient) {
            return initLongLinkClient;
        }
        return false;
    }

    public boolean b() {
        f8501a = false;
        return true;
    }

    public void a() {
        if (f8501a) {
            b();
        }
        MessageProxy.destroy();
        NAEngine.c();
        if (this.b != null) {
            this.b = null;
        }
    }
}
