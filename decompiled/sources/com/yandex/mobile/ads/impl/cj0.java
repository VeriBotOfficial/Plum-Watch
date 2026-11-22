package com.yandex.mobile.ads.impl;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class cj0 {
    public static final cj0 b;
    private static final /* synthetic */ cj0[] c;

    static {
        cj0 cj0Var = new cj0(0, "PROD");
        b = cj0Var;
        cj0[] cj0VarArr = {cj0Var, new cj0(1, "PREDEFINED")};
        c = cj0VarArr;
        EnumEntriesKt.enumEntries(cj0VarArr);
    }

    public static cj0 valueOf(String str) {
        return (cj0) Enum.valueOf(cj0.class, str);
    }

    public static cj0[] values() {
        return (cj0[]) c.clone();
    }

    private cj0(int i, String str) {
    }
}
