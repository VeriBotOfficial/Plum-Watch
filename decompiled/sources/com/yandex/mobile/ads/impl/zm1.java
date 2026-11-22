package com.yandex.mobile.ads.impl;

import java.util.UUID;

/* loaded from: classes5.dex */
public final class zm1 {
    private static a b(byte[] bArr) {
        ag1 ag1Var = new ag1(bArr);
        if (ag1Var.e() < 32) {
            return null;
        }
        ag1Var.e(0);
        if (ag1Var.h() != ag1Var.a() + 4 || ag1Var.h() != 1886614376) {
            return null;
        }
        int h = (ag1Var.h() >> 24) & 255;
        if (h > 1) {
            xr0.a("Unsupported pssh version: ", h, "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(ag1Var.p(), ag1Var.p());
        if (h == 1) {
            ag1Var.f(ag1Var.x() * 16);
        }
        int x = ag1Var.x();
        if (x != ag1Var.a()) {
            return null;
        }
        byte[] bArr2 = new byte[x];
        ag1Var.a(bArr2, 0, x);
        return new a(uuid, h, bArr2);
    }

    public static boolean a(byte[] bArr) {
        return b(bArr) != null;
    }

    public static byte[] a(UUID uuid, byte[] bArr) {
        a b = b(bArr);
        if (b == null) {
            return null;
        }
        if (!uuid.equals(b.f17540a)) {
            et0.d("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + b.f17540a + ".");
            return null;
        }
        return b.c;
    }

    public static UUID c(byte[] bArr) {
        a b = b(bArr);
        if (b == null) {
            return null;
        }
        return b.f17540a;
    }

    public static int d(byte[] bArr) {
        a b = b(bArr);
        if (b == null) {
            return -1;
        }
        return b.b;
    }

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private final UUID f17540a;
        private final int b;
        private final byte[] c;

        public a(UUID uuid, int i, byte[] bArr) {
            this.f17540a = uuid;
            this.b = i;
            this.c = bArr;
        }
    }
}
