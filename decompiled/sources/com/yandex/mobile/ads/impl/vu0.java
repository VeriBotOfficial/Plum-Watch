package com.yandex.mobile.ads.impl;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class vu0 {
    public static final vu0 b;
    public static final vu0 c;
    public static final vu0 d;
    private static final /* synthetic */ vu0[] e;

    static {
        vu0 vu0Var = new vu0(0, "EXACTLY");
        b = vu0Var;
        vu0 vu0Var2 = new vu0(1, "AT_MOST");
        c = vu0Var2;
        vu0 vu0Var3 = new vu0(2, "UNSPECIFIED");
        d = vu0Var3;
        vu0[] vu0VarArr = {vu0Var, vu0Var2, vu0Var3};
        e = vu0VarArr;
        EnumEntriesKt.enumEntries(vu0VarArr);
    }

    public static vu0 valueOf(String str) {
        return (vu0) Enum.valueOf(vu0.class, str);
    }

    public static vu0[] values() {
        return (vu0[]) e.clone();
    }

    private vu0(int i, String str) {
    }
}
