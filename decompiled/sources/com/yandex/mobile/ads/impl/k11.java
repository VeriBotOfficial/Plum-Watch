package com.yandex.mobile.ads.impl;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class k11 {
    public static final k11 b;
    public static final k11 c;
    public static final k11 d;
    private static final /* synthetic */ k11[] e;

    static {
        k11 k11Var = new k11(0, "VERBOSE");
        k11 k11Var2 = new k11(1, "DEBUG");
        k11 k11Var3 = new k11(2, "INFO");
        b = k11Var3;
        k11 k11Var4 = new k11(3, "WARNING");
        c = k11Var4;
        k11 k11Var5 = new k11(4, "ERROR");
        d = k11Var5;
        k11[] k11VarArr = {k11Var, k11Var2, k11Var3, k11Var4, k11Var5};
        e = k11VarArr;
        EnumEntriesKt.enumEntries(k11VarArr);
    }

    public static k11 valueOf(String str) {
        return (k11) Enum.valueOf(k11.class, str);
    }

    public static k11[] values() {
        return (k11[]) e.clone();
    }

    private k11(int i, String str) {
    }
}
