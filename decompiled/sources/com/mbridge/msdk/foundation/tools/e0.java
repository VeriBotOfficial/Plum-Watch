package com.mbridge.msdk.foundation.tools;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.same.broadcast.NetWorkChangeReceiver;
import com.reactnativecommunity.netinfo.BroadcastReceiverConnectivityReceiver;
import org.json.JSONObject;

/* compiled from: NetAddressManager.java */
/* loaded from: classes17.dex */
public class e0 {

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f11660a;
    private com.mbridge.msdk.setting.j b;
    private long c;
    private final BroadcastReceiver d;
    IntentFilter e;

    /* compiled from: NetAddressManager.java */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        static final e0 f11661a = new e0();
    }

    public static e0 a() {
        return b.f11661a;
    }

    public String b() {
        try {
            if (this.f11660a == null) {
                this.f11660a = new JSONObject();
            }
            if (this.f11660a.length() < 2) {
                try {
                    this.f11660a.put("KEY_INFO", (String) c.a(com.mbridge.msdk.foundation.controller.c.m().d(), "KEY_INFO", ""));
                } catch (Exception e) {
                    o0.b("NetAddressManager", e.getMessage());
                }
                try {
                    this.f11660a.put("KEY_TIME", ((Long) c.a(com.mbridge.msdk.foundation.controller.c.m().d(), "KEY_TIME", 0L)).longValue());
                } catch (Exception e2) {
                    o0.b("NetAddressManager", e2.getMessage());
                }
            }
            String optString = this.f11660a.optString("KEY_INFO");
            if (TextUtils.isEmpty(optString)) {
                return "";
            }
            com.mbridge.msdk.setting.g b2 = com.mbridge.msdk.setting.h.b().b(com.mbridge.msdk.foundation.controller.c.m().b());
            return System.currentTimeMillis() - this.f11660a.optLong("KEY_TIME") > (b2 != null ? b2.R() : com.anythink.expressad.f.a.b.P) * 1000 ? "" : optString;
        } catch (Exception e3) {
            o0.b("NetAddressManager", e3.getMessage());
            return "";
        }
    }

    public void c() {
        Context d;
        try {
            if (com.mbridge.msdk.setting.h.b().b(com.mbridge.msdk.foundation.controller.c.m().b()).S() != 1 || (d = com.mbridge.msdk.foundation.controller.c.m().d()) == null) {
                return;
            }
            IntentFilter intentFilter = new IntentFilter();
            this.e = intentFilter;
            intentFilter.addAction(BroadcastReceiverConnectivityReceiver.CONNECTIVITY_ACTION);
            d.registerReceiver(this.d, this.e);
        } catch (Exception e) {
            o0.b("NetAddressManager", e.getMessage());
        }
    }

    public void d() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.c > 3000) {
            if (this.b == null) {
                this.b = new com.mbridge.msdk.setting.j();
            }
            this.b.c(com.mbridge.msdk.foundation.controller.c.m().d(), com.mbridge.msdk.foundation.controller.c.m().b(), com.mbridge.msdk.foundation.controller.c.m().c());
            this.c = currentTimeMillis;
        }
    }

    public void e() {
        Context d = com.mbridge.msdk.foundation.controller.c.m().d();
        if (d != null) {
            try {
                d.unregisterReceiver(this.d);
            } catch (Exception e) {
                o0.b("NetAddressManager", e.getMessage());
            }
        }
    }

    private e0() {
        this.f11660a = new JSONObject();
        this.d = new NetWorkChangeReceiver();
        IntentFilter intentFilter = new IntentFilter();
        this.e = intentFilter;
        intentFilter.addAction(BroadcastReceiverConnectivityReceiver.CONNECTIVITY_ACTION);
    }

    public void a(String str) {
        if (this.f11660a == null) {
            this.f11660a = new JSONObject();
        }
        try {
            if (!this.f11660a.optString("KEY_INFO", "").equals(str)) {
                this.f11660a.put("KEY_INFO", str);
                c.b(com.mbridge.msdk.foundation.controller.c.m().d(), "KEY_INFO", str);
            }
        } catch (Exception e) {
            o0.b("NetAddressManager", e.getMessage());
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.f11660a.put("KEY_TIME", currentTimeMillis);
            c.b(com.mbridge.msdk.foundation.controller.c.m().d(), "KEY_TIME", Long.valueOf(currentTimeMillis));
        } catch (Exception e2) {
            o0.b("NetAddressManager", e2.getMessage());
        }
    }
}
