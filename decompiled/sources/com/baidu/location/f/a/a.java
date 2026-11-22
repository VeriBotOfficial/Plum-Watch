package com.baidu.location.f.a;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.CellIdentityNr;
import android.telephony.CellInfo;
import android.telephony.CellLocation;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.util.Log;
import com.baidu.location.f.g;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes13.dex */
public class a implements com.baidu.location.f.b.a {
    public static int b;
    private static Class<?> w;
    private C0347a t;
    private b u;
    private c v;
    private Context x;
    private int e = 30;
    private int f = -1;
    private AtomicInteger g = new AtomicInteger(0);
    private float h = 0.2f;
    private boolean i = true;
    private boolean j = false;
    private TelephonyManager k = null;
    private TelephonyManager l = null;
    private TelephonyManager m = null;
    private SubscriptionManager n = null;
    private com.baidu.location.f.a o = new com.baidu.location.f.a();
    private com.baidu.location.f.a p = null;

    /* renamed from: q, reason: collision with root package name */
    private List<com.baidu.location.f.a> f7649q = null;
    private Executor r = null;
    private d s = null;
    private boolean y = false;

    /* renamed from: a, reason: collision with root package name */
    public int f7648a = 0;
    private boolean z = false;
    private long A = 0;
    private long B = 0;
    private boolean C = false;
    private boolean D = true;
    private boolean E = false;
    private Handler F = null;
    private int G = -1;
    private int H = -1;
    private final Object I = new Object();
    private long J = 0;
    private List<com.baidu.location.f.a> K = null;
    private List<CellInfo> L = null;
    private AtomicInteger M = new AtomicInteger(1000);
    private CellLocation N = null;
    private long O = 0;

    /* renamed from: com.baidu.location.f.a.a$a, reason: collision with other inner class name */
    private class C0347a extends TelephonyManager.CellInfoCallback {
        private C0347a() {
        }

        @Override // android.telephony.TelephonyManager.CellInfoCallback
        public void onCellInfo(List<CellInfo> list) {
            if (list == null) {
                return;
            }
            if (!com.baidu.location.f.b.a.d || g.i().a(list)) {
                a.this.j();
            }
        }

        @Override // android.telephony.TelephonyManager.CellInfoCallback
        public void onError(int i, Throwable th) {
            if (th != null) {
                th.printStackTrace();
            }
            if (com.baidu.location.f.b.a.c && com.baidu.location.f.b.a.d) {
                g.i().a("cell onError = " + i);
            }
        }
    }

    private class b extends TelephonyManager.CellInfoCallback {
        private b() {
        }

        @Override // android.telephony.TelephonyManager.CellInfoCallback
        public void onCellInfo(List<CellInfo> list) {
            if (com.baidu.location.f.b.a.c && com.baidu.location.f.b.a.d) {
                g.i().a("onCellInfo");
            }
            if (list == null) {
                return;
            }
            if (!com.baidu.location.f.b.a.d || g.i().a(list)) {
                if (com.baidu.location.f.b.a.c && com.baidu.location.f.b.a.d) {
                    g.i().a("request sim1 cellInfo");
                }
                if (a.this.C) {
                    a.this.D = !r3.D;
                }
                if (!a.this.C || a.this.D) {
                    a.this.j();
                }
            }
        }
    }

    private class c extends TelephonyManager.CellInfoCallback {
        private c() {
        }

        @Override // android.telephony.TelephonyManager.CellInfoCallback
        public void onCellInfo(List<CellInfo> list) {
            if (list == null) {
                return;
            }
            if (!com.baidu.location.f.b.a.d || g.i().a(list)) {
                if (com.baidu.location.f.b.a.c && com.baidu.location.f.b.a.d) {
                    g.i().a("request sim2 cellInfo");
                }
                if (a.this.C) {
                    a.this.D = !r2.D;
                }
                if (!a.this.C || a.this.D) {
                    a.this.j();
                }
            }
        }
    }

    private class d extends PhoneStateListener {
        public d() {
        }

