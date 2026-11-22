package com.yandex.mobile.ads.impl;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class z8 {
    public static final z8 b;
    public static final z8 c;
    public static final z8 d;
    public static final z8 e;
    public static final z8 f;
    private static final /* synthetic */ z8[] g;

    static {
        z8 z8Var = new z8(0, "INITIAL");
        b = z8Var;
        z8 z8Var2 = new z8(1, "PREPARED");
        c = z8Var2;
        z8 z8Var3 = new z8(2, "STARTED");
        d = z8Var3;
        z8 z8Var4 = new z8(3, "ENDED");
        e = z8Var4;
        z8 z8Var5 = new z8(4, "ERROR");
        f = z8Var5;
        z8[] z8VarArr = {z8Var, z8Var2, z8Var3, z8Var4, z8Var5};
        g = z8VarArr;
        EnumEntriesKt.enumEntries(z8VarArr);
    }

    public static z8 valueOf(String str) {
        return (z8) Enum.valueOf(z8.class, str);
    }

    public static z8[] values() {
        return (z8[]) g.clone();
    }

    private z8(int i, String str) {
    }
}
