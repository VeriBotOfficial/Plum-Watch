package com.yandex.mobile.ads.impl;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class t20 {
    public static final t20 b;
    public static final t20 c;
    private static final /* synthetic */ t20[] d;

    static {
        t20 t20Var = new t20(0, "BLOCK");
        b = t20Var;
        t20 t20Var2 = new t20(1, "BLOCK_INNER_AD");
        c = t20Var2;
        t20[] t20VarArr = {t20Var, t20Var2};
        d = t20VarArr;
        EnumEntriesKt.enumEntries(t20VarArr);
    }

    public static t20 valueOf(String str) {
        return (t20) Enum.valueOf(t20.class, str);
    }

    public static t20[] values() {
        return (t20[]) d.clone();
    }

    private t20(int i, String str) {
    }
}
