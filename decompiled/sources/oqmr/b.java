package oqmr;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.os.Build;
import android.text.TextUtils;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.e;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes8.dex */
public class b {
    public static long a(Context context, String str) {
        if (context == null) {
            return -1L;
        }
        TextUtils.isEmpty(str);
        return -1L;
    }

    private static long b(int i) {
        long j = -1;
        if ((e.a().getApplicationInfo().targetSdkVersion >= 28 && Build.VERSION.SDK_INT >= 28) || Build.VERSION.SDK_INT >= 29) {
            return -1L;
        }
        Method declaredMethod = TrafficStats.class.getDeclaredMethod("getStatsService", new Class[0]);
        Class<?> cls = Class.forName("android.net.INetworkStatsService");
        declaredMethod.setAccessible(true);
        Object obj = null;
        Object invoke = declaredMethod.invoke(null, new Object[0]);
        Method[] declaredMethods = cls.getDeclaredMethods();
        int length = declaredMethods.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            Method method = declaredMethods[i2];
            if ("getDataLayerSnapshotForUid".equals(method.getName())) {
                method.setAccessible(true);
                obj = method.invoke(invoke, Integer.valueOf(i));
                break;
            }
            i2++;
        }
        long j2 = 0;
        for (Field field : Class.forName("android.net.NetworkStats").getDeclaredFields()) {
            field.setAccessible(true);
            if ("rxBytes".equals(field.getName())) {
                for (long j3 : (long[]) field.get(obj)) {
                    j2 += j3;
                }
            } else if ("txBytes".equals(field.getName())) {
                for (long j4 : (long[]) field.get(obj)) {
                    j2 += j4;
                }
            }
        }
        j = j2;
        return j / 1024;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static long c(int r10) {
        /*
            java.io.File r0 = new java.io.File
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "/proc/uid_stat/%s/tcp_rcv"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            boolean r1 = r0.exists()
            r2 = -1
            r4 = 0
            if (r1 == 0) goto L59
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L4f
            java.io.FileReader r5 = new java.io.FileReader     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L4f
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L4f
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L4f
            java.lang.String r0 = r1.readLine()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            long r4 = r0.longValue()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            r1.close()     // Catch: java.io.IOException -> L36
            goto L3a
        L36:
            r0 = move-exception
            r0.printStackTrace()
        L3a:
            r8 = r4
            r4 = r1
            r0 = r8
            goto L5a
        L3e:
            r10 = move-exception
            r4 = r1
            goto L44
        L41:
            r4 = r1
            goto L4f
        L43:
            r10 = move-exception
        L44:
            if (r4 == 0) goto L4e
            r4.close()     // Catch: java.io.IOException -> L4a
            goto L4e
        L4a:
            r0 = move-exception
            r0.printStackTrace()
        L4e:
            throw r10
        L4f:
            if (r4 == 0) goto L59
            r4.close()     // Catch: java.io.IOException -> L55
            goto L59
        L55:
            r0 = move-exception
            r0.printStackTrace()
        L59:
            r0 = r2
        L5a:
            java.io.File r5 = new java.io.File
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            java.lang.String r6 = "/proc/uid_stat/%s/tcp_snd"
            java.lang.String r10 = java.lang.String.format(r6, r10)
            r5.<init>(r10)
            boolean r10 = r5.exists()
            if (r10 == 0) goto Lad
            java.io.BufferedReader r10 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> La1
            java.io.FileReader r6 = new java.io.FileReader     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> La1
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> La1
            r10.<init>(r6)     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> La1
            java.lang.String r4 = r10.readLine()     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L92
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L92
            long r4 = r4.longValue()     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L92
            r10.close()     // Catch: java.io.IOException -> L8d
            goto Lae
        L8d:
            r10 = move-exception
            goto La9
        L8f:
            r0 = move-exception
            r4 = r10
            goto L96
        L92:
            r4 = r10
            goto La1
        L94:
            r10 = move-exception
            r0 = r10
        L96:
            if (r4 == 0) goto La0
            r4.close()     // Catch: java.io.IOException -> L9c
            goto La0
        L9c:
            r10 = move-exception
            r10.printStackTrace()
        La0:
            throw r0
        La1:
            if (r4 == 0) goto Lad
            r4.close()     // Catch: java.io.IOException -> La7
            goto Lad
        La7:
            r10 = move-exception
            r4 = r2
        La9:
            r10.printStackTrace()
            goto Lae
        Lad:
            r4 = r2
        Lae:
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 != 0) goto Lb7
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto Lb7
            return r2
        Lb7:
            r6 = 0
            if (r10 != 0) goto Lbc
            r0 = r6
        Lbc:
            int r10 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r10 != 0) goto Lc1
            r4 = r6
        Lc1:
            long r0 = r0 + r4
            r2 = 1024(0x400, double:5.06E-321)
            long r0 = r0 / r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: oqmr.b.c(int):long");
    }

    public static long a(PackageManager packageManager, String str) {
        if (packageManager == null) {
            return -1L;
        }
        TextUtils.isEmpty(str);
        return -1L;
    }

    private static long a(int i) {
        try {
            long uidTxBytes = (TrafficStats.getUidTxBytes(i) / 1024) + (TrafficStats.getUidRxBytes(i) / 1024);
            if (uidTxBytes != -1 && uidTxBytes != 0) {
                return uidTxBytes;
            }
            try {
                return c(i);
            } catch (Exception unused) {
                return uidTxBytes;
            }
        } catch (Exception unused2) {
            return -1L;
        }
    }
}
