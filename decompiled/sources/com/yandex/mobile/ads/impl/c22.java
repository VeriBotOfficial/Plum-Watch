package com.yandex.mobile.ads.impl;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class c22 {
    public static final c22 b;
    public static final c22 c;
    public static final c22 d;
    private static final /* synthetic */ c22[] e;

    static {
        c22 c22Var = new c22(0, "DEFAULT");
        b = c22Var;
        c22 c22Var2 = new c22(1, "SOCIAL");
        c = c22Var2;
        c22 c22Var3 = new c22(2, "EMPTY");
        d = c22Var3;
        c22[] c22VarArr = {c22Var, c22Var2, c22Var3};
        e = c22VarArr;
        EnumEntriesKt.enumEntries(c22VarArr);
    }

    public static c22 valueOf(String str) {
        return (c22) Enum.valueOf(c22.class, str);
    }

    public static c22[] values() {
        return (c22[]) e.clone();
    }

    private c22(int i, String str) {
    }
}
