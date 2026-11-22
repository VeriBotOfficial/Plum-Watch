package com.baidu.mapsdkplatform.comapi.commonutils;

import android.text.TextUtils;
import com.baidu.mapapi.OpenLogUtil;
import com.baidu.platform.comapi.util.MapTaskManager;
import com.baidu.platform.comapi.util.SysOSUtil;
import com.baidu.platform.comjni.engine.NAEngine;

/* compiled from: BMapSDKLogStatistics.java */
/* loaded from: classes13.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f8349a = true;
    private static boolean b = false;

    /* compiled from: BMapSDKLogStatistics.java */
    /* renamed from: com.baidu.mapsdkplatform.comapi.commonutils.a$a, reason: collision with other inner class name */
    class RunnableC0376a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f8350a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        RunnableC0376a(c cVar, String str, String str2) {
            this.f8350a = cVar;
            this.b = str;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            NAEngine.a(this.f8350a.ordinal(), this.b, this.c);
        }
    }

    /* compiled from: BMapSDKLogStatistics.java */
    private enum b {
        eMonitorConsole(1),
        eMonitorNative(2),
        eMonitorNet(4);

        private int e;

        b(int i) {
            this.e = i;
        }

        public int a() {
            return this.e;
        }
    }

    /* compiled from: BMapSDKLogStatistics.java */
    public enum c {
        eNone,
        eMonitorVerbose,
        eMonitorDebug,
        eMonitorInfo,
        eMonitorWarn,
        eMonitorError,
        eMonitorRealTime
    }

    /* compiled from: BMapSDKLogStatistics.java */
    private static class d {

        /* renamed from: a, reason: collision with root package name */
        private static final a f8353a = new a(null);
    }

    /* compiled from: BMapSDKLogStatistics.java */
    public enum e {
        SDK_MAP,
        Net,
        Engine
    }

    /* synthetic */ a(RunnableC0376a runnableC0376a) {
        this();
    }

    public static a a() {
        return d.f8353a;
    }

    private void d() {
        NAEngine.a(new String[]{e.SDK_MAP.name(), e.Engine.name()});
    }

    public void b() {
        boolean isMapLogEnable = OpenLogUtil.isMapLogEnable();
        f8349a = isMapLogEnable;
        if (!isMapLogEnable || b) {
            return;
        }
        String mapLogFilePath = OpenLogUtil.getMapLogFilePath();
        if (TextUtils.isEmpty(mapLogFilePath)) {
            mapLogFilePath = SysOSUtil.getInstance().getExternalFilesDir();
        }
        NAEngine.a(false);
        NAEngine.a(mapLogFilePath);
        NAEngine.b(b.eMonitorNative.a());
        NAEngine.a(c.eMonitorError.ordinal());
        d();
        NAEngine.a(true);
        b = true;
    }

    public void c() {
        if (f8349a && b) {
            b = false;
            f8349a = false;
            NAEngine.a(false);
        }
    }

    private a() {
    }

    public void a(String str) {
        a(c.eMonitorRealTime, e.SDK_MAP.name(), str);
    }

    private void a(c cVar, String str, String str2) {
        if (f8349a) {
            MapTaskManager.getSingleThreadPool().submit(new RunnableC0376a(cVar, str, str2));
        }
    }
}
