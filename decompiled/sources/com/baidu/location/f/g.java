package com.baidu.location.f;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.telephony.CellInfo;
import android.telephony.TelephonyManager;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes13.dex */
public class g {
    private static boolean d = false;
    private static e e;

    /* renamed from: a, reason: collision with root package name */
    private boolean f7683a = true;
    private boolean b = true;
    private boolean c = false;

    /* renamed from: com.baidu.location.f.g$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7684a;

        static {
            int[] iArr = new int[a.values().length];
            f7684a = iArr;
            try {
                iArr[a.ONLY_CELL_MODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7684a[a.ONLY_WIFI_MODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7684a[a.GET_ALL_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum a {
        ONLY_CELL_MODE,
        ONLY_WIFI_MODE,
        GET_ALL_DATA
    }

    public static boolean a() {
        return d;
    }

    public static e i() {
        return e;
    }

    public com.baidu.location.f.a a(com.baidu.location.f.a aVar, TelephonyManager telephonyManager) {
        return com.baidu.location.f.a.a.a().b(aVar, telephonyManager);
    }

    public String a(int i, boolean z, k kVar, int i2) {
        return com.baidu.location.f.a.b.a().a(i, z, kVar, i2);
    }

    public String a(WifiInfo wifiInfo, String str) {
        return com.baidu.location.f.a.b.a().a(wifiInfo, str);
    }

    public String a(com.baidu.location.f.a aVar) {
        return com.baidu.location.f.a.a.a().a(aVar);
    }

    public String a(k kVar, int i, String str, boolean z, int i2) {
        return com.baidu.location.f.a.b.a().a(kVar, i, str, z, i2);
    }

    public void a(int i) {
        if (i >= 0) {
            com.baidu.location.f.a.a.a().a(i);
        }
    }

    public void a(Context context, List<String> list) {
        if (this.f7683a) {
            com.baidu.location.f.a.a.a().a(context);
        }
        if (this.b) {
            com.baidu.location.f.a.b.a().a(context, list);
        }
        this.c = true;
    }

    public void a(e eVar) {
        e = eVar;
    }

    public void a(a aVar) {
        int i = AnonymousClass1.f7684a[aVar.ordinal()];
        if (i == 1) {
            this.f7683a = true;
            this.b = false;
        } else if (i == 2) {
            this.f7683a = false;
            this.b = true;
        } else {
            if (i != 3) {
                throw new IllegalArgumentException("Illegal this mode : " + aVar);
            }
            this.f7683a = true;
            this.b = true;
        }
    }

    public void a(boolean z) {
        com.baidu.location.f.a.a.a().a(z);
    }

    public boolean a(com.baidu.location.f.a aVar, com.baidu.location.f.a aVar2) {
        return com.baidu.location.f.a.a.a().a(aVar, aVar2);
    }

    public HashSet<String> b(com.baidu.location.f.a aVar) {
        return com.baidu.location.f.a.a.a().c(aVar);
    }

    public void b() {
        if (this.f7683a) {
            com.baidu.location.f.a.a.a().b();
        }
        if (this.b) {
            com.baidu.location.f.a.b.a().b();
        }
        this.c = false;
    }

    public void b(int i) {
        com.baidu.location.f.a.a.a().c(i);
    }

    public void b(boolean z) {
        com.baidu.location.f.a.a.a().b(z);
    }

    public long c() {
        return com.baidu.location.f.a.b.a().c();
    }

    public String c(com.baidu.location.f.a aVar) {
        return com.baidu.location.f.a.a.a().b(aVar);
    }

    public void c(int i) {
        if (i >= 0) {
            com.baidu.location.f.a.b.a().a(i);
        }
    }

    public List<CellInfo> d() {
        return com.baidu.location.f.a.a.a().d();
    }

    public void d(int i) {
        com.baidu.location.f.a.a.a().b(Math.max(i, 29));
    }

    public com.baidu.location.f.a e(int i) {
        if (this.c && this.f7683a) {
            return com.baidu.location.f.a.a.a().d(i);
        }
        return null;
    }

    public boolean e() {
        return com.baidu.location.f.a.a.a().c();
    }

    public k f(int i) {
        if (this.c && this.b) {
            return com.baidu.location.f.a.b.a().a(i);
        }
        return null;
    }

    public String f() {
        return com.baidu.location.f.a.b.a().e();
    }

    public WifiInfo g() {
        return com.baidu.location.f.a.b.a().f();
    }

    public k h() {
        return com.baidu.location.f.a.b.a().d();
    }
}
