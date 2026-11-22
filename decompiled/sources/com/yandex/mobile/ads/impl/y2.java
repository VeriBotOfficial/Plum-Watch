package com.yandex.mobile.ads.impl;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class y2 {
    public static final y2 b;
    public static final y2 c;
    public static final y2 d;
    public static final y2 e;
    public static final y2 f;
    public static final y2 g;
    public static final y2 h;
    public static final y2 i;
    private static final /* synthetic */ y2[] j;

    static {
        y2 y2Var = new y2(0, "INITIAL");
        b = y2Var;
        y2 y2Var2 = new y2(1, "PREPARING");
        c = y2Var2;
        y2 y2Var3 = new y2(2, "PREPARED");
        d = y2Var3;
        y2 y2Var4 = new y2(3, "FINISHED");
        e = y2Var4;
        y2 y2Var5 = new y2(4, "UNKNOWN");
        f = y2Var5;
        y2 y2Var6 = new y2(5, "ERROR");
        g = y2Var6;
        y2 y2Var7 = new y2(6, "PAUSED");
        h = y2Var7;
        y2 y2Var8 = new y2(7, "PLAYING");
        i = y2Var8;
        y2[] y2VarArr = {y2Var, y2Var2, y2Var3, y2Var4, y2Var5, y2Var6, y2Var7, y2Var8};
        j = y2VarArr;
        EnumEntriesKt.enumEntries(y2VarArr);
    }

    public static y2 valueOf(String str) {
        return (y2) Enum.valueOf(y2.class, str);
    }

    public static y2[] values() {
        return (y2[]) j.clone();
    }

    private y2(int i2, String str) {
    }
}
