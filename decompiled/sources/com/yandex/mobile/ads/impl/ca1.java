package com.yandex.mobile.ads.impl;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class ca1 {
    public static final ca1 c;
    public static final ca1 d;
    public static final ca1 e;
    private static final /* synthetic */ ca1[] f;
    private final String b;

    static {
        ca1 ca1Var = new ca1(0, "AD", "ad");
        c = ca1Var;
        ca1 ca1Var2 = new ca1(1, "BULK", "bulk");
        d = ca1Var2;
        ca1 ca1Var3 = new ca1(2, "SLIDER", "ad_unit");
        e = ca1Var3;
        ca1[] ca1VarArr = {ca1Var, ca1Var2, ca1Var3};
        f = ca1VarArr;
        EnumEntriesKt.enumEntries(ca1VarArr);
    }

    public static ca1 valueOf(String str) {
        return (ca1) Enum.valueOf(ca1.class, str);
    }

    public static ca1[] values() {
        return (ca1[]) f.clone();
    }

    private ca1(int i, String str, String str2) {
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }
}
