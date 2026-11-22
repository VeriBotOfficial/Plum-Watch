package com.yandex.mobile.ads.impl;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class j5 {
    public static final j5 b;
    public static final j5 c;
    public static final j5 d;
    public static final j5 e;
    public static final j5 f;
    private static final /* synthetic */ j5[] g;

    static {
        j5 j5Var = new j5(0, "CANCELLED");
        b = j5Var;
        j5 j5Var2 = new j5(1, "NOT_STARTED");
        c = j5Var2;
        j5 j5Var3 = new j5(2, "LOADING");
        d = j5Var3;
        j5 j5Var4 = new j5(3, "SUCCESSFULLY_LOADED");
        e = j5Var4;
        j5 j5Var5 = new j5(4, "ERRONEOUSLY_LOADED");
        f = j5Var5;
        j5[] j5VarArr = {j5Var, j5Var2, j5Var3, j5Var4, j5Var5};
        g = j5VarArr;
        EnumEntriesKt.enumEntries(j5VarArr);
    }

    public static j5 valueOf(String str) {
        return (j5) Enum.valueOf(j5.class, str);
    }

    public static j5[] values() {
        return (j5[]) g.clone();
    }

    private j5(int i, String str) {
    }
}
