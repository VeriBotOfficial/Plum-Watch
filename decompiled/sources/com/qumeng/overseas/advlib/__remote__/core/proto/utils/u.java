package com.qumeng.overseas.advlib.__remote__.core.proto.utils;

import java.security.SecureRandom;
import java.util.Map;
import java.util.Random;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes17.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    private static final Lock f12864a = new ReentrantLock();
    private static Map<Thread, Random> b = new WeakHashMap();

    private u() {
    }

    public static Random a() {
        Random random = b.get(Thread.currentThread());
        return random == null ? b() : random;
    }

    private static Random b() {
        f12864a.lock();
        SecureRandom secureRandom = new SecureRandom();
        try {
            b.put(Thread.currentThread(), secureRandom);
        } catch (Exception e) {
            e.printStackTrace();
            com.qumeng.overseas.advlib.__remote__.utils.bugman.a.a(u.class, "exp_ICliUtils_RandomFactory_makeInstance", String.valueOf(e.getMessage()), (Throwable) e);
        } catch (Throwable th) {
            th.printStackTrace();
            com.qumeng.overseas.advlib.__remote__.utils.bugman.a.a(u.class, "exp_ICliUtils_RandomFactory_makeInstance2", String.valueOf(th.getMessage()), th);
        }
        f12864a.unlock();
        return secureRandom;
    }
}
