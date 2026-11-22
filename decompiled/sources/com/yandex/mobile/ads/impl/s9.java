package com.yandex.mobile.ads.impl;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class s9 {
    public static final s9 b;
    public static final s9 c;
    public static final s9 d;
    private static final /* synthetic */ s9[] e;

    static {
        s9 s9Var = new s9(0, "SINGLE");
        b = s9Var;
        s9 s9Var2 = new s9(1, "BLOCK");
        c = s9Var2;
        s9 s9Var3 = new s9(2, "BLOCK_INNER_CREATIVE");
        d = s9Var3;
        s9[] s9VarArr = {s9Var, s9Var2, s9Var3};
        e = s9VarArr;
        EnumEntriesKt.enumEntries(s9VarArr);
    }

    public static s9 valueOf(String str) {
        return (s9) Enum.valueOf(s9.class, str);
    }

    public static s9[] values() {
        return (s9[]) e.clone();
    }

    private s9(int i, String str) {
    }
}
