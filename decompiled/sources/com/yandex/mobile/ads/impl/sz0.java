package com.yandex.mobile.ads.impl;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class sz0 {
    public static final sz0 b;
    private static final /* synthetic */ sz0[] c;

    static {
        sz0 sz0Var = new sz0();
        b = sz0Var;
        sz0[] sz0VarArr = {sz0Var};
        c = sz0VarArr;
        EnumEntriesKt.enumEntries(sz0VarArr);
    }

    public static sz0 valueOf(String str) {
        return (sz0) Enum.valueOf(sz0.class, str);
    }

    public static sz0[] values() {
        return (sz0[]) c.clone();
    }

    private sz0() {
    }
}
