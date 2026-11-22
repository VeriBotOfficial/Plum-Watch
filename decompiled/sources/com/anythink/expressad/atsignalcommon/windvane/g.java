package com.anythink.expressad.atsignalcommon.windvane;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes12.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static HashMap<String, Class> f4696a = new HashMap<>();
    private Context b;
    private Object c;
    private WindVaneWebView d;

    public g(Context context, WindVaneWebView windVaneWebView) {
        this.b = context;
        this.d = windVaneWebView;
        try {
            a((Class) Class.forName("com.anythink.expressad.atsignalcommon.bridge.BannerJSPlugin"));
        } catch (ClassNotFoundException unused) {
        }
        try {
            a((Class) Class.forName("com.anythink.expressad.video.signal.communication.RewardJs"));
        } catch (ClassNotFoundException unused2) {
        }
        try {
            a((Class) Class.forName("com.anythink.expressad.video.signal.communication.VideoBridge"));
        } catch (ClassNotFoundException unused3) {
        }
        try {
            a(com.anythink.expressad.atsignalcommon.a.b.e, Class.forName("com.anythink.expressad.atsignalcommon.mraid.MraidSignalCommunication"));
        } catch (ClassNotFoundException unused4) {
        }
        try {
            a((Class) Class.forName("com.anythink.expressad.splash.js.SplashJs"));
        } catch (ClassNotFoundException unused5) {
        }
        try {
            a(com.anythink.expressad.atsignalcommon.a.b.h, Class.forName("com.anythink.expressad.atsignalcommon.webEnvCheck.WebGLCheckSignal"));
        } catch (ClassNotFoundException unused6) {
        }
    }

    public final void a(Context context) {
        this.b = context;
    }

    public final void a(Object obj) {
        this.c = obj;
    }

    private Object a(String str, WindVaneWebView windVaneWebView, Context context) {
        Class cls = f4696a.get(str);
        if (cls == null) {
            return null;
        }
        try {
            if (!j.class.isAssignableFrom(cls)) {
                return null;
            }
            j jVar = (j) cls.newInstance();
            jVar.initialize(context, windVaneWebView);
            jVar.initialize(this.c, windVaneWebView);
            return jVar;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void a(Class cls) {
        if (f4696a == null) {
            f4696a = new HashMap<>();
        }
        f4696a.put(cls.getSimpleName(), cls);
    }

    private static void a(String str, Class cls) {
        if (f4696a == null) {
            f4696a = new HashMap<>();
        }
        f4696a.put(str, cls);
    }

    public final Object a(String str) {
        if (f4696a == null) {
            f4696a = new HashMap<>();
        }
        return a(str, this.d, this.b);
    }

    private static void b(String str) {
        if (f4696a == null) {
            f4696a = new HashMap<>();
        }
        f4696a.remove(str);
    }

    private static void a() {
        try {
            a((Class) Class.forName("com.anythink.expressad.atsignalcommon.bridge.BannerJSPlugin"));
        } catch (ClassNotFoundException unused) {
        }
        try {
            a((Class) Class.forName("com.anythink.expressad.video.signal.communication.RewardJs"));
        } catch (ClassNotFoundException unused2) {
        }
        try {
            a((Class) Class.forName("com.anythink.expressad.video.signal.communication.VideoBridge"));
        } catch (ClassNotFoundException unused3) {
        }
        try {
            a(com.anythink.expressad.atsignalcommon.a.b.e, Class.forName("com.anythink.expressad.atsignalcommon.mraid.MraidSignalCommunication"));
        } catch (ClassNotFoundException unused4) {
        }
        try {
            a((Class) Class.forName("com.anythink.expressad.splash.js.SplashJs"));
        } catch (ClassNotFoundException unused5) {
        }
        try {
            a(com.anythink.expressad.atsignalcommon.a.b.h, Class.forName("com.anythink.expressad.atsignalcommon.webEnvCheck.WebGLCheckSignal"));
        } catch (ClassNotFoundException unused6) {
        }
    }
}
