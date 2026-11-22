package com.yandex.mobile.ads.impl;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class e10 {
    public static final e10 c;
    private static final /* synthetic */ e10[] d;
    private final String b = "ad_pod";

    static {
        e10 e10Var = new e10();
        c = e10Var;
        e10[] e10VarArr = {e10Var};
        d = e10VarArr;
        EnumEntriesKt.enumEntries(e10VarArr);
    }

    public static e10 valueOf(String str) {
        return (e10) Enum.valueOf(e10.class, str);
    }

    public static e10[] values() {
        return (e10[]) d.clone();
    }

    private e10() {
    }

    public final String a() {
        return this.b;
    }
}