        @Override // android.telephony.PhoneStateListener
        public void onCellInfoChanged(List<CellInfo> list) {
            if (list == null) {
                return;
            }
            a.this.F.post(new Runnable() { // from class: com.baidu.location.f.a.a.d.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (com.baidu.location.f.b.a.c && com.baidu.location.f.b.a.d) {
                            g.i().a("cell received cellinfo change");
                        }
                        a.this.g();
                    } catch (Exception e) {
                        if (com.baidu.location.f.b.a.c) {
                            e.printStackTrace();
                        }
                    }
                }
            });
        }

        @Override // android.telephony.PhoneStateListener
        public void onSignalStrengthsChanged(SignalStrength signalStrength) {
            com.baidu.location.f.a aVar;
            int cdmaDbm;
            if (a.this.o != null) {
                if (a.this.o.i != 'g') {
                    if (a.this.o.i == 'c') {
                        aVar = a.this.o;
                        cdmaDbm = signalStrength.getCdmaDbm();
                    }
                    if (com.baidu.location.f.b.a.c || !com.baidu.location.f.b.a.d) {
                    }
                    g.i().a("cell strength===== cell singal strength changed : " + a.this.o.h);
                    return;
                }
                aVar = a.this.o;
                cdmaDbm = signalStrength.getGsmSignalStrength();
                aVar.h = cdmaDbm;
                if (com.baidu.location.f.b.a.c) {
                }
            }
        }
    }

    private static class e {

        /* renamed from: a, reason: collision with root package name */
        private static a f7656a = new a();
    }

    private static int a(CellIdentityNr cellIdentityNr) {
        try {
            int a2 = com.baidu.location.f.b.b.a(cellIdentityNr, "getHwTac");
            if (c && d) {
                g.i().a(" get hw tac = " + a2);
            }
            return a2;
        } catch (Throwable th) {
            if (!c || !d) {
                return -1;
            }
            g.i().a(" get hw tac exception !" + th);
            return -1;
        }
    }

    private int a(String str) {
        if (str == null || !str.contains("cl_s2")) {
            return -1;
        }
        try {
            Matcher matcher = Pattern.compile("cl_s2=[0-9]{1,}").matcher(str);
            if (!matcher.find()) {
                return -1;
            }
            String group = matcher.group();
            return Integer.parseInt(group.substring(group.indexOf("cl_s2=") + 6, group.length()));
        } catch (Exception e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    public static a a() {
        return e.f7656a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0085, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 28) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0087, code lost:
    
        r12.j = r25.getCellConnectionStatus();
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0179, code lost:
    
        if (r0 < 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x01f8, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 28) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x05aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.baidu.location.f.a a(android.telephony.CellInfo r25, com.baidu.location.f.a r26, android.telephony.TelephonyManager r27) {
        /*
            Method dump skipped, instructions count: 1575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.location.f.a.a.a(android.telephony.CellInfo, com.baidu.location.f.a, android.telephony.TelephonyManager):com.baidu.location.f.a");
    }

    private com.baidu.location.f.a a(CellLocation cellLocation) {
        return a(cellLocation, false);
    }

    private com.baidu.location.f.a a(CellLocation cellLocation, boolean z) {
        int i;
        if (cellLocation == null || this.k == null) {
            return null;
        }
        if (c && d) {
            g.i().a("set cell info..");
        }
        com.baidu.location.f.a aVar = new com.baidu.location.f.a();
        aVar.m = 1;
        if (z) {
            aVar.f7647q = true;
        }
        aVar.g = System.currentTimeMillis();
        try {
            String networkOperator = this.k.getNetworkOperator();
            if (networkOperator != null && networkOperator.length() > 0) {
                if (networkOperator.length() >= 3) {
                    i = Integer.valueOf(networkOperator.substring(0, 3)).intValue();
                    aVar.c = i < 0 ? this.o.c : i;
                } else {
                    i = -1;
                }
                String substring = networkOperator.substring(3);
                if (substring != null) {
                    char[] charArray = substring.toCharArray();
                    int i2 = 0;
                    while (i2 < charArray.length && Character.isDigit(charArray[i2])) {
                        i2++;
                    }
                    i = Integer.valueOf(substring.substring(0, i2)).intValue();
                }
                if (i < 0) {
                    i = this.o.d;
                }
                aVar.d = i;
            }
            this.f7648a = this.k.getSimState();
            if (c && d) {
                g.i().a("sim state:" + this.f7648a);
            }
        } catch (Exception e2) {
            if (c) {
                e2.printStackTrace();
            }
            b = 1;
        }
        if (cellLocation instanceof GsmCellLocation) {
            aVar.f7646a = ((GsmCellLocation) cellLocation).getLac();
            aVar.b = r9.getCid();
            aVar.i = 'g';
            if (c && d) {
                g.i().a("bslocation mNetworkType = 'g'");
            }
        } else if (cellLocation instanceof CdmaCellLocation) {
            aVar.i = 'c';
            if (c && d) {
                g.i().a("bslocation mNetworkType = 'c'");
            }
            if (w == null) {
                try {
                    w = Class.forName("android.telephony.cdma.CdmaCellLocation");
                } catch (Exception unused) {
                    w = null;
                    return aVar;
                }
            }
            Class<?> cls = w;
            if (cls != null && cls.isInstance(cellLocation)) {
                try {
                    int systemId = ((CdmaCellLocation) cellLocation).getSystemId();
                    if (systemId < 0) {
                        systemId = this.o.d;
                    }
                    aVar.d = systemId;
                    aVar.b = ((CdmaCellLocation) cellLocation).getBaseStationId();
                    aVar.f7646a = ((CdmaCellLocation) cellLocation).getNetworkId();
                    int baseStationLatitude = ((CdmaCellLocation) cellLocation).getBaseStationLatitude();
                    if (c && d) {
                        g.i().a("bslocation lat " + (baseStationLatitude / 14400.0d));
                    }
                    if (baseStationLatitude < Integer.MAX_VALUE) {
                        aVar.e = baseStationLatitude;
                    }
                    int baseStationLongitude = ((CdmaCellLocation) cellLocation).getBaseStationLongitude();
                    if (c && d) {
                        g.i().a("bslocation lon" + (baseStationLongitude / 14400.0d));
                    }
                    if (baseStationLongitude < Integer.MAX_VALUE) {
                        aVar.f = baseStationLongitude;
                    }
                } catch (Exception e3) {
                    if (c) {
                        e3.printStackTrace();
                    }
                    b = 3;
                    return aVar;
                }
            }
        }
        g(aVar);
        return aVar;
    }

    private synchronized List<com.baidu.location.f.a> a(TelephonyManager telephonyManager, com.baidu.location.f.a aVar) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.J > this.M.get()) {
            ArrayList arrayList = new ArrayList();
            try {
                this.f7648a = telephonyManager.getSimState();
                List<CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
                if (allCellInfo != null && !allCellInfo.isEmpty()) {
                    Iterator<CellInfo> it = allCellInfo.iterator();
                    while (it.hasNext()) {
                        com.baidu.location.f.a a2 = a(it.next(), aVar, telephonyManager);
                        if (a2 != null) {
                            arrayList.add(a2);
                        }
                    }
                }
                this.L = allCellInfo;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            this.J = currentTimeMillis;
            this.K = arrayList;
        }
        return this.K;
    }

    private static int b(String str) {
        if (str == null || !str.contains("mNrTac")) {
            return -1;
        }
        Matcher matcher = Pattern.compile("mNrTac=(.+?)\\}").matcher(str.replace(" ", ""));
        while (true) {
            int i = -1;
            while (matcher.find()) {
                if (matcher.groupCount() >= 1) {
                    String group = matcher.group(1);
                    if (c && d) {
                        g.i().a(" pasrse mnrtac = " + group);
                    }
                    try {
                        i = Integer.parseInt(group);
                    } catch (Throwable th) {
                        if (c) {
                            th.printStackTrace();
                        }
                    }
                }
            }
            return i;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String d(com.baidu.location.f.a r13) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.location.f.a.a.d(com.baidu.location.f.a):java.lang.String");
    }

    private static int e(int i) {
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i;
    }

    private String e(com.baidu.location.f.a aVar) {
        StringBuffer stringBuffer = new StringBuffer(128);
        stringBuffer.append("&nw2=");
        stringBuffer.append(aVar.i);
        stringBuffer.append(String.format(Locale.CHINA, "&cl2=%d|%d|%d|%d&cl_s2=%d&clp2=%d&cl_t2=%d", Integer.valueOf(aVar.c), Integer.valueOf(aVar.d), Integer.valueOf(aVar.f7646a), Long.valueOf(aVar.b), Integer.valueOf(aVar.h), Integer.valueOf(aVar.l), Long.valueOf(aVar.g)));
        if (aVar.j != Integer.MAX_VALUE) {
            stringBuffer.append("&cl_cs2=");
            stringBuffer.append(aVar.j);
        }
        if (aVar.p != null) {
            stringBuffer.append("&clnrs2=");
            stringBuffer.append(aVar.p);
        }
        return stringBuffer.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0115, code lost:
    
        if (r1 == false) goto L4;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b4 A[Catch: Exception -> 0x010d, TryCatch #0 {Exception -> 0x010d, blocks: (B:29:0x0012, B:31:0x0016, B:32:0x0022, B:34:0x0032, B:36:0x0035, B:38:0x003b, B:40:0x003e, B:41:0x0040, B:43:0x0046, B:45:0x004c, B:46:0x0051, B:48:0x0055, B:50:0x0059, B:51:0x008f, B:53:0x0096, B:55:0x009a, B:56:0x00a0, B:57:0x00b0, B:59:0x00b4, B:60:0x00bb, B:62:0x00bf, B:64:0x00c3, B:65:0x00cc, B:67:0x00d2, B:69:0x00d6, B:70:0x00dc, B:71:0x00ec, B:73:0x00f0, B:74:0x00f7, B:76:0x00fb, B:78:0x00ff, B:79:0x0108, B:82:0x00df, B:84:0x00e3, B:85:0x0106, B:86:0x00a3, B:88:0x00a7, B:89:0x00ca, B:90:0x004f), top: B:28:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f0 A[Catch: Exception -> 0x010d, TryCatch #0 {Exception -> 0x010d, blocks: (B:29:0x0012, B:31:0x0016, B:32:0x0022, B:34:0x0032, B:36:0x0035, B:38:0x003b, B:40:0x003e, B:41:0x0040, B:43:0x0046, B:45:0x004c, B:46:0x0051, B:48:0x0055, B:50:0x0059, B:51:0x008f, B:53:0x0096, B:55:0x009a, B:56:0x00a0, B:57:0x00b0, B:59:0x00b4, B:60:0x00bb, B:62:0x00bf, B:64:0x00c3, B:65:0x00cc, B:67:0x00d2, B:69:0x00d6, B:70:0x00dc, B:71:0x00ec, B:73:0x00f0, B:74:0x00f7, B:76:0x00fb, B:78:0x00ff, B:79:0x0108, B:82:0x00df, B:84:0x00e3, B:85:0x0106, B:86:0x00a3, B:88:0x00a7, B:89:0x00ca, B:90:0x004f), top: B:28:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void e() {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.location.f.a.a.e():void");
    }

    private String f(com.baidu.location.f.a aVar) {
        return String.format(Locale.CHINA, "%d|%d|%d|%d", Integer.valueOf(aVar.c), Integer.valueOf(aVar.d), Integer.valueOf(aVar.f7646a), Long.valueOf(aVar.b));
    }

    private void f() {
        if (this.t == null) {
            this.t = new C0347a();
        }
        Executor executor = this.r;
        if (executor != null) {
            this.k.requestCellInfoUpdate(executor, this.t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x003d, code lost:
    
        if (android.os.Build.VERSION.SDK_INT <= r6.f) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void g() {
        /*
            r6 = this;
            java.lang.String r0 = " old cell api = "
            java.lang.String r1 = "new cell api = "
            monitor-enter(r6)
            com.baidu.location.f.a r2 = r6.o     // Catch: java.lang.Throwable -> L9b
            android.telephony.TelephonyManager r3 = r6.k     // Catch: java.lang.Throwable -> L9b
            com.baidu.location.f.a r2 = r6.a(r2, r3)     // Catch: java.lang.Throwable -> L9b
            boolean r3 = com.baidu.location.f.a.a.c     // Catch: java.lang.Throwable -> L9b
            if (r3 == 0) goto L2f
            boolean r3 = com.baidu.location.f.a.a.d     // Catch: java.lang.Throwable -> L9b
            if (r3 == 0) goto L2f
            if (r2 == 0) goto L2f
            com.baidu.location.f.e r3 = com.baidu.location.f.g.i()     // Catch: java.lang.Throwable -> L9b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9b
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r1 = r6.f(r2)     // Catch: java.lang.Throwable -> L9b
            java.lang.StringBuilder r1 = r4.append(r1)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L9b
            r3.a(r1)     // Catch: java.lang.Throwable -> L9b
        L2f:
            if (r2 == 0) goto L34
            r6.g(r2)     // Catch: java.lang.Throwable -> L9b
        L34:
            int r1 = r6.f     // Catch: java.lang.Throwable -> L9b
            if (r1 >= 0) goto L39
            goto L3f
        L39:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L9b
            int r3 = r6.f     // Catch: java.lang.Throwable -> L9b
            if (r1 > r3) goto L99
        L3f:
            if (r2 == 0) goto L47
            boolean r1 = r2.b()     // Catch: java.lang.Throwable -> L9b
            if (r1 != 0) goto L99
        L47:
            r1 = 0
            android.telephony.CellLocation r2 = r6.N     // Catch: java.lang.Throwable -> L6d
            if (r2 == 0) goto L5e
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L6d
            long r4 = r6.O     // Catch: java.lang.Throwable -> L6d
            long r2 = r2 - r4
            java.util.concurrent.atomic.AtomicInteger r4 = r6.M     // Catch: java.lang.Throwable -> L6d
            int r4 = r4.get()     // Catch: java.lang.Throwable -> L6d
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L6d
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L6f
        L5e:
            android.telephony.TelephonyManager r2 = r6.k     // Catch: java.lang.Throwable -> L6d
            android.telephony.CellLocation r2 = r2.getCellLocation()     // Catch: java.lang.Throwable -> L6d
            r6.N = r2     // Catch: java.lang.Throwable -> L6d
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L6d
            r6.O = r2     // Catch: java.lang.Throwable -> L6d
            goto L6f
        L6d:
            r6.N = r1     // Catch: java.lang.Throwable -> L9b
        L6f:
            android.telephony.CellLocation r2 = r6.N     // Catch: java.lang.Throwable -> L9b
            if (r2 == 0) goto L77
            com.baidu.location.f.a r1 = r6.a(r2)     // Catch: java.lang.Throwable -> L9b
        L77:
            boolean r2 = com.baidu.location.f.a.a.c     // Catch: java.lang.Throwable -> L9b
            if (r2 == 0) goto L99
            boolean r2 = com.baidu.location.f.a.a.d     // Catch: java.lang.Throwable -> L9b
            if (r2 == 0) goto L99
            if (r1 == 0) goto L99
            com.baidu.location.f.e r2 = com.baidu.location.f.g.i()     // Catch: java.lang.Throwable -> L9b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9b
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r0 = r6.f(r1)     // Catch: java.lang.Throwable -> L9b
            java.lang.StringBuilder r0 = r3.append(r0)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L9b
            r2.a(r0)     // Catch: java.lang.Throwable -> L9b
        L99:
            monitor-exit(r6)
            return
        L9b:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L9b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.location.f.a.a.g():void");
    }

    private void g(com.baidu.location.f.a aVar) {
        com.baidu.location.f.a aVar2;
        com.baidu.location.f.a aVar3 = this.o;
        if (aVar.b() && ((aVar2 = this.o) == null || !aVar2.a(aVar) || a(this.o, aVar))) {
            this.o = aVar;
        }
        if (aVar.b()) {
            if (aVar3 == null || !aVar3.a(aVar)) {
                if (!aVar.b()) {
                    List<com.baidu.location.f.a> list = this.f7649q;
                    if (list != null) {
                        list.clear();
                        return;
                    }
                    return;
                }
                int size = this.f7649q.size();
                com.baidu.location.f.a aVar4 = size == 0 ? null : this.f7649q.get(size - 1);
                if (aVar4 != null && aVar4.b == this.o.b && aVar4.f7646a == this.o.f7646a) {
                    return;
                }
                this.f7649q.add(this.o);
                if (this.f7649q.size() > 3) {
                    this.f7649q.remove(0);
                }
                if (this.j) {
                    i();
                }
                this.E = false;
            }
        }
    }

    private void h() {
        long j;
        com.baidu.location.f.e i;
        String str;
        String a2 = com.baidu.location.f.b.b.a(this.x);
        if (a2 == null) {
            return;
        }
        File file = new File(a2 + File.separator + "lcvif2.dat");
        if (file.exists()) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                long j2 = 0;
                randomAccessFile.seek(0L);
                long readLong = randomAccessFile.readLong();
                if (System.currentTimeMillis() - readLong > 60000) {
                    if (c && d) {
                        g.i().a("cellbuffer System.currentTimeMillis() - time > 1 *60 *1000" + readLong);
                    }
                    randomAccessFile.close();
                    file.delete();
                    return;
                }
                randomAccessFile.readInt();
                int i2 = 0;
                while (i2 < 3) {
                    long readLong2 = randomAccessFile.readLong();
                    int readInt = randomAccessFile.readInt();
                    int readInt2 = randomAccessFile.readInt();
                    int readInt3 = randomAccessFile.readInt();
                    long readLong3 = randomAccessFile.readLong();
                    int readInt4 = randomAccessFile.readInt();
                    if (c && d) {
                        j = j2;
                        g.i().a("cellbuffer cell info = " + readLong2 + " " + readInt + " " + readInt2 + " " + readInt3 + " " + readLong3 + " " + readInt4);
                    } else {
                        j = j2;
                    }
                    char c2 = readInt4 == 1 ? 'g' : (char) 0;
                    if (readInt4 == 2) {
                        c2 = 'c';
                    }
                    char c3 = c2;
                    if (readLong2 == j) {
                        if (c && d) {
                            i = g.i();
                            str = "loc cell time1 == 0";
                            i.a(str);
                        }
                        i2++;
                        j2 = j;
                    } else {
                        com.baidu.location.f.a aVar = new com.baidu.location.f.a(readInt3, readLong3, readInt, readInt2, 0, c3, -1);
                        aVar.g = readLong2;
                        if (aVar.b()) {
                            this.E = true;
                            this.f7649q.add(aVar);
                        }
                        if (c && d) {
                            i = g.i();
                            str = "loc cell " + b(aVar);
                            i.a(str);
                        }
                        i2++;
                        j2 = j;
                    }
                }
                randomAccessFile.close();
            } catch (Exception e2) {
                if (c) {
                    e2.printStackTrace();
                }
                file.delete();
            }
        }
    }

    private void i() {
        List<com.baidu.location.f.a> list = this.f7649q;
        if (list == null && this.p == null) {
            if (c && d) {
                g.i().a("cellbuffer mTrackList == null");
                return;
            }
            return;
        }
        if (list == null && this.p != null) {
            LinkedList linkedList = new LinkedList();
            this.f7649q = linkedList;
            linkedList.add(this.p);
        }
        String a2 = com.baidu.location.f.b.b.a(this.x);
        if (a2 == null || this.f7649q == null) {
            return;
        }
        File file = new File(a2 + File.separator + "lcvif2.dat");
        int size = this.f7649q.size();
        try {
            if (file.exists()) {
                file.delete();
            }
            file.createNewFile();
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            randomAccessFile.seek(0L);
            randomAccessFile.writeLong(this.f7649q.get(size - 1).g);
            randomAccessFile.writeInt(size);
            for (int i = 0; i < 3 - size; i++) {
                randomAccessFile.writeLong(0L);
                randomAccessFile.writeInt(-1);
                randomAccessFile.writeInt(-1);
                randomAccessFile.writeInt(-1);
                randomAccessFile.writeLong(-1L);
                randomAccessFile.writeInt(2);
            }
            for (int i2 = 0; i2 < size; i2++) {
                randomAccessFile.writeLong(this.f7649q.get(i2).g);
                randomAccessFile.writeInt(this.f7649q.get(i2).c);
                randomAccessFile.writeInt(this.f7649q.get(i2).d);
                randomAccessFile.writeInt(this.f7649q.get(i2).f7646a);
                randomAccessFile.writeLong(this.f7649q.get(i2).b);
                if (this.f7649q.get(i2).i == 'g') {
                    randomAccessFile.writeInt(1);
                } else if (this.f7649q.get(i2).i == 'c') {
                    randomAccessFile.writeInt(2);
                } else {
                    randomAccessFile.writeInt(3);
                }
            }
            randomAccessFile.close();
        } catch (Exception e2) {
            if (c) {
                e2.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.F.post(new Runnable() { // from class: com.baidu.location.f.a.a.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    a.this.g();
                    synchronized (a.this.I) {
                        a.this.I.notifyAll();
                        if (com.baidu.location.f.b.a.c && com.baidu.location.f.b.a.d) {
                            g.i().a("update mCellInfo completed");
                        }
                    }
                } catch (Exception e2) {
                    if (com.baidu.location.f.b.a.c && com.baidu.location.f.b.a.d) {
                        g.i().a("handleCellInfo error = " + e2);
                    }
                }
            }
        });
    }

    public com.baidu.location.f.a a(com.baidu.location.f.a aVar, TelephonyManager telephonyManager) {
        if (Integer.valueOf(Build.VERSION.SDK_INT).intValue() >= 17) {
            try {
                List<com.baidu.location.f.a> a2 = a(telephonyManager, aVar);
                if (a2 != null && !a2.isEmpty()) {
                    com.baidu.location.f.a aVar2 = null;
                    for (com.baidu.location.f.a aVar3 : a2) {
                        if (aVar3.k) {
                            boolean z = aVar2 != null;
                            if (aVar3.b()) {
                                if (c && d) {
                                    g.i().a(" cell res.isValid() = " + f(aVar3));
                                }
                                if (z && aVar2 != null) {
                                    aVar2.n = e(aVar3);
                                    aVar2.o = f(aVar3);
                                }
                            } else {
                                if (c && d) {
                                    g.i().a("res.isValid()");
                                }
                                aVar3 = null;
                            }
                            if (aVar2 == null) {
                                aVar2 = aVar3;
                            }
                        }
                    }
                    return aVar2;
                }
                if (c && d) {
                    g.i().a("getAllCellInfo=null");
                }
            } catch (Throwable th) {
                if (c) {
                    th.printStackTrace();
                }
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if ("&nc=".equals(r5) == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String a(com.baidu.location.f.a r5) {
        /*
            r4 = this;
            java.lang.String r0 = "&nc="
            java.lang.String r1 = ""
            java.lang.String r5 = r4.d(r5)     // Catch: java.lang.Throwable -> L28
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L28
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L28
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L28
            if (r5 == 0) goto L21
            boolean r3 = r1.equals(r5)     // Catch: java.lang.Throwable -> L28
            if (r3 != 0) goto L21
            boolean r1 = r0.equals(r5)     // Catch: java.lang.Throwable -> L28
            if (r1 != 0) goto L21
            goto L25
        L21:
            r1 = 17
            if (r2 < r1) goto L26
        L25:
            return r5
        L26:
            r1 = r5
            goto L2c
        L28:
            r5 = move-exception
            r5.printStackTrace()
        L2c:
            if (r1 == 0) goto L36
            boolean r5 = r0.equals(r1)
            if (r5 == 0) goto L36
            r5 = 0
            return r5
        L36:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.location.f.a.a.a(com.baidu.location.f.a):java.lang.String");
    }

    public void a(int i) {
        this.g.set(i);
    }

    public void a(Context context) {
        if (this.y) {
            return;
        }
        this.x = context;
        this.k = (TelephonyManager) context.getSystemService("phone");
        this.f7649q = new LinkedList();
        if (Looper.myLooper() != null) {
            this.s = new d();
        }
        if (this.F == null) {
            this.F = new Handler(Looper.getMainLooper());
        }
        if (this.j) {
            h();
        }
        if (Build.VERSION.SDK_INT >= this.e) {
            if (this.r == null) {
                this.r = this.x.getMainExecutor();
            }
            this.z = com.baidu.location.f.b.b.a("android.telephony.TelephonyManager$CellInfoCallback");
            if (c && d) {
                g.i().a("isCellinfoCallbackExist = " + this.z);
            }
        }
        if (this.k == null || this.s == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < this.e || !this.z) {
            try {
                this.k.listen(this.s, 1280);
            } catch (Exception unused) {
            }
        }
        if (c && d) {
            g.i().a("cell manager start...");
        }
        this.y = true;
    }

    public void a(boolean z) {
        this.i = z;
    }

    public boolean a(com.baidu.location.f.a aVar, com.baidu.location.f.a aVar2) {
        boolean z;
        if (aVar == null && aVar2 == null) {
            return false;
        }
        if (aVar != null && aVar2 != null) {
            float abs = Math.abs(aVar.h - aVar2.h) / (aVar.h != 0 ? aVar.h : -1);
            if (c && d) {
                g.i().a("cl-cache, str, old:" + aVar.h + " new:" + aVar2.h);
                g.i().a("cl-cache, str, diffRate:" + abs);
            }
            if (aVar.n != null && aVar2.n != null) {
                if (Math.abs(Math.abs(r8 - a(aVar2.n)) / (a(aVar.n) != 0 ? r8 : -1)) > this.h) {
                    z = true;
                    if (c && d) {
                        g.i().a("cl-cache, isStrengthChange2:" + z);
                    }
                    if (abs > this.h && !z) {
                        return false;
                    }
                }
            }
            z = false;
            if (c) {
                g.i().a("cl-cache, isStrengthChange2:" + z);
            }
            if (abs > this.h) {
            }
        }
        return true;
    }

    public com.baidu.location.f.a b(com.baidu.location.f.a aVar, TelephonyManager telephonyManager) {
        CellLocation cellLocation;
        com.baidu.location.f.a a2 = a(aVar, telephonyManager);
        if (Build.VERSION.SDK_INT <= 29 && (a2 == null || !a2.b())) {
            try {
                cellLocation = telephonyManager.getCellLocation();
            } catch (Throwable unused) {
                cellLocation = null;
            }
            if (cellLocation != null) {
                a2 = a(cellLocation);
            }
            if (c && d && a2 != null) {
                g.i().a("main process: old cell api = " + f(a2));
            }
        }
        return a2;
    }

    public String b(com.baidu.location.f.a aVar) {
        if (aVar == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer(128);
        stringBuffer.append("&nw=");
        stringBuffer.append(aVar.i);
        stringBuffer.append(String.format(Locale.CHINA, "&cl=%d|%d|%d|%d&cl_s=%d", Integer.valueOf(aVar.c), Integer.valueOf(aVar.d), Integer.valueOf(aVar.f7646a), Long.valueOf(aVar.b), Integer.valueOf(aVar.h)));
        if (aVar.e < Integer.MAX_VALUE && aVar.f < Integer.MAX_VALUE) {
            stringBuffer.append(String.format(Locale.CHINA, "&cdmall=%.6f|%.6f", Double.valueOf(aVar.f / 14400.0d), Double.valueOf(aVar.e / 14400.0d)));
        }
        stringBuffer.append("&cl_t=");
        stringBuffer.append(aVar.g);
        stringBuffer.append("&cl_api=");
        stringBuffer.append(aVar.m);
        stringBuffer.append("&clp=");
        stringBuffer.append(aVar.l);
        if (aVar.p != null) {
            stringBuffer.append("&clnrs=");
            stringBuffer.append(aVar.p);
        }
        if (Build.VERSION.SDK_INT >= 28 && aVar.j != Integer.MAX_VALUE) {
            stringBuffer.append("&cl_cs=");
            stringBuffer.append(aVar.j);
        }
        try {
            List<com.baidu.location.f.a> list = this.f7649q;
            if (list != null && list.size() > 0) {
                int size = this.f7649q.size();
                stringBuffer.append("&clt=");
                for (int i = 0; i < size; i++) {
                    com.baidu.location.f.a aVar2 = this.f7649q.get(i);
                    if (aVar2 != null) {
                        if (aVar2.c != aVar.c) {
                            stringBuffer.append(aVar2.c);
                        }
                        stringBuffer.append("|");
                        if (aVar2.d != aVar.d) {
                            stringBuffer.append(aVar2.d);
                        }
                        stringBuffer.append("|");
                        if (aVar2.f7646a != aVar.f7646a) {
                            stringBuffer.append(aVar2.f7646a);
                        }
                        stringBuffer.append("|");
                        if (aVar2.b != aVar.b) {
                            stringBuffer.append(aVar2.b);
                        }
                        stringBuffer.append("|");
                        stringBuffer.append((System.currentTimeMillis() - aVar2.g) / 1000);
                        stringBuffer.append(";");
                    }
                }
            }
        } catch (Exception e2) {
            if (c) {
                e2.printStackTrace();
            }
        }
        if (this.f7648a > 100) {
            this.f7648a = 0;
        }
        int i2 = this.f7648a + (b << 8);
        if (c && d) {
            g.i().a("sim state:" + this.f7648a + "," + i2);
        }
        stringBuffer.append("&cs=" + i2);
        if (aVar.n != null) {
            stringBuffer.append(aVar.n);
        }
        if (c && d) {
            g.i().a("cell sb.toString() = " + stringBuffer.toString());
        }
        return stringBuffer.toString();
    }

    public void b() {
        TelephonyManager telephonyManager;
        if (this.y) {
            try {
                d dVar = this.s;
                if (dVar != null && (telephonyManager = this.k) != null) {
                    telephonyManager.listen(dVar, 0);
                }
                this.s = null;
                this.k = null;
                this.l = null;
                this.m = null;
                List<com.baidu.location.f.a> list = this.f7649q;
                if (list != null) {
                    list.clear();
                    this.f7649q = null;
                }
                if (this.j) {
                    i();
                }
            } catch (Exception e2) {
                if (c) {
                    e2.printStackTrace();
                }
            }
            if (c && d) {
                g.i().a("cell manager stop ...");
            }
            this.y = false;
        }
    }

    public void b(int i) {
        this.e = i;
    }

    public void b(boolean z) {
        this.j = z;
    }

    public HashSet<String> c(com.baidu.location.f.a aVar) {
        HashSet<String> hashSet = new HashSet<>();
        try {
            List<com.baidu.location.f.a> a2 = a(this.k, this.o);
            if (a2 != null && !a2.isEmpty()) {
                for (com.baidu.location.f.a aVar2 : a2) {
                    if (!aVar2.k && aVar2 != null) {
                        String str = "";
                        if (aVar2.f7646a != -1 && aVar2.b != -1) {
                            str = (aVar.f7646a != aVar2.f7646a ? new StringBuilder().append(aVar2.f7646a).append("|").append(aVar2.b) : new StringBuilder().append(aVar2.b).append("")).toString();
                        }
                        hashSet.add(str);
                    }
                }
            } else if (c) {
                Log.d("getAllCellInfo", "=null");
                return hashSet;
            }
        } catch (Exception | NoSuchMethodError e2) {
            e2.printStackTrace();
        }
        return hashSet;
    }

    public void c(int i) {
        this.M.set(i);
    }

    public boolean c() {
        return this.E;
    }

    public com.baidu.location.f.a d(int i) {
        if (this.k != null) {
            try {
                g();
                if (c && d) {
                    g.i().a(" lastDiffTime = " + this.B + ", diffTime = " + i);
                }
                if (Build.VERSION.SDK_INT >= 29 && this.z) {
                    if (i < Integer.MAX_VALUE) {
                        long j = i;
                        if (j == this.B) {
                            if (System.currentTimeMillis() - this.A > j) {
                                if (c && d) {
                                    g.i().a(" over diff time");
                                }
                            }
                        } else if (c && d) {
                            g.i().a("diff time is changed");
                        }
                        e();
                    }
                    this.B = i;
                }
            } catch (Exception e2) {
                if (c) {
                    e2.printStackTrace();
                }
            }
        }
        com.baidu.location.f.a aVar = this.o;
        if (aVar != null && aVar.e()) {
            this.p = null;
            this.p = new com.baidu.location.f.a(this.o);
        }
        com.baidu.location.f.a aVar2 = this.o;
        if (aVar2 != null && aVar2.d() && this.p != null && this.o.i == 'g') {
            this.o.d = this.p.d;
            this.o.c = this.p.c;
        }
        return this.o;
    }

    public synchronized List<CellInfo> d() {
        return this.L;
    }
}
