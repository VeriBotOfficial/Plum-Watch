package com.yandex.mobile.ads.impl;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class w2 {
    public static final w2 b;
    public static final w2 c;
    public static final w2 d;
    public static final w2 e;
    private static final /* synthetic */ w2[] f;

    static {
        w2 w2Var = new w2(0, "PREROLL");
        b = w2Var;
        w2 w2Var2 = new w2(1, "MIDROLL");
        c = w2Var2;
        w2 w2Var3 = new w2(2, "POSTROLL");
        d = w2Var3;
        w2 w2Var4 = new w2(3, "STANDALONE");
        e = w2Var4;
        w2[] w2VarArr = {w2Var, w2Var2, w2Var3, w2Var4};
        f = w2VarArr;
        EnumEntriesKt.enumEntries(w2VarArr);
    }

    public static w2 valueOf(String str) {
        return (w2) Enum.valueOf(w2.class, str);
    }

    public static w2[] values() {
        return (w2[]) f.clone();
    }

    private w2(int i, String str) {
    }
}
