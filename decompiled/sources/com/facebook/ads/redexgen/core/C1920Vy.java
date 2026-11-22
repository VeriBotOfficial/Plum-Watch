package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Vy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1920Vy {
    public static String[] A01 = {"0TBfSTrFZZIPTbjcv3YvZ5KQe5wh6M4Z", "Y", "skEIHJjGP8F0E9LHs3c03M6jOmkdnZrb", "lNiM6G1VkMzjPhI0VWbHd", "xoZoqEy9j11lJxTnOEXOmkmQN9dBXrj3", "0lNV7cA9G3CxYQK", "ZSiJ5Be21P36sCEypxWEkyax05PjjigP", "3dFveWP5h629GmfNhsyVO5v38YfKmNKK"};
    public static final ThreadLocal<C1920Vy> A02 = new ThreadLocal<>();
    public final C1903Vh A00 = new C1903Vh();

    public static C1903Vh A00() {
        return A02().A00;
    }

    public static C1903Vh A01(C1919Vx c1919Vx) {
        C1903Vh currentStackTraces = new C1903Vh(A00());
        currentStackTraces.add(c1919Vx);
        return currentStackTraces;
    }

    public static C1920Vy A02() {
        C1920Vy c1920Vy = A02.get();
        if (c1920Vy == null) {
            C1920Vy c1920Vy2 = new C1920Vy();
            A02.set(c1920Vy2);
            return c1920Vy2;
        }
        return c1920Vy;
    }

    public static void A03(AbstractRunnableC1915Vt abstractRunnableC1915Vt) {
        C1903Vh A06 = abstractRunnableC1915Vt.A06();
        if (A06 != null) {
            C1903Vh createRunnableAsyncStackTrace = A02().A00;
            createRunnableAsyncStackTrace.addAll(A06);
        }
    }

    public static void A04(AbstractRunnableC1915Vt abstractRunnableC1915Vt) {
        C1903Vh A06 = abstractRunnableC1915Vt.A06();
        if (A06 != null) {
            C1903Vh c1903Vh = A02().A00;
            String[] strArr = A01;
            if (strArr[1].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A01[0] = "6tfOksRsBjIBNQljvPHCCYkD1Hr87lb7";
            c1903Vh.removeAll(A06);
        }
    }
}
