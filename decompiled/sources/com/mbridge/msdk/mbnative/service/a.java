package com.mbridge.msdk.mbnative.service;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.mbnative.controller.NativeController;
import com.mbridge.msdk.mbnative.controller.d;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeListener;
import java.util.List;
import java.util.Map;

/* compiled from: NativeProvider.java */
/* loaded from: classes17.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private NativeController f11829a;
    private Handler b = new Handler(Looper.getMainLooper());
    private com.mbridge.msdk.mbnative.listener.a c;
    private NativeListener.NativeTrackingListener d;

    /* compiled from: NativeProvider.java */
    /* renamed from: com.mbridge.msdk.mbnative.service.a$a, reason: collision with other inner class name */
    class RunnableC0704a implements Runnable {
        RunnableC0704a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.f();
        }
    }

    public a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.c.onAdLoadError("current request is loading");
        this.c.b();
    }

    public static void preload(Map<String, Object> map, int i) {
        o0.c("NativeProvider", "native provider preload");
        new d().a(map, i);
    }

    public void b(View view, Campaign campaign) {
        o0.c("NativeProvider", "native provider unregisterView");
        NativeController nativeController = this.f11829a;
        if (nativeController == null) {
            return;
        }
        nativeController.b(campaign, view);
    }

    public String c() {
        NativeController nativeController = this.f11829a;
        return nativeController != null ? nativeController.g() : "";
    }

    public void d() {
        a(0, "");
    }

    public void e() {
        a(1, "");
    }

    public void g() {
        try {
            this.f11829a.i();
        } catch (Exception unused) {
            o0.b("NativeProvider", "release failed");
        }
    }

    public void a(com.mbridge.msdk.mbnative.listener.a aVar) {
        this.c = aVar;
    }

    public a(com.mbridge.msdk.mbnative.listener.a aVar, NativeListener.NativeTrackingListener nativeTrackingListener) {
        this.c = aVar;
        this.d = nativeTrackingListener;
    }

    public void a(NativeListener.NativeTrackingListener nativeTrackingListener) {
        this.d = nativeTrackingListener;
    }

    public void a(Context context, Resources resources, Map<String, Object> map) {
        this.f11829a = new NativeController(this.c, this.d, map, context);
    }

    public void a(String str) {
        a(0, str);
    }

    public void a() {
        try {
            this.f11829a.d();
        } catch (Exception unused) {
            o0.b("NativeProvider", "clear cache failed");
        }
    }

    public void b(View view, List<View> list, Campaign campaign) {
        o0.c("NativeProvider", "native provider unregisterView");
        NativeController nativeController = this.f11829a;
        if (nativeController == null) {
            return;
        }
        nativeController.b(campaign, view, list);
    }

    public void a(View view, List<View> list, Campaign campaign) {
        NativeController nativeController = this.f11829a;
        if (nativeController == null) {
            return;
        }
        nativeController.a(campaign, view, list);
    }

    public String b() {
        NativeController nativeController = this.f11829a;
        if (nativeController != null) {
            return nativeController.e();
        }
        return "";
    }

    public void a(View view, Campaign campaign) {
        o0.c("NativeProvider", "native provider registerView");
        NativeController nativeController = this.f11829a;
        if (nativeController == null) {
            return;
        }
        nativeController.a(campaign, view);
    }

    private void a(int i, String str) {
        if (this.f11829a != null) {
            com.mbridge.msdk.mbnative.listener.a aVar = this.c;
            if (aVar != null && aVar.a()) {
                if (t0.h()) {
                    f();
                    return;
                } else {
                    this.b.post(new RunnableC0704a());
                    return;
                }
            }
            com.mbridge.msdk.mbnative.listener.a aVar2 = this.c;
            if (aVar2 != null) {
                aVar2.b();
            }
            this.f11829a.a(i, str);
        }
    }
}
