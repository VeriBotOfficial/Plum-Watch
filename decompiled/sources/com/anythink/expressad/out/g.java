package com.anythink.expressad.out;

/* loaded from: classes12.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static com.anythink.expressad.g.a f5015a;

    private g() {
    }

    public static com.anythink.expressad.g.a a() {
        if (f5015a == null) {
            synchronized (g.class) {
                if (f5015a == null) {
                    f5015a = new com.anythink.expressad.g.a();
                }
            }
        }
        return f5015a;
    }
}
