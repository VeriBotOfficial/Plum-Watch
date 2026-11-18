package com.baidu.ar.imu;

/* JADX INFO: loaded from: classes16.dex */
public enum a {
    WORLD(0),
    RELATIVE(1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6998a;

    a(int r3) {
        this.f6998a = r3;
    }

    public static a a(int r5) {
        for (a aVar : values()) {
            if (aVar.a() == r5) {
                return aVar;
            }
        }
        return null;
    }

    public int a() {
        return this.f6998a;
    }
}
