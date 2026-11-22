package com.efs.sdk.base.core.b;

import android.content.Context;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.core.util.ProcessUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.channels.FileLock;

/* loaded from: classes14.dex */
public final class h {
    static FileLock b;

    /* renamed from: a, reason: collision with root package name */
    volatile int f9600a;

    /* synthetic */ h(byte b2) {
        this();
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final h f9602a = new h(0);
    }

    private h() {
        this.f9600a = 0;
        a(ControllerCenter.getGlobalEnvStruct().mAppContext);
    }

    public final boolean a() {
        if (this.f9600a == 2) {
            return true;
        }
        if (this.f9600a != 0) {
            return false;
        }
        a(ControllerCenter.getGlobalEnvStruct().mAppContext);
        return false;
    }

    private synchronized void a(final Context context) {
        Log.w("efs.send_log", "tryFileLock start! ");
        this.f9600a = 1;
        new Thread(new Runnable() { // from class: com.efs.sdk.base.core.b.h.1
            @Override // java.lang.Runnable
            public final void run() {
                FileLock lock;
                try {
                    File a2 = com.efs.sdk.base.core.util.a.a(context);
                    if (!a2.exists()) {
                        a2.mkdirs();
                    }
                    File file = new File(a2.getPath() + File.separator + "sendlock");
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    do {
                        lock = new FileOutputStream(file).getChannel().lock();
                        h.b = lock;
                    } while (!lock.isValid());
                    Log.w("efs.send_log", "tryFileLock sendlock sucess! processname: " + ProcessUtil.getCurrentProcessName());
                    h.this.f9600a = 2;
                } catch (Exception e) {
                    Log.w("efs.send_log", "tryFileLock fail! " + e.getMessage());
                    h.this.f9600a = 0;
                }
            }
        }).start();
    }
}
