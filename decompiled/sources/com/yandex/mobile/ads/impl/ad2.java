package com.yandex.mobile.ads.impl;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class ad2 {
    public static final ad2 b;
    public static final ad2 c;
    public static final ad2 d;
    public static final ad2 e;
    private static final /* synthetic */ ad2[] f;

    static {
        ad2 ad2Var = new ad2(0, "PREROLL");
        b = ad2Var;
        ad2 ad2Var2 = new ad2(1, "MIDROLL");
        c = ad2Var2;
        ad2 ad2Var3 = new ad2(2, "POSTROLL");
        d = ad2Var3;
        ad2 ad2Var4 = new ad2(3, "STANDALONE");
        e = ad2Var4;
        ad2[] ad2VarArr = {ad2Var, ad2Var2, ad2Var3, ad2Var4};
        f = ad2VarArr;
        EnumEntriesKt.enumEntries(ad2VarArr);
    }

    public static ad2 valueOf(String str) {
        return (ad2) Enum.valueOf(ad2.class, str);
    }

    public static ad2[] values() {
        return (ad2[]) f.clone();
    }

    private ad2(int i, String str) {
    }
}
