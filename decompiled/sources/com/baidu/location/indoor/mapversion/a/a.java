package com.baidu.location.indoor.mapversion.a;

import com.baidu.location.BDLocation;
import com.baidu.location.indoor.d;
import com.baidu.location.indoor.g;
import com.baidu.location.indoor.mapversion.IndoorJni;
import com.baidu.location.indoor.mapversion.b.a;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes13.dex */
public class a {
    private static final Lock b = new ReentrantLock();

    /* renamed from: a, reason: collision with root package name */
    public static boolean f7788a = false;

    public static boolean a() {
        return IndoorJni.loadJniSuccess;
    }

    public static synchronized boolean a(String str) {
        synchronized (a.class) {
            if (!a()) {
                return false;
            }
            a.d b2 = com.baidu.location.indoor.mapversion.b.a.a().b(str);
            double[][] c = com.baidu.location.indoor.mapversion.b.a.a().c(str);
            if (b2 == null) {
                return false;
            }
            b2.a("gcj02");
            short[][] sArr = b2.h;
            double d = b2.a().f7791a;
            double d2 = b2.a().b;
            a.d c2 = com.baidu.location.indoor.mapversion.b.a.a().c();
            if (c2 == null) {
                return false;
            }
            double a2 = c2.a(-b2.a().d);
            double b3 = c2.b(-b2.a().f);
            Lock lock = b;
            lock.lock();
            try {
                IndoorJni.setPfRdnt(str, sArr, d, d2, (int) b2.g.g, (int) b2.g.h, a2, b3, b2.c);
                IndoorJni.setPfGeoMap(c, str, (int) b2.g.g, (int) b2.g.h);
                lock.unlock();
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                } finally {
                    b.unlock();
                }
            }
            return true;
        }
    }

    private static double[] a(double d, double d2, double d3, double d4, String str, String str2, long j, int i, String str3) {
        String str4 = str;
        double[] dArr = {-1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d};
        if (a()) {
            if (str4 == null || "".equals(str4)) {
                str4 = "unknow";
            }
            String str5 = str4;
            Lock lock = b;
            lock.lock();
            try {
                double[] pfBle = IndoorJni.setPfBle(d, d2, d3, d4, str5, str2, j, i, str3);
                lock.unlock();
                return pfBle;
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                } finally {
                    b.unlock();
                }
            }
        }
        return dArr;
    }

    public static synchronized double[] a(String str, double d, double d2, double d3, String str2) {
        synchronized (a.class) {
            if (!a()) {
                return null;
            }
            a.d c = com.baidu.location.indoor.mapversion.b.a.a().c();
            double[] dArr = {-1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d};
            if (c != null) {
                Lock lock = b;
                lock.lock();
                try {
                    dArr = IndoorJni.setPfDr(d2, d3, str2, System.currentTimeMillis());
                    lock.unlock();
                } catch (Throwable th) {
                    try {
                        th.printStackTrace();
                    } finally {
                        b.unlock();
                    }
                }
                if (dArr[0] == 0.0d) {
                    double c2 = c.c(dArr[1]);
                    double d4 = c.d(dArr[2]);
                    dArr[1] = c2;
                    dArr[2] = d4;
                }
            }
            return dArr;
        }
    }

    public static synchronized double[] a(boolean z, BDLocation bDLocation) {
        synchronized (a.class) {
            if (!a()) {
                return null;
            }
            a.d c = com.baidu.location.indoor.mapversion.b.a.a().c();
            double[] dArr = {-1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d};
            if (c != null) {
                double a2 = c.a(bDLocation.getLongitude());
                double b2 = c.b(bDLocation.getLatitude());
                if (z) {
                    String b3 = g.b(2);
                    if (b3 != null || !"".equals(b3)) {
                        b3 = b3.split("_")[0];
                    }
                    if (b3 == null || "".equals(b3)) {
                        b3 = "unknow";
                    }
                    String str = b3;
                    String e = d.a().e();
                    if (e == null || "".equals(e)) {
                        e = "unknow";
                    }
                    String str2 = e;
                    str.toUpperCase();
                    int a3 = g.a(2);
                    String buildingName = bDLocation.getBuildingName();
                    if (buildingName == null || "".equals(buildingName)) {
                        buildingName = "unknown";
                    }
                    dArr = a(a2, b2, bDLocation.getRadius(), bDLocation.getAcc(), str, str2, System.currentTimeMillis(), a3, buildingName);
                } else {
                    Lock lock = b;
                    lock.lock();
                    try {
                        dArr = IndoorJni.setPfWf(a2, b2, 8.0d, System.currentTimeMillis());
                    } catch (Throwable th) {
                        try {
                            th.printStackTrace();
                            lock = b;
                        } catch (Throwable th2) {
                            b.unlock();
                            throw th2;
                        }
                    }
                    lock.unlock();
                }
                if (dArr[0] == 0.0d) {
                    double c2 = c.c(dArr[1]);
                    double d = c.d(dArr[2]);
                    dArr[1] = c2;
                    dArr[2] = d;
                }
            }
            return dArr;
        }
    }

    public static void b() {
        if (a()) {
            Lock lock = b;
            lock.lock();
            try {
                IndoorJni.initPf();
                lock.unlock();
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                } finally {
                    b.unlock();
                }
            }
        }
    }

    public static void c() {
        if (a()) {
            Lock lock = b;
            lock.lock();
            try {
                IndoorJni.resetPf();
                lock.unlock();
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                } finally {
                    b.unlock();
                }
            }
        }
    }
}
