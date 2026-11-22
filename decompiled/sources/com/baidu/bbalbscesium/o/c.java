package com.baidu.bbalbscesium.o;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.autonavi.aps.amapapi.config.Const;
import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f7442a = false;
    private static final String b = "Util";

    private c() {
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x003f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.io.File r5) {
        /*
            r0 = 0
            java.io.FileReader r1 = new java.io.FileReader     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2b
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2b
            r5 = 8192(0x2000, float:1.148E-41)
            char[] r5 = new char[r5]     // Catch: java.lang.Exception -> L27 java.lang.Throwable -> L3b
            java.io.CharArrayWriter r2 = new java.io.CharArrayWriter     // Catch: java.lang.Exception -> L27 java.lang.Throwable -> L3b
            r2.<init>()     // Catch: java.lang.Exception -> L27 java.lang.Throwable -> L3b
        Lf:
            int r3 = r1.read(r5)     // Catch: java.lang.Exception -> L27 java.lang.Throwable -> L3b
            if (r3 <= 0) goto L1a
            r4 = 0
            r2.write(r5, r4, r3)     // Catch: java.lang.Exception -> L27 java.lang.Throwable -> L3b
            goto Lf
        L1a:
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Exception -> L27 java.lang.Throwable -> L3b
            r1.close()     // Catch: java.lang.Exception -> L22
            return r5
        L22:
            r0 = move-exception
            a(r0)
            return r5
        L27:
            r5 = move-exception
            goto L2d
        L29:
            r5 = move-exception
            goto L3d
        L2b:
            r5 = move-exception
            r1 = r0
        L2d:
            a(r5)     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto L3a
            r1.close()     // Catch: java.lang.Exception -> L36
            goto L3a
        L36:
            r5 = move-exception
            a(r5)
        L3a:
            return r0
        L3b:
            r5 = move-exception
            r0 = r1
        L3d:
            if (r0 == 0) goto L47
            r0.close()     // Catch: java.lang.Exception -> L43
            goto L47
        L43:
            r0 = move-exception
            a(r0)
        L47:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.bbalbscesium.o.c.a(java.io.File):java.lang.String");
    }

    public static String a(byte[] bArr, String str, boolean z) {
        return com.baidu.bbalbscesium.m.c.a(bArr, str, z);
    }

    public static String a(byte[] bArr, boolean z) {
        return com.baidu.bbalbscesium.m.c.a(bArr, z);
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                a(e);
            }
        }
    }

    public static void a(Throwable th) {
    }

    public static boolean a(Context context, String str) {
        for (ActivityManager.RunningServiceInfo runningServiceInfo : ((ActivityManager) context.getApplicationContext().getSystemService(Const.STR_PROCESS_TAG)).getRunningServices(100)) {
            if (runningServiceInfo.pid == Process.myPid() && !TextUtils.equals(runningServiceInfo.service.getClassName(), str)) {
                return true;
            }
        }
        return false;
    }
}
