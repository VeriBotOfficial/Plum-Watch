package com.yandex.mobile.ads.impl;

import java.util.UUID;

/* loaded from: classes5.dex */
public final class rc0 implements fv {
    public static final boolean d;

    /* renamed from: a, reason: collision with root package name */
    public final UUID f16753a;
    public final byte[] b;
    public final boolean c;

    static {
        boolean z;
        if ("Amazon".equals(f92.c)) {
            String str = f92.d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
                d = z;
            }
        }
        z = false;
        d = z;
    }

    public rc0(UUID uuid, byte[] bArr, boolean z) {
        this.f16753a = uuid;
        this.b = bArr;
        this.c = z;
    }
}
