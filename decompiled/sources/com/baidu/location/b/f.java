package com.baidu.location.b;

import android.os.Bundle;

/* loaded from: classes13.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static Object f7539a = new Object();
    private static f b;
    private int c = -1;

    public static f a() {
        f fVar;
        synchronized (f7539a) {
            if (b == null) {
                b = new f();
            }
            fVar = b;
        }
        return fVar;
    }

    public void a(int i, int i2, String str) {
        if (i2 != this.c) {
            this.c = i2;
            Bundle bundle = new Bundle();
            bundle.putInt("loctype", i);
            bundle.putInt("diagtype", i2);
            bundle.putByteArray("diagmessage", str.getBytes());
            b.a().a(bundle, 303);
        }
    }

    public void b() {
        this.c = -1;
    }
}
