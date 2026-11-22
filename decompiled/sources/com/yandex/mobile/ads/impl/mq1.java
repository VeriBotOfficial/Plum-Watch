package com.yandex.mobile.ads.impl;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class mq1 {
    public static final mq1 b;
    public static final mq1 c;
    public static final mq1 d;
    public static final mq1 e;
    private static final /* synthetic */ mq1[] f;

    static {
        mq1 mq1Var = new mq1(0, "UNKNOWN");
        b = mq1Var;
        mq1 mq1Var2 = new mq1(1, "STARTUP");
        c = mq1Var2;
        mq1 mq1Var3 = new mq1(2, "VMAP");
        d = mq1Var3;
        mq1 mq1Var4 = new mq1(3, "AD");
        e = mq1Var4;
        mq1[] mq1VarArr = {mq1Var, mq1Var2, mq1Var3, mq1Var4};
        f = mq1VarArr;
        EnumEntriesKt.enumEntries(mq1VarArr);
    }

    public static mq1 valueOf(String str) {
        return (mq1) Enum.valueOf(mq1.class, str);
    }

    public static mq1[] values() {
        return (mq1[]) f.clone();
    }

    private mq1(int i, String str) {
    }
}
