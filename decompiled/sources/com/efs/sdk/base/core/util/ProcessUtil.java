package com.efs.sdk.base.core.util;

import android.os.Process;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.List;

/* loaded from: classes14.dex */
public class ProcessUtil {

    /* renamed from: a, reason: collision with root package name */
    private static String f9641a = null;
    private static List<Integer> b = null;
    private static long c = -1;

    public static int myPid() {
        return Process.myPid();
    }

    public static String getCurrentProcessName() {
        String str = f9641a;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String processName = getProcessName(Process.myPid());
        f9641a = processName;
        return processName;
    }

    public static String getProcessName(int i) {
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + i + "/cmdline")));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    int read = bufferedReader2.read();
                    if (read > 0) {
                        sb.append((char) read);
                    } else {
                        sb.trimToSize();
                        String sb2 = sb.toString();
                        try {
                            bufferedReader2.close();
                            return sb2;
                        } catch (Throwable th) {
                            th.printStackTrace();
                            return sb2;
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = bufferedReader2;
                try {
                    Log.e("efs.base", "get process name error", th);
                    return "";
                } finally {
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th3) {
                            th3.printStackTrace();
                        }
                    }
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if ((java.lang.System.currentTimeMillis() - com.efs.sdk.base.core.util.ProcessUtil.c) <= 600000) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean isProcessExist(android.content.Context r4, java.lang.String r5) {
        /*
            int r4 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.Throwable -> L73
            java.util.List<java.lang.Integer> r5 = com.efs.sdk.base.core.util.ProcessUtil.b     // Catch: java.lang.Throwable -> L73
            if (r5 == 0) goto L25
            boolean r5 = r5.isEmpty()     // Catch: java.lang.Throwable -> L73
            if (r5 == 0) goto Lf
            goto L25
        Lf:
            long r0 = com.efs.sdk.base.core.util.ProcessUtil.c     // Catch: java.lang.Throwable -> L73
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L25
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L73
            long r2 = com.efs.sdk.base.core.util.ProcessUtil.c     // Catch: java.lang.Throwable -> L73
            long r0 = r0 - r2
            r2 = 600000(0x927c0, double:2.964394E-318)
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L68
        L25:
            java.util.List<java.lang.Integer> r5 = com.efs.sdk.base.core.util.ProcessUtil.b     // Catch: java.lang.Throwable -> L73
            if (r5 == 0) goto L2d
            r5.clear()     // Catch: java.lang.Throwable -> L73
            goto L34
        L2d:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L73
            r5.<init>()     // Catch: java.lang.Throwable -> L73
            com.efs.sdk.base.core.util.ProcessUtil.b = r5     // Catch: java.lang.Throwable -> L73
        L34:
            int r5 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L73
            java.lang.String r5 = getProcessName(r5)     // Catch: java.lang.Throwable -> L73
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L73
            if (r5 != 0) goto L4f
            java.util.List<java.lang.Integer> r5 = com.efs.sdk.base.core.util.ProcessUtil.b     // Catch: java.lang.Throwable -> L73
            int r0 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L73
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L73
            r5.add(r0)     // Catch: java.lang.Throwable -> L73
        L4f:
            java.lang.String r5 = getProcessName(r4)     // Catch: java.lang.Throwable -> L73
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L73
            if (r5 != 0) goto L62
            java.util.List<java.lang.Integer> r5 = com.efs.sdk.base.core.util.ProcessUtil.b     // Catch: java.lang.Throwable -> L73
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L73
            r5.add(r0)     // Catch: java.lang.Throwable -> L73
        L62:
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L73
            com.efs.sdk.base.core.util.ProcessUtil.c = r0     // Catch: java.lang.Throwable -> L73
        L68:
            java.util.List<java.lang.Integer> r5 = com.efs.sdk.base.core.util.ProcessUtil.b     // Catch: java.lang.Throwable -> L73
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L73
            boolean r4 = r5.contains(r4)     // Catch: java.lang.Throwable -> L73
            return r4
        L73:
            r4 = move-exception
            java.lang.String r5 = "efs.base"
            java.lang.String r0 = "Process exist judge error"
            com.efs.sdk.base.core.util.Log.e(r5, r0, r4)
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.base.core.util.ProcessUtil.isProcessExist(android.content.Context, java.lang.String):boolean");
    }
}
