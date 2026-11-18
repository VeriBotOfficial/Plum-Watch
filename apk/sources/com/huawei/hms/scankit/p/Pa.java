package com.huawei.hms.scankit.p;

/* JADX INFO: compiled from: ErrorCorrectionLevel.java */
/* JADX INFO: loaded from: classes11.dex */
public enum Pa {
    L(1),
    M(0),
    Q(3),
    H(2);

    private static final Pa[] e;
    private final int g;

    static {
        Pa pa = L;
        Pa pa2 = M;
        Pa pa3 = Q;
        e = new Pa[]{pa2, pa, H, pa3};
    }

    Pa(int r3) {
        this.g = r3;
    }

    public int a() {
        return this.g;
    }

    public static Pa a(int r2) {
        if (r2 >= 0) {
            Pa[] paArr = e;
            if (r2 < paArr.length) {
                return paArr[r2];
            }
        }
        throw new IllegalArgumentException();
    }
}
