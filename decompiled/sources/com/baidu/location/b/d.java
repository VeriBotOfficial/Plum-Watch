package com.baidu.location.b;

import com.baidu.location.indoor.mapversion.IndoorJni;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes13.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static final Lock f7536a = new ReentrantLock();

    public static int a(String str) {
        if (str != null && !"".equals(str) && a()) {
            Lock lock = f7536a;
            lock.lock();
            try {
                int gpsStatus = IndoorJni.getGpsStatus(0, str);
                lock.unlock();
                return gpsStatus;
            } catch (Throwable unused) {
                f7536a.unlock();
            }
        }
        return -1;
    }

    public static int a(String str, String str2) {
        if (str == null || "".equals(str)) {
            return -100;
        }
        if (str2 == null || "".equals(str2)) {
            str2 = "default";
        }
        if (!a()) {
            return com.anythink.basead.ui.f.d.b;
        }
        Lock lock = f7536a;
        lock.lock();
        try {
            int initGpsChecker = IndoorJni.initGpsChecker(0, str, str2);
            lock.unlock();
            return initGpsChecker;
        } catch (Throwable unused) {
            f7536a.unlock();
            return com.anythink.basead.ui.f.d.b;
        }
    }

    public static boolean a() {
        return IndoorJni.loadJniSuccess;
    }

    public static int b() {
        if (!a()) {
            return 0;
        }
        Lock lock = f7536a;
        lock.lock();
        try {
            int destroyGpsChecker = IndoorJni.destroyGpsChecker();
            lock.unlock();
            return destroyGpsChecker;
        } catch (Throwable unused) {
            f7536a.unlock();
            return 0;
        }
    }
}
