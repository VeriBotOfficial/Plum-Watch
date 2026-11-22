package com.baidu.platform.comapi.walknavi.e;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.baidu.bikenavi.R;
import com.baidu.mapapi.map.MapLanguage;
import com.baidu.platform.comapi.wnplatform.option.EngineOptions;
import com.baidu.platform.comjni.bikenavi.JNIEngineManager;
import com.baidu.platform.comjni.jninative.EngineCommonConfig;
import java.nio.ByteBuffer;

/* compiled from: WNaviEngineManager.java */
/* loaded from: classes13.dex */
public class b extends com.baidu.platform.comapi.walknavi.a {
    private EngineOptions f;

    /* renamed from: a, reason: collision with root package name */
    private JNIEngineManager f8701a = null;
    private long b = 0;
    private long c = 0;
    private long d = 0;
    private com.baidu.platform.comapi.walknavi.e.a e = null;
    private int g = 0;
    private Handler h = new a();

    /* compiled from: WNaviEngineManager.java */
    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                if (b.this.e != null) {
                    b.this.e.engineInitFail();
                    b.this.e = null;
                    return;
                }
                return;
            }
            if (i == 16 || i == 32) {
                b bVar = b.this;
                bVar.g = message.what | bVar.g;
                if (b.this.e == null || b.this.g != 48) {
                    return;
                }
                b.this.e.engineInitSuccess();
            }
        }
    }

    /* compiled from: WNaviEngineManager.java */
    /* renamed from: com.baidu.platform.comapi.walknavi.e.b$b, reason: collision with other inner class name */
    private class C0405b extends Thread {

        /* renamed from: a, reason: collision with root package name */
        private EngineCommonConfig f8703a;
        private long b;

        public C0405b(long j, EngineCommonConfig engineCommonConfig) {
            this.b = j;
            this.f8703a = engineCommonConfig;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            long[] jArr = {0};
            int initBaseManager = b.this.f8701a.initBaseManager(this.f8703a, this.b, jArr);
            Log.d("ret====", "ret：" + initBaseManager);
            if (initBaseManager != 0) {
                Message.obtain(b.this.h, 1).sendToTarget();
            } else {
                b.this.b = jArr[0];
                Message.obtain(b.this.h, 16).sendToTarget();
            }
        }
    }

    /* compiled from: WNaviEngineManager.java */
    private class c extends Thread {

        /* renamed from: a, reason: collision with root package name */
        private Context f8704a;

        public c(Context context) {
            this.f8704a = context;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            if (!com.baidu.platform.comapi.wnplatform.p.p.a.c(this.f8704a)) {
                Message.obtain(b.this.h, 32).sendToTarget();
                return;
            }
            com.baidu.platform.comapi.wnplatform.d.a.a("InitResourceThread  error");
            Log.d("InitResourceThread", "InitResourceThread  error");
            Message.obtain(b.this.h, 1).sendToTarget();
        }
    }

    private synchronized void g() {
        JNIEngineManager jNIEngineManager = this.f8701a;
        if (jNIEngineManager != null) {
            this.f = null;
            jNIEngineManager.uninitBaseManager(this.b);
            this.c = 0L;
        }
    }

    public int e() {
        return this.g;
    }

    public void f() {
        JNIEngineManager jNIEngineManager = this.f8701a;
        if (jNIEngineManager != null) {
            jNIEngineManager.unInitBaseAr(this.b);
        }
    }

    @Override // com.baidu.platform.comapi.walknavi.a
    public boolean ready() {
        return true;
    }

    @Override // com.baidu.platform.comapi.walknavi.a
    public synchronized void release() {
        g();
        this.f8701a = null;
        this.c = 0L;
        this.d = 0L;
        this.g = 0;
        this.b = 0L;
        this.e = null;
        this.f = null;
    }

    public EngineOptions b() {
        return this.f;
    }

    public long c() {
        if (this.d == 0) {
            this.d = c(1);
        }
        return this.d;
    }

    public long d() {
        if (this.c == 0) {
            this.c = c(0);
        }
        return this.c;
    }

    public void a(Context context, long j, EngineOptions engineOptions, com.baidu.platform.comapi.walknavi.e.a aVar) {
        this.e = aVar;
        this.f = engineOptions;
        if (this.g == 48) {
            if (aVar != null) {
                aVar.engineInitSuccess();
                return;
            }
            return;
        }
        EngineCommonConfig engineCommonConfig = new EngineCommonConfig();
        int min = Math.min(com.baidu.platform.comapi.wnplatform.p.q.b.b().d(), 800);
        engineCommonConfig.mStreetPicWidth = min;
        engineCommonConfig.mStreetPicHeight = (min * 3) / 5;
        engineCommonConfig.mStreetPicQuality = 80;
        engineCommonConfig.mNoExistSensor = false;
        if (engineOptions != null) {
            MapLanguage languageType = engineOptions.getLanguageType();
            if (languageType != null) {
                engineCommonConfig.enLanguageType = languageType.ordinal();
            }
            engineCommonConfig.routeCustomWidth = engineOptions.getRouteCustomWidth();
            Bundle a2 = a(engineOptions.getCompassCustomBitmap());
            engineCommonConfig.compassCustomRes = a2;
            if (a2 == null && MapLanguage.ENGLISH == languageType) {
                engineCommonConfig.compassCustomRes = a(BitmapFactory.decodeResource(context.getResources(), R.drawable.icon_compass_en));
            }
            Bundle a3 = a(engineOptions.getEndPointCustomBitmap());
            engineCommonConfig.endPointCustomRes = a3;
            if (a3 == null && MapLanguage.ENGLISH == languageType) {
                engineCommonConfig.endPointCustomRes = a(BitmapFactory.decodeResource(context.getResources(), R.drawable.icon_arrive_en));
            }
            engineCommonConfig.routeNormalCustomRes = a(engineOptions.getRouteNormalCustomBitmap());
            engineCommonConfig.routePassedCustomRes = a(engineOptions.getRoutePassedCustomBitmap());
            Bundle a4 = a(engineOptions.getFacilityForbiddenCustomBitmap());
            engineCommonConfig.facilityForbiddenCustomRes = a4;
            if (a4 == null && MapLanguage.ENGLISH == languageType) {
                engineCommonConfig.facilityForbiddenCustomRes = a(BitmapFactory.decodeResource(context.getResources(), R.drawable.icon_route_walk_type_forbidden_en));
            }
            Bundle a5 = a(engineOptions.getFacilityRetrogradeCustomBitmap());
            engineCommonConfig.facilityRetrogradeCustomRes = a5;
            if (a5 == null && MapLanguage.ENGLISH == languageType) {
                engineCommonConfig.facilityRetrogradeCustomRes = a(BitmapFactory.decodeResource(context.getResources(), R.drawable.icon_route_walk_type_retrograde_en));
            }
            Bundle a6 = a(engineOptions.getLightWaitCustomBitmap());
            engineCommonConfig.lightWaitCustomRes = a6;
            if (a6 == null && MapLanguage.ENGLISH == languageType) {
                engineCommonConfig.lightWaitCustomRes = a(BitmapFactory.decodeResource(context.getResources(), R.drawable.icon_light_wait_en));
            }
            Bundle a7 = a(engineOptions.getLightAttentionCustomBitmap());
            engineCommonConfig.lightAttentionCustomRes = a7;
            if (a7 == null && MapLanguage.ENGLISH == languageType) {
                engineCommonConfig.lightAttentionCustomRes = a(BitmapFactory.decodeResource(context.getResources(), R.drawable.icon_light_notice_en));
            }
            Bundle a8 = a(engineOptions.getLightPassCustomBitmap());
            engineCommonConfig.lightPassCustomBitmap = a8;
            if (a8 == null && MapLanguage.ENGLISH == languageType) {
                engineCommonConfig.lightPassCustomBitmap = a(BitmapFactory.decodeResource(context.getResources(), R.drawable.icon_light_pass_en));
            }
        }
        this.f8701a = new JNIEngineManager();
        new C0405b(j, engineCommonConfig).start();
        new c(context).start();
    }

    private long c(int i) {
        JNIEngineManager jNIEngineManager = this.f8701a;
        if (jNIEngineManager != null) {
            long j = this.b;
            if (j != 0) {
                long[] jArr = {0};
                try {
                    jNIEngineManager.getSubSysHandle(j, i, jArr);
                } catch (Exception e) {
                    com.baidu.platform.comapi.wnplatform.d.a.b(e.getMessage());
                }
                return jArr[0];
            }
        }
        return 0L;
    }

    public boolean a(long j) {
        return this.f8701a.initBaseAr(this.b, j) == 0;
    }

    private Bundle a(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bundle bundle = new Bundle();
        bundle.putInt("image_width", width);
        bundle.putInt("image_height", height);
        ByteBuffer allocate = ByteBuffer.allocate(width * height * 4);
        bitmap.copyPixelsToBuffer(allocate);
        bundle.putByteArray("image_data", allocate.array());
        return bundle;
    }
}
