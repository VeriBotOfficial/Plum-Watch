package com.yandex.mobile.ads.impl;

import com.blankj.utilcode.constant.PermissionConstants;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class k10 {
    public static final k10 b;
    public static final k10 c;
    public static final k10 d;
    private static final /* synthetic */ k10[] e;

    static {
        k10 k10Var = new k10(0, PermissionConstants.PHONE);
        b = k10Var;
        k10 k10Var2 = new k10(1, "TABLET");
        c = k10Var2;
        k10 k10Var3 = new k10(2, "TV");
        d = k10Var3;
        k10[] k10VarArr = {k10Var, k10Var2, k10Var3};
        e = k10VarArr;
        EnumEntriesKt.enumEntries(k10VarArr);
    }

    public static k10 valueOf(String str) {
        return (k10) Enum.valueOf(k10.class, str);
    }

    public static k10[] values() {
        return (k10[]) e.clone();
    }

    private k10(int i, String str) {
    }
}
