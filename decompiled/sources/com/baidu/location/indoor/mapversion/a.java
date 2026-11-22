package com.baidu.location.indoor.mapversion;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes13.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static Lock f7787a = new ReentrantLock();

    public static synchronized String a(int i, float[] fArr, long j) {
        String str;
        Lock lock;
        synchronized (a.class) {
            f7787a.lock();
            str = null;
            try {
                if (c() && fArr != null && fArr.length >= 3) {
                    str = IndoorJni.phs(i, fArr[0], fArr[1], fArr[2], j);
                }
                lock = f7787a;
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                    lock = f7787a;
                } catch (Throwable th2) {
                    f7787a.unlock();
                    throw th2;
                }
            }
            lock.unlock();
        }
        return str;
    }

    public static void a() {
        f7787a.lock();
        try {
            IndoorJni.startPdr();
        } catch (Throwable th) {
            try {
                th.printStackTrace();
            } finally {
                f7787a.unlock();
            }
        }
    }

    public static void b() {
        f7787a.lock();
        try {
            IndoorJni.stopPdr();
        } catch (Throwable th) {
            try {
                th.printStackTrace();
            } finally {
                f7787a.unlock();
            }
        }
    }

    public static boolean c() {
        return IndoorJni.loadJniSuccess;
    }

    public static float d() {
        f7787a.lock();
        try {
            return IndoorJni.pgo();
        } catch (Throwable th) {
            try {
                th.printStackTrace();
                f7787a.unlock();
                return -1.0f;
            } finally {
                f7787a.unlock();
            }
        }
    }
}
