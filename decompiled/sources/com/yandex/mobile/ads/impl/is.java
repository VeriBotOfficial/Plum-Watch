package com.yandex.mobile.ads.impl;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class is {
    public static final is b;
    public static final is c;
    private static final /* synthetic */ is[] d;

    static {
        is isVar = new is(0, "HTML");
        b = isVar;
        is isVar2 = new is(1, "NATIVE");
        c = isVar2;
        is[] isVarArr = {isVar, isVar2};
        d = isVarArr;
        EnumEntriesKt.enumEntries(isVarArr);
    }

    public static is valueOf(String str) {
        return (is) Enum.valueOf(is.class, str);
    }

    public static is[] values() {
        return (is[]) d.clone();
    }

    private is(int i, String str) {
    }
}
