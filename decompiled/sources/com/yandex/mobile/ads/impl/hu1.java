package com.yandex.mobile.ads.impl;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class hu1 {
    public static final hu1 c;
    public static final hu1 d;
    private static final /* synthetic */ hu1[] e;
    private final String b;

    static {
        hu1 hu1Var = new hu1(0, "CONFIGURATION_FAILED", "configuration_failed");
        c = hu1Var;
        hu1 hu1Var2 = new hu1(1, "TIMEOUT", "timeout");
        d = hu1Var2;
        hu1[] hu1VarArr = {hu1Var, hu1Var2};
        e = hu1VarArr;
        EnumEntriesKt.enumEntries(hu1VarArr);
    }

    public static hu1 valueOf(String str) {
        return (hu1) Enum.valueOf(hu1.class, str);
    }

    public static hu1[] values() {
        return (hu1[]) e.clone();
    }

    private hu1(int i, String str, String str2) {
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }
}
