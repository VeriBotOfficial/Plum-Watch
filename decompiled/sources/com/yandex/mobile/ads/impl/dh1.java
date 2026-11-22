package com.yandex.mobile.ads.impl;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class dh1 {
    public static final dh1 b;
    public static final dh1 c;
    public static final dh1 d;
    private static final /* synthetic */ dh1[] e;

    static {
        dh1 dh1Var = new dh1(0, "SCREEN_ON");
        b = dh1Var;
        dh1 dh1Var2 = new dh1(1, "SCREEN_OFF");
        c = dh1Var2;
        dh1 dh1Var3 = new dh1(2, "USER_PRESENT");
        d = dh1Var3;
        dh1[] dh1VarArr = {dh1Var, dh1Var2, dh1Var3};
        e = dh1VarArr;
        EnumEntriesKt.enumEntries(dh1VarArr);
    }

    public static dh1 valueOf(String str) {
        return (dh1) Enum.valueOf(dh1.class, str);
    }

    public static dh1[] values() {
        return (dh1[]) e.clone();
    }

    private dh1(int i, String str) {
    }
}
