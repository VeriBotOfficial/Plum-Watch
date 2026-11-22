package com.anythink.expressad.out;

/* loaded from: classes12.dex */
public enum u {
    FloatBall(1),
    BigView(4),
    MediumView(3),
    SmallView(2);

    private int e;

    private static /* synthetic */ u[] b() {
        return new u[]{FloatBall, BigView, MediumView, SmallView};
    }

    u(int i) {
        this.e = i;
    }

    public final int a() {
        return this.e;
    }
}
