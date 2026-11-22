package com.iflytek.idata.extension;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import java.io.File;

/* loaded from: classes17.dex */
public class IFlyCollectorExt {

    /* renamed from: a, reason: collision with root package name */
    private static volatile IFlyCollectorExt f11226a;
    private Class<?> b;
    private Object c;
    private Context d;
    private volatile String e;
    private volatile boolean f;
    private volatile String g;

    class a extends Thread {
        a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            SystemClock.sleep(5000L);
            new c(IFlyCollectorExt.this.d).run();
        }
    }

    private IFlyCollectorExt(Context context) {
        boolean z = true;
        try {
            Context applicationContext = context.getApplicationContext();
            this.d = applicationContext;
            Class<?> cls = getClass(applicationContext, e(), b());
            this.b = cls;
            if (cls != null) {
                this.c = cls.newInstance();
                this.b.getMethod("init", Context.class).invoke(this.c, this.d);
                new a().start();
                z = false;
            }
        } catch (Throwable unused) {
            this.b = null;
            this.c = null;
        }
        a(z);
    }

    private void a(boolean z) {
        try {
            if (this.f) {
                return;
            }
            new Thread(new com.iflytek.idata.extension.a(this.d, z)).start();
            this.f = true;
        } catch (Throwable unused) {
        }
    }

    private static void deleteFile(File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                deleteFile(file2);
            }
        }
        file.delete();
    }

    private String e() {
        File file = new File(b());
        if (!file.exists() || !file.isDirectory()) {
            return null;
        }
        File[] listFiles = file.listFiles();
        if (listFiles.length == 1 && listFiles[0].exists() && listFiles[0].isFile()) {
            return listFiles[0].getName();
        }
        c();
        return null;
    }

    private native Class<?> getClass(Context context, String str, String str2);

    public static IFlyCollectorExt getInstance(Context context) {
        if (f11226a == null) {
            synchronized (IFlyCollectorExt.class) {
                if (f11226a == null) {
                    f11226a = new IFlyCollectorExt(context);
                }
            }
        }
        return f11226a;
    }

    String b() {
        String str = this.d.getFilesDir().getAbsolutePath() + File.separator + "iflytek/idata/cache/";
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str;
    }

    void c() {
        a(new File(b()));
    }

    byte[] d() {
        try {
            Class<?> cls = this.b;
            if (cls == null || this.c == null) {
                return null;
            }
            Object invoke = cls.getMethod("getData", new Class[0]).invoke(this.c, new Object[0]);
            if (invoke instanceof byte[]) {
                return (byte[]) invoke;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getAppId() {
        return this.e;
    }

    public String getSubId() {
        return this.g;
    }

    public void setAppId(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.e = str;
    }

    public void setSubId(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.g = str;
        SharedPreferences b = com.iflytek.idata.extension.d.b.b(this.d);
        if (b != null) {
            SharedPreferences.Editor edit = b.edit();
            edit.remove("subid");
            edit.apply();
        }
    }

    String a() {
        try {
            Class<?> cls = this.b;
            if (cls == null || this.c == null) {
                return "-1";
            }
            Object invoke = cls.getMethod(MobileAdsBridge.versionMethodName, new Class[0]).invoke(this.c, new Object[0]);
            return invoke instanceof String ? (String) invoke : "-1";
        } catch (Throwable unused) {
            return "-1";
        }
    }

    private void a(File file) {
        File[] listFiles;
        if (!file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null || listFiles.length <= 0) {
            return;
        }
        for (File file2 : listFiles) {
            if (file2 != null) {
                deleteFile(file2);
            }
        }
    }
}
