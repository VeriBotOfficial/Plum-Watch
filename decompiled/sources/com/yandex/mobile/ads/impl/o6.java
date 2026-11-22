package com.yandex.mobile.ads.impl;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class o6 {
    public static final o6 c;
    private static final /* synthetic */ o6[] d;
    private final String b;

    static {
        o6 o6Var = new o6(0, "AUTOMATIC", "automatic");
        o6 o6Var2 = new o6(1, "MANUAL", "manual");
        c = o6Var2;
        o6[] o6VarArr = {o6Var, o6Var2};
        d = o6VarArr;
        EnumEntriesKt.enumEntries(o6VarArr);
    }

    public static o6 valueOf(String str) {
        return (o6) Enum.valueOf(o6.class, str);
    }

    public static o6[] values() {
        return (o6[]) d.clone();
    }

    private o6(int i, String str, String str2) {
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }
}
