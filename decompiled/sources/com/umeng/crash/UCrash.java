package com.umeng.crash;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.crash.f;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

/* loaded from: classes2.dex */
public class UCrash {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f13986a;
    private static final h b = new h();

    public static synchronized void init(final Context context, final UCrashConfig uCrashConfig) {
        boolean z;
        synchronized (UCrash.class) {
            if (f13986a) {
                b.c("UCrash", "init: skipped. already initialized.");
                return;
            }
            if (context == null || uCrashConfig == null) {
                return;
            }
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            f.a aVar = new f.a() { // from class: com.umeng.crash.UCrash.1
                @Override // com.umeng.crash.f.a
                public final void a(String str, OutputStream outputStream) throws IOException {
                    Map<String, String> extras;
                    UCrashCallback uCrashCallback = UCrashConfig.this.callback;
                    if (uCrashCallback == null || (extras = uCrashCallback.getExtras(str)) == null || extras.isEmpty()) {
                        return;
                    }
                    for (String str2 : extras.keySet()) {
                        if (!TextUtils.isEmpty(str2)) {
                            String str3 = extras.get(str2);
                            if (!TextUtils.isEmpty(str3)) {
                                k.a(outputStream);
                                k.a(outputStream, str2 + "\n" + str3 + "\n");
                            }
                        }
                    }
                }

                @Override // com.umeng.crash.f.a
                public final void a(String str, String str2) {
                    UCrash.a().b("UCrash", "type: " + str + ", path: " + str2);
                    File file = new File(str2);
                    final File a2 = l.a(file);
                    if (UCrashConfig.this.backupEnable && !TextUtils.isEmpty(UCrashConfig.this.backupDir)) {
                        File file2 = new File(UCrashConfig.this.backupDir);
                        if (!file2.exists()) {
                            file2.mkdirs();
                        }
                        file.renameTo(new File(file2, file.getName()));
                    } else {
                        file.delete();
                    }
                    if ("exception".equals(str) && !UCrashConfig.this.customUploadImmediately) {
                        UCrash.a().b("UCrash", "custom log upload now: false");
                        return;
                    }
                    Runnable runnable = new Runnable() { // from class: com.umeng.crash.UCrash.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            l.a(context, UCrashConfig.this.url, a2, true);
                        }
                    };
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        try {
                            Thread thread = new Thread(runnable);
                            thread.start();
                            thread.join(2000L);
                            return;
                        } catch (Throwable th) {
                            UCrash.a().a("UCrash", "upload log failed", th);
                            return;
                        }
                    }
                    runnable.run();
                }
            };
            boolean z2 = false;
            if (!uCrashConfig.logEnable && !m.d()) {
                z = false;
                h.f14001a = z;
                f.b bVar = new f.b();
                bVar.f13999a = aVar;
                if (uCrashConfig.anrEnable && UMUtils.isMainProgress(context)) {
                    z2 = true;
                }
                bVar.l = z2;
                bVar.o = true;
                bVar.n = true;
                bVar.m = uCrashConfig.anrTraceHkEnable;
                bVar.g = uCrashConfig.nativeCrashEnable;
                bVar.j = uCrashConfig.nativeDumpAllThreads;
                bVar.h = uCrashConfig.nativeCrashRethrow;
                bVar.b = uCrashConfig.javaCrashEnable;
                bVar.c = uCrashConfig.javaCrashRethrow;
                bVar.d = true;
                bVar.e = uCrashConfig.javaDumpAllThreads;
                bVar.f14000q = uCrashConfig.customEnable;
                c.a(context);
                c a2 = c.a();
                a2.o = uCrashConfig.customFileSaveLimit;
                a2.p = uCrashConfig.customFileUploadLimit;
                int a3 = f.a(context, bVar);
                b.b(new Runnable() { // from class: com.umeng.crash.UCrash.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            Context context2 = context;
                            String str = uCrashConfig.url;
                            File[] a4 = k.a();
                            if (a4.length != 0) {
                                int length = a4.length - 15;
                                if (length > 0) {
                                    for (int i = 0; i < length; i++) {
                                        a4[i].delete();
                                        UCrash.a().b("UCrash.Upload", "file over limit. delete old file: " + a4[i].getName());
                                    }
                                } else {
                                    length = 0;
                                }
                                while (length < a4.length) {
                                    if (a4[length].getName().endsWith("_anr.log")) {
                                        File file = a4[length];
                                        a4[length] = l.a(file);
                                        file.delete();
                                    }
                                    l.a(context2, str, a4[length], false);
                                    length++;
                                }
                            }
                            l.a(context, uCrashConfig.url);
                            k.c();
                        } catch (Throwable th) {
                            UCrash.a().a("UCrash", "upload cache failed", th);
                        }
                    }
                });
                b.b("UCrash", "init version: 1.1.0, code: ".concat(String.valueOf(a3)));
                f13986a = true;
            }
            z = true;
            h.f14001a = z;
            f.b bVar2 = new f.b();
            bVar2.f13999a = aVar;
            if (uCrashConfig.anrEnable) {
                z2 = true;
            }
            bVar2.l = z2;
            bVar2.o = true;
            bVar2.n = true;
            bVar2.m = uCrashConfig.anrTraceHkEnable;
            bVar2.g = uCrashConfig.nativeCrashEnable;
            bVar2.j = uCrashConfig.nativeDumpAllThreads;
            bVar2.h = uCrashConfig.nativeCrashRethrow;
            bVar2.b = uCrashConfig.javaCrashEnable;
            bVar2.c = uCrashConfig.javaCrashRethrow;
            bVar2.d = true;
            bVar2.e = uCrashConfig.javaDumpAllThreads;
            bVar2.f14000q = uCrashConfig.customEnable;
            c.a(context);
            c a22 = c.a();
            a22.o = uCrashConfig.customFileSaveLimit;
            a22.p = uCrashConfig.customFileUploadLimit;
            int a32 = f.a(context, bVar2);
            b.b(new Runnable() { // from class: com.umeng.crash.UCrash.2
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        Context context2 = context;
                        String str = uCrashConfig.url;
                        File[] a4 = k.a();
                        if (a4.length != 0) {
                            int length = a4.length - 15;
                            if (length > 0) {
                                for (int i = 0; i < length; i++) {
                                    a4[i].delete();
                                    UCrash.a().b("UCrash.Upload", "file over limit. delete old file: " + a4[i].getName());
                                }
                            } else {
                                length = 0;
                            }
                            while (length < a4.length) {
                                if (a4[length].getName().endsWith("_anr.log")) {
                                    File file = a4[length];
                                    a4[length] = l.a(file);
                                    file.delete();
                                }
                                l.a(context2, str, a4[length], false);
                                length++;
                            }
                        }
                        l.a(context, uCrashConfig.url);
                        k.c();
                    } catch (Throwable th) {
                        UCrash.a().a("UCrash", "upload cache failed", th);
                    }
                }
            });
            b.b("UCrash", "init version: 1.1.0, code: ".concat(String.valueOf(a32)));
            f13986a = true;
        }
    }

    public static void reRegisterAnrHandler() {
        if (f13986a) {
            i a2 = i.a();
            try {
                if (a2.f14002a.l) {
                    UCrashJNI.registerAnr(a2.f14002a.m);
                }
            } catch (Throwable th) {
                b.a("UCrash.Native", "register anr failed", th);
            }
        }
    }

    public static void addHeader(String str, String str2) {
        c a2 = c.a();
        synchronized (a2.f13995q) {
            a2.f13995q.put(str, str2);
        }
    }

    public static void updateCustomLogLimit(int i, int i2) {
        c.a().o = i;
        c.a().p = i2;
    }

    public static void generateCustomLog(final String str, final boolean z) {
        if (!f13986a) {
            Log.e("UCrash", "please call init first.");
        } else {
            b.a(new Runnable() { // from class: com.umeng.crash.UCrash.3
                /* JADX WARN: Removed duplicated region for block: B:17:0x00f6 A[Catch: Exception -> 0x0146, all -> 0x0165, TRY_LEAVE, TryCatch #1 {all -> 0x0165, blocks: (B:3:0x0010, B:5:0x001c, B:12:0x0032, B:15:0x00d2, B:17:0x00f6, B:18:0x0108, B:20:0x011e, B:21:0x011f, B:26:0x00fc, B:29:0x0103, B:44:0x00c0, B:51:0x0148, B:52:0x014b, B:58:0x014c, B:48:0x00c8), top: B:2:0x0010, inners: #3 }] */
                /* JADX WARN: Removed duplicated region for block: B:20:0x011e A[Catch: Exception -> 0x0146, all -> 0x0165, TryCatch #1 {all -> 0x0165, blocks: (B:3:0x0010, B:5:0x001c, B:12:0x0032, B:15:0x00d2, B:17:0x00f6, B:18:0x0108, B:20:0x011e, B:21:0x011f, B:26:0x00fc, B:29:0x0103, B:44:0x00c0, B:51:0x0148, B:52:0x014b, B:58:0x014c, B:48:0x00c8), top: B:2:0x0010, inners: #3 }] */
                /* JADX WARN: Removed duplicated region for block: B:25:0x00fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 368
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.umeng.crash.UCrash.AnonymousClass3.run():void");
                }
            });
        }
    }

    static g a() {
        return b;
    }
}
