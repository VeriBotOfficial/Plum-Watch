package com.yandex.mobile.ads.impl;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class h10 {
    public static final h10 c;
    public static final h10 d;
    public static final h10 e;
    private static final /* synthetic */ h10[] f;
    private final String b;

    static {
        h10 h10Var = new h10(0, "AD", "ad");
        c = h10Var;
        h10 h10Var2 = new h10(1, "PACK_SHOT", "pack_shot");
        d = h10Var2;
        h10 h10Var3 = new h10(2, "CLOSE_DIALOG", "close_dialog");
        e = h10Var3;
        h10[] h10VarArr = {h10Var, h10Var2, h10Var3};
        f = h10VarArr;
        EnumEntriesKt.enumEntries(h10VarArr);
    }

    public static h10 valueOf(String str) {
        return (h10) Enum.valueOf(h10.class, str);
    }

    public static h10[] values() {
        return (h10[]) f.clone();
    }

    private h10(int i, String str, String str2) {
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }
}
