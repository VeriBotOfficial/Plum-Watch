package com.yandex.mobile.ads.impl;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class wz1 {
    private static final /* synthetic */ wz1[] c;
    public static final /* synthetic */ int d = 0;
    private final String b;

    static {
        wz1[] wz1VarArr = {new wz1(0, "VISIBLE", "visible"), new wz1(1, "DELAYED", "delayed")};
        c = wz1VarArr;
        EnumEntriesKt.enumEntries(wz1VarArr);
    }

    public static wz1 valueOf(String str) {
        return (wz1) Enum.valueOf(wz1.class, str);
    }

    public static wz1[] values() {
        return (wz1[]) c.clone();
    }

    private wz1(int i, String str, String str2) {
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }
}
