package com.yandex.mobile.ads.impl;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class f81 {
    public static final f81 c;
    public static final f81 d;
    private static final /* synthetic */ f81[] e;
    private final String b;

    static {
        f81 f81Var = new f81(0, "CUSTOM", "custom");
        c = f81Var;
        f81 f81Var2 = new f81(1, "TEMPLATE", "template");
        d = f81Var2;
        f81[] f81VarArr = {f81Var, f81Var2};
        e = f81VarArr;
        EnumEntriesKt.enumEntries(f81VarArr);
    }

    public static f81 valueOf(String str) {
        return (f81) Enum.valueOf(f81.class, str);
    }

    public static f81[] values() {
        return (f81[]) e.clone();
    }

    private f81(int i, String str, String str2) {
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }
}
