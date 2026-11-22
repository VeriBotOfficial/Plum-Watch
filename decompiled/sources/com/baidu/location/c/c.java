package com.baidu.location.c;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* loaded from: classes13.dex */
public class c {
    private static c d;

    /* renamed from: a, reason: collision with root package name */
    private boolean f7606a = false;
    private String b = null;
    private b c = null;
    private int e = -1;
    private a f;

    public interface a {
        void a(boolean z);
    }

    public class b extends BroadcastReceiver {
        public b() {
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x007d A[Catch: Exception -> 0x008d, TRY_LEAVE, TryCatch #0 {Exception -> 0x008d, blocks: (B:3:0x0005, B:5:0x000d, B:8:0x0030, B:15:0x0047, B:20:0x0075, B:22:0x007d, B:27:0x0060, B:28:0x0067, B:29:0x006d, B:30:0x004d, B:31:0x0051, B:32:0x0055, B:33:0x0039), top: B:2:0x0005 }] */
        /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x006d A[Catch: Exception -> 0x008d, TryCatch #0 {Exception -> 0x008d, blocks: (B:3:0x0005, B:5:0x000d, B:8:0x0030, B:15:0x0047, B:20:0x0075, B:22:0x007d, B:27:0x0060, B:28:0x0067, B:29:0x006d, B:30:0x004d, B:31:0x0051, B:32:0x0055, B:33:0x0039), top: B:2:0x0005 }] */
        @Override // android.content.BroadcastReceiver
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onReceive(android.content.Context r6, android.content.Intent r7) {
            /*
                r5 = this;
                java.lang.String r6 = r7.getAction()
                r0 = 0
                java.lang.String r1 = "android.intent.action.BATTERY_CHANGED"
                boolean r6 = r6.equals(r1)     // Catch: java.lang.Exception -> L8d
                if (r6 == 0) goto L92
                com.baidu.location.c.c r6 = com.baidu.location.c.c.this     // Catch: java.lang.Exception -> L8d
                r1 = 0
                com.baidu.location.c.c.a(r6, r1)     // Catch: java.lang.Exception -> L8d
                java.lang.String r6 = "status"
                int r6 = r7.getIntExtra(r6, r1)     // Catch: java.lang.Exception -> L8d
                java.lang.String r2 = "plugged"
                int r1 = r7.getIntExtra(r2, r1)     // Catch: java.lang.Exception -> L8d
                java.lang.String r2 = "level"
                r3 = -1
                int r2 = r7.getIntExtra(r2, r3)     // Catch: java.lang.Exception -> L8d
                java.lang.String r4 = "scale"
                int r7 = r7.getIntExtra(r4, r3)     // Catch: java.lang.Exception -> L8d
                if (r2 <= 0) goto L39
                if (r7 <= 0) goto L39
                com.baidu.location.c.c r3 = com.baidu.location.c.c.this     // Catch: java.lang.Exception -> L8d
                int r2 = r2 * 100
                int r2 = r2 / r7
                com.baidu.location.c.c.a(r3, r2)     // Catch: java.lang.Exception -> L8d
                goto L3e
            L39:
                com.baidu.location.c.c r7 = com.baidu.location.c.c.this     // Catch: java.lang.Exception -> L8d
                com.baidu.location.c.c.a(r7, r3)     // Catch: java.lang.Exception -> L8d
            L3e:
                r7 = 2
                if (r6 == r7) goto L55
                r2 = 3
                if (r6 == r2) goto L4d
                r2 = 4
                if (r6 == r2) goto L4d
                com.baidu.location.c.c r6 = com.baidu.location.c.c.this     // Catch: java.lang.Exception -> L8d
                com.baidu.location.c.c.a(r6, r0)     // Catch: java.lang.Exception -> L8d
                goto L5a
            L4d:
                com.baidu.location.c.c r6 = com.baidu.location.c.c.this     // Catch: java.lang.Exception -> L8d
                java.lang.String r2 = "3"
            L51:
                com.baidu.location.c.c.a(r6, r2)     // Catch: java.lang.Exception -> L8d
                goto L5a
            L55:
                com.baidu.location.c.c r6 = com.baidu.location.c.c.this     // Catch: java.lang.Exception -> L8d
                java.lang.String r2 = "4"
                goto L51
            L5a:
                r6 = 1
                if (r1 == r6) goto L6d
                if (r1 == r7) goto L60
                goto L75
            L60:
                com.baidu.location.c.c r7 = com.baidu.location.c.c.this     // Catch: java.lang.Exception -> L8d
                java.lang.String r1 = "5"
                com.baidu.location.c.c.a(r7, r1)     // Catch: java.lang.Exception -> L8d
            L67:
                com.baidu.location.c.c r7 = com.baidu.location.c.c.this     // Catch: java.lang.Exception -> L8d
                com.baidu.location.c.c.a(r7, r6)     // Catch: java.lang.Exception -> L8d
                goto L75
            L6d:
                com.baidu.location.c.c r7 = com.baidu.location.c.c.this     // Catch: java.lang.Exception -> L8d
                java.lang.String r1 = "6"
                com.baidu.location.c.c.a(r7, r1)     // Catch: java.lang.Exception -> L8d
                goto L67
            L75:
                com.baidu.location.c.c r6 = com.baidu.location.c.c.this     // Catch: java.lang.Exception -> L8d
                com.baidu.location.c.c$a r6 = com.baidu.location.c.c.a(r6)     // Catch: java.lang.Exception -> L8d
                if (r6 == 0) goto L92
                com.baidu.location.c.c r6 = com.baidu.location.c.c.this     // Catch: java.lang.Exception -> L8d
                com.baidu.location.c.c$a r6 = com.baidu.location.c.c.a(r6)     // Catch: java.lang.Exception -> L8d
                com.baidu.location.c.c r7 = com.baidu.location.c.c.this     // Catch: java.lang.Exception -> L8d
                boolean r7 = com.baidu.location.c.c.b(r7)     // Catch: java.lang.Exception -> L8d
                r6.a(r7)     // Catch: java.lang.Exception -> L8d
                return
            L8d:
                com.baidu.location.c.c r6 = com.baidu.location.c.c.this
                com.baidu.location.c.c.a(r6, r0)
            L92:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baidu.location.c.c.b.onReceive(android.content.Context, android.content.Intent):void");
        }
    }

    private c() {
    }

    public static synchronized c a() {
        c cVar;
        synchronized (c.class) {
            if (d == null) {
                d = new c();
            }
            cVar = d;
        }
        return cVar;
    }

    public void b() {
        this.c = new b();
        try {
            com.baidu.location.f.getServiceContext().registerReceiver(this.c, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        } catch (Exception unused) {
        }
    }

    public void c() {
        if (this.c != null) {
            try {
                com.baidu.location.f.getServiceContext().unregisterReceiver(this.c);
            } catch (Exception unused) {
            }
        }
        this.c = null;
        this.f = null;
    }

    public String d() {
        return this.b;
    }

    public boolean e() {
        return this.f7606a;
    }

    public int f() {
        return this.e;
    }
}
