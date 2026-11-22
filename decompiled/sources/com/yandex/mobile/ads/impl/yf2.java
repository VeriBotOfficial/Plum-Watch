package com.yandex.mobile.ads.impl;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class yf2 {
    public static final yf2 b;
    private static final /* synthetic */ yf2[] c;

    static {
        yf2 yf2Var = new yf2(0, "FIT_XY");
        yf2 yf2Var2 = new yf2(1, "FIT_CENTER");
        b = yf2Var2;
        yf2[] yf2VarArr = {yf2Var, yf2Var2, new yf2(2, "CENTER_CROP")};
        c = yf2VarArr;
        EnumEntriesKt.enumEntries(yf2VarArr);
    }

    public static yf2 valueOf(String str) {
        return (yf2) Enum.valueOf(yf2.class, str);
    }

    public static yf2[] values() {
        return (yf2[]) c.clone();
    }

    private yf2(int i, String str) {
    }
}
