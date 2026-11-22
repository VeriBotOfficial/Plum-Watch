package com.yandex.mobile.ads.impl;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class xq0 {
    public static final xq0 b;
    public static final xq0 c;
    public static final xq0 d;
    private static final /* synthetic */ xq0[] e;

    static {
        xq0 xq0Var = new xq0(0, "LOAD");
        b = xq0Var;
        xq0 xq0Var2 = new xq0(1, "SHOW");
        c = xq0Var2;
        xq0 xq0Var3 = new xq0(2, "RETURN_TO_APP");
        d = xq0Var3;
        xq0[] xq0VarArr = {xq0Var, xq0Var2, xq0Var3};
        e = xq0VarArr;
        EnumEntriesKt.enumEntries(xq0VarArr);
    }

    public static xq0 valueOf(String str) {
        return (xq0) Enum.valueOf(xq0.class, str);
    }

    public static xq0[] values() {
        return (xq0[]) e.clone();
    }

    private xq0(int i, String str) {
    }
}
