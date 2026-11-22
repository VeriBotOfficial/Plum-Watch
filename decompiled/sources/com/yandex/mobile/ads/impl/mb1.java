package com.yandex.mobile.ads.impl;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class mb1 {
    public static final mb1 c;
    private static final /* synthetic */ mb1[] d;
    private final String b = "first_video_preloading_strategy";

    static {
        mb1 mb1Var = new mb1();
        c = mb1Var;
        mb1[] mb1VarArr = {mb1Var};
        d = mb1VarArr;
        EnumEntriesKt.enumEntries(mb1VarArr);
    }

    public static mb1 valueOf(String str) {
        return (mb1) Enum.valueOf(mb1.class, str);
    }

    public static mb1[] values() {
        return (mb1[]) d.clone();
    }

    private mb1() {
    }

    public final String a() {
        return this.b;
    }
}
