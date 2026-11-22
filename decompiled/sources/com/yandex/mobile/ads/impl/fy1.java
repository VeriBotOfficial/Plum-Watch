package com.yandex.mobile.ads.impl;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class fy1 {
    public static final fy1 b;
    public static final fy1 c;
    public static final fy1 d;
    private static final /* synthetic */ fy1[] e;

    static {
        fy1 fy1Var = new fy1(0, "AD");
        b = fy1Var;
        fy1 fy1Var2 = new fy1(1, "DSP");
        c = fy1Var2;
        fy1 fy1Var3 = new fy1(2, "UNDEFINED");
        d = fy1Var3;
        fy1[] fy1VarArr = {fy1Var, fy1Var2, fy1Var3};
        e = fy1VarArr;
        EnumEntriesKt.enumEntries(fy1VarArr);
    }

    public static fy1 valueOf(String str) {
        return (fy1) Enum.valueOf(fy1.class, str);
    }

    public static fy1[] values() {
        return (fy1[]) e.clone();
    }

    private fy1(int i, String str) {
    }
}
