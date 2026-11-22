package com.baidu.android.bbalbs.common.util;

import android.content.Context;
import com.baidu.bbalbscesium.d;
import com.baidu.bbalbscesium.f;
import com.baidu.bbalbscesium.g;
import com.baidu.bbalbscesium.h;
import com.baidu.bbalbscesium.o.c;
import java.io.File;

/* loaded from: classes12.dex */
public final class DeviceId {
    private static final String h = "DeviceId";
    private static final boolean i = false;
    private static h.a j = null;
    private static volatile DeviceId k = null;
    private static final long l = 3600000;
    public static boolean sDataCuidInfoShable = true;

    /* renamed from: a, reason: collision with root package name */
    private final Context f6716a;
    private h b;
    private g c;
    private d d;
    private h.a e;
    private h.a f;
    private long g;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h.a f6717a;

        a(h.a aVar) {
            this.f6717a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                DeviceId.this.b(this.f6717a);
            } finally {
                DeviceId.this.b.c();
            }
        }
    }

    private DeviceId(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f6716a = applicationContext;
        this.d = new d();
        this.b = new h(applicationContext, new com.baidu.bbalbscesium.n.a(applicationContext), this.d);
        this.c = new g(applicationContext, this.d);
    }

    static DeviceId a(Context context) {
        DeviceId deviceId;
        synchronized (f.class) {
            if (k == null) {
                k = new DeviceId(context);
            }
            deviceId = k;
        }
        return deviceId;
    }

    private h.a a() {
        h.a aVar = this.f;
        if (aVar != null) {
            return aVar;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (Math.abs(currentTimeMillis - this.g) > 3600000) {
            this.f = c();
            this.g = currentTimeMillis;
        }
        h.a aVar2 = this.f;
        if (aVar2 != null) {
            return aVar2;
        }
        if (this.e == null) {
            this.f = a((String) null);
        }
        return this.f;
    }

    private h.a a(String str) {
        return this.b.c(str);
    }

    private Runnable a(h.a aVar) {
        return new a(aVar);
    }

    private h.a b(String str) {
        f b = this.c.b(str);
        if (b != null) {
            return this.b.a(b);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(h.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("cuidV270Info should not be null");
        }
        f g = aVar.g();
        this.b.a(aVar, true, false);
        this.c.a(g);
        this.b.a(aVar);
    }

    private h.a c() {
        return c((String) null);
    }

    private h.a c(String str) {
        h.a d = this.b.d();
        return d == null ? b(str) : d;
    }

    private synchronized void c(h.a aVar) {
        new Thread(a(aVar)).start();
    }

    private h.a d() {
        h.a f = f();
        return f == null ? e() : f;
    }

    private h.a e() {
        f a2;
        File file = new File(this.f6716a.getFilesDir(), f.g);
        if (!file.exists() || (a2 = f.a(c.a(file))) == null) {
            return null;
        }
        return this.b.a(a2);
    }

    private h.a f() {
        return this.b.b();
    }

    public static String getCUID(Context context) {
        String d;
        synchronized (DeviceId.class) {
            d = a(context).a().d();
        }
        return d;
    }

    public static String getDeviceID(Context context) {
        return a(context).a().b();
    }

    public static boolean isMySelfTrusted(Context context) {
        return a(context).d.a(context.getApplicationContext());
    }

    public static void setAndroidId(String str) {
        h.d(str);
    }

    @Deprecated
    public static void setCuidDataShable(Context context, boolean z) {
    }

    h b() {
        return this.b;
    }
}
