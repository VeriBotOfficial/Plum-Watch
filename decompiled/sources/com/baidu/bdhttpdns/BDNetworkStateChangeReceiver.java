package com.baidu.bdhttpdns;

import android.content.BroadcastReceiver;
import android.content.Context;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes12.dex */
public class BDNetworkStateChangeReceiver extends BroadcastReceiver {
    private static boolean f = true;
    private static boolean g = true;
    private boolean b = false;
    private boolean c = true;
    private boolean d = true;
    private String e = "";

    /* renamed from: a, reason: collision with root package name */
    ExecutorService f7445a = Executors.newFixedThreadPool(1);

    class a implements Callable<Object> {
        a() {
        }

        /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:2|3)|(2:5|6)|(2:8|9)|13|14|15|16|(2:21|22)|18|19|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x003b, code lost:
        
            r5 = r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x003c, code lost:
        
            r0 = com.baidu.bdhttpdns.BDNetworkStateChangeReceiver.f = false;
            r1 = r5;
         */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // java.util.concurrent.Callable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object call() {
            /*
                r6 = this;
                java.net.InetSocketAddress r0 = new java.net.InetSocketAddress
                java.lang.String r1 = "2001:4860:4860::8888"
                r2 = 443(0x1bb, float:6.21E-43)
                r0.<init>(r1, r2)
                java.net.InetSocketAddress r1 = new java.net.InetSocketAddress
                java.lang.String r2 = "180.76.76.76"
                r3 = 80
                r1.<init>(r2, r3)
                r2 = 1
                r3 = 0
                r4 = 0
                java.net.DatagramSocket r5 = new java.net.DatagramSocket     // Catch: java.net.SocketException -> L21
                r5.<init>()     // Catch: java.net.SocketException -> L21
                r5.connect(r1)     // Catch: java.net.SocketException -> L22
                com.baidu.bdhttpdns.BDNetworkStateChangeReceiver.c(r2)     // Catch: java.net.SocketException -> L22
                goto L25
            L21:
                r5 = r4
            L22:
                com.baidu.bdhttpdns.BDNetworkStateChangeReceiver.c(r3)
            L25:
                if (r5 == 0) goto L2f
                r5.close()     // Catch: java.lang.Exception -> L2b
                goto L2f
            L2b:
                r1 = move-exception
                r1.printStackTrace()
            L2f:
                java.net.DatagramSocket r1 = new java.net.DatagramSocket     // Catch: java.net.SocketException -> L3c
                r1.<init>()     // Catch: java.net.SocketException -> L3c
                r1.connect(r0)     // Catch: java.net.SocketException -> L3b
                com.baidu.bdhttpdns.BDNetworkStateChangeReceiver.d(r2)     // Catch: java.net.SocketException -> L3b
                goto L40
            L3b:
                r5 = r1
            L3c:
                com.baidu.bdhttpdns.BDNetworkStateChangeReceiver.d(r3)
                r1 = r5
            L40:
                if (r1 == 0) goto L4a
                r1.close()     // Catch: java.lang.Exception -> L46
                goto L4a
            L46:
                r0 = move-exception
                r0.printStackTrace()
            L4a:
                boolean r0 = com.baidu.bdhttpdns.BDNetworkStateChangeReceiver.a()
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                boolean r1 = com.baidu.bdhttpdns.BDNetworkStateChangeReceiver.b()
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
                java.lang.String r1 = "isIPv4Reachable(%s), isIPv6Reachable(%s)"
                com.baidu.bdhttpdns.l.a(r1, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baidu.bdhttpdns.BDNetworkStateChangeReceiver.a.call():java.lang.Object");
        }
    }

    private void a(Context context) {
        l.a("Network change, clearCache(%b) httpDnsPrefetch(%b)", Boolean.valueOf(this.c), Boolean.valueOf(this.d));
        i a2 = i.a();
        a2.b();
        BDHttpDns service = BDHttpDns.getService(context);
        refreshIpReachable();
        ArrayList<String> b = service.a().b();
        if (this.c) {
            service.a().a();
            service.b().a();
        }
        if (!this.d || b == null || b.isEmpty()) {
            return;
        }
        a2.a(b, new k(context));
    }

    public static boolean isIPv4Reachable() {
        return g;
    }

    public static boolean isIPv6Reachable() {
        return f;
    }

    void a(boolean z) {
        this.c = z;
    }

    void b(boolean z) {
        this.d = z;
    }

    public boolean isIPv6Only() {
        return !g && f;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:11|(1:(6:38|17|18|(1:21)|23|24)(1:37))(1:15)|16|17|18|(1:21)|23|24) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        r4 = r0;
        r0 = r7;
        r7 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0064, code lost:
    
        a(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        r0 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0068, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0069, code lost:
    
        r6.printStackTrace();
     */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onReceive(android.content.Context r6, android.content.Intent r7) {
        /*
            r5 = this;
            java.lang.String r7 = ""
            boolean r0 = r5.b
            r1 = 1
            if (r0 != 0) goto La
            r5.b = r1
            return
        La:
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r6.getSystemService(r0)     // Catch: java.lang.RuntimeException -> L60
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch: java.lang.RuntimeException -> L60
            if (r0 != 0) goto L18
            r5.a(r6)     // Catch: java.lang.RuntimeException -> L60
            return
        L18:
            android.net.NetworkInfo r1 = r0.getNetworkInfo(r1)     // Catch: java.lang.RuntimeException -> L60
            r2 = 0
            android.net.NetworkInfo r0 = r0.getNetworkInfo(r2)     // Catch: java.lang.RuntimeException -> L60
            if (r1 == 0) goto L34
            android.net.NetworkInfo$State r2 = r1.getState()     // Catch: java.lang.RuntimeException -> L60
            android.net.NetworkInfo$State r3 = android.net.NetworkInfo.State.CONNECTED     // Catch: java.lang.RuntimeException -> L60
            if (r2 != r3) goto L34
            java.lang.String r0 = r1.getExtraInfo()     // Catch: java.lang.RuntimeException -> L60
        L2f:
            java.lang.String r0 = r0.toString()     // Catch: java.lang.RuntimeException -> L60
            goto L44
        L34:
            if (r0 == 0) goto L43
            android.net.NetworkInfo$State r1 = r0.getState()     // Catch: java.lang.RuntimeException -> L60
            android.net.NetworkInfo$State r2 = android.net.NetworkInfo.State.CONNECTED     // Catch: java.lang.RuntimeException -> L60
            if (r1 != r2) goto L43
            java.lang.String r0 = r0.getExtraInfo()     // Catch: java.lang.RuntimeException -> L60
            goto L2f
        L43:
            r0 = r7
        L44:
            java.lang.String r1 = r5.e     // Catch: java.lang.RuntimeException -> L5b
            boolean r1 = r1.equals(r0)     // Catch: java.lang.RuntimeException -> L5b
            if (r1 != 0) goto L6d
            if (r0 == r7) goto L6d
            java.lang.String r7 = "Current net type: %s."
            java.lang.Object[] r1 = new java.lang.Object[]{r0}     // Catch: java.lang.RuntimeException -> L5b
            com.baidu.bdhttpdns.l.a(r7, r1)     // Catch: java.lang.RuntimeException -> L5b
            r5.a(r6)     // Catch: java.lang.RuntimeException -> L5b
            goto L6d
        L5b:
            r7 = move-exception
            r4 = r0
            r0 = r7
            r7 = r4
            goto L61
        L60:
            r0 = move-exception
        L61:
            r0.printStackTrace()
            r5.a(r6)     // Catch: java.lang.Exception -> L68
            goto L6c
        L68:
            r6 = move-exception
            r6.printStackTrace()
        L6c:
            r0 = r7
        L6d:
            r5.e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.bdhttpdns.BDNetworkStateChangeReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }

    public void refreshIpReachable() {
        this.f7445a.submit(new a());
    }
}
