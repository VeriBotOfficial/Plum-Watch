package com.huawei.hms.scankit.p;

import java.security.SecureRandom;

/* JADX INFO: compiled from: RandomUtil.java */
/* JADX INFO: loaded from: classes11.dex */
public class Yc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final SecureRandom f10620a = new SecureRandom();

    public static int a(int r1) {
        return f10620a.nextInt(r1);
    }

    public static float a(float f) {
        return f10620a.nextFloat() * f;
    }
}
