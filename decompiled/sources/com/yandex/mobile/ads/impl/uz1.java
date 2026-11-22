package com.yandex.mobile.ads.impl;

import com.yandex.div.core.ScrollDirection;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class uz1 {
    public static final uz1 c;
    private static final /* synthetic */ uz1[] d;
    private final String b;

    static {
        uz1 uz1Var = new uz1(0, "NEXT", ScrollDirection.NEXT);
        uz1 uz1Var2 = new uz1(1, "LAST", "last");
        c = uz1Var2;
        uz1[] uz1VarArr = {uz1Var, uz1Var2};
        d = uz1VarArr;
        EnumEntriesKt.enumEntries(uz1VarArr);
    }

    public static uz1 valueOf(String str) {
        return (uz1) Enum.valueOf(uz1.class, str);
    }

    public static uz1[] values() {
        return (uz1[]) d.clone();
    }

    private uz1(int i, String str, String str2) {
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }
}
