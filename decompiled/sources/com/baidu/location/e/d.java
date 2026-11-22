package com.baidu.location.e;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import com.baidu.location.BDLocation;
import com.baidu.location.f.k;
import com.baidu.location.h.i;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes13.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    static final String f7633a = "http://ofloc.map.baidu.com/offline_loc";
    private static Context b;
    private static volatile d c;
    private static Object d = new Object();
    private final File e;
    private final f f;
    private final com.baidu.location.e.b g;
    private final g h;
    private final com.baidu.location.e.c i;
    private ExecutorService j = null;

    public enum a {
        NEED_TO_LOG,
        NO_NEED_TO_LOG
    }

    public enum b {
        IS_MIX_MODE,
        IS_NOT_MIX_MODE
    }

    private enum c {
        NETWORK_UNKNOWN,
        NETWORK_WIFI,
        NETWORK_2G,
        NETWORK_3G,
        NETWORK_4G
    }

    private d() {
        File file;
        File file2 = null;
        try {
            file = new File(b.getFilesDir(), "ofld");
        } catch (Exception unused) {
        }
        try {
            if (!file.exists()) {
                file.mkdir();
            }
        } catch (Exception unused2) {
            file2 = file;
            file = file2;
            this.e = file;
            com.baidu.location.e.b bVar = new com.baidu.location.e.b(this);
            this.g = bVar;
            this.f = new f(bVar.a());
            com.baidu.location.e.c cVar = new com.baidu.location.e.c(this, bVar.a());
            this.i = cVar;
            this.h = new g(this, bVar.a(), cVar.n());
        }
        this.e = file;
        com.baidu.location.e.b bVar2 = new com.baidu.location.e.b(this);
        this.g = bVar2;
        this.f = new f(bVar2.a());
        com.baidu.location.e.c cVar2 = new com.baidu.location.e.c(this, bVar2.a());
        this.i = cVar2;
        this.h = new g(this, bVar2.a(), cVar2.n());
    }

    private BDLocation a(final String[] strArr) {
        new BDLocation();
        if (this.j == null) {
            this.j = Executors.newSingleThreadExecutor();
        }
        FutureTask futureTask = (FutureTask) this.j.submit(new Callable<BDLocation>() { // from class: com.baidu.location.e.d.1
            /* JADX WARN: Can't wrap try/catch for region: R(8:3|(4:6|7|(1:10)(1:9)|4)|68|(8:42|43|44|45|(2:48|49)|47|(1:22)|23)(5:12|13|14|16|17)|25|26|(2:20|22)|23) */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x007b, code lost:
            
                if (r1 != null) goto L57;
             */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x0089, code lost:
            
                if (r1 == null) goto L43;
             */
            /* JADX WARN: Code restructure failed: missing block: B:54:0x0060, code lost:
            
                if (r1 == null) goto L43;
             */
            @Override // java.util.concurrent.Callable
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public com.baidu.location.BDLocation call() {
                /*
                    r11 = this;
                    com.baidu.location.BDLocation r0 = new com.baidu.location.BDLocation
                    r0.<init>()
                    java.lang.String[] r1 = r2
                    int r1 = r1.length
                    if (r1 <= 0) goto L9c
                    com.baidu.location.e.d r0 = com.baidu.location.e.d.this
                    com.baidu.location.e.c r0 = com.baidu.location.e.d.a(r0)
                    java.lang.String[] r0 = r0.o()
                    r1 = 0
                    r2 = 0
                    r3 = r1
                    r4 = r2
                L18:
                    int r5 = r0.length
                    if (r3 >= r5) goto L31
                    android.content.Context r4 = com.baidu.location.e.d.p()     // Catch: java.lang.Exception -> L2a
                    android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch: java.lang.Exception -> L2a
                    r5 = r0[r3]     // Catch: java.lang.Exception -> L2a
                    android.content.pm.ProviderInfo r4 = r4.resolveContentProvider(r5, r1)     // Catch: java.lang.Exception -> L2a
                    goto L2b
                L2a:
                    r4 = r2
                L2b:
                    if (r4 == 0) goto L2e
                    goto L31
                L2e:
                    int r3 = r3 + 1
                    goto L18
                L31:
                    if (r4 == 0) goto L66
                    android.content.Context r0 = com.baidu.location.e.d.p()     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5f
                    android.content.ContentResolver r5 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5f
                    java.lang.String r0 = r4.authority     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5f
                    android.net.Uri r6 = com.baidu.location.e.d.b(r0)     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5f
                    java.lang.String[] r7 = r2     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5f
                    r9 = 0
                    r10 = 0
                    r8 = 0
                    android.database.Cursor r1 = r5.query(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5f
                    com.baidu.location.BDLocation r0 = com.baidu.location.e.e.a(r1)     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L60
                    if (r1 == 0) goto L53
                    r1.close()     // Catch: java.lang.Exception -> L53
                L53:
                    r2 = r0
                    goto L8c
                L55:
                    r0 = move-exception
                    r2 = r1
                    goto L59
                L58:
                    r0 = move-exception
                L59:
                    if (r2 == 0) goto L5e
                    r2.close()     // Catch: java.lang.Exception -> L5e
                L5e:
                    throw r0
                L5f:
                    r1 = r2
                L60:
                    if (r1 == 0) goto L8c
                L62:
                    r1.close()     // Catch: java.lang.Exception -> L8c
                    goto L8c
                L66:
                    com.baidu.location.e.e$a r0 = new com.baidu.location.e.e$a
                    java.lang.String[] r1 = r2
                    r0.<init>(r1)
                    com.baidu.location.e.d r1 = com.baidu.location.e.d.this     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L88
                    com.baidu.location.e.b r1 = com.baidu.location.e.d.b(r1)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L88
                    android.database.Cursor r1 = r1.a(r0)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L88
                    com.baidu.location.BDLocation r2 = com.baidu.location.e.e.a(r1)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L89
                    if (r1 == 0) goto L8c
                    goto L62
                L7e:
                    r0 = move-exception
                    r2 = r1
                    goto L82
                L81:
                    r0 = move-exception
                L82:
                    if (r2 == 0) goto L87
                    r2.close()     // Catch: java.lang.Exception -> L87
                L87:
                    throw r0
                L88:
                    r1 = r2
                L89:
                    if (r1 == 0) goto L8c
                    goto L62
                L8c:
                    if (r2 == 0) goto L9b
                    int r0 = r2.getLocType()
                    r1 = 67
                    if (r0 == r1) goto L9b
                    r0 = 66
                    r2.setLocType(r0)
                L9b:
                    return r2
                L9c:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.baidu.location.e.d.AnonymousClass1.call():com.baidu.location.BDLocation");
            }
        });
        try {
            return (BDLocation) futureTask.get(2000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            futureTask.cancel(true);
            return null;
        }
    }

    public static d a() {
        d dVar;
        synchronized (d) {
            if (c == null) {
                if (b == null) {
                    a(com.baidu.location.f.getServiceContext());
                }
                c = new d();
            }
            c.q();
            dVar = c;
        }
        return dVar;
    }

    public static void a(Context context) {
        if (b == null) {
            b = context;
            com.baidu.location.h.b.a().a(b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Uri c(String str) {
        return Uri.parse(String.format("content://%s/", str));
    }

    private void q() {
        this.i.g();
    }

    private boolean r() {
        String packageName = b.getPackageName();
        ProviderInfo providerInfo = null;
        for (String str : this.i.o()) {
            try {
                providerInfo = b.getPackageManager().resolveContentProvider(str, 0);
            } catch (Exception unused) {
                providerInfo = null;
            }
            if (providerInfo != null) {
                break;
            }
        }
        return providerInfo == null || packageName.equals(providerInfo.packageName);
    }

    public long a(String str) {
        return this.i.a(str);
    }

    public BDLocation a(com.baidu.location.f.a aVar, k kVar, BDLocation bDLocation, b bVar, a aVar2) {
        String e;
        int i;
        if (bVar == b.IS_MIX_MODE) {
            int a2 = this.i.a();
            e = com.baidu.location.h.b.a().e() + "&mixMode=1";
            i = a2;
        } else {
            e = com.baidu.location.h.b.a().e();
            i = 0;
        }
        String[] a3 = e.a(aVar, kVar, bDLocation, e, (aVar2 == a.NEED_TO_LOG).booleanValue(), i);
        if (a3.length <= 0) {
            return null;
        }
        BDLocation a4 = a(a3);
        if (a4 != null) {
            a4.getLocType();
        }
        return a4;
    }

    public Context b() {
        return b;
    }

    File c() {
        return this.e;
    }

    public boolean d() {
        return this.i.h();
    }

    public boolean e() {
        return this.i.i();
    }

    public boolean f() {
        return this.i.j();
    }

    public boolean g() {
        return this.i.k();
    }

    public boolean h() {
        return this.i.m();
    }

    public void i() {
        if (i.b()) {
            return;
        }
        this.f.a();
    }

    f j() {
        return this.f;
    }

    g k() {
        return this.h;
    }

    com.baidu.location.e.c l() {
        return this.i;
    }

    public void m() {
        if (!r() || i.b()) {
            return;
        }
        this.g.b();
    }

    public void n() {
    }

    public double o() {
        NetworkInfo networkInfo;
        try {
            networkInfo = ((ConnectivityManager) b.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Throwable th) {
            th.printStackTrace();
            networkInfo = null;
        }
        c cVar = c.NETWORK_UNKNOWN;
        if (networkInfo != null && networkInfo.isConnected()) {
            if (networkInfo.getType() == 1) {
                cVar = c.NETWORK_WIFI;
            }
            if (networkInfo.getType() == 0) {
                int subtype = networkInfo.getSubtype();
                if (subtype == 1 || subtype == 2 || subtype == 4 || subtype == 7 || subtype == 11) {
                    cVar = c.NETWORK_2G;
                } else if (subtype == 3 || subtype == 5 || subtype == 6 || subtype == 8 || subtype == 9 || subtype == 10 || subtype == 12 || subtype == 14 || subtype == 15) {
                    cVar = c.NETWORK_3G;
                } else if (subtype == 13) {
                    cVar = c.NETWORK_4G;
                }
            }
        }
        if (cVar == c.NETWORK_UNKNOWN) {
            return this.i.b();
        }
        if (cVar == c.NETWORK_WIFI) {
            return this.i.c();
        }
        if (cVar == c.NETWORK_2G) {
            return this.i.d();
        }
        if (cVar == c.NETWORK_3G) {
            return this.i.e();
        }
        if (cVar == c.NETWORK_4G) {
            return this.i.f();
        }
        return 0.0d;
    }
}
