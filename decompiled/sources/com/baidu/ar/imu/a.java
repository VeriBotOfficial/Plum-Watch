package com.baidu.ar.imu;

/* loaded from: classes12.dex */
public enum a {
    WORLD(0),
    RELATIVE(1);


    /* renamed from: a, reason: collision with root package name */
    public int f6998a;

    a(int i) {
        this.f6998a = i;
    }

    public static a a(int i) {
        for (a aVar : values()) {
            if (aVar.a() == i) {
                return aVar;
            }
        }
        return null;
    }

    public int a() {
        return this.f6998a;
    }
}
