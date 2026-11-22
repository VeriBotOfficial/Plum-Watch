package com.huawei.hms.scankit.p;

import java.security.SecureRandom;

/* compiled from: RandomUtil.java */
/* loaded from: classes14.dex */
public class Yc {

    /* renamed from: a, reason: collision with root package name */
    private static final SecureRandom f10620a = new SecureRandom();

    public static int a(int i) {
        return f10620a.nextInt(i);
    }

    public static float a(float f) {
        return f10620a.nextFloat() * f;
    }
}
