package com.yandex.mobile.ads.impl;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class g10 {
    public static final g10 c;
    private static final /* synthetic */ g10[] d;
    private final String b = "divkit";

    static {
        g10 g10Var = new g10();
        c = g10Var;
        g10[] g10VarArr = {g10Var};
        d = g10VarArr;
        EnumEntriesKt.enumEntries(g10VarArr);
    }

    public static g10 valueOf(String str) {
        return (g10) Enum.valueOf(g10.class, str);
    }

    public static g10[] values() {
        return (g10[]) d.clone();
    }

    private g10() {
    }

    public final String a() {
        return this.b;
    }
}
