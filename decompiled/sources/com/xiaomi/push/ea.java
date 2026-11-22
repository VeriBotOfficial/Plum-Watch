package com.xiaomi.push;

import android.content.Context;
import android.gov.nist.core.Separators;
import com.xiaomi.push.service.XMJobService;

/* loaded from: classes4.dex */
public final class ea {

    /* renamed from: a, reason: collision with other field name */
    private static a f434a;

    /* renamed from: a, reason: collision with other field name */
    private static final String f435a = XMJobService.class.getCanonicalName();

    /* renamed from: a, reason: collision with root package name */
    private static int f14548a = 0;

    interface a {
        void a();

        void a(boolean z);

        /* renamed from: a, reason: collision with other method in class */
        boolean mo12107a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
    
        if (r6.equals(com.xiaomi.push.s.a(r9, r5.name).getSuperclass().getCanonicalName()) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.content.Context r9) {
        /*
            java.lang.String r0 = "android.permission.BIND_JOB_SERVICE"
            android.content.Context r9 = r9.getApplicationContext()
            java.lang.String r1 = "com.xiaomi.xmsf"
            java.lang.String r2 = r9.getPackageName()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L1a
            com.xiaomi.push.eb r0 = new com.xiaomi.push.eb
            r0.<init>(r9)
            com.xiaomi.push.ea.f434a = r0
            return
        L1a:
            android.content.pm.PackageManager r1 = r9.getPackageManager()
            r2 = 0
            java.lang.String r3 = r9.getPackageName()     // Catch: java.lang.Exception -> L7d
            r4 = 4
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r3, r4)     // Catch: java.lang.Exception -> L7d
            android.content.pm.ServiceInfo[] r3 = r1.services     // Catch: java.lang.Exception -> L7d
            if (r3 == 0) goto L94
            android.content.pm.ServiceInfo[] r1 = r1.services     // Catch: java.lang.Exception -> L7d
            int r3 = r1.length     // Catch: java.lang.Exception -> L7d
            r4 = r2
        L30:
            if (r2 >= r3) goto L7b
            r5 = r1[r2]     // Catch: java.lang.Exception -> L78
            java.lang.String r6 = r5.permission     // Catch: java.lang.Exception -> L78
            boolean r6 = r0.equals(r6)     // Catch: java.lang.Exception -> L78
            r7 = 1
            if (r6 == 0) goto L61
            java.lang.String r6 = com.xiaomi.push.ea.f435a     // Catch: java.lang.Exception -> L78
            java.lang.String r8 = r5.name     // Catch: java.lang.Exception -> L78
            boolean r8 = r6.equals(r8)     // Catch: java.lang.Exception -> L78
            if (r8 == 0) goto L49
        L47:
            r4 = r7
            goto L5e
        L49:
            java.lang.String r8 = r5.name     // Catch: java.lang.Exception -> L5e
            java.lang.Class r8 = com.xiaomi.push.s.a(r9, r8)     // Catch: java.lang.Exception -> L5e
            java.lang.Class r8 = r8.getSuperclass()     // Catch: java.lang.Exception -> L5e
            java.lang.String r8 = r8.getCanonicalName()     // Catch: java.lang.Exception -> L5e
            boolean r6 = r6.equals(r8)     // Catch: java.lang.Exception -> L5e
            if (r6 == 0) goto L5e
            goto L47
        L5e:
            if (r4 != r7) goto L61
            goto L7b
        L61:
            java.lang.String r6 = com.xiaomi.push.ea.f435a     // Catch: java.lang.Exception -> L78
            java.lang.String r8 = r5.name     // Catch: java.lang.Exception -> L78
            boolean r6 = r6.equals(r8)     // Catch: java.lang.Exception -> L78
            if (r6 == 0) goto L75
            java.lang.String r5 = r5.permission     // Catch: java.lang.Exception -> L78
            boolean r5 = r0.equals(r5)     // Catch: java.lang.Exception -> L78
            if (r5 == 0) goto L75
            r2 = r7
            goto L94
        L75:
            int r2 = r2 + 1
            goto L30
        L78:
            r0 = move-exception
            r2 = r4
            goto L7e
        L7b:
            r2 = r4
            goto L94
        L7d:
            r0 = move-exception
        L7e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "check service err : "
            r1.<init>(r3)
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            com.xiaomi.channel.commonutils.logger.b.m11781a(r0)
        L94:
            if (r2 != 0) goto Lba
            boolean r0 = com.xiaomi.push.s.m12373a(r9)
            if (r0 != 0) goto L9d
            goto Lba
        L9d:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Should export service: "
            r0.<init>(r1)
            java.lang.String r1 = com.xiaomi.push.ea.f435a
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " with permission android.permission.BIND_JOB_SERVICE in AndroidManifest.xml file"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        Lba:
            com.xiaomi.push.eb r0 = new com.xiaomi.push.eb
            r0.<init>(r9)
            com.xiaomi.push.ea.f434a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.ea.a(android.content.Context):void");
    }

    public static synchronized void a(Context context, int i) {
        synchronized (ea.class) {
            int i2 = f14548a;
            if (!"com.xiaomi.xmsf".equals(context.getPackageName())) {
                if (i == 2) {
                    f14548a = 2;
                } else {
                    f14548a = 0;
                }
            }
            int i3 = f14548a;
            if (i2 != i3 && i3 == 2) {
                a();
                f434a = new ed(context);
            }
        }
    }

    public static synchronized void a(boolean z) {
        synchronized (ea.class) {
            if (f434a == null) {
                com.xiaomi.channel.commonutils.logger.b.m11781a("timer is not initialized");
            } else {
                com.xiaomi.channel.commonutils.logger.b.m11781a("[Alarm] register alarm. (" + z + Separators.RPAREN);
                f434a.a(z);
            }
        }
    }

    public static synchronized void a() {
        synchronized (ea.class) {
            if (f434a == null) {
                return;
            }
            com.xiaomi.channel.commonutils.logger.b.m11781a("[Alarm] stop alarm.");
            f434a.a();
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static synchronized boolean m12106a() {
        synchronized (ea.class) {
            a aVar = f434a;
            if (aVar == null) {
                return false;
            }
            return aVar.mo12107a();
        }
    }
}
