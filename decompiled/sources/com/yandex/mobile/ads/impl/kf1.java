package com.yandex.mobile.ads.impl;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class kf1 {
    public static final kf1 c;
    public static final kf1 d;
    public static final kf1 e;
    private static final /* synthetic */ kf1[] f;
    private final int b;

    static {
        kf1 kf1Var = new kf1(0, 2, "LANDSCAPE");
        c = kf1Var;
        kf1 kf1Var2 = new kf1(1, 1, "PORTRAIT");
        d = kf1Var2;
        kf1 kf1Var3 = new kf1(2, 0, "UNDEFINED");
        e = kf1Var3;
        kf1[] kf1VarArr = {kf1Var, kf1Var2, kf1Var3};
        f = kf1VarArr;
        EnumEntriesKt.enumEntries(kf1VarArr);
    }

    public static kf1 valueOf(String str) {
        return (kf1) Enum.valueOf(kf1.class, str);
    }

    public static kf1[] values() {
        return (kf1[]) f.clone();
    }

    private kf1(int i, int i2, String str) {
        this.b = i2;
    }

    public final int a() {
        return this.b;
    }
}
