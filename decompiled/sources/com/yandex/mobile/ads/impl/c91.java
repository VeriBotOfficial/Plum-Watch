package com.yandex.mobile.ads.impl;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class c91 {
    public static final c91 c;
    public static final c91 d;
    private static final /* synthetic */ c91[] e;
    private final String b;

    static {
        c91 c91Var = new c91(0, "LoadingOnShow", "loading_on_show");
        c = c91Var;
        c91 c91Var2 = new c91(1, "LoadingOnBack", "loading_on_back");
        d = c91Var2;
        c91[] c91VarArr = {c91Var, c91Var2};
        e = c91VarArr;
        EnumEntriesKt.enumEntries(c91VarArr);
    }

    public static c91 valueOf(String str) {
        return (c91) Enum.valueOf(c91.class, str);
    }

    public static c91[] values() {
        return (c91[]) e.clone();
    }

    private c91(int i, String str, String str2) {
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }
}
