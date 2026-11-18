package com.anythink.expressad.out;

/* JADX INFO: loaded from: classes16.dex */
public enum u {
    FloatBall(1),
    BigView(4),
    MediumView(3),
    SmallView(2);

    private int e;

    private static /* synthetic */ u[] b() {
        return new u[]{FloatBall, BigView, MediumView, SmallView};
    }

    u(int r3) {
        this.e = r3;
    }

    public final int a() {
        return this.e;
    }
}
