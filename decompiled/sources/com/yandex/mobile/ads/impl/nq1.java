package com.yandex.mobile.ads.impl;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class nq1 {
    public static final nq1 c;
    public static final nq1 d;
    private static final /* synthetic */ nq1[] e;
    private final String b;

    static {
        nq1 nq1Var = new nq1(0, "LIGHT", "light");
        c = nq1Var;
        nq1 nq1Var2 = new nq1(1, "DARK", "dark");
        d = nq1Var2;
        nq1[] nq1VarArr = {nq1Var, nq1Var2};
        e = nq1VarArr;
        EnumEntriesKt.enumEntries(nq1VarArr);
    }

    public static nq1 valueOf(String str) {
        return (nq1) Enum.valueOf(nq1.class, str);
    }

    public static nq1[] values() {
        return (nq1[]) e.clone();
    }

    private nq1(int i, String str, String str2) {
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }
}
